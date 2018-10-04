package com.facebook.react.views.text;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.List;

public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    public boolean mAllowFontScaling = true;
    public int mBackgroundColor;
    public int mColor;
    public boolean mContainsImages;
    public String mFontFamily;
    public int mFontSize = -1;
    public float mFontSizeInput = -1.0f;
    public int mFontStyle;
    public int mFontWeight;
    public float mHeightOfTallestInlineImage;
    public boolean mIncludeFontPadding;
    public boolean mIsBackgroundColorSet = false;
    public boolean mIsColorSet = false;
    public boolean mIsLineThroughTextDecorationSet;
    public boolean mIsUnderlineTextDecorationSet;
    public float mLetterSpacing = Float.NaN;
    public float mLetterSpacingInput = Float.NaN;
    public float mLineHeight = Float.NaN;
    public float mLineHeightInput = -1.0f;
    public int mNumberOfLines = -1;
    public int mTextAlign = 0;
    public int mTextBreakStrategy;
    public int mTextShadowColor;
    public float mTextShadowOffsetDx;
    public float mTextShadowOffsetDy;
    public float mTextShadowRadius;
    public TextTransform mTextTransform;

    public final class SetSpanOperation {
        public int end;
        public int start;
        public Object what;

        public SetSpanOperation(int i, int i2, Object obj) {
            this.start = i;
            this.end = i2;
            this.what = obj;
        }

        public final void execute(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.what, this.start, this.end, ((i << 16) & 16711680) | ((this.start == 0 ? 18 : 34) & -16711681));
        }
    }

    public ReactBaseTextShadowNode() {
        this.mTextBreakStrategy = VERSION.SDK_INT < 23 ? 0 : 1;
        this.mTextTransform = TextTransform.UNSET;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 1.0f;
        this.mTextShadowColor = 1426063360;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mContainsImages = false;
        this.mHeightOfTallestInlineImage = Float.NaN;
    }

    public ReactBaseTextShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode) {
        super(reactBaseTextShadowNode);
        this.mTextBreakStrategy = VERSION.SDK_INT < 23 ? 0 : 1;
        this.mTextTransform = TextTransform.UNSET;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 1.0f;
        this.mTextShadowColor = 1426063360;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mContainsImages = false;
        this.mHeightOfTallestInlineImage = Float.NaN;
        this.mLineHeight = reactBaseTextShadowNode.mLineHeight;
        this.mIsColorSet = reactBaseTextShadowNode.mIsColorSet;
        this.mAllowFontScaling = reactBaseTextShadowNode.mAllowFontScaling;
        this.mColor = reactBaseTextShadowNode.mColor;
        this.mIsBackgroundColorSet = reactBaseTextShadowNode.mIsBackgroundColorSet;
        this.mBackgroundColor = reactBaseTextShadowNode.mBackgroundColor;
        this.mNumberOfLines = reactBaseTextShadowNode.mNumberOfLines;
        this.mFontSize = reactBaseTextShadowNode.mFontSize;
        this.mFontSizeInput = reactBaseTextShadowNode.mFontSizeInput;
        this.mLineHeightInput = reactBaseTextShadowNode.mLineHeightInput;
        this.mTextAlign = reactBaseTextShadowNode.mTextAlign;
        this.mTextBreakStrategy = reactBaseTextShadowNode.mTextBreakStrategy;
        this.mTextTransform = reactBaseTextShadowNode.mTextTransform;
        this.mTextShadowOffsetDx = reactBaseTextShadowNode.mTextShadowOffsetDx;
        this.mTextShadowOffsetDy = reactBaseTextShadowNode.mTextShadowOffsetDy;
        this.mTextShadowRadius = reactBaseTextShadowNode.mTextShadowRadius;
        this.mTextShadowColor = reactBaseTextShadowNode.mTextShadowColor;
        this.mIsUnderlineTextDecorationSet = reactBaseTextShadowNode.mIsUnderlineTextDecorationSet;
        this.mIsLineThroughTextDecorationSet = reactBaseTextShadowNode.mIsLineThroughTextDecorationSet;
        this.mIncludeFontPadding = reactBaseTextShadowNode.mIncludeFontPadding;
        this.mFontStyle = reactBaseTextShadowNode.mFontStyle;
        this.mFontWeight = reactBaseTextShadowNode.mFontWeight;
        this.mFontFamily = reactBaseTextShadowNode.mFontFamily;
        this.mContainsImages = reactBaseTextShadowNode.mContainsImages;
        this.mHeightOfTallestInlineImage = reactBaseTextShadowNode.mHeightOfTallestInlineImage;
    }

    private static void buildSpannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List list) {
        int length = spannableStringBuilder.length();
        int childCount = reactBaseTextShadowNode.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ReactShadowNode childAt = reactBaseTextShadowNode.getChildAt(i);
            if (childAt instanceof ReactRawTextShadowNode) {
                spannableStringBuilder.append(((ReactRawTextShadowNode) childAt).getText());
            } else if (childAt instanceof ReactBaseTextShadowNode) {
                buildSpannedFromShadowNode((ReactBaseTextShadowNode) childAt, spannableStringBuilder, list);
            } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                spannableStringBuilder.append("I");
                list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((ReactTextInlineImageShadowNode) childAt).buildInlineImageSpan()));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected view type nested under text node: ");
                stringBuilder.append(childAt.getClass());
                throw new IllegalViewOperationException(stringBuilder.toString());
            }
            childAt.markUpdateSeen();
        }
        int length2 = spannableStringBuilder.length();
        if (length2 >= length) {
            if (reactBaseTextShadowNode.mIsColorSet) {
                list.add(new SetSpanOperation(length, length2, new ForegroundColorSpan(reactBaseTextShadowNode.mColor)));
            }
            if (reactBaseTextShadowNode.mIsBackgroundColorSet) {
                list.add(new SetSpanOperation(length, length2, new BackgroundColorSpan(reactBaseTextShadowNode.mBackgroundColor)));
            }
            if (VERSION.SDK_INT >= 21 && !Float.isNaN(reactBaseTextShadowNode.mLetterSpacing)) {
                list.add(new SetSpanOperation(length, length2, new CustomLetterSpacingSpan(reactBaseTextShadowNode.mLetterSpacing)));
            }
            int i2 = reactBaseTextShadowNode.mFontSize;
            if (i2 != -1) {
                list.add(new SetSpanOperation(length, length2, new AbsoluteSizeSpan(i2)));
            }
            if (!(reactBaseTextShadowNode.mFontStyle == -1 && reactBaseTextShadowNode.mFontWeight == -1 && reactBaseTextShadowNode.mFontFamily == null)) {
                list.add(new SetSpanOperation(length, length2, new CustomStyleSpan(reactBaseTextShadowNode.mFontStyle, reactBaseTextShadowNode.mFontWeight, reactBaseTextShadowNode.mFontFamily, reactBaseTextShadowNode.getThemedContext().getAssets())));
            }
            if (reactBaseTextShadowNode.mIsUnderlineTextDecorationSet) {
                list.add(new SetSpanOperation(length, length2, new UnderlineSpan()));
            }
            if (reactBaseTextShadowNode.mIsLineThroughTextDecorationSet) {
                list.add(new SetSpanOperation(length, length2, new StrikethroughSpan()));
            }
            if (!(reactBaseTextShadowNode.mTextShadowOffsetDx == 0.0f && reactBaseTextShadowNode.mTextShadowOffsetDy == 0.0f)) {
                list.add(new SetSpanOperation(length, length2, new ShadowStyleSpan(reactBaseTextShadowNode.mTextShadowOffsetDx, reactBaseTextShadowNode.mTextShadowOffsetDy, reactBaseTextShadowNode.mTextShadowRadius, reactBaseTextShadowNode.mTextShadowColor)));
            }
            if (!Float.isNaN(reactBaseTextShadowNode.getEffectiveLineHeight())) {
                list.add(new SetSpanOperation(length, length2, new CustomLineHeightSpan(reactBaseTextShadowNode.getEffectiveLineHeight())));
            }
            if (reactBaseTextShadowNode.mTextTransform != TextTransform.UNSET) {
                list.add(new SetSpanOperation(length, length2, new CustomTextTransformSpan(reactBaseTextShadowNode.mTextTransform)));
            }
            list.add(new SetSpanOperation(length, length2, new ReactTagSpan(reactBaseTextShadowNode.getReactTag())));
        }
    }

    public final float getEffectiveLineHeight() {
        Object obj = (Float.isNaN(this.mLineHeight) || Float.isNaN(this.mHeightOfTallestInlineImage) || this.mHeightOfTallestInlineImage <= this.mLineHeight) ? null : 1;
        return obj != null ? this.mHeightOfTallestInlineImage : this.mLineHeight;
    }

    private static int parseNumericFontWeight(String str) {
        return (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') ? -1 : (str.charAt(0) - 48) * 100;
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        if (z != this.mAllowFontScaling) {
            this.mAllowFontScaling = z;
            setFontSize(this.mFontSizeInput);
            setLineHeight(this.mLineHeightInput);
            setLetterSpacing(this.mLetterSpacingInput);
            markUpdated();
        }
    }

    @ReactProp(name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (!isVirtualAnchor()) {
            boolean z = num != null;
            this.mIsBackgroundColorSet = z;
            if (z) {
                this.mBackgroundColor = num.intValue();
            }
            markUpdated();
        }
    }

    @ReactProp(name = "color")
    public void setColor(Integer num) {
        boolean z = num != null;
        this.mIsColorSet = z;
        if (z) {
            this.mColor = num.intValue();
        }
        markUpdated();
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(String str) {
        this.mFontFamily = str;
        markUpdated();
    }

    @ReactProp(defaultFloat = -1.0f, name = "fontSize")
    public void setFontSize(float f) {
        this.mFontSizeInput = f;
        if (f != -1.0f) {
            if (this.mAllowFontScaling) {
                f = (float) Math.ceil((double) PixelUtil.toPixelFromSP(f));
            } else {
                f = (float) Math.ceil((double) PixelUtil.toPixelFromDIP(f));
            }
        }
        this.mFontSize = (int) f;
        markUpdated();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : -1;
        if (i != this.mFontStyle) {
            this.mFontStyle = i;
            markUpdated();
        }
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(String str) {
        int i = -1;
        int parseNumericFontWeight = str != null ? parseNumericFontWeight(str) : -1;
        if (parseNumericFontWeight < StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS) {
            if (!"bold".equals(str)) {
                if ("normal".equals(str) || (parseNumericFontWeight != -1 && parseNumericFontWeight < StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS)) {
                    i = 0;
                }
                if (i != this.mFontWeight) {
                    this.mFontWeight = i;
                    markUpdated();
                }
            }
        }
        i = 1;
        if (i != this.mFontWeight) {
            this.mFontWeight = i;
            markUpdated();
        }
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    @ReactProp(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        float toPixelFromSP;
        this.mLetterSpacingInput = f;
        if (this.mAllowFontScaling) {
            toPixelFromSP = PixelUtil.toPixelFromSP(this.mLetterSpacingInput);
        } else {
            toPixelFromSP = PixelUtil.toPixelFromDIP(this.mLetterSpacingInput);
        }
        this.mLetterSpacing = toPixelFromSP;
        markUpdated();
    }

    @ReactProp(defaultFloat = -1.0f, name = "lineHeight")
    public void setLineHeight(float f) {
        this.mLineHeightInput = f;
        if (f == -1.0f) {
            this.mLineHeight = Float.NaN;
        } else {
            float toPixelFromSP;
            if (this.mAllowFontScaling) {
                toPixelFromSP = PixelUtil.toPixelFromSP(f);
            } else {
                toPixelFromSP = PixelUtil.toPixelFromDIP(f);
            }
            this.mLineHeight = toPixelFromSP;
        }
        markUpdated();
    }

    @ReactProp(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.mNumberOfLines = i;
        markUpdated();
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(String str) {
        if (str != null) {
            if (!"auto".equals(str)) {
                if (!"left".equals(str)) {
                    if ("right".equals(str)) {
                        this.mTextAlign = 5;
                    } else if ("center".equals(str)) {
                        this.mTextAlign = 1;
                    } else if (!"justify".equals(str)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid textAlign: ");
                        stringBuilder.append(str);
                        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                    }
                    markUpdated();
                }
                this.mTextAlign = 3;
                markUpdated();
            }
        }
        this.mTextAlign = 0;
        markUpdated();
    }

    @ReactProp(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (VERSION.SDK_INT >= 23) {
            if (str != null) {
                if (!"highQuality".equals(str)) {
                    if ("simple".equals(str)) {
                        this.mTextBreakStrategy = 0;
                    } else if ("balanced".equals(str)) {
                        this.mTextBreakStrategy = 2;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid textBreakStrategy: ");
                        stringBuilder.append(str);
                        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                    }
                    markUpdated();
                }
            }
            this.mTextBreakStrategy = 1;
            markUpdated();
        }
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        int i = 0;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            String[] split = str.split(" ");
            int length = split.length;
            while (i < length) {
                Object obj = split[i];
                if ("underline".equals(obj)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("line-through".equals(obj)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
                i++;
            }
        }
        markUpdated();
    }

    @ReactProp(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.mTextShadowColor) {
            this.mTextShadowColor = i;
            markUpdated();
        }
    }

    @ReactProp(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.mTextShadowRadius) {
            this.mTextShadowRadius = f;
            markUpdated();
        }
    }

    @ReactProp(name = "textTransform")
    public void setTextTransform(String str) {
        if (str != null) {
            if (!"none".equals(str)) {
                if ("uppercase".equals(str)) {
                    this.mTextTransform = TextTransform.UPPERCASE;
                } else if ("lowercase".equals(str)) {
                    this.mTextTransform = TextTransform.LOWERCASE;
                } else if ("capitalize".equals(str)) {
                    this.mTextTransform = TextTransform.CAPITALIZE;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid textTransform: ");
                    stringBuilder.append(str);
                    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                }
                markUpdated();
            }
        }
        this.mTextTransform = TextTransform.NONE;
        markUpdated();
    }

    public static Spannable spannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, String str) {
        Spannable spannableStringBuilder = new SpannableStringBuilder();
        List<SetSpanOperation> arrayList = new ArrayList();
        buildSpannedFromShadowNode(reactBaseTextShadowNode, spannableStringBuilder, arrayList);
        if (str != null) {
            spannableStringBuilder.append(str);
        }
        int i = 0;
        if (reactBaseTextShadowNode.mFontSize == -1) {
            int ceil;
            if (reactBaseTextShadowNode.mAllowFontScaling) {
                ceil = (int) Math.ceil((double) PixelUtil.toPixelFromSP(14.0f));
            } else {
                ceil = (int) Math.ceil((double) PixelUtil.toPixelFromDIP(14.0f));
            }
            arrayList.add(new SetSpanOperation(0, spannableStringBuilder.length(), new AbsoluteSizeSpan(ceil)));
        }
        reactBaseTextShadowNode.mContainsImages = false;
        reactBaseTextShadowNode.mHeightOfTallestInlineImage = Float.NaN;
        for (SetSpanOperation setSpanOperation : arrayList) {
            if (setSpanOperation.what instanceof TextInlineImageSpan) {
                int height = ((TextInlineImageSpan) setSpanOperation.what).getHeight();
                reactBaseTextShadowNode.mContainsImages = true;
                if (Float.isNaN(reactBaseTextShadowNode.mHeightOfTallestInlineImage) || ((float) height) > reactBaseTextShadowNode.mHeightOfTallestInlineImage) {
                    reactBaseTextShadowNode.mHeightOfTallestInlineImage = (float) height;
                }
            }
            setSpanOperation.execute(spannableStringBuilder, i);
            i++;
        }
        return spannableStringBuilder;
    }
}
