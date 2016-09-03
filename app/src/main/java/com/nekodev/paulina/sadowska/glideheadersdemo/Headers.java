package com.nekodev.paulina.sadowska.glideheadersdemo;

import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;

/**
 * Created by Paulina Sadowska on 03.09.2016.
 */

class Headers {

    private static final String AUTHORIZATION = "QWERTYUIOPASDFGHJKL";

    static GlideUrl getUrlWithHeaders(String url){
        return new GlideUrl(url, new LazyHeaders.Builder()
                .addHeader("Authorization", AUTHORIZATION)
                .build());
    }
}
