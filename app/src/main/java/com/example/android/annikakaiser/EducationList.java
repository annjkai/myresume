package com.example.android.annikakaiser;


public class EducationList {

    private String mEducationName;
    private int mEducationDescription;
    private int mEducationIconId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /*creates a new EducationList object
    * @param projectName is the most basic info, namely what the project is called
    */

    public EducationList(String educationName, int educationDescription, int educationIconId) {
        mEducationName = educationName;
        mEducationDescription = educationDescription;
        mEducationIconId = educationIconId;
    }

    /*get the name of the project*/
    public String getEducationName() {
        return mEducationName;
    }

    /*get the description of the project*/
    public int getEducationDescription() {
        return mEducationDescription;
    }

    /*add an icon to each project*/
    public int getEducationIconId() {
        return mEducationIconId;
    }

    public boolean hasImage() {
        return mEducationIconId != NO_IMAGE_PROVIDED;
    }
}

