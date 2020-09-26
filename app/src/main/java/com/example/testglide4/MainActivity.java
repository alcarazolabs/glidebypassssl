package com.example.testglide4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.testglide4.MyGlideModule.GlideApp;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = findViewById(R.id.imagen);
        /*
        * https://github.com/square/okhttp/issues/2372
        * https://gist.github.com/mlc/549409f649251897ebef
        * https://www.soinside.com/question/qdGtzPZ846pScTPAoKeXLP
        *
        * */
        final String url ="https://static01.nyt.com/images/2020/09/25/us/politics/00dc-court-hfo/merlin_164596695_efbc8d77-2376-4f8a-9f78-87fc6fc52918-jumbo.jpg";
        //ssl protection wikipedia:
        final String url2 ="https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/2010_FIFA_World_Cup_Spain_with_cup.JPG/800px-2010_FIFA_World_Cup_Spain_with_cup.JPG";
        final String url3 ="https://i.imgur.com/cFMCROh.jpeg";

        //load image with the GlideApp (With volley and cache doest no work well)
        GlideApp.with(this)
                .load(url2)
                .apply(RequestOptions.circleCropTransform())
                .into(imagen);

       /*
       //The next line of code is the glide's classic way and works well with volley lib with cache.
        Glide.with(this)
                .load(url2)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(imagen);
        */

    }
}