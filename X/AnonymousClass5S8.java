package X;

import com.instagram.comments.controller.CommentComposerController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5S8 */
public final class AnonymousClass5S8 implements AnonymousClass4G0 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SC f63767B;

    public AnonymousClass5S8(AnonymousClass5SC anonymousClass5SC) {
        this.f63767B = anonymousClass5SC;
    }

    public final void cl(AnonymousClass28M anonymousClass28M) {
        if (anonymousClass28M == AnonymousClass28M.INITIAL_LOADING) {
            AnonymousClass0Ea.f1980C.markerEnd(16646145, (short) 3);
            if (!(this.f63767B.getView() == null || this.f63767B.getListView() == null)) {
                AnonymousClass4Fj anonymousClass4Fj = this.f63767B.f63804i;
                anonymousClass4Fj.f52006C.setVisibility(8);
                AnonymousClass2IF.B(false, anonymousClass4Fj.f52007D);
                anonymousClass4Fj.f52005B.E();
                anonymousClass4Fj.f52005B.setVisibility(0);
            }
            this.f63767B.f63771B.f63673J = AnonymousClass4Ee.f51844E;
        }
    }

    public final void sBA(AnonymousClass28M anonymousClass28M, AnonymousClass4G1 anonymousClass4G1) {
        if (this.f63767B.f63792W.f4039n) {
            this.f63767B.f63776G.f63713R.f4039n = true;
            this.f63767B.f63776G.m26618E();
            return;
        }
        if (anonymousClass28M == AnonymousClass28M.INITIAL_LOADING) {
            boolean z;
            AnonymousClass4EI anonymousClass4EI;
            AnonymousClass4Fr anonymousClass4Fr;
            List arrayList;
            CommentComposerController commentComposerController;
            AnonymousClass0Ea.f1980C.a(16646145, "COMMENTS_LOAD_COMPLETE");
            this.f63767B.f63792W.rB.f11804G.D();
            AnonymousClass0IL anonymousClass0IL = this.f63767B;
            boolean z2 = false;
            if (!anonymousClass0IL.f63787R) {
                if (!anonymousClass4G1.f52044C) {
                    z = false;
                    anonymousClass0IL.f63787R = z;
                    anonymousClass4EI = anonymousClass0IL.f63771B;
                    anonymousClass4EI.f63671H = anonymousClass4G1.f52046E;
                    anonymousClass4EI.M();
                    anonymousClass0IL.f63788S = anonymousClass4G1.f52045D;
                    anonymousClass0IL.f63771B.f63669F = anonymousClass0IL.f63788S;
                    anonymousClass0IL.f63771B.f63673J = new AnonymousClass4Ee(anonymousClass4G1.f52048G);
                    anonymousClass0IL.f63803h = anonymousClass4G1.f52043B;
                    if (anonymousClass4G1.f52046E != AnonymousClass4Fl.FULL) {
                        z2 = true;
                    }
                    anonymousClass0IL.f63802g = z2;
                    if (anonymousClass0IL.isAdded()) {
                        AnonymousClass0eT.D(AnonymousClass0eT.E(anonymousClass0IL.getActivity()));
                    }
                    anonymousClass4Fr = anonymousClass0IL.f63806k;
                    if (anonymousClass4Fr != null && anonymousClass0IL.f63803h) {
                        anonymousClass4Fr.B(anonymousClass0IL.f63792W, anonymousClass0IL.f63808m);
                    }
                    if (anonymousClass4G1.f52047F != null) {
                        arrayList = new ArrayList();
                        for (AnonymousClass4G5 anonymousClass4G5 : anonymousClass4G1.f52047F) {
                            arrayList.add(anonymousClass4G5.f52061B);
                        }
                        commentComposerController = anonymousClass0IL.f63776G;
                        if (CommentComposerController.m26604E(commentComposerController)) {
                            if (commentComposerController.f63705J) {
                                commentComposerController.f63702G.C(commentComposerController.mViewHolder.A(), arrayList, true);
                            } else if (commentComposerController.f63706K) {
                                commentComposerController.f63704I.C(arrayList, true);
                            }
                        }
                    }
                    AnonymousClass5SC.m26633C(this.f63767B);
                }
            }
            z = true;
            anonymousClass0IL.f63787R = z;
            anonymousClass4EI = anonymousClass0IL.f63771B;
            anonymousClass4EI.f63671H = anonymousClass4G1.f52046E;
            anonymousClass4EI.M();
            anonymousClass0IL.f63788S = anonymousClass4G1.f52045D;
            anonymousClass0IL.f63771B.f63669F = anonymousClass0IL.f63788S;
            anonymousClass0IL.f63771B.f63673J = new AnonymousClass4Ee(anonymousClass4G1.f52048G);
            anonymousClass0IL.f63803h = anonymousClass4G1.f52043B;
            if (anonymousClass4G1.f52046E != AnonymousClass4Fl.FULL) {
                z2 = true;
            }
            anonymousClass0IL.f63802g = z2;
            if (anonymousClass0IL.isAdded()) {
                AnonymousClass0eT.D(AnonymousClass0eT.E(anonymousClass0IL.getActivity()));
            }
            anonymousClass4Fr = anonymousClass0IL.f63806k;
            anonymousClass4Fr.B(anonymousClass0IL.f63792W, anonymousClass0IL.f63808m);
            if (anonymousClass4G1.f52047F != null) {
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    arrayList.add(anonymousClass4G5.f52061B);
                }
                commentComposerController = anonymousClass0IL.f63776G;
                if (CommentComposerController.m26604E(commentComposerController)) {
                    if (commentComposerController.f63705J) {
                        commentComposerController.f63702G.C(commentComposerController.mViewHolder.A(), arrayList, true);
                    } else if (commentComposerController.f63706K) {
                        commentComposerController.f63704I.C(arrayList, true);
                    }
                }
            }
            AnonymousClass5SC.m26633C(this.f63767B);
        } else if (anonymousClass28M == AnonymousClass28M.TAIL_LOADING) {
            AnonymousClass5SC.m26634D(this.f63767B);
        } else {
            this.f63767B.f63771B.m26600P(this.f63767B.f63792W, this.f63767B.f63794Y, this.f63767B.f63793X);
        }
    }
}
