package com.facebook.react.views.textinput;

import X.AnonymousClass0LR;
import X.AnonymousClass2q3;
import android.os.Build.VERSION;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.view.MeasureUtil;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements YogaMeasureFunction {
    private EditText mDummyEditText;
    private ReactTextInputLocalData mLocalData;
    private int mMostRecentEventCount;
    private String mPlaceholder;
    private String mText;

    public final boolean isVirtualAnchor() {
        return true;
    }

    public final boolean isYogaLeafNode() {
        return true;
    }

    public ReactTextInputShadowNode() {
        this.mMostRecentEventCount = -1;
        this.mText = null;
        this.mPlaceholder = null;
        this.mTextBreakStrategy = 0;
        initMeasureFunction();
    }

    private ReactTextInputShadowNode(ReactTextInputShadowNode reactTextInputShadowNode) {
        super(reactTextInputShadowNode);
        this.mMostRecentEventCount = -1;
        this.mText = null;
        this.mPlaceholder = null;
        this.mMostRecentEventCount = reactTextInputShadowNode.mMostRecentEventCount;
        this.mText = reactTextInputShadowNode.mText;
        this.mLocalData = reactTextInputShadowNode.mLocalData;
    }

    public final ReactTextInputShadowNode copy() {
        return new ReactTextInputShadowNode(this);
    }

    public final String getPlaceholder() {
        return this.mPlaceholder;
    }

    public final String getText() {
        return this.mText;
    }

    private void initMeasureFunction() {
        setMeasureFunction(this);
    }

    public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) AnonymousClass0LR.D(this.mDummyEditText);
        ReactTextInputLocalData reactTextInputLocalData = this.mLocalData;
        if (reactTextInputLocalData != null) {
            reactTextInputLocalData.apply(editText);
        } else {
            editText.setTextSize(0, (float) (this.mFontSize == -1 ? (int) Math.ceil((double) PixelUtil.toPixelFromSP(14.0f)) : this.mFontSize));
            if (this.mNumberOfLines != -1) {
                editText.setLines(this.mNumberOfLines);
            }
            if (VERSION.SDK_INT >= 23 && editText.getBreakStrategy() != this.mTextBreakStrategy) {
                editText.setBreakStrategy(this.mTextBreakStrategy);
            }
        }
        editText.setHint(getPlaceholder());
        editText.measure(MeasureUtil.getMeasureSpec(f, yogaMeasureMode), MeasureUtil.getMeasureSpec(f2, yogaMeasureMode2));
        return AnonymousClass2q3.B(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    public final ReactTextInputShadowNode mutableCopy(long j) {
        ReactTextInputShadowNode reactTextInputShadowNode = (ReactTextInputShadowNode) super.mutableCopy(j);
        reactTextInputShadowNode.initMeasureFunction();
        ThemedReactContext themedContext = getThemedContext();
        if (themedContext != null) {
            reactTextInputShadowNode.setThemedContext(themedContext);
        }
        return reactTextInputShadowNode;
    }

    public final void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mMostRecentEventCount != -1) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(ReactBaseTextShadowNode.spannedFromShadowNode(this, getText()), this.mMostRecentEventCount, this.mContainsImages, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.mTextAlign, this.mTextBreakStrategy));
        }
    }

    public final void setLocalData(Object obj) {
        AnonymousClass0LR.B(obj instanceof ReactTextInputLocalData);
        this.mLocalData = (ReactTextInputLocalData) obj;
        dirty();
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.mMostRecentEventCount = i;
    }

    public final void setPadding(int i, float f) {
        super.setPadding(i, f);
        markUpdated();
    }

    @ReactProp(name = "placeholder")
    public void setPlaceholder(String str) {
        this.mPlaceholder = str;
        markUpdated();
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.mText = str;
        markUpdated();
    }

    public final void setTextBreakStrategy(String str) {
        if (VERSION.SDK_INT >= 23) {
            if (str != null) {
                if (!"simple".equals(str)) {
                    if ("highQuality".equals(str)) {
                        this.mTextBreakStrategy = 1;
                        return;
                    } else if ("balanced".equals(str)) {
                        this.mTextBreakStrategy = 2;
                        return;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid textBreakStrategy: ");
                        stringBuilder.append(str);
                        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            this.mTextBreakStrategy = 0;
        }
    }

    public final void setThemedContext(ThemedReactContext themedReactContext) {
        super.setThemedContext(themedReactContext);
        EditText editText = new EditText(getThemedContext());
        setDefaultPadding(4, (float) editText.getPaddingStart());
        setDefaultPadding(1, (float) editText.getPaddingTop());
        setDefaultPadding(5, (float) editText.getPaddingEnd());
        setDefaultPadding(3, (float) editText.getPaddingBottom());
        this.mDummyEditText = editText;
        editText.setPadding(0, 0, 0, 0);
        this.mDummyEditText.setLayoutParams(new LayoutParams(-2, -2));
    }
}
