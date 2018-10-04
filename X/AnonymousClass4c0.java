package X;

import android.content.Context;
import com.facebook.C0164R;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4c0 */
public final class AnonymousClass4c0 implements AnonymousClass0Vp {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5VR f55666B;
    /* renamed from: C */
    public final /* synthetic */ boolean f55667C;

    public AnonymousClass4c0(AnonymousClass5VR anonymousClass5VR, boolean z) {
        this.f55666B = anonymousClass5VR;
        this.f55667C = z;
    }

    public final void onFailure() {
        if (this.f55666B.f65313D != null) {
            this.f55666B.f65313D.m14967K(AnonymousClass2I0.ERROR);
        }
    }

    public final void rBA(AnonymousClass0Vw anonymousClass0Vw) {
        AnonymousClass4c0 anonymousClass4c0 = this;
        this.f55666B.f65320K = anonymousClass0Vw;
        if (this.f55666B.f65316G == null) {
            AnonymousClass5VR anonymousClass5VR = this.f55666B;
            anonymousClass5VR.f65316G = AnonymousClass5VR.B(anonymousClass5VR);
        }
        if (this.f55666B.f65313D != null) {
            this.f55666B.f65313D.m14967K(AnonymousClass2I0.GONE);
            DirectThreadKey F = this.f55666B.f65320K.F();
            Object obj = (this.f55666B.f65319J == null || F.f5870B == null || F.f5870B.equals(this.f55666B.f65319J.f5870B)) ? null : 1;
            if (this.f55667C || this.f55666B.f65319J == null || obj != null) {
                this.f55666B.f65319J = F;
                if (!(obj == null || this.f55666B.f65320K.g())) {
                    anonymousClass5VR = this.f55666B;
                    anonymousClass5VR.f65316G = AnonymousClass5VR.B(anonymousClass5VR);
                }
                AnonymousClass0Rq anonymousClass0Rq = this.f55666B.f65311B;
                AnonymousClass0IL anonymousClass0IL = this.f55666B;
                boolean f = anonymousClass0IL.f65320K.f();
                boolean l = this.f55666B.f65320K.l();
                Collection arrayList = new ArrayList();
                if (!anonymousClass0IL.f65315F) {
                    if (AnonymousClass4kH.m24968C(anonymousClass0IL.f65320K)) {
                        AnonymousClass2Ie anonymousClass2Ie = anonymousClass0IL.f65312C;
                        if (anonymousClass2Ie != null) {
                            anonymousClass2Ie.f28714B = anonymousClass0IL.f65316G;
                        } else {
                            anonymousClass0IL.f65312C = new AnonymousClass2Ie(anonymousClass0IL.getResources().getString(C0164R.string.direct_group_name), anonymousClass0IL.f65316G, anonymousClass0IL, anonymousClass0IL, null, null);
                        }
                        arrayList.add(anonymousClass0IL.f65312C);
                    }
                    boolean C = AnonymousClass1RQ.C(anonymousClass0IL.getContext(), anonymousClass0IL.f65322M, anonymousClass0IL.f65320K);
                    arrayList.add(new AnonymousClass1To(C ? C0164R.string.direct_mute_messages : C0164R.string.direct_mute_notifications, f, new AnonymousClass4c4(anonymousClass0IL)));
                    if (C) {
                        arrayList.add(new AnonymousClass1To(C0164R.string.direct_mute_video_call_notifications, l, new AnonymousClass4c5(anonymousClass0IL)));
                    }
                }
                List<AnonymousClass0Ci> J = anonymousClass0IL.f65320K.J();
                int size = J.size();
                Object obj2 = (anonymousClass0IL.f65315F || (size <= 1 && anonymousClass0IL.f65320K.c())) ? null : 1;
                arrayList.add(new AnonymousClass2If((int) C0164R.string.direct_members));
                if (obj2 != null && AnonymousClass1Pz.B(anonymousClass0IL.f65322M, size)) {
                    arrayList.add(new AnonymousClass2IT(C0164R.string.direct_add_member_to_conversation, C0164R.drawable.add_photo_plus, new AnonymousClass4bo(anonymousClass0IL)));
                }
                if (size == 0) {
                    arrayList.add(anonymousClass0IL.f65322M.B());
                } else {
                    for (AnonymousClass0Ci anonymousClass0Ci : J) {
                        if (anonymousClass0Ci.f1751t == AnonymousClass0Lq.FollowStatusUnknown) {
                            AnonymousClass0x5.C(anonymousClass0IL.f65322M).B(anonymousClass0Ci);
                        }
                        arrayList.add(anonymousClass0Ci);
                    }
                }
                if (size == 1) {
                    AnonymousClass0Ci anonymousClass0Ci2 = (AnonymousClass0Ci) J.get(0);
                    arrayList.add(new AnonymousClass2Io());
                    if (anonymousClass0IL.f65320K.k()) {
                        arrayList.add(new AnonymousClass2bo((int) C0164R.string.direct_valued_request_option_move_to_other, new AnonymousClass4bq(anonymousClass0IL)));
                    }
                    arrayList.add(new AnonymousClass2bo(anonymousClass0Ci2.f1721P ? C0164R.string.direct_unblock_user : C0164R.string.direct_block_user, new AnonymousClass4br(anonymousClass0IL, anonymousClass0Ci2)));
                    arrayList.add(AnonymousClass5VR.C(anonymousClass0IL, anonymousClass0Ci2));
                }
                AnonymousClass0Cm anonymousClass0Cm = anonymousClass0IL.f65322M;
                Context context = anonymousClass0IL.getContext();
                String U = anonymousClass0IL.f65320K.U();
                obj = (U == null || !AnonymousClass0JS.f2919B.J(anonymousClass0Cm, context, U)) ? null : 1;
                if (obj2 != null && anonymousClass0IL.f65317H && obj == null) {
                    arrayList.add(new AnonymousClass2IX(C0164R.string.direct_leave_conversation, new AnonymousClass4bp(anonymousClass0IL)));
                    arrayList.add(new AnonymousClass2JP(anonymousClass0IL.getResources().getString(C0164R.string.direct_leave_conversation_explanation)));
                }
                anonymousClass0Rq.f55326I.clear();
                anonymousClass0Rq.f55326I.addAll(arrayList);
                anonymousClass0Rq.C();
                int size2 = anonymousClass0Rq.f55326I.size();
                int i = 0;
                while (i < size2) {
                    Object obj3 = anonymousClass0Rq.f55326I.get(i);
                    if (obj3 instanceof AnonymousClass2If) {
                        anonymousClass0Rq.B((AnonymousClass2If) obj3, anonymousClass0Rq.f55324G, anonymousClass0Rq.f55323F);
                    } else if (obj3 instanceof AnonymousClass2Io) {
                        anonymousClass0Rq.A((AnonymousClass2Io) obj3, anonymousClass0Rq.f55327J);
                    } else if (obj3 instanceof AnonymousClass2JP) {
                        anonymousClass0Rq.A((AnonymousClass2JP) obj3, anonymousClass0Rq.f55329L);
                    } else if (obj3 instanceof AnonymousClass1To) {
                        anonymousClass0Rq.A((AnonymousClass1To) obj3, anonymousClass0Rq.f55328K);
                    } else if (obj3 instanceof AnonymousClass2IX) {
                        anonymousClass0Rq.A((AnonymousClass2IX) obj3, anonymousClass0Rq.f55320C);
                    } else if (obj3 instanceof AnonymousClass0Ci) {
                        AnonymousClass0Ci anonymousClass0Ci3 = (AnonymousClass0Ci) obj3;
                        anonymousClass0Rq.A(anonymousClass0Ci3, anonymousClass0Rq.f55321D);
                        anonymousClass0Rq.f55330M.add(anonymousClass0Ci3.getId());
                    } else if (obj3 instanceof AnonymousClass2Ie) {
                        anonymousClass0Rq.A((AnonymousClass2Ie) obj3, anonymousClass0Rq.f55322E);
                    } else if (obj3 instanceof AnonymousClass2IT) {
                        anonymousClass0Rq.A((AnonymousClass2IT) obj3, anonymousClass0Rq.f55319B);
                    } else if (obj3 instanceof AnonymousClass2bo) {
                        AnonymousClass2bo anonymousClass2bo = (AnonymousClass2bo) obj3;
                        boolean z = true;
                        boolean z2 = i == 0;
                        if (i != anonymousClass0Rq.f55326I.size() - 1) {
                            z = false;
                        }
                        anonymousClass0Rq.B(anonymousClass2bo, new AnonymousClass2Ih(z2, z, false), anonymousClass0Rq.f55325H);
                    }
                    i++;
                }
                anonymousClass0Rq.E();
                AnonymousClass5VR.F(anonymousClass4c0.f55666B);
            }
        }
    }
}
