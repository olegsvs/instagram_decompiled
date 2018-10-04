package com.instagram.ui.widget.searchedittext;

import X.AnonymousClass2I9;
import X.AnonymousClass2IA;
import X.AnonymousClass2Lt;
import X.AnonymousClass2Lu;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class SearchWithDeleteEditText extends SearchEditText implements AnonymousClass2I9 {
    /* renamed from: B */
    private AnonymousClass2Lu f31692B;

    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public SearchWithDeleteEditText(Context context) {
        super(context);
    }

    public SearchWithDeleteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchWithDeleteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    private boolean m16538B() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r3.getContext();	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r0 = "input_method";	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r3 = r1.getSystemService(r0);	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r3 = (android.view.inputmethod.InputMethodManager) r3;	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r1 = android.view.inputmethod.InputMethodManager.class;	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r0 = "mCurId";	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r2 = 1;	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r0.setAccessible(r2);	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r1 = r0.get(r3);	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r1 = (java.lang.String) r1;	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        if (r1 == 0) goto L_0x0029;	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
    L_0x0020:
        r0 = "com.google.";	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        r0 = r1.startsWith(r0);	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
        if (r0 == 0) goto L_0x0029;	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
    L_0x0028:
        return r2;	 Catch:{ IllegalAccessException -> 0x0029, IllegalAccessException -> 0x0029 }
    L_0x0029:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText.B():boolean");
    }

    public final void Xi() {
        AnonymousClass2Lu anonymousClass2Lu = this.f31692B;
        if (anonymousClass2Lu != null) {
            anonymousClass2Lu.Yi(this);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (m16538B()) {
            return super.onCreateInputConnection(editorInfo);
        }
        editorInfo.inputType = 0;
        if (onCheckIsTextEditor()) {
            return new AnonymousClass2IA(new AnonymousClass2Lt(this, this, false), false, this);
        }
        return null;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            AnonymousClass2Lu anonymousClass2Lu = this.f31692B;
            if (anonymousClass2Lu != null) {
                anonymousClass2Lu.Yi(this);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setOnDeleteKeyListener(AnonymousClass2Lu anonymousClass2Lu) {
        this.f31692B = anonymousClass2Lu;
    }
}
