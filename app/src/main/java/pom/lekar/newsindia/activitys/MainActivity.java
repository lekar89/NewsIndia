package pom.lekar.newsindia.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import pom.lekar.newsindia.ApiServise;
import pom.lekar.newsindia.App;
import pom.lekar.newsindia.Config;
import pom.lekar.newsindia.R;
import pom.lekar.newsindia.adapter.NewsRecyclerAdapter;
import pom.lekar.newsindia.models.NewsItem;
import pom.lekar.newsindia.models.NewsList;
import retrofit2.adapter.rxjava.HttpException;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;



public class MainActivity extends AppCompatActivity   {

    private static final String LOG_TAG = "ZZMainActivity";

    private Button mButtonGetData;
    private RecyclerView mRecyclerView;
    List<NewsItem> mNewsItems;
    NewsRecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonGetData = (Button) findViewById(R.id.button_get_data);
        mButtonGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        qvery();
        mNewsItems = new ArrayList<>();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_person);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //GridLayoutManager layoutManager = new GridLayoutManager(this,4);
        mRecyclerView.setLayoutManager(layoutManager);

        adapter = new NewsRecyclerAdapter(this, mNewsItems);
        mRecyclerView.setAdapter(adapter);



    }

    public void qvery() {
//        Gson gson = new GsonBuilder()
//                .setLenient()
//                .create();
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .baseUrl(Config.URL_DOMINIAN_URL)
//                .build();
//           ApiServise intf = retrofit.create(ApiServise.class);

        ApiServise intf = App.getService();

        Observable<NewsList> mSerch= intf.serch(Config.PERSON_TYPE_JSON);

        mSerch.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Subscriber<NewsList>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(LOG_TAG, "onError()");
                        Log.d(LOG_TAG, e.getMessage());
                        if (e instanceof HttpException) {
                            HttpException response = (HttpException)e;
                            int code = response.code();
                            Log.d(LOG_TAG, String.valueOf(code));
                        }
                    }

                    @Override
                    public void onNext(NewsList listNewsItems) {

                        mNewsItems = listNewsItems.getNewsItem();
                        adapter = new NewsRecyclerAdapter(MainActivity.this, mNewsItems);
                        mRecyclerView.setAdapter(adapter);

                        for (NewsItem newsItem : mNewsItems){
                            Log.d(LOG_TAG, newsItem.getHeadLine());
                        }
                    }
                });
    }


}
