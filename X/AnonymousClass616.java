package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.616 */
public final class AnonymousClass616 extends AnonymousClass0Rq implements AnonymousClass5Eu {
    /* renamed from: W */
    private static final AnonymousClass0Wj f70937W = new AnonymousClass614();
    /* renamed from: B */
    public final AnonymousClass5EC f70938B;
    /* renamed from: C */
    public boolean f70939C;
    /* renamed from: D */
    public final AnonymousClass5ED f70940D;
    /* renamed from: E */
    public boolean f70941E;
    /* renamed from: F */
    public final AnonymousClass5EF f70942F = new AnonymousClass5EF();
    /* renamed from: G */
    public String f70943G;
    /* renamed from: H */
    public final AnonymousClass3j2 f70944H = new AnonymousClass3j2();
    /* renamed from: I */
    public final AnonymousClass3j3 f70945I = new AnonymousClass3j3();
    /* renamed from: J */
    public boolean f70946J;
    /* renamed from: K */
    public final AnonymousClass5EF f70947K = new AnonymousClass5EF();
    /* renamed from: L */
    public String f70948L;
    /* renamed from: M */
    public final AnonymousClass5EE f70949M;
    /* renamed from: N */
    private final AnonymousClass3e5 f70950N;
    /* renamed from: O */
    private final AnonymousClass3e5 f70951O = new AnonymousClass41j();
    /* renamed from: P */
    private final Context f70952P;
    /* renamed from: Q */
    private final AnonymousClass3iw f70953Q;
    /* renamed from: R */
    private final AnonymousClass3j4 f70954R;
    /* renamed from: S */
    private final Map f70955S = new HashMap();
    /* renamed from: T */
    private final AnonymousClass5F8 f70956T;
    /* renamed from: U */
    private final AnonymousClass0Cm f70957U;
    /* renamed from: V */
    private final AnonymousClass1BN f70958V;

    public AnonymousClass616(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass6FD anonymousClass6FD, AnonymousClass3e5 anonymousClass3e5, AnonymousClass3eO anonymousClass3eO) {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.f70948L = str;
        this.f70943G = str;
        this.f70952P = context;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f70957U = anonymousClass0Cm;
        this.f70958V = AnonymousClass1BN.C(this.f70957U);
        this.f70950N = anonymousClass3e5;
        this.f70953Q = new AnonymousClass3iw(this.f70952P);
        this.f70956T = new AnonymousClass5F8(this.f70952P);
        this.f70949M = new AnonymousClass5EE(this.f70952P, anonymousClass0Cm2, anonymousClass6FD, ((Boolean) AnonymousClass0CC.TM.H(anonymousClass0Cm)).booleanValue(), "search_top", true, anonymousClass3eO);
        this.f70938B = new AnonymousClass5EC(this.f70952P, anonymousClass0Cm, anonymousClass6FD, false);
        this.f70940D = new AnonymousClass5ED(this.f70952P, anonymousClass6FD, false);
        this.f70954R = new AnonymousClass3j4(this.f70952P, anonymousClass6FD);
        D(new AnonymousClass0TB[]{this.f70953Q, this.f70956T, this.f70949M, this.f70938B, this.f70940D, this.f70954R});
    }

    /* renamed from: B */
    public static void m28776B(AnonymousClass616 anonymousClass616) {
        anonymousClass616.C();
        int i = 0;
        if (!anonymousClass616.f70939C) {
            Object obj = (anonymousClass616.f70941E && anonymousClass616.f70942F.m26018G()) ? 1 : null;
            if (obj != null) {
                anonymousClass616.A(anonymousClass616.f70952P.getString(C0164R.string.no_results_found), anonymousClass616.f70953Q);
                if (anonymousClass616.f70946J) {
                    anonymousClass616.B(anonymousClass616.f70944H, anonymousClass616.f70945I, anonymousClass616.f70954R);
                }
                anonymousClass616.E();
            }
        } else if (!anonymousClass616.f70947K.m26018G()) {
            anonymousClass616.A(anonymousClass616.f70952P.getString(C0164R.string.search_suggested), anonymousClass616.f70956T);
            anonymousClass616.m28777C(anonymousClass616.f70947K, 0);
            i = 0 + anonymousClass616.f70947K.m26020I();
            if (!anonymousClass616.f70942F.m26018G()) {
                anonymousClass616.A(anonymousClass616.f70952P.getString(C0164R.string.search_recent), anonymousClass616.f70956T);
            }
        }
        anonymousClass616.m28777C(anonymousClass616.f70942F, i);
        if (anonymousClass616.f70946J) {
            anonymousClass616.B(anonymousClass616.f70944H, anonymousClass616.f70945I, anonymousClass616.f70954R);
        }
        anonymousClass616.E();
    }

