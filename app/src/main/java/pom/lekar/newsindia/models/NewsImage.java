package pom.lekar.newsindia.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lekar on 26.04.17.
 */

public class NewsImage {

    @SerializedName("Photo")

    private String mPhoto;
    @SerializedName("Thumb")

    private String mThumb;
    @SerializedName("PhotoCaption")

    private String mPhotoCaption;

    public NewsImage (String mPhoto, String mThumb, String mPhotoCaption) {
        this.mPhoto = mPhoto;
        this.mThumb = mThumb;
        this.mPhotoCaption = mPhotoCaption;
    }

    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(String photo) {
        this.mPhoto = photo;
    }

    public String getThumb() {
        return mThumb;
    }

    public void setThumb(String thumb) {
        this.mThumb = thumb;
    }

    public String getPhotoCaption() {
        return mPhotoCaption;
    }

    public void setPhotoCaption(String photoCaption) {
        this.mPhotoCaption = photoCaption;
    }

    @Override
    public String toString() {
        return "NewsImage{" +
                "mPhoto='" + mPhoto + '\'' +
                ", mThumb='" + mThumb + '\'' +
                ", mPhotoCaption='" + mPhotoCaption + '\'' +
                '}';
    }
}


