package com.facebook.react.views.textinput;

import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

public final class ReactTextInputLocalData {
    private final int mBreakStrategy;
    private final int mInputType;
    private final int mMaxLines;
    private final int mMinLines;
    private final CharSequence mPlaceholder;
    private final SpannableStringBuilder mText;
    private final float mTextSize;

    public ReactTextInputLocalData(EditText editText) {
        this.mText = new SpannableStringBuilder(editText.getText());
        this.mTextSize = editText.getTextSize();
        this.mInputType = editText.getInputType();
        this.mPlaceholder = editText.getHint();
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            this.mMinLines = editText.getMinLines();
            this.mMaxLines = editText.getMaxLines();
        } else {
            this.mMinLines = 1;
            this.mMaxLines = 1;
        }
        if (i >= 23) {
            this.mBreakStrategy = editText.getBreakStrategy();
        } else {
            this.mBreakStrategy = 0;
        }
    }

    public final void apply(EditText editText) {
        editText.setText(this.mText);
        editText.setTextSize(0, this.mTextSize);
        editText.setMinLines(this.mMinLines);
        editText.setMaxLines(this.mMaxLines);
        editText.setInputType(this.mInputType);
        editText.setHint(this.mPlaceholder);
        if (VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.mBreakStrategy);
        }
    }
}
