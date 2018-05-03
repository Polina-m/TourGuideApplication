package com.example.lina.tourguideapplication;

public class Sight {
    private int mName;
    private int mAddress;
    private int mImageResourceID;
    private int mDescription;
    private int mOpenHours;


    /**
     * Create a new Sight object.
     *
     * @param name is the string resource ID for the name of the place
     * @param imageResourceID is the resource ID for the image file associated with this place
     */
    public Sight(int name, int imageResourceID){
        mName = name;
        mImageResourceID = imageResourceID;
    }

    /**
     * Create a new Sight object.
     *
     * @param name is the string resource ID for the name of the place
     * @param address is the string resource ID for the address of the place
     * @param imageResourceID is the resource ID for the image file associated with this place
     * @param descriptionID is the string resource ID for the  description of the place
     */
    public Sight(int name, int imageResourceID, int address, int hours, int descriptionID){
        mName = name;
        mImageResourceID = imageResourceID;
        mAddress = address;
        mOpenHours = hours;
        mDescription = descriptionID;
    }

    /**
     * Return the string resource ID  with name for the place.
     */
    public int getSightName() {
        return mName;
    }

    /**
     * Return the string resource ID  with address for the place.
     */
    public int getSightDescription() {
        return mDescription;
    }

    /**
     * Return the string resource ID  with address for the place.
     */
    public int getSightOpenHours() {
        return mOpenHours;
    }

    /**
     * Return the string resource ID  with address for the place.
     */
    public int getSightAddress() {
        return mAddress;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceID;
    }


}
