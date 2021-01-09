package com.example.muse_android.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.muse_android.R;
import com.example.muse_android.adapters.CategoryAdapter;
import com.example.muse_android.objects.CategoryArticle;
import com.example.muse_android.requests.fetchCategoryData;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ArtsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ArtsFragment extends CategoryFragment {

    public ArtsFragment() {
        this.categoryName = "Arts";
        this.layoutName = R.layout.fragment_arts;
        this.view = R.id.artsView;
    }

    public ArtsFragment newInstance() {
        ArtsFragment fragment = new ArtsFragment();
        return fragment;
    }
}