package com.instagram.ui.widget.typeahead;

import X.AnonymousClass0FC;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass3kW;
import X.AnonymousClass3kX;
import X.AnonymousClass3kY;
import X.AnonymousClass3kZ;
import X.AnonymousClass3ka;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnFocusChangeListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public class TypeaheadHeader extends LinearLayout implements OnScrollListener {
    /* renamed from: B */
    public AnonymousClass3kY f44018B;
    /* renamed from: C */
    public AnonymousClass3kZ f44019C;
    /* renamed from: D */
    public SearchEditText f44020D;

    public TypeaheadHeader(Context context) {
        super(context);
        m20560B();
    }

    public TypeaheadHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20560B();
    }

    public TypeaheadHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20560B();
    }

    /* renamed from: A */
    public final void m20561A() {
        this.f44020D.clearFocus();
        this.f44020D.B();
    }

    /* renamed from: B */
    private void m20560B() {
        LayoutInflater.from(getContext()).inflate(C0164R.layout.typeahead_header, this, true);
        SearchEditText searchEditText = (SearchEditText) findViewById(C0164R.id.row_search_edit_text);
        this.f44020D = searchEditText;
        searchEditText.setOnFilterTextListener(new AnonymousClass3kW(this));
        this.f44020D.setSearchClearListener(new AnonymousClass3kX(this));
        AnonymousClass3ka.m20565B(this.f44020D);
        SearchEditText searchEditText2 = this.f44020D;
        searchEditText2.setClearButtonColorFilter(AnonymousClass0ca.B(searchEditText2.getResources().getColor(C0164R.color.grey_5)));
        AnonymousClass0FC.B().IJA(this.f44020D);
    }

    /* renamed from: C */
    public final void m20562C() {
        if (!TextUtils.isEmpty(this.f44020D.getText())) {
            SearchEditText searchEditText = this.f44020D;
            searchEditText.setSelection(searchEditText.getText().length());
        }
    }

    /* renamed from: D */
    public final void m20563D(String str) {
        this.f44020D.setHint(str);
    }

    /* renamed from: E */
    public final void m20564E(String str) {
        this.f44020D.setText(str);
    }

    public String getSearchString() {
        return this.f44020D.getSearchString();
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.H(this, -10701698, AnonymousClass0cQ.I(this, 911549058));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -125974086);
        if (i == 1) {
            m20561A();
        }
        AnonymousClass0cQ.H(this, 1980414413, I);
    }

    public void setAllowTextSelection(boolean z) {
        this.f44020D.setAllowTextSelection(z);
    }

    public void setDelegate(AnonymousClass3kY anonymousClass3kY) {
        this.f44018B = anonymousClass3kY;
    }

    public void setEditTextBackground(Drawable drawable) {
        this.f44020D.setBackground(drawable);
    }

    public void setOnSearchEditTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f44020D.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setSearchClearListener(AnonymousClass3kZ anonymousClass3kZ) {
        this.f44019C = anonymousClass3kZ;
    }

    public void setSearchIconPadding(int i) {
        this.f44020D.setCompoundDrawablePadding(i);
    }
}
