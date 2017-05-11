package pom.lekar.newsindia.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by lekar on 26.04.17.
 */

public class Pagination {

    @SerializedName("TotalPages")
    @Expose
    private String totalPages;
    @SerializedName("PageNo")
    @Expose
    private String pageNo;
    @SerializedName("PerPage")
    @Expose
    private String perPage;
    @SerializedName("WebURL")
    @Expose
    private String webURL;

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String mTotalPages) {
        totalPages = mTotalPages;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String mPageNo) {
        pageNo = mPageNo;
    }

    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String mPerPage) {
        perPage = mPerPage;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String mWebURL) {
        webURL = mWebURL;
    }
}
