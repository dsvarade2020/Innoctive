package com.test.innoctive;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.test.innoctive.apicall.ApiCallGSON;
import com.test.innoctive.apicall.ApiCallResult;
import com.test.innoctive.apicall.ApiClientJsonParser;
import com.test.innoctive.apicall.ApiEngineCall;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;

public class TransactionFragment extends Fragment implements View.OnClickListener {

    public View view;

    public TransactionFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_transaction, container,false);

        getTransactionlistfromAPI(); // Calling First API

        return view;
    }

    private void getTransactionlistfromAPI() {
        if(getActivity()!= null){
            try{

                Retrofit retrofit = ApiClientJsonParser.gtGSONInstance();
                ApiCallGSON callGSON = retrofit.create(ApiCallGSON.class);
                Call<ResponseBody> transactionResponsecall = callGSON.transactioncall();

                new ApiEngineCall(getActivity(), transactionResponsecall, new ApiEngineCall.ApiResponse() {
                    @Override
                    public void responseText(ApiCallResult resultObject) {

                        if (resultObject != null && null != getActivity()) {

                            if (resultObject.getCode().equals("200")) {

//                                credentialsResult = new Gson().fromJson(resultObject.getResponseText(), FetchTransactionLimitResponse.FetchTransactionLimitResult.class);


                            }


                        }
                    }
                });


            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onClick(View view) {

    }
}