    /* renamed from: C */
    private void m28777C(AnonymousClass5EF anonymousClass5EF, int i) {
        for (int i2 = 0; i2 < anonymousClass5EF.m26020I(); i2++) {
            AnonymousClass1K9 anonymousClass1K9 = (AnonymousClass1K9) anonymousClass5EF.m26017F(i2);
            AnonymousClass3du E = m28779E(anonymousClass1K9.A());
            E.f42934B = i2 + i;
            E.f42937E = anonymousClass1K9.f17159E;
            E.f42935C = anonymousClass1K9.f17158D;
            switch (anonymousClass1K9.f17160F) {
                case 0:
                    B(anonymousClass1K9.F(), E, this.f70949M);
                    break;
                case 1:
                    B(anonymousClass1K9.B(), E, this.f70938B);
                    break;
                case 2:
                    B(anonymousClass1K9.D(), E, this.f70940D);
                    break;
                default:
                    throw new IllegalArgumentException("unknown search entity type");
            }
        }
    }

    /* renamed from: D */
    private List m28778D(String str) {
        Object B = AnonymousClass1Zd.B(str);
        if (TextUtils.isEmpty(B)) {
            return Collections.emptyList();
        }
        Set<AnonymousClass0Ci> hashSet = new HashSet();
        this.f70958V.B("autocomplete_user_list", B, hashSet, null);
        List arrayList = new ArrayList(hashSet.size());
        for (AnonymousClass0Ci anonymousClass1KI : hashSet) {
            AnonymousClass1KA anonymousClass1KI2 = new AnonymousClass1KI(anonymousClass1KI);
            AnonymousClass1K9 B2 = AnonymousClass1K9.B(anonymousClass1KI2);
            B2.f17152D = anonymousClass1KI2.f17169B;
            B2.G();
            arrayList.add(B2);
        }
        this.f70958V.C("autocomplete_user_list", arrayList, f70937W, null);
        return arrayList;
    }

    /* renamed from: E */
    private AnonymousClass3du m28779E(String str) {
        AnonymousClass3du anonymousClass3du = (AnonymousClass3du) this.f70955S.get(str);
        if (anonymousClass3du != null) {
            return anonymousClass3du;
        }
        anonymousClass3du = new AnonymousClass3du();
        this.f70955S.put(str, anonymousClass3du);
        return anonymousClass3du;
    }

    public final AnonymousClass3du ES(String str) {
        return m28779E(str);
    }

