package com.taxibooking.user.Retrofit;
/**
 * @Developer android
 * @Company android
 **/

import org.json.JSONArray;


public interface ResponseListener {
    void getJSONArrayResult(String strTag, JSONArray arrayResponse);
}
