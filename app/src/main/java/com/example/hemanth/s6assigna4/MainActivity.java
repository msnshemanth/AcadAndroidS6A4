package com.example.hemanth.s6assigna4;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar ab = getSupportActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Three tab to display in actionbar
        ab.addTab(ab.newTab().setText("Audio").setIcon(R.mipmap.ic_launcher).setTabListener(this));// tab with text and image
        //ab.addTab(ab.newTab().setIcon(R.mipmap.ic_launcher).setTabListener(this));//new tab with image
        ab.addTab(ab.newTab().setText("Video").setIcon(R.mipmap.ic_launcher).setTabListener(this));
        //ab.addTab(ab.newTab().setText("Tab 3").setTabListener(this));

        //b1 = (Button)findViewById(R.id.button);

    }

    public void newActivity(View view){

        Intent intent = new Intent(this,NewActivity.class);
        startActivity(intent);

    }
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        //Called when a tab is selected
        int nTabSelected = tab.getPosition();
        switch (nTabSelected) {
            case 0:
                setContentView(R.layout.actionbar_tab_1);
                break;
            case 1:
                setContentView(R.layout.actionbar_tab_2);
                break;
//            case 2:
//                setContentView(R.layout.actionbar_tab_3);
//                break;
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        // Called when a tab unselected.
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        // Called when a tab is selected again.
    }

}
