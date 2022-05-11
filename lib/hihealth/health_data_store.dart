part of huawei_health;

/// 控制运动并获取实时运动数据
class HealthDataStore {
  static const MethodChannel _channel = _healthDataStoreMethodChannel;

  /// 开启运动，穿戴设备将自动进入运动界面；
  static Future<void> startSport(int type) async {
    return await _channel.invokeMethod<void>(
      'startSport',
      type,
    );
  }

  /// 结束运动时，穿戴设备将自动结束运动。
  static Future<void> stopSport() async {
    return await _channel.invokeMethod<void>('stopSport');
  }
}
