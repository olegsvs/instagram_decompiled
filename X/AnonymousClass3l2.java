package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.3l2 */
public final class AnonymousClass3l2 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3l5 f44115B;
    /* renamed from: C */
    public final /* synthetic */ Context f44116C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f44117D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f44118E;

    public AnonymousClass3l2(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass3l5 anonymousClass3l5) {
        this.f44116C = context;
        this.f44118E = anonymousClass0Cm;
        this.f44117D = anonymousClass0Ci;
        this.f44115B = anonymousClass3l5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f44116C;
        AnonymousClass0Cm anonymousClass0Cm = this.f44118E;
        AnonymousClass0Ci anonymousClass0Ci = this.f44117D;
        AnonymousClass3l5 anonymousClass3l5 = this.f44115B;
        AnonymousClass2MC anonymousClass2MC = anonymousClass0Ci.f1721P ? AnonymousClass2MC.UserActionUnblock : AnonymousClass2MC.UserActionBlock;
        anonymousClass0Ci.f1721P ^= true;
        AnonymousClass0x5.C(anonymousClass0Cm).F(anonymousClass0Ci, AnonymousClass0Lq.FollowStatusNotFollowing, true);
        anonymousClass0Ci.D();
        AnonymousClass0el B = AnonymousClass0er.B(anonymousClass0Cm);
        AnonymousClass1Cm anonymousClass1Cm = (AnonymousClass1Cm) B.C(AnonymousClass1Cm.B(anonymousClass0Ci.getId()));
        if (anonymousClass2MC == AnonymousClass2MC.UserActionBlock && anonymousClass1Cm != null && anonymousClass1Cm.f15579D.equals(AnonymousClass2MC.UserActionFollow.m15205A())) {
            anonymousClass0Ci.getId();
            B.N(anonymousClass1Cm.A());
        }
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0GA H = anonymousClass0Pt.L("friendships/%s/%s/", new Object[]{anonymousClass2MC.m15205A(), anonymousClass0Ci.getId()}).D(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0Ci.getId()).M(AnonymousClass3lW.class).N().H();
        H.f2849B = new AnonymousClass3l4(anonymousClass0Ci, anonymousClass0Cm, anonymousClass3l5, context);
        AnonymousClass0Ix.B().schedule(H);
        if (((Boolean) AnonymousClass0CC.vd.H(anonymousClass0Cm)).booleanValue()) {
            new AnonymousClass0Sb(context).R(context.getString(anonymousClass0Ci.f1721P ? C0164R.string.dialog_user_blocked_title : C0164R.string.dialog_user_unblocked_title, new Object[]{anonymousClass0Ci.uT()})).H(anonymousClass0Ci.f1721P ? C0164R.string.dialog_user_blocked_message : C0164R.string.dialog_user_unblocked_message).O(C0164R.string.ok, null).C().show();
        } else {
            Toast.makeText(context, anonymousClass0Ci.f1721P ? C0164R.string.user_blocked : C0164R.string.user_unblocked, 0).show();
        }
        AnonymousClass3l5 anonymousClass3l52 = this.f44115B;
        if (anonymousClass3l52 != null) {
            anonymousClass3l52.onStart();
        }
    }
}
