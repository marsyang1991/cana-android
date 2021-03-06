package cn.ac.ict.cana.newversion.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import cn.ac.ict.cana.newversion.pagers.ExamPageFragment;
import cn.ac.ict.cana.newversion.pagers.HIstoryPageFragment;
import cn.ac.ict.cana.newversion.pagers.SettingPageFragment;
import cn.ac.ict.cana.newversion.pagers.UserPageFragment;

/**
 * Created by zhaoliang on 2017/6/6.
 */

public class MainAdapterNew extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public MainAdapterNew(FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<>();
        fragments.add(new ExamPageFragment());
        fragments.add(new UserPageFragment());
        // fragments.add(new PageChartFragment());
        fragments.add(new HIstoryPageFragment());
        fragments.add(new SettingPageFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
