package com.example.muse_android.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muse_android.R;
import com.example.muse_android.adapters.ArticleAdapter;
import com.example.muse_android.adapters.CategoryAdapter;
import com.example.muse_android.objects.CategoryArticle;
import com.example.muse_android.requests.fetchCategoryData;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends CategoryFragment {

    public HomeFragment() {
        this.categoryName = "Home";
        this.layoutName = R.layout.fragment_home;
        this.view = R.id.homeView;
    }

    public HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }
}