package com.example.rdu.visitcluj;

/**
 * Created by Rdu on 28.09.2017.
 */

public class Place {

    //Place description NO MORE THAN 120 CHAR
    private String mDescription;

    //Place address
    private String mAddress;

    //Place contact, may contain phone number or e-mail.
    private String mPlaceName;

    //place image resource ID
    private int mImageResourceId;

    //constructor with the 4 params described above
    public Place(String description, String address, String placeName, int imageResourceId){
        mDescription = description;
        mAddress = address;
        mPlaceName = placeName;
        mImageResourceId = imageResourceId;
    }

    //get the Place description
    public String getDescription(){
        return mDescription;
    }

    //get the Place address
    public String getAddress(){
        return mAddress;
    }

    //get the Place contact
    public String getPlaceName(){
        return mPlaceName;
    }

    //get the Image Resource ID
    public int getImageResourceId(){
        return mImageResourceId;
    }
}
