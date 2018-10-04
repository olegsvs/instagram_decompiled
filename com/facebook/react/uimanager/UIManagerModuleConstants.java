package com.facebook.react.uimanager;

import android.widget.ImageView.ScaleType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.events.TouchEventType;
import java.util.Map;

public final class UIManagerModuleConstants {
    public static Map getBubblingEventTypeConstants() {
        String str = "phasedRegistrationNames";
        String str2 = "bubbled";
        String str3 = "captured";
        return MapBuilder.builder().put("topChange", MapBuilder.of(str, MapBuilder.of(str2, "onChange", str3, "onChangeCapture"))).put("topSelect", MapBuilder.of(str, MapBuilder.of(str2, "onSelect", str3, "onSelectCapture"))).put(TouchEventType.START.getJSEventName(), MapBuilder.of(str, MapBuilder.of(str2, "onTouchStart", str3, "onTouchStartCapture"))).put(TouchEventType.MOVE.getJSEventName(), MapBuilder.of(str, MapBuilder.of(str2, "onTouchMove", str3, "onTouchMoveCapture"))).put(TouchEventType.END.getJSEventName(), MapBuilder.of(str, MapBuilder.of(str2, "onTouchEnd", str3, "onTouchEndCapture"))).put(TouchEventType.CANCEL.getJSEventName(), MapBuilder.of(str, MapBuilder.of(str2, "onTouchCancel", str3, "onTouchCancelCapture"))).build();
    }

    public static Map getConstants() {
        Map newHashMap = MapBuilder.newHashMap();
        newHashMap.put("UIView", MapBuilder.of("ContentMode", MapBuilder.of("ScaleAspectFit", Integer.valueOf(ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ScaleType.CENTER_INSIDE.ordinal()))));
        newHashMap.put("StyleConstants", MapBuilder.of("PointerEventsValues", MapBuilder.of("none", Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        String str = DialogModule.ACTION_DISMISSED;
        String str2 = "itemSelected";
        newHashMap.put("PopupMenu", MapBuilder.of(str, str, str2, str2));
        newHashMap.put("AccessibilityEventTypes", MapBuilder.of("typeWindowStateChanged", Integer.valueOf(32), "typeViewFocused", Integer.valueOf(8), "typeViewClicked", Integer.valueOf(1)));
        return newHashMap;
    }

    public static Map getDirectEventTypeConstants() {
        String str = "registrationName";
        return MapBuilder.builder().put("topContentSizeChange", MapBuilder.of(str, "onContentSizeChange")).put("topLayout", MapBuilder.of(str, "onLayout")).put("topLoadingError", MapBuilder.of(str, "onLoadingError")).put("topLoadingFinish", MapBuilder.of(str, "onLoadingFinish")).put("topLoadingStart", MapBuilder.of(str, "onLoadingStart")).put("topSelectionChange", MapBuilder.of(str, "onSelectionChange")).put("topMessage", MapBuilder.of(str, "onMessage")).put("topScrollBeginDrag", MapBuilder.of(str, "onScrollBeginDrag")).put("topScrollEndDrag", MapBuilder.of(str, "onScrollEndDrag")).put("topScroll", MapBuilder.of(str, "onScroll")).put("topMomentumScrollBegin", MapBuilder.of(str, "onMomentumScrollBegin")).put("topMomentumScrollEnd", MapBuilder.of(str, "onMomentumScrollEnd")).build();
    }
}
