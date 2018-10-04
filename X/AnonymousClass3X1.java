package X;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.debug.sandbox.SandboxUtil;
import com.instagram.strings.StringBridge;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3X1 */
public final class AnonymousClass3X1 extends AnonymousClass0VA {
    /* renamed from: B */
    public final FragmentActivity f41991B;
    /* renamed from: C */
    public AnonymousClass3Wk f41992C;
    /* renamed from: D */
    public final AnonymousClass0IJ f41993D;
    /* renamed from: E */
    public boolean f41994E;
    /* renamed from: F */
    public AnonymousClass3eZ f41995F = null;
    /* renamed from: G */
    public final AnonymousClass2Na f41996G;
    /* renamed from: H */
    private AnonymousClass3WC f41997H;
    /* renamed from: I */
    private final AnonymousClass0F8 f41998I = new AnonymousClass3Wt(this);
    /* renamed from: J */
    private final AnonymousClass0Cn f41999J;

    public AnonymousClass3X1(AnonymousClass0Cn anonymousClass0Cn, FragmentActivity fragmentActivity, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Na anonymousClass2Na) {
        this.f41999J = anonymousClass0Cn;
        this.f41991B = fragmentActivity;
        this.f41993D = anonymousClass0IJ;
        this.f41996G = anonymousClass2Na;
    }

