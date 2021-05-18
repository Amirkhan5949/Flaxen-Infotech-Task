package com.codeinger.flaxeninfotechtask.network.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Pincode {
      @GET("in/{pin_code}")
    Call<ResponsePinCode> getPinCode(@Path("pin_code")String id);
}
