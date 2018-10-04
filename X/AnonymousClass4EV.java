package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.4EV */
public final class AnonymousClass4EV implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4EY f51806B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0SK f51807C;
    /* renamed from: D */
    public final /* synthetic */ Context f51808D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass4EX f51809E;
    /* renamed from: F */
    private final GestureDetector f51810F = new GestureDetector(this.f51808D, new AnonymousClass4EU(this));

    public AnonymousClass4EV(AnonymousClass4EY anonymousClass4EY, Context context, AnonymousClass4EX anonymousClass4EX, AnonymousClass0SK anonymousClass0SK) {
        this.f51806B = anonymousClass4EY;
        this.f51808D = context;
        this.f51809E = anonymousClass4EX;
        this.f51807C = anonymousClass0SK;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f51810F.onTouchEvent(motionEvent);
    }
}
