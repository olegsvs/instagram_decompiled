package com.instagram.reels.question.view;

import X.AnonymousClass0Ci;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass2GF;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class AvatarView extends View {
    /* renamed from: B */
    public final AnonymousClass2GF f28240B;

    public AvatarView(Context context) {
        this(context, null);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass2GF anonymousClass2GF = new AnonymousClass2GF();
        this.f28240B = anonymousClass2GF;
        anonymousClass2GF.setCallback(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.AvatarView);
        setStrokeColor(obtainStyledAttributes.getColor(0, 0));
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
        obtainStyledAttributes.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        this.f28240B.draw(canvas);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -25210591);
        super.onSizeChanged(i, i2, i3, i4);
        this.f28240B.setBounds(0, 0, i, i2);
        AnonymousClass0cQ.O(this, 1422704862, N);
    }

    public void setAvatarUrl(String str) {
        this.f28240B.m14881A(str);
    }

    public void setAvatarUser(AnonymousClass0Ci anonymousClass0Ci) {
        this.f28240B.m14881A(anonymousClass0Ci.DQ());
    }

    public void setStrokeColor(int i) {
        AnonymousClass2GF anonymousClass2GF = this.f28240B;
        anonymousClass2GF.f28238C.setColor(i);
        anonymousClass2GF.invalidateSelf();
    }

    public void setStrokeWidth(int i) {
        AnonymousClass2GF anonymousClass2GF = this.f28240B;
        anonymousClass2GF.f28239D = (float) i;
        anonymousClass2GF.invalidateSelf();
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f28240B) {
                return false;
            }
        }
        return true;
    }
}
