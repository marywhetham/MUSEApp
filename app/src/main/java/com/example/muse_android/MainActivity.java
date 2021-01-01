package com.example.muse_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muse_android.adapters.ArticleAdapter;
import com.example.muse_android.objects.Article;

import com.example.muse_android.requests.fetchArticleData;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Article> newArticles = new ArrayList<>();
    public static RecyclerView mRecyclerView;
    public static RecyclerView.Adapter mAdapter;
    public static RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadNewArticles();

        mRecyclerView = findViewById(R.id.recyclerView);
//        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ArticleAdapter(this, newArticles);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void loadNewArticles(){

//        try{
//            URL url = new URL("http://www.muse-magazine.com/wp-json/wp/v2/posts");
            fetchArticleData process = new fetchArticleData();
            process.execute();

//        } catch (MalformedURLException e){
//            e.printStackTrace();
//        }

    }

    public void toCategoriesPage(View view) {
        Intent intent = new Intent(MainActivity.this, CategoriesActivity.class);
        startActivity(intent);
    }
}