    /* renamed from: F */
    public final boolean m28780F(String str) {
        if (!this.f70947K.m26016E(str)) {
            if (!this.f70942F.m26016E(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final AnonymousClass615 m28781G(String str) {
        String str2;
        AnonymousClass1K9 anonymousClass1K9;
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int i = 0;
        String str3 = null;
        if (this.f70939C) {
            str2 = null;
            for (int i2 = 0; i2 < this.f70947K.m26020I(); i2++) {
                anonymousClass1K9 = (AnonymousClass1K9) this.f70947K.m26017F(i2);
                arrayList.add(anonymousClass1K9.C());
                arrayList2.add(anonymousClass1K9.E());
                if (str != null && anonymousClass1K9.A().equals(str)) {
                    str2 = anonymousClass1K9.E();
                    str3 = anonymousClass1K9.C();
                }
            }
        } else {
            str2 = null;
        }
        while (i < this.f70942F.m26020I()) {
            anonymousClass1K9 = (AnonymousClass1K9) this.f70942F.m26017F(i);
            arrayList.add(anonymousClass1K9.C() != null ? anonymousClass1K9.C() : JsonProperty.USE_DEFAULT_NAME);
            arrayList2.add(anonymousClass1K9.E());
            if (str != null && anonymousClass1K9.A().equals(str)) {
                str2 = anonymousClass1K9.E();
                str3 = anonymousClass1K9.C();
            }
            i++;
        }
        return new AnonymousClass615(str3, str2, arrayList, arrayList2);
    }

    /* renamed from: H */
    public final void m28782H(String str) {
        if (this.f70947K.m26019H(str) || this.f70942F.m26019H(str)) {
            AnonymousClass616.m28776B(this);
        }
    }

    /* renamed from: I */
    public final boolean m28783I(String str) {
        return this.f70939C && this.f70947K.m26016E(str);
    }

    /* renamed from: J */
    public final void m28784J(List list, String str, boolean z) {
        this.f70943G = str;
        this.f70941E = true;
        Collections.sort(list, new AnonymousClass613());
        this.f70942F.m26014C(list, z);
        AnonymousClass616.m28776B(this);
    }

    /* renamed from: K */
    public final boolean m28785K(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        this.f70939C = isEmpty;
        Iterator it;
        AnonymousClass1K9 B;
        if (isEmpty) {
            this.f70947K.m26015D();
            this.f70947K.m26013B(AnonymousClass0Rh.B(this.f70957U).B(AnonymousClass1K7.BLENDED), true, "SUGGESTED");
            if (!this.f70947K.m26018G()) {
                this.f70948L = AnonymousClass0Rh.B(this.f70957U).A(AnonymousClass1K7.BLENDED);
            }
            this.f70942F.m26015D();
            AnonymousClass5EF anonymousClass5EF = this.f70942F;
            List arrayList = new ArrayList();
            AnonymousClass1KK anonymousClass1KK = AnonymousClass1KJ.f17170B;
            synchronized (anonymousClass1KK) {
                AnonymousClass1KK.B(anonymousClass1KK);
                List<AnonymousClass1KI> unmodifiableList = Collections.unmodifiableList(anonymousClass1KK.f17172B);
            }
            AnonymousClass3dh anonymousClass3dh = AnonymousClass3dg.f42916B;
            synchronized (anonymousClass3dh) {
                AnonymousClass3dh.B(anonymousClass3dh);
                List<AnonymousClass1KH> unmodifiableList2 = Collections.unmodifiableList(anonymousClass3dh.f42917B);
            }
            AnonymousClass3dj anonymousClass3dj = AnonymousClass3di.f42918B;
            synchronized (anonymousClass3dj) {
                AnonymousClass3dj.B(anonymousClass3dj);
                List<AnonymousClass1KG> unmodifiableList3 = Collections.unmodifiableList(anonymousClass3dj.f42919B);
            }
            for (AnonymousClass1KI anonymousClass1KI : unmodifiableList) {
                B = AnonymousClass1K9.B(anonymousClass1KI);
                B.f17152D = anonymousClass1KI.f17169B;
                B.G();
                arrayList.add(B);
            }
            for (AnonymousClass1KH anonymousClass1KH : unmodifiableList2) {
                B = AnonymousClass1K9.B(anonymousClass1KH);
                B.f17150B = anonymousClass1KH.f17168B;
                B.G();
                arrayList.add(B);
            }
            for (AnonymousClass1KG anonymousClass1KG : unmodifiableList3) {
                B = AnonymousClass1K9.B(anonymousClass1KG);
                B.f17151C = anonymousClass1KG.f17167B;
                B.G();
                arrayList.add(B);
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new AnonymousClass1KP());
            }
            it = this.f70947K.iterator();
            while (it.hasNext()) {
                B = (AnonymousClass1K9) it.next();
                if (arrayList.contains(B)) {
                    arrayList.remove(B);
                }
            }
            anonymousClass5EF.m26013B(arrayList, true, "RECENT");
        } else {
            List arrayList2 = new ArrayList();
            Collection D = m28778D(str);
            AnonymousClass5Eb.m26030B(D, 3);
            arrayList2.addAll(D);
            List list = this.f70951O.KQ(str).f42954D;
            if (list == null) {
                AnonymousClass5EF anonymousClass5EF2 = this.f70942F;
                list = new ArrayList();
                Iterator it2 = anonymousClass5EF2.iterator();
                while (it2.hasNext()) {
                    String uT;
                    String str2;
                    AnonymousClass1K9 anonymousClass1K9 = (AnonymousClass1K9) it2.next();
                    switch (anonymousClass1K9.f17160F) {
                        case 0:
                            uT = anonymousClass1K9.F().uT();
                            str2 = anonymousClass1K9.F().f1757z;
                            break;
                        case 1:
                            uT = anonymousClass1K9.B().f2793M;
                            break;
                        case 2:
                            uT = anonymousClass1K9.D().C();
                            break;
                        default:
                            throw new IllegalArgumentException("unknown search entity type");
                    }
                    str2 = uT;
                    if (uT.toLowerCase(AnonymousClass0EH.E()).startsWith(str.toLowerCase(AnonymousClass0EH.E())) || (r8 != null && r8.toLowerCase(AnonymousClass0EH.E()).startsWith(str.toLowerCase(AnonymousClass0EH.E())))) {
                        list.add(anonymousClass1K9);
                    }
                }
                this.f70951O.xB(str, list, null);
            }
            AnonymousClass5Eb.m26030B(r2, 3);
            for (AnonymousClass1K9 B2 : r2) {
                if (!arrayList2.contains(B2)) {
                    arrayList2.add(B2);
                }
            }
            this.f70942F.m26015D();
            if (!arrayList2.isEmpty()) {
                this.f70942F.m26013B(arrayList2, true, null);
            }
        }
        if (!this.f70939C) {
            this.f70941E = false;
            AnonymousClass3e3 KQ = this.f70950N.KQ(str);
            if (KQ.f42954D != null) {
                switch (KQ.f42956F.ordinal()) {
                    case 1:
                        this.f70942F.m26014C(KQ.f42954D, true);
                        break;
                    case 2:
                        m28784J(KQ.f42954D, KQ.f42955E, true);
                        break;
                    default:
                        break;
                }
            }
        }
        this.f70941E = true;
        AnonymousClass616.m28776B(this);
        return this.f70941E;
    }
}
