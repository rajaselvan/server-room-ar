package com.example.rajaselvan.unitydeployment;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.widget.TabHost;

import com.ideas2it.ServerAssemble.UnityPlayerActivity;


public class TabbedActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);
        ActionBar actionBar = getActionBar();
        if(actionBar !=null)
        {
            actionBar.hide();
        }
        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("tab1");
        tabSpec1.setIndicator("Instructions",getResources().getDrawable(R.drawable.ic_list_black_24dp));
        Intent intent1 = new Intent(this, InstructionsActivity.class);
        tabSpec1.setContent(intent1);
        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tab2");
        tabSpec2.setIndicator("AR",getResources().getDrawable(R.drawable.ic_3d_rotation_black_24dp));
        Intent intent2 = new Intent(this, UnityPlayerActivity.class);
        tabSpec2.setContent(intent2);
        tabHost.addTab(tabSpec1);
        tabHost.addTab(tabSpec2);
        tabHost.setCurrentTab(1);
    }
}
