package com.facebook.react.views.scroll;

import X.AnonymousClass0LR;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import java.util.Map;

public final class ReactScrollViewCommandHelper {

    public interface ScrollCommandHandler {
        void flashScrollIndicators(Object obj);

        void scrollTo(Object obj, ScrollToCommandData scrollToCommandData);

        void scrollToEnd(Object obj, ScrollToEndCommandData scrollToEndCommandData);
    }

    public final class ScrollToCommandData {
        public final boolean mAnimated;
        public final int mDestX;
        public final int mDestY;

        public ScrollToCommandData(int i, int i2, boolean z) {
            this.mDestX = i;
            this.mDestY = i2;
            this.mAnimated = z;
        }
    }

    public final class ScrollToEndCommandData {
        public final boolean mAnimated;

        public ScrollToEndCommandData(boolean z) {
            this.mAnimated = z;
        }
    }

    public static Map getCommandsMap() {
        return MapBuilder.of("scrollTo", Integer.valueOf(1), "scrollToEnd", Integer.valueOf(2), "flashScrollIndicators", Integer.valueOf(3));
    }

    public static void receiveCommand(ScrollCommandHandler scrollCommandHandler, Object obj, int i, ReadableArray readableArray) {
        AnonymousClass0LR.D(scrollCommandHandler);
        AnonymousClass0LR.D(obj);
        AnonymousClass0LR.D(readableArray);
        switch (i) {
            case 1:
                scrollCommandHandler.scrollTo(obj, new ScrollToCommandData(Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), readableArray.getBoolean(2)));
                return;
            case 2:
                scrollCommandHandler.scrollToEnd(obj, new ScrollToEndCommandData(readableArray.getBoolean(0)));
                return;
            case 3:
                scrollCommandHandler.flashScrollIndicators(obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), scrollCommandHandler.getClass().getSimpleName()}));
        }
    }
}
