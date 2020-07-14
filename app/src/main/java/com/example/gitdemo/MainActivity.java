package com.example.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        papu();

    }

    private void papu() {
        Toast.makeText(this, "das", Toast.LENGTH_SHORT).show();
        
    }
}
