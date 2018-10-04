package com.instagram.base.activity;

import X.AnonymousClass0CB;
import X.AnonymousClass0EH;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0FZ;
import X.AnonymousClass0G5;
import X.AnonymousClass0Hh;
import X.AnonymousClass0Hi;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0Nm;
import X.AnonymousClass0bt;
import X.AnonymousClass0cK;
import X.AnonymousClass0cQ;
import X.AnonymousClass0cs;
import X.AnonymousClass0ct;
import X.AnonymousClass0dY;
import X.AnonymousClass0dZ;
import X.AnonymousClass0da;
import X.AnonymousClass0eT;
import X.AnonymousClass0ei;
import X.AnonymousClass0iW;
import X.AnonymousClass0ip;
import X.AnonymousClass1PZ;
import X.AnonymousClass22s;
import X.AnonymousClass426;
import X.AnonymousClass427;
import X.AnonymousClass428;
import X.AnonymousClass429;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.pixelguide.PixelGuideView;

public abstract class BaseFragmentActivity extends IgFragmentActivity implements AnonymousClass22s, AnonymousClass0Hh, AnonymousClass0Hi {
    /* renamed from: B */
    public OnClickListener f2696B = new AnonymousClass0da(this);
    /* renamed from: C */
    public final AnonymousClass0cK f2697C = new AnonymousClass0dY(this);
    /* renamed from: D */
    public AnonymousClass0ei f2698D;
    /* renamed from: E */
    private AnonymousClass0eT f2699E;
    /* renamed from: F */
    private TextView f2700F;
    /* renamed from: G */
    private AnonymousClass1PZ f2701G;
    /* renamed from: H */
    private TextView f2702H;
    /* renamed from: I */
    private final AnonymousClass0F8 f2703I = new AnonymousClass0dZ(this);

    /* renamed from: T */
    public abstract void mo394T();

    /* renamed from: V */
    public boolean mo1258V() {
        return true;
    }

    /* renamed from: F */
    public final void mo433F(AnonymousClass0IL anonymousClass0IL) {
        m2085Q();
    }

    public final AnonymousClass0eT FI() {
        return this.f2699E;
    }

    /* renamed from: G */
    private static boolean m2082G(AnonymousClass0IL anonymousClass0IL, AnonymousClass0eT anonymousClass0eT) {
        if ((anonymousClass0IL instanceof AnonymousClass0bt) && ((AnonymousClass0bt) anonymousClass0IL).bW()) {
            return false;
        }
        if ((anonymousClass0eT == null || anonymousClass0eT.f7733I) && (anonymousClass0IL instanceof AnonymousClass0IT) && !AnonymousClass0iW.m6908D(anonymousClass0IL)) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public void m2084P() {
        AnonymousClass0IL E = mo382D().mo1453E(C0164R.id.layout_container_main);
        if (E instanceof AnonymousClass0IT) {
            this.f2699E.m6343R((AnonymousClass0IT) E);
        } else if (E instanceof AnonymousClass22s) {
            this.f2699E.f7727C.setVisibility(8);
        } else {
            this.f2699E.m6343R(null);
        }
    }

    /* renamed from: Q */
    public final void m2085Q() {
        AnonymousClass0IL E = mo382D().mo1453E(C0164R.id.layout_container_main);
        if (E != null) {
            if (E.getView() != null) {
                findViewById(C0164R.id.layout_container_main).setPadding(0, m2082G(E, this.f2699E) ? AnonymousClass0ip.m7031B(this) : 0, 0, 0);
            }
        }
    }

    /* renamed from: R */
    public int mo392R() {
        return C0164R.layout.activity_fragment_host;
    }

    /* renamed from: S */
    public final AnonymousClass1PZ m2087S() {
        if (this.f2701G == null) {
            AnonymousClass1PZ anonymousClass1PZ = new AnonymousClass1PZ();
            this.f2701G = anonymousClass1PZ;
            ViewStub viewStub = (ViewStub) findViewById(C0164R.id.snack_bar);
            viewStub.setLayoutResource(C0164R.layout.snackbar);
            anonymousClass1PZ.f18183G = new AnonymousClass0ct(viewStub);
        }
        return this.f2701G;
    }

    /* renamed from: U */
    public final void m2089U() {
        if (!AnonymousClass0CB.m840J()) {
            if (this.f2702H == null) {
                this.f2702H = (TextView) ((ViewStub) findViewById(C0164R.id.qe_tool_overlay_stub)).inflate();
            }
            AnonymousClass0FZ B = AnonymousClass0FZ.m1634B();
            int i = 0;
            StringBuilder stringBuilder;
            if (B.m1638D()) {
                TextView textView = this.f2702H;
                stringBuilder = new StringBuilder();
                stringBuilder.append("QE Bisect IGID: ");
                stringBuilder.append(B.m1642H());
                textView.setText(stringBuilder.toString());
                this.f2702H.setVisibility(0);
                return;
            }
            Object obj;
            CharSequence stringBuilder2 = new StringBuilder();
            stringBuilder2.append("QE Spoof ");
            if (B.m1639E()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("IGID: ");
                stringBuilder.append(B.m1643I());
                stringBuilder2.append(stringBuilder.toString());
                obj = 1;
            } else {
                obj = null;
            }
            if (B.m1637C()) {
                if (obj != null) {
                    stringBuilder2.append(" | ");
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Device ID: ");
                stringBuilder.append(B.m1641G());
                stringBuilder2.append(stringBuilder.toString());
                obj = 1;
            }
            this.f2702H.setText(stringBuilder2);
            TextView textView2 = this.f2702H;
            if (obj == null) {
                i = 8;
            }
            textView2.setVisibility(i);
        }
    }

    public final void ji() {
        if (this.f2700F == null) {
            this.f2700F = (TextView) ((ViewStub) findViewById(C0164R.id.devserver_indicator_stub)).inflate();
        }
        if (AnonymousClass0FZ.m1634B().m1648N()) {
            this.f2700F.setText(AnonymousClass0FZ.m1634B().m1635A());
            this.f2700F.setVisibility(0);
            return;
        }
        this.f2700F.setVisibility(8);
    }

    public void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, 955057209);
        AnonymousClass0EH.m1380J(getResources());
        if (mo1258V()) {
            AnonymousClass0G5.m1728I(this);
        }
        setContentView(mo392R());
        this.f2699E = new AnonymousClass0eT((ViewGroup) findViewById(C0164R.id.action_bar_container), this.f2696B);
        super.onCreate(bundle);
        mo382D().mo1449A(this.f2697C);
        mo394T();
        this.f2698D = new AnonymousClass0ei((ViewStub) findViewById(C0164R.id.pixel_guide_stub), AnonymousClass0FZ.m1634B());
        AnonymousClass0cQ.m5853C(this, -927139192, B);
    }

