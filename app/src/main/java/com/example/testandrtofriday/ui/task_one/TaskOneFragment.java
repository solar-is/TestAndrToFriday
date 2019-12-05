package com.example.testandrtofriday.ui.task_one;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.testandrtofriday.R;

public class TaskOneFragment extends Fragment {

    private TaskOneViewModel taskOneViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        taskOneViewModel =
                ViewModelProviders.of(this).get(TaskOneViewModel.class);
        View root = inflater.inflate(R.layout.fragment_task_one, container, false);
        final TextView textView = root.findViewById(R.id.text_task_one);
        taskOneViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}