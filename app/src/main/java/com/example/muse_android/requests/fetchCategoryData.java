package com.example.muse_android.requests;

import android.os.AsyncTask;

import com.example.muse_android.objects.Article;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import com.example.muse_android.objects.CategoryArticle;

public class fetchCategoryData extends AsyncTask {

    ArrayList<CategoryArticle> categoryArticles = new ArrayList<>();
    String categoryName;
    static String [][] categoryNumbers = {{"Editor's Choice", "1133"}, {"Arts", "15"}, {"Entertainment", "14"}, {"Lifestyle", "17"}, {"Fashion", "16"}, {"Music", "1132"}};

    public fetchCategoryData (String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        String id = "";
        String title = "";
        String imageURL = "";
        String description = "";

        try {
            String categoryNumber = "";
            int i = 0;
            while (i < this.categoryNumbers.length && categoryNumber.equals("")) {
                if (this.categoryNumbers[i][0].equals(this.categoryName)) {
                    categoryNumber = this.categoryNumbers[i][1];
                }
                i++;
            }
            URL urlT = new URL("http://www.muse-magazine.com/wp-json/wp/v2/posts?categories=" + Integer.parseInt(categoryNumber));
            HttpURLConnection httpURLConnectionT = (HttpURLConnection) urlT.openConnection();
            InputStream inputStreamT = httpURLConnectionT.getInputStream();
            BufferedReader bufferedReaderT = new BufferedReader(new InputStreamReader(inputStreamT));
            String line = "";
            String data = "";
            while (line != null){
                line = bufferedReaderT.readLine();
                data = data + line;
            }
            JSONArray JA = new JSONArray(data);
            for (int j = 0; j < JA.length(); j++) {
                id = "" + ((JSONObject) JA.getJSONObject(j)).get("id");
                title = "" + (((JSONObject) ((JSONObject) JA.getJSONObject(j)).get("title")).get("rendered"));
                imageURL = "" + ((JSONObject) JA.getJSONObject(j)).get("jetpack_featured_media_url");
                description = "" + (((JSONObject) ((JSONObject) JA.getJSONObject(j)).get("excerpt")).get("rendered"));
                CategoryArticle a = new CategoryArticle(id, title, imageURL, description, this.categoryName);
                categoryArticles.add(a);
                System.out.println(a.getId());
                System.out.println(a.getTitle());
                System.out.println(a.getImage());
                System.out.println(a.getDescription());
                System.out.println(a.getCategoryName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
