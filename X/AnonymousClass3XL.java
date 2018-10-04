package X;

import android.app.Activity;
import android.view.View;
import com.instagram.nux.ui.Omnibox;

/* renamed from: X.3XL */
public final class AnonymousClass3XL extends AnonymousClass0VA {
    /* renamed from: B */
    public final View f42044B;
    /* renamed from: C */
    public final AnonymousClass56t f42045C;
    /* renamed from: D */
    public final AnonymousClass3KL f42046D;
    /* renamed from: E */
    public final Omnibox f42047E;
    /* renamed from: F */
    public final AnonymousClass3a4 f42048F;

    public AnonymousClass3XL(Activity activity, Omnibox omnibox, View view, AnonymousClass2Na anonymousClass2Na, AnonymousClass56t anonymousClass56t) {
        Object obj;
        StringBuilder stringBuilder;
        this.f42047E = omnibox;
        this.f42044B = view;
        this.f42046D = new AnonymousClass3KL(activity, omnibox, anonymousClass2Na);
        this.f42048F = new AnonymousClass3a4(activity, omnibox, anonymousClass2Na);
        this.f42045C = anonymousClass56t;
        String str = (String) AnonymousClass0CC.wd.G();
        int hashCode = str.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode == 104712844) {
                if (str.equals("never")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            AnonymousClass0Gn.C("OmniboxHelper", "We shouldn't init OmniboxHelper in control");
                            break;
                        case 1:
                            if (m19874A().trim().isEmpty()) {
                                this.f42048F.m20067A();
                                AnonymousClass0Nm.P(this.f42047E);
                                this.f42047E.getText().toString();
                            }
                            if (m19874A().trim().isEmpty()) {
                                this.f42046D.m19408A();
                            }
                            break;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid variant: ");
                            stringBuilder.append(str);
                            AnonymousClass0Gn.C("OmniboxHelper", stringBuilder.toString());
                            break;
                    }
                    this.f42045C.Kd();
                    this.f42044B.setOnClickListener(new AnonymousClass3XJ(this));
                    this.f42047E.addTextChangedListener(new AnonymousClass3XK(this));
                    AnonymousClass3XL.m19873B(this);
                }
            }
        } else if (str.equals("always")) {
            obj = 1;
            switch (obj) {
                case null:
                    AnonymousClass0Gn.C("OmniboxHelper", "We shouldn't init OmniboxHelper in control");
                    break;
                case 1:
                    if (m19874A().trim().isEmpty()) {
                        this.f42048F.m20067A();
                        AnonymousClass0Nm.P(this.f42047E);
                        this.f42047E.getText().toString();
                    }
                    if (m19874A().trim().isEmpty()) {
                        this.f42046D.m19408A();
                    }
                    break;
                default:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid variant: ");
                    stringBuilder.append(str);
                    AnonymousClass0Gn.C("OmniboxHelper", stringBuilder.toString());
                    break;
            }
            this.f42045C.Kd();
            this.f42044B.setOnClickListener(new AnonymousClass3XJ(this));
            this.f42047E.addTextChangedListener(new AnonymousClass3XK(this));
            AnonymousClass3XL.m19873B(this);
        }
        obj = -1;
        switch (obj) {
            case null:
                AnonymousClass0Gn.C("OmniboxHelper", "We shouldn't init OmniboxHelper in control");
                break;
            case 1:
                if (m19874A().trim().isEmpty()) {
                    this.f42048F.m20067A();
                    AnonymousClass0Nm.P(this.f42047E);
                    this.f42047E.getText().toString();
                }
                if (m19874A().trim().isEmpty()) {
                    this.f42046D.m19408A();
                }
                break;
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid variant: ");
                stringBuilder.append(str);
                AnonymousClass0Gn.C("OmniboxHelper", stringBuilder.toString());
                break;
        }
        this.f42045C.Kd();
        this.f42044B.setOnClickListener(new AnonymousClass3XJ(this));
        this.f42047E.addTextChangedListener(new AnonymousClass3XK(this));
        AnonymousClass3XL.m19873B(this);
    }

    /* renamed from: A */
    public final String m19874A() {
        return this.f42047E.getText().toString();
    }

    /* renamed from: B */
    public final AnonymousClass3YB m19875B() {
        return this.f42047E.m19935A();
    }

    /* renamed from: B */
    public static void m19873B(AnonymousClass3XL anonymousClass3XL) {
        anonymousClass3XL.f42044B.setVisibility(AnonymousClass0Nm.P(anonymousClass3XL.f42047E) ? 4 : 0);
    }

    public final void St() {
        AnonymousClass0Nm.N(this.f42047E);
    }

    public final void gx() {
        AnonymousClass3X4.m19850O(this.f42047E);
    }
}
