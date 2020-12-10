package com.test.innoctive.apicall;

import android.content.Context;

import androidx.annotation.NonNull;

import com.test.innoctive.R;
import com.test.innoctive.utility.CustomProgressBar;
import com.test.innoctive.utility.PopupUtility;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import static com.test.innoctive.utility.EncryptDecrypt.decryptData;

public class ApiEngineCall {

    private ApiCallResult resultObject;
    private CustomProgressBar progressBar;

    public ApiEngineCall(final Context context, Call<ResponseBody> callEnqueue, final ApiResponse apiResponse) {
        try {
            progressBar = new CustomProgressBar(context, context.getResources().getString(R.string.msg_wait));
            progressBar.displayDialog();
            callEnqueue.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(@NonNull Call<ResponseBody> call, @NonNull Response<ResponseBody> response) {
                    progressBar.closeDialog();
                    if (response.isSuccessful()) {
                        resultObject = decryptData(response.body().toString(), ApiCallResult.class);

                    } else if (response.code() == 503) {
                        PopupUtility.showLongToast(context, context.getResources().getString(R.string.server_down_message));
                    }

                    apiResponse.responseText(resultObject);
                }

                @Override
                public void onFailure(@NonNull Call<ResponseBody> call, @NonNull Throwable t) {
                    progressBar.closeDialog();
                    apiResponse.responseText(resultObject);
                    //PopupUtility.showLongToast(context, context.getResources().getString(R.string.server_down_message));
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
            progressBar.closeDialog();
        }
    }



    public interface ApiResponse {
        void responseText(ApiCallResult resultObject);
    }
}
