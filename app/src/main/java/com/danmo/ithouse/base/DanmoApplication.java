package com.danmo.ithouse.base;

import android.app.Application;

import com.danmo.commonapi.CommonApi;
import com.danmo.commonutil.CrashHandler;
import com.danmo.commonutil.Utils;

/**
 * Created by user on 2017/9/12.
 */

public class DanmoApplication extends Application {
    public static final String client_id = "7024a413";
    public static final String client_secret = "8404fa33ae48d3014cfa89deaa674e4cbe6ec894a57dbef4e40d083dbbaa5cf4";

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
        Utils.init(this);
        CommonApi.init(this, client_id, client_secret);
    }
}
