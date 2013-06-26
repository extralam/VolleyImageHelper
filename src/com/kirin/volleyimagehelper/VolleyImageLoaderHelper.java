package com.kirin.volleyimagehelper;

import android.content.Context;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

public class VolleyImageLoaderHelper {

	// ImageLoader From Volley
	private static ImageLoader sImageLoader;

	/**
	 * 
	 * @return Volley ImageLoader
	 */
	public static ImageLoader get() {
		return sImageLoader;
	}

	public static void initImageLoader(Context context) {
		if (sImageLoader != null) {
			return;
		}

		sImageLoader = new ImageLoader(
				Volley.newRequestQueue(context), 	// Volley Request 
				new VolleyBitmapLruCache(context)			// Volley BitmapLruCacheHepler
				);
		
	}
}