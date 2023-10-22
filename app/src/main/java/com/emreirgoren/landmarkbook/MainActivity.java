package com.emreirgoren.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;


import com.emreirgoren.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    //static Landmark selectedLandmark;
    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        //Data

        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pizza);
        Landmark eiffel = new Landmark("Eiffel","France",R.drawable.eyfel);
        Landmark colloseum = new Landmark("Colloseum","Italy",R.drawable.collessium);
        Landmark londonBridge = new Landmark("London Bridge","UK",R.drawable.londonbridge);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colloseum);
        landmarkArrayList.add(londonBridge);

        //RecyclerView

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}