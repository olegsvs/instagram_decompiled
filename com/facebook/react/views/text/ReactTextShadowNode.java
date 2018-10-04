package com.facebook.react.views.text;

import X.AnonymousClass0LR;
import X.AnonymousClass2q2;
import X.AnonymousClass2q3;
import android.os.Build.VERSION;
import android.text.BoringLayout;
import android.text.BoringLayout.Metrics;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    public static final TextPaint sTextPaintInstance = new TextPaint(1);
    public Spannable mPreparedSpannableText;
    public boolean mShouldNotifyOnTextLayout;
    private final YogaMeasureFunction mTextMeasureFunction = new C01981();

    /* renamed from: com.facebook.react.views.text.ReactTextShadowNode$1 */
    public final class C01981 implements YogaMeasureFunction {
        public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            Object obj;
            Layout staticLayout;
            TextPaint textPaint = ReactTextShadowNode.sTextPaintInstance;
            C01981 c01981 = this;
            Spanned spanned = (Spanned) AnonymousClass0LR.E(ReactTextShadowNode.this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout");
            Metrics isBoring = BoringLayout.isBoring(spanned, textPaint);
            float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spanned, textPaint) : Float.NaN;
            if (yogaMeasureMode != YogaMeasureMode.UNDEFINED) {
                if (f >= 0.0f) {
                    obj = null;
                    if (isBoring != null && (r9 != null || (!AnonymousClass2q2.B(desiredWidth) && desiredWidth <= f))) {
                        int ceil = (int) Math.ceil((double) desiredWidth);
                        if (VERSION.SDK_INT < 23) {
                            staticLayout = new StaticLayout(spanned, textPaint, ceil, Alignment.ALIGN_NORMAL, 1.0f, null, ReactTextShadowNode.this.mIncludeFontPadding);
                        } else {
                            staticLayout = Builder.obtain(spanned, 0, spanned.length(), textPaint, ceil).setAlignment(Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(1).build();
                        }
                    } else if (isBoring == null && (r9 != null || ((float) isBoring.width) <= f)) {
                        staticLayout = BoringLayout.make(spanned, textPaint, isBoring.width, Alignment.ALIGN_NORMAL, 1.0f, null, isBoring, ReactTextShadowNode.this.mIncludeFontPadding);
                    } else if (VERSION.SDK_INT >= 23) {
                        staticLayout = new StaticLayout(spanned, textPaint, (int) f, Alignment.ALIGN_NORMAL, 1.0f, null, ReactTextShadowNode.this.mIncludeFontPadding);
                    } else {
                        staticLayout = Builder.obtain(spanned, 0, spanned.length(), textPaint, (int) f).setAlignment(Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(1).build();
                    }
                    if (ReactTextShadowNode.this.mShouldNotifyOnTextLayout) {
                        WritableArray fontMetrics = FontMetricsUtil.getFontMetrics(spanned, staticLayout, textPaint, ReactTextShadowNode.this.getThemedContext());
                        WritableMap createMap = Arguments.createMap();
                        createMap.putArray("lines", fontMetrics);
                        ((RCTEventEmitter) ReactTextShadowNode.this.getThemedContext().getJSModule(RCTEventEmitter.class)).receiveEvent(ReactTextShadowNode.this.getReactTag(), "topTextLayout", createMap);
                    }
                    if (ReactTextShadowNode.this.mNumberOfLines != -1 || ReactTextShadowNode.this.mNumberOfLines >= staticLayout.getLineCount()) {
                        return AnonymousClass2q3.B(staticLayout.getWidth(), staticLayout.getHeight());
                    }
                    return AnonymousClass2q3.B(staticLayout.getWidth(), staticLayout.getLineBottom(ReactTextShadowNode.this.mNumberOfLines - 1));
                }
            }
            obj = 1;
            if (isBoring != null) {
            }
            if (isBoring == null) {
            }
            if (VERSION.SDK_INT >= 23) {
                staticLayout = Builder.obtain(spanned, 0, spanned.length(), textPaint, (int) f).setAlignment(Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(1).build();
            } else {
                staticLayout = new StaticLayout(spanned, textPaint, (int) f, Alignment.ALIGN_NORMAL, 1.0f, null, ReactTextShadowNode.this.mIncludeFontPadding);
            }
            if (ReactTextShadowNode.this.mShouldNotifyOnTextLayout) {
                WritableArray fontMetrics2 = FontMetricsUtil.getFontMetrics(spanned, staticLayout, textPaint, ReactTextShadowNode.this.getThemedContext());
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putArray("lines", fontMetrics2);
                ((RCTEventEmitter) ReactTextShadowNode.this.getThemedContext().getJSModule(RCTEventEmitter.class)).receiveEvent(ReactTextShadowNode.this.getReactTag(), "topTextLayout", createMap2);
            }
            if (ReactTextShadowNode.this.mNumberOfLines != -1) {
            }
            return AnonymousClass2q3.B(staticLayout.getWidth(), staticLayout.getHeight());
        }
    }

    public final boolean isVirtualAnchor() {
        return true;
    }

    public ReactTextShadowNode() {
        initMeasureFunction();
    }

    private ReactTextShadowNode(ReactTextShadowNode reactTextShadowNode) {
        super(reactTextShadowNode);
        this.mPreparedSpannableText = reactTextShadowNode.mPreparedSpannableText;
    }

    public final LayoutShadowNode copy() {
        return new ReactTextShadowNode(this);
    }

    private int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        return i == 3 ? 5 : i;
    }

    private void initMeasureFunction() {
        if (!isVirtual()) {
            setMeasureFunction(this.mTextMeasureFunction);
        }
    }

    public final void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    public final ReactShadowNodeImpl mutableCopy(long j) {
        this = (ReactTextShadowNode) super.mutableCopy(j);
        initMeasureFunction();
        return this;
    }

    public final void onBeforeLayout() {
        this.mPreparedSpannableText = ReactBaseTextShadowNode.spannedFromShadowNode(this, null);
        markUpdated();
    }

    public final void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        Spannable spannable = this.mPreparedSpannableText;
        if (spannable != null) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannable, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), getTextAlign(), this.mTextBreakStrategy));
        }
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.mShouldNotifyOnTextLayout = z;
    }
}
