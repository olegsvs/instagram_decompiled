package com.instagram.react.views.maps;

import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.android.maps.model.LatLng;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.maps.ui.IgStaticMapView;
import java.util.Locale;

public class IgStaticMapViewManager extends SimpleViewManager {
    private static final String LATITUDE_KEY = "latitude";
    private static final String LONGITUDE_KEY = "longitude";
    private static final String RADIUS_IN_METERS_KEY = "radiusInMeters";
    private static final String REACT_CLASS = "IgStaticMap";

    public String getName() {
        return REACT_CLASS;
    }

    public IgStaticMapView createViewInstance(ThemedReactContext themedReactContext) {
        return new IgStaticMapView(themedReactContext);
    }

    @ReactProp(name = "region")
    public void setRegion(IgStaticMapView igStaticMapView, ReadableMap readableMap) {
        double d = readableMap.getDouble(LATITUDE_KEY);
        double d2 = readableMap.getDouble(LONGITUDE_KEY);
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("react_native_map");
        if (readableMap.hasKey(RADIUS_IN_METERS_KEY)) {
            int i = readableMap.getInt(RADIUS_IN_METERS_KEY);
            LatLng latLng = new LatLng(d, d2);
            int i2 = (1 >>> 24) | (1 << 8);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("color:0x");
            Locale locale = Locale.US;
            stringBuilder.append(String.format(locale, "%08X", new Object[]{Integer.valueOf(i2)}).toUpperCase(locale));
            stringBuilder.append('|');
            stringBuilder.append(latLng.f16936B);
            stringBuilder.append(',');
            stringBuilder.append(latLng.f16937C);
            stringBuilder.append('|');
            stringBuilder.append(i);
            stringBuilder.append('m');
            staticMapView$StaticMapOptions.f6690C = stringBuilder.toString();
        } else {
            staticMapView$StaticMapOptions.B(d, d2, "red");
        }
        igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
    }
}
