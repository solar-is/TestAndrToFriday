package com.example.testandrtofriday.ui.task_two;

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

public class TaskTwoFragment extends Fragment {

    private TaskTwoViewModel taskTwoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        taskTwoViewModel =
                ViewModelProviders.of(this).get(TaskTwoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_task_two, container, false);
        final TextView textView = root.findViewById(R.id.text_task_two);
        taskTwoViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}