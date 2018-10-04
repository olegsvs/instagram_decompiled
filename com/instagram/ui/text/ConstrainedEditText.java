package com.instagram.ui.text;

import X.AnonymousClass0Nm;
import X.AnonymousClass0Qd;
import X.AnonymousClass0cQ;
import X.AnonymousClass0mE;
import X.AnonymousClass2JW;
import X.AnonymousClass2Ja;
import X.AnonymousClass2Jb;
import X.AnonymousClass2bp;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

public class ConstrainedEditText extends EditText implements AnonymousClass0Qd {
    /* renamed from: B */
    public final List f28826B;
    /* renamed from: C */
    public int f28827C;
    /* renamed from: D */
    public int f28828D;
    /* renamed from: E */
    private boolean f28829E;
    /* renamed from: F */
    private int f28830F;
    /* renamed from: G */
    private String[] f28831G;

    public ConstrainedEditText(Context context) {
        this(context, null);
    }

    public ConstrainedEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConstrainedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28826B = new ArrayList();
    }

    /* renamed from: A */
    public final void m15009A(AnonymousClass2JW anonymousClass2JW) {
        this.f28826B.add(anonymousClass2JW);
    }

    /* renamed from: B */
    public static void m15008B(ConstrainedEditText constrainedEditText) {
        if (AnonymousClass0mE.I(constrainedEditText) && constrainedEditText.getLayout() != null) {
            int I = ((AnonymousClass0Nm.I(constrainedEditText.getContext()) - constrainedEditText.f28828D) - constrainedEditText.f28827C) - (constrainedEditText.f28829E ? constrainedEditText.f28830F : 0);
            constrainedEditText.setY((float) (constrainedEditText.f28828D + ((I - constrainedEditText.getHeight()) / 2)));
            float min = Math.min(1.0f, ((float) I) / ((float) constrainedEditText.getHeight()));
            constrainedEditText.setScaleX(min);
            constrainedEditText.setScaleY(min);
        }
    }

    public final void Sp(int i, boolean z) {
        if (i > 0) {
            if (!TextUtils.isEmpty(getText())) {
                setSelection(getText().length());
            }
        } else if (i < this.f28830F) {
            clearFocus();
            for (AnonymousClass2JW Pp : this.f28826B) {
                Pp.Pp();
            }
        }
        this.f28829E = z;
        this.f28830F = i;
        m15008B(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        String[] strArr = this.f28831G;
        if (strArr != null) {
            if (strArr.length != 0) {
                return AnonymousClass2Ja.m15013B(onCreateInputConnection, editorInfo, strArr, new AnonymousClass2bp(this));
            }
        }
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m15008B(this);
    }

    public final void onMeasure(int i, int i2) {
        int N = AnonymousClass0cQ.N(this, -86923528);
        super.onMeasure(i, i2);
        if (!TextUtils.isEmpty(getText())) {
            setMeasuredDimension(getMeasuredWidth(), (AnonymousClass2Jb.m15015C(getLayout()) + getPaddingTop()) + getPaddingBottom());
        }
        AnonymousClass0cQ.O(this, -1144488127, N);
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.f28826B != null) {
            for (int i3 = 0; i3 < this.f28826B.size(); i3++) {
                ((AnonymousClass2JW) this.f28826B.get(i3)).Wz(this, i, i2);
            }
        }
    }

    public void setSupportedContentMimeTypes(String... strArr) {
        this.f28831G = strArr;
    }
}
