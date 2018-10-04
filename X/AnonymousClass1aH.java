package X;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1aH */
public final class AnonymousClass1aH {
    /* renamed from: B */
    public static ArrayList m11911B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
        AnonymousClass1SH A = AnonymousClass0Tf.f5226B.mo1285A(anonymousClass0W7.f5915s);
        ArrayList arrayList = new ArrayList();
        if (A.vD(anonymousClass0Cm.m1037B(), anonymousClass0W7)) {
            arrayList.add(context.getString(C0164R.string.direct_unsend_message));
        }
        if (A.sD(anonymousClass0W7) && anonymousClass5WQ.A() == 2) {
            arrayList.add(context.getString(C0164R.string.direct_save));
        }
        if (A.rD(anonymousClass0Cm.m1037B(), anonymousClass0W7)) {
            arrayList.add(context.getString(C0164R.string.direct_report_message));
        }
        if (!TextUtils.isEmpty(A.PS(anonymousClass5WQ.f65627K.f56242C, anonymousClass0Cm, anonymousClass0W7, context.getResources()))) {
            arrayList.add(context.getString(C0164R.string.direct_copy_message_text));
            if (((Boolean) AnonymousClass0CC.fH.m846H(anonymousClass0Cm)).booleanValue() && anonymousClass0W7.m5017S(anonymousClass0Cm.m1037B())) {
                arrayList.add(context.getString(C0164R.string.direct_save_quick_reply));
            }
        }
        if (anonymousClass0W7.f5889S.contains(anonymousClass0Cm.m1037B())) {
            arrayList.add(context.getString(C0164R.string.unlike));
        }
        return arrayList;
    }

    /* renamed from: C */
    public static boolean m11912C(AnonymousClass5WQ anonymousClass5WQ, AnonymousClass5bQ anonymousClass5bQ) {
        if (!anonymousClass5WQ.f65618B.m5015Q()) {
            return false;
        }
        anonymousClass5bQ.J(anonymousClass5WQ.f65618B);
        return true;
    }

    /* renamed from: D */
    public static void m11913D(AnonymousClass5WQ anonymousClass5WQ, Context context, AnonymousClass0Cm anonymousClass0Cm, List list, AnonymousClass5bQ anonymousClass5bQ, OnClickListener onClickListener, AnonymousClass0EE anonymousClass0EE) {
        List list2 = list;
        if ((list.isEmpty() ^ 1) != 0) {
            AnonymousClass5WQ anonymousClass5WQ2 = anonymousClass5WQ;
            AnonymousClass3oG.D(anonymousClass0EE, anonymousClass5WQ.f65627K.f56244E, anonymousClass5WQ.f65618B.f5885O, anonymousClass0Cm.f1759C, AnonymousClass3oD.f44714G);
            new AnonymousClass0Sb(context).m4365G((CharSequence[]) list.toArray(new String[list.size()]), new AnonymousClass4en(anonymousClass5WQ2, list2, context, anonymousClass5bQ, anonymousClass0Cm, onClickListener)).m4363E(true).m4364F(true).m4361C().show();
        }
    }

    /* renamed from: E */
    public static void m11914E(Context context, AnonymousClass5WQ anonymousClass5WQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass5WQ anonymousClass5WQ2 = anonymousClass5WQ;
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
        AnonymousClass0LH.m2925C(anonymousClass0W7.f5915s.equals(AnonymousClass0V0.EXPIRING_MEDIA), String.format("Can only use these long-press options for visual media messages, this type is %s", new Object[]{anonymousClass0W7.f5915s}));
        Context context2 = context;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        ArrayList B = AnonymousClass1aH.m11911B(context2, anonymousClass0Cm, anonymousClass5WQ);
        String string = context2.getString(C0164R.string.visual_message_details);
        String string2 = context2.getString(C0164R.string.visual_message_report_option);
        if (anonymousClass0W7.m5017S(anonymousClass0Cm.m1037B()) && anonymousClass0W7.f5887Q.equals(AnonymousClass0VM.UPLOADED)) {
            B.add(string);
        }
        if (AnonymousClass0Co.m1042B(anonymousClass0Cm)) {
            B.add(string2);
        }
        AnonymousClass1aH.m11913D(anonymousClass5WQ2, context2, anonymousClass0Cm2, B, anonymousClass5bQ, new AnonymousClass4eo(B, string, anonymousClass5bQ, anonymousClass0W7, string2), anonymousClass0EE);
    }
}
