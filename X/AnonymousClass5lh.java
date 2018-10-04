package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5lh */
public final class AnonymousClass5lh implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ String f68818B;
    /* renamed from: C */
    public final /* synthetic */ String f68819C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0iB f68820D;
    /* renamed from: E */
    public final /* synthetic */ String f68821E;
    /* renamed from: F */
    public final /* synthetic */ CharSequence[] f68822F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass3MM f68823G;
    /* renamed from: H */
    public final /* synthetic */ String f68824H;
    /* renamed from: I */
    public final /* synthetic */ AnonymousClass0r0 f68825I;
    /* renamed from: J */
    public final /* synthetic */ View f68826J;

    public AnonymousClass5lh(CharSequence[] charSequenceArr, String str, AnonymousClass0iB anonymousClass0iB, AnonymousClass0r0 anonymousClass0r0, String str2, String str3, String str4, AnonymousClass3MM anonymousClass3MM, View view) {
        this.f68822F = charSequenceArr;
        this.f68821E = str;
        this.f68820D = anonymousClass0iB;
        this.f68825I = anonymousClass0r0;
        this.f68818B = str2;
        this.f68819C = str3;
        this.f68824H = str4;
        this.f68823G = anonymousClass3MM;
        this.f68826J = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f68822F[i].equals(this.f68821E)) {
            this.f68820D.ck(this.f68825I.getId(), this.f68825I.YT());
        } else if (this.f68822F[i].equals(this.f68818B)) {
            this.f68820D.bk(this.f68819C);
        } else if (this.f68822F[i].equals(this.f68824H)) {
            i = this.f68823G;
            AnonymousClass0iB anonymousClass0iB = this.f68820D;
            View view = this.f68826J;
            dialogInterface = new AnonymousClass5li(anonymousClass0iB, i);
            AnonymousClass0Sb R = new AnonymousClass0Sb(view.getContext()).R(i.f40444C);
            List arrayList = new ArrayList();
            for (String add : i.f40445D) {
                arrayList.add(add);
            }
            R.G((CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]), dialogInterface).E(true).F(true).C().show();
        }
    }
}
