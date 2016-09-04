package com.nekodev.paulina.sadowska.glideheadersdemo.glide;

import android.content.Context;

import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.load.model.stream.BaseGlideUrlLoader;

/**
 * Created by Paulina Sadowska on 04.09.2016.
 */

class HeaderLoader extends BaseGlideUrlLoader<String> {

    private static final String AUTHORIZATION = "QWERTYUIOPASDFGHJKL";
    private static final Headers REQUEST_HEADERS = new LazyHeaders.Builder()
            .addHeader("Authorization", AUTHORIZATION)
            .build();

    HeaderLoader(Context context) {
        super(context);
    }

    @Override
    protected String getUrl(String model, int width, int height) {
        return model;
    }

    @Override
    protected Headers getHeaders(String model, int width, int height) {
        return REQUEST_HEADERS;
    }
}
