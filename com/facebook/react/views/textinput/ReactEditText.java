package com.facebook.react.views.textinput;

import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.text.CustomStyleSpan;
import com.facebook.react.views.text.ReactTagSpan;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.TextInlineImageSpan;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import java.util.ArrayList;

public final class ReactEditText extends EditText {
    public static final KeyListener sKeyListener = QwertyKeyListener.getInstanceForFullKeyboard();
    private Boolean mBlurOnSubmit;
    private boolean mContainsImages;
    private ContentSizeWatcher mContentSizeWatcher;
    private int mDefaultGravityHorizontal;
    private int mDefaultGravityVertical;
    private boolean mDetectScrollMovement = false;
    private boolean mDisableFullscreen;
    private final InputMethodManager mInputMethodManager;
    private boolean mIsJSSettingFocus;
    public boolean mIsSettingTextFromJS;
    private final InternalKeyListener mKeyListener;
    private float mLetterSpacingPt = 0.0f;
    public ArrayList mListeners;
    private int mMostRecentEventCount;
    private int mNativeEventCount;
    private boolean mOnKeyPress = false;
    private ReactViewBackgroundManager mReactBackgroundManager;
    private String mReturnKeyType;
    private ScrollWatcher mScrollWatcher;
    private SelectionWatcher mSelectionWatcher;
    private int mStagedInputType;
    private TextWatcherDelegator mTextWatcherDelegator;

    public final class InternalKeyListener implements KeyListener {
        private int mInputType = 0;

        public final void clearMetaKeyState(View view, Editable editable, int i) {
            ReactEditText.sKeyListener.clearMetaKeyState(view, editable, i);
        }

        public final int getInputType() {
            return this.mInputType;
        }

        public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyDown(view, editable, i, keyEvent);
        }

