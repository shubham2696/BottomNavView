package com.android.bottomnavview;


import android.content.Context;

import com.android.bottomnavview.Fragment.HomeFragment;
import com.android.bottomnavview.Fragment.ProfileFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position)
        {
            case 0:

                return fragment = new HomeFragment();
            case 1:
                return fragment = new ProfileFragment();

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }


    public CharSequence getPageTitle(int Position)
    {
        switch (Position)
        {
            case 0:
                return "On Going";
                case 1:
            return "History";

            default:
                return null;
        }
    }
}
