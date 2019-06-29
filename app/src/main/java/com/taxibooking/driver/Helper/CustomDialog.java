package com.taxibooking.driver.Helper;
 /**
 *@Developer android
 *@Company android
 **/

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

import com.taxibooking.driver.R;

public class CustomDialog extends Dialog {

    public CustomDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
    }
}
