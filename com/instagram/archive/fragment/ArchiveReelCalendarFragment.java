package com.instagram.archive.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0Hj;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IT;
import X.AnonymousClass0Jd;
import X.AnonymousClass0MI;
import X.AnonymousClass0Ny;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0hR;
import X.AnonymousClass0lG;
import X.AnonymousClass2zN;
import X.AnonymousClass2zo;
import X.AnonymousClass3Uq;
import X.AnonymousClass3bG;
import X.AnonymousClass48i;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.calendar.CalendarRecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class ArchiveReelCalendarFragment extends AnonymousClass0IJ implements AnonymousClass3bG, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass2zo f50779B;
    /* renamed from: C */
    public final Map f50780C = new LinkedHashMap();
    /* renamed from: D */
    public boolean f50781D;
    /* renamed from: E */
    public String f50782E;
    /* renamed from: F */
    public RectF f50783F;
    /* renamed from: G */
    public AnonymousClass0Cm f50784G;
    /* renamed from: H */
    private AnonymousClass2zN f50785H;
    public CalendarRecyclerView mCalendar;
    public View mLoadingSpinner;

    public final void Iw(AnonymousClass0MI anonymousClass0MI) {
    }

    public final void Mm(AnonymousClass3Uq anonymousClass3Uq) {
    }

    public final String getModuleName() {
        return "archive_calendar";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m23409B(com.instagram.archive.fragment.ArchiveReelCalendarFragment r16) {
        /*
        r6 = r16;
        r0 = r6.f50781D;
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0 = "UTC";
        r0 = java.util.TimeZone.getTimeZone(r0);
        r5 = java.util.Calendar.getInstance(r0);
        r11 = java.util.Calendar.getInstance();
        r0 = r6.f50780C;
        r0 = r0.values();
        r10 = r0.iterator();
    L_0x0024:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x0078;
    L_0x002a:
        r0 = r10.next();
        r0 = (X.AnonymousClass0IC) r0;
        r2 = r0.f2727B;
        r2 = (X.AnonymousClass30J) r2;
        r4 = r0.f2728C;
        r4 = (X.AnonymousClass0MI) r4;
        r0 = r4.T();
        if (r0 != 0) goto L_0x0024;
    L_0x003e:
        r9 = new java.util.Date;
        r0 = r2.f36800E;
        r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r7;
        r9.<init>(r0);
        r5.setTime(r9);
        r0 = 1;
        r12 = r5.get(r0);
        r0 = 2;
        r13 = r5.get(r0);
        r0 = 5;
        r14 = r5.get(r0);
        r11.clear();
        r15 = 0;
        r16 = 0;
        r11.set(r12, r13, r14, r15, r16);
        r0 = r2.f36797B;
        if (r0 == 0) goto L_0x006a;
    L_0x0067:
        r2 = r0.f36805B;
        goto L_0x006b;
    L_0x006a:
        r2 = 0;
    L_0x006b:
        r1 = new X.2zn;
        r0 = r11.getTime();
        r1.<init>(r4, r0, r2);
        r3.add(r1);
        goto L_0x0024;
    L_0x0078:
        r5 = r6.f50779B;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r0 = r5.f36721C;
        r0.clear();
        r0 = r5.f36723E;
        r0.clear();
        r4 = r3.iterator();
    L_0x008d:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00b6;
    L_0x0093:
        r0 = r4.next();
        r0 = (X.AnonymousClass2zn) r0;
        r3 = r0.f36718C;
        r2 = r0.f36719D;
        r1 = r0.f36717B;
        r0 = new X.2zp;
        r0.<init>(r2, r3, r1);
        r7.add(r0);
        r0 = r5.f36721C;
        r0.add(r2);
        r1 = r5.f36723E;
        r0 = r2.getId();
        r1.put(r0, r3);
        goto L_0x008d;
    L_0x00b6:
        r0 = new X.2zj;
        r0.<init>(r5);
        java.util.Collections.sort(r7, r0);
        r2 = new java.util.Date;
        r2.<init>();
        r0 = r7.size();
        if (r0 <= 0) goto L_0x00d3;
    L_0x00c9:
        r0 = 0;
        r0 = r7.get(r0);
        r0 = (X.AnonymousClass2zp) r0;
        r1 = r0.f36733C;
        goto L_0x00d4;
    L_0x00d3:
        r1 = r2;
    L_0x00d4:
        r0 = r5.f25891E;
        r0.clear();
        r0 = r5.f25889C;
        r0.clear();
        r0 = r5.f25890D;
        r0.clear();
        r0 = r5.f25888B;
        r0.clear();
        r0 = r5.f25888B;
        r0.setTime(r1);
        r0 = r5.f25888B;
        r6 = 2;
        r1 = r0.get(r6);
        r0 = r5.f25888B;
        r4 = 1;
        r0 = r0.get(r4);
        r16 = r0 * 12;
        r16 = r16 + r1;
        r0 = r5.f25888B;
        r0.clear();
        r0 = r5.f25888B;
        r0.setTime(r2);
        r0 = r5.f25888B;
        r1 = r0.get(r6);
        r0 = r5.f25888B;
        r0 = r0.get(r4);
        r3 = r0 * 12;
        r3 = r3 + r1;
    L_0x0118:
        r0 = r16;
        if (r0 > r3) goto L_0x0214;
    L_0x011c:
        r0 = r5.f25888B;
        r0.clear();
        r1 = r5.f25888B;
        r0 = r16 / 12;
        r1.set(r4, r0);
        r1 = r5.f25888B;
        r0 = r16 % 12;
        r1.set(r6, r0);
        r0 = r5.f25888B;
        r13 = r0.getTime();
        r0 = r5.f25888B;
        r0.clear();
        r0 = r5.f25888B;
        r0.setTime(r13);
        r0 = r5.f25888B;
        r14 = r0.getFirstDayOfWeek();
        r0 = X.AnonymousClass25x.f25887G;
        r8 = r0 + -1;
        r8 = r8 + r14;
        if (r8 <= r0) goto L_0x014d;
    L_0x014c:
        r8 = r8 % r0;
    L_0x014d:
        r0 = r5.f25888B;
        r9 = 1;
        r12 = r0.get(r9);
        r0 = r5.f25888B;
        r11 = 2;
        r1 = r0.get(r11);
        r10 = r5.f25891E;
        r2 = new X.260;
        r0 = r5.f25892F;
        r0 = r0.format(r13);
        r2.<init>(r0);
        r10.add(r2);
        r10 = r5.f25889C;
        r0 = -1;
        r2 = X.AnonymousClass25x.m14392B(r12, r1, r0);
        r0 = r5.f25891E;
        r0 = r0.size();
        r0 = r0 - r9;
        r0 = java.lang.Integer.valueOf(r0);
        r10.put(r2, r0);
        r13 = r14;
    L_0x0181:
        r2 = X.AnonymousClass25x.f25887G;
        r0 = r2 + r14;
        if (r13 >= r0) goto L_0x019a;
    L_0x0187:
        if (r13 <= r2) goto L_0x018c;
    L_0x0189:
        r10 = r13 % r2;
        goto L_0x018d;
    L_0x018c:
        r10 = r13;
    L_0x018d:
        r2 = r5.f25891E;
        r0 = new X.25z;
        r0.<init>(r10);
        r2.add(r0);
        r13 = r13 + 1;
        goto L_0x0181;
    L_0x019a:
        r0 = r5.f25888B;
        r10 = 7;
        r13 = r0.get(r10);
    L_0x01a1:
        if (r14 >= r13) goto L_0x01b0;
    L_0x01a3:
        r2 = r5.f25891E;
        r0 = new X.262;
        r0.<init>();
        r2.add(r0);
        r14 = r14 + 1;
        goto L_0x01a1;
    L_0x01b0:
        r0 = r5.f25888B;
        r2 = 5;
        r15 = r0.get(r2);
        r14 = r5.f25891E;
        r13 = new X.25y;
        r0 = r5.f25888B;
        r0 = r0.getTime();
        r13.<init>(r0);
        r14.add(r13);
        r14 = r5.f25889C;
        r13 = X.AnonymousClass25x.m14392B(r12, r1, r15);
        r0 = r5.f25891E;
        r0 = r0.size();
        r0 = r0 - r9;
        r0 = java.lang.Integer.valueOf(r0);
        r14.put(r13, r0);
        r0 = r5.f25888B;
        r0.add(r2, r9);
        r0 = r5.f25888B;
        r0 = r0.get(r11);
        if (r0 == r1) goto L_0x01b0;
    L_0x01e8:
        r1 = r5.f25888B;
        r0 = -1;
        r1.add(r2, r0);
        r0 = r5.f25888B;
        r2 = r0.get(r10);
        if (r2 == r8) goto L_0x0210;
    L_0x01f6:
        r2 = r2 + r9;
        r0 = X.AnonymousClass25x.f25887G;
        if (r2 <= r0) goto L_0x01fc;
    L_0x01fb:
        r2 = r2 % r0;
    L_0x01fc:
        r1 = r5.f25891E;
        r0 = new X.262;
        r0.<init>();
        r1.add(r0);
        if (r2 != r8) goto L_0x0209;
    L_0x0208:
        goto L_0x0210;
    L_0x0209:
        r2 = r2 + 1;
        r0 = X.AnonymousClass25x.f25887G;
        if (r2 <= r0) goto L_0x01fc;
    L_0x020f:
        goto L_0x01fb;
    L_0x0210:
        r16 = r16 + 1;
        goto L_0x0118;
    L_0x0214:
        r4 = r7.iterator();
    L_0x0218:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0242;
    L_0x021e:
        r3 = r4.next();
        r3 = (X.AnonymousClass2zp) r3;
        r0 = r3.f36733C;
        r2 = r5.m14404X(r0);
        r0 = r5.f25890D;
        r1 = r0.get(r2);
        r1 = (java.util.List) r1;
        if (r1 != 0) goto L_0x023e;
    L_0x0234:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r5.f25890D;
        r0.put(r2, r1);
    L_0x023e:
        r1.add(r3);
        goto L_0x0218;
    L_0x0242:
        r5.notifyDataSetChanged();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveReelCalendarFragment.B(com.instagram.archive.fragment.ArchiveReelCalendarFragment):void");
    }

    /* renamed from: C */
    private void m23410C(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    /* renamed from: b */
    public final AnonymousClass0lG m23411b() {
        return AnonymousClass0Jd.f2931B.O(getActivity(), this.f50784G);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.calendar);
        anonymousClass0eT.n(getFragmentManager().H() > 0);
    }

    public final void kv(AnonymousClass0MI anonymousClass0MI) {
        m23409B(this);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -727900766);
        super.onCreate(bundle);
        this.f50784G = AnonymousClass0Ce.G(getArguments());
        this.f50782E = UUID.randomUUID().toString();
        this.f50779B = new AnonymousClass2zo(getContext(), this);
        AnonymousClass0GA B = AnonymousClass0hR.B(this.f50784G, AnonymousClass0Ny.UseCacheWithTimeout, true, false);
        B.f2849B = new AnonymousClass48i(this);
        schedule(B);
        AnonymousClass0cQ.G(this, 122313904, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -355874952);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_calendar, viewGroup, false);
        AnonymousClass0cQ.G(this, -1156819653, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -2051839251);
        super.onDestroyView();
        ArchiveReelCalendarFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 2046447060, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1433135794);
        super.onPause();
        this.mCalendar.BA(this.f50785H);
        AnonymousClass0cQ.G(this, 1268121340, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 443248475);
        super.onResume();
        if (!this.f50779B.f36721C.isEmpty()) {
            this.mLoadingSpinner.setVisibility(8);
        }
        AnonymousClass0lG b = m23411b();
        if (b.G()) {
            RectF rectF = this.f50783F;
            b.D(rectF, rectF, null);
        }
        this.mCalendar.D(this.f50785H);
        m23409B(this);
        AnonymousClass0cQ.G(this, 168153590, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -1764492549);
        super.onStart();
        m23410C(8);
        AnonymousClass0cQ.G(this, -1731453221, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 2084790397);
        super.onStop();
        m23410C(0);
        AnonymousClass0cQ.G(this, 1709620632, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mCalendar = (CalendarRecyclerView) view.findViewById(C0164R.id.calendar);
        this.mLoadingSpinner = view.findViewById(C0164R.id.loading_spinner);
        this.mCalendar.setAdapter(this.f50779B);
        this.f50785H = new AnonymousClass2zN(this.f50779B, this.f50784G, this);
    }
}
