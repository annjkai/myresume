package com.example.android.annikakaiser;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoreSkillAdapter extends ArrayAdapter<CoreSkill> {

    public CoreSkillAdapter(Context context, ArrayList<CoreSkill> coreSkills) {
        super(context, 0, coreSkills);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.core_skills_list, parent, false);

        }

        CoreSkill currentSkill = getItem(position);

        TextView skillNameTextView = (TextView) listItemView.findViewById(R.id.skill_name);
        skillNameTextView.setText(currentSkill.getCoreSkill());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.skill_icon);
        imageView.setImageResource(currentSkill.getImageResourceId());

        return listItemView;
    }
}
