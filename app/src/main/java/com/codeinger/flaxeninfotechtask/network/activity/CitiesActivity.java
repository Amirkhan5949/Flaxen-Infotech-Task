package com.codeinger.flaxeninfotechtask.network.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.codeinger.flaxeninfotechtask.R;
import com.codeinger.flaxeninfotechtask.adapter.CitiesAdapter;
import com.codeinger.flaxeninfotechtask.network.model.ResponsePinCode;
import com.google.gson.Gson;

public class CitiesActivity extends AppCompatActivity {

    private RecyclerView rv_Places;
    private ImageView iv_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        init();
    }

    private void init() {
        rv_Places=findViewById(R.id.rv_Places);
        iv_back=findViewById(R.id.iv_back);
        ResponsePinCode responsePinCode=new Gson().fromJson(getIntent().getStringExtra("response"),ResponsePinCode.class);


        iv_back.setOnClickListener(view -> {
            finish();
        });
        rv_Places.setLayoutManager(new LinearLayoutManager(rv_Places.getContext(),RecyclerView.VERTICAL,false));
        rv_Places.setAdapter(new CitiesAdapter(responsePinCode.getPlaces()));
    }
}
