package com.facebook.react.views.art;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

@ReactModule(name = "ARTSurfaceView")
public class ARTSurfaceViewManager extends BaseViewManager {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new C01881();
    public static final String REACT_CLASS = "ARTSurfaceView";

    /* renamed from: com.facebook.react.views.art.ARTSurfaceViewManager$1 */
    public final class C01881 implements YogaMeasureFunction {
        public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void setBackgroundColor(ARTSurfaceView aRTSurfaceView, int i) {
    }

    public ARTSurfaceViewShadowNode createShadowNodeInstance() {
        ReactShadowNodeImpl aRTSurfaceViewShadowNode = new ARTSurfaceViewShadowNode();
        aRTSurfaceViewShadowNode.setMeasureFunction(MEASURE_FUNCTION);
        return aRTSurfaceViewShadowNode;
    }

    public ARTSurfaceView createViewInstance(ThemedReactContext themedReactContext) {
        return new ARTSurfaceView(themedReactContext);
    }

    public Class getShadowNodeClass() {
        return ARTSurfaceViewShadowNode.class;
    }

    public void updateExtraData(ARTSurfaceView aRTSurfaceView, Object obj) {
        aRTSurfaceView.setSurfaceTextureListener((ARTSurfaceViewShadowNode) obj);
    }
}
