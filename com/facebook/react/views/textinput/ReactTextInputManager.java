package com.facebook.react.views.textinput;

import X.AnonymousClass0LR;
import X.AnonymousClass2q2;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.text.DefaultStyleValuesUtil;
import com.facebook.react.views.text.ReactFontManager;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.TextInlineImageSpan;
import java.util.LinkedList;
import java.util.Map;

@ReactModule(name = "AndroidTextInput")
public class ReactTextInputManager extends BaseViewManager {
    private static final int BLUR_TEXT_INPUT = 2;
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final int KEYBOARD_TYPE_FLAGS = 12339;
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int[] SPACING_TYPES = new int[]{8, 0, 2, 1, 3};
    private static final int UNSET = -1;

    public final class ReactTextInputTextWatcher implements TextWatcher {
        private ReactEditText mEditText;
        private EventDispatcher mEventDispatcher;
        private String mPreviousText = null;

        public final void afterTextChanged(Editable editable) {
        }

        public ReactTextInputTextWatcher(ReactContext reactContext, ReactEditText reactEditText) {
            this.mEventDispatcher = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.mEditText = reactEditText;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.mPreviousText = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(i3 == 0 && i2 == 0)) {
                AnonymousClass0LR.D(this.mPreviousText);
                int i4 = i;
                String substring = charSequence.toString().substring(i, i + i3);
                int i5 = i + i2;
                String substring2 = this.mPreviousText.substring(i, i5);
                if (i3 != i2 || !substring.equals(substring2)) {
                    this.mEventDispatcher.dispatchEvent(new ReactTextChangedEvent(this.mEditText.getId(), charSequence.toString(), this.mEditText.incrementAndGetEventCounter()));
                    this.mEventDispatcher.dispatchEvent(new ReactTextInputEvent(this.mEditText.getId(), substring, substring2, i4, i5));
                }
            }
        }
    }

    public final class ReactContentSizeWatcher implements ContentSizeWatcher {
        private ReactEditText mEditText;
        private EventDispatcher mEventDispatcher;
        private int mPreviousContentHeight = 0;
        private int mPreviousContentWidth = 0;

        public ReactContentSizeWatcher(ReactEditText reactEditText) {
            this.mEditText = reactEditText;
            this.mEventDispatcher = ((UIManagerModule) ((ReactContext) reactEditText.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        public final void onLayout() {
            int width = this.mEditText.getWidth();
            int height = this.mEditText.getHeight();
            if (this.mEditText.getLayout() != null) {
                width = (this.mEditText.getCompoundPaddingLeft() + this.mEditText.getLayout().getWidth()) + this.mEditText.getCompoundPaddingRight();
                height = (this.mEditText.getCompoundPaddingTop() + this.mEditText.getLayout().getHeight()) + this.mEditText.getCompoundPaddingBottom();
            }
            if (width != this.mPreviousContentWidth || height != this.mPreviousContentHeight) {
                this.mPreviousContentHeight = height;
                this.mPreviousContentWidth = width;
                this.mEventDispatcher.dispatchEvent(new ReactContentSizeChangedEvent(this.mEditText.getId(), PixelUtil.toDIPFromPixel((float) width), PixelUtil.toDIPFromPixel((float) height)));
            }
        }
    }

    public final class ReactScrollWatcher implements ScrollWatcher {
        private EventDispatcher mEventDispatcher;
        private int mPreviousHoriz;
        private int mPreviousVert;
        private ReactEditText mReactEditText;

        public ReactScrollWatcher(ReactEditText reactEditText) {
            this.mReactEditText = reactEditText;
            this.mEventDispatcher = ((UIManagerModule) ((ReactContext) reactEditText.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            int i5 = i;
            int i6 = i2;
            if (this.mPreviousHoriz != i || this.mPreviousVert != i2) {
                this.mEventDispatcher.dispatchEvent(ScrollEvent.obtain(this.mReactEditText.getId(), ScrollEventType.SCROLL, i5, i6, 0.0f, 0.0f, 0, 0, this.mReactEditText.getWidth(), this.mReactEditText.getHeight()));
                this.mPreviousHoriz = i;
                this.mPreviousVert = i2;
            }
        }
    }

    public final class ReactSelectionWatcher implements SelectionWatcher {
        private EventDispatcher mEventDispatcher;
        private int mPreviousSelectionEnd;
        private int mPreviousSelectionStart;
        private ReactEditText mReactEditText;

        public ReactSelectionWatcher(ReactEditText reactEditText) {
            this.mReactEditText = reactEditText;
            this.mEventDispatcher = ((UIManagerModule) ((ReactContext) reactEditText.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        public final void onSelectionChanged(int i, int i2) {
            if (this.mPreviousSelectionStart != i || this.mPreviousSelectionEnd != i2) {
                this.mEventDispatcher.dispatchEvent(new ReactTextInputSelectionEvent(this.mReactEditText.getId(), i, i2));
                this.mPreviousSelectionStart = i;
                this.mPreviousSelectionEnd = i2;
            }
        }
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void addEventEmitters(final ThemedReactContext themedReactContext, final ReactEditText reactEditText) {
        reactEditText.addTextChangedListener(new ReactTextInputTextWatcher(themedReactContext, reactEditText));
        reactEditText.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                EventDispatcher eventDispatcher = ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
                if (z) {
                    eventDispatcher.dispatchEvent(new ReactTextInputFocusEvent(reactEditText.getId()));
                    return;
                }
                eventDispatcher.dispatchEvent(new ReactTextInputBlurEvent(reactEditText.getId()));
                eventDispatcher.dispatchEvent(new ReactTextInputEndEditingEvent(reactEditText.getId(), reactEditText.getText().toString()));
            }
        });
        reactEditText.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if ((i & 255) <= 0) {
                    if (i != 0) {
                        return true;
                    }
                }
                boolean blurOnSubmit = reactEditText.getBlurOnSubmit();
                Object obj = (reactEditText.getInputType() & 131072) != 0 ? 1 : null;
                ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ReactTextInputSubmitEditingEvent(reactEditText.getId(), reactEditText.getText().toString()));
                if (blurOnSubmit) {
                    reactEditText.clearFocus();
                }
                if (blurOnSubmit) {
                    return true;
                }
                if (obj == null) {
                    return true;
                }
                return false;
            }
        });
    }

    private static void checkPasswordType(ReactEditText reactEditText) {
        if ((reactEditText.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (reactEditText.getStagedInputType() & 128) != 0) {
            updateStagedInputTypeFlag(reactEditText, 128, 16);
        }
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode();
    }

    public ReactEditText createViewInstance(ThemedReactContext themedReactContext) {
        ReactEditText reactEditText = new ReactEditText(themedReactContext);
        reactEditText.setInputType(reactEditText.getInputType() & -131073);
        reactEditText.setReturnKeyType("done");
        reactEditText.setTextSize(0, (float) ((int) Math.ceil((double) PixelUtil.toPixelFromSP(14.0f))));
        return reactEditText;
    }

    public Map getCommandsMap() {
        return MapBuilder.of("focusTextInput", Integer.valueOf(1), "blurTextInput", Integer.valueOf(2));
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        String str = "phasedRegistrationNames";
        String str2 = "bubbled";
        String str3 = "captured";
        return MapBuilder.builder().put("topSubmitEditing", MapBuilder.of(str, MapBuilder.of(str2, "onSubmitEditing", str3, "onSubmitEditingCapture"))).put("topEndEditing", MapBuilder.of(str, MapBuilder.of(str2, "onEndEditing", str3, "onEndEditingCapture"))).put("topTextInput", MapBuilder.of(str, MapBuilder.of(str2, "onTextInput", str3, "onTextInputCapture"))).put("topFocus", MapBuilder.of(str, MapBuilder.of(str2, "onFocus", str3, "onFocusCapture"))).put("topBlur", MapBuilder.of(str, MapBuilder.of(str2, "onBlur", str3, "onBlurCapture"))).put("topKeyPress", MapBuilder.of(str, MapBuilder.of(str2, "onKeyPress", str3, "onKeyPressCapture"))).build();
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put(ScrollEventType.SCROLL.getJSEventName(), MapBuilder.of("registrationName", "onScroll")).build();
    }

    public Map getExportedViewConstants() {
        return MapBuilder.of("AutoCapitalizationType", MapBuilder.of("none", Integer.valueOf(0), "characters", Integer.valueOf(DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED), "words", Integer.valueOf(DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED), "sentences", Integer.valueOf(16384)));
    }

    public Class getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    public void onAfterUpdateTransaction(ReactEditText reactEditText) {
        super.onAfterUpdateTransaction(reactEditText);
        reactEditText.commitStagedInputType();
    }

    private static int parseNumericFontWeight(String str) {
        return (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') ? -1 : (str.charAt(0) - 48) * 100;
    }

    public void receiveCommand(ReactEditText reactEditText, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                reactEditText.requestFocusFromJS();
                return;
            case 2:
                reactEditText.clearFocusFromJS();
                return;
            default:
                return;
        }
    }

    @ReactProp(name = "autoCapitalize")
    public void setAutoCapitalize(ReactEditText reactEditText, int i) {
        updateStagedInputTypeFlag(reactEditText, 28672, i);
    }

    @ReactProp(name = "autoCorrect")
    public void setAutoCorrect(ReactEditText reactEditText, Boolean bool) {
        int i = bool != null ? bool.booleanValue() ? 32768 : 524288 : 0;
        updateStagedInputTypeFlag(reactEditText, 557056, i);
    }

    @ReactProp(name = "blurOnSubmit")
    public void setBlurOnSubmit(ReactEditText reactEditText, Boolean bool) {
        reactEditText.setBlurOnSubmit(bool);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ReactEditText reactEditText, int i, Integer num) {
        float f = 1.0E21f;
        float intValue = num == null ? 1.0E21f : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        reactEditText.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactEditText reactEditText, int i, float f) {
        if (!AnonymousClass2q2.B(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactEditText.setBorderRadius(f);
        } else {
            reactEditText.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactEditText reactEditText, String str) {
        reactEditText.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ReactEditText reactEditText, int i, float f) {
        if (!AnonymousClass2q2.B(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        reactEditText.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(ReactEditText reactEditText, boolean z) {
        reactEditText.setCursorVisible(z ^ 1);
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(ReactEditText reactEditText, Integer num) {
        if (num == null) {
            reactEditText.setTextColor(DefaultStyleValuesUtil.getDefaultTextColor(reactEditText.getContext()));
        } else {
            reactEditText.setTextColor(num.intValue());
        }
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(ReactEditText reactEditText, final boolean z) {
        reactEditText.setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                return z;
            }
        });
    }

    private void setCursorColor(com.facebook.react.views.textinput.ReactEditText r5, java.lang.Integer r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r1 = android.widget.TextView.class;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0 = "mCursorDrawableRes";	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0 = r1.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r4 = 1;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0.setAccessible(r4);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r1 = r0.getInt(r5);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        if (r1 != 0) goto L_0x0013;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
    L_0x0012:
        return;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
    L_0x0013:
        r0 = r5.getContext();	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r2 = X.AnonymousClass0Ca.E(r0, r1);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        if (r6 == 0) goto L_0x0026;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
    L_0x001d:
        r1 = r6.intValue();	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r2.setColorFilter(r1, r0);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
    L_0x0026:
        r0 = 2;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r3 = new android.graphics.drawable.Drawable[r0];	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0 = 0;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r3[r0] = r2;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r3[r4] = r2;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r1 = android.widget.TextView.class;	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0 = "mEditor";	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0 = r1.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0.setAccessible(r4);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r2 = r0.get(r5);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r1 = r2.getClass();	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0 = "mCursorDrawable";	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0 = r1.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0.setAccessible(r4);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
        r0.set(r2, r3);	 Catch:{ NoSuchFieldException -> 0x004d, NoSuchFieldException -> 0x004d }
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setCursorColor(com.facebook.react.views.textinput.ReactEditText, java.lang.Integer):void");
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(ReactEditText reactEditText, boolean z) {
        reactEditText.setDisableFullscreenUI(z);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public void setEditable(ReactEditText reactEditText, boolean z) {
        reactEditText.setEnabled(z);
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(ReactEditText reactEditText, String str) {
        reactEditText.setTypeface(ReactFontManager.getInstance().getTypeface(str, reactEditText.getTypeface() != null ? reactEditText.getTypeface().getStyle() : 0, reactEditText.getContext().getAssets()));
    }

    @ReactProp(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(ReactEditText reactEditText, float f) {
        reactEditText.setTextSize(0, (float) ((int) Math.ceil((double) PixelUtil.toPixelFromSP(f))));
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(ReactEditText reactEditText, String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : -1;
        Typeface typeface = reactEditText.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            reactEditText.setTypeface(typeface, i);
        }
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(ReactEditText reactEditText, String str) {
        Typeface typeface;
        int i = -1;
        int parseNumericFontWeight = str != null ? parseNumericFontWeight(str) : -1;
        if (parseNumericFontWeight < StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS) {
            if (!"bold".equals(str)) {
                if ("normal".equals(str) || (parseNumericFontWeight != -1 && parseNumericFontWeight < StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS)) {
                    i = 0;
                }
                typeface = reactEditText.getTypeface();
                if (typeface == null) {
                    typeface = Typeface.DEFAULT;
                }
                if (i != typeface.getStyle()) {
                    reactEditText.setTypeface(typeface, i);
                }
            }
        }
        i = 1;
        typeface = reactEditText.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            reactEditText.setTypeface(typeface, i);
        }
    }

    @ReactProp(name = "inlineImageLeft")
    public void setInlineImageLeft(ReactEditText reactEditText, String str) {
        reactEditText.setCompoundDrawablesWithIntrinsicBounds(ResourceDrawableIdHelper.getInstance().getResourceDrawableId(reactEditText.getContext(), str), 0, 0, 0);
    }

    @ReactProp(name = "inlineImagePadding")
    public void setInlineImagePadding(ReactEditText reactEditText, int i) {
        reactEditText.setCompoundDrawablePadding(i);
    }

    @ReactProp(name = "keyboardType")
    public void setKeyboardType(ReactEditText reactEditText, String str) {
        int i = KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str) ? INPUT_TYPE_KEYBOARD_NUMBERED : KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str) ? 2 : KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str) ? INPUT_TYPE_KEYBOARD_DECIMAL_PAD : KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str) ? 33 : KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str) ? 3 : KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : 1;
        updateStagedInputTypeFlag(reactEditText, KEYBOARD_TYPE_FLAGS, i);
        checkPasswordType(reactEditText);
    }

    @ReactProp(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(ReactEditText reactEditText, float f) {
        reactEditText.setLetterSpacingPt(f);
    }

    @ReactProp(name = "maxLength")
    public void setMaxLength(ReactEditText reactEditText, Integer num) {
        Object filters = reactEditText.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        int i = 0;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                while (i < filters.length) {
                    if (!(filters[i] instanceof LengthFilter)) {
                        linkedList.add(filters[i]);
                    }
                    i++;
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            Object obj = null;
            for (int i2 = 0; i2 < filters.length; i2++) {
                if (filters[i2] instanceof LengthFilter) {
                    filters[i2] = new LengthFilter(num.intValue());
                    obj = 1;
                }
            }
            if (obj == null) {
                inputFilterArr = new InputFilter[(filters.length + 1)];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                filters[filters.length] = new LengthFilter(num.intValue());
            } else {
                inputFilterArr = filters;
            }
        } else {
            inputFilterArr = new InputFilter[]{new LengthFilter(num.intValue())};
        }
        reactEditText.setFilters(inputFilterArr);
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public void setMultiline(ReactEditText reactEditText, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 131072;
        if (z) {
            i = 131072;
        }
        updateStagedInputTypeFlag(reactEditText, i2, i);
    }

    @ReactProp(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(ReactEditText reactEditText, int i) {
        reactEditText.setLines(i);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setContentSizeWatcher(new ReactContentSizeWatcher(reactEditText));
        } else {
            reactEditText.setContentSizeWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(ReactEditText reactEditText, boolean z) {
        reactEditText.setOnKeyPress(z);
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setScrollWatcher(new ReactScrollWatcher(reactEditText));
        } else {
            reactEditText.setScrollWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setSelectionWatcher(new ReactSelectionWatcher(reactEditText));
        } else {
            reactEditText.setSelectionWatcher(null);
        }
    }

    @ReactProp(name = "placeholder")
    public void setPlaceholder(ReactEditText reactEditText, String str) {
        reactEditText.setHint(str);
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(ReactEditText reactEditText, Integer num) {
        if (num == null) {
            reactEditText.setHintTextColor(DefaultStyleValuesUtil.getDefaultTextColorHint(reactEditText.getContext()));
        } else {
            reactEditText.setHintTextColor(num.intValue());
        }
    }

    @ReactProp(name = "returnKeyLabel")
    public void setReturnKeyLabel(ReactEditText reactEditText, String str) {
        reactEditText.setImeActionLabel(str, IME_ACTION_ID);
    }

    @ReactProp(name = "returnKeyType")
    public void setReturnKeyType(ReactEditText reactEditText, String str) {
        reactEditText.setReturnKeyType(str);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(ReactEditText reactEditText, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 144;
        if (z) {
            i = 128;
        }
        updateStagedInputTypeFlag(reactEditText, i2, i);
        checkPasswordType(reactEditText);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setSelectAllOnFocus(z);
    }

    @ReactProp(name = "selection")
    public void setSelection(ReactEditText reactEditText, ReadableMap readableMap) {
        if (readableMap != null && readableMap.hasKey("start") && readableMap.hasKey("end")) {
            reactEditText.setSelection(readableMap.getInt("start"), readableMap.getInt("end"));
        }
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactEditText reactEditText, Integer num) {
        if (num == null) {
            reactEditText.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(reactEditText.getContext()));
        } else {
            reactEditText.setHighlightColor(num.intValue());
        }
        setCursorColor(reactEditText, num);
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(ReactEditText reactEditText, String str) {
        if (str != null) {
            if (!"auto".equals(str)) {
                if (!"left".equals(str)) {
                    if ("right".equals(str)) {
                        reactEditText.setGravityHorizontal(5);
                        return;
                    } else if ("center".equals(str)) {
                        reactEditText.setGravityHorizontal(1);
                        return;
                    } else if (!"justify".equals(str)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid textAlign: ");
                        stringBuilder.append(str);
                        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                    }
                }
                reactEditText.setGravityHorizontal(3);
                return;
            }
        }
        reactEditText.setGravityHorizontal(0);
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(ReactEditText reactEditText, String str) {
        if (str != null) {
            if (!"auto".equals(str)) {
                if ("top".equals(str)) {
                    reactEditText.setGravityVertical(48);
                    return;
                } else if ("bottom".equals(str)) {
                    reactEditText.setGravityVertical(80);
                    return;
                } else if ("center".equals(str)) {
                    reactEditText.setGravityVertical(16);
                    return;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid textAlignVertical: ");
                    stringBuilder.append(str);
                    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        reactEditText.setGravityVertical(0);
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(ReactEditText reactEditText, Integer num) {
        reactEditText = reactEditText.getBackground();
        if (reactEditText.getConstantState() != null) {
            reactEditText = reactEditText.mutate();
        }
        if (num == null) {
            reactEditText.clearColorFilter();
        } else {
            reactEditText.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    public void updateExtraData(ReactEditText reactEditText, Object obj) {
        if (obj instanceof ReactTextUpdate) {
            ReactTextUpdate reactTextUpdate = (ReactTextUpdate) obj;
            reactEditText.setPadding((int) reactTextUpdate.getPaddingLeft(), (int) reactTextUpdate.getPaddingTop(), (int) reactTextUpdate.getPaddingRight(), (int) reactTextUpdate.getPaddingBottom());
            if (reactTextUpdate.containsImages()) {
                TextInlineImageSpan.possiblyUpdateInlineImageSpans(reactTextUpdate.getText(), reactEditText);
            }
            reactEditText.maybeSetText(reactTextUpdate);
        }
    }

    private static void updateStagedInputTypeFlag(ReactEditText reactEditText, int i, int i2) {
        reactEditText.setStagedInputType(((i ^ -1) & reactEditText.getStagedInputType()) | i2);
    }
}
