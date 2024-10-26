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

public class ThirdFragment extends Fragment {

    public ThirdFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.third_fragment,container,false);

        ModelClass[] modelClasses=new ModelClass[]{
                new ModelClass(R.drawable.baseline_call_24,"Rekha JI","Today,2:38 pm"),
                new ModelClass(R.drawable.baseline_call_24,"Appaji","Today,2:38 pm"),
                new ModelClass(R.drawable.baseline_call_24,"Spoorthi","Today,2:38 pm"),
                new ModelClass(R.drawable.baseline_call_24,"Smitha","Today,2:38 pm"),
                new ModelClass(R.drawable.baseline_call_24,"Diana","Today,2:38 pm"),
                new ModelClass(R.drawable.baseline_call_24,"Krithi Sanono","Today,2:38 pm"),
                new ModelClass(R.drawable.baseline_call_24,"Jay School Friend","Today,2:38 pm"),
                new ModelClass(R.drawable.baseline_call_24,"Poornima","Today,2:38 pm"),
                new ModelClass(R.drawable.baseline_call_24,"Jyo","Today,2:38 pm"),


        };
        RecyclerView recyclerView=view.findViewById(R.id.recyclerview_calls);
        RecyclerSAdapter recyclerSAdapter=new RecyclerSAdapter(modelClasses);
        recyclerView.setAdapter(recyclerSAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setHasFixedSize(true);
        return view;
    }
}
