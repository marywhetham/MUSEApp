package com.example.muse_android;

import android.os.Bundle;

import com.example.muse_android.adapters.ArticleAdapter;
import com.example.muse_android.adapters.CategoryFragmentAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class CategoriesActivity extends AppCompatActivity {

    private static String [] categories = {"Home", "Lifestyle", "Fashion", "Music", "Arts"};
    private ViewPager viewPager;
    private CategoryFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        viewPager = findViewById(R.id.pager);
        adapter = new CategoryFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        TabLayout tabLayout = view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    public static String[] getCategories() {
        return categories;
    }
}