    /* renamed from: B */
    public static boolean m19834B(AnonymousClass3X1 anonymousClass3X1) {
        anonymousClass3X1 = anonymousClass3X1.f41993D.getArguments();
        if (anonymousClass3X1 == null || anonymousClass3X1.get("autologin") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private boolean m19835C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r1 = X.AnonymousClass0Dt.f1941C;	 Catch:{ RuntimeException -> 0x0009 }
        r0 = r2.f41991B;	 Catch:{ RuntimeException -> 0x0009 }
        r1.A(r0);	 Catch:{ RuntimeException -> 0x0009 }
        r0 = 0;	 Catch:{ RuntimeException -> 0x0009 }
        return r0;	 Catch:{ RuntimeException -> 0x0009 }
    L_0x0009:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3X1.C():boolean");
    }

    /* renamed from: D */
    private void m19836D(View view) {
        if (!AnonymousClass0CB.J()) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C0164R.id.landing_container);
            View inflate = LayoutInflater.from(this.f41991B).inflate(C0164R.layout.button_developer_options, viewGroup, false);
            AnonymousClass3Xy.m19915B(inflate, AnonymousClass0G5.F(this.f41991B, C0164R.attr.nuxTextColor));
            List arrayList = new ArrayList();
            Context context = viewGroup.getContext();
            AnonymousClass3Vp anonymousClass3Vp = AnonymousClass3Vq.f41801C;
            View inflate2 = LayoutInflater.from(context).inflate(C0164R.layout.landing_spinner_group, null, false);
            ((TextView) inflate2.findViewById(C0164R.id.title)).setText("smart lock");
            Spinner spinner = (Spinner) inflate2.findViewById(C0164R.id.spinner);
            AnonymousClass3Vr[] anonymousClass3VrArr = anonymousClass3Vp.f41796F;
            List arrayList2 = new ArrayList();
            String B = anonymousClass3Vp.m19778B();
            view = anonymousClass3Vp.f41792B;
            int length = anonymousClass3VrArr.length;
            int i = 0;
            while (i < anonymousClass3VrArr.length) {
                int i2;
                String str = "%s%s (%d/%d)";
                Object[] objArr = new Object[4];
                objArr[0] = anonymousClass3VrArr[i].f41803B;
                objArr[1] = i == view ? "*" : JsonProperty.USE_DEFAULT_NAME;
                int i3 = anonymousClass3VrArr[i].f41804C;
                if (i == view) {
                    i2 = anonymousClass3Vp.f41799I - anonymousClass3Vp.f41795E;
                } else {
                    i2 = 0;
                }
                objArr[2] = Integer.valueOf(i3 + i2);
                objArr[3] = Integer.valueOf(anonymousClass3Vp.f41799I);
                arrayList2.add(String.format(str, objArr));
                if (anonymousClass3VrArr[i].f41803B.equals(B)) {
                    length = i;
                }
                i++;
            }
            arrayList2.add(AnonymousClass0IE.E("No override (%s)", new Object[]{anonymousClass3Vp.f41796F[anonymousClass3Vp.f41794D].f41803B}));
            spinner.setAdapter(new ArrayAdapter(r6.f41991B, 17367043, arrayList2));
            spinner.setSelection(length);
            spinner.setOnItemSelectedListener(new AnonymousClass3X0(r6, anonymousClass3Vp, anonymousClass3VrArr));
            arrayList.add(inflate2);
            inflate.setOnClickListener(new AnonymousClass3Wy(r6, SandboxUtil.getSandboxDialog(r6.f41991B, arrayList)));
            inflate.setOnLongClickListener(new AnonymousClass3Wz(r6));
            viewGroup.addView(inflate);
        }
    }

    public final void St() {
        super.St();
        AnonymousClass1Ee anonymousClass1Ee = this.f41995F;
        if (anonymousClass1Ee != null) {
            anonymousClass1Ee.A();
        }
    }

    public final void gi() {
        this.f41993D.unregisterLifecycleListener(this.f41997H);
        AnonymousClass0F4.f2058E.D(AnonymousClass0ky.class, this.f41998I);
    }

    public final void oh() {
        AnonymousClass0Cn anonymousClass0Cn = this.f41999J;
        AnonymousClass0EE anonymousClass0EE = this.f41993D;
        this.f41992C = new AnonymousClass3Wk(anonymousClass0Cn, anonymousClass0EE, this.f41996G, anonymousClass0EE);
        AnonymousClass1BF.D(this.f41993D.getContext(), this.f41999J, AnonymousClass1BD.DEFAULT);
        if (StringBridge.getFailedToLoadStrings()) {
            String str = "failed_to_load_library_logged_out";
            AnonymousClass0Gn.C(str, str);
            new AnonymousClass0Sb(this.f41991B).E(false).Q(C0164R.string.error).I(this.f41991B.getString(C0164R.string.unable_to_start)).O(C0164R.string.ok, new AnonymousClass3Wu(this)).C().show();
        }
        if (m19835C()) {
            AnonymousClass0Gn.C("failed_to_write_to_fs", "logged out");
            AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(this.f41991B);
            anonymousClass0Sb.f4938B = 15;
            anonymousClass0Sb.I(this.f41991B.getString(C0164R.string.read_only_filesystem_message, new Object[]{"http://bit.ly/igfilesystem"})).O(C0164R.string.dismiss, new AnonymousClass3Wv(this)).C().show();
        }
        AnonymousClass3X4.m19845J(this.f41991B, this.f41996G);
        AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass2Gt(this.f41991B, this.f41999J, null), 1119654940);
        AnonymousClass28F.m14542B();
    }

    public final void wh(View view) {
        m19836D(view);
        TextView textView = (TextView) view.findViewById(C0164R.id.language_selector_button);
        if (textView != null) {
            if (AnonymousClass0G5.B(this.f41991B, C0164R.attr.nuxAllowLanguagePicker, true)) {
                Context context = this.f41991B;
                CharSequence D = AnonymousClass0EH.D(context);
                int D2 = AnonymousClass0G5.D(this.f41991B, C0164R.attr.nuxTextColor);
                CharSequence spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(D);
                spannableStringBuilder.append("  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new ImageSpan(AnonymousClass0yB.B(context, C0164R.drawable.feed_sponsored_chevron, 8, 0, D2), 1), length - 1, length, 33);
                textView.setText(spannableStringBuilder);
                textView.setOnClickListener(new AnonymousClass3Ww(this));
            } else {
                textView.setVisibility(8);
            }
        }
        this.f41997H = new AnonymousClass3WC(this.f41996G);
        AnonymousClass0F4.f2058E.A(AnonymousClass0ky.class, this.f41998I);
        this.f41993D.registerLifecycleListener(this.f41997H);
    }
}
