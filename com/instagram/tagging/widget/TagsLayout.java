package com.instagram.tagging.widget;

import X.AnonymousClass0Ci;
import X.AnonymousClass0LH;
import X.AnonymousClass0Nm;
import X.AnonymousClass0P7;
import X.AnonymousClass1A1;
import X.AnonymousClass1Zr;
import X.AnonymousClass3iT;
import X.AnonymousClass3id;
import X.AnonymousClass3ie;
import X.AnonymousClass423;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.facebook.C0164R;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TagsLayout extends ViewGroup {
    /* renamed from: B */
    public boolean f12122B = true;
    /* renamed from: C */
    public AnonymousClass1A1 f12123C;
    /* renamed from: D */
    private int f12124D;
    /* renamed from: E */
    private AnonymousClass423 f12125E;

    public TagsLayout(Context context) {
        super(context);
    }

    public TagsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TagsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final X.AnonymousClass3iT m8353A(com.instagram.tagging.model.Tag r18, boolean r19) {
        /*
        r17 = this;
        r4 = r17;
        r1 = r4.f12123C;
        r0 = "Must set tag type";
        X.AnonymousClass0LH.m2928F(r1, r0);
        r3 = r18;
        r5 = r3 instanceof com.instagram.model.fbfriend.FbFriendTag;
        r2 = new X.3iT;
        r1 = r4.getContext();
        r0 = r4.f12123C;
        r2.<init>(r1, r0, r5);
        r0 = r3.f15363B;
        r2.setNormalizedPosition(r0);
        r0 = r4.f12123C;
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x00f7;
            case 1: goto L_0x0028;
            default: goto L_0x0026;
        };
    L_0x0026:
        goto L_0x010d;
    L_0x0028:
        r7 = r3;
        r7 = (com.instagram.model.shopping.ProductTag) r7;
        r8 = new android.text.TextPaint;
        r0 = r2.getPaint();
        r8.<init>(r0);
        r6 = r4.getContext();
        r5 = new android.text.SpannableStringBuilder;
        r5.<init>();
        r0 = r7.f17742B;
        r0 = r0.f4988J;
        r11 = r6.getResources();
        r1 = 1;
        r8.setFakeBoldText(r1);
        r10 = new X.0qI;
        r10.<init>();
        r10.f10899E = r8;
        r8 = 2131166272; // 0x7f070440 float:1.7946785E38 double:1.0529360406E-314;
        r9 = r11.getDimensionPixelSize(r8);
        r8 = 2131165405; // 0x7f0700dd float:1.7945026E38 double:1.052935612E-314;
        r8 = r11.getDimensionPixelSize(r8);
        r8 = r8 * 2;
        r9 = r9 - r8;
        r10.f10900F = r9;
        r16 = r10.m7924A();
        r14 = "…";
        r12 = "";
        r8 = X.AnonymousClass0CC.yD;
        r8 = r8.m845G();
        r8 = (java.lang.Boolean) r8;
        r17 = r8.booleanValue();
        r15 = 2;
        r18 = 0;
        r13 = r0;
        r13 = X.AnonymousClass186.m9525B(r12, r13, r14, r15, r16, r17, r18);
        r12 = new android.text.SpannableString;
        r12.<init>(r13);
        r11 = new X.0yF;
        r11.<init>();
        r8 = r13.length();
        r10 = 33;
        r9 = 0;
        r12.setSpan(r11, r9, r8, r10);
        r5.append(r12);
        r0 = r13.equals(r0);
        if (r0 != 0) goto L_0x00ac;
    L_0x009c:
        r8 = new android.text.SpannableString;
        r8.<init>(r14);
        r0 = new X.0yF;
        r0.<init>();
        r8.setSpan(r0, r9, r1, r10);
        r5.append(r8);
    L_0x00ac:
        r0 = "\n";
        r5.append(r0);
        r8 = new android.text.SpannableString;
        r8.<init>(r0);
        r1 = new android.text.style.RelativeSizeSpan;
        r0 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r1.<init>(r0);
        r0 = r8.length();
        r8.setSpan(r1, r9, r0, r10);
        r5.append(r8);
        r1 = r7.f17742B;
        r0 = 2131755232; // 0x7f1000e0 float:1.9141337E38 double:1.0532270255E-314;
        r0 = java.lang.Integer.valueOf(r0);
        r0 = X.AnonymousClass3iR.B(r1, r6, r0);
        r5.append(r0);
        r6 = r4.getContext();
        r0 = r7.f17742B;
        r1 = r0.f4993O;
        r0 = X.AnonymousClass0Sj.APPROVED;
        if (r1 == r0) goto L_0x00ec;
    L_0x00e4:
        r0 = 2131099802; // 0x7f06009a float:1.7811967E38 double:1.0529032E-314;
        r1 = X.AnonymousClass0Ca.m937C(r6, r0);
        goto L_0x00ee;
    L_0x00ec:
        r1 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
    L_0x00ee:
        r0 = r2.f43576D;
        r0.setTextColor(r1);
        r2.setText(r5);
        goto L_0x010d;
    L_0x00f7:
        r0 = r3 instanceof com.instagram.model.people.PeopleTag;
        if (r0 == 0) goto L_0x0103;
    L_0x00fb:
        r0 = r3;
        r0 = (com.instagram.model.people.PeopleTag) r0;
        r1 = r0.m9780E();
        goto L_0x010e;
    L_0x0103:
        if (r5 == 0) goto L_0x010d;
    L_0x0105:
        r0 = r3;
        r0 = (com.instagram.model.fbfriend.FbFriendTag) r0;
        r1 = r0.E();
        goto L_0x010e;
    L_0x010d:
        r1 = 0;
    L_0x010e:
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x0117;
    L_0x0114:
        r2.setText(r1);
    L_0x0117:
        r2.setTag(r3);
        r0 = r19;
        r2.setClickable(r0);
        r4.addView(r2);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.widget.TagsLayout.A(com.instagram.tagging.model.Tag, boolean):X.3iT");
    }

    /* renamed from: B */
    private void m8351B() {
        List<List> overlaps = getOverlaps();
        int i = this.f12124D;
        int[] iArr = new int[i];
        int[] iArr2 = new int[(i + 1)];
        for (List list : overlaps) {
            Collections.sort(list, new AnonymousClass3ie(this));
            iArr2[0] = -1;
            int i2 = 0;
            while (i2 < list.size()) {
                int[] C = m8352C(list, i2, i2);
                int i3 = i2;
                while (C[0] < iArr2[i3]) {
                    i3 = iArr[i3 - 1];
                    C = m8352C(list, i3, i2);
                }
                int i4 = i2 + 1;
                iArr2[i4] = C[0] + C[1];
                iArr[i2] = i3;
                i2 = i4;
            }
        }
    }

    /* renamed from: C */
    public final void m8354C() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            AnonymousClass3iT D = m8355D(i);
            PointF absoluteTagPosition = D.getAbsoluteTagPosition();
            Animation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, absoluteTagPosition.x, absoluteTagPosition.y);
            scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            scaleAnimation.setDuration(200);
            scaleAnimation.setAnimationListener(new AnonymousClass1Zr(this, D));
            D.startAnimation(scaleAnimation);
        }
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setDuration(200);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        startAnimation(alphaAnimation);
    }

    /* renamed from: C */
    private int[] m8352C(List list, int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        AnonymousClass3iT anonymousClass3iT = (AnonymousClass3iT) list.get(i);
        int max = Math.max(Math.min(0, anonymousClass3iT.B(measuredWidth)), anonymousClass3iT.f43581I.left);
        int B = (((AnonymousClass3iT) list.get(i2)).B(measuredWidth) + ((AnonymousClass3iT) list.get(i2)).getBubbleWidth()) - max;
        int i3 = 0;
        for (int i4 = i; i4 <= i2; i4++) {
            i3 += ((AnonymousClass3iT) list.get(i4)).getBubbleWidth();
        }
        if (i3 <= B) {
            max = ((AnonymousClass3iT) list.get(i)).getPreferredBounds().left - (((((AnonymousClass3iT) list.get(i)).getPreferredBounds().left + i3) - ((AnonymousClass3iT) list.get(i2)).getPreferredBounds().right) / 2);
            B = i3;
        }
        int max2 = Math.max(0, max);
        int i5 = 0;
        while (i <= i2) {
            measuredWidth = (((AnonymousClass3iT) list.get(i)).getBubbleWidth() * B) / i3;
            ((AnonymousClass3iT) list.get(i)).A((max2 + i5) + (measuredWidth / 2));
            i5 += measuredWidth;
            i++;
        }
        return new int[]{max2, B};
    }

    /* renamed from: D */
    public final AnonymousClass3iT m8355D(int i) {
        return (AnonymousClass3iT) getChildAt(i);
    }

    /* renamed from: E */
    public final boolean m8356E(AnonymousClass3iT anonymousClass3iT) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            if (getChildAt(i) == anonymousClass3iT) {
                break;
            }
            i++;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0164R.dimen.bubble_external_padding);
        Rect rect = new Rect(anonymousClass3iT.getDrawingBounds());
        rect.inset(dimensionPixelSize, dimensionPixelSize);
        Rect rect2 = new Rect();
        int E = (int) AnonymousClass0Nm.m3426E(getResources().getDisplayMetrics(), 250);
        for (i++; i < childCount; i++) {
            if (rect2.setIntersect(m8355D(i).getDrawingBounds(), rect)) {
                rect2.inset(dimensionPixelSize, dimensionPixelSize);
                if (!rect2.isEmpty() && rect2.width() * rect2.height() >= E) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    public final void m8357F() {
        if (this.f12122B) {
            m8351B();
        }
        for (int i = 0; i < getChildCount(); i++) {
            m8355D(i).E();
        }
    }

    private List getOverlaps() {
        List linkedList = new LinkedList();
        Set hashSet = new HashSet();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (!hashSet.contains(Integer.valueOf(i))) {
                hashSet.add(Integer.valueOf(i));
                ArrayList arrayList = new ArrayList(8);
                linkedList.add(arrayList);
                arrayList.add(m8355D(i));
                Rect rect = new Rect(m8355D(i).getMaxBounds());
                int i2 = i + 1;
                while (i2 < childCount) {
                    if (m8355D(i2).f43580H && Rect.intersects(rect, m8355D(i2).getMaxBounds())) {
                        rect.union(m8355D(i2).getMaxBounds());
                        hashSet.add(Integer.valueOf(i2));
                        arrayList.add(m8355D(i2));
                    }
                    i2++;
                }
            }
        }
        return linkedList;
    }

    public AnonymousClass1A1 getTagType() {
        return this.f12123C;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(0, 0, i3 - i, i4 - i2);
        }
        m8357F();
        AnonymousClass423 anonymousClass423 = this.f12125E;
        if (anonymousClass423 != null) {
            setTagsLayoutListener(anonymousClass423.f48653B, null);
            for (AnonymousClass3iT anonymousClass3iT : anonymousClass423.f48654C) {
                Object obj = anonymousClass423.f48655D.size() < 3 ? 1 : null;
                PointF absoluteTagPosition = anonymousClass3iT.getAbsoluteTagPosition();
                Animation scaleAnimation = new ScaleAnimation(0.0f, true, 0, 1065353216, absoluteTagPosition.x, absoluteTagPosition.y);
                if (obj != null) {
                    scaleAnimation.setInterpolator(new OvershootInterpolator());
                } else {
                    scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                }
                scaleAnimation.setDuration(200);
                anonymousClass3iT.startAnimation(scaleAnimation);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(i, i2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setTagType(AnonymousClass1A1 anonymousClass1A1) {
        this.f12123C = anonymousClass1A1;
        switch (this.f12123C.ordinal()) {
            case 0:
                this.f12124D = 20;
                return;
            case 1:
                this.f12124D = 5;
                return;
            default:
                return;
        }
    }

    public void setTags(List list, AnonymousClass0P7 anonymousClass0P7, int i, boolean z, AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0LH.m2927E(list);
        List linkedList = new LinkedList();
        AnonymousClass3iT anonymousClass3iT = null;
        Object id = anonymousClass0Ci != null ? anonymousClass0Ci.getId() : null;
        for (Tag tag : list) {
            AnonymousClass3iT A = m8353A(tag, anonymousClass0P7 != null);
            if (anonymousClass0P7 != null) {
                A.setMedia(anonymousClass0P7);
            }
            A.setCarouselIndex(i);
            linkedList.add(A);
            if ((tag instanceof PeopleTag) && tag.m9781A().equals(id)) {
                anonymousClass3iT = A;
            }
        }
        if (anonymousClass3iT != null) {
            anonymousClass3iT.bringToFront();
        }
        if (z) {
            setTagsLayoutListener(this, new AnonymousClass423(this, linkedList, list));
        }
        post(new AnonymousClass3id(this));
    }

    public void setTags(List list, boolean z, AnonymousClass0Ci anonymousClass0Ci) {
        setTags(list, null, -1, z, anonymousClass0Ci);
    }

    public static void setTagsLayoutListener(TagsLayout tagsLayout, AnonymousClass423 anonymousClass423) {
        tagsLayout.f12125E = anonymousClass423;
    }
}
