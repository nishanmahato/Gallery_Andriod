package com.example.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Grid_Page extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_page);

        gridView=findViewById(R.id.grid);

        gridView.setAdapter(new Image_Adapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
             public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
             Toast.makeText(Grid_Page.this,"Click Image", Toast.LENGTH_SHORT).show();
             Intent intent =new Intent(Grid_Page.this, Full_Image.class);
             intent.putExtra("id",i);
             startActivity(intent);
          }
       });
    }
}