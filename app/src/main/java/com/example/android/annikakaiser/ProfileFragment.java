package com.example.android.annikakaiser;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.profile_layout, container, false);

        //set a text view for the Summary - for now this is just a long string
        TextView profileSummary = (TextView) rootView.findViewById(R.id.summary_text);
        profileSummary.setText(R.string.profile_summary);

        /*sets up an ArrayList to create a list of core skills - this will be able to
        contain more info and up to 2 ImageViews */
        ArrayList<CoreSkill> coreSkills = new ArrayList<CoreSkill>();
        coreSkills.add(new CoreSkill("Android", R.drawable.ic_android_black_24dp));
        coreSkills.add(new CoreSkill("Java", R.drawable.java_520));
        coreSkills.add(new CoreSkill("GitHub", R.drawable.github_120px_plus));
        coreSkills.add(new CoreSkill("English <> German Translation", R.drawable.ic_g_translate_black_24dp));
        coreSkills.add(new CoreSkill("Proofreading & Copy-editing", R.drawable.ic_text_fields_black_24dp));


        CoreSkillAdapter adapter = new CoreSkillAdapter(getActivity(), coreSkills);
        ListView coreSkillsList = (ListView) rootView.findViewById(R.id.skills_list_view);
        coreSkillsList.setAdapter(adapter);

        return rootView;

    }

}
