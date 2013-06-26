package com.kirin.volleyimagehelper;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import com.android.volley.toolbox.ImageLoader.ImageListener;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView mImg ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		mImg = (ImageView) this.findViewById(R.id.imageView1);
		mImg.setImageResource(R.drawable.ic_launcher);
		
		VolleyImageLoaderHelper.initImageLoader(getApplicationContext());
		
		String requestUrl = "http://rack.2.mshcdn.com/media/ZgkyMDEyLzEyLzAzL2U0L3NlZWhvd3lvdXJnLjlyMS5qcGcKcAl0aHVtYgk5NTB4NTM0IwplCWpwZw/8fec6ce4/e71/see-how-your-google-results-measure-up-with-google-grader-video--6b8bbb4b41.jpg";
		VolleyImageLoaderHelper.get().get(requestUrl, new ImageListener() {
			
			@Override
			public void onErrorResponse(VolleyError arg0) {
				// TODO Auto-generated method stub
				Log.d("VolleyImageLoader" , arg0.toString());
			}
			
			@Override
			public void onResponse(ImageContainer response, boolean arg1) {
				// TODO Auto-generated method stub
				mImg.setImageBitmap(response.getBitmap());
			}
		});
		
		
	}


}
