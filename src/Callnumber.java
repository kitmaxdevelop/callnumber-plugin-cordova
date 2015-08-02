package com.cordova.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/**
 * This class echoes a string called from JavaScript.
 */
public class Callnumber extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException
    {

        if (action.equals("Call"))
        {
            try {
                String toDial = args.getString(0);
                Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(toDial));
                this.cordova.getActivity().startActivity(callIntent);
                callbackContext.success();
            }
            catch(Exception e) {
                callbackContext.error(e.getMessage());
            }
        }
        return true;
    }
}
