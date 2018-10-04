package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.5Ui */
public final class AnonymousClass5Ui extends AnonymousClass0nJ implements AnonymousClass3kY, AnonymousClass1ev, AnonymousClass3kZ {
    /* renamed from: V */
    private static long f65051V = 1000;
    /* renamed from: B */
    public boolean f65052B;
    /* renamed from: C */
    public final AnonymousClass4ZA f65053C;
    /* renamed from: D */
    public boolean f65054D;
    /* renamed from: E */
    public final int f65055E;
    /* renamed from: F */
    public final boolean f65056F;
    /* renamed from: G */
    public String f65057G;
    /* renamed from: H */
    public final AnonymousClass0ES f65058H;
    /* renamed from: I */
    public final AnonymousClass0Tj f65059I;
    /* renamed from: J */
    public final List f65060J;
    /* renamed from: K */
    public final AnonymousClass4ZN f65061K;
    /* renamed from: L */
    public final int f65062L;
    /* renamed from: M */
    public final LinkedHashSet f65063M;
    /* renamed from: N */
    public AnonymousClass4ZE f65064N = AnonymousClass4ZE.NONE;
    /* renamed from: O */
    public final AnonymousClass0Cm f65065O;
    /* renamed from: P */
    private final boolean f65066P;
    /* renamed from: Q */
    private boolean f65067Q;
    /* renamed from: R */
    private AnonymousClass0P7 f65068R;
    /* renamed from: S */
    private final int f65069S;
    /* renamed from: T */
    private final HashMap f65070T = new HashMap();
    /* renamed from: U */
    private final boolean f65071U;

    public AnonymousClass5Ui(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass4ZA anonymousClass4ZA, AnonymousClass4ZN anonymousClass4ZN, int i, int i2, boolean z, boolean z2, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0ES anonymousClass0ES) {
        boolean z3;
        int i3 = 1;
        O(true);
        this.f65060J = new ArrayList();
        this.f65063M = new LinkedHashSet();
        this.f65065O = anonymousClass0Cm;
        this.f65053C = anonymousClass4ZA;
        this.f65061K = anonymousClass4ZN;
        this.f65062L = i;
        this.f65069S = i2;
        this.f65071U = z2;
        this.f65068R = anonymousClass0P7;
        if (z) {
            AnonymousClass0P7 anonymousClass0P72 = this.f65068R;
            if (anonymousClass0P72 != null && anonymousClass0P72.nA()) {
                z3 = true;
                this.f65066P = z3;
                if ((this.f65062L == 0 ? 1 : null) != null) {
                    i3 = 2;
                }
                if (this.f65066P) {
                    i3++;
                }
                this.f65055E = i3;
                this.f65059I = AnonymousClass0Tj.B(this.f65065O);
                this.f65056F = AnonymousClass0J0.B(this.f65065O);
                this.f65058H = anonymousClass0ES;
            }
        }
        z3 = false;
        this.f65066P = z3;
        if (this.f65062L == 0) {
        }
        if ((this.f65062L == 0 ? 1 : null) != null) {
            i3 = 2;
        }
        if (this.f65066P) {
            i3++;
        }
        this.f65055E = i3;
        this.f65059I = AnonymousClass0Tj.B(this.f65065O);
        this.f65056F = AnonymousClass0J0.B(this.f65065O);
        this.f65058H = anonymousClass0ES;
    }

    /* renamed from: B */
    public final int m27094B() {
        return (this.f65055E + this.f65060J.size()) + this.f65067Q;
    }

    public final void Bz(String str) {
        this.f65053C.Bz(str);
    }

    public final void Cz() {
        this.f65053C.Cz();
    }

