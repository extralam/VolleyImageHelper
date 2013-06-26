VolleyImageHelper
=================

VolleyImageHelper - Extends Volley Google Library

# Very Easy to implement Google Volley ImageLoader

## Init the VolleyImageLoaderHelper
`VolleyImageLoaderHelper.initImageLoader(getApplicationContext());  // init VolleyImageLoaderHelper`

## use to get Image by the VolleyImageLoaderHelper
VolleyImageLoaderHelper.get().get(url, new ImageListener() {
 
@Override
public void onErrorResponse(VolleyError error) {
img.setImageResource(R.drawable.ic_launcher);
}
 
@Override
public void onResponse(final ImageContainer response, boolean isImmediate) {
// response.getBitmap();   // return Bitmap
}
 
}
