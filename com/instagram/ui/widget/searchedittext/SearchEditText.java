package com.instagram.ui.widget.searchedittext;

import X.AnonymousClass0VE;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import X.AnonymousClass2Lr;
import X.AnonymousClass2Ls;
import X.AnonymousClass3kX;
import X.AnonymousClass4WV;
import X.AnonymousClass4WY;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.search.SearchController;

public class SearchEditText extends EditText implements OnEditorActionListener {
    /* renamed from: B */
    private boolean f7809B;
    /* renamed from: C */
    private Drawable f7810C;
    /* renamed from: D */
    private boolean f7811D = true;
    /* renamed from: E */
    private boolean f7812E;
    /* renamed from: F */
    private Drawable[] f7813F;
    /* renamed from: G */
    private boolean f7814G = true;
    /* renamed from: H */
    private InputMethodManager f7815H;
    /* renamed from: I */
    private boolean f7816I;
    /* renamed from: J */
    private SearchController f7817J;
    /* renamed from: K */
    private boolean f7818K;
    /* renamed from: L */
    private AnonymousClass0VE f7819L;
    /* renamed from: M */
    private AnonymousClass3kX f7820M;
    /* renamed from: N */
    private AnonymousClass4WV f7821N;
    /* renamed from: O */
    private boolean f7822O;
    /* renamed from: P */
    private boolean f7823P;

    public SearchEditText(Context context) {
        super(context);
        m6390C(null);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6390C(attributeSet);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6390C(attributeSet);
    }

    /* renamed from: A */
    public final void m6392A() {
        AnonymousClass3kX anonymousClass3kX = this.f7820M;
        if (anonymousClass3kX != null) {
            String searchString = getSearchString();
            if (anonymousClass3kX.f44017B.f44019C != null) {
                anonymousClass3kX.f44017B.f44019C.Bz(searchString);
            }
        }
        setText(JsonProperty.USE_DEFAULT_NAME);
        requestFocus();
        m6396F();
    }

    /* renamed from: B */
    public final void m6393B() {
        this.f7815H.hideSoftInputFromWindow(getWindowToken(), 0);
        this.f7823P = false;
        SearchController searchController = this.f7817J;
        if (searchController != null) {
            searchController.f48694F = false;
        }
    }

