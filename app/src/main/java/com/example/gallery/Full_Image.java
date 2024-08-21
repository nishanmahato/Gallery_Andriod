package com.example.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Full_Image extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_full_image);

        imageView=findViewById(R.id.fullImage);


        Intent i =getIntent();
        int position = i.getExtras().getInt("id");
        Image_Adapter image_Adapter = new Image_Adapter(this);
        imageView.setImageResource(image_Adapter.images[position]);

    }
}