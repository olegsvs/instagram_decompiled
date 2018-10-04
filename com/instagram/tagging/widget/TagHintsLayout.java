package com.instagram.tagging.widget;

import X.AnonymousClass0Ca;
import X.AnonymousClass0OR;
import X.AnonymousClass3iS;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TagHintsLayout extends ViewGroup {
    /* renamed from: B */
    public Runnable f12546B;
    /* renamed from: C */
    public final Handler f12547C = new Handler(Looper.getMainLooper());
    /* renamed from: D */
    public AnimatorSet f12548D;
    /* renamed from: E */
    private AnimatorSet f12549E;
    /* renamed from: F */
    private final int f12550F = getResources().getDimensionPixelSize(C0164R.dimen.tag_hint_with_shadow_radius);
    /* renamed from: G */
    private final Map f12551G = new HashMap();

    public TagHintsLayout(Context context) {
        super(context);
    }

    public TagHintsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TagHintsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m8536A() {
        Runnable runnable = this.f12546B;
        if (runnable != null) {
            AnonymousClass0OR.m3627G(this.f12547C, runnable, -1927464520);
        }
        AnimatorSet animatorSet = this.f12548D;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f12548D.cancel();
        }
        animatorSet = this.f12549E;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f12549E.cancel();
        }
        m8534B(this, false);
    }

    /* renamed from: B */
    public static void m8534B(TagHintsLayout tagHintsLayout, boolean z) {
        tagHintsLayout.f12549E = m8535C(tagHintsLayout, C0164R.animator.tag_hint_hide_animation);
        if (z) {
            tagHintsLayout.f12549E.setStartDelay(2000);
        }
        tagHintsLayout.f12549E.addListener(new AnonymousClass3iS(tagHintsLayout));
        tagHintsLayout.f12549E.start();
    }

    /* renamed from: C */
    public static AnimatorSet m8535C(TagHintsLayout tagHintsLayout, int i) {
        Collection arrayList = new ArrayList(tagHintsLayout.getChildCount());
        for (int i2 = 0; i2 < tagHintsLayout.getChildCount(); i2++) {
            AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(tagHintsLayout.getContext(), i);
            animatorSet.setTarget(tagHintsLayout.getChildAt(i2));
            arrayList.add(animatorSet);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        return animatorSet2;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        for (Entry entry : this.f12551G.entrySet()) {
            ImageView imageView = (ImageView) entry.getValue();
            int i5 = (int) (((float) i3) * ((Tag) entry.getKey()).f15363B.x);
            int i6 = (int) (((float) i4) * ((Tag) entry.getKey()).f15363B.y);
            int i7 = this.f12550F;
            imageView.layout(i5 - i7, i6 - i7, i5 + i7, i6 + i7);
        }
    }

    public void setTags(List list) {
        this.f12551G.clear();
        for (Tag tag : list) {
            View imageView = new ImageView(getContext());
            imageView.setImageDrawable(AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.tag_hint_with_shadow));
            imageView.setAlpha(0.0f);
            this.f12551G.put(tag, imageView);
            addView(imageView);
        }
    }
}