        public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyOther(view, editable, keyEvent);
        }

        public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyUp(view, editable, i, keyEvent);
        }

        public final void setInputType(int i) {
            this.mInputType = i;
        }
    }

    public final class TextWatcherDelegator implements TextWatcher {
        public final void afterTextChanged(Editable editable) {
            if (!ReactEditText.this.mIsSettingTextFromJS && ReactEditText.this.mListeners != null) {
                int size = ReactEditText.this.mListeners.size();
                for (int i = 0; i < size; i++) {
                    ((TextWatcher) ReactEditText.this.mListeners.get(i)).afterTextChanged(editable);
                }
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!ReactEditText.this.mIsSettingTextFromJS && ReactEditText.this.mListeners != null) {
                int size = ReactEditText.this.mListeners.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((TextWatcher) ReactEditText.this.mListeners.get(i4)).beforeTextChanged(charSequence, i, i2, i3);
                }
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(ReactEditText.this.mIsSettingTextFromJS || ReactEditText.this.mListeners == null)) {
                int size = ReactEditText.this.mListeners.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((TextWatcher) ReactEditText.this.mListeners.get(i4)).onTextChanged(charSequence, i, i2, i3);
                }
            }
            ReactEditText.onContentSizeChange(ReactEditText.this);
        }
    }

    public final boolean isLayoutRequested() {
        return false;
    }

    public ReactEditText(Context context) {
        super(context);
        setFocusableInTouchMode(false);
        this.mReactBackgroundManager = new ReactViewBackgroundManager(this);
        this.mInputMethodManager = (InputMethodManager) AnonymousClass0LR.D(getContext().getSystemService("input_method"));
        this.mDefaultGravityHorizontal = getGravity() & 8388615;
        this.mDefaultGravityVertical = getGravity() & 112;
        this.mNativeEventCount = 0;
        this.mMostRecentEventCount = 0;
        this.mIsSettingTextFromJS = false;
        this.mIsJSSettingFocus = false;
        this.mBlurOnSubmit = null;
        this.mDisableFullscreen = false;
        this.mListeners = null;
        this.mTextWatcherDelegator = null;
        this.mStagedInputType = getInputType();
        this.mKeyListener = new InternalKeyListener();
        this.mScrollWatcher = null;
    }

    public final void addTextChangedListener(TextWatcher textWatcher) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.mListeners.add(textWatcher);
    }

    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        hideSoftKeyboard();
    }

    public final void clearFocusFromJS() {
        clearFocus();
    }

    public final void commitStagedInputType() {
        if (getInputType() != this.mStagedInputType) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.mStagedInputType);
            setSelection(selectionStart, selectionEnd);
        }
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.mBlurOnSubmit;
        if (bool == null) {
            return isMultiline() ^ 1;
        }
        return bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.mDisableFullscreen;
    }

    public String getReturnKeyType() {
        return this.mReturnKeyType;
    }

    public int getStagedInputType() {
        return this.mStagedInputType;
    }

    private TextWatcherDelegator getTextWatcherDelegator() {
        if (this.mTextWatcherDelegator == null) {
            this.mTextWatcherDelegator = new TextWatcherDelegator();
        }
        return this.mTextWatcherDelegator;
    }

    private void hideSoftKeyboard() {
        this.mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final int incrementAndGetEventCounter() {
        int i = this.mNativeEventCount + 1;
        this.mNativeEventCount = i;
        return i;
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Spanned text = getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                if (textInlineImageSpanArr[i].getDrawable() == drawable) {
                    invalidate();
                }
                i++;
            }
        }
        super.invalidateDrawable(drawable);
    }

    private boolean isMultiline() {
        return (getInputType() & 131072) != 0;
    }

    private boolean isSecureText() {
        return (getInputType() & 144) != 0;
    }

    private void manageSpans(SpannableStringBuilder spannableStringBuilder) {
        int i = 0;
        Object[] spans = getText().getSpans(0, length(), Object.class);
        while (i < spans.length) {
            if (ForegroundColorSpan.class.isInstance(spans[i]) || BackgroundColorSpan.class.isInstance(spans[i]) || AbsoluteSizeSpan.class.isInstance(spans[i]) || CustomStyleSpan.class.isInstance(spans[i]) || ReactTagSpan.class.isInstance(spans[i])) {
                getText().removeSpan(spans[i]);
            }
            if ((getText().getSpanFlags(spans[i]) & 33) == 33) {
                Object obj = spans[i];
                int spanStart = getText().getSpanStart(spans[i]);
                int spanEnd = getText().getSpanEnd(spans[i]);
                int spanFlags = getText().getSpanFlags(spans[i]);
                getText().removeSpan(spans[i]);
                if (sameTextForSpan(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
            i++;
        }
    }

    public final void maybeSetText(ReactTextUpdate reactTextUpdate) {
        if (!isSecureText() || !TextUtils.equals(getText(), reactTextUpdate.getText())) {
            int jsEventCounter = reactTextUpdate.getJsEventCounter();
            this.mMostRecentEventCount = jsEventCounter;
            if (jsEventCounter >= this.mNativeEventCount) {
                CharSequence spannableStringBuilder = new SpannableStringBuilder(reactTextUpdate.getText());
                manageSpans(spannableStringBuilder);
                this.mContainsImages = reactTextUpdate.containsImages();
                this.mIsSettingTextFromJS = true;
                getText().replace(0, length(), spannableStringBuilder);
                this.mIsSettingTextFromJS = false;
                if (VERSION.SDK_INT >= 23 && getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                    setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1536873527);
        super.onAttachedToWindow();
        if (this.mContainsImages) {
            Spanned text = getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                textInlineImageSpanArr[i].onAttachedToWindow();
                i++;
            }
        }
        AnonymousClass0cQ.O(this, 1112628646, N);
    }

    public static void onContentSizeChange(ReactEditText reactEditText) {
        ContentSizeWatcher contentSizeWatcher = reactEditText.mContentSizeWatcher;
        if (contentSizeWatcher != null) {
            contentSizeWatcher.onLayout();
        }
        reactEditText.setIntrinsicContentSize();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = (ReactContext) getContext();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.mOnKeyPress) {
            onCreateInputConnection = new ReactEditTextInputConnectionWrapper(onCreateInputConnection, reactContext, this);
        }
        if (isMultiline() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -722712408);
        super.onDetachedFromWindow();
        if (this.mContainsImages) {
            Spanned text = getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                textInlineImageSpanArr[i].onDetachedFromWindow();
                i++;
            }
        }
        AnonymousClass0cQ.O(this, -776997778, N);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages) {
            Spanned text = getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                textInlineImageSpanArr[i].onFinishTemporaryDetach();
                i++;
            }
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int N = AnonymousClass0cQ.N(this, -1637399900);
        super.onFocusChanged(z, i, rect);
        if (z) {
            SelectionWatcher selectionWatcher = this.mSelectionWatcher;
            if (selectionWatcher != null) {
                selectionWatcher.onSelectionChanged(getSelectionStart(), getSelectionEnd());
            }
        }
        AnonymousClass0cQ.O(this, 1883698654, N);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || isMultiline()) {
            return super.onKeyUp(i, keyEvent);
        }
        hideSoftKeyboard();
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onContentSizeChange(this);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ScrollWatcher scrollWatcher = this.mScrollWatcher;
        if (scrollWatcher != null) {
            scrollWatcher.onScrollChanged(i, i2, i3, i4);
        }
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.mSelectionWatcher != null && hasFocus()) {
            this.mSelectionWatcher.onSelectionChanged(i, i2);
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages) {
            Spanned text = getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                textInlineImageSpanArr[i].onStartTemporaryDetach();
                i++;
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 1309634459);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDetectScrollMovement = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            if (this.mDetectScrollMovement) {
                if (!(canScrollVertically(-1) || canScrollVertically(1) || canScrollHorizontally(-1) || canScrollHorizontally(1))) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.mDetectScrollMovement = false;
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, 456844790, M);
        return onTouchEvent;
    }

    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.mListeners.isEmpty()) {
                this.mListeners = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (!this.mIsJSSettingFocus) {
            return false;
        }
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(i, rect);
        showSoftKeyboard();
        return requestFocus;
    }

    public final void requestFocusFromJS() {
        this.mIsJSSettingFocus = true;
        requestFocus();
        this.mIsJSSettingFocus = false;
    }

    private static boolean sameTextForSpan(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i <= spannableStringBuilder.length()) {
            if (i2 <= spannableStringBuilder.length()) {
                while (i < i2) {
                    if (editable.charAt(i) == spannableStringBuilder.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.setBackgroundColor(i);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.mBlurOnSubmit = bool;
    }

    public final void setBorderColor(int i, float f, float f2) {
        this.mReactBackgroundManager.setBorderColor(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.mReactBackgroundManager.setBorderRadius(f);
    }

    public final void setBorderRadius(float f, int i) {
        this.mReactBackgroundManager.setBorderRadius(f, i);
    }

    public void setBorderStyle(String str) {
        this.mReactBackgroundManager.setBorderStyle(str);
    }

    public final void setBorderWidth(int i, float f) {
        this.mReactBackgroundManager.setBorderWidth(i, f);
    }

    public void setContentSizeWatcher(ContentSizeWatcher contentSizeWatcher) {
        this.mContentSizeWatcher = contentSizeWatcher;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.mDisableFullscreen = z;
        updateImeOptions();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.mDefaultGravityHorizontal;
        }
        setGravity(i | ((getGravity() & -8) & -8388616));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.mDefaultGravityVertical;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.mStagedInputType = i;
        super.setTypeface(typeface);
        this.mKeyListener.setInputType(i);
        setKeyListener(this.mKeyListener);
    }

    private void setIntrinsicContentSize() {
        ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), new ReactTextInputLocalData(this));
    }

    public void setLetterSpacingPt(float f) {
        this.mLetterSpacingPt = f;
        updateLetterSpacing();
    }

    public void setOnKeyPress(boolean z) {
        this.mOnKeyPress = z;
    }

    public void setReturnKeyType(String str) {
        this.mReturnKeyType = str;
        updateImeOptions();
    }

    public void setScrollWatcher(ScrollWatcher scrollWatcher) {
        this.mScrollWatcher = scrollWatcher;
    }

    public final void setSelection(int i, int i2) {
        if (this.mMostRecentEventCount >= this.mNativeEventCount) {
            super.setSelection(i, i2);
        }
    }

    public void setSelectionWatcher(SelectionWatcher selectionWatcher) {
        this.mSelectionWatcher = selectionWatcher;
    }

    public void setStagedInputType(int i) {
        this.mStagedInputType = i;
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        updateLetterSpacing();
    }

    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        updateLetterSpacing();
    }

    private boolean showSoftKeyboard() {
        return this.mInputMethodManager.showSoftInput(this, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateImeOptions() {
        /*
        r3 = this;
        r2 = r3.mReturnKeyType;
        r1 = 4;
        if (r2 == 0) goto L_0x0062;
    L_0x0005:
        r0 = r2.hashCode();
        switch(r0) {
            case -1273775369: goto L_0x0049;
            case -906336856: goto L_0x003f;
            case 3304: goto L_0x0035;
            case 3089282: goto L_0x002b;
            case 3377907: goto L_0x0021;
            case 3387192: goto L_0x0017;
            case 3526536: goto L_0x000d;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x0053;
    L_0x000d:
        r0 = "send";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0015:
        r0 = 5;
        goto L_0x0054;
    L_0x0017:
        r0 = "none";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x001f:
        r0 = 2;
        goto L_0x0054;
    L_0x0021:
        r0 = "next";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0029:
        r0 = 1;
        goto L_0x0054;
    L_0x002b:
        r0 = "done";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0033:
        r0 = 6;
        goto L_0x0054;
    L_0x0035:
        r0 = "go";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x003d:
        r0 = 0;
        goto L_0x0054;
    L_0x003f:
        r0 = "search";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0047:
        r0 = 4;
        goto L_0x0054;
    L_0x0049:
        r0 = "previous";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0051:
        r0 = 3;
        goto L_0x0054;
    L_0x0053:
        r0 = -1;
    L_0x0054:
        switch(r0) {
            case 0: goto L_0x0060;
            case 1: goto L_0x005e;
            case 2: goto L_0x005c;
            case 3: goto L_0x005a;
            case 4: goto L_0x0058;
            case 5: goto L_0x0063;
            case 6: goto L_0x0062;
            default: goto L_0x0057;
        };
    L_0x0057:
        goto L_0x0062;
    L_0x0058:
        r1 = 3;
        goto L_0x0063;
    L_0x005a:
        r1 = 7;
        goto L_0x0063;
    L_0x005c:
        r1 = 1;
        goto L_0x0063;
    L_0x005e:
        r1 = 5;
        goto L_0x0063;
    L_0x0060:
        r1 = 2;
        goto L_0x0063;
    L_0x0062:
        r1 = 6;
    L_0x0063:
        r0 = r3.mDisableFullscreen;
        if (r0 == 0) goto L_0x006e;
    L_0x0067:
        r0 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r0 = r0 | r1;
        r3.setImeOptions(r0);
        goto L_0x0071;
    L_0x006e:
        r3.setImeOptions(r1);
    L_0x0071:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactEditText.updateImeOptions():void");
    }

    public final void updateLetterSpacing() {
        if (VERSION.SDK_INT >= 21) {
            setLetterSpacing(PixelUtil.toPixelFromSP(this.mLetterSpacingPt) / getTextSize());
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Spanned text = getText();
            int i = 0;
            TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class);
            int length = textInlineImageSpanArr.length;
            while (i < length) {
                if (textInlineImageSpanArr[i].getDrawable() == drawable) {
                    return true;
                }
                i++;
            }
        }
        return super.verifyDrawable(drawable);
    }
}
