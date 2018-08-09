package com.esmaili0gmail.baset.recyclervewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> userNames=new ArrayList<>();
private ArrayList<String> phoneNumbers=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupArrayLists();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.rv_sample);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getBaseContext(),
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        AdapterRv adapterRv=new AdapterRv(getBaseContext(),userNames,phoneNumbers);
        recyclerView.setAdapter(adapterRv);


    }

    private void setupArrayLists() {
        userNames.add("Hasan");
        phoneNumbers.add("09905905452");
        userNames.add("Hasan");
        phoneNumbers.add("09905905452");
        userNames.add("Hasan");
        phoneNumbers.add("09905905452");
        userNames.add("Hasan");
        phoneNumbers.add("09905905452");
        userNames.add("Hasan");
        phoneNumbers.add("09905905452");
        userNames.add("Hasan");
        phoneNumbers.add("09905905452");
    }
}
