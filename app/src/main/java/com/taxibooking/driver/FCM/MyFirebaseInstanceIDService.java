package com.taxibooking.driver.FCM;
/**
 *@Developer android
 *@Company android
 **/
import android.util.Log;

import com.taxibooking.driver.Helper.SharedHelper;
import com.taxibooking.driver.Utilities.Utilities;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName();
    Utilities utils = new Utilities();

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        SharedHelper.putKey(getApplicationContext(),"device_token",""+refreshedToken);
        Log.d(TAG, "onTokenRefresh: ");
        utils.print(TAG, "onTokenRefresh" + refreshedToken);
    }
}
