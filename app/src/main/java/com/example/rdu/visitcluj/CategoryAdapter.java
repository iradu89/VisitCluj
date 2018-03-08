package com.example.rdu.visitcluj;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Rdu on 28.09.2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    //context
    private Context mContext;

    //Creates a new CategoryAdapter Object
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //gets the fragment position
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MustDoFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else if (position == 3){
            return new HistoryFragment();
        } else {
            return new NightlifeFragment();
        }
    }

    //Returns total number of pages
    @Override
    public int getCount() {
        return 5;
    }

    //Gets the page title
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.must_do);
        } else if (position == 1) {
            return mContext.getString(R.string.parks);
        } else if (position == 2) {
            return mContext.getString(R.string.shopping);
        } else if (position == 3) {
            return mContext.getString(R.string.history);
        } else {
            return mContext.getString(R.string.nightlife);
        }
    }
}
