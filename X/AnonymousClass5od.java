package X;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* renamed from: X.5od */
public final class AnonymousClass5od {
    /* renamed from: B */
    public final AnonymousClass0EE f69122B;
    /* renamed from: C */
    public final EditText f69123C;
    /* renamed from: D */
    public final AnonymousClass0IJ f69124D;
    /* renamed from: E */
    public final Handler f69125E = new Handler(Looper.getMainLooper());
    /* renamed from: F */
    public boolean f69126F = false;
    /* renamed from: G */
    public final AnonymousClass3e8 f69127G = new AnonymousClass5oT(this);
    /* renamed from: H */
    public AnonymousClass3e1 f69128H;
    /* renamed from: I */
    public final List f69129I = new ArrayList();
    /* renamed from: J */
    public AnonymousClass5m6 f69130J;
    /* renamed from: K */
    public final ListView f69131K;
    /* renamed from: L */
    public final AnonymousClass1Oc f69132L = AnonymousClass1Oc.USERNAME_AND_HASHTAG;
    /* renamed from: M */
    public final AnonymousClass5oc f69133M = new AnonymousClass5oc();
    /* renamed from: N */
    public final TextWatcher f69134N = new AnonymousClass5oU(this);
    /* renamed from: O */
    public final AnonymousClass3eM f69135O = new AnonymousClass5oS(this);
    /* renamed from: P */
    public final AnonymousClass0Cm f69136P;
    /* renamed from: Q */
    private final AnonymousClass6EJ f69137Q;
    /* renamed from: R */
    private final TextView f69138R;
    /* renamed from: S */
    private final int f69139S;

    public AnonymousClass5od(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, EditText editText, TextView textView, ListView listView, AnonymousClass6EJ anonymousClass6EJ) {
        this.f69124D = anonymousClass0IJ;
        this.f69122B = anonymousClass0EE;
        this.f69136P = anonymousClass0Cm;
        this.f69123C = editText;
        this.f69138R = textView;
        this.f69131K = listView;
        this.f69137Q = anonymousClass6EJ;
        this.f69139S = anonymousClass0IJ.getResources().getInteger(C0164R.integer.profile_biography_limit);
    }

    /* renamed from: A */
    public final void m28476A() {
        if (this.f69126F) {
            new AnonymousClass0Sb(this.f69124D.getContext()).Q(C0164R.string.unsaved_changes_title).H(C0164R.string.unsaved_changes_message).L(C0164R.string.no, null).O(C0164R.string.yes, new AnonymousClass5oY(this)).C().show();
        } else {
            AnonymousClass5od.m28471C(this);
        }
    }

    /* renamed from: B */
    public final void m28477B() {
        if (this.f69126F) {
            String obj = this.f69123C.getText().toString();
            List<String> B = AnonymousClass5nO.m28457B(obj);
            if (!B.isEmpty()) {
                AnonymousClass0EE anonymousClass0EE = this.f69122B;
                JSONArray jSONArray = new JSONArray();
                for (String put : B) {
                    jSONArray.put(put);
                }
                AnonymousClass0NN.B("profile_tagging_mas_account_linked", anonymousClass0EE).F("mas_account_pks", jSONArray.toString()).R();
            }
            AnonymousClass0Cn anonymousClass0Cn = this.f69136P;
            String B2 = AnonymousClass0Dt.B(this.f69124D.getContext());
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "accounts/set_biography/";
            AnonymousClass0GA H = anonymousClass0Pt.D("raw_text", obj).D("device_id", B2).N().M(AnonymousClass5nJ.class).H();
            H.f2849B = new AnonymousClass5oa(this);
            AnonymousClass0Px.B(this.f69124D.getContext(), this.f69124D.getLoaderManager(), H);
            AnonymousClass0eT.E(this.f69124D.getActivity()).Y(true);
            return;
        }
        AnonymousClass5od.m28471C(this);
    }

