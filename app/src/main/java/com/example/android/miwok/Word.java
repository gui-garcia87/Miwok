package com.example.android.miwok;

/**
 * Created by Guilherme on 09/10/2016.
 */
public class Word {

    private String mDefaultTranslation;

    private String mMiwoktranslation;

    private int mAudioResourceId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){

        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId, int audioresourceId){

        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioresourceId;
    }


    public String getmMiwoktranslation() {

        return mMiwoktranslation;
    }

    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
