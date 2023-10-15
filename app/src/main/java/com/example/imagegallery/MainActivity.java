package com.example.imagegallery;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button nextBTN,preBTN;
    ImageView imageArea;

    TextView nameArea;

    int counter=0;

    int images[] = {
            R.drawable.w2,
            R.drawable.dani,
            R.drawable.ava_addams,
            R.drawable.emily_willis,
            R.drawable.mia,
            R.drawable.jonny,
            R.drawable.lana,
    };


    String names[] = {
            "Shuru Kare",
            "Dani Daniels",
            "Ava Addams",
            "Emily Willis",
            "Mia Khalifa",
            "Jonny Sins",
            "Lana Rhodes"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageArea = findViewById(R.id.imageArea);
        imageArea.setImageResource(images[counter]);
        nameArea = findViewById(R.id.nameArea);
        nameArea.setText(names[counter]);



        nextBTN = findViewById(R.id.nextBTN);
        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter==6){
                    Toast.makeText(MainActivity.this, "Khatam", Toast.LENGTH_SHORT).show();
                    nextBTN.setClickable(false);
                }else {
                    counter++;
                    if(counter==6){
                        nextBTN.setText("Next");
                    }else {
                        nextBTN.setText("Next");
                    }
//                    Toast.makeText(MainActivity.this, Integer.toString(counter), Toast.LENGTH_SHORT).show();
                    imageArea = findViewById(R.id.imageArea);
                    imageArea.setImageResource(images[counter]);
                    nameArea = findViewById(R.id.nameArea);
                    nameArea.setText(names[counter]); 
                }
            }
        });


        preBTN = findViewById(R.id.preBTN);
        preBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter==0){
                    Toast.makeText(MainActivity.this, "Shuru Kare", Toast.LENGTH_SHORT).show();
//                    preBTN.setClickable(false);
                }else {
//                    preBTN.setClickable(true);
                    counter--;
                    imageArea = findViewById(R.id.imageArea);
                    imageArea.setImageResource(images[counter]);
                    nameArea = findViewById(R.id.nameArea);
                    nameArea.setText(names[counter]);
                }
            }
        });
    }
}