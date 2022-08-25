<?xml version="1.0" encoding="utf-8"?>  
<manifest xmlns:android="http://schemas.android.com/apk/res/android"  
    package="example.javatpoint.com.qrcodebarcodescanner">  
  
    <uses-feature  
        android:name="android.hardware.camera"  
        android:required="true" />  
  
    <uses-permission android:name="android.permission.CAMERA" />  
    <uses-feature android:name="android.hardware.camera.autofocus" />  
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />  
    <uses-permission android:name="android.permission.INTERNET" />  
  
    <application  
        android:allowBackup="true"  
        android:icon="@mipmap/ic_launcher"  
        android:label="@string/app_name"  
        android:roundIcon="@mipmap/ic_launcher_round"  
        android:supportsRtl="true"  
        android:theme="@style/AppTheme">  
        <activity android:name=".MainActivity">  
            <intent-filter>  
                <action android:name="android.intent.action.MAIN" />  
  
                <category android:name="android.intent.category.LAUNCHER" />  
            </intent-filter>  
        </activity>  
  
        <activity android:name=".ScannedBarcodeActivity" />  
        <activity  
            android:name=".EmailActivity"  
            android:windowSoftInputMode="adjustPan" />  
    </application>  
  
</manifest>  
