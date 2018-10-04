package X;

import android.content.Context;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.facebook.C0164R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.38n */
public final class AnonymousClass38n extends AnonymousClass0nJ implements Adapter {
    /* renamed from: B */
    public final AnonymousClass3yC f38279B;
    /* renamed from: C */
    public AnonymousClass3yS f38280C;
    /* renamed from: D */
    public AnonymousClass45n f38281D;
    /* renamed from: E */
    private final Context f38282E;
    /* renamed from: F */
    private final AnonymousClass44c f38283F;
    /* renamed from: G */
    private final Map f38284G = new HashMap();

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    public final int getViewTypeCount() {
        return 0;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public AnonymousClass38n(AnonymousClass3yC anonymousClass3yC, AnonymousClass44c anonymousClass44c, Context context) {
        this.f38279B = anonymousClass3yC;
        this.f38283F = anonymousClass44c;
        this.f38282E = context;
    }

    /* renamed from: B */
    public final int m18740B() {
        return this.f38279B.m21794C();
    }

    /* renamed from: I */
    public final void m18741I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass0oo anonymousClass0oo2 = anonymousClass0oo;
        AnonymousClass3yE B = this.f38279B.m21793B(i);
        AnonymousClass399 dT = B.dT();
        if (dT == AnonymousClass399.f38322I) {
            AnonymousClass39z.m18788B(this.f38282E, (AnonymousClass39y) anonymousClass0oo2, (AnonymousClass45k) B, this.f38283F, "image", B.getId());
        } else if (dT == AnonymousClass399.f38324K) {
            WeakReference weakReference;
            AnonymousClass3yU anonymousClass3yU = (AnonymousClass3yU) anonymousClass0oo2;
            AnonymousClass45m anonymousClass45m = (AnonymousClass45m) B;
            AnonymousClass38m R = m18745R(B);
            AnonymousClass44c anonymousClass44c = this.f38283F;
            if (!(anonymousClass3yU.f47671F == null || anonymousClass3yU.f47671F == R)) {
                AnonymousClass38m anonymousClass38m = anonymousClass3yU.f47671F;
                weakReference = anonymousClass38m.f38277D;
                if (weakReference != null && weakReference.get() == anonymousClass3yU) {
                    anonymousClass38m.m18739A(null);
                }
            }
            anonymousClass3yU.f47671F = R;
            anonymousClass3yU.f47669D.B();
            anonymousClass3yU.f47669D.G(R.f38275B);
            anonymousClass3yU.f47669D.setAdapter(new AnonymousClass39j(anonymousClass45m, anonymousClass44c));
            anonymousClass3yU.f47669D.setExtraBufferSize(2);
            anonymousClass3yU.f47669D.setPageSpacing(0.0f);
            anonymousClass3yU.f47669D.setOverScrollOnEdgeItems(false);
            anonymousClass3yU.f47669D.A(new AnonymousClass3A3(anonymousClass3yU, R));
            anonymousClass3yU.f47667B.A(R.f38275B, anonymousClass45m.f50006B.m21794C());
            anonymousClass3yU.f47667B.B(R.f38275B, false);
            if (!anonymousClass3yU.f47667B.C()) {
                anonymousClass3yU.f47668C.setVisibility(0);
                anonymousClass3yU.f47668C.setTranslationX(0.0f);
                anonymousClass3yU.f47668C.setAlpha(1.0f);
                R.m18739A(anonymousClass3yU);
                if (R.f38276C == null) {
                    R.f38276C = new AnonymousClass38t();
                    weakReference = R.f38277D;
                    if (weakReference != null) {
                        AnonymousClass38t anonymousClass38t = R.f38276C;
                        anonymousClass38t.f38298E = weakReference;
                        anonymousClass38t.f38297D.addListener(anonymousClass38t.f38296C);
                        anonymousClass38t.onAnimationUpdate(anonymousClass38t.f38297D);
                    }
                }
                AnonymousClass38t anonymousClass38t2 = R.f38276C;
                if (!anonymousClass38t2.f38297D.isRunning()) {
                    anonymousClass38t2.f38297D.start();
                }
            }
            AnonymousClass39P.m18768B(anonymousClass3yU.f47670E, anonymousClass45m.QS().f47584E);
            anonymousClass3yU.f47670E.setBackgroundColor(anonymousClass45m.QS().f47582C);
        } else if (dT == AnonymousClass399.f38318E) {
            r4 = this.f38282E;
            AnonymousClass39l anonymousClass39l = (AnonymousClass39l) anonymousClass0oo2;
            AnonymousClass44d anonymousClass44d = (AnonymousClass44d) B;
            r3 = this.f38283F;
            anonymousClass39l.f38456C.setText(anonymousClass44d.wQ());
            anonymousClass39l.f38456C.setTextDescriptor(anonymousClass44d.pS());
            if (AnonymousClass26g.m14458B(anonymousClass44d.JI())) {
                anonymousClass39l.f38455B.setOnClickListener(null);
            } else {
                anonymousClass39l.f38455B.setOnClickListener(new AnonymousClass39k(r3, anonymousClass44d));
            }
            AnonymousClass39P.m18768B(anonymousClass39l.f38457D, anonymousClass44d.QS().f47584E);
            anonymousClass39l.f38457D.setBackgroundColor(anonymousClass44d.QS().f47582C);
            anonymousClass39l.f38455B.setBackground(AnonymousClass39P.m18769C(r4, anonymousClass44d.QS().f47583D, ((AnonymousClass44e) anonymousClass44d.QS()).f49486B));
        } else if (dT == AnonymousClass399.f38323J) {
            AnonymousClass3A8.m18793B((AnonymousClass3A7) anonymousClass0oo2, (AnonymousClass45o) B, false);
        } else if (dT == AnonymousClass399.f38327N) {
            r4 = this.f38282E;
            AnonymousClass3AB anonymousClass3AB = (AnonymousClass3AB) anonymousClass0oo2;
            AnonymousClass45p anonymousClass45p = (AnonymousClass45p) B;
            AnonymousClass38m R2 = m18745R(B);
            AnonymousClass44c anonymousClass44c2 = this.f38283F;
            anonymousClass3AB.f38513C.setAspectRatio(anonymousClass45p.f50017B.A());
            anonymousClass3AB.f38512B.setImageRenderer(AnonymousClass3AC.f38515B);
            anonymousClass3AB.f38512B.setProgressiveImageConfig(new AnonymousClass0ag());
            anonymousClass3AB.f38512B.setEnableProgressBar(true);
            anonymousClass3AB.f38512B.setOnClickListener(new AnonymousClass3A9(anonymousClass44c2, anonymousClass45p));
            anonymousClass3AB.f38512B.E(C0164R.id.listener_id_for_media_video_binder, new AnonymousClass3AA(anonymousClass44c2));
            if (VERSION.SDK_INT < 21 || !AnonymousClass0vc.B(anonymousClass45p.getId()) || R2.f38278E == 0) {
                anonymousClass3AB.f38512B.setUrl(anonymousClass45p.f50017B.C(r4));
            } else {
                anonymousClass3AB.f38512B.G(Uri.fromFile(AnonymousClass0vc.C(r4, anonymousClass45p.getId())).toString(), true);
            }
            AnonymousClass39P.m18768B(anonymousClass3AB.f38514D, anonymousClass45p.QS().f47584E);
            anonymousClass3AB.f38514D.setBackgroundColor(anonymousClass45p.QS().f47582C);
            AnonymousClass3yS anonymousClass3yS = this.f38280C;
            AnonymousClass0uw B2 = anonymousClass3yS.f47639F.m18784B();
            if (B2 == AnonymousClass0uw.PLAYING || B2 == AnonymousClass0uw.PREPARING || B2 == AnonymousClass0uw.PREPARED) {
                AnonymousClass39e anonymousClass39e = anonymousClass3yS.f47639F.f38444H;
                boolean equals = anonymousClass3AB.equals(anonymousClass39e != null ? anonymousClass39e.f38434B : null);
                r0 = anonymousClass45p.equals(anonymousClass3yS.f47639F.m18783A());
                if (equals && !r0) {
                    AnonymousClass39f anonymousClass39f = anonymousClass3yS.f47639F;
                    String str = "media_mismatch";
                    AnonymousClass3pz anonymousClass3pz = anonymousClass39f.f38445I;
                    if (anonymousClass3pz != null) {
                        anonymousClass3pz.m20870M(str, false);
                    }
                } else if (!equals && r0) {
                    AnonymousClass39f anonymousClass39f2 = anonymousClass3yS.f47639F;
                    anonymousClass39e = anonymousClass39f2.f38444H;
                    if (!(anonymousClass39e == null || anonymousClass39e.f38434B == anonymousClass3AB)) {
                        anonymousClass39f2.f38444H.f38434B = anonymousClass3AB;
                        AnonymousClass3pz.m20850G(anonymousClass39f2.f38445I, anonymousClass3AB.f38513C, false);
                    }
                }
            }
        } else if (dT == AnonymousClass399.f38325L) {
            AnonymousClass3A6.m18791B((AnonymousClass3A5) anonymousClass0oo2, (AnonymousClass45n) B, m18745R(B), this.f38283F);
        } else if (dT == AnonymousClass399.f38321H) {
            int i2;
            Context context = this.f38282E;
            AnonymousClass3A1 anonymousClass3A1 = (AnonymousClass3A1) anonymousClass0oo2;
            AnonymousClass45l anonymousClass45l = (AnonymousClass45l) B;
            r3 = this.f38283F;
            if (anonymousClass3A1.f38500C == null) {
                anonymousClass3A1.f38500C = new ArrayList();
                for (i2 = 0; i2 < anonymousClass45l.f50003B.m21794C(); i2++) {
                    AnonymousClass3A2.m18790B(anonymousClass45l.f50003B.m21793B(i2).dT(), anonymousClass3A1, i2);
                }
            }
            i2 = 0;
            while (i2 < anonymousClass45l.f50003B.m21794C()) {
                AnonymousClass3yE B3 = anonymousClass45l.f50003B.m21793B(i2);
                switch (B3.dT().ordinal()) {
                    case 1:
                        if (i2 >= anonymousClass3A1.f38500C.size() || !(anonymousClass3A1.f38500C.get(i2) instanceof AnonymousClass3A7)) {
                            AnonymousClass3A2.m18790B(B3.dT(), anonymousClass3A1, i2);
                        }
                        AnonymousClass3A7 anonymousClass3A7 = (AnonymousClass3A7) anonymousClass3A1.f38500C.get(i2);
                        AnonymousClass45o anonymousClass45o = (AnonymousClass45o) B3;
                        r0 = true;
                        if (i2 != 1) {
                            r0 = false;
                        }
                        AnonymousClass3A8.m18793B(anonymousClass3A7, anonymousClass45o, r0);
                        break;
                    case 2:
                        if (i2 >= anonymousClass3A1.f38500C.size() || !(anonymousClass3A1.f38500C.get(i2) instanceof AnonymousClass39y)) {
                            AnonymousClass3A2.m18790B(B3.dT(), anonymousClass3A1, i2);
                        }
                        AnonymousClass39z.m18788B(context, (AnonymousClass39y) anonymousClass3A1.f38500C.get(i2), (AnonymousClass45k) B3, r3, "product", B3.getId());
                        break;
                    default:
                        break;
                }
                i2++;
            }
            if (AnonymousClass26g.m14458B(anonymousClass45l.JI())) {
                anonymousClass3A1.f38499B.setOnClickListener(null);
            } else {
                anonymousClass3A1.f38499B.setOnClickListener(new AnonymousClass3A0(r3, anonymousClass45l));
            }
            AnonymousClass39P.m18768B(anonymousClass3A1.f38499B, anonymousClass45l.QS().f47584E);
            anonymousClass3A1.f38499B.setBackgroundColor(anonymousClass45l.QS().f47582C);
        } else {
            throw new UnsupportedOperationException("Unsupported Canvas view type");
        }
    }