    /* renamed from: B */
    private boolean m6389B(float f) {
        if (this.f7810C == null) {
            return false;
        }
        if (this.f7816I) {
            if (f >= ((float) (getPaddingLeft() + this.f7810C.getIntrinsicWidth()))) {
                return false;
            }
        } else if (f <= ((float) ((getWidth() - getPaddingRight()) - this.f7810C.getIntrinsicWidth()))) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private void m6390C(AttributeSet attributeSet) {
        boolean z;
        this.f7816I = AnonymousClass0e8.m6200D(getContext());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.SearchEditText);
            this.f7811D = obtainStyledAttributes.getBoolean(1, true);
            z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        } else {
            z = false;
        }
        setOnEditorActionListener(this);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        this.f7813F = compoundDrawablesRelative;
        this.f7810C = compoundDrawablesRelative[2];
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], null, compoundDrawablesRelative[3]);
        setAllowTextSelection(z);
        this.f7815H = (InputMethodManager) getContext().getSystemService("input_method");
    }

    /* renamed from: C */
    public final boolean m6394C() {
        return TextUtils.isEmpty(getSearchString());
    }

    /* renamed from: D */
    private void m6391D() {
        Drawable drawable = null;
        Drawable drawable2 = this.f7814G ? this.f7813F[0] : null;
        Drawable drawable3 = this.f7813F[1];
        if (this.f7812E && this.f7811D) {
            drawable = this.f7810C;
        }
        setCompoundDrawablesRelative(drawable2, drawable3, drawable, this.f7813F[3]);
    }

    /* renamed from: E */
    public final void m6395E() {
        if (this.f7818K) {
            requestFocus();
        } else {
            this.f7822O = true;
        }
    }

    /* renamed from: F */
    public final void m6396F() {
        if (this.f7818K) {
            this.f7815H.showSoftInput(this, 0);
            SearchController searchController = this.f7817J;
            if (searchController != null) {
                searchController.f48694F = true;
            }
            return;
        }
        this.f7823P = true;
    }

    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        setFocusableInTouchMode(true);
    }

    public String getSearchString() {
        return getText().toString().trim();
    }

    public CharSequence getStrippedText() {
        CharSequence text = getText();
        if (TextUtils.isEmpty(text)) {
            return text;
        }
        char charAt = text.charAt(0);
        if (charAt == '@' || charAt == '#') {
            return text.subSequence(1, text.length());
        }
        return text;
    }

    public CharSequence getTextForSearch() {
        CharSequence text = getText();
        if (!TextUtils.isEmpty(text) && text.length() == 1) {
            char charAt = text.charAt(0);
            if (charAt == '@' || charAt == '#') {
                return JsonProperty.USE_DEFAULT_NAME;
            }
        }
        return text;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            if (i != 3) {
                return false;
            }
        }
        m6393B();
        AnonymousClass0VE anonymousClass0VE = this.f7819L;
        if (anonymousClass0VE != null) {
            anonymousClass0VE.Fz(this, getSearchString());
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!TextUtils.isEmpty(getText()) && keyEvent.getAction() == 0) {
            Object obj;
            AnonymousClass0VE anonymousClass0VE;
            if (!(i == 23 || i == 66)) {
                if (i != 160) {
                    obj = null;
                    if (obj != null) {
                        m6393B();
                        anonymousClass0VE = this.f7819L;
                        if (anonymousClass0VE != null) {
                            anonymousClass0VE.Fz(this, getSearchString());
                        }
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                m6393B();
                anonymousClass0VE = this.f7819L;
                if (anonymousClass0VE != null) {
                    anonymousClass0VE.Fz(this, getSearchString());
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f7818K = true;
        if (this.f7822O) {
            m6395E();
            this.f7822O = false;
        }
        if (this.f7823P) {
            post(new AnonymousClass2Ls(this));
            this.f7823P = false;
        }
    }

    public final boolean onPreDraw() {
        boolean C = m6394C();
        if (this.f7812E != C) {
            return super.onPreDraw();
        }
        this.f7812E = C ^ 1;
        m6391D();
        return false;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AnonymousClass0VE anonymousClass0VE = this.f7819L;
        if (anonymousClass0VE != null) {
            anonymousClass0VE.Gz(this, charSequence, i, i2, i3);
        }
    }

    public final boolean onTextContextMenuItem(int i) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322) {
            AnonymousClass4WV anonymousClass4WV = this.f7821N;
            if (anonymousClass4WV != null) {
                AnonymousClass4WY anonymousClass4WY = anonymousClass4WV.f54841B;
                SearchEditText searchEditText = anonymousClass4WY.f54849G;
                AnonymousClass4WY.C(anonymousClass4WY, searchEditText, searchEditText.getSearchString(), true);
            }
        }
        return onTextContextMenuItem;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, -555547317);
        if (this.f7812E && this.f7811D && motionEvent.getAction() == 1 && this.f7810C != null && m6389B(motionEvent.getX())) {
            m6392A();
        }
        if (this.f7809B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            AnonymousClass0cQ.m5862L(this, -1387543203, M);
            return onTouchEvent;
        }
        requestFocus();
        m6396F();
        AnonymousClass0cQ.m5862L(this, 910530848, M);
        return true;
    }

    public void setAllowTextSelection(boolean z) {
        this.f7809B = z;
        if (z) {
            setOnLongClickListener(null);
        } else {
            setOnLongClickListener(new AnonymousClass2Lr(this));
        }
    }

    public void setClearButtonAlpha(int i) {
        Drawable drawable = this.f7810C;
        if (drawable != null) {
            drawable.mutate().setAlpha(i);
        }
    }

    public void setClearButtonColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7810C;
        if (drawable != null) {
            drawable.mutate().setColorFilter(colorFilter);
        }
    }

    public void setClearButtonEnabled(boolean z) {
        this.f7811D = z;
        m6391D();
    }

    public void setOnFilterTextListener(AnonymousClass0VE anonymousClass0VE) {
        this.f7819L = anonymousClass0VE;
    }

    public void setOnKeyboardListener(SearchController searchController) {
        this.f7817J = searchController;
    }

    public void setSearchClearListener(AnonymousClass3kX anonymousClass3kX) {
        this.f7820M = anonymousClass3kX;
    }

    public void setSearchIconEnabled(boolean z) {
        this.f7814G = z;
        m6391D();
    }

    public void setTextPasteListener(AnonymousClass4WV anonymousClass4WV) {
        this.f7821N = anonymousClass4WV;
    }
}
