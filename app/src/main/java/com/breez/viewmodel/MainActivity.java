package com.breez.viewmodel;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.breez.viewmodel.ui.adapters.MyFragmentPagerAdapter;
import com.breez.viewmodel.ui.fragments.GreenFragment;
import com.breez.viewmodel.ui.fragments.MainFragment;
import com.breez.viewmodel.ui.fragments.YellowFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.container);
        Fragment mainFragment = new MainFragment();
        Fragment greenFragment = new GreenFragment();
        Fragment yellowFragment = new YellowFragment();

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(mainFragment);
        fragments.add(greenFragment);
        fragments.add(yellowFragment);

        MyFragmentPagerAdapter adapter =new MyFragmentPagerAdapter(getSupportFragmentManager());
        adapter.setList(fragments);
        viewPager.setAdapter(adapter);
//        FragmentTransaction fragmentTransaction  = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(viewPager.getId(),mainFragment,"MAIN_FRAGMENT");
//        fragmentTransaction.commit();
    }
}
