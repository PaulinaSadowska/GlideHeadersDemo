package com.nekodev.paulina.sadowska.glideheadersdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView catImageView;
    private static final String IMAGE_SOURCE = "https://scontent-waw1-1.xx.fbcdn.net/v/t1.0-9/13900109_1412805642079168_5066035343370899394_n.jpg?oh=118a4860ed47afe81c28193639f9f136&oe=58411963";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        catImageView = (ImageView) findViewById(R.id.loaded_image);
        downloadImage();
    }

    private void downloadImage() {
        Glide.with(this)
                .load(IMAGE_SOURCE)
                .into(catImageView);
    }
}
