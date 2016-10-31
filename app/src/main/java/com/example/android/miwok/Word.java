package com.example.android.miwok;

/**
 * Created by Guilherme on 09/10/2016.
 */
public class Word {

    private String mDefaultTranslation;

    private String mMiwoktranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId){

        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }


    public String getmMiwoktranslation() {

        return mMiwoktranslation;
    }

    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
