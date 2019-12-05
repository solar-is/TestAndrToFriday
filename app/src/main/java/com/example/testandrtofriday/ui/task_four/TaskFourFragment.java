package com.example.testandrtofriday.ui.task_four;

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

public class TaskFourFragment extends Fragment {

    private TaskFourViewModel taskFourViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        taskFourViewModel =
                ViewModelProviders.of(this).get(TaskFourViewModel.class);
        View root = inflater.inflate(R.layout.fragment_task_four, container, false);
        final TextView textView = root.findViewById(R.id.text_task_four);
        taskFourViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}