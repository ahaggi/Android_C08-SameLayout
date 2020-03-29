package com.introtoandroid.samelayout;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ResourceLayoutActivity extends AppCompatActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resource_based_layout);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}