    /* renamed from: J */
    public final AnonymousClass0oo m18742J(ViewGroup viewGroup, int i) {
        AnonymousClass399 B = AnonymousClass399.m18749B(i);
        if (B == AnonymousClass399.f38322I) {
            return new AnonymousClass39y(AnonymousClass39z.m18789C(viewGroup));
        }
        if (B == AnonymousClass399.f38324K) {
            return new AnonymousClass3yU(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.canvas_slideshow_block, viewGroup, false));
        }
        if (B == AnonymousClass399.f38318E) {
            return new AnonymousClass39l(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.canvas_button_block, viewGroup, false));
        }
        if (B == AnonymousClass399.f38323J) {
            return new AnonymousClass3A7(AnonymousClass3A8.m18794C(viewGroup));
        }
        if (B == AnonymousClass399.f38327N) {
            return new AnonymousClass3AB(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.canvas_media_block, viewGroup, false));
        }
        if (B == AnonymousClass399.f38325L) {
            return new AnonymousClass3A5(AnonymousClass3A6.m18792C(viewGroup));
        }
        if (B == AnonymousClass399.f38321H) {
            return new AnonymousClass3A1(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.canvas_composite_block, viewGroup, false));
        }
        throw new UnsupportedOperationException("Unsupported Canvas view type");
    }

    /* renamed from: P */
    public final boolean m18743P(AnonymousClass399 anonymousClass399) {
        for (int i = 0; i < this.f38279B.m21794C(); i++) {
            if (this.f38279B.m21793B(i).dT().equals(anonymousClass399)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Q */
    public final AnonymousClass3yE m18744Q(int i) {
        return this.f38279B.m21793B(i);
    }

    /* renamed from: R */
    public final AnonymousClass38m m18745R(AnonymousClass3yE anonymousClass3yE) {
        AnonymousClass38m anonymousClass38m = (AnonymousClass38m) this.f38284G.get(anonymousClass3yE.getId());
        if (anonymousClass38m != null) {
            return anonymousClass38m;
        }
        anonymousClass38m = new AnonymousClass38m();
        this.f38284G.put(anonymousClass3yE.getId(), anonymousClass38m);
        return anonymousClass38m;
    }

    public final int getCount() {
        return this.f38279B.m21794C();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return m18744Q(i);
    }

    public final int getItemViewType(int i) {
        return m18744Q(i).dT().m18751A();
    }

    public final boolean isEmpty() {
        return this.f38279B.m21794C() == 0;
    }
}
