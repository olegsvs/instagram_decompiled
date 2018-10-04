package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5r2 */
public final class AnonymousClass5r2 extends AnonymousClass0nJ {
    /* renamed from: B */
    public AnonymousClass6EV f69390B;
    /* renamed from: C */
    public final List f69391C;
    /* renamed from: D */
    public String f69392D;

    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public AnonymousClass5r2(List list, AnonymousClass6EV anonymousClass6EV) {
        List arrayList = new ArrayList();
        this.f69391C = arrayList;
        arrayList.addAll(list);
        this.f69390B = anonymousClass6EV;
    }

    /* renamed from: B */
    public final int m28556B() {
        return this.f69391C.size() + 1;
    }

    /* renamed from: I */
    public final void m28557I(X.AnonymousClass0oo r9, int r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = r9.f10374F;
        switch(r0) {
            case 0: goto L_0x013b;
            case 1: goto L_0x000d;
            default: goto L_0x0005;
        };
    L_0x0005:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Unsupported ViewHolder type";
        r1.<init>(r0);
        throw r1;
    L_0x000d:
        r9 = (X.AnonymousClass5r0) r9;
        r1 = r8.f69391C;
        r0 = r10 + -1;
        r3 = r1.get(r0);
        r3 = (X.AnonymousClass5qp) r3;
        r0 = r9.f10370B;
        r4 = r0.getContext();
        r6 = r3.f69354B;
        r5 = r6.f15084C;
        r0 = r5.f15088C;
        r2 = 0;
        r7 = r0.get(r2);
        r7 = (X.AnonymousClass0ok) r7;
        r1 = r9.f69386I;
        r0 = r7.f10343I;
        r0 = r0.f11230B;
        r0 = X.AnonymousClass5r0.m28554B(r0);
        r1.setText(r0);
        r1 = r9.f69381D;
        r0 = r5.f15093H;
        r0 = X.AnonymousClass5r0.m28554B(r0);
        r1.setText(r0);
        r5 = r9.f69384G;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r3.f69355C;
        r0 = r0.A();
        r0 = r0.name();
        r1.append(r0);
        r0 = " - Priority ";
        r1.append(r0);
        r0 = r6.f15086E;
        r1.append(r0);
        r0 = r1.toString();
        r5.setText(r0);
        r1 = r9.f69379B;
        r0 = r7.f10336B;
        r0 = r0.f11230B;
        r0 = X.AnonymousClass5r0.m28554B(r0);
        r1.setText(r0);
        r7 = r9.f69385H;
        r5 = r3.f69355C;
        r0 = r3.f69354B;
        r1 = r0.f15084C;
        r8 = new java.lang.StringBuilder;
        r0 = "Surface requires triggers: ";
        r8.<init>(r0);
        r0 = r5.B();
        r0 = r0.toArray();
        r0 = java.util.Arrays.toString(r0);
        r8.append(r0);
        r5 = new java.lang.StringBuilder;
        r0 = "QP contains triggers: ";
        r5.<init>(r0);
        r0 = r1.f15095J;
        r0 = r0.toArray();
        r0 = java.util.Arrays.toString(r0);
        r5.append(r0);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r8.toString();
        r1.append(r0);
        r0 = 10;
        r1.append(r0);
        r0 = r5.toString();
        r1.append(r0);
        r0 = r1.toString();
        r7.setText(r0);
        r5 = r9.f69380C;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r6.B();
        r0 = X.AnonymousClass5r0.m28555C(r4, r0);
        r1.append(r0);
        r0 = " - ";
        r1.append(r0);
        r0 = r6.A();
        r0 = X.AnonymousClass5r0.m28555C(r4, r0);
        r1.append(r0);
        r0 = r1.toString();
        r5.setText(r0);
        r0 = r3.m28551A();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x010e;
    L_0x00fa:
        r1 = r9.f69383F;
        r0 = "Quick Promotion is qualified";
        r1.setText(r0);
        r1 = r9.f69383F;
        r0 = 2131099866; // 0x7f0600da float:1.7812097E38 double:1.0529032316E-314;
        r0 = X.AnonymousClass0Ca.C(r4, r0);
        r1.setTextColor(r0);
        goto L_0x0123;
    L_0x010e:
        r1 = r9.f69383F;
        r0 = r3.m28551A();
        r1.setText(r0);
        r1 = r9.f69383F;
        r0 = 2131099865; // 0x7f0600d9 float:1.7812095E38 double:1.052903231E-314;
        r0 = X.AnonymousClass0Ca.C(r4, r0);
        r1.setTextColor(r0);
    L_0x0123:
        r1 = X.AnonymousClass0o3.TOOLTIP;
        r0 = r3.f69355C;
        r0 = r0.A();
        if (r1 != r0) goto L_0x0133;
    L_0x012d:
        r0 = r9.f69387J;
        r0.setVisibility(r2);
        goto L_0x013a;
    L_0x0133:
        r1 = r9.f69387J;
        r0 = 8;
        r1.setVisibility(r0);
    L_0x013a:
        goto L_0x0160;
    L_0x013b:
        r9 = (X.AnonymousClass5r1) r9;
        r3 = r8.f69392D;
        if (r3 != 0) goto L_0x0149;
    L_0x0141:
        r1 = r9.f69388B;
        r0 = "";
        r1.setText(r0);
        goto L_0x0160;
    L_0x0149:
        r2 = 0;
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0154 }
        r1.<init>(r3);	 Catch:{ JSONException -> 0x0154 }
        r0 = 2;	 Catch:{ JSONException -> 0x0154 }
        r2 = r1.toString(r0);	 Catch:{ JSONException -> 0x0154 }
    L_0x0154:
        r1 = r9.f69388B;
        r0 = android.text.TextUtils.isEmpty(r2);
        if (r0 != 0) goto L_0x015d;
    L_0x015c:
        r3 = r2;
    L_0x015d:
        r1.setText(r3);
    L_0x0160:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5r2.I(X.0oo, int):void");
    }

    /* renamed from: J */
    public final AnonymousClass0oo m28558J(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        AnonymousClass0oo anonymousClass5r1;
        switch (i) {
            case 0:
                anonymousClass5r1 = new AnonymousClass5r1(from.inflate(C0164R.layout.quick_promotion_raw_text_item, viewGroup, false));
                anonymousClass5r1.f69389C.setOnClickListener(new AnonymousClass5qz(this, anonymousClass5r1));
                return anonymousClass5r1;
            case 1:
                anonymousClass5r1 = new AnonymousClass5r0(from.inflate(C0164R.layout.quick_promotion_item, viewGroup, false));
                anonymousClass5r1.f69382E.setOnClickListener(new AnonymousClass5qy(this, anonymousClass5r1));
                return anonymousClass5r1;
            default:
                throw new IllegalArgumentException("Unsupported item type");
        }
    }
}
