package com.instagram.iig.components.form;

import X.AnonymousClass0FC;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ct;
import X.AnonymousClass0eS;
import X.AnonymousClass5jQ;
import X.AnonymousClass5jR;
import X.AnonymousClass5jS;
import X.AnonymousClass6EG;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.HashSet;
import java.util.Set;

public class IgFormField extends ConstraintLayout {
    /* renamed from: B */
    public EditText f68577B;
    /* renamed from: C */
    public TextView f68578C;
    /* renamed from: D */
    public AnonymousClass5jQ f68579D;
    /* renamed from: E */
    public AnonymousClass5jS f68580E;
    /* renamed from: F */
    public Set f68581F;
    /* renamed from: G */
    private boolean f68582G;
    /* renamed from: H */
    private TextView f68583H;

    public IgFormField(Context context) {
        super(context);
        m28364D(context, null);
    }

    public IgFormField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28364D(context, attributeSet);
    }

    public IgFormField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28364D(context, attributeSet);
    }

    /* renamed from: D */
    private void m28364D(Context context, AttributeSet attributeSet) {
        inflate(context, C0164R.layout.form_field_layout, this);
        EditText editText = (EditText) findViewById(C0164R.id.form_field_edit_text);
        this.f68577B = editText;
        editText.setOnFocusChangeListener(new AnonymousClass5jR(this));
        this.f68578C = (TextView) findViewById(C0164R.id.form_field_label_inline);
        TextView textView = (TextView) findViewById(C0164R.id.form_field_label_top);
        this.f68583H = textView;
        textView.setVisibility(4);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.form_field_horizontal_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0164R.dimen.form_field_vertical_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.f68580E = new AnonymousClass5jS(this.f68583H, this.f68577B, new AnonymousClass0ct((ViewStub) findViewById(C0164R.id.form_field_end_indicator_view)), new AnonymousClass0ct((ViewStub) findViewById(C0164R.id.form_field_end_loading_view)));
        this.f68579D = new AnonymousClass5jQ(this.f68578C, this.f68583H);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass0eS.IgFormField, 0, 0);
        String string = obtainStyledAttributes.getString(0);
        if (string != null) {
            setLabelText(string);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: E */
    public final void m28365E(TextWatcher textWatcher) {
        if (this.f68581F == null) {
            this.f68581F = new HashSet();
        }
        this.f68581F.add(textWatcher);
        this.f68577B.addTextChangedListener(textWatcher);
    }

    public CharSequence getText() {
        return this.f68577B.getText();
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 1671629385);
        super.onAttachedToWindow();
        AnonymousClass0FC.B().IJA(this.f68577B);
        this.f68577B.addTextChangedListener(this.f68580E);
        AnonymousClass0cQ.O(this, -180674237, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -506698470);
        AnonymousClass0FC.B().qVA(this.f68577B);
        Set<TextWatcher> set = this.f68581F;
        if (set != null) {
            for (TextWatcher removeTextChangedListener : set) {
                this.f68577B.removeTextChangedListener(removeTextChangedListener);
            }
            this.f68581F.clear();
        }
        this.f68577B.removeTextChangedListener(this.f68580E);
        super.onDetachedFromWindow();
        AnonymousClass0cQ.O(this, 1156905781, N);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f68582G) {
            r1.f68582G = true;
            z = r1.f68579D;
            z.f68554C = true;
            i3 = z.f68561J.getHeight();
            i2 = new int[2];
            z.f68561J.getLocationOnScreen(i2);
            i = z.f68555D.getHeight();
            int[] iArr = new int[2];
            z.f68555D.getLocationOnScreen(iArr);
            z.f68556E = ((float) i3) / ((float) i);
            z.f68557F = i2[0] - iArr[0];
            z.f68558G = i2[1] - iArr[1];
            z.f68555D.setPivotX(0.0f);
            z.f68555D.setPivotY(0.0f);
            String str = z.f68560I;
            if (str != null) {
                z.m28362A(str, z.f68559H);
                z.f68560I = null;
            }
        }
    }

    public void setLabelText(String str) {
        this.f68580E.f68569H = str;
        if (this.f68580E.f68567F.f68576C.equals("valid")) {
            this.f68578C.setText(str);
            this.f68583H.setText(str);
        }
    }

    public void setRuleChecker(AnonymousClass6EG anonymousClass6EG) {
        this.f68580E.f68568G = anonymousClass6EG;
    }

    public void setText(CharSequence charSequence) {
        this.f68577B.setText(charSequence);
        Object obj = charSequence.length() == 0 ? 1 : null;
        this.f68578C.setVisibility(obj != null ? 0 : 4);
        this.f68579D.m28362A(obj != null ? "inline" : "top", false);
    }
}
