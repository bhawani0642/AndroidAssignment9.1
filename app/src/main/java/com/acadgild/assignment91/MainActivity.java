package com.acadgild.assignment91;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar= getSupportActionBar();
        textView = (TextView) findViewById(R.id.my_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.mymenu,menu);//inflates the menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.color_blue:
                textView.setTextColor(Color.BLUE);//Sets color to blue when clicked on Blue button
                break;
            case R.id.color_green:
                textView.setTextColor(Color.GREEN);//Sets color to green when clicked on Green button
                break;

            case R.id.color_red:
                textView.setTextColor(Color.RED);//Sets color to green when clicked on Red button
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
