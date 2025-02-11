package com.example.markus.quakewatch;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.style.CharacterStyle;

/**
 * Created by hp1 on 21-01-2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    CharSequence Titles[];
     int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropri ate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence[] mtitles  , int mNumbOfTabsumb) {
        super(fm);
        this.Titles = mtitles;
         this.NumbOfTabs = mNumbOfTabsumb;

     }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
        {
            RecyclerView1 recyclerView1 = new RecyclerView1();
            recyclerView1.setnumber(position);
            return recyclerView1;
        }
        else if(position == 1)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
             RecyclerView1 tab2 = new RecyclerView1();
             tab2.setnumber(position);
             return tab2;
        }
        else if(position == 2)             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            RecyclerView1 tab3 = new RecyclerView1();
            tab3.setnumber(position);
            return tab3;
        }
        else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            Search tab4 = new Search();
            return tab4;
        }


    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

     @Override
     public int getCount() {
        return NumbOfTabs;
    }
}