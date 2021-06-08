package com.example.apknewinsurance;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> isfragment = new ArrayList<>();
    private final List<String> istitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return isfragment.get(position);
    }

    @Override
    public int getCount() {
        return istitle.size();
    }

    public CharSequence getPageTitle(int position){
        return istitle.get(position);
    }

    public void AddFragment(Fragment fragment, String title){
        isfragment.add(fragment);
        istitle.add(title);
    }
}
