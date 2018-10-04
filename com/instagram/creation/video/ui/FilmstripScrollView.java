package com.instagram.creation.video.ui;

import X.AnonymousClass0HV;
import X.AnonymousClass0cQ;
import X.AnonymousClass3Hn;
import X.AnonymousClass3IS;
import X.AnonymousClass3zr;
import X.AnonymousClass3zs;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class FilmstripScrollView extends HorizontalScrollView {
    /* renamed from: B */
    public AnonymousClass3zr f39950B;
    /* renamed from: C */
    private boolean f39951C;

    public FilmstripScrollView(Context context) {
        super(context);
    }

    public FilmstripScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilmstripScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        AnonymousClass3zr anonymousClass3zr = this.f39950B;
        if (anonymousClass3zr != null) {
            int i5 = i - i3;
            if (anonymousClass3zr.f48079B.f48098T != null) {
                AnonymousClass3zs.m21938H(anonymousClass3zr.f48079B, i5 >= 0 ? AnonymousClass3IS.RIGHT : AnonymousClass3IS.LEFT);
            }
            if (!AnonymousClass0HV.D(anonymousClass3zr.f48079B.f48097S).f2646B.getBoolean("import_scroll_education", false)) {
                AnonymousClass0HV.D(anonymousClass3zr.f48079B.f48097S).f2646B.edit().putBoolean("import_scroll_education", true).apply();
            }
            anonymousClass3zr.f48079B.f48080B.f17221R = anonymousClass3zr.f48079B.f48084F.getScrollX();
            anonymousClass3zr.f48079B.f48080B.f17220Q = (int) AnonymousClass3zs.m21935E(anonymousClass3zr.f48079B);
            anonymousClass3zr.f48079B.f48080B.f17209F = (int) AnonymousClass3zs.m21934D(anonymousClass3zr.f48079B);
            anonymousClass3zr.f48079B.f48080B.f17213J = true;
            AnonymousClass3Hn anonymousClass3Hn = anonymousClass3zr.f48079B.f48099U.f48152D;
            if (anonymousClass3Hn != null) {
                anonymousClass3Hn.mo4863M();
            }
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1028381742);
        switch (motionEvent.getAction()) {
            case 0:
                this.f39951C = false;
                break;
            case 1:
            case 3:
                if (this.f39951C) {
                    AnonymousClass3zr anonymousClass3zr = this.f39950B;
                    if (anonymousClass3zr != null) {
                        AnonymousClass3zs anonymousClass3zs = anonymousClass3zr.f48079B;
                        anonymousClass3zs.f48088J.clearAnimation();
                        anonymousClass3zs.f48088J.startAnimation(anonymousClass3zs.f48089K);
                        break;
                    }
                }
                break;
            case 2:
                if (!this.f39951C) {
                    AnonymousClass3zr anonymousClass3zr2 = this.f39950B;
                    if (anonymousClass3zr2 != null) {
                        anonymousClass3zr2.f48079B.f48099U.m21988U(true);
                        AnonymousClass3zs.m21937G(anonymousClass3zr2.f48079B);
                        this.f39951C = true;
                        break;
                    }
                }
                break;
            default:
                break;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, -512609737, M);
        return onTouchEvent;
    }
}
