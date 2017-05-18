package com.example.android.annikakaiser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set a text view for the Summary - for now this is just a long string
        TextView profileSummary = (TextView) findViewById(R.id.summary_text);
        profileSummary.setText(R.string.profile_summary);

        /*sets up an ArrayList to create a list of core skills - this will be able to
        contain more info and up to 2 ImageViews */
        ArrayList<CoreSkill> coreSkills = new ArrayList<CoreSkill>();
        coreSkills.add(new CoreSkill("Android", R.drawable.ic_android_black_24dp));
        coreSkills.add(new CoreSkill("Java", R.drawable.java_520));
        coreSkills.add(new CoreSkill("GitHub", R.drawable.github_120px_plus));
        coreSkills.add(new CoreSkill("English <> German Translation", R.drawable.ic_g_translate_black_24dp));
        coreSkills.add(new CoreSkill("Proofreading & Copy-editing", R.drawable.ic_text_fields_black_24dp));


        CoreSkillAdapter adapter = new CoreSkillAdapter(this, coreSkills);
        ListView coreSkillsList = (ListView) findViewById(R.id.skills_list_view);
        coreSkillsList.setAdapter(adapter);

    }
}


