package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import java.util.Locale;

@ReactModule(name = "AnimationsDebugModule")
public class AnimationsDebugModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AnimationsDebugModule";
    private final DeveloperSettings mCatalystSettings;
    private FpsDebugFrameCallback mFrameCallback;

    public String getName() {
        return NAME;
    }

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, DeveloperSettings developerSettings) {
        super(reactApplicationContext);
        this.mCatalystSettings = developerSettings;
    }

    public void onCatalystInstanceDestroy() {
        FpsDebugFrameCallback fpsDebugFrameCallback = this.mFrameCallback;
        if (fpsDebugFrameCallback != null) {
            fpsDebugFrameCallback.stop();
            this.mFrameCallback = null;
        }
    }

    @ReactMethod
    public void startRecordingFps() {
        DeveloperSettings developerSettings = this.mCatalystSettings;
        if (developerSettings != null) {
            if (developerSettings.isAnimationFpsDebugEnabled()) {
                if (this.mFrameCallback == null) {
                    FpsDebugFrameCallback fpsDebugFrameCallback = new FpsDebugFrameCallback(ChoreographerCompat.getInstance(), getReactApplicationContext());
                    this.mFrameCallback = fpsDebugFrameCallback;
                    fpsDebugFrameCallback.startAndRecordFpsAtEachFrame();
                    return;
                }
                throw new JSApplicationCausedNativeException("Already recording FPS!");
            }
        }
    }

    @ReactMethod
    public void stopRecordingFps(double d) {
        FpsDebugFrameCallback fpsDebugFrameCallback = this.mFrameCallback;
        if (fpsDebugFrameCallback != null) {
            fpsDebugFrameCallback.stop();
            if (this.mFrameCallback.getFpsInfo((long) d) == null) {
                Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
            } else {
                String format = String.format(Locale.US, "FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(this.mFrameCallback.getFpsInfo((long) d).fps), Integer.valueOf(this.mFrameCallback.getFpsInfo((long) d).totalFrames), Integer.valueOf(this.mFrameCallback.getFpsInfo((long) d).totalExpectedFrames)});
                String format2 = String.format(Locale.US, "JS FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(r6.jsFps), Integer.valueOf(r6.totalJsFrames), Integer.valueOf(r6.totalExpectedFrames)});
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(format);
                String str = "\n";
                stringBuilder.append(str);
                stringBuilder.append(format2);
                stringBuilder.append(str);
                stringBuilder.append("Total Time MS: ");
                stringBuilder.append(String.format(Locale.US, "%d", new Object[]{Integer.valueOf(r6.totalTimeMs)}));
                Toast.makeText(getReactApplicationContext(), stringBuilder.toString(), 1).show();
            }
            this.mFrameCallback = null;
        }
    }
}