    public void onPause() {
        int B = AnonymousClass0cQ.m5852B(this, 99066112);
        super.onPause();
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass0cs.class, this.f2703I);
        AnonymousClass0cQ.m5853C(this, -1442534514, B);
    }

    public void onResume() {
        int B = AnonymousClass0cQ.m5852B(this, -278735019);
        super.onResume();
        m2084P();
        m2085Q();
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0cs.class, this.f2703I);
        AnonymousClass0ei anonymousClass0ei = this.f2698D;
        if (anonymousClass0ei.f7829B.f2177B.getBoolean("pixel_grid", false)) {
            Object obj;
            anonymousClass0ei.f7830C.m5931D(0);
            PixelGuideView pixelGuideView = (PixelGuideView) anonymousClass0ei.f7830C.m5928A();
            String string = anonymousClass0ei.f7829B.f2177B.getString("pixel_guide_style", null);
            if (TextUtils.isEmpty(string)) {
                string = "Pixel Grid";
            }
            int C = (int) AnonymousClass0Nm.m3424C(pixelGuideView.getContext(), anonymousClass0ei.f7829B.f2177B.getInt("pixel_guide_size", 8));
            int hashCode = string.hashCode();
            if (hashCode != -1427524836) {
                if (hashCode != -398112099) {
                    if (hashCode == 1895940554) {
                        if (string.equals("Horizontal Stripes")) {
                            obj = null;
                            switch (obj) {
                                case null:
                                    pixelGuideView.f43646D = new AnonymousClass426(pixelGuideView.f43649G, C);
                                    break;
                                case 1:
                                    pixelGuideView.f43646D = new AnonymousClass429(pixelGuideView.f43649G, C);
                                    break;
                                case 2:
                                    pixelGuideView.f43646D = new AnonymousClass428(pixelGuideView.f43649G, C);
                                    break;
                                default:
                                    pixelGuideView.f43646D = new AnonymousClass427(587137024, 570425344, C);
                                    break;
                            }
                            pixelGuideView.invalidate();
                        }
                    }
                } else if (string.equals("Vertical And Horizontal Stripes")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            pixelGuideView.f43646D = new AnonymousClass426(pixelGuideView.f43649G, C);
                            break;
                        case 1:
                            pixelGuideView.f43646D = new AnonymousClass429(pixelGuideView.f43649G, C);
                            break;
                        case 2:
                            pixelGuideView.f43646D = new AnonymousClass428(pixelGuideView.f43649G, C);
                            break;
                        default:
                            pixelGuideView.f43646D = new AnonymousClass427(587137024, 570425344, C);
                            break;
                    }
                    pixelGuideView.invalidate();
                }
            } else if (string.equals("Vertical Stripes")) {
                obj = 1;
                switch (obj) {
                    case null:
                        pixelGuideView.f43646D = new AnonymousClass426(pixelGuideView.f43649G, C);
                        break;
                    case 1:
                        pixelGuideView.f43646D = new AnonymousClass429(pixelGuideView.f43649G, C);
                        break;
                    case 2:
                        pixelGuideView.f43646D = new AnonymousClass428(pixelGuideView.f43649G, C);
                        break;
                    default:
                        pixelGuideView.f43646D = new AnonymousClass427(587137024, 570425344, C);
                        break;
                }
                pixelGuideView.invalidate();
            }
            obj = -1;
            switch (obj) {
                case null:
                    pixelGuideView.f43646D = new AnonymousClass426(pixelGuideView.f43649G, C);
                    break;
                case 1:
                    pixelGuideView.f43646D = new AnonymousClass429(pixelGuideView.f43649G, C);
                    break;
                case 2:
                    pixelGuideView.f43646D = new AnonymousClass428(pixelGuideView.f43649G, C);
                    break;
                default:
                    pixelGuideView.f43646D = new AnonymousClass427(587137024, 570425344, C);
                    break;
            }
            pixelGuideView.invalidate();
        } else {
            anonymousClass0ei.f7830C.m5931D(8);
        }
        if (AnonymousClass0FZ.m1634B().m1648N()) {
            ji();
        }
        if (AnonymousClass0FZ.m1634B().m1639E() || AnonymousClass0FZ.m1634B().m1637C() || AnonymousClass0FZ.m1634B().m1638D()) {
            m2089U();
        }
        AnonymousClass0cQ.m5853C(this, 1301562503, B);
    }
}
