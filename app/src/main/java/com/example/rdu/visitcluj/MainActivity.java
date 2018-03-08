package com.example.rdu.visitcluj;


import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //sets the view to activity.main.xml
        setContentView(R.layout.activity_main);

        //find the viewpager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //make dhe adapter which displays the fragments properly
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        //set the adapter on the viewpager
        viewPager.setAdapter(adapter);

        //find the tablayout that shows tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
    }
}

