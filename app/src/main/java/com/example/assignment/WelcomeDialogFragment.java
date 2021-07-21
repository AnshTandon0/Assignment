package com.example.assignment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import org.jetbrains.annotations.NotNull;

public class WelcomeDialogFragment extends DialogFragment {

    private Context context;

    public WelcomeDialogFragment (Context context)
    {
        this.context = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(context, "Dialog Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        Toast.makeText(context, "Dialog Attached", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(context, "Dialog Detached", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(context, "Dialog Stopped", Toast.LENGTH_SHORT).show();
    }

    @NonNull
    @NotNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Welcome to the App");
        return builder.create();
    }
}
