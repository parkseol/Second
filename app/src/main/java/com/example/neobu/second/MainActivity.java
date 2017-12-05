package com.example.neobu.second;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
    TabHost mTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabHost mTab = getTabHost();
        TabHost.TabSpec spec;

        LayoutInflater.from(this).inflate(R.layout.activity_main, mTab.getTabContentView(),true);

        spec = mTab.newTabSpec("tab1").setIndicator("First Tab").setContent(R.id.tv1);
         mTab.addTab(spec);
        spec = mTab.newTabSpec("tab2").setIndicator("Second Tab").setContent(R.id.tv2);
        mTab.addTab(spec);
        spec = mTab.newTabSpec("tab3").setIndicator("Third Tab").setContent(R.id.tv3);
        mTab.addTab(spec);
    }
}

