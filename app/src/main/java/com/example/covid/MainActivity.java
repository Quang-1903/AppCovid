package com.example.covid;

import android.content.Intent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnCorona;
    private FloatingActionButton fbSpeaker;
    private FloatingActionButton fbSearch;
    private FloatingActionButton fbLogin;
    private FloatingActionButton fbExit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCorona = findViewById(R.id.btn_corona);
        fbSpeaker = findViewById(R.id.fb_speaker);
        fbSearch = findViewById(R.id.fb_search);
        fbLogin = findViewById(R.id.fb_login);
        fbExit = findViewById(R.id.fb_exit);

        fbSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SearchCovid.class);
                startActivity(intent);
            }
        });

        fbSpeaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1  = new Intent(MainActivity.this,SpeakerCovid.class);
                startActivity(intent1);
            }
        });

        btnCorona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                Hien();
            }
        });
    }
     private void Hien()
     {
         fbSpeaker.show();
         fbSearch.show();
         fbLogin.show();
         fbExit.show();
     }
     /*private void An()
     {
         fbSpeaker.hide();
         fbExit.hide();
         fbLogin.hide();
         fbSearch.hide();
     }*/
}