package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;
import java.util.ArrayList;

/* renamed from: X.4eo */
public final class AnonymousClass4eo implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ String f56045B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5bQ f56046C;
    /* renamed from: D */
    public final /* synthetic */ ArrayList f56047D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0W7 f56048E;
    /* renamed from: F */
    public final /* synthetic */ String f56049F;

    public AnonymousClass4eo(ArrayList arrayList, String str, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0W7 anonymousClass0W7, String str2) {
        this.f56047D = arrayList;
        this.f56045B = str;
        this.f56046C = anonymousClass5bQ;
        this.f56048E = anonymousClass0W7;
        this.f56049F = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = (String) this.f56047D.get(i);
        if (str.equals(this.f56045B)) {
            this.f56046C.I(this.f56048E.f5885O);
        } else if (str.equals(this.f56049F)) {
            i = this.f56046C;
            AnonymousClass0W7 anonymousClass0W7 = this.f56048E;
            AnonymousClass0V2 B = AnonymousClass0V2.B(i.f66939B.f65382o);
            B.f5632C = i.f66939B.f65377j;
            B.f5631B = anonymousClass0W7;
            dialogInterface = i.f66939B;
            AnonymousClass5GT.B(dialogInterface, dialogInterface.f65382o, i.f66939B.getString(C0164R.string.rageshake_title), i.f66939B.getString(C0164R.string.bugreporter_rageshake_hint), "direct_visual_message_report_flow");
        }
    }
}
