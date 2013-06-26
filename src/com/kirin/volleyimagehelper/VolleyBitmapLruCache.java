package com.kirin.volleyimagehelper;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

import com.android.volley.toolbox.ImageLoader.ImageCache;

/**
 * Helper Class for Volley Bitmap ImageCache, since it need LruCache
 * Memory Cache Class
 * @author 阿目
 *
 */
class VolleyBitmapLruCache extends LruCache<String, Bitmap> implements ImageCache {

	
	public static int getDefaultLruCacheSize() {
		final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
		final int cacheSize = maxMemory / 8;
		return cacheSize;
	}

	public VolleyBitmapLruCache(Context context) {
		this(context , getDefaultLruCacheSize());
	}

	public VolleyBitmapLruCache(Context context , int sizeInKiloBytes) {
		super(sizeInKiloBytes);
	}

	@Override
	protected int sizeOf(String key, Bitmap value) {
		return value.getRowBytes() * value.getHeight() / 1024;
	}

	@Override
	public Bitmap getBitmap(String url) {
		return get(url);
	}

	@Override
	public void putBitmap(String url, Bitmap bitmap) {
		put(url, bitmap);
	}
}
