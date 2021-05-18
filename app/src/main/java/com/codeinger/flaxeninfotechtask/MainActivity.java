package com.codeinger.flaxeninfotechtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.codeinger.flaxeninfotechtask.network.NetworkConstraint;
import com.codeinger.flaxeninfotechtask.network.RetrofitClient;
import com.codeinger.flaxeninfotechtask.network.activity.CitiesActivity;
import com.codeinger.flaxeninfotechtask.network.model.Pincode;
import com.codeinger.flaxeninfotechtask.network.model.ResponsePinCode;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView tv_Done;
    private EditText et_pinCode;
//    private TextInputEditText et_pinCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        et_pinCode=findViewById(R.id.et_pinCode);
        tv_Done=findViewById(R.id.tv_Done);


        tv_Done.setOnClickListener(view -> {

            if(et_pinCode.getText().toString().replace(" ", "").length()==6){

                String s=et_pinCode.getText().toString();
                RetrofitClient.getClient(NetworkConstraint.BASE_URL)
                        .create(Pincode.class)
                        .getPinCode(s)
                        .enqueue(new Callback<ResponsePinCode>() {
                            @Override
                            public void onResponse(Call<ResponsePinCode> call, Response<ResponsePinCode> response) {
                                Log.i("dsfsfd", "onResponse: "+response.toString());

                                if (response.isSuccessful()){
                                    if (response.body()!=null){
                                        Intent intent=new Intent(et_pinCode.getContext(), CitiesActivity.class);
                                        intent.putExtra("response",new Gson().toJson(response.body()));
                                        et_pinCode.getContext().startActivity(intent);
                                    }
                                }
                            }

                            @Override
                            public void onFailure(Call<ResponsePinCode> call, Throwable t) {

                            }
                        });


            }else {
                Snackbar.make(findViewById(android.R.id.content), "Enter correct pincode", Snackbar.LENGTH_SHORT).show()   ;

            }





        });
    }
}