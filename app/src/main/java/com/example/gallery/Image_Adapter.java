package com.example.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class Image_Adapter extends BaseAdapter {
   private Context context;

   public int[] images={

           R.drawable.a,
           R.drawable.b,
           R.drawable.c,
           R.drawable.d,
           R.drawable.e,
           R.drawable.f,
           R.drawable.g,
           R.drawable.h,
           R.drawable.i,
           R.drawable.j,
           R.drawable.k,
           R.drawable.l,
           R.drawable.m,
           R.drawable.n,
           R.drawable.a,
           R.drawable.b,
           R.drawable.c,
           R.drawable.d,
           R.drawable.e,
           R.drawable.f,
           R.drawable.g,
           R.drawable.h,
           R.drawable.i,
           R.drawable.j,
           R.drawable.k,
           R.drawable.l,
           R.drawable.m,
           R.drawable.n,
           R.drawable.a,
           R.drawable.b
   };
public Image_Adapter(Context context) {this.context=context;}


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setScaleType(imageView.getScaleType());
        imageView.setImageResource(images[i]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        return imageView;
    }
}