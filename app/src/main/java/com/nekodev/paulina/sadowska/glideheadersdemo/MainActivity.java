package com.nekodev.paulina.sadowska.glideheadersdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView catImage;
    private static final String IMAGE_SOURCE = "https://raw.githubusercontent.com/PaulinaSadowska/GlideHeadersDemo/master/images/neko.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        catImage = (ImageView) findViewById(R.id.loaded_image);
        downloadImage();
    }

    private void downloadImage() {
        Glide.with(this)
                .load(IMAGE_SOURCE)
                .into(catImage);
    }
}
