package com.example.android.annikakaiser;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EducationFragment extends Fragment {


    public EducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.education_layout, container, false);

         /*sets up an ArrayList to populate a list detailing education & qualifications - will contain 2 TextViews
         * (project title and project description) and an ImageView to represent the project
          * will eventually link to an external source such as GitHub*/

        ArrayList<EducationList> educationList = new ArrayList<EducationList>();
        educationList.add(new EducationList("Udacity Nanodegree Course", R.string.miwok_description, R.drawable.ic_book_black_24dp));
        educationList.add(new EducationList("University of Calgary", R.string.justjava_description, R.drawable.ic_book_black_24dp));
        educationList.add(new EducationList("Willsons Grill", R.string.willsonsgrill, R.drawable.ic_book_black_24dp));

        EducationAdaptor adapter = new EducationAdaptor(getActivity(), educationList);
        ListView educationListView = (ListView) rootView.findViewById(R.id.education_list_view);
        educationListView.setAdapter(adapter);

        return rootView;
    }

}
