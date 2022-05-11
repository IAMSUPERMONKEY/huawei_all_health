//package com.supermonkey.hms.flutter.health.hihealth;
//
//import android.content.Intent;
//
//import androidx.annotation.NonNull;
//
//import com.huawei.hihealthkit.data.HiHealthExtendScope;
//import com.supermonkey.hms.flutter.health.foundation.constants.Channel;
//import com.supermonkey.hms.flutter.health.hihealth.datastore.HiHealthDataStoreHandler;
//import com.supermonkey.hms.flutter.health.modules.auth.HealthAuthMethodHandler;
//
//import io.flutter.embedding.engine.plugins.FlutterPlugin;
//import io.flutter.embedding.engine.plugins.activity.ActivityAware;
//import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
//import io.flutter.plugin.common.BinaryMessenger;
//import io.flutter.plugin.common.MethodCall;
//import io.flutter.plugin.common.MethodChannel;
//
//public class HiHealthManger implements FlutterPlugin, ActivityAware {
//
//
//    private ActivityPluginBinding mActivityBinding;
//
//    public void initChannels(final BinaryMessenger messenger) {
//
//        setHandlers();
//    }
//
//    private void setHandlers() {
//
//    }
//
//    private void teardownActivity() {
//        ;
//        if (mActivityBinding != null) {
//            mActivityBinding = null;
//        }
//    }
//
//    private void teardownChannels() {
//
//    }
//
//    @Override
//    public void onAttachedToEngine(@NonNull FlutterPluginBinding binding) {
//        initChannels(binding.getBinaryMessenger());
//    }
//
//    @Override
//    public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
//        teardownChannels();
//    }
//
//    @Override
//    public void onAttachedToActivity(@NonNull ActivityPluginBinding binding) {
//        mActivityBinding = binding;
//    }
//
//    @Override
//    public void onDetachedFromActivityForConfigChanges() {
//        teardownActivity();
//    }
//
//    @Override
//    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding binding) {
//        onAttachedToActivity(binding);
//    }
//
//    @Override
//    public void onDetachedFromActivity() {
//        teardownActivity();
//    }
//}
