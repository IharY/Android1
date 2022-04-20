package com.example.lab_mobile_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button feedButton;
    private ImageButton shareButton;
    private TextView clickField;
    private ImageView cat;
    private CharSequence num_box;
    private ImageButton infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();//убрать ActionBar

        feedButton = findViewById(R.id.feedButton);
        cat = findViewById(R.id.cat);
        clickField = findViewById(R.id.clickField);
        shareButton = findViewById(R.id.btn_share);
        infoButton = findViewById(R.id.btn_info);



        feedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_box = clickField.getText();
                int num_box_2 = Integer.valueOf(num_box.toString());
                num_box_2++;
                if (num_box_2 % 15 == 0){
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanim);
                    cat.startAnimation(animation);
                }
                clickField.setText(Integer.toString((num_box_2)));

            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("text/plain");
                String shareBody = "My results " + clickField;
                String shareSub = "FeedTheCat Game";
                intent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                intent.setAction(Intent.ACTION_SEND);
                startActivity(intent);
            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(this, InfoActivity.class);
                startActivity(intent);

            }
        });






    }
}