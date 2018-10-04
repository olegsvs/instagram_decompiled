package android.support.constraint;

import X.AnonymousClass1Pi;
import X.AnonymousClass1ka;
import X.AnonymousClass1kc;
import X.AnonymousClass1ke;
import X.AnonymousClass1kg;
import X.AnonymousClass1kl;
import X.AnonymousClass1kw;
import X.AnonymousClass2Nt;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    /* renamed from: B */
    public SparseArray f22180B = new SparseArray();
    /* renamed from: C */
    public ArrayList f22181C = new ArrayList(4);
    /* renamed from: D */
    public AnonymousClass1ke f22182D = null;
    /* renamed from: E */
    public int f22183E = -1;
    /* renamed from: F */
    public int f22184F = 0;
    /* renamed from: G */
    public int f22185G = 0;
    /* renamed from: H */
    public int f22186H = -1;
    /* renamed from: I */
    public AnonymousClass1Pi f22187I = new AnonymousClass1Pi();
    /* renamed from: J */
    public int f22188J = Integer.MAX_VALUE;
    /* renamed from: K */
    public int f22189K = Integer.MAX_VALUE;
    /* renamed from: L */
    public AnonymousClass1kl f22190L;
    /* renamed from: M */
    public int f22191M = 0;
    /* renamed from: N */
    public int f22192N = 0;
    /* renamed from: O */
    public final ArrayList f22193O = new ArrayList(100);
    /* renamed from: P */
    private HashMap f22194P = new HashMap();
    /* renamed from: Q */
    private boolean f22195Q = true;
    /* renamed from: R */
    private int f22196R = -1;
    /* renamed from: S */
    private int f22197S = 3;

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context) {
        super(context);
        m12836D(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12836D(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12836D(attributeSet);
    }

    /* renamed from: A */
    public final Object m12837A(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap hashMap = this.f22194P;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f22194P.get(str);
            }
        }
        return null;
    }

    /* renamed from: B */
    public static final AnonymousClass1kc m12834B() {
        return new AnonymousClass1kc(-2, -2);
    }

    /* renamed from: B */
    public final AnonymousClass1kw m12838B(View view) {
        if (view == this) {
            return this.f22187I;
        }
        AnonymousClass1kw anonymousClass1kw;
        if (view == null) {
            anonymousClass1kw = null;
        } else {
            anonymousClass1kw = ((AnonymousClass1kc) view.getLayoutParams()).MB;
        }
        return anonymousClass1kw;
    }

    /* renamed from: C */
    public static final AnonymousClass1kw m12835C(ConstraintLayout constraintLayout, int i) {
        if (i != 0) {
            View view = (View) constraintLayout.f22180B.get(i);
            if (view != constraintLayout) {
                AnonymousClass1kw anonymousClass1kw;
                if (view == null) {
                    anonymousClass1kw = null;
                } else {
                    anonymousClass1kw = ((AnonymousClass1kc) view.getLayoutParams()).MB;
                }
                return anonymousClass1kw;
            }
        }
        return constraintLayout.f22187I;
    }

    /* renamed from: C */
    public final void m12839C(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f22194P == null) {
                this.f22194P = new HashMap();
            }
            obj = (String) obj;
            int indexOf = obj.indexOf("/");
            if (indexOf != -1) {
                obj = obj.substring(indexOf + 1);
            }
            this.f22194P.put(obj, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: D */
    private void m12836D(android.util.AttributeSet r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r18 = this;
        r12 = r18;
        r0 = r12.f22187I;
        r0.f22385J = r12;
        r1 = r12.f22180B;
        r0 = r12.getId();
        r1.put(r0, r12);
        r11 = 0;
        r12.f22182D = r11;
        r2 = r19;
        if (r19 == 0) goto L_0x0477;
    L_0x0016:
        r1 = r12.getContext();
        r0 = X.AnonymousClass1bZ.ConstraintLayout_Layout;
        r10 = r1.obtainStyledAttributes(r2, r0);
        r18 = r10.getIndexCount();
        r9 = 0;
        r8 = 0;
    L_0x0026:
        r0 = r18;
        if (r8 >= r0) goto L_0x0474;
    L_0x002a:
        r1 = r10.getIndex(r8);
        r0 = 3;
        if (r1 != r0) goto L_0x003b;
    L_0x0031:
        r0 = r12.f22192N;
        r0 = r10.getDimensionPixelOffset(r1, r0);
        r12.f22192N = r0;
        goto L_0x0470;
    L_0x003b:
        r0 = 4;
        if (r1 != r0) goto L_0x0048;
    L_0x003e:
        r0 = r12.f22191M;
        r0 = r10.getDimensionPixelOffset(r1, r0);
        r12.f22191M = r0;
        goto L_0x0470;
    L_0x0048:
        r0 = 1;
        if (r1 != r0) goto L_0x0055;
    L_0x004b:
        r0 = r12.f22189K;
        r0 = r10.getDimensionPixelOffset(r1, r0);
        r12.f22189K = r0;
        goto L_0x0470;
    L_0x0055:
        r0 = 2;
        if (r1 != r0) goto L_0x0062;
    L_0x0058:
        r0 = r12.f22188J;
        r0 = r10.getDimensionPixelOffset(r1, r0);
        r12.f22188J = r0;
        goto L_0x0470;
    L_0x0062:
        r0 = 59;
        if (r1 != r0) goto L_0x0070;
    L_0x0066:
        r0 = r12.f22197S;
        r0 = r10.getInt(r1, r0);
        r12.f22197S = r0;
        goto L_0x0470;
    L_0x0070:
        r0 = 8;
        if (r1 != r0) goto L_0x0470;
    L_0x0074:
        r7 = r10.getResourceId(r1, r9);
        r0 = new X.1ke;	 Catch:{ NotFoundException -> 0x046c }
        r0.<init>();	 Catch:{ NotFoundException -> 0x046c }
        r12.f22182D = r0;	 Catch:{ NotFoundException -> 0x046c }
        r6 = r12.f22182D;	 Catch:{ NotFoundException -> 0x046c }
        r17 = r12.getContext();	 Catch:{ NotFoundException -> 0x046c }
        r0 = r17.getResources();	 Catch:{ NotFoundException -> 0x046c }
        r16 = r0.getXml(r7);	 Catch:{ NotFoundException -> 0x046c }
        r0 = r16.getEventType();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0091:
        r5 = 1;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        if (r0 == r5) goto L_0x046b;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0094:
        if (r0 == 0) goto L_0x0459;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0096:
        switch(r0) {
            case 2: goto L_0x009b;
            case 3: goto L_0x045c;
            default: goto L_0x0099;
        };	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0099:
        goto L_0x045c;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x009b:
        r4 = r16.getName();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r2 = android.util.Xml.asAttributeSet(r16);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r19 = new X.1kd;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r19.<init>();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r1 = X.AnonymousClass1bZ.ConstraintSet;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r17;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r3 = r0.obtainStyledAttributes(r2, r1);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r2 = r3.getIndexCount();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r1 = 0;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x00b5:
        if (r1 >= r2) goto L_0x043a;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x00b7:
        r13 = r3.getIndex(r1);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = X.AnonymousClass1ke.f22250D;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.get(r13);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        switch(r0) {
            case 1: goto L_0x042a;
            case 2: goto L_0x041d;
            case 3: goto L_0x0410;
            case 4: goto L_0x0403;
            case 5: goto L_0x03fa;
            case 6: goto L_0x03ed;
            case 7: goto L_0x03e0;
            case 8: goto L_0x03d3;
            case 9: goto L_0x03c6;
            case 10: goto L_0x03b9;
            case 11: goto L_0x03ac;
            case 12: goto L_0x039e;
            case 13: goto L_0x0390;
            case 14: goto L_0x0382;
            case 15: goto L_0x0374;
            case 16: goto L_0x0366;
            case 17: goto L_0x0358;
            case 18: goto L_0x034a;
            case 19: goto L_0x033c;
            case 20: goto L_0x032e;
            case 21: goto L_0x0320;
            case 22: goto L_0x0308;
            case 23: goto L_0x02fa;
            case 24: goto L_0x02ec;
            case 25: goto L_0x02de;
            case 26: goto L_0x02d0;
            case 27: goto L_0x02c2;
            case 28: goto L_0x02b4;
            case 29: goto L_0x02a6;
            case 30: goto L_0x0298;
            case 31: goto L_0x028a;
            case 32: goto L_0x027c;
            case 33: goto L_0x026e;
            case 34: goto L_0x0260;
            case 35: goto L_0x0252;
            case 36: goto L_0x0244;
            case 37: goto L_0x0236;
            case 38: goto L_0x0228;
            case 39: goto L_0x021a;
            case 40: goto L_0x020c;
            case 41: goto L_0x01fe;
            case 42: goto L_0x01f0;
            case 43: goto L_0x01e2;
            case 44: goto L_0x01d1;
            case 45: goto L_0x01c3;
            case 46: goto L_0x01b5;
            case 47: goto L_0x01a7;
            case 48: goto L_0x0199;
            case 49: goto L_0x018b;
            case 50: goto L_0x017d;
            case 51: goto L_0x016f;
            case 52: goto L_0x0161;
            case 53: goto L_0x0153;
            default: goto L_0x00c4;
        };	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x00c4:
        switch(r0) {
            case 60: goto L_0x0145;
            case 61: goto L_0x0137;
            case 62: goto L_0x0129;
            case 63: goto L_0x011b;
            case 64: goto L_0x00f1;
            default: goto L_0x00c7;
        };	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x00c7:
        r15 = "ConstraintSet";	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14 = new java.lang.StringBuilder;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.<init>();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = "Unknown attribute 0x";	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.append(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = java.lang.Integer.toHexString(r13);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.append(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = "   ";	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.append(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = X.AnonymousClass1ke.f22250D;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.get(r13);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.append(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r14.toString();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        android.util.Log.w(r15, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x00f1:
        r15 = "ConstraintSet";	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14 = new java.lang.StringBuilder;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.<init>();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = "unused attribute 0x";	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.append(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = java.lang.Integer.toHexString(r13);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.append(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = "   ";	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.append(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = X.AnonymousClass1ke.f22250D;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.get(r13);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r14.append(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r14.toString();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        android.util.Log.w(r15, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x011b:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22204H;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22204H = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0129:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22206J;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22206J = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0137:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22205I;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22205I = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0145:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22246x;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22246x = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0153:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.MB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimension(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.MB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0161:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.LB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimension(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.LB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x016f:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.KB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimension(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.KB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x017d:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.JB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.JB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x018b:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.IB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.IB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0199:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.BB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.BB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x01a7:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.AB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.AB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x01b5:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22248z;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22248z = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x01c3:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22247y;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22247y = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x01d1:
        r14 = 1;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22199C = r14;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22212P;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimension(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22212P = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x01e2:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22198B;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22198B = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x01f0:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.OB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getInt(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.OB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x01fe:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22230h;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getInt(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22230h = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x020c:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.PB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.PB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x021a:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22231i;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22231i = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0228:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22240r;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getResourceId(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22240r = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0236:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.NB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.NB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0244:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.HB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.HB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0252:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.GB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.GB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0260:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.FB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.FB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x026e:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.EB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.EB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x027c:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.DB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.DB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x028a:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.CB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.CB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0298:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22245w;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22245w = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x02a6:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22244v;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22244v = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x02b4:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22243u;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22243u = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x02c2:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22242t;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getInt(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22242t = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x02d0:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22234l;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22234l = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x02de:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22233k;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22233k = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x02ec:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22232j;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22232j = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x02fa:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22241s;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getLayoutDimension(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22241s = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0308:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.QB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getInt(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.QB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.f22249C;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.QB;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r13[r0];	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.QB = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0320:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22236n;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getLayoutDimension(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22236n = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x032e:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22229g;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22229g = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x033c:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22224b;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getFloat(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22224b = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x034a:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22223a;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelOffset(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22223a = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0358:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22222Z;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelOffset(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22222Z = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0366:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22221Y;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22221Y = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0374:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22220X;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22220X = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0382:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22219W;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22219W = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0390:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22218V;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22218V = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x039e:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22217U;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22217U = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x03ac:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22216T;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22216T = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x03b9:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22215S;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22215S = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x03c6:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22214R;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22214R = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x03d3:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22213Q;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22213Q = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x03e0:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22211O;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelOffset(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22211O = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x03ed:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22210N;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelOffset(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22210N = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x03fa:
        r13 = r3.getString(r13);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22209M = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0403:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22203G;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22203G = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0410:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22202F;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22202F = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x041d:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22201E;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = r3.getDimensionPixelSize(r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22201E = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0436;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x042a:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22200D;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r13 = X.AnonymousClass1ke.m12844B(r3, r13, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22200D = r13;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0436:
        r1 = r1 + 1;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x00b5;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x043a:
        r3.recycle();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = "Guideline";	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r4.equalsIgnoreCase(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        if (r0 == 0) goto L_0x0449;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0445:
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0.f22238p = r5;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0449:
        r2 = r6.f22251B;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r0.f22240r;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r1 = java.lang.Integer.valueOf(r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r0 = r19;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        r2.put(r1, r0);	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x045c;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0459:
        r16.getName();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x045c:
        r0 = r16.next();	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
        goto L_0x0091;	 Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x0462 }
    L_0x0462:
        r0 = move-exception;	 Catch:{ NotFoundException -> 0x046c }
        r0.printStackTrace();	 Catch:{ NotFoundException -> 0x046c }
        goto L_0x046b;	 Catch:{ NotFoundException -> 0x046c }
    L_0x0467:
        r0 = move-exception;	 Catch:{ NotFoundException -> 0x046c }
        r0.printStackTrace();	 Catch:{ NotFoundException -> 0x046c }
    L_0x046b:
        goto L_0x046e;	 Catch:{ NotFoundException -> 0x046c }
    L_0x046c:
        r12.f22182D = r11;
    L_0x046e:
        r12.f22183E = r7;
    L_0x0470:
        r8 = r8 + 1;
        goto L_0x0026;
    L_0x0474:
        r10.recycle();
    L_0x0477:
        r1 = r12.f22187I;
        r0 = r12.f22197S;
        r1.f18202F = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.D(android.util.AttributeSet):void");
    }

    /* renamed from: D */
    public final void m12840D(String str) {
        this.f22187I.m15405b();
        str = this.f22190L;
        if (str != null) {
            str.f22308W++;
        }
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass1kc;
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int parseInt3 = Integer.parseInt(split[2]);
                            parseInt = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i2 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            parseInt3 = (int) ((((float) parseInt3) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) parseInt;
                            float f2 = (float) i2;
                            float f3 = (float) (parseInt + parseInt3);
                            float f4 = f;
                            Paint paint2 = paint;
                            float f5 = f2;
                            float f6 = f3;
                            canvas2.drawLine(f, f5, f6, f2, paint2);
                            float f7 = (float) (i2 + parseInt4);
                            canvas2.drawLine(f3, f5, f6, f7, paint2);
                            float f8 = f7;
                            Canvas canvas3 = canvas2;
                            Paint paint3 = paint;
                            canvas3.drawLine(f3, f8, f4, f7, paint3);
                            canvas3.drawLine(f, f8, f4, f2, paint3);
                            paint.setColor(-16711936);
                            canvas2.drawLine(f4, f5, f3, f7, paint);
                            canvas2.drawLine(f4, f7, f3, f2, paint);
                        }
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m12834B();
    }

    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new AnonymousClass1kc(layoutParams);
    }

    public int getMaxHeight() {
        return this.f22188J;
    }

    public int getMaxWidth() {
        return this.f22189K;
    }

    public int getMinHeight() {
        return this.f22191M;
    }

    public int getMinWidth() {
        return this.f22192N;
    }

    public int getOptimizationLevel() {
        return this.f22187I.f18202F;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int G;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            AnonymousClass1kc anonymousClass1kc = (AnonymousClass1kc) childAt.getLayoutParams();
            AnonymousClass1kw anonymousClass1kw = anonymousClass1kc.MB;
            if (childAt.getVisibility() != 8 || anonymousClass1kc.f22157d || anonymousClass1kc.f22158e || isInEditMode) {
                if (!anonymousClass1kc.f22159f) {
                    int i7 = anonymousClass1kw.f22389N + anonymousClass1kw.f22411j;
                    int i8 = anonymousClass1kw.f22390O + anonymousClass1kw.f22412k;
                    int L = anonymousClass1kw.m12907L() + i7;
                    G = anonymousClass1kw.m12902G() + i8;
                    childAt.layout(i7, i8, L, G);
                    if (childAt instanceof AnonymousClass1kg) {
                        View content = ((AnonymousClass1kg) childAt).getContent();
                        if (content != null) {
                            content.setVisibility(0);
                            content.layout(i7, i8, L, G);
                        }
                    }
                }
            }
        }
        G = this.f22181C.size();
        if (G > 0) {
            while (i5 < G) {
                AnonymousClass1ka anonymousClass1ka = (AnonymousClass1ka) this.f22181C.get(i5);
                i5++;
            }
        }
    }

    public final void onMeasure(int r29, int r30) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r28 = this;
        java.lang.System.currentTimeMillis();
        r10 = android.view.View.MeasureSpec.getMode(r29);
        r9 = android.view.View.MeasureSpec.getSize(r29);
        r4 = r30;
        r8 = android.view.View.MeasureSpec.getMode(r4);
        android.view.View.MeasureSpec.getSize(r4);
        r1 = r28;
        r2 = r1.f22196R;
        r0 = -1;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r10 != r7) goto L_0x0021;
    L_0x001d:
        if (r8 != r7) goto L_0x0021;
    L_0x001f:
        r0 = r1.f22196R;
    L_0x0021:
        r0 = r1.f22185G;
        r3 = 0;
        r6 = 1;
        if (r10 != r0) goto L_0x002d;
    L_0x0027:
        r0 = r1.f22184F;
        if (r8 != r0) goto L_0x002d;
    L_0x002b:
        r5 = 1;
        goto L_0x002e;
    L_0x002d:
        r5 = 0;
    L_0x002e:
        if (r5 == 0) goto L_0x0032;
    L_0x0030:
        r0 = r1.f22186H;
    L_0x0032:
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r5 == 0) goto L_0x003c;
    L_0x0036:
        if (r10 != r2) goto L_0x003c;
    L_0x0038:
        if (r8 != r7) goto L_0x003c;
    L_0x003a:
        r0 = r1.f22196R;
    L_0x003c:
        if (r5 == 0) goto L_0x0044;
    L_0x003e:
        if (r10 != r7) goto L_0x0044;
    L_0x0040:
        if (r8 != r2) goto L_0x0044;
    L_0x0042:
        r0 = r1.f22196R;
    L_0x0044:
        r1.f22185G = r10;
        r1.f22184F = r8;
        r1.f22186H = r9;
        r17 = r1.getPaddingLeft();
        r16 = r1.getPaddingTop();
        r2 = r1.f22187I;
        r0 = r17;
        r2.BB = r0;
        r2 = r1.f22187I;
        r0 = r16;
        r2.CB = r0;
        r0 = r1.f22187I;
        r5 = r1.f22189K;
        r2 = r0.f22408g;
        r0 = 0;
        r2[r0] = r5;
        r0 = r1.f22187I;
        r5 = r1.f22188J;
        r2 = r0.f22408g;
        r0 = 1;
        r2[r0] = r5;
        r2 = android.os.Build.VERSION.SDK_INT;
        r0 = 17;
        if (r2 < r0) goto L_0x0083;
    L_0x0076:
        r2 = r1.f22187I;
        r0 = r1.getLayoutDirection();
        if (r0 != r6) goto L_0x0080;
    L_0x007e:
        r0 = 1;
        goto L_0x0081;
    L_0x0080:
        r0 = 0;
    L_0x0081:
        r2.f18201E = r0;
    L_0x0083:
        r0 = r29;
        r12 = android.view.View.MeasureSpec.getMode(r0);
        r6 = android.view.View.MeasureSpec.getSize(r0);
        r11 = android.view.View.MeasureSpec.getMode(r4);
        r5 = android.view.View.MeasureSpec.getSize(r4);
        r13 = r1.getPaddingTop();
        r0 = r1.getPaddingBottom();
        r13 = r13 + r0;
        r10 = r1.getPaddingLeft();
        r0 = r1.getPaddingRight();
        r10 = r10 + r0;
        r8 = X.AnonymousClass1kv.f22373C;
        r7 = X.AnonymousClass1kv.f22373C;
        r1.getLayoutParams();
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r12 == r2) goto L_0x00c5;
    L_0x00b4:
        if (r12 == 0) goto L_0x00c2;
    L_0x00b6:
        if (r12 == r9) goto L_0x00ba;
    L_0x00b8:
        r6 = 0;
        goto L_0x00c7;
    L_0x00ba:
        r0 = r1.f22189K;
        r6 = java.lang.Math.min(r0, r6);
        r6 = r6 - r10;
        goto L_0x00c7;
    L_0x00c2:
        r8 = X.AnonymousClass1kv.f22376F;
        goto L_0x00b8;
    L_0x00c5:
        r8 = X.AnonymousClass1kv.f22376F;
    L_0x00c7:
        if (r11 == r2) goto L_0x00da;
    L_0x00c9:
        if (r11 == 0) goto L_0x00d7;
    L_0x00cb:
        if (r11 == r9) goto L_0x00cf;
    L_0x00cd:
        r5 = 0;
        goto L_0x00dc;
    L_0x00cf:
        r0 = r1.f22188J;
        r5 = java.lang.Math.min(r0, r5);
        r5 = r5 - r13;
        goto L_0x00dc;
    L_0x00d7:
        r7 = X.AnonymousClass1kv.f22376F;
        goto L_0x00cd;
    L_0x00da:
        r7 = X.AnonymousClass1kv.f22376F;
    L_0x00dc:
        r2 = r1.f22187I;
        r0 = 0;
        r2.f22410i = r0;
        r2 = r1.f22187I;
        r0 = 0;
        r2.f22409h = r0;
        r0 = r1.f22187I;
        r0.m12917V(r8);
        r0 = r1.f22187I;
        r0.m12920Y(r6);
        r0 = r1.f22187I;
        r0.m12919X(r7);
        r0 = r1.f22187I;
        r0.m12916U(r5);
        r5 = r1.f22187I;
        r2 = r1.f22192N;
        r0 = r1.getPaddingLeft();
        r2 = r2 - r0;
        r0 = r1.getPaddingRight();
        r2 = r2 - r0;
        if (r2 >= 0) goto L_0x010e;
    L_0x010a:
        r0 = 0;
        r5.f22410i = r0;
        goto L_0x0110;
    L_0x010e:
        r5.f22410i = r2;
    L_0x0110:
        r5 = r1.f22187I;
        r2 = r1.f22191M;
        r0 = r1.getPaddingTop();
        r2 = r2 - r0;
        r0 = r1.getPaddingBottom();
        r2 = r2 - r0;
        if (r2 >= 0) goto L_0x0124;
    L_0x0120:
        r0 = 0;
        r5.f22409h = r0;
        goto L_0x0126;
    L_0x0124:
        r5.f22409h = r2;
    L_0x0126:
        r0 = r1.f22187I;
        r19 = r0.m12907L();
        r0 = r1.f22187I;
        r18 = r0.m12902G();
        r0 = r1.f22195Q;
        if (r0 == 0) goto L_0x05d0;
    L_0x0136:
        r1.f22195Q = r3;
        r5 = r1.getChildCount();
        r3 = 0;
        r2 = 0;
    L_0x013e:
        if (r2 >= r5) goto L_0x014f;
    L_0x0140:
        r0 = r1.getChildAt(r2);
        r0 = r0.isLayoutRequested();
        if (r0 == 0) goto L_0x014c;
    L_0x014a:
        r3 = 1;
        goto L_0x014f;
    L_0x014c:
        r2 = r2 + 1;
        goto L_0x013e;
    L_0x014f:
        if (r3 == 0) goto L_0x05d0;
    L_0x0151:
        r0 = r1.f22193O;
        r0.clear();
        r20 = r28.isInEditMode();
        r5 = r28.getChildCount();
        r9 = 0;
        r3 = -1;
        if (r20 == 0) goto L_0x019b;
    L_0x0162:
        r6 = 0;
    L_0x0163:
        if (r6 >= r5) goto L_0x019b;
    L_0x0165:
        r7 = r1.getChildAt(r6);
        r2 = r28.getResources();	 Catch:{ NotFoundException -> 0x0198 }
        r0 = r7.getId();	 Catch:{ NotFoundException -> 0x0198 }
        r2 = r2.getResourceName(r0);	 Catch:{ NotFoundException -> 0x0198 }
        r0 = r7.getId();	 Catch:{ NotFoundException -> 0x0198 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NotFoundException -> 0x0198 }
        r1.m12839C(r9, r2, r0);	 Catch:{ NotFoundException -> 0x0198 }
        r0 = 47;	 Catch:{ NotFoundException -> 0x0198 }
        r0 = r2.indexOf(r0);	 Catch:{ NotFoundException -> 0x0198 }
        if (r0 == r3) goto L_0x018e;	 Catch:{ NotFoundException -> 0x0198 }
    L_0x0188:
        r0 = r0 + 1;	 Catch:{ NotFoundException -> 0x0198 }
        r2 = r2.substring(r0);	 Catch:{ NotFoundException -> 0x0198 }
    L_0x018e:
        r0 = r7.getId();	 Catch:{ NotFoundException -> 0x0198 }
        r0 = m12835C(r1, r0);	 Catch:{ NotFoundException -> 0x0198 }
        r0.f22386K = r2;	 Catch:{ NotFoundException -> 0x0198 }
    L_0x0198:
        r6 = r6 + 1;
        goto L_0x0163;
    L_0x019b:
        r2 = 0;
    L_0x019c:
        if (r2 >= r5) goto L_0x01af;
    L_0x019e:
        r0 = r1.getChildAt(r2);
        r0 = r1.m12838B(r0);
        if (r0 != 0) goto L_0x01a9;
    L_0x01a8:
        goto L_0x01ac;
    L_0x01a9:
        r0.mo2740N();
    L_0x01ac:
        r2 = r2 + 1;
        goto L_0x019c;
    L_0x01af:
        r0 = r1.f22183E;
        if (r0 == r3) goto L_0x01d1;
    L_0x01b3:
        r7 = 0;
    L_0x01b4:
        if (r7 >= r5) goto L_0x01d1;
    L_0x01b6:
        r6 = r1.getChildAt(r7);
        r2 = r6.getId();
        r0 = r1.f22183E;
        if (r2 != r0) goto L_0x01ce;
    L_0x01c2:
        r0 = r6 instanceof X.AnonymousClass1kf;
        if (r0 == 0) goto L_0x01ce;
    L_0x01c6:
        r6 = (X.AnonymousClass1kf) r6;
        r0 = r6.getConstraintSet();
        r1.f22182D = r0;
    L_0x01ce:
        r7 = r7 + 1;
        goto L_0x01b4;
    L_0x01d1:
        r0 = r1.f22182D;
        if (r0 == 0) goto L_0x01d8;
    L_0x01d5:
        r0.m12846A(r1);
    L_0x01d8:
        r0 = r1.f22187I;
        r0 = r0.f29872B;
        r0.clear();
        r0 = r1.f22181C;
        r6 = r0.size();
        if (r6 <= 0) goto L_0x01f8;
    L_0x01e7:
        r2 = 0;
    L_0x01e8:
        if (r2 >= r6) goto L_0x01f8;
    L_0x01ea:
        r0 = r1.f22181C;
        r0 = r0.get(r2);
        r0 = (X.AnonymousClass1ka) r0;
        r0.m12831B(r1);
        r2 = r2 + 1;
        goto L_0x01e8;
    L_0x01f8:
        r7 = 0;
    L_0x01f9:
        if (r7 >= r5) goto L_0x0234;
    L_0x01fb:
        r6 = r1.getChildAt(r7);
        r0 = r6 instanceof X.AnonymousClass1kg;
        if (r0 == 0) goto L_0x0231;
    L_0x0203:
        r6 = (X.AnonymousClass1kg) r6;
        r8 = r6.f22254C;
        r0 = -1;
        if (r8 != r0) goto L_0x0215;
    L_0x020a:
        r0 = r6.isInEditMode();
        if (r0 != 0) goto L_0x0215;
    L_0x0210:
        r0 = r6.f22255D;
        r6.setVisibility(r0);
    L_0x0215:
        r0 = r6.f22254C;
        r0 = r1.findViewById(r0);
        r6.f22253B = r0;
        if (r0 == 0) goto L_0x0231;
    L_0x021f:
        r2 = r0.getLayoutParams();
        r2 = (X.AnonymousClass1kc) r2;
        r0 = 1;
        r2.f22159f = r0;
        r2 = r6.f22253B;
        r0 = 0;
        r2.setVisibility(r0);
        r6.setVisibility(r0);
    L_0x0231:
        r7 = r7 + 1;
        goto L_0x01f9;
    L_0x0234:
        r10 = 0;
    L_0x0235:
        if (r10 >= r5) goto L_0x05d0;
    L_0x0237:
        r7 = r1.getChildAt(r10);
        r2 = r1.m12838B(r7);
        if (r2 != 0) goto L_0x0243;
    L_0x0241:
        goto L_0x05cc;
    L_0x0243:
        r0 = r7.getLayoutParams();
        r0 = (X.AnonymousClass1kc) r0;
        r0.m12833A();
        r6 = r0.f22152Y;
        if (r6 == 0) goto L_0x0253;
    L_0x0250:
        r0.f22152Y = r9;
        goto L_0x0282;
    L_0x0253:
        if (r20 == 0) goto L_0x0282;
    L_0x0255:
        r8 = r28.getResources();	 Catch:{ NotFoundException -> 0x0282 }
        r6 = r7.getId();	 Catch:{ NotFoundException -> 0x0282 }
        r8 = r8.getResourceName(r6);	 Catch:{ NotFoundException -> 0x0282 }
        r6 = r7.getId();	 Catch:{ NotFoundException -> 0x0282 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ NotFoundException -> 0x0282 }
        r1.m12839C(r9, r8, r6);	 Catch:{ NotFoundException -> 0x0282 }
        r6 = "id/";	 Catch:{ NotFoundException -> 0x0282 }
        r6 = r8.indexOf(r6);	 Catch:{ NotFoundException -> 0x0282 }
        r6 = r6 + 3;	 Catch:{ NotFoundException -> 0x0282 }
        r8 = r8.substring(r6);	 Catch:{ NotFoundException -> 0x0282 }
        r6 = r7.getId();	 Catch:{ NotFoundException -> 0x0282 }
        r6 = m12835C(r1, r6);	 Catch:{ NotFoundException -> 0x0282 }
        r6.f22386K = r8;	 Catch:{ NotFoundException -> 0x0282 }
    L_0x0282:
        r6 = r7.getVisibility();
        r2.f22424w = r6;
        r6 = r0.f22159f;
        if (r6 == 0) goto L_0x0290;
    L_0x028c:
        r6 = 8;
        r2.f22424w = r6;
    L_0x0290:
        r2.f22385J = r7;
        r7 = r1.f22187I;
        r6 = r7.f29872B;
        r6.add(r2);
        r6 = r2.f22413l;
        if (r6 == 0) goto L_0x02a9;
    L_0x029d:
        r6 = r2.f22413l;
        r6 = (X.AnonymousClass2Nx) r6;
        r6 = r6.f29872B;
        r6.remove(r2);
        r6 = 0;
        r2.f22413l = r6;
    L_0x02a9:
        r2.f22413l = r7;
        r6 = r0.KB;
        if (r6 == 0) goto L_0x02b3;
    L_0x02af:
        r6 = r0.f22155b;
        if (r6 != 0) goto L_0x02b8;
    L_0x02b3:
        r6 = r1.f22193O;
        r6.add(r2);
    L_0x02b8:
        r6 = r0.f22157d;
        r14 = 17;
        if (r6 == 0) goto L_0x0303;
    L_0x02be:
        r2 = (X.AnonymousClass2Nt) r2;
        r11 = r0.f22174u;
        r8 = r0.f22175v;
        r7 = r0.f22176w;
        r6 = android.os.Build.VERSION.SDK_INT;
        if (r6 >= r14) goto L_0x02d0;
    L_0x02ca:
        r11 = r0.f22149V;
        r8 = r0.f22150W;
        r7 = r0.f22151X;
    L_0x02d0:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x02e5;
    L_0x02d6:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x02e3;
    L_0x02dc:
        r2.f29855E = r7;
        r0 = -1;
        r2.f29853C = r0;
        r2.f29854D = r0;
    L_0x02e3:
        goto L_0x05cc;
    L_0x02e5:
        if (r11 == r3) goto L_0x02f4;
    L_0x02e7:
        r6 = -1;
        if (r11 <= r6) goto L_0x02f2;
    L_0x02ea:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2.f29855E = r0;
        r2.f29853C = r11;
        r2.f29854D = r6;
    L_0x02f2:
        goto L_0x05cc;
    L_0x02f4:
        if (r8 == r3) goto L_0x05cc;
    L_0x02f6:
        r6 = -1;
        if (r8 <= r6) goto L_0x0301;
    L_0x02f9:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2.f29855E = r0;
        r2.f29853C = r6;
        r2.f29854D = r8;
    L_0x0301:
        goto L_0x05cc;
    L_0x0303:
        r6 = r0.f22160g;
        if (r6 != r3) goto L_0x034b;
    L_0x0307:
        r6 = r0.f22161h;
        if (r6 != r3) goto L_0x034b;
    L_0x030b:
        r6 = r0.CB;
        if (r6 != r3) goto L_0x034b;
    L_0x030f:
        r6 = r0.DB;
        if (r6 != r3) goto L_0x034b;
    L_0x0313:
        r6 = r0.FB;
        if (r6 != r3) goto L_0x034b;
    L_0x0317:
        r6 = r0.EB;
        if (r6 != r3) goto L_0x034b;
    L_0x031b:
        r6 = r0.f22142O;
        if (r6 != r3) goto L_0x034b;
    L_0x031f:
        r6 = r0.f22141N;
        if (r6 != r3) goto L_0x034b;
    L_0x0323:
        r6 = r0.HB;
        if (r6 != r3) goto L_0x034b;
    L_0x0327:
        r6 = r0.GB;
        if (r6 != r3) goto L_0x034b;
    L_0x032b:
        r6 = r0.f22131D;
        if (r6 != r3) goto L_0x034b;
    L_0x032f:
        r6 = r0.f22130C;
        if (r6 != r3) goto L_0x034b;
    L_0x0333:
        r6 = r0.f22129B;
        if (r6 != r3) goto L_0x034b;
    L_0x0337:
        r6 = r0.f22139L;
        if (r6 != r3) goto L_0x034b;
    L_0x033b:
        r6 = r0.f22140M;
        if (r6 != r3) goto L_0x034b;
    L_0x033f:
        r6 = r0.f22133F;
        if (r6 != r3) goto L_0x034b;
    L_0x0343:
        r6 = r0.width;
        if (r6 == r3) goto L_0x034b;
    L_0x0347:
        r6 = r0.height;
        if (r6 != r3) goto L_0x05cc;
    L_0x034b:
        r12 = r0.f22178y;
        r11 = r0.f22179z;
        r8 = r0.AB;
        r7 = r0.BB;
        r6 = r0.f22172s;
        r15 = r0.f22173t;
        r9 = r0.f22177x;
        r13 = android.os.Build.VERSION.SDK_INT;
        if (r13 >= r14) goto L_0x038d;
    L_0x035d:
        r12 = r0.f22160g;
        r11 = r0.f22161h;
        r8 = r0.CB;
        r7 = r0.DB;
        r6 = r0.f22145R;
        r15 = r0.f22146S;
        r9 = r0.f22153Z;
        if (r12 != r3) goto L_0x037c;
    L_0x036d:
        if (r11 != r3) goto L_0x037c;
    L_0x036f:
        r13 = r0.FB;
        if (r13 == r3) goto L_0x0376;
    L_0x0373:
        r12 = r0.FB;
        goto L_0x037c;
    L_0x0376:
        r13 = r0.EB;
        if (r13 == r3) goto L_0x037c;
    L_0x037a:
        r11 = r0.EB;
    L_0x037c:
        if (r8 != r3) goto L_0x038d;
    L_0x037e:
        if (r7 != r3) goto L_0x038d;
    L_0x0380:
        r13 = r0.f22142O;
        if (r13 == r3) goto L_0x0387;
    L_0x0384:
        r8 = r0.f22142O;
        goto L_0x038d;
    L_0x0387:
        r13 = r0.f22141N;
        if (r13 == r3) goto L_0x038d;
    L_0x038b:
        r7 = r0.f22141N;
    L_0x038d:
        r13 = r0.f22133F;
        if (r13 == r3) goto L_0x03ae;
    L_0x0391:
        r6 = r0.f22133F;
        r23 = m12835C(r1, r6);
        if (r23 == 0) goto L_0x04f3;
    L_0x0399:
        r7 = r0.f22132E;
        r6 = r0.f22134G;
        r22 = X.AnonymousClass1ks.f22354E;
        r24 = X.AnonymousClass1ks.f22354E;
        r26 = 0;
        r21 = r2;
        r25 = r6;
        r21.m12908M(r22, r23, r24, r25, r26);
        r2.f22384I = r7;
        goto L_0x04f3;
    L_0x03ae:
        if (r12 == r3) goto L_0x03c6;
    L_0x03b0:
        r23 = m12835C(r1, r12);
        if (r23 == 0) goto L_0x03dd;
    L_0x03b6:
        r22 = X.AnonymousClass1ks.f22357H;
        r24 = X.AnonymousClass1ks.f22357H;
        r11 = r0.leftMargin;
        r21 = r2;
        r25 = r11;
        r26 = r6;
        r21.m12908M(r22, r23, r24, r25, r26);
        goto L_0x03dd;
    L_0x03c6:
        if (r11 == r3) goto L_0x03dd;
    L_0x03c8:
        r23 = m12835C(r1, r11);
        if (r23 == 0) goto L_0x03dd;
    L_0x03ce:
        r22 = X.AnonymousClass1ks.f22357H;
        r24 = X.AnonymousClass1ks.f22359J;
        r11 = r0.leftMargin;
        r21 = r2;
        r25 = r11;
        r26 = r6;
        r21.m12908M(r22, r23, r24, r25, r26);
    L_0x03dd:
        if (r8 == r3) goto L_0x03f5;
    L_0x03df:
        r23 = m12835C(r1, r8);
        if (r23 == 0) goto L_0x040c;
    L_0x03e5:
        r22 = X.AnonymousClass1ks.f22359J;
        r24 = X.AnonymousClass1ks.f22357H;
        r6 = r0.rightMargin;
        r21 = r2;
        r25 = r6;
        r26 = r15;
        r21.m12908M(r22, r23, r24, r25, r26);
        goto L_0x040c;
    L_0x03f5:
        if (r7 == r3) goto L_0x040c;
    L_0x03f7:
        r23 = m12835C(r1, r7);
        if (r23 == 0) goto L_0x040c;
    L_0x03fd:
        r22 = X.AnonymousClass1ks.f22359J;
        r24 = X.AnonymousClass1ks.f22359J;
        r6 = r0.rightMargin;
        r21 = r2;
        r25 = r6;
        r26 = r15;
        r21.m12908M(r22, r23, r24, r25, r26);
    L_0x040c:
        r6 = r0.HB;
        if (r6 == r3) goto L_0x042a;
    L_0x0410:
        r6 = r0.HB;
        r23 = m12835C(r1, r6);
        if (r23 == 0) goto L_0x0447;
    L_0x0418:
        r22 = X.AnonymousClass1ks.f22360K;
        r24 = X.AnonymousClass1ks.f22360K;
        r7 = r0.topMargin;
        r6 = r0.f22148U;
        r21 = r2;
        r25 = r7;
        r26 = r6;
        r21.m12908M(r22, r23, r24, r25, r26);
        goto L_0x0447;
    L_0x042a:
        r6 = r0.GB;
        if (r6 == r3) goto L_0x0447;
    L_0x042e:
        r6 = r0.GB;
        r23 = m12835C(r1, r6);
        if (r23 == 0) goto L_0x0447;
    L_0x0436:
        r22 = X.AnonymousClass1ks.f22360K;
        r24 = X.AnonymousClass1ks.f22353D;
        r7 = r0.topMargin;
        r6 = r0.f22148U;
        r21 = r2;
        r25 = r7;
        r26 = r6;
        r21.m12908M(r22, r23, r24, r25, r26);
    L_0x0447:
        r6 = r0.f22131D;
        if (r6 == r3) goto L_0x0465;
    L_0x044b:
        r6 = r0.f22131D;
        r23 = m12835C(r1, r6);
        if (r23 == 0) goto L_0x0482;
    L_0x0453:
        r22 = X.AnonymousClass1ks.f22353D;
        r24 = X.AnonymousClass1ks.f22360K;
        r7 = r0.bottomMargin;
        r6 = r0.f22143P;
        r21 = r2;
        r25 = r7;
        r26 = r6;
        r21.m12908M(r22, r23, r24, r25, r26);
        goto L_0x0482;
    L_0x0465:
        r6 = r0.f22130C;
        if (r6 == r3) goto L_0x0482;
    L_0x0469:
        r6 = r0.f22130C;
        r23 = m12835C(r1, r6);
        if (r23 == 0) goto L_0x0482;
    L_0x0471:
        r22 = X.AnonymousClass1ks.f22353D;
        r24 = X.AnonymousClass1ks.f22353D;
        r7 = r0.bottomMargin;
        r6 = r0.f22143P;
        r21 = r2;
        r25 = r7;
        r26 = r6;
        r21.m12908M(r22, r23, r24, r25, r26);
    L_0x0482:
        r6 = r0.f22129B;
        if (r6 == r3) goto L_0x04d6;
    L_0x0486:
        r7 = r1.f22180B;
        r6 = r0.f22129B;
        r8 = r7.get(r6);
        r8 = (android.view.View) r8;
        r6 = r0.f22129B;
        r7 = m12835C(r1, r6);
        if (r7 == 0) goto L_0x04d6;
    L_0x0498:
        if (r8 == 0) goto L_0x04d6;
    L_0x049a:
        r6 = r8.getLayoutParams();
        r6 = r6 instanceof X.AnonymousClass1kc;
        if (r6 == 0) goto L_0x04d6;
    L_0x04a2:
        r8 = r8.getLayoutParams();
        r8 = (X.AnonymousClass1kc) r8;
        r6 = 1;
        r0.f22170q = r6;
        r8.f22170q = r6;
        r6 = X.AnonymousClass1ks.f22352C;
        r21 = r2.mo2735E(r6);
        r22 = r7.mo2735E(r6);
        r23 = 0;
        r24 = -1;
        r25 = X.AnonymousClass1kr.f22349D;
        r26 = 0;
        r27 = 1;
        r21.m12889A(r22, r23, r24, r25, r26, r27);
        r6 = X.AnonymousClass1ks.f22360K;
        r6 = r2.mo2735E(r6);
        r6.m12893E();
        r6 = X.AnonymousClass1ks.f22353D;
        r6 = r2.mo2735E(r6);
        r6.m12893E();
    L_0x04d6:
        r8 = 0;
        r6 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1));
        r7 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r6 < 0) goto L_0x04e3;
    L_0x04dd:
        r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r6 == 0) goto L_0x04e3;
    L_0x04e1:
        r2.f22392Q = r9;
    L_0x04e3:
        r6 = r0.IB;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 < 0) goto L_0x04f3;
    L_0x04e9:
        r6 = r0.IB;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 == 0) goto L_0x04f3;
    L_0x04ef:
        r6 = r0.IB;
        r2.f22421t = r6;
    L_0x04f3:
        if (r20 == 0) goto L_0x0505;
    L_0x04f5:
        r6 = r0.f22139L;
        if (r6 != r3) goto L_0x04fd;
    L_0x04f9:
        r6 = r0.f22140M;
        if (r6 == r3) goto L_0x0505;
    L_0x04fd:
        r7 = r0.f22139L;
        r6 = r0.f22140M;
        r2.BB = r7;
        r2.CB = r6;
    L_0x0505:
        r6 = r0.f22155b;
        if (r6 != 0) goto L_0x0531;
    L_0x0509:
        r6 = r0.width;
        if (r6 != r3) goto L_0x0527;
    L_0x050d:
        r6 = X.AnonymousClass1kv.f22375E;
        r2.m12917V(r6);
        r6 = X.AnonymousClass1ks.f22357H;
        r7 = r2.mo2735E(r6);
        r6 = r0.leftMargin;
        r7.f22363D = r6;
        r6 = X.AnonymousClass1ks.f22359J;
        r7 = r2.mo2735E(r6);
        r6 = r0.rightMargin;
        r7.f22363D = r6;
        goto L_0x053b;
    L_0x0527:
        r6 = X.AnonymousClass1kv.f22374D;
        r2.m12917V(r6);
        r6 = 0;
        r2.m12920Y(r6);
        goto L_0x053b;
    L_0x0531:
        r6 = X.AnonymousClass1kv.f22373C;
        r2.m12917V(r6);
        r6 = r0.width;
        r2.m12920Y(r6);
    L_0x053b:
        r6 = r0.KB;
        if (r6 != 0) goto L_0x0568;
    L_0x053f:
        r6 = r0.height;
        if (r6 != r3) goto L_0x055e;
    L_0x0543:
        r6 = X.AnonymousClass1kv.f22375E;
        r2.m12919X(r6);
        r6 = X.AnonymousClass1ks.f22360K;
        r7 = r2.mo2735E(r6);
        r6 = r0.topMargin;
        r7.f22363D = r6;
        r6 = X.AnonymousClass1ks.f22353D;
        r7 = r2.mo2735E(r6);
        r6 = r0.bottomMargin;
        r7.f22363D = r6;
        r9 = 0;
        goto L_0x0573;
    L_0x055e:
        r6 = X.AnonymousClass1kv.f22374D;
        r2.m12919X(r6);
        r9 = 0;
        r2.m12916U(r9);
        goto L_0x0573;
    L_0x0568:
        r9 = 0;
        r6 = X.AnonymousClass1kv.f22373C;
        r2.m12919X(r6);
        r6 = r0.height;
        r2.m12916U(r6);
    L_0x0573:
        r6 = r0.f22137J;
        if (r6 == 0) goto L_0x057c;
    L_0x0577:
        r6 = r0.f22137J;
        r2.m12914S(r6);
    L_0x057c:
        r8 = r0.f22156c;
        r7 = r2.f22425x;
        r6 = 0;
        r7[r6] = r8;
        r8 = r0.LB;
        r7 = r2.f22425x;
        r6 = 1;
        r7[r6] = r8;
        r6 = r0.f22154a;
        r2.f22393R = r6;
        r6 = r0.JB;
        r2.f22422u = r6;
        r11 = r0.f22163j;
        r8 = r0.f22167n;
        r7 = r0.f22165l;
        r6 = r0.f22169p;
        r2.f22401Z = r11;
        r2.f22405d = r8;
        r2.f22403b = r7;
        r2.f22407f = r6;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 >= 0) goto L_0x05af;
    L_0x05a8:
        r6 = r2.f22401Z;
        if (r6 != 0) goto L_0x05af;
    L_0x05ac:
        r6 = 2;
        r2.f22401Z = r6;
    L_0x05af:
        r8 = r0.f22162i;
        r7 = r0.f22166m;
        r6 = r0.f22164k;
        r0 = r0.f22168o;
        r2.f22400Y = r8;
        r2.f22404c = r7;
        r2.f22402a = r6;
        r2.f22406e = r0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x05cc;
    L_0x05c5:
        r0 = r2.f22400Y;
        if (r0 != 0) goto L_0x05cc;
    L_0x05c9:
        r0 = 2;
        r2.f22400Y = r0;
    L_0x05cc:
        r10 = r10 + 1;
        goto L_0x0235;
    L_0x05d0:
        r2 = r1.f22197S;
        r0 = 8;
        r2 = r2 & r0;
        if (r2 != r0) goto L_0x05da;
    L_0x05d7:
        r24 = 1;
        goto L_0x05dc;
    L_0x05da:
        r24 = 0;
    L_0x05dc:
        if (r24 == 0) goto L_0x08bc;
    L_0x05de:
        r2 = r1.f22187I;
        r2.e();
        r0 = r2.f18202F;
        r2.mo2734C(r0);
        r3 = r1.f22187I;
        r2 = r3.f22397V;
        r0 = 0;
        r2 = r2[r0];
        r0 = X.AnonymousClass1kv.f22376F;
        if (r2 == r0) goto L_0x05fe;
    L_0x05f3:
        r0 = r3.f22415n;
        if (r0 == 0) goto L_0x05fe;
    L_0x05f7:
        r2 = r3.f22415n;
        r0 = r19;
        r2.m15400G(r0);
    L_0x05fe:
        r2 = r3.f22397V;
        r0 = 1;
        r2 = r2[r0];
        r0 = X.AnonymousClass1kv.f22376F;
        if (r2 == r0) goto L_0x0612;
    L_0x0607:
        r0 = r3.f22414m;
        if (r0 == 0) goto L_0x0612;
    L_0x060b:
        r2 = r3.f22414m;
        r0 = r18;
        r2.m15400G(r0);
    L_0x0612:
        r0 = r29;
        r9 = r0;
        r8 = r1.getPaddingTop();
        r0 = r1.getPaddingBottom();
        r8 = r8 + r0;
        r7 = r1.getPaddingLeft();
        r0 = r1.getPaddingRight();
        r7 = r7 + r0;
        r6 = r1.getChildCount();
        r14 = 0;
    L_0x062c:
        r21 = 1;
        r2 = 8;
        r0 = -2;
        if (r14 >= r6) goto L_0x06cd;
    L_0x0633:
        r13 = r1.getChildAt(r14);
        r3 = r13.getVisibility();
        if (r3 != r2) goto L_0x063f;
    L_0x063d:
        goto L_0x06c9;
    L_0x063f:
        r12 = r13.getLayoutParams();
        r12 = (X.AnonymousClass1kc) r12;
        r11 = r12.MB;
        r2 = r12.f22157d;
        if (r2 != 0) goto L_0x06c9;
    L_0x064b:
        r2 = r12.f22158e;
        if (r2 == 0) goto L_0x0650;
    L_0x064f:
        goto L_0x06c9;
    L_0x0650:
        r2 = r13.getVisibility();
        r11.f22424w = r2;
        r10 = r12.width;
        r5 = r12.height;
        if (r10 == 0) goto L_0x06bb;
    L_0x065c:
        if (r5 != 0) goto L_0x065f;
    L_0x065e:
        goto L_0x06bb;
    L_0x065f:
        if (r10 != r0) goto L_0x0664;
    L_0x0661:
        r20 = 1;
        goto L_0x0666;
    L_0x0664:
        r20 = 0;
    L_0x0666:
        r2 = getChildMeasureSpec(r9, r7, r10);
        if (r5 != r0) goto L_0x066e;
    L_0x066c:
        r15 = 1;
        goto L_0x066f;
    L_0x066e:
        r15 = 0;
    L_0x066f:
        r0 = getChildMeasureSpec(r4, r8, r5);
        r13.measure(r2, r0);
        r0 = r1.f22190L;
        if (r0 == 0) goto L_0x0680;
    L_0x067a:
        r2 = r0.f22302Q;
        r2 = r2 + r21;
        r0.f22302Q = r2;
    L_0x0680:
        r0 = -2;
        r3 = r13.getMeasuredWidth();
        r2 = r13.getMeasuredHeight();
        r11.m12920Y(r3);
        r11.m12916U(r2);
        if (r20 == 0) goto L_0x0693;
    L_0x0691:
        r11.AB = r3;
    L_0x0693:
        if (r15 == 0) goto L_0x0697;
    L_0x0695:
        r11.f22427z = r2;
    L_0x0697:
        r0 = r12.f22170q;
        if (r0 == 0) goto L_0x06a4;
    L_0x069b:
        r5 = r13.getBaseline();
        r0 = -1;
        if (r5 == r0) goto L_0x06a4;
    L_0x06a2:
        r11.f22379D = r5;
    L_0x06a4:
        r0 = r12.f22155b;
        if (r0 == 0) goto L_0x06c9;
    L_0x06a8:
        r0 = r12.KB;
        if (r0 == 0) goto L_0x06c9;
    L_0x06ac:
        r0 = r11.m12905J();
        r0.m15400G(r3);
        r0 = r11.m12904I();
        r0.m15400G(r2);
        goto L_0x06c9;
    L_0x06bb:
        r0 = r11.m12905J();
        r0.m12927C();
        r0 = r11.m12904I();
        r0.m12927C();
    L_0x06c9:
        r14 = r14 + 1;
        goto L_0x062c;
    L_0x06cd:
        r0 = r1.f22187I;
        r0.f();
        r11 = 0;
    L_0x06d3:
        if (r11 >= r6) goto L_0x08ba;
    L_0x06d5:
        r26 = r1.getChildAt(r11);
        r0 = r26.getVisibility();
        if (r0 != r2) goto L_0x06e1;
    L_0x06df:
        goto L_0x08b4;
    L_0x06e1:
        r10 = r26.getLayoutParams();
        r10 = (X.AnonymousClass1kc) r10;
        r5 = r10.MB;
        r0 = r10.f22157d;
        if (r0 != 0) goto L_0x08b4;
    L_0x06ed:
        r0 = r10.f22158e;
        if (r0 == 0) goto L_0x06f3;
    L_0x06f1:
        goto L_0x08b4;
    L_0x06f3:
        r0 = r26.getVisibility();
        r5.f22424w = r0;
        r12 = r10.width;
        r13 = r10.height;
        if (r12 == 0) goto L_0x0703;
    L_0x06ff:
        if (r13 == 0) goto L_0x0703;
    L_0x0701:
        goto L_0x08b4;
    L_0x0703:
        r0 = X.AnonymousClass1ks.f22357H;
        r0 = r5.mo2735E(r0);
        r3 = r0.f22365F;
        r0 = X.AnonymousClass1ks.f22359J;
        r0 = r5.mo2735E(r0);
        r2 = r0.f22365F;
        r0 = X.AnonymousClass1ks.f22357H;
        r0 = r5.mo2735E(r0);
        r0 = r0.f22368I;
        if (r0 == 0) goto L_0x072a;
    L_0x071d:
        r0 = X.AnonymousClass1ks.f22359J;
        r0 = r5.mo2735E(r0);
        r0 = r0.f22368I;
        if (r0 == 0) goto L_0x072a;
    L_0x0727:
        r21 = 1;
        goto L_0x072c;
    L_0x072a:
        r21 = 0;
    L_0x072c:
        r0 = X.AnonymousClass1ks.f22360K;
        r0 = r5.mo2735E(r0);
        r0 = r0.f22365F;
        r27 = r0;
        r0 = X.AnonymousClass1ks.f22353D;
        r0 = r5.mo2735E(r0);
        r14 = r0.f22365F;
        r0 = X.AnonymousClass1ks.f22360K;
        r0 = r5.mo2735E(r0);
        r0 = r0.f22368I;
        if (r0 == 0) goto L_0x0755;
    L_0x0748:
        r0 = X.AnonymousClass1ks.f22353D;
        r0 = r5.mo2735E(r0);
        r0 = r0.f22368I;
        if (r0 == 0) goto L_0x0755;
    L_0x0752:
        r25 = 1;
        goto L_0x0757;
    L_0x0755:
        r25 = 0;
    L_0x0757:
        if (r12 != 0) goto L_0x0761;
    L_0x0759:
        if (r13 != 0) goto L_0x0761;
    L_0x075b:
        if (r21 == 0) goto L_0x0761;
    L_0x075d:
        if (r25 == 0) goto L_0x0761;
    L_0x075f:
        goto L_0x08b4;
    L_0x0761:
        r0 = r1.f22187I;
        r15 = r0.m12903H();
        r0 = X.AnonymousClass1kv.f22376F;
        if (r15 == r0) goto L_0x076e;
    L_0x076b:
        r23 = 1;
        goto L_0x0770;
    L_0x076e:
        r23 = 0;
    L_0x0770:
        r0 = r1.f22187I;
        r15 = r0.m12906K();
        r0 = X.AnonymousClass1kv.f22376F;
        if (r15 == r0) goto L_0x077d;
    L_0x077a:
        r22 = 1;
        goto L_0x077f;
    L_0x077d:
        r22 = 0;
    L_0x077f:
        if (r23 != 0) goto L_0x0788;
    L_0x0781:
        r0 = r5.m12905J();
        r0.m12927C();
    L_0x0788:
        if (r22 != 0) goto L_0x0791;
    L_0x078a:
        r0 = r5.m12904I();
        r0.m12927C();
    L_0x0791:
        if (r12 != 0) goto L_0x07e0;
    L_0x0793:
        if (r23 == 0) goto L_0x07d6;
    L_0x0795:
        r0 = r5.f22401Z;
        r20 = 0;
        if (r0 != 0) goto L_0x07b4;
    L_0x079b:
        r0 = r5.f22387L;
        r15 = 0;
        r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1));
        if (r0 != 0) goto L_0x07b4;
    L_0x07a2:
        r0 = r5.f22405d;
        if (r0 != 0) goto L_0x07b4;
    L_0x07a6:
        r0 = r5.f22403b;
        if (r0 != 0) goto L_0x07b4;
    L_0x07aa:
        r0 = r5.f22397V;
        r15 = r0[r20];
        r0 = X.AnonymousClass1kv.f22374D;
        if (r15 != r0) goto L_0x07b4;
    L_0x07b2:
        r20 = 1;
    L_0x07b4:
        if (r20 == 0) goto L_0x07d6;
    L_0x07b6:
        if (r21 == 0) goto L_0x07d6;
    L_0x07b8:
        r0 = r3.m12928D();
        if (r0 == 0) goto L_0x07d6;
    L_0x07be:
        r0 = r2.m12928D();
        if (r0 == 0) goto L_0x07d6;
    L_0x07c4:
        r2 = r2.f29862D;
        r0 = r3.f29862D;
        r2 = r2 - r0;
        r12 = (int) r2;
        r0 = r5.m12905J();
        r0.m15400G(r12);
        r3 = getChildMeasureSpec(r9, r7, r12);
        goto L_0x07e8;
    L_0x07d6:
        r0 = -2;
        r3 = getChildMeasureSpec(r9, r7, r0);
        r21 = 1;
        r23 = 0;
        goto L_0x07f6;
    L_0x07e0:
        r2 = -2;
        r0 = -1;
        if (r12 != r0) goto L_0x07eb;
    L_0x07e4:
        r3 = getChildMeasureSpec(r9, r7, r0);
    L_0x07e8:
        r21 = 0;
        goto L_0x07f6;
    L_0x07eb:
        if (r12 != r2) goto L_0x07f0;
    L_0x07ed:
        r21 = 1;
        goto L_0x07f2;
    L_0x07f0:
        r21 = 0;
    L_0x07f2:
        r3 = getChildMeasureSpec(r9, r7, r12);
    L_0x07f6:
        if (r13 != 0) goto L_0x0848;
    L_0x07f8:
        if (r22 == 0) goto L_0x083e;
    L_0x07fa:
        r0 = r5.f22400Y;
        r15 = 1;
        if (r0 != 0) goto L_0x0817;
    L_0x07ff:
        r0 = r5.f22387L;
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0817;
    L_0x0806:
        r0 = r5.f22404c;
        if (r0 != 0) goto L_0x0817;
    L_0x080a:
        r0 = r5.f22402a;
        if (r0 != 0) goto L_0x0817;
    L_0x080e:
        r0 = r5.f22397V;
        r2 = r0[r15];
        r0 = X.AnonymousClass1kv.f22374D;
        if (r2 != r0) goto L_0x0817;
    L_0x0816:
        goto L_0x0818;
    L_0x0817:
        r15 = 0;
    L_0x0818:
        if (r15 == 0) goto L_0x083e;
    L_0x081a:
        if (r25 == 0) goto L_0x083e;
    L_0x081c:
        r0 = r27;
        r0 = r0.m12928D();
        if (r0 == 0) goto L_0x083e;
    L_0x0824:
        r0 = r14.m12928D();
        if (r0 == 0) goto L_0x083e;
    L_0x082a:
        r2 = r14.f29862D;
        r0 = r27;
        r0 = r0.f29862D;
        r2 = r2 - r0;
        r13 = (int) r2;
        r0 = r5.m12904I();
        r0.m15400G(r13);
        r2 = getChildMeasureSpec(r4, r8, r13);
        goto L_0x0850;
    L_0x083e:
        r0 = -2;
        r2 = getChildMeasureSpec(r4, r8, r0);
        r20 = 1;
        r22 = 0;
        goto L_0x085e;
    L_0x0848:
        r2 = -2;
        r0 = -1;
        if (r13 != r0) goto L_0x0853;
    L_0x084c:
        r2 = getChildMeasureSpec(r4, r8, r0);
    L_0x0850:
        r20 = 0;
        goto L_0x085e;
    L_0x0853:
        if (r13 != r2) goto L_0x0858;
    L_0x0855:
        r20 = 1;
        goto L_0x085a;
    L_0x0858:
        r20 = 0;
    L_0x085a:
        r2 = getChildMeasureSpec(r4, r8, r13);
    L_0x085e:
        r0 = r26;
        r0.measure(r3, r2);
        r0 = r1.f22190L;
        if (r0 == 0) goto L_0x086e;
    L_0x0867:
        r2 = r0.f22302Q;
        r14 = 1;
        r2 = r2 + r14;
        r0.f22302Q = r2;
    L_0x086e:
        r0 = -2;
        r2 = r26.getMeasuredWidth();
        r3 = r26.getMeasuredHeight();
        r5.m12920Y(r2);
        r5.m12916U(r3);
        if (r21 == 0) goto L_0x0881;
    L_0x087f:
        r5.AB = r2;
    L_0x0881:
        if (r20 == 0) goto L_0x0885;
    L_0x0883:
        r5.f22427z = r3;
    L_0x0885:
        if (r23 == 0) goto L_0x088f;
    L_0x0887:
        r0 = r5.m12905J();
        r0.m15400G(r2);
        goto L_0x0896;
    L_0x088f:
        r2 = r5.m12905J();
        r0 = 2;
        r2.f22430C = r0;
    L_0x0896:
        if (r22 == 0) goto L_0x08a0;
    L_0x0898:
        r0 = r5.m12904I();
        r0.m15400G(r3);
        goto L_0x08a7;
    L_0x08a0:
        r2 = r5.m12904I();
        r0 = 2;
        r2.f22430C = r0;
    L_0x08a7:
        r0 = r10.f22170q;
        if (r0 == 0) goto L_0x08b4;
    L_0x08ab:
        r2 = r26.getBaseline();
        r0 = -1;
        if (r2 == r0) goto L_0x08b4;
    L_0x08b2:
        r5.f22379D = r2;
    L_0x08b4:
        r11 = r11 + 1;
        r2 = 8;
        goto L_0x06d3;
    L_0x08ba:
        goto L_0x09a0;
    L_0x08bc:
        r0 = r29;
        r15 = r0;
        r14 = r1.getPaddingTop();
        r0 = r1.getPaddingBottom();
        r14 = r14 + r0;
        r13 = r1.getPaddingLeft();
        r0 = r1.getPaddingRight();
        r13 = r13 + r0;
        r12 = r1.getChildCount();
        r11 = 0;
    L_0x08d6:
        if (r11 >= r12) goto L_0x09a0;
    L_0x08d8:
        r10 = r1.getChildAt(r11);
        r2 = r10.getVisibility();
        r0 = 8;
        if (r2 != r0) goto L_0x08e6;
    L_0x08e4:
        goto L_0x099c;
    L_0x08e6:
        r9 = r10.getLayoutParams();
        r9 = (X.AnonymousClass1kc) r9;
        r8 = r9.MB;
        r0 = r9.f22157d;
        if (r0 != 0) goto L_0x099c;
    L_0x08f2:
        r0 = r9.f22158e;
        if (r0 == 0) goto L_0x08f8;
    L_0x08f6:
        goto L_0x099c;
    L_0x08f8:
        r0 = r10.getVisibility();
        r8.f22424w = r0;
        r7 = r9.width;
        r6 = r9.height;
        r2 = r9.f22155b;
        r0 = -1;
        r3 = 1;
        if (r2 != 0) goto L_0x0927;
    L_0x0908:
        r2 = r9.KB;
        if (r2 != 0) goto L_0x0927;
    L_0x090c:
        r2 = r9.f22155b;
        if (r2 != 0) goto L_0x0914;
    L_0x0910:
        r2 = r9.f22163j;
        if (r2 == r3) goto L_0x0927;
    L_0x0914:
        r2 = r9.width;
        if (r2 == r0) goto L_0x0927;
    L_0x0918:
        r2 = r9.KB;
        if (r2 != 0) goto L_0x0925;
    L_0x091c:
        r2 = r9.f22162i;
        if (r2 == r3) goto L_0x0927;
    L_0x0920:
        r2 = r9.height;
        if (r2 != r0) goto L_0x0925;
    L_0x0924:
        goto L_0x0927;
    L_0x0925:
        r2 = 0;
        goto L_0x0928;
    L_0x0927:
        r2 = 1;
    L_0x0928:
        if (r2 == 0) goto L_0x097d;
    L_0x092a:
        r5 = -2;
        if (r7 != 0) goto L_0x0934;
    L_0x092d:
        r2 = getChildMeasureSpec(r15, r13, r5);
        r23 = 1;
        goto L_0x0948;
    L_0x0934:
        if (r7 != r0) goto L_0x093d;
    L_0x0936:
        r2 = getChildMeasureSpec(r15, r13, r0);
        r23 = 0;
        goto L_0x0948;
    L_0x093d:
        if (r7 != r5) goto L_0x0942;
    L_0x093f:
        r23 = 1;
        goto L_0x0944;
    L_0x0942:
        r23 = 0;
    L_0x0944:
        r2 = getChildMeasureSpec(r15, r13, r7);
    L_0x0948:
        if (r6 != 0) goto L_0x0951;
    L_0x094a:
        r0 = getChildMeasureSpec(r4, r14, r5);
        r22 = 1;
        goto L_0x0965;
    L_0x0951:
        if (r6 != r0) goto L_0x095a;
    L_0x0953:
        r0 = getChildMeasureSpec(r4, r14, r0);
        r22 = 0;
        goto L_0x0965;
    L_0x095a:
        if (r6 != r5) goto L_0x095f;
    L_0x095c:
        r22 = 1;
        goto L_0x0961;
    L_0x095f:
        r22 = 0;
    L_0x0961:
        r0 = getChildMeasureSpec(r4, r14, r6);
    L_0x0965:
        r10.measure(r2, r0);
        r0 = r1.f22190L;
        if (r0 == 0) goto L_0x0974;
    L_0x096c:
        r2 = r0.f22302Q;
        r20 = 1;
        r2 = r2 + r20;
        r0.f22302Q = r2;
    L_0x0974:
        r7 = r10.getMeasuredWidth();
        r6 = r10.getMeasuredHeight();
        goto L_0x0981;
    L_0x097d:
        r23 = 0;
        r22 = 0;
    L_0x0981:
        r8.m12920Y(r7);
        r8.m12916U(r6);
        if (r23 == 0) goto L_0x098b;
    L_0x0989:
        r8.AB = r7;
    L_0x098b:
        if (r22 == 0) goto L_0x098f;
    L_0x098d:
        r8.f22427z = r6;
    L_0x098f:
        r0 = r9.f22170q;
        if (r0 == 0) goto L_0x099c;
    L_0x0993:
        r2 = r10.getBaseline();
        r0 = -1;
        if (r2 == r0) goto L_0x099c;
    L_0x099a:
        r8.f22379D = r2;
    L_0x099c:
        r11 = r11 + 1;
        goto L_0x08d6;
    L_0x09a0:
        r6 = r1.getChildCount();
        r5 = 0;
        r3 = 0;
    L_0x09a6:
        if (r3 >= r6) goto L_0x09b8;
    L_0x09a8:
        r2 = r1.getChildAt(r3);
        r0 = r2 instanceof X.AnonymousClass1kg;
        if (r0 == 0) goto L_0x09b5;
    L_0x09b0:
        r2 = (X.AnonymousClass1kg) r2;
        r2.m12849A(r1);
    L_0x09b5:
        r3 = r3 + 1;
        goto L_0x09a6;
    L_0x09b8:
        r0 = r1.f22181C;
        r2 = r0.size();
        if (r2 <= 0) goto L_0x09cd;
    L_0x09c0:
        if (r5 >= r2) goto L_0x09cd;
    L_0x09c2:
        r0 = r1.f22181C;
        r0 = r0.get(r5);
        r0 = (X.AnonymousClass1ka) r0;
        r5 = r5 + 1;
        goto L_0x09c0;
    L_0x09cd:
        r0 = r1.getChildCount();
        if (r0 <= 0) goto L_0x09d8;
    L_0x09d3:
        r0 = "First pass";
        r1.m12840D(r0);
    L_0x09d8:
        r0 = r1.f22193O;
        r5 = r0.size();
        r0 = r1.getPaddingBottom();
        r16 = r16 + r0;
        r0 = r1.getPaddingRight();
        r17 = r17 + r0;
        if (r5 <= 0) goto L_0x0bcf;
    L_0x09ec:
        r0 = r1.f22187I;
        r2 = r0.m12903H();
        r0 = X.AnonymousClass1kv.f22376F;
        if (r2 != r0) goto L_0x09f9;
    L_0x09f6:
        r22 = 1;
        goto L_0x09fb;
    L_0x09f9:
        r22 = 0;
    L_0x09fb:
        r0 = r1.f22187I;
        r2 = r0.m12906K();
        r0 = X.AnonymousClass1kv.f22376F;
        if (r2 != r0) goto L_0x0a08;
    L_0x0a05:
        r21 = 1;
        goto L_0x0a0a;
    L_0x0a08:
        r21 = 0;
    L_0x0a0a:
        r0 = r1.f22187I;
        r2 = r0.m12907L();
        r0 = r1.f22192N;
        r9 = java.lang.Math.max(r2, r0);
        r0 = r1.f22187I;
        r2 = r0.m12902G();
        r0 = r1.f22191M;
        r3 = java.lang.Math.max(r2, r0);
        r10 = 0;
        r20 = 0;
        r6 = 0;
    L_0x0a26:
        r14 = 1;
        if (r10 >= r5) goto L_0x0b41;
    L_0x0a2a:
        r0 = r1.f22193O;
        r12 = r0.get(r10);
        r12 = (X.AnonymousClass1kw) r12;
        r11 = r12.f22385J;
        r11 = (android.view.View) r11;
        if (r11 != 0) goto L_0x0a3a;
    L_0x0a38:
        goto L_0x0b3d;
    L_0x0a3a:
        r13 = r11.getLayoutParams();
        r13 = (X.AnonymousClass1kc) r13;
        r0 = r13.f22158e;
        if (r0 != 0) goto L_0x0b3d;
    L_0x0a44:
        r0 = r13.f22157d;
        if (r0 == 0) goto L_0x0a4a;
    L_0x0a48:
        goto L_0x0b3d;
    L_0x0a4a:
        r2 = r11.getVisibility();
        r0 = 8;
        if (r2 != r0) goto L_0x0a54;
    L_0x0a52:
        goto L_0x0b3d;
    L_0x0a54:
        if (r24 == 0) goto L_0x0a6c;
    L_0x0a56:
        r0 = r12.m12905J();
        r0 = r0.m12928D();
        if (r0 == 0) goto L_0x0a6c;
    L_0x0a60:
        r0 = r12.m12904I();
        r0 = r0.m12928D();
        if (r0 == 0) goto L_0x0a6c;
    L_0x0a6a:
        goto L_0x0b3d;
    L_0x0a6c:
        r2 = r13.width;
        r0 = -2;
        if (r2 != r0) goto L_0x0a80;
    L_0x0a71:
        r0 = r13.f22155b;
        if (r0 == 0) goto L_0x0a80;
    L_0x0a75:
        r7 = r13.width;
        r2 = r17;
        r0 = r29;
        r7 = getChildMeasureSpec(r0, r2, r7);
        goto L_0x0a8a;
    L_0x0a80:
        r2 = r12.m12907L();
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0);
    L_0x0a8a:
        r2 = r13.height;
        r0 = -2;
        if (r2 != r0) goto L_0x0a9c;
    L_0x0a8f:
        r0 = r13.KB;
        if (r0 == 0) goto L_0x0a9c;
    L_0x0a93:
        r2 = r13.height;
        r0 = r16;
        r0 = getChildMeasureSpec(r4, r0, r2);
        goto L_0x0aa6;
    L_0x0a9c:
        r2 = r12.m12902G();
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0);
    L_0x0aa6:
        r11.measure(r7, r0);
        r0 = r1.f22190L;
        if (r0 == 0) goto L_0x0ab2;
    L_0x0aad:
        r7 = r0.f22287B;
        r7 = r7 + r14;
        r0.f22287B = r7;
    L_0x0ab2:
        r2 = r11.getMeasuredWidth();
        r7 = r11.getMeasuredHeight();
        r0 = r12.m12907L();
        if (r2 == r0) goto L_0x0aeb;
    L_0x0ac0:
        r12.m12920Y(r2);
        if (r24 == 0) goto L_0x0acc;
    L_0x0ac5:
        r0 = r12.m12905J();
        r0.m15400G(r2);
    L_0x0acc:
        if (r22 == 0) goto L_0x0ae9;
    L_0x0ace:
        r2 = r12.BB;
        r0 = r12.f22426y;
        r2 = r2 + r0;
        if (r2 <= r9) goto L_0x0ae9;
    L_0x0ad5:
        r2 = r12.BB;
        r0 = r12.f22426y;
        r2 = r2 + r0;
        r0 = X.AnonymousClass1ks.f22359J;
        r0 = r12.mo2735E(r0);
        r0 = r0.m12890B();
        r2 = r2 + r0;
        r9 = java.lang.Math.max(r9, r2);
    L_0x0ae9:
        r20 = 1;
    L_0x0aeb:
        r0 = r12.m12902G();
        if (r7 == r0) goto L_0x0b1c;
    L_0x0af1:
        r12.m12916U(r7);
        if (r24 == 0) goto L_0x0afd;
    L_0x0af6:
        r0 = r12.m12904I();
        r0.m15400G(r7);
    L_0x0afd:
        if (r21 == 0) goto L_0x0b1a;
    L_0x0aff:
        r2 = r12.CB;
        r0 = r12.f22391P;
        r2 = r2 + r0;
        if (r2 <= r3) goto L_0x0b1a;
    L_0x0b06:
        r2 = r12.CB;
        r0 = r12.f22391P;
        r2 = r2 + r0;
        r0 = X.AnonymousClass1ks.f22353D;
        r0 = r12.mo2735E(r0);
        r0 = r0.m12890B();
        r2 = r2 + r0;
        r3 = java.lang.Math.max(r3, r2);
    L_0x0b1a:
        r20 = 1;
    L_0x0b1c:
        r0 = r13.f22170q;
        if (r0 == 0) goto L_0x0b2f;
    L_0x0b20:
        r2 = r11.getBaseline();
        r0 = -1;
        if (r2 == r0) goto L_0x0b2f;
    L_0x0b27:
        r0 = r12.f22379D;
        if (r2 == r0) goto L_0x0b2f;
    L_0x0b2b:
        r12.f22379D = r2;
        r20 = 1;
    L_0x0b2f:
        r2 = android.os.Build.VERSION.SDK_INT;
        r0 = 11;
        if (r2 < r0) goto L_0x0b3d;
    L_0x0b35:
        r0 = r11.getMeasuredState();
        r6 = combineMeasuredStates(r6, r0);
    L_0x0b3d:
        r10 = r10 + 1;
        goto L_0x0a26;
    L_0x0b41:
        if (r20 == 0) goto L_0x0b82;
    L_0x0b43:
        r2 = r1.f22187I;
        r0 = r19;
        r2.m12920Y(r0);
        r2 = r1.f22187I;
        r0 = r18;
        r2.m12916U(r0);
        if (r24 == 0) goto L_0x0b58;
    L_0x0b53:
        r0 = r1.f22187I;
        r0.f();
    L_0x0b58:
        r0 = "2nd pass";
        r1.m12840D(r0);
        r0 = r1.f22187I;
        r0 = r0.m12907L();
        if (r0 >= r9) goto L_0x0b6c;
    L_0x0b65:
        r0 = r1.f22187I;
        r0.m12920Y(r9);
        r2 = 1;
        goto L_0x0b6d;
    L_0x0b6c:
        r2 = 0;
    L_0x0b6d:
        r0 = r1.f22187I;
        r0 = r0.m12902G();
        if (r0 >= r3) goto L_0x0b7b;
    L_0x0b75:
        r0 = r1.f22187I;
        r0.m12916U(r3);
        r2 = 1;
    L_0x0b7b:
        if (r2 == 0) goto L_0x0b82;
    L_0x0b7d:
        r0 = "3rd pass";
        r1.m12840D(r0);
    L_0x0b82:
        r7 = 0;
    L_0x0b83:
        if (r7 >= r5) goto L_0x0bd0;
    L_0x0b85:
        r0 = r1.f22193O;
        r9 = r0.get(r7);
        r9 = (X.AnonymousClass1kw) r9;
        r8 = r9.f22385J;
        r8 = (android.view.View) r8;
        if (r8 != 0) goto L_0x0b94;
    L_0x0b93:
        goto L_0x0bcc;
    L_0x0b94:
        r2 = r8.getMeasuredWidth();
        r0 = r9.m12907L();
        if (r2 != r0) goto L_0x0ba8;
    L_0x0b9e:
        r2 = r8.getMeasuredHeight();
        r0 = r9.m12902G();
        if (r2 == r0) goto L_0x0bcc;
    L_0x0ba8:
        r2 = r9.f22424w;
        r0 = 8;
        if (r2 == r0) goto L_0x0bcc;
    L_0x0bae:
        r0 = r9.m12907L();
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3);
        r0 = r9.m12902G();
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3);
        r8.measure(r2, r0);
        r0 = r1.f22190L;
        if (r0 == 0) goto L_0x0bcc;
    L_0x0bc7:
        r2 = r0.f22287B;
        r2 = r2 + r14;
        r0.f22287B = r2;
    L_0x0bcc:
        r7 = r7 + 1;
        goto L_0x0b83;
    L_0x0bcf:
        r6 = 0;
    L_0x0bd0:
        r0 = r1.f22187I;
        r3 = r0.m12907L();
        r3 = r3 + r17;
        r0 = r1.f22187I;
        r5 = r0.m12902G();
        r5 = r5 + r16;
        r2 = android.os.Build.VERSION.SDK_INT;
        r0 = 11;
        if (r2 < r0) goto L_0x0c19;
    L_0x0be6:
        r0 = r29;
        r3 = resolveSizeAndState(r3, r0, r6);
        r0 = r6 << 16;
        r2 = resolveSizeAndState(r5, r4, r0);
        r0 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r3 = r3 & r0;
        r2 = r2 & r0;
        r0 = r1.f22189K;
        r4 = java.lang.Math.min(r0, r3);
        r0 = r1.f22188J;
        r3 = java.lang.Math.min(r0, r2);
        r0 = r1.f22187I;
        r0 = r0.f18210N;
        r2 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        if (r0 == 0) goto L_0x0c0c;
    L_0x0c0b:
        r4 = r4 | r2;
    L_0x0c0c:
        r0 = r1.f22187I;
        r0 = r0.f18198B;
        if (r0 == 0) goto L_0x0c13;
    L_0x0c12:
        r3 = r3 | r2;
    L_0x0c13:
        r1.setMeasuredDimension(r4, r3);
        r1.f22196R = r4;
        goto L_0x0c1e;
    L_0x0c19:
        r1.setMeasuredDimension(r3, r5);
        r1.f22196R = r3;
    L_0x0c1e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        AnonymousClass1kw B = m12838B(view);
        if ((view instanceof Guideline) && !(B instanceof AnonymousClass2Nt)) {
            AnonymousClass1kc anonymousClass1kc = (AnonymousClass1kc) view.getLayoutParams();
            anonymousClass1kc.MB = new AnonymousClass2Nt();
            anonymousClass1kc.f22157d = true;
            ((AnonymousClass2Nt) anonymousClass1kc.MB).m15387b(anonymousClass1kc.f22171r);
        }
        if (view instanceof AnonymousClass1ka) {
            AnonymousClass1ka anonymousClass1ka = (AnonymousClass1ka) view;
            anonymousClass1ka.m12832C();
            ((AnonymousClass1kc) view.getLayoutParams()).f22158e = true;
            if (!this.f22181C.contains(anonymousClass1ka)) {
                this.f22181C.add(anonymousClass1ka);
            }
        }
        this.f22180B.put(view.getId(), view);
        this.f22195Q = true;
    }

    public final void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f22180B.remove(view.getId());
        AnonymousClass1kw B = m12838B(view);
        this.f22187I.f29872B.remove(B);
        B.f22413l = null;
        this.f22181C.remove(view);
        this.f22193O.remove(B);
        this.f22195Q = true;
    }

    public final void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public final void requestLayout() {
        super.requestLayout();
        this.f22195Q = true;
        this.f22196R = -1;
        this.f22186H = -1;
        this.f22185G = 0;
        this.f22184F = 0;
    }

    public void setConstraintSet(AnonymousClass1ke anonymousClass1ke) {
        this.f22182D = anonymousClass1ke;
    }

    public void setId(int i) {
        this.f22180B.remove(getId());
        super.setId(i);
        this.f22180B.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f22188J) {
            this.f22188J = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f22189K) {
            this.f22189K = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f22191M) {
            this.f22191M = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f22192N) {
            this.f22192N = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f22187I.f18202F = i;
    }
}
