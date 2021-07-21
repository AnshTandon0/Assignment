package com.example.assignment.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.assignment.R;

import org.jetbrains.annotations.NotNull;


public class SettingsFragment extends Fragment {

    private Context context1;

    public SettingsFragment() {
        // Required empty public constructor
    }
    public SettingsFragment(Context context) {
        // Required empty public constructor
        this.context1 = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getParentFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {
            @Override
            public void onFragmentPreAttached(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f, @NonNull @NotNull Context context) {
                super.onFragmentPreAttached(fm, f, context);
                Toast.makeText(context1, "Settings Fragment Pre Attached", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFragmentAttached(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f, @NonNull @NotNull Context context) {
                super.onFragmentAttached(fm, f, context);
                Toast.makeText(context1, "Settings Fragment Attached", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFragmentStarted(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f) {
                super.onFragmentStarted(fm, f);
                Toast.makeText(context1, "Settings Fragment Started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFragmentResumed(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f) {
                super.onFragmentResumed(fm, f);
                Toast.makeText(context1, "Settings Fragment Resumed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFragmentPaused(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f) {
                super.onFragmentPaused(fm, f);
                Toast.makeText(context1, "Settings Fragment Paused", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFragmentStopped(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f) {
                super.onFragmentStopped(fm, f);
                Toast.makeText(context1, "Settings Fragment Stopped", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFragmentViewDestroyed(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f) {
                super.onFragmentViewDestroyed(fm, f);
                Toast.makeText(context1, "Settings Fragment View Destroyed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFragmentDestroyed(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f) {
                super.onFragmentDestroyed(fm, f);
                Toast.makeText(context1, "Settings Fragment Destroyed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFragmentDetached(@NonNull @NotNull FragmentManager fm, @NonNull @NotNull Fragment f) {
                super.onFragmentDetached(fm, f);
                Toast.makeText(context1, "Settings Fragment Detached", Toast.LENGTH_SHORT).show();
            }
        },false);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        return view;
    }
}