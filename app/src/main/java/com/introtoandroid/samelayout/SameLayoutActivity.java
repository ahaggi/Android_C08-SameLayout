package com.introtoandroid.samelayout;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class SameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_same_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_same_layout, menu);
        menu.findItem(R.id.program_menu_item)
                .setIntent(new Intent(this, ProgrammaticLayoutActivity.class));
        menu.findItem(R.id.resource_menu_item)
                .setIntent(new Intent(this, ResourceLayoutActivity.class));
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        startActivity(item.getIntent());
        super.onOptionsItemSelected(item);
        return true;
    }

}
