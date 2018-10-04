package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.ui.widget.pilelayout.PileLayout;
import com.instagram.video.videocall.view.VideoCallSurfaceContainerView;
import java.util.Map;

/* renamed from: X.6Bh */
public final class AnonymousClass6Bh {
    /* renamed from: B */
    public final AnonymousClass6BY f72793B;
    /* renamed from: C */
    public String f72794C;
    /* renamed from: D */
    public final AnonymousClass6Bg f72795D;
    /* renamed from: E */
    public final Context f72796E;
    /* renamed from: F */
    public final int f72797F;
    /* renamed from: G */
    public Drawable f72798G;
    /* renamed from: H */
    public ImageView f72799H;
    /* renamed from: I */
    public final AnonymousClass3ig f72800I;
    /* renamed from: J */
    public final PileLayout f72801J;
    /* renamed from: K */
    public final FrameLayout f72802K;
    /* renamed from: L */
    public final TextView f72803L;
    /* renamed from: M */
    public final Map f72804M = new AnonymousClass0O7();
    /* renamed from: N */
    public final RecyclerView f72805N;
    /* renamed from: O */
    public final AnonymousClass0la f72806O;
    /* renamed from: P */
    public final VideoCallSurfaceContainerView f72807P;
    /* renamed from: Q */
    public final boolean f72808Q;
    /* renamed from: R */
    private final AnonymousClass6Aq f72809R;

    public AnonymousClass6Bh(View view, PileLayout pileLayout, FrameLayout frameLayout, TextView textView, VideoCallSurfaceContainerView videoCallSurfaceContainerView, RecyclerView recyclerView, AnonymousClass6Aq anonymousClass6Aq, AnonymousClass6Bg anonymousClass6Bg, AnonymousClass3ig anonymousClass3ig, int i, int i2, boolean z, boolean z2) {
        this.f72796E = view.getContext();
        this.f72801J = pileLayout;
        this.f72802K = frameLayout;
        this.f72807P = videoCallSurfaceContainerView;
        this.f72805N = recyclerView;
        this.f72803L = textView;
        this.f72795D = anonymousClass6Bg;
        this.f72800I = anonymousClass3ig;
        this.f72797F = i;
        this.f72808Q = z;
        AnonymousClass0nJ anonymousClass6BY = new AnonymousClass6BY(anonymousClass6Aq);
        AnonymousClass0la anonymousClass1oG = new AnonymousClass1oG(this.f72796E, 2, 1, true);
        anonymousClass1oG.f22918I = new AnonymousClass6Ba(this, anonymousClass1oG, anonymousClass6BY, anonymousClass6Aq);
        this.f72793B = anonymousClass6BY;
        this.f72809R = anonymousClass6Aq;
        this.f72806O = anonymousClass1oG;
        if (this.f72808Q) {
            this.f72807P.setVisibility(8);
            this.f72805N.setVisibility(0);
            this.f72805N.setOverScrollMode(2);
            this.f72805N.setLayoutManager(anonymousClass1oG);
            this.f72805N.setAdapter(anonymousClass6BY);
            this.f72805N.B(new AnonymousClass6Bb(this));
            if (z2) {
                new AnonymousClass1ob(new AnonymousClass6BW()).D(this.f72805N);
                return;
            }
            return;
        }
        this.f72807P.setVisibility(0);
        this.f72807P.setMaxParticipantCount(i2);
        this.f72805N.setVisibility(8);
    }

    /* renamed from: A */
    public final void m29356A() {
        AnonymousClass6Bg anonymousClass6Bg = this.f72795D;
        if (anonymousClass6Bg.f72791G.B() && anonymousClass6Bg.f72791G.A().getVisibility() == 0) {
            AnonymousClass6Bh.m29350B(anonymousClass6Bg.f72791G.A());
        }
    }

    /* renamed from: B */
    public final void m29357B() {
        if (this.f72800I.B() && this.f72800I.A().getVisibility() == 0) {
            AnonymousClass6Bh.m29350B(this.f72800I.A());
        }
    }

    /* renamed from: B */
    public static void m29350B(View view) {
        view.animate().alpha(0.0f).withEndAction(new AnonymousClass6Bf(view)).start();
    }

    /* renamed from: C */
    public final void m29358C(AnonymousClass6Aj anonymousClass6Aj, boolean z) {
        if (this.f72808Q) {
            AnonymousClass6Ak Q = this.f72793B.m29344Q(anonymousClass6Aj);
            if (Q != null) {
                Q.f72596E = false;
                AnonymousClass6Bh.m29354F(this, Q);
            }
        } else {
            this.f72807P.m29368C(anonymousClass6Aj.m29285A());
        }
        AnonymousClass6Bh.m29352D(this, anonymousClass6Aj, z).f72767B.setVisibility(8);
    }

