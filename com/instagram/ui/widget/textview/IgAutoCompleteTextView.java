package com.instagram.ui.widget.textview;

import X.AnonymousClass0CC;
import X.AnonymousClass0cQ;
import X.AnonymousClass1Oc;
import X.AnonymousClass2JZ;
import X.AnonymousClass2Ja;
import X.AnonymousClass2M5;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.facebook.C0164R;

public class IgAutoCompleteTextView extends AutoCompleteTextView {
    /* renamed from: B */
    public int f13038B;
    /* renamed from: C */
    public float f13039C;
    /* renamed from: D */
    private boolean f13040D;
    /* renamed from: E */
    private final boolean f13041E = ((Boolean) AnonymousClass0CC.zD.m914G()).booleanValue();
    /* renamed from: F */
    private AnonymousClass2JZ f13042F;
    /* renamed from: G */
    private int f13043G = 2;
    /* renamed from: H */
    private String[] f13044H;
    /* renamed from: I */
    private final AnonymousClass1Oc f13045I = AnonymousClass1Oc.USERNAME_AND_HASHTAG;

    public IgAutoCompleteTextView(Context context) {
        super(context);
        m8683B();
    }

    public IgAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8683B();
    }

    public IgAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8683B();
    }

    /* renamed from: B */
    private void m8683B() {
        String str = Build.MODEL;
        if (!(str.equalsIgnoreCase("DROID3") || str.equalsIgnoreCase("DROID4"))) {
            if (!str.equalsIgnoreCase("DROID BIONIC")) {
                this.f13039C = 0.0f;
                this.f13038B = getResources().getDimensionPixelSize(C0164R.dimen.autocomplete_list_item_height);
                setRawInputType(getInputType() & -65537);
            }
        }
    }

    public final void dismissDropDown() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r7 = this;
        super.dismissDropDown();
        r0 = r7.f13041E;
        if (r0 == 0) goto L_0x0023;
    L_0x0007:
        r6 = 1;
        r5 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r2 = "ensureImeVisible";	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r4 = 1;	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r1 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r0 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r3 = 0;	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r1[r3] = r0;	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r2 = r5.getMethod(r2, r1);	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r1 = new java.lang.Object[r4];	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r0 = java.lang.Boolean.valueOf(r6);	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r1[r3] = r0;	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
        r2.invoke(r7, r1);	 Catch:{ NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023, NoSuchMethodException -> 0x0023 }
    L_0x0023:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.textview.IgAutoCompleteTextView.dismissDropDown():void");
    }

    public final boolean enoughToFilter() {
        return AnonymousClass2M5.B(this, this.f13045I, this.f13043G);
    }

    public String getCurrentTagOrUserName() {
        return AnonymousClass2M5.C(this, this.f13045I);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return onCreateInputConnection;
        }
        AnonymousClass2JZ anonymousClass2JZ = this.f13042F;
        if (anonymousClass2JZ == null) {
            return onCreateInputConnection;
        }
        String[] strArr = this.f13044H;
        return (strArr == null || strArr.length <= 0) ? onCreateInputConnection : AnonymousClass2Ja.B(onCreateInputConnection, editorInfo, strArr, anonymousClass2JZ);
    }

    public final void onFilterComplete(int i) {
        super.onFilterComplete(Math.max(i, this.f13040D));
        if (this.f13039C > 0.0f) {
            float count = (float) getAdapter().getCount();
            float f = this.f13039C;
            if (count <= f) {
                setDropDownHeight(-2);
            } else {
                setDropDownHeight((int) (f * ((float) this.f13038B)));
            }
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int N = AnonymousClass0cQ.m5864N(this, 1170619059);
        super.onFocusChanged(z, i, rect);
        if (this.f13040D && z && enoughToFilter() && getWindowVisibility() == 0) {
            showDropDown();
        }
        AnonymousClass0cQ.m5865O(this, -1284095498, N);
    }

    public final void performFiltering(CharSequence charSequence, int i) {
        super.performFiltering(getCurrentTagOrUserName(), i);
    }

    public final void replaceText(CharSequence charSequence) {
        AnonymousClass2M5.D(this, charSequence, this.f13045I);
    }

    public void setAlwaysShowWhenEnoughToFilter(boolean z) {
        this.f13040D = z;
    }

    public void setDropDownCustomHeight(int i) {
        setDropDownHeight(i);
    }

    public void setInputContentInfoListener(String[] strArr, AnonymousClass2JZ anonymousClass2JZ) {
        this.f13044H = strArr;
        this.f13042F = anonymousClass2JZ;
    }

    public void setMinNumToFilter(int i) {
        this.f13043G = i;
    }
}
