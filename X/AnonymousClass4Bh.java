package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.4Bh */
public final class AnonymousClass4Bh extends AnonymousClass0Ie implements AnonymousClass0IT {
    /* renamed from: K */
    public static final boolean f51251K = ((Boolean) AnonymousClass0CC.tC.G()).booleanValue();
    /* renamed from: B */
    public AnonymousClass2ec f51252B;
    /* renamed from: C */
    public AnonymousClass33P f51253C;
    /* renamed from: D */
    public String f51254D;
    /* renamed from: E */
    public boolean f51255E;
    /* renamed from: F */
    public String f51256F;
    /* renamed from: G */
    public String f51257G;
    /* renamed from: H */
    public View f51258H;
    /* renamed from: I */
    public AnonymousClass0Cm f51259I;
    /* renamed from: J */
    private String f51260J;

    public final String getModuleName() {
        return "ads_manager_ad_detail";
    }

    /* renamed from: A */
    public final void m23496A() {
        new AnonymousClass0P2(getContext()).V(C0164R.string.confirm_delete_boosted_post_title).K(C0164R.string.confirm_delete_boosted_post_subtitle).S(C0164R.string.ok, new AnonymousClass4Bd(this)).N(C0164R.string.cancel, null).A().show();
    }

    /* renamed from: B */
    public static void m23492B(AnonymousClass4Bh anonymousClass4Bh) {
        AnonymousClass34v anonymousClass34v = new AnonymousClass34v(new AnonymousClass34u(anonymousClass4Bh.f51257G, AnonymousClass0a2.I(anonymousClass4Bh.f51259I), AnonymousClass35n.m18491T(anonymousClass4Bh.f51252B)));
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass34v.f37635B != null) {
                createGenerator.writeFieldName("input");
                AnonymousClass1kG anonymousClass1kG = anonymousClass34v.f37635B;
                createGenerator.writeStartObject();
                if (anonymousClass1kG.f37634E != null) {
                    createGenerator.writeStringField("page_id", anonymousClass1kG.f37634E);
                }
                if (anonymousClass1kG.f37631B != null) {
                    createGenerator.writeStringField("actor_id", anonymousClass1kG.f37631B);
                }
                if (anonymousClass1kG.f37633D != null) {
                    createGenerator.writeStringField("object_id", anonymousClass1kG.f37633D);
                }
                if (anonymousClass1kG.f37632C != null) {
                    createGenerator.writeStringField("boosted_component_app", anonymousClass1kG.f37632C);
                }
                AnonymousClass1kP.B(createGenerator, anonymousClass1kG, false);
                createGenerator.writeEndObject();
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            AnonymousClass0GA A = AnonymousClass1Dj.B(AnonymousClass0a2.B(anonymousClass4Bh.f51259I)).C(new AnonymousClass2A8(stringWriter.toString())).A();
            A.f2849B = new AnonymousClass4BZ(anonymousClass4Bh);
            anonymousClass4Bh.schedule(A);
        } catch (Throwable e) {
            AnonymousClass0Dc.I(anonymousClass4Bh.getModuleName(), e, "Error serializing to JSON", new Object[0]);
        }
    }

    /* renamed from: C */
    public static void m23493C(AnonymousClass4Bh anonymousClass4Bh, boolean z) {
        String anonymousClass2Bj;
        if (z) {
            anonymousClass2Bj = AnonymousClass2Bj.PAUSED.toString();
        } else {
            anonymousClass2Bj = AnonymousClass2Bj.ACTIVE.toString();
        }
        AnonymousClass34x anonymousClass34x = new AnonymousClass34x(new AnonymousClass34w(anonymousClass4Bh.f51257G, AnonymousClass0a2.I(anonymousClass4Bh.f51259I), AnonymousClass35n.m18491T(anonymousClass4Bh.f51252B), anonymousClass2Bj));
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass34x.f37641B != null) {
                createGenerator.writeFieldName("input");
                AnonymousClass1kG anonymousClass1kG = anonymousClass34x.f37641B;
                createGenerator.writeStartObject();
                if (anonymousClass1kG.f37639E != null) {
                    createGenerator.writeStringField("page_id", anonymousClass1kG.f37639E);
                }
                if (anonymousClass1kG.f37636B != null) {
                    createGenerator.writeStringField("actor_id", anonymousClass1kG.f37636B);
                }
                if (anonymousClass1kG.f37638D != null) {
                    createGenerator.writeStringField("object_id", anonymousClass1kG.f37638D);
                }
                if (anonymousClass1kG.f37637C != null) {
                    createGenerator.writeStringField("boosted_component_app", anonymousClass1kG.f37637C);
                }
                if (anonymousClass1kG.f37640F != null) {
                    createGenerator.writeStringField("status", anonymousClass1kG.f37640F);
                }
                AnonymousClass1kP.B(createGenerator, anonymousClass1kG, false);
                createGenerator.writeEndObject();
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            AnonymousClass0GA A = AnonymousClass1Dj.B(AnonymousClass0a2.B(anonymousClass4Bh.f51259I)).C(new AnonymousClass2AA(stringWriter.toString())).A();
            A.f2849B = new AnonymousClass4Bg(anonymousClass4Bh, z);
            anonymousClass4Bh.schedule(A);
        } catch (Throwable e) {
            AnonymousClass0IG.G(anonymousClass4Bh.getContext(), C0164R.string.request_error);
            AnonymousClass0Dc.I(anonymousClass4Bh.getModuleName(), e, "Error serializing to JSON", new Object[0]);
        }
    }

    /* renamed from: D */
    public static void m23494D(AnonymousClass4Bh anonymousClass4Bh) {
        String str = anonymousClass4Bh.f51260J;
        AnonymousClass0GA A = AnonymousClass1Dj.B(AnonymousClass0a2.B(anonymousClass4Bh.f51259I)).C(new AnonymousClass29e(AnonymousClass0IE.E("{\"%s\":\"%s\"}", new Object[]{"0", str}))).A();
        AnonymousClass4Bh.m23495E(anonymousClass4Bh, true);
        A.f2849B = new AnonymousClass4Ba(anonymousClass4Bh);
        anonymousClass4Bh.schedule(A);
    }

    /* renamed from: E */
    public static void m23495E(AnonymousClass4Bh anonymousClass4Bh, boolean z) {
        if (anonymousClass4Bh.getListViewSafe() != null) {
            ((RefreshableListView) anonymousClass4Bh.getListViewSafe()).setIsLoading(z);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.view_promotions);
        anonymousClass0eT.n(getFragmentManager().H() > 0);
        if (this.f51252B != null) {
            AnonymousClass0eT FI = ((BaseFragmentActivity) getActivity()).FI();
            CharSequence N = AnonymousClass35n.m18485N(this.f51252B);
            if (f51251K) {
                String string;
                if (N == null) {
                    string = getResources().getString(C0164R.string.promotions);
                }
                FI.a(string);
            } else {
                View X = FI.X(C0164R.layout.title_subtitle_actionbar, 0, 0);
                TextView textView = (TextView) X.findViewById(C0164R.id.title);
                TextView textView2 = (TextView) X.findViewById(C0164R.id.subtitle);
                if (N == null) {
                    N = getResources().getString(C0164R.string.promotions);
                }
                textView.setText(N);
                textView2.setText(AnonymousClass35n.m18476E(this.f51252B, getResources()));
            }
            AnonymousClass2Bj L = AnonymousClass35n.m18483L(this.f51252B);
            if ((L == AnonymousClass2Bj.PAUSED || L == AnonymousClass2Bj.ACTIVE) && ((Boolean) AnonymousClass0CC.XX.H(this.f51259I)).booleanValue()) {
                FI.F(AnonymousClass0eb.OVERFLOW, new AnonymousClass4Bb(this, L));
            } else {
                FI.F(AnonymousClass0eb.DELETE, new AnonymousClass4Bc(this));
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 64206) {
            if (i2 == -1) {
                AnonymousClass0FO.c(this.f51259I, true, AnonymousClass2HK.AD_DETAIL);
                AnonymousClass4Bh.m23494D(this);
                return;
            }
            AnonymousClass0IG.G(getContext(), C0164R.string.login_to_continue);
            getFragmentManager().L();
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -155401769);
        super.onCreate(bundle);
        this.f51259I = AnonymousClass0Ce.G(getArguments());
        this.f51260J = getArguments().getString("extra_media_id");
        this.f51253C = new AnonymousClass33P(getContext(), this);
        this.f51254D = getArguments().getString("entry_point");
        this.f51255E = getArguments().getBoolean("extra_is_from_promotion_page");
        AnonymousClass0cQ.G(this, 190920638, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1471035040);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_progress, viewGroup, false);
        this.f51258H = inflate;
        AnonymousClass0cQ.G(this, -995584879, F);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setListAdapter(this.f51253C);
        AnonymousClass2IF.m14981B(true, view);
        AnonymousClass0Rq anonymousClass0Rq = this.f51253C;
        anonymousClass0Rq.C();
        anonymousClass0Rq.E();
        if (AnonymousClass0a2.K(this.f51259I)) {
            AnonymousClass4Bh.m23494D(this);
        } else {
            AnonymousClass0FO.C(this.f51259I, this, AnonymousClass2HL.READ_ONLY);
        }
        ((RefreshableListView) getListView()).setupAndEnableRefresh(new AnonymousClass4BX(this));
    }
}
