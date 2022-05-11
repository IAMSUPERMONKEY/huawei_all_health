package com.supermonkey.hms.flutter.health.hihealth.datastore;

import android.app.Activity;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.huawei.hihealth.error.HiHealthError;
import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.hihealthkit.data.HiHealthKitConstant;
import com.huawei.hihealthkit.data.store.HiHealthDataStore;

import io.flutter.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

public class HiHealthDataStoreHandler implements MethodChannel.MethodCallHandler, PluginRegistry.ActivityResultListener {

    private static final String TAG = "hi_data_store";
    private @Nullable
    Activity mActivity;

    private MethodChannel.Result mResult;

    public HiHealthDataStoreHandler(@Nullable Activity activity) {
        mActivity = activity;
    }

    public void setActivity(@Nullable Activity activity) {
        mActivity = activity;
    }

    @Override
    public void onMethodCall(@NonNull MethodCall call, @NonNull MethodChannel.Result result) {
        if (call.method.equals("startSport")) {
            mResult = result;
            int sportType = call.arguments();
//            int sportType = HiHealthKitConstant.SPORT_TYPE_RUN;
            HiHealthDataStore.startSport(mActivity, sportType, new ResultCallback() {
                @Override
                public void onResult(int resultCode, Object message) {
                    if (resultCode == HiHealthError.SUCCESS) {
                        result.success(null);
                    } else {
                        result.error("" + resultCode, "start sport failed",
                                "" + message);
                    }
                }
            });
        } else if (call.method.equals("stopSport")) {
            HiHealthDataStore.stopSport(mActivity, (resultCode, message) -> {
                if (resultCode == HiHealthError.SUCCESS) {
                    result.success(null);
                } else {
                    result.error("" + resultCode, "stop sport failed",
                            "" + message);
                }
            });
        }

    }

    @Override
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        return false;
    }
}
