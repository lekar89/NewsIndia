package pom.lekar.newsindia.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by lekar on 28.04.17.
 */

public class NewsItem implements Serializable {

    @SerializedName("NewsItemId")
    @Expose
    private String newsItemId;
    @SerializedName("HeadLine")
    @Expose
    private String headLine;
    @SerializedName("ByLine")
    @Expose
    private String byLine;
    @SerializedName("Agency")
    @Expose
    private String agency;
    @SerializedName("DateLine")
    @Expose
    private String dateLine;
    @SerializedName("WebURL")
    @Expose
    private String webURL;
    @SerializedName("Caption")
    @Expose
    private String caption;
    @SerializedName("Image")
    @Expose
    private NewsImage newsImage;
    @SerializedName("Keywords")
    @Expose
    private String keywords;
    @SerializedName("Story")
    @Expose
    private String story;
    @SerializedName("CommentCountUrl")
    @Expose
    private String commentCountUrl;
    @SerializedName("CommentFeedUrl")
    @Expose
    private String commentFeedUrl;
    @SerializedName("Related")
    @Expose
    private String related;

    public NewsItem(String newsItemId, String headLine, String byLine, String agency, String dateLine, String webURL, String caption, NewsImage newsImage, String keywords, String story, String commentCountUrl, String commentFeedUrl, String related) {
        this.newsItemId = newsItemId;
        this.headLine = headLine;
        this.byLine = byLine;
        this.agency = agency;
        this.dateLine = dateLine;
        this.webURL = webURL;
        this.caption = caption;
        this.newsImage = newsImage;
        this.keywords = keywords;
        this.story = story;
        this.commentCountUrl = commentCountUrl;
        this.commentFeedUrl = commentFeedUrl;
        this.related = related;
    }

    public String getNewsItemId() {
        return newsItemId;
    }

    public void setNewsItemId(String newsItemId) {
        this.newsItemId = newsItemId;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getByLine() {
        return byLine;
    }

    public void setByLine(String byLine) {
        this.byLine = byLine;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getDateLine() {
        return dateLine;
    }

    public void setDateLine(String dateLine) {
        this.dateLine = dateLine;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public NewsImage getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(NewsImage newsImage) {
        this.newsImage = newsImage;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getCommentCountUrl() {
        return commentCountUrl;
    }

    public void setCommentCountUrl(String commentCountUrl) {
        this.commentCountUrl = commentCountUrl;
    }

    public String getCommentFeedUrl() {
        return commentFeedUrl;
    }

    public void setCommentFeedUrl(String commentFeedUrl) {
        this.commentFeedUrl = commentFeedUrl;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    @Override
    public String toString() {
        return "NewsItem{" +
                "newsItemId='" + newsItemId + '\'' +
                ", headLine='" + headLine + '\'' +
                ", byLine='" + byLine + '\'' +
                ", agency='" + agency + '\'' +
                ", dateLine='" + dateLine + '\'' +
                ", webURL='" + webURL + '\'' +
                ", caption='" + caption + '\'' +
                ", newsImage=" + newsImage +
                ", keywords='" + keywords + '\'' +
                ", story='" + story + '\'' +
                ", commentCountUrl='" + commentCountUrl + '\'' +
                ", commentFeedUrl='" + commentFeedUrl + '\'' +
                ", related='" + related + '\'' +
                '}';
    }
}
