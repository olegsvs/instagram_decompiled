package com.facebook.react.uimanager;

import android.os.Build.VERSION;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AccessibilityDelegateUtil.AccessibilityRole;
import com.facebook.react.uimanager.MatrixMathHelper.MatrixDecompositionContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.util.ReactFindViewUtil;

public abstract class BaseViewManager extends ViewManager {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String PROP_ACCESSIBILITY_COMPONENT_TYPE = "accessibilityComponentType";
    private static final String PROP_ACCESSIBILITY_HINT = "accessibilityHint";
    private static final String PROP_ACCESSIBILITY_LABEL = "accessibilityLabel";
    private static final String PROP_ACCESSIBILITY_LIVE_REGION = "accessibilityLiveRegion";
    private static final String PROP_ACCESSIBILITY_ROLE = "accessibilityRole";
    private static final String PROP_ACCESSIBILITY_STATES = "accessibilityStates";
    private static final String PROP_BACKGROUND_COLOR = "backgroundColor";
    private static final String PROP_ELEVATION = "elevation";
    private static final String PROP_IMPORTANT_FOR_ACCESSIBILITY = "importantForAccessibility";
    public static final String PROP_NATIVE_ID = "nativeID";
    private static final String PROP_RENDER_TO_HARDWARE_TEXTURE = "renderToHardwareTextureAndroid";
    private static final String PROP_ROTATION = "rotation";
    private static final String PROP_SCALE_X = "scaleX";
    private static final String PROP_SCALE_Y = "scaleY";
    public static final String PROP_TEST_ID = "testID";
    private static final String PROP_TRANSFORM = "transform";
    private static final String PROP_TRANSLATE_X = "translateX";
    private static final String PROP_TRANSLATE_Y = "translateY";
    private static final String PROP_Z_INDEX = "zIndex";
    private static MatrixDecompositionContext sMatrixDecompositionContext = new MatrixDecompositionContext();
    private static double[] sTransformDecompositionArray = new double[16];

    public void onAfterUpdateTransaction(View view) {
        super.onAfterUpdateTransaction(view);
        updateViewAccessibility(view);
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
        view.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    @ReactProp(name = "accessibilityComponentType")
    public void setAccessibilityComponentType(View view, String str) {
        AccessibilityHelper.updateAccessibilityComponentType(view, str);
    }

    @ReactProp(name = "accessibilityHint")
    public void setAccessibilityHint(View view, String str) {
        view.setTag(C0164R.id.accessibility_hint, str);
    }

    @ReactProp(name = "accessibilityLabel")
    public void setAccessibilityLabel(View view, String str) {
        view.setContentDescription(str);
    }

    @ReactProp(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(View view, String str) {
        if (VERSION.SDK_INT >= 19) {
            if (str != null) {
                if (!str.equals("none")) {
                    if (str.equals("polite")) {
                        view.setAccessibilityLiveRegion(1);
                        return;
                    } else if (str.equals("assertive")) {
                        view.setAccessibilityLiveRegion(2);
                        return;
                    } else {
                        return;
                    }
                }
            }
            view.setAccessibilityLiveRegion(0);
        }
    }

    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(View view, String str) {
        if (str != null) {
            view.setTag(C0164R.id.accessibility_role, AccessibilityRole.fromValue(str));
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(View view, int i) {
        view.setBackgroundColor(i);
    }

    @ReactProp(name = "elevation")
    public void setElevation(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(PixelUtil.toPixelFromDIP(f));
        }
    }

    @ReactProp(name = "importantForAccessibility")
    public void setImportantForAccessibility(View view, String str) {
        if (str != null) {
            if (!str.equals("auto")) {
                if (str.equals("yes")) {
                    view.setImportantForAccessibility(1);
                    return;
                } else if (str.equals("no")) {
                    view.setImportantForAccessibility(2);
                    return;
                } else if (str.equals("no-hide-descendants")) {
                    view.setImportantForAccessibility(4);
                    return;
                } else {
                    return;
                }
            }
        }
        view.setImportantForAccessibility(0);
    }

    @ReactProp(name = "nativeID")
    public void setNativeId(View view, String str) {
        view.setTag(C0164R.id.view_tag_native_id, str);
        ReactFindViewUtil.notifyViewRendered(view);
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(View view, float f) {
        view.setAlpha(f);
    }

    @ReactProp(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(View view, boolean z) {
        view.setLayerType(z ? 2 : 0, null);
    }

    @ReactProp(name = "rotation")
    public void setRotation(View view, float f) {
        view.setRotation(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleX")
    public void setScaleX(View view, float f) {
        view.setScaleX(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleY")
    public void setScaleY(View view, float f) {
        view.setScaleY(f);
    }

    @ReactProp(name = "testID")
    public void setTestId(View view, String str) {
        view.setTag(C0164R.id.react_test_id, str);
        view.setTag(str);
    }

    @ReactProp(name = "transform")
    public void setTransform(View view, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(view);
        } else {
            setTransformProperty(view, readableArray);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        TransformHelper.processTransform(readableArray, sTransformDecompositionArray);
        MatrixMathHelper.decomposeMatrix(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(PixelUtil.toPixelFromDIP((float) sMatrixDecompositionContext.translation[0]));
        view.setTranslationY(PixelUtil.toPixelFromDIP((float) sMatrixDecompositionContext.translation[1]));
        view.setRotation((float) sMatrixDecompositionContext.rotationDegrees[2]);
        view.setRotationX((float) sMatrixDecompositionContext.rotationDegrees[0]);
        view.setRotationY((float) sMatrixDecompositionContext.rotationDegrees[1]);
        view.setScaleX((float) sMatrixDecompositionContext.scale[0]);
        view.setScaleY((float) sMatrixDecompositionContext.scale[1]);
        double[] dArr = sMatrixDecompositionContext.perspective;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            view.setCameraDistance((DisplayMetricsHolder.getScreenDisplayMetrics().density * (-1.0f / f)) * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateX")
    public void setTranslateX(View view, float f) {
        view.setTranslationX(PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateY")
    public void setTranslateY(View view, float f) {
        view.setTranslationY(PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(name = "accessibilityStates")
    public void setViewStates(View view, ReadableArray readableArray) {
        view.setSelected(false);
        view.setEnabled(true);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (string.equals("selected")) {
                    view.setSelected(true);
                } else if (string.equals("disabled")) {
                    view.setEnabled(false);
                }
            }
        }
    }

    @ReactProp(name = "zIndex")
    public void setZIndex(View view, float f) {
        ViewGroupManager.setViewZIndex(view, Math.round(f));
        view = view.getParent();
        if (view != null && (view instanceof ReactZIndexedViewGroup)) {
            ((ReactZIndexedViewGroup) view).updateDrawingOrder();
        }
    }

    private void updateViewAccessibility(View view) {
        AccessibilityDelegateUtil.setDelegate(view);
    }
}
