package com.nekodev.paulina.sadowska.glideheadersdemo.glide;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
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
        glide.register(String.class, InputStream.class, new HeaderLoaderFactory());
    }
}