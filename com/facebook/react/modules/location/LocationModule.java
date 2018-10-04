package com.facebook.react.modules.location;

import X.AnonymousClass0Df;
import X.AnonymousClass0OR;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.SystemClock;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

@ReactModule(name = "LocationObserver")
public class LocationModule extends ReactContextBaseJavaModule {
    private static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    private final LocationListener mLocationListener = new C01701();
    private String mWatchedProvider;

    /* renamed from: com.facebook.react.modules.location.LocationModule$1 */
    public final class C01701 implements LocationListener {
        public final void onProviderDisabled(String str) {
        }

        public final void onProviderEnabled(String str) {
        }

        public final void onLocationChanged(Location location) {
            ((RCTDeviceEventEmitter) LocationModule.this.getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("geolocationDidChange", LocationModule.locationToMap(location));
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
            LocationModule locationModule;
            int i2;
            StringBuilder stringBuilder;
            if (i == 0) {
                locationModule = LocationModule.this;
                i2 = PositionError.POSITION_UNAVAILABLE;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Provider ");
                stringBuilder.append(str);
                stringBuilder.append(" is out of service.");
                LocationModule.emitError(locationModule, i2, stringBuilder.toString());
            } else if (i == 1) {
                locationModule = LocationModule.this;
                i2 = PositionError.TIMEOUT;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Provider ");
                stringBuilder.append(str);
                stringBuilder.append(" is temporarily unavailable.");
                LocationModule.emitError(locationModule, i2, stringBuilder.toString());
            }
        }
    }

    public final class LocationOptions {
        public final float distanceFilter;
        public final boolean highAccuracy;
        public final double maximumAge;
        public final long timeout;

        private LocationOptions(long j, double d, boolean z, float f) {
            this.timeout = j;
            this.maximumAge = d;
            this.highAccuracy = z;
            this.distanceFilter = f;
        }

        public static LocationOptions fromReactMap(ReadableMap readableMap) {
            long j = readableMap.hasKey("timeout") ? (long) readableMap.getDouble("timeout") : Long.MAX_VALUE;
            double d = readableMap.hasKey("maximumAge") ? readableMap.getDouble("maximumAge") : Double.POSITIVE_INFINITY;
            boolean z = readableMap.hasKey("enableHighAccuracy") && readableMap.getBoolean("enableHighAccuracy");
            return new LocationOptions(j, d, z, readableMap.hasKey("distanceFilter") ? (float) readableMap.getDouble("distanceFilter") : 1120403456);
        }
    }

    public final class SingleUpdateRequest {
        public final Callback mError;
        public final Handler mHandler = new Handler();
        public final LocationListener mLocationListener = new C01722();
        public final LocationManager mLocationManager;
        public Location mOldLocation;
        private final String mProvider;
        public final Callback mSuccess;
        private final long mTimeout;
        public final Runnable mTimeoutRunnable = new C01711();
        public boolean mTriggered;

        /* renamed from: com.facebook.react.modules.location.LocationModule$SingleUpdateRequest$1 */
        public final class C01711 implements Runnable {
            public final void run() {
                synchronized (SingleUpdateRequest.this) {
                    if (!SingleUpdateRequest.this.mTriggered) {
                        SingleUpdateRequest.this.mError.invoke(new Object[]{PositionError.buildError(PositionError.TIMEOUT, "Location request timed out")});
                        SingleUpdateRequest.this.mLocationManager.removeUpdates(SingleUpdateRequest.this.mLocationListener);
                        String str = "ReactNative";
                        String str2 = "LocationModule: Location request timed out";
                        if (AnonymousClass0Df.f1895B.wX(4)) {
                            AnonymousClass0Df.f1895B.kV(str, str2);
                        }
                        SingleUpdateRequest.this.mTriggered = true;
                    }
                }
            }
        }

        /* renamed from: com.facebook.react.modules.location.LocationModule$SingleUpdateRequest$2 */
        public final class C01722 implements LocationListener {
            public final void onProviderDisabled(String str) {
            }

            public final void onProviderEnabled(String str) {
            }

            public final void onStatusChanged(String str, int i, Bundle bundle) {
            }

            public final void onLocationChanged(Location location) {
                synchronized (SingleUpdateRequest.this) {
                    if (!SingleUpdateRequest.this.mTriggered && SingleUpdateRequest.isBetterLocation(SingleUpdateRequest.this, location, SingleUpdateRequest.this.mOldLocation)) {
                        SingleUpdateRequest.this.mSuccess.invoke(new Object[]{LocationModule.locationToMap(location)});
                        AnonymousClass0OR.G(SingleUpdateRequest.this.mHandler, SingleUpdateRequest.this.mTimeoutRunnable, 1642269450);
                        SingleUpdateRequest.this.mTriggered = true;
                        SingleUpdateRequest.this.mLocationManager.removeUpdates(SingleUpdateRequest.this.mLocationListener);
                    }
                    SingleUpdateRequest.this.mOldLocation = location;
                }
            }
        }

        public SingleUpdateRequest(LocationManager locationManager, String str, long j, Callback callback, Callback callback2) {
            this.mLocationManager = locationManager;
            this.mProvider = str;
            this.mTimeout = j;
            this.mSuccess = callback;
            this.mError = callback2;
        }

        public final void invoke(Location location) {
            this.mOldLocation = location;
            this.mLocationManager.requestLocationUpdates(this.mProvider, 100, 1.0f, this.mLocationListener);
            AnonymousClass0OR.F(this.mHandler, this.mTimeoutRunnable, this.mTimeout, 2109315860);
        }

        public static boolean isBetterLocation(SingleUpdateRequest singleUpdateRequest, Location location, Location location2) {
            if (location2 != null) {
                long time = location.getTime() - location2.getTime();
                Object obj = time > 120000 ? 1 : null;
                Object obj2 = time < -120000 ? 1 : null;
                Object obj3 = time > 0 ? 1 : null;
                if (obj == null) {
                    if (obj2 == null) {
                        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
                        Object obj4 = accuracy > 0 ? 1 : null;
                        obj = accuracy < 0 ? 1 : null;
                        obj2 = accuracy > 200 ? 1 : null;
                        boolean isSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
                        if (obj == null) {
                            if (obj3 == null || obj4 != null) {
                                if (obj3 != null && obj2 == null && isSameProvider) {
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        }

        private static boolean isSameProvider(String str, String str2) {
            if (str != null) {
                return str.equals(str2);
            }
            return str2 == null ? true : null;
        }
    }

    public String getName() {
        return "LocationObserver";
    }

    public LocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void emitError(LocationModule locationModule, int i, String str) {
        ((RCTDeviceEventEmitter) locationModule.getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("geolocationError", PositionError.buildError(i, str));
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        LocationOptions fromReactMap = LocationOptions.fromReactMap(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, fromReactMap.highAccuracy);
            if (validProvider == null) {
                callback2.invoke(new Object[]{PositionError.buildError(PositionError.POSITION_UNAVAILABLE, "No location provider available.")});
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || ((double) (SystemClock.currentTimeMillis() - lastKnownLocation.getTime())) >= fromReactMap.maximumAge) {
                new SingleUpdateRequest(locationManager, validProvider, fromReactMap.timeout, callback, callback2).invoke(lastKnownLocation);
                return;
            }
            callback.invoke(new Object[]{locationToMap(lastKnownLocation)});
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
        }
    }

    private static String getValidProvider(LocationManager locationManager, boolean z) {
        String str = z ? "gps" : "network";
        if (!locationManager.isProviderEnabled(str)) {
            str = str.equals("gps") ? "network" : "gps";
            if (!locationManager.isProviderEnabled(str)) {
                return null;
            }
        }
        return str;
    }

    public static WritableMap locationToMap(Location location) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("latitude", location.getLatitude());
        createMap2.putDouble("longitude", location.getLongitude());
        createMap2.putDouble("altitude", location.getAltitude());
        createMap2.putDouble("accuracy", (double) location.getAccuracy());
        createMap2.putDouble("heading", (double) location.getBearing());
        createMap2.putDouble("speed", (double) location.getSpeed());
        createMap.putMap("coords", createMap2);
        createMap.putDouble("timestamp", (double) location.getTime());
        if (VERSION.SDK_INT >= 18) {
            createMap.putBoolean("mocked", location.isFromMockProvider());
        }
        return createMap;
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        if (!"gps".equals(this.mWatchedProvider)) {
            LocationOptions fromReactMap = LocationOptions.fromReactMap(readableMap);
            try {
                LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
                String validProvider = getValidProvider(locationManager, fromReactMap.highAccuracy);
                if (validProvider == null) {
                    emitError(this, PositionError.POSITION_UNAVAILABLE, "No location provider available.");
                    return;
                }
                if (!validProvider.equals(this.mWatchedProvider)) {
                    locationManager.removeUpdates(this.mLocationListener);
                    locationManager.requestLocationUpdates(validProvider, 1000, fromReactMap.distanceFilter, this.mLocationListener);
                }
                this.mWatchedProvider = validProvider;
            } catch (SecurityException e) {
                throwLocationPermissionMissing(e);
            }
        }
    }

    @ReactMethod
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService("location")).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
    }

    private static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }
}
