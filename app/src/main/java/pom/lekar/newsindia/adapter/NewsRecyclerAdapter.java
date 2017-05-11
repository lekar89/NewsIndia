package pom.lekar.newsindia.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import pom.lekar.newsindia.R;
import pom.lekar.newsindia.activitys.WebActivity;
import pom.lekar.newsindia.models.NewsItem;


public class NewsRecyclerAdapter extends RecyclerView.Adapter<NewsRecyclerAdapter.ViewHolderNews> {

    private Context mContext;
    private List<NewsItem> mNewsItems;

    public NewsRecyclerAdapter(Context context, List<NewsItem> newsItems) {
        this.mContext = context;
        this.mNewsItems = newsItems;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public NewsRecyclerAdapter.ViewHolderNews onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolderNews holder = new ViewHolderNews(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(NewsRecyclerAdapter.ViewHolderNews holder, int position) {

        final NewsItem newsItem = (NewsItem) mNewsItems.get(position);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, WebActivity.class);
                intent.putExtra("web",newsItem.getWebURL());
                mContext.startActivity(intent);
            }
        });
        holder.tvName.setText(newsItem.getHeadLine());

        try {
            Picasso.with(mContext)
                    .load(newsItem.getNewsImage().getThumb())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(holder.imageView);
        } catch (Exception e) {
            Picasso.with(mContext)
                    .load("http://img.aforism.ru/img/706605/error.png")
                    .placeholder(R.mipmap.ic_launcher)
                    .into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return mNewsItems.size();
    }

    public class ViewHolderNews extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView tvName;
 CardView mCardView;
        public ViewHolderNews(View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.text_view_headline);
            this.mCardView = (CardView) itemView.findViewById(R.id.card_view_item);
            this.imageView = (ImageView) itemView.findViewById(R.id.profile_image);
        }
    }
}