    /* renamed from: I */
    public final void m27095I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass0oo anonymousClass0oo2 = anonymousClass0oo;
        AnonymousClass5Ui anonymousClass5Ui = this;
        switch (anonymousClass0oo.f10374F) {
            case 0:
                return;
            case 1:
                String string;
                Context context = anonymousClass0oo.f10370B.getContext();
                AnonymousClass3j6 anonymousClass3j6 = (AnonymousClass3j6) anonymousClass0oo.f10370B.getTag();
                if (this.f65054D) {
                    string = context.getString(C0164R.string.search_for_x, new Object[]{this.f65057G});
                } else {
                    string = context.getString(C0164R.string.searching);
                }
                AnonymousClass1Tm.B(anonymousClass3j6, string, AnonymousClass0Ca.C(context, this.f65054D ? C0164R.color.blue_5 : C0164R.color.grey_5), true ^ this.f65054D, this);
                return;
            case 2:
                int i2 = i;
                DirectShareTarget P = m27097P(i2);
                if (P.B().isEmpty()) {
                    P = new DirectShareTarget(Collections.singletonList(new PendingRecipient(this.f65065O.B())), P.f5604E, P.f5601B, true);
                }
                Context context2 = anonymousClass0oo.f10370B.getContext();
                View view = anonymousClass0oo.f10370B;
                AnonymousClass0Ci B = this.f65065O.B();
                boolean contains = this.f65063M.contains(P);
                int indexOf = this.f65060J.indexOf(P);
                anonymousClass0oo = anonymousClass5Ui.f65056F ? AnonymousClass1Pw.G(context2, anonymousClass5Ui.f65059I, P) : null;
                i = (anonymousClass5Ui.f65056F && ((Boolean) AnonymousClass0CC.bH.H(anonymousClass5Ui.f65065O)).booleanValue() && !P.D() && AnonymousClass1Pw.K(anonymousClass5Ui.f65059I, P)) ? 1 : 0;
                AnonymousClass4lA C = AnonymousClass4lA.C(context2, P, B, 5, contains, indexOf, anonymousClass0oo, i);
                AnonymousClass4l6 anonymousClass5Uh = new AnonymousClass5Uh(anonymousClass5Ui);
                AnonymousClass0ES anonymousClass0ES = anonymousClass5Ui.f65058H;
                AnonymousClass4l8.B(view, C, anonymousClass5Uh, anonymousClass0ES, new AnonymousClass5Uj(P, anonymousClass0ES, anonymousClass5Ui.f65053C, anonymousClass5Ui.f65061K));
                anonymousClass5Ui.f65053C.QGA(P, i2);
                return;
            case 3:
                AnonymousClass4Z9 anonymousClass4Z9 = (AnonymousClass4Z9) anonymousClass0oo2;
                AnonymousClass0Cm anonymousClass0Cm = this.f65065O;
                int i3 = this.f65062L;
                AnonymousClass4ZE anonymousClass4ZE = this.f65064N;
                boolean z = this.f65071U;
                boolean z2 = this.f65052B;
                CircularImageView circularImageView = anonymousClass4Z9.f55291D;
                IgImageView igImageView;
                TextView textView;
                switch (i3) {
                    case 1:
                        igImageView = anonymousClass4Z9.f55291D;
                        textView = anonymousClass4Z9.f55297J;
                        if (((Boolean) AnonymousClass0CC.jL.H(anonymousClass0Cm)).booleanValue()) {
                            if (anonymousClass4ZE != AnonymousClass4ZE.NONE) {
                                igImageView.setUrl(anonymousClass0Cm.B().DQ());
                                textView.setText(C0164R.string.shared_to_your_story_label);
                                textView.setTextColor(anonymousClass4Z9.f55293F);
                                break;
                            }
                            if (anonymousClass4Z9.f55294G == null) {
                                Context context3 = anonymousClass4Z9.f10370B.getContext();
                                Drawable E = AnonymousClass0Ca.E(context3, C0164R.drawable.instagram_new_story_outline_44);
                                anonymousClass4Z9.f55294G = AnonymousClass0TJ.I(context3, AnonymousClass16T.B(context3, E.getIntrinsicWidth(), E.getIntrinsicHeight()), E);
                            }
                            igImageView.setImageDrawable(anonymousClass4Z9.f55294G);
                            textView.setText(C0164R.string.post_to_your_story_label_alt);
                            textView.setTextColor(anonymousClass4Z9.f55292E);
                            break;
                        }
                        igImageView.setUrl(anonymousClass0Cm.B().DQ());
                        textView.setText(C0164R.string.post_to_your_story_label);
                        textView.setTextColor(anonymousClass4Z9.f55289B);
                        break;
                    case 2:
                        igImageView = anonymousClass4Z9.f55291D;
                        textView = anonymousClass4Z9.f55297J;
                        igImageView.setUrl(anonymousClass0Cm.B().DQ());
                        textView.setText(C0164R.string.share_highlight_to_your_story_label);
                        textView.setTextColor(anonymousClass4Z9.f55289B);
                        break;
                    default:
                        break;
                }
                anonymousClass4Z9.f55295H.setVisibility(z ? 0 : 8);
                anonymousClass4Z9.f10370B.setOnClickListener(anonymousClass4Z9.f55296I);
                GradientSpinner gradientSpinner = anonymousClass4Z9.f55298K;
                if (anonymousClass4ZE == AnonymousClass4ZE.NONE) {
                    gradientSpinner.setVisibility(4);
                } else {
                    gradientSpinner.setVisibility(0);
                    if (AnonymousClass0Jd.f2931B.M(anonymousClass0Cm).D(anonymousClass0Cm.f1759C).W()) {
                        gradientSpinner.D();
                    } else {
                        gradientSpinner.setGradientColors(anonymousClass4ZE == AnonymousClass4ZE.FAVORITES ? C0164R.style.CloseFriendsGradientPatternStyle : C0164R.style.GradientPatternStyle);
                        gradientSpinner.B();
                    }
                    circularImageView.setOnClickListener(anonymousClass4Z9.f55299L);
                    if (z2) {
                        this.f65052B = false;
                        gradientSpinner.E();
                        AnonymousClass10J.B(anonymousClass4Z9.f55290C).A();
                    }
                }
                return;
            case 4:
                AnonymousClass4ZC anonymousClass4ZC = (AnonymousClass4ZC) anonymousClass0oo2;
                anonymousClass4ZC.f55301B.setUrl(this.f65068R.MA().DQ());
                anonymousClass4ZC.f55302C.setText(anonymousClass0oo.f10370B.getContext().getString(C0164R.string.direct_reply_sharesheet_row_message, new Object[]{this.f65068R.MA().uT()}));
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown view type: ");
                stringBuilder.append(anonymousClass0oo.f10374F);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: J */
    public final AnonymousClass0oo m27096J(ViewGroup viewGroup, int i) {
        int i2 = 0;
        switch (i) {
            case 0:
                View typeaheadHeader = new TypeaheadHeader(viewGroup.getContext());
                typeaheadHeader.setLayoutParams(new LayoutParams(-1, -2));
                typeaheadHeader.D(viewGroup.getContext().getString(C0164R.string.search));
                typeaheadHeader.setDelegate(this);
                typeaheadHeader.setSearchClearListener(this);
                typeaheadHeader.setEditTextBackground(null);
                return new AnonymousClass4ZD(typeaheadHeader);
            case 1:
                return new AnonymousClass4ZD(AnonymousClass1Tm.C(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 2:
                if (this.f65069S == 1) {
                    i2 = 3;
                }
                return new AnonymousClass4ZD(AnonymousClass4l8.C(viewGroup, i2));
            case 3:
                AnonymousClass4ZA anonymousClass4ZA = this.f65053C;
                int i3 = this.f65062L;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.row_share_feed_post_to_story, viewGroup, false);
                AnonymousClass0oo anonymousClass4Z9 = new AnonymousClass4Z9(inflate, anonymousClass4ZA, i3);
                inflate.setTag(anonymousClass4Z9);
                return anonymousClass4Z9;
            case 4:
                return new AnonymousClass4ZC(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.row_reply_to_author, viewGroup, false), this.f65053C);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown view type: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: P */
    public final DirectShareTarget m27097P(int i) {
        return (DirectShareTarget) this.f65060J.get(i - this.f65055E);
    }

    /* renamed from: Q */
    public final void m27098Q(List list, boolean z) {
        this.f65060J.clear();
        if (z) {
            Collection arrayList = new ArrayList(this.f65063M);
            Collections.reverse(arrayList);
            this.f65060J.addAll(arrayList);
        }
        if (list != null) {
            for (DirectShareTarget directShareTarget : list) {
                int i = 0;
                if (!this.f65066P || directShareTarget.A().size() != 1 || !((String) directShareTarget.A().get(0)).equals(this.f65068R.MA().getId())) {
                    i = 1;
                }
                if (!(i == 0 || this.f65063M.contains(directShareTarget))) {
                    this.f65060J.add(directShareTarget);
                }
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: R */
    public final void m27099R(String str, boolean z, boolean z2) {
        if (this.f65067Q != z || this.f65054D != z2 || !TextUtils.equals(this.f65057G, str)) {
            this.f65067Q = z;
            this.f65054D = z2;
            this.f65057G = str;
            notifyDataSetChanged();
        }
    }

    public final long getItemId(int i) {
        int itemViewType = getItemViewType(i);
        switch (itemViewType) {
            case 0:
            case 1:
            case 3:
            case 4:
                return (long) itemViewType;
            case 2:
                DirectShareTarget P = m27097P(i);
                Long l = (Long) this.f65070T.get(P);
                if (l == null) {
                    long j = f65051V;
                    f65051V = 1 + j;
                    l = Long.valueOf(j);
                    this.f65070T.put(P, l);
                }
                return l.longValue();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown view type: ");
                stringBuilder.append(itemViewType);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final int getItemViewType(int i) {
        int i2 = this.f65055E;
        if (i < i2) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                if ((this.f65062L != 0 ? 1 : null) != null) {
                    return 3;
                }
            }
            return 4;
        } else if (i < i2 + this.f65060J.size()) {
            return 2;
        } else {
            return 1;
        }
    }

    public final void searchTextChanged(String str) {
        this.f65053C.Hz(str);
    }
}
