package com.example.myapplication.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;

public class TextFragment extends Fragment {

    public TextFragment() {
        super(R.layout.fragment_text);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText editText = view.findViewById(R.id.text_input);
        // Further logic to handle text input can be implemented here
    }
}