package com.instagram.ui.widget.textview;

import X.AnonymousClass0uT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class ComposerAutoCompleteTextView extends IgAutoCompleteTextView {
    /* renamed from: B */
    private boolean f13036B;
    /* renamed from: C */
    private AnonymousClass0uT f13037C;

    public ComposerAutoCompleteTextView(Context context) {
        super(context);
    }

    public ComposerAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComposerAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f13036B) {
            return super.onCreateInputConnection(editorInfo);
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = editorInfo.imeOptions & 255;
        if ((i & 4) != 0) {
            editorInfo.imeOptions = i ^ editorInfo.imeOptions;
            editorInfo.imeOptions |= 4;
        }
        if ((editorInfo.imeOptions & 1073741824) != 0) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyPreIme(int r4, android.view.KeyEvent r5) {
        /*
        r3 = this;
        r2 = 0;
        r1 = 1;
        r0 = 4;
        if (r4 != r0) goto L_0x000d;
    L_0x0005:
        r0 = r5.getAction();
        if (r0 != r1) goto L_0x000d;
    L_0x000b:
        r0 = 1;
        goto L_0x000e;
    L_0x000d:
        r0 = 0;
    L_0x000e:
        if (r0 == 0) goto L_0x001a;
    L_0x0010:
        r0 = r3.f13037C;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r0.Fe();
        if (r0 != 0) goto L_0x0020;
    L_0x001a:
        r0 = super.onKeyPreIme(r4, r5);
        if (r0 == 0) goto L_0x0021;
    L_0x0020:
        r2 = 1;
    L_0x0021:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.textview.ComposerAutoCompleteTextView.onKeyPreIme(int, android.view.KeyEvent):boolean");
    }

    public void setAllowNewlines(boolean z) {
        this.f13036B = z;
        setInputType(getInputType() | 131072);
    }

    public void setBackButtonListener(AnonymousClass0uT anonymousClass0uT) {
        this.f13037C = anonymousClass0uT;
    }
}
