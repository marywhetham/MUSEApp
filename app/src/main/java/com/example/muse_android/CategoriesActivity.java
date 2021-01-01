package com.example.muse_android;

import android.os.Bundle;

import com.example.muse_android.requests.fetchArticleData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.example.muse_android.requests.fetchCategoryData;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        fetchCategoryData process = new fetchCategoryData("Arts");
        process.execute();
    }
}