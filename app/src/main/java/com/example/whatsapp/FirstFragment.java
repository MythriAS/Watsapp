package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FirstFragment extends Fragment {

    public FirstFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        ModelClass[] modelClasses = new ModelClass[]{
                new ModelClass(R.drawable.baseline_people_alt_24, "Mohith", "Hello"),
                new ModelClass(R.drawable.baseline_people_alt_24, "Berthan", "oh Sorry!"),
                new ModelClass(R.drawable.baseline_people_alt_24, "Smitha", "Okay"),
                new ModelClass(R.drawable.baseline_people_alt_24, "Rekha", "Good Morning"),
                new ModelClass(R.drawable.baseline_people_alt_24, "Sindhu", "Happy Birthday"),
                new ModelClass(R.drawable.baseline_people_alt_24, "Nazim", "OH! Really"),
                new ModelClass(R.drawable.baseline_people_alt_24, "Shiva", "HAHAHA"),


        };
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_chats);
        RecyclerSAdapter recyclerSAdapter = new RecyclerSAdapter(modelClasses);
        recyclerView.setAdapter(recyclerSAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setHasFixedSize(true);
        return view;
    }
}
