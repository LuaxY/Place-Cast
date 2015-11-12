package net.voidmx.placecast;

public class PlaceItem {

    private String mName;
    private String mYoutubeId;
    private Integer mImageId;

    public PlaceItem(String mName, String mYoutubeId, Integer mImageId) {
        this.mName = mName;
        this.mYoutubeId = mYoutubeId;
        this.mImageId = mImageId;
    }

    public String getItemName() {
        return mName;
    }

    public String getYoutubeId() {
        return mYoutubeId;
    }

    public Integer getImageId() {
        return mImageId;
    }
}
