package com.example.marketplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    ImageView imgUser;
    TextView txtName;
    TextView txtEmail;
    Button btnEdit;
    Button btnPosts;
    Button btnChats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        NavBarFragment topFrag = new NavBarFragment();
        fragmentTransaction.add(R.id.topFrag, topFrag);
        fragmentTransaction.commit();

        imgUser = findViewById(R.id.imgUser);
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        btnEdit = findViewById(R.id.btnEdit);
        btnPosts = findViewById(R.id.btnPosts);
        btnChats = findViewById(R.id.btnChats);


    }
}
