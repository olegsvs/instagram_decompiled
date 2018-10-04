package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.4QL */
public final class AnonymousClass4QL implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4QM f53897B;

    public AnonymousClass4QL(AnonymousClass4QM anonymousClass4QM) {
        this.f53897B = anonymousClass4QM;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object obj;
        int actionMasked;
        AnonymousClass5bK anonymousClass5bK;
        float f;
        AnonymousClass4LP anonymousClass4LP;
        Object obj2;
        boolean z = true;
        Object obj3 = (this.f53897B.f53901E != AnonymousClass3AN.PRE_CAPTURE || this.f53897B.f53914R.f64585B == AnonymousClass4RJ.SEARCH || this.f53897B.f53916T.f5584B == AnonymousClass3AM.ASSET_PICKER || this.f53897B.f53916T.f5584B == AnonymousClass3AM.SELECT_FACE_EFFECT || this.f53897B.f53916T.f5584B == AnonymousClass3AM.NAMETAG_CAMERA_SCAN_SHOW_RESULT || this.f53897B.f53899C.m18698P() || this.f53897B.f53898B.f7602P.f62103F) ? null : 1;
        if ((this.f53897B.f53901E != AnonymousClass3AN.PRE_CAPTURE ? 1 : null) != null) {
            if ((this.f53897B.f53908L.f66835B != null ? 1 : null) == null) {
                obj = 1;
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    AnonymousClass4QM anonymousClass4QM = this.f53897B;
                    anonymousClass4QM.f53906J = motionEvent.getRawX();
                    anonymousClass4QM.f53907K = motionEvent.getRawY();
                    anonymousClass4QM.f53902F = false;
                    anonymousClass4QM.f53903G = false;
                    anonymousClass4QM.f53920X = 0.0f;
                    anonymousClass4QM.f53911O = 0.0f;
                    for (AnonymousClass0dG xDA : anonymousClass4QM.f53912P) {
                        xDA.xDA();
                    }
                }
                if (obj3 == null || motionEvent.getPointerCount() <= 1) {
                    if (obj == null && motionEvent.getPointerCount() > 1 && this.f53897B.f53913Q != null) {
                        AnonymousClass4QO anonymousClass4QO = this.f53897B.f53913Q;
                        anonymousClass4QO.f53926B.onTouchEvent(motionEvent);
                        anonymousClass4QO.f53929E.onTouchEvent(motionEvent);
                        anonymousClass4QO.f53928D.m14973A(motionEvent);
                        actionMasked = 0;
                        if (motionEvent.getActionMasked() == 5) {
                            while (actionMasked < anonymousClass4QO.f53927C.size()) {
                                ((AnonymousClass4QN) anonymousClass4QO.f53927C.get(actionMasked)).wm();
                                actionMasked++;
                            }
                        } else if (motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                            while (actionMasked < anonymousClass4QO.f53927C.size()) {
                                ((AnonymousClass4QN) anonymousClass4QO.f53927C.get(actionMasked)).vm();
                                actionMasked++;
                            }
                        }
                    } else if (actionMasked == 2 || !this.f53897B.f53898B.f7602P.f62103F) {
                        if ((obj3 != null && this.f53897B.m24179B(motionEvent.getRawX(), motionEvent.getRawY())) || obj != null) {
                            this.f53897B.f53917U.onTouch(view, motionEvent);
                        }
                        Object obj4 = (obj == null && this.f53897B.f53902F) ? 1 : null;
                        Object obj5 = (obj == null && this.f53897B.f53903G) ? 1 : null;
                        Object obj6 = (obj3 == null && this.f53897B.f53903G && this.f53897B.f53909M.zVA(this.f53897B.f53906J, this.f53897B.f53907K, motionEvent.getRawY() - this.f53897B.f53907K)) ? 1 : null;
                        Object obj7 = (!this.f53897B.f53900D.m23916A(this.f53897B.f53906J, this.f53897B.f53907K) && this.f53897B.f53902F && this.f53897B.f53910N == 0.0f) ? 1 : null;
                        obj3 = (this.f53897B.f53905I == null && obj3 != null && this.f53897B.f53902F && this.f53897B.f53910N == 0.0f) ? 1 : null;
                        if (obj != null && this.f53897B.f53902F && this.f53897B.f53910N == 0.0f) {
                            anonymousClass5bK = this.f53897B.f53908L;
                            f = this.f53897B.f53907K;
                            if (anonymousClass5bK.f66854U) {
                                anonymousClass4LP = anonymousClass5bK.f66842I;
                                if (anonymousClass4LP != null) {
                                    boolean z2;
                                    if (anonymousClass4LP.f53023J == 0.0f) {
                                        anonymousClass4LP.f53023J = AnonymousClass0Nm.L(anonymousClass4LP.f53018E.f54646Q).top;
                                    }
                                    float f2 = anonymousClass4LP.f53023J;
                                    z2 = f2 == 0.0f && f > f2;
                                    anonymousClass4LP.f53022I = z2;
                                    if (z2) {
                                        obj2 = 1;
                                        if (obj2 != null) {
                                            obj2 = 1;
                                            if (obj4 == null && obj5 == null && obj6 == null && obj7 == null && obj3 == null) {
                                                if (obj2 != null) {
                                                    z = false;
                                                }
                                            }
                                            return z;
                                        }
                                    }
                                }
                            }
                            obj2 = null;
                            if (obj2 != null) {
                                obj2 = 1;
                                if (obj2 != null) {
                                    z = false;
                                }
                                return z;
                            }
                        }
                        obj2 = null;
                        if (obj2 != null) {
                            z = false;
                        }
                        return z;
                    } else {
                        this.f53897B.f53898B.O(motionEvent, this.f53897B.f53906J, this.f53897B.f53907K);
                        return false;
                    }
                }
                return false;
            }
        }
        obj = null;
        actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            AnonymousClass4QM anonymousClass4QM2 = this.f53897B;
            anonymousClass4QM2.f53906J = motionEvent.getRawX();
            anonymousClass4QM2.f53907K = motionEvent.getRawY();
            anonymousClass4QM2.f53902F = false;
            anonymousClass4QM2.f53903G = false;
            anonymousClass4QM2.f53920X = 0.0f;
            anonymousClass4QM2.f53911O = 0.0f;
            while (r1.hasNext()) {
                xDA.xDA();
            }
        }
        if (obj == null) {
        }
        if (actionMasked == 2) {
        }
        this.f53897B.f53917U.onTouch(view, motionEvent);
        if (obj == null) {
        }
        if (obj == null) {
        }
        if (obj3 == null) {
        }
        if (!this.f53897B.f53900D.m23916A(this.f53897B.f53906J, this.f53897B.f53907K)) {
        }
        if (this.f53897B.f53905I == null) {
        }
        anonymousClass5bK = this.f53897B.f53908L;
        f = this.f53897B.f53907K;
        if (anonymousClass5bK.f66854U) {
            anonymousClass4LP = anonymousClass5bK.f66842I;
            if (anonymousClass4LP != null) {
                if (anonymousClass4LP.f53023J == 0.0f) {
                    anonymousClass4LP.f53023J = AnonymousClass0Nm.L(anonymousClass4LP.f53018E.f54646Q).top;
                }
                float f22 = anonymousClass4LP.f53023J;
                if (f22 == 0.0f) {
                }
                anonymousClass4LP.f53022I = z2;
                if (z2) {
                    obj2 = 1;
                    if (obj2 != null) {
                        obj2 = 1;
                        if (obj2 != null) {
                            z = false;
                        }
                        return z;
                    }
                    obj2 = null;
                    if (obj2 != null) {
                        z = false;
                    }
                    return z;
                }
            }
        }
        obj2 = null;
        if (obj2 != null) {
            obj2 = 1;
            if (obj2 != null) {
                z = false;
            }
            return z;
        }
        obj2 = null;
        if (obj2 != null) {
            z = false;
        }
        return z;
    }
}
