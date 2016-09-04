package com.nekodev.paulina.sadowska.glideheadersdemo.glide;

import android.content.Context;

import com.bumptech.glide.load.model.GenericLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.stream.StreamModelLoader;

import java.io.InputStream;

/**
 * Created by Paulina Sadowska on 04.09.2016.
 */

class HeaderLoaderFactory implements ModelLoaderFactory<String, InputStream> {
    @Override
    public StreamModelLoader<String> build(Context context, GenericLoaderFactory factories) {
        return new HeaderLoader(context);
    }

    @Override
    public void teardown() { /* nothing to free */ }
}
