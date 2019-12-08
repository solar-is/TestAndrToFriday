package com.example.testandrtofriday.ui.room;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.testandrtofriday.R;

public class RoomFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_room, container, false);

        Button mButtonLight = root.findViewById(R.id.RoomLightButton);
        Button mButtonRosette = root.findViewById(R.id.RoomRosetteButton);
        Button mButtonVacuum = root.findViewById(R.id.RoomVacuumButton);
        Button mButtonCurtains = root.findViewById(R.id.RoomButtonCurtains);

        mButtonLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Вроде включился", Toast.LENGTH_SHORT).show();

            }
        });

        mButtonRosette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Вроде включился", Toast.LENGTH_SHORT).show();

            }
        });

        mButtonVacuum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Вроде включился", Toast.LENGTH_SHORT).show();

            }
        });

        mButtonCurtains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Вроде включился", Toast.LENGTH_SHORT).show();

            }
        });

        return root;
    }



}