package pom.lekar.newsindia.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class NewsList implements Serializable {
    @SerializedName("Pagination")

    private Pagination pagination;
    @SerializedName("NewsItem")

    private List<NewsItem> newsItems ;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<NewsItem> getNewsItem() {
        return newsItems;
    }

    public void setNewsItem(List<NewsItem> newsItems) {
        this.newsItems = newsItems;
    }

    @Override
    public String toString() {
        return "ListOfNewsItems{" +
                "pagination=" + pagination +
                ", newsItems=" + newsItems +
                '}';
    }
}
