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

public class SecondFragment extends Fragment {
    public SecondFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.second_fragment,container,false);

        ModelClass[] modelClasses=new ModelClass[]{
                new ModelClass(R.drawable.baseline_restart_alt_24,"Chithra","21 minutes ago"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Smitha"," 3 hours ago"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Krithi ","5 hours ago"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Skanda Ma","6 hours ago"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Rahul","8 hours ago"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Berthan Fernanado ","9 hours ago"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Jay School Friend","12 hours ago"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Diana","Yesterday"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Appaji","Yesterday"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"Magnumasia","Yesterday"),
                new ModelClass(R.drawable.baseline_restart_alt_24,"SpandZ","Yesterday"),
        };

        RecyclerView recyclerView=view.findViewById(R.id.recyclerview_status);
        RecyclerSAdapter recyclerSAdapter=new RecyclerSAdapter(modelClasses);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(recyclerSAdapter);
        return view;
    }
}
