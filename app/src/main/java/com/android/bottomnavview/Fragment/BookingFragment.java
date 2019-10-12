package com.android.bottomnavview.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.bottomnavview.R;
import com.android.bottomnavview.TabsAdapter;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookingFragment extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private View view;
    public BookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_booking,container,false);

        init();

        return  view;


    }
    private void init() {
        viewPager = view.findViewById(R.id.main_viewpager);
        tabLayout = view.findViewById(R.id.main_tablayout);
        viewPager.setAdapter(new TabsAdapter(getActivity().getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);


    }

}
