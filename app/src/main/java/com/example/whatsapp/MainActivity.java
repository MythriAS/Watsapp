package com.example.whatsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabs);

        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setIcon(R.drawable.baseline_chat_bubble_24);
        firstTab.setText("Chats");
        tabLayout.addTab(firstTab);

        TabLayout.Tab secondTab = tabLayout.newTab();
        secondTab.setIcon(R.drawable.baseline_restart_alt_24);
        secondTab.setText("CALLS");
        tabLayout.addTab(secondTab);

        TabLayout.Tab thirdTab = tabLayout.newTab();
        thirdTab.setIcon(R.drawable.baseline_call_24);
        thirdTab.setText("CALLS");
        tabLayout.addTab(thirdTab);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                if (tab != null) {
                    switch (tab.getPosition()) {
                        case 0:
                            fragment = new FirstFragment();
                            break;
                        case 1:
                            fragment = new SecondFragment();
                            break;
                        case 2:
                            fragment = new ThirdFragment();
                            break;
                    }
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.framelayout, fragment);
                    ft.commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}