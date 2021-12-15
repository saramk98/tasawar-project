package com.auiz1.sheryarali.projectxmls;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class fragmentmanager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentmanager);

        BottomNavigationView btnNav=findViewById(R.id.nav);
        btnNav.setOnItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout,new Home()).commit();
    }

    private NavigationBarView.OnItemSelectedListener navListener =new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment=null;

            switch (item.getItemId()) {
                case R.id.item1:
                    selectedFragment = new MyBlogs();
                    break;
                case R.id.item2:
                    selectedFragment = new CreateBlog();
                    break;
                case R.id.item3:
                    selectedFragment = new Home();
                    break;
                case R.id.item4:
                    selectedFragment = new Aboutme();
                    break;

            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_layout,selectedFragment).commit();
            return true;
        }
    };

}
