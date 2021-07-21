package com.example.assignment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.assignment.databinding.ActivityMainBinding;
import com.example.assignment.fragments.HomeFragment;
import com.example.assignment.fragments.SettingsFragment;
import com.google.android.material.navigation.NavigationBarView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       WelcomeDialogFragment dialogFragment = new WelcomeDialogFragment(this);
       dialogFragment.show(getSupportFragmentManager(),"Fragment");

        //setting the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,new HomeFragment(MainActivity.this))
                .commit();

        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.home :
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container,new HomeFragment(MainActivity.this))
                                .commit();
                        break;

                    case R.id.settings:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container,new SettingsFragment(MainActivity.this))
                                .commit();
                        break;
                }

                return true;
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            this.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                @Override
                public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
                    Toast.makeText(activity, "Main Activity Created", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onActivityStarted(@NonNull Activity activity) {
                    Toast.makeText(activity, "Main Activity Started", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onActivityResumed(@NonNull Activity activity) {
                    Toast.makeText(activity, "Main Activity Resumed", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onActivityPaused(@NonNull Activity activity) {
                    Toast.makeText(activity, "Main Activity Paused", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onActivityStopped(@NonNull Activity activity) {
                    Toast.makeText(activity, "Main Activity Stopped", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

                }

                @Override
                public void onActivityDestroyed(@NonNull Activity activity) {
                    Toast.makeText(activity, "Main Activity Destroyed", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}