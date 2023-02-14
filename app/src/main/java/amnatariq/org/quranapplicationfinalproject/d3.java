package amnatariq.org.quranapplicationfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class d3 extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d3);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationview);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigration_open,R.string.navigration_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //loadFragment(new AFragment());

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id==R.id.home_menu)
                {
                    //loadFragment(new AFragment());
                    Intent i = new Intent(d3.this, MainActivity.class);
                    startActivity(i);
                }
                else if(id == R.id.menu_menu)
                {
                    Intent i = new Intent(d3.this, Activity1.class);
                    startActivity(i);
                }
                else if (id == R.id.user)
                {
                    Intent i = new Intent(d3.this, d2.class);
                    startActivity(i);
                }
                else if(id == R.id.qurandata)
                {
                    Intent i = new Intent(d3.this, d4.class);
                    startActivity(i);
                }
                else if(id == R.id.bookmark)
                {
                    Intent i = new Intent(d3.this, Activity1.class);
                    startActivity(i);
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });


//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigration_open,R.string.navigration_close);
//       drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//
//        //Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


    }

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }

    private void loadFragment(Fragment f) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container,f);
        ft.commit();
    }
}