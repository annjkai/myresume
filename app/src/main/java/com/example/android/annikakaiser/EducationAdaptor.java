package com.example.android.annikakaiser;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EducationAdaptor extends ArrayAdapter<EducationList> {

    public EducationAdaptor(Context context, ArrayList<EducationList> completedProject) {
        super(context, 0, completedProject);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                   R.layout.education_list, parent, false);

        }

        EducationList currentEducation = getItem(position);

        TextView educationNameTextView = (TextView)
                listItemView.findViewById(R.id.education_name);
        educationNameTextView.setText(currentEducation.getEducationName());

        TextView educationDescriptionTextView = (TextView)
                listItemView.findViewById(R.id.education_description);
        educationDescriptionTextView.setText(currentEducation.getEducationDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.education_icon);
        imageView.setImageResource(currentEducation.getEducationIconId());

        return listItemView;
    }
}
