package com.example.android.annikakaiser;


public class CoreSkill {

    /*name of the skill*/
    private String mCoreSkillName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /*creates a new CoreSkill object
    * @param coreSkillName is the most basic info, namely what the skill is called
    */
    public CoreSkill(String coreSkillName, int imageResourceId) {
        mCoreSkillName = coreSkillName;
        mImageResourceId = imageResourceId;
    }

    /*get the name of the skill*/
    public String getCoreSkill(){
        return mCoreSkillName;
    }

    /*add an icon to each skill*/
    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