    /* renamed from: C */
    public static void m29351C(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).start();
        }
    }

    /* renamed from: D */
    public static AnonymousClass6BX m29352D(AnonymousClass6Bh anonymousClass6Bh, AnonymousClass6Aj anonymousClass6Aj, boolean z) {
        AnonymousClass6BX anonymousClass6BX = (AnonymousClass6BX) anonymousClass6Bh.f72804M.get(anonymousClass6Aj);
        if (anonymousClass6BX != null) {
            return anonymousClass6BX;
        }
        View B = AnonymousClass6BX.m29337B(anonymousClass6Bh.f72796E, anonymousClass6Aj.f72592E.DQ());
        anonymousClass6Bh.f72801J.addView(B);
        anonymousClass6Bh.f72804M.put(anonymousClass6Aj, B);
        if (z) {
            B.m29339B();
        }
        B.setVisibility(8);
        return B;
    }

    /* renamed from: D */
    public final void m29359D(AnonymousClass6Aj anonymousClass6Aj) {
        if (this.f72808Q) {
            AnonymousClass6Ak Q = this.f72793B.m29344Q(anonymousClass6Aj);
            if (Q != null) {
                AnonymousClass0nJ anonymousClass0nJ = this.f72793B;
                if (anonymousClass0nJ.f72774B.indexOf(Q) != -1) {
                    anonymousClass0nJ.f72774B.remove(Q);
                    anonymousClass0nJ.f72775C = AnonymousClass6Aq.m29291C(anonymousClass0nJ.f72774B);
                    anonymousClass0nJ.notifyDataSetChanged();
                }
                AnonymousClass6Aq anonymousClass6Aq = this.f72809R;
                Q.f72598G = null;
                anonymousClass6Aq.f72608B.f72606B.add(Q);
                AnonymousClass6Bh.m29353E(this);
                return;
            }
            return;
        }
        this.f72807P.m29369D(anonymousClass6Aj.m29285A());
    }

    /* renamed from: E */
    public final void m29360E(AnonymousClass6Aj anonymousClass6Aj, boolean z) {
        AnonymousClass6Bh.m29352D(this, anonymousClass6Aj, z).setVisibility(0);
    }

    /* renamed from: E */
    public static void m29353E(AnonymousClass6Bh anonymousClass6Bh) {
        anonymousClass6Bh.f72805N.post(new AnonymousClass6Be(anonymousClass6Bh));
    }

    /* renamed from: F */
    public final void m29361F(AnonymousClass6Aj anonymousClass6Aj, String str) {
        if (this.f72808Q) {
            AnonymousClass6Ak Q = this.f72793B.m29344Q(anonymousClass6Aj);
            if (Q != null) {
                Q.f72595D = true;
                Q.f72593B = str;
                AnonymousClass6Bh.m29354F(this, Q);
                return;
            }
            return;
        }
        this.f72807P.m29370E(anonymousClass6Aj.m29285A(), str);
    }

    /* renamed from: F */
    public static void m29354F(AnonymousClass6Bh anonymousClass6Bh, AnonymousClass6Ak anonymousClass6Ak) {
        int R = anonymousClass6Bh.f72793B.m29345R(anonymousClass6Ak);
        if (R != -1) {
            AnonymousClass6BZ anonymousClass6BZ = (AnonymousClass6BZ) anonymousClass6Bh.f72805N.a(R);
            if (anonymousClass6BZ != null) {
                anonymousClass6BZ.m29347V(anonymousClass6Ak);
            }
        }
    }

    /* renamed from: G */
    public final void m29362G(AnonymousClass6Aj anonymousClass6Aj, View view) {
        if (this.f72808Q) {
            AnonymousClass6Ak Q = this.f72793B.m29344Q(anonymousClass6Aj);
            if (Q == null) {
                AnonymousClass6Aq anonymousClass6Aq = this.f72809R;
                int i = anonymousClass6Aj.f72589B;
                AnonymousClass6Ap anonymousClass6Ap = anonymousClass6Aq.f72608B;
                for (Object obj : anonymousClass6Ap.f72606B) {
                    if (obj.f72594C == i) {
                        break;
                    }
                }
                Object obj2 = null;
                if (obj2 != null) {
                    anonymousClass6Ap.f72606B.remove(obj2);
                }
                if (obj2 == null) {
                    obj2 = (AnonymousClass6Ak) this.f72809R.f72608B.f72606B.poll();
                }
                if (obj2 == null) {
                    obj2 = new AnonymousClass6Ak(this.f72793B.B(), anonymousClass6Aj, view);
                } else {
                    obj2.f72597F = anonymousClass6Aj;
                    obj2.f72598G = view;
                }
                AnonymousClass0nJ anonymousClass0nJ = this.f72793B;
                anonymousClass0nJ.f72774B.add(obj2);
                anonymousClass0nJ.f72775C = AnonymousClass6Aq.m29291C(anonymousClass0nJ.f72774B);
                anonymousClass0nJ.notifyDataSetChanged();
            } else {
                Q.f72597F = anonymousClass6Aj;
                Q.f72598G = view;
            }
            AnonymousClass6Bh.m29353E(this);
            return;
        }
        this.f72807P.m29366A(anonymousClass6Aj.m29285A(), view);
    }

    /* renamed from: G */
    public static void m29355G(AnonymousClass6Bh anonymousClass6Bh, String str) {
        anonymousClass6Bh.f72803L.setText(str);
        if (anonymousClass6Bh.f72803L.getVisibility() != 0) {
            anonymousClass6Bh.f72803L.setVisibility(0);
            anonymousClass6Bh.f72803L.setAlpha(0.0f);
            anonymousClass6Bh.f72803L.animate().setListener(null).cancel();
            anonymousClass6Bh.f72803L.animate().alpha(1.0f);
        }
        str = new AnonymousClass6Bc(anonymousClass6Bh);
        anonymousClass6Bh.f72803L.addOnAttachStateChangeListener(new AnonymousClass6Bd(anonymousClass6Bh, str));
        anonymousClass6Bh.f72803L.removeCallbacks(str);
        anonymousClass6Bh.f72803L.postDelayed(str, 4000);
    }
}
