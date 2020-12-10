package com.test.innoctive.utility;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.TextView;

import com.test.innoctive.R;

public class CustomProgressBar {
    private Dialog dialog;

    public CustomProgressBar(Context context, String strMessage) {
        try {

            if (context == null)
                return;

            dialog = new Dialog(context);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.custom_progress_bar);
            dialog.setCanceledOnTouchOutside(false);

            TextView tvMessage = dialog.findViewById(R.id.tv_progress_message);
            tvMessage.setText(strMessage);
        } catch (Exception e) {
//            Log.e(CustomProgressBar.class.getSimpleName(), "error: " + e.toString());
        }
    }

    public void displayDialog() {
        if (null != dialog)
            dialog.show();
    }

    public void closeDialog() {
        try {
            if (null != dialog && dialog.isShowing()) {
                dialog.dismiss();
            }
        } catch (final IllegalArgumentException e) {
            // Handle or log or ignore
        } catch (final Exception e) {
            // Handle or log or ignore
        } finally {
            dialog = null;
        }
    }
}