    /* renamed from: B */
    public static void m28470B(AnonymousClass5od anonymousClass5od, String str) {
        CharSequence quantityString;
        int codePointCount = anonymousClass5od.f69139S - str.codePointCount(0, str.length());
        int i = codePointCount < 0 ? 1 : 0;
        anonymousClass5od.f69138R.setTextColor(AnonymousClass0Ca.C(anonymousClass5od.f69124D.getActivity(), i != 0 ? C0164R.color.red_5 : C0164R.color.grey_9));
        anonymousClass5od.f69138R.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) codePointCount));
        TextView textView = anonymousClass5od.f69138R;
        if (i != 0) {
            quantityString = anonymousClass5od.f69124D.getResources().getQuantityString(C0164R.plurals.n_characters_over_the_limit, -codePointCount, new Object[]{Integer.valueOf(-codePointCount)});
        } else {
            quantityString = anonymousClass5od.f69124D.getResources().getQuantityString(C0164R.plurals.n_characters_remaining, codePointCount, new Object[]{Integer.valueOf(codePointCount)});
        }
        textView.setContentDescription(quantityString);
        AnonymousClass6EJ anonymousClass6EJ = anonymousClass5od.f69137Q;
        if (anonymousClass6EJ.f73179B.f69107B != null) {
            anonymousClass6EJ.f73179B.f69107B.setEnabled(i ^ 1);
        }
    }

    /* renamed from: C */
    public static void m28471C(AnonymousClass5od anonymousClass5od) {
        anonymousClass5od.f69124D.getActivity().onBackPressed();
    }

    /* renamed from: D */
    public static String m28472D(String str) {
        if (str.startsWith("@")) {
            return "user";
        }
        if (str.startsWith("#")) {
            return "hashtag";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Impossible query term: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: E */
    public static void m28473E(AnonymousClass5od anonymousClass5od) {
        Iterator it = anonymousClass5od.f69129I.iterator();
        while (it.hasNext()) {
            anonymousClass5od.f69123C.getText().removeSpan(it.next());
            it.remove();
        }
        String obj = anonymousClass5od.f69123C.getText().toString();
        int C = AnonymousClass0Ca.C(anonymousClass5od.f69124D.getContext(), C0164R.color.bioTextEntityFontColor);
        for (AnonymousClass1Az G : AnonymousClass188.D(obj)) {
            anonymousClass5od.m28475G(G, anonymousClass5od.f69123C.getText(), C);
        }
        for (AnonymousClass1Az G2 : AnonymousClass188.C(obj)) {
            anonymousClass5od.m28475G(G2, anonymousClass5od.f69123C.getText(), C);
        }
    }

    /* renamed from: F */
    public static void m28474F(AnonymousClass5od anonymousClass5od, List list, String str, boolean z) {
        anonymousClass5od = anonymousClass5od.f69130J;
        anonymousClass5od.f68852B.clear();
        anonymousClass5od.f68852B.addAll(list);
        anonymousClass5od.f68854D = z;
        anonymousClass5od.f68857G = str;
        anonymousClass5od.C();
        list = null;
        for (AnonymousClass5nM anonymousClass5nM : anonymousClass5od.f68852B) {
            int i;
            AnonymousClass3du B;
            if (anonymousClass5nM.f69021C != null) {
                B = AnonymousClass5m6.m28411B(anonymousClass5od, anonymousClass5nM.m28455A());
                i = list + 1;
                B.f42934B = list;
                anonymousClass5od.B(anonymousClass5nM.f69021C, B, anonymousClass5od.f68858H);
            } else if (anonymousClass5nM.f69020B != null) {
                B = AnonymousClass5m6.m28411B(anonymousClass5od, anonymousClass5nM.m28455A());
                i = list + 1;
                B.f42934B = list;
                anonymousClass5od.B(anonymousClass5nM.f69020B, B, anonymousClass5od.f68853C);
            }
            list = i;
        }
        if (anonymousClass5od.f68854D) {
            anonymousClass5od.B(anonymousClass5od.f68856F, null, anonymousClass5od.f68855E);
        }
        anonymousClass5od.E();
    }

    /* renamed from: G */
    private void m28475G(AnonymousClass1Az anonymousClass1Az, Editable editable, int i) {
        AnonymousClass5ob anonymousClass5ob = new AnonymousClass5ob(i);
        this.f69129I.add(anonymousClass5ob);
        editable.setSpan(anonymousClass5ob, anonymousClass1Az.f15354D, anonymousClass1Az.f15352B, 33);
    }
}
