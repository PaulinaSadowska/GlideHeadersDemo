package com.nekodev.paulina.sadowska.glideheadersdemo;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.model.GenericLoaderFactory;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.stream.BaseGlideUrlLoader;
import com.bumptech.glide.load.model.stream.StreamModelLoader;
import com.bumptech.glide.module.GlideModule;

import java.io.InputStream;

/**
 * Created by Paulina Sadowska on 03.09.2016.
 */

public class GlideModuleWithHeaders implements GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {   /* nothing to do here */
    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        glide.register(String.class, InputStream.class, new HeaderLoader.Factory());
    }

    private static class HeaderLoader extends BaseGlideUrlLoader<String> {

        private static final String AUTHORIZATION = "QWERTYUIOPASDFGHJKL";

        HeaderLoader(Context context) {
            super(context);
        }

        @Override
        protected String getUrl(String model, int width, int height) {
            return model;
        }

        @Override
        protected Headers getHeaders(String model, int width, int height) {
            return new LazyHeaders.Builder()
                    .addHeader("Authorization", AUTHORIZATION)
                    .build();
        }

        static class Factory implements ModelLoaderFactory<String, InputStream> {
            @Override
            public StreamModelLoader<String> build(Context context, GenericLoaderFactory factories) {
                return new HeaderLoader(context);
            }

            @Override
            public void teardown() { /* nothing to free */ }
        }
    }
}