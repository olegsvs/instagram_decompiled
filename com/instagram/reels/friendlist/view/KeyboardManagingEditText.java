package com.instagram.reels.friendlist.view;

import X.AnonymousClass0Nm;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

public class KeyboardManagingEditText extends EditText implements OnFocusChangeListener {
    /* renamed from: B */
    private OnFocusChangeListener f60911B;

    public KeyboardManagingEditText(Context context) {
        super(context);
        super.setOnFocusChangeListener(this);
    }

    public KeyboardManagingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnFocusChangeListener(this);
    }

    public KeyboardManagingEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnFocusChangeListener(this);
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            AnonymousClass0Nm.k(this);
        } else {
            AnonymousClass0Nm.N(this);
        }
        this.f60911B.onFocusChange(view, z);
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i != 4 || !isFocused()) {
            return super.onKeyPreIme(i, keyEvent);
        }
        clearFocus();
        return true;
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f60911B = onFocusChangeListener;
    }
}
