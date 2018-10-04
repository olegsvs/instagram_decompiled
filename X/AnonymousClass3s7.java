package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureState;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureType;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl.HitTestCallback;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3s7 */
public final class AnonymousClass3s7 {
    /* renamed from: B */
    public final Map f45591B;
    /* renamed from: C */
    public final Map f45592C;
    /* renamed from: D */
    public HandlerThread f45593D;
    /* renamed from: E */
    public boolean f45594E;
    /* renamed from: F */
    public int f45595F;
    /* renamed from: G */
    public int f45596G;
    /* renamed from: H */
    public final List f45597H;
    /* renamed from: I */
    public final Map f45598I;
    /* renamed from: J */
    public final Set f45599J;
    /* renamed from: K */
    public AnonymousClass2kC f45600K;
    /* renamed from: L */
    public final Set f45601L;
    /* renamed from: M */
    public final TouchServiceImpl f45602M;
    /* renamed from: N */
    public AnonymousClass2kF f45603N;
    /* renamed from: O */
    public final Handler f45604O = new Handler(Looper.getMainLooper());
    /* renamed from: P */
    private final Set f45605P;
    /* renamed from: Q */
    private final HitTestCallback f45606Q = new AnonymousClass3s5(this);
    /* renamed from: R */
    private long f45607R;
    /* renamed from: S */
    private long f45608S;
    /* renamed from: T */
    private AnonymousClass2k8 f45609T;
    /* renamed from: U */
    private AnonymousClass3s6 f45610U;
    /* renamed from: V */
    private ScaleGestureDetector f45611V;
    /* renamed from: W */
    private AnonymousClass2k6 f45612W;
    /* renamed from: X */
    private AnonymousClass1hg f45613X;
    /* renamed from: Y */
    private View f45614Y;

    public AnonymousClass3s7(TouchServiceImpl touchServiceImpl) {
        this.f45602M = touchServiceImpl;
        this.f45601L = new HashSet();
        this.f45603N = new AnonymousClass2kF(false, false, false, false, false, false);
        this.f45591B = new HashMap();
        this.f45592C = new HashMap();
        this.f45598I = new HashMap();
        this.f45597H = new LinkedList();
        this.f45599J = new HashSet();
        this.f45605P = new LinkedHashSet();
    }

    /* renamed from: A */
    public final void m21028A(View view) {
        this.f45614Y = view;
        AnonymousClass3s7.m21027K(this);
        AnonymousClass3s7.m21025I(this);
        this.f45608S = 1;
        Handler J = m21026J();
        Context context = view.getContext();
        this.f45613X = new AnonymousClass1hg(this);
        this.f45600K = new AnonymousClass2kC(context, this.f45613X, J);
        this.f45612W = new AnonymousClass2k6(this);
        if (VERSION.SDK_INT >= 19) {
            this.f45611V = new ScaleGestureDetector(context, this.f45612W, J);
            this.f45611V.setQuickScaleEnabled(false);
        } else {
            this.f45611V = new ScaleGestureDetector(context, this.f45612W);
        }
        this.f45610U = new AnonymousClass3s6(this);
        this.f45609T = new AnonymousClass2k8(this.f45610U);
        this.f45607R = 0;
    }

    /* renamed from: B */
    public static void m21018B(AnonymousClass3s7 anonymousClass3s7) {
        Object<MotionEvent> linkedHashSet = new LinkedHashSet(anonymousClass3s7.f45597H);
        anonymousClass3s7.f45597H.clear();
        anonymousClass3s7.f45605P.addAll(linkedHashSet);
        for (MotionEvent dispatchTouchEvent : linkedHashSet) {
            anonymousClass3s7.f45614Y.dispatchTouchEvent(dispatchTouchEvent);
        }
    }

    /* renamed from: B */
    public final boolean m21029B(MotionEvent motionEvent, int i) {
        if (!this.f45605P.remove(motionEvent)) {
            boolean z;
            float width;
            float height;
            AnonymousClass2k6 anonymousClass2k6;
            AnonymousClass3s6 anonymousClass3s6;
            AnonymousClass1hg anonymousClass1hg;
            Long l;
            AnonymousClass2k7 anonymousClass2k7;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (obtain.getAction() == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f45607R > ((long) ViewConfiguration.getDoubleTapTimeout())) {
                    AnonymousClass3s7.m21027K(this);
                }
                this.f45607R = currentTimeMillis;
                this.f45594E = false;
            }
            if (i != 0) {
                if (i != 2) {
                    z = false;
                    width = (float) this.f45614Y.getWidth();
                    height = (float) this.f45614Y.getHeight();
                    anonymousClass2k6 = this.f45612W;
                    anonymousClass2k6.f33169B = z;
                    anonymousClass2k6.f33171D = width;
                    anonymousClass2k6.f33172E = height;
                    anonymousClass3s6 = this.f45610U;
                    anonymousClass3s6.f45587B = z;
                    anonymousClass3s6.f45589D = width;
                    anonymousClass3s6.f45590E = height;
                    anonymousClass1hg = this.f45613X;
                    anonymousClass1hg.f21547B = z;
                    anonymousClass1hg.f21549D = width;
                    anonymousClass1hg.f21550E = height;
                    this.f45611V.onTouchEvent(obtain);
                    this.f45609T.m17004A(obtain);
                    this.f45600K.m17008C(obtain);
                    if (this.f45595F == 0) {
                        if (this.f45594E) {
                            if (this.f45596G > 0) {
                                if (!this.f45597H.isEmpty()) {
                                    this.f45597H.add(obtain);
                                    AnonymousClass0OR.D(this.f45604O, new AnonymousClass2k5(this), -229387390);
                                    return true;
                                }
                            }
                        }
                        this.f45597H.add(obtain);
                    }
                    if (this.f45599J.size() > 0) {
                        for (GestureType remove : this.f45599J) {
                            l = (Long) this.f45591B.remove(remove);
                            if (l != null) {
                                anonymousClass2k7 = (AnonymousClass2k7) this.f45592C.remove(l);
                                if (anonymousClass2k7 != null && anonymousClass2k7 == AnonymousClass2k7.GESTURE_IS_HANDLED_BY_ENGINE) {
                                    this.f45595F--;
                                }
                            }
                        }
                        this.f45599J.clear();
                    }
                    return true;
                }
            }
            z = true;
            width = (float) this.f45614Y.getWidth();
            height = (float) this.f45614Y.getHeight();
            anonymousClass2k6 = this.f45612W;
            anonymousClass2k6.f33169B = z;
            anonymousClass2k6.f33171D = width;
            anonymousClass2k6.f33172E = height;
            anonymousClass3s6 = this.f45610U;
            anonymousClass3s6.f45587B = z;
            anonymousClass3s6.f45589D = width;
            anonymousClass3s6.f45590E = height;
            anonymousClass1hg = this.f45613X;
            anonymousClass1hg.f21547B = z;
            anonymousClass1hg.f21549D = width;
            anonymousClass1hg.f21550E = height;
            this.f45611V.onTouchEvent(obtain);
            this.f45609T.m17004A(obtain);
            this.f45600K.m17008C(obtain);
            if (this.f45595F == 0) {
                if (this.f45594E) {
                    if (this.f45596G > 0) {
                        if (this.f45597H.isEmpty()) {
                            this.f45597H.add(obtain);
                            AnonymousClass0OR.D(this.f45604O, new AnonymousClass2k5(this), -229387390);
                            return true;
                        }
                    }
                }
                this.f45597H.add(obtain);
            }
            if (this.f45599J.size() > 0) {
                while (r2.hasNext()) {
                    l = (Long) this.f45591B.remove(remove);
                    if (l != null) {
                        anonymousClass2k7 = (AnonymousClass2k7) this.f45592C.remove(l);
                        this.f45595F--;
                    }
                }
                this.f45599J.clear();
            }
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static void m21019C(AnonymousClass3s7 anonymousClass3s7, Gesture gesture) {
        if (anonymousClass3s7.f45592C.containsKey(Long.valueOf(gesture.id))) {
            switch (((AnonymousClass2k7) anonymousClass3s7.f45592C.get(Long.valueOf(gesture.id))).ordinal()) {
                case 0:
                    anonymousClass3s7.f45596G++;
                    anonymousClass3s7.f45592C.put(Long.valueOf(gesture.id), AnonymousClass2k7.WAIT_HIT_TEST_RESULT);
                    anonymousClass3s7.f45602M.enqueueForHitTest(gesture, anonymousClass3s7.f45606Q);
                    return;
                case 2:
                    return;
                case 3:
                    anonymousClass3s7.f45602M.sendGesture(gesture);
                    if (AnonymousClass3s7.m21020D(gesture)) {
                        anonymousClass3s7.f45599J.add(gesture.getGestureType());
                        return;
                    }
                    return;
                default:
                    List list;
                    if (anonymousClass3s7.f45598I.containsKey(Long.valueOf(gesture.id))) {
                        list = (List) anonymousClass3s7.f45598I.get(Long.valueOf(gesture.id));
                    } else {
                        list = new LinkedList();
                        anonymousClass3s7.f45598I.put(Long.valueOf(gesture.id), list);
                    }
                    list.add(gesture);
                    return;
            }
        }
    }

    /* renamed from: D */
    public static boolean m21020D(Gesture gesture) {
        if (!(gesture.gestureState == GestureState.ENDED || gesture.gestureState == GestureState.CANCELLED)) {
            if (gesture.gestureState != GestureState.FAILED) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m21021E(AnonymousClass3s7 anonymousClass3s7, long j) {
        return anonymousClass3s7.f45592C.containsKey(Long.valueOf(j)) && anonymousClass3s7.f45592C.get(Long.valueOf(j)) == AnonymousClass2k7.GESTURE_IS_HANDLED_BY_CLIENT;
    }

    /* renamed from: F */
    public static long m21022F(AnonymousClass3s7 anonymousClass3s7, GestureType gestureType) {
        long j = anonymousClass3s7.f45608S;
        anonymousClass3s7.f45608S = 1 + j;
        anonymousClass3s7.f45591B.put(gestureType, Long.valueOf(j));
        anonymousClass3s7.f45592C.put(Long.valueOf(j), AnonymousClass2k7.HIT_TESTING);
        return j;
    }

    /* renamed from: G */
    public static void m21023G(AnonymousClass3s7 anonymousClass3s7, long j, boolean z) {
        anonymousClass3s7.f45594E = true;
        anonymousClass3s7.f45596G--;
        Gesture gesture;
        Map map;
        GestureType gestureType;
        if (z) {
            anonymousClass3s7.f45595F++;
            anonymousClass3s7.f45592C.put(Long.valueOf(j), AnonymousClass2k7.GESTURE_IS_HANDLED_BY_ENGINE);
            List list = (List) anonymousClass3s7.f45598I.remove(Long.valueOf(j));
            if (list != null) {
                gesture = null;
                for (int i = 0; i < list.size(); i++) {
                    gesture = (Gesture) list.get(i);
                    anonymousClass3s7.f45602M.sendGesture(gesture);
                }
                if (gesture != null && AnonymousClass3s7.m21020D(gesture)) {
                    AnonymousClass3s7.m21024H(anonymousClass3s7, gesture.getGestureType());
                }
            } else {
                map = anonymousClass3s7.f45591B;
                gestureType = GestureType.TAP;
                if (map.containsKey(gestureType) && ((Long) anonymousClass3s7.f45591B.get(gestureType)).longValue() == j) {
                    AnonymousClass3s7.m21024H(anonymousClass3s7, GestureType.TAP);
                }
            }
            anonymousClass3s7.f45597H.clear();
            return;
        }
        anonymousClass3s7.f45592C.put(Long.valueOf(j), AnonymousClass2k7.GESTURE_IS_HANDLED_BY_CLIENT);
        List list2 = (List) anonymousClass3s7.f45598I.remove(Long.valueOf(j));
        if (list2 != null) {
            gesture = (Gesture) list2.get(list2.size() - 1);
            if (gesture != null && AnonymousClass3s7.m21020D(gesture)) {
                AnonymousClass3s7.m21024H(anonymousClass3s7, gesture.getGestureType());
            }
        } else {
            map = anonymousClass3s7.f45591B;
            gestureType = GestureType.TAP;
            if (map.containsKey(gestureType) && ((Long) anonymousClass3s7.f45591B.get(gestureType)).longValue() == j) {
                AnonymousClass3s7.m21024H(anonymousClass3s7, GestureType.TAP);
            }
        }
        if (anonymousClass3s7.f45596G == 0) {
            AnonymousClass3s7.m21018B(anonymousClass3s7);
        }
    }

    /* renamed from: H */
    public static void m21024H(AnonymousClass3s7 anonymousClass3s7, GestureType gestureType) {
        if (anonymousClass3s7.f45591B.containsKey(gestureType)) {
            AnonymousClass2k7 anonymousClass2k7 = (AnonymousClass2k7) anonymousClass3s7.f45592C.remove(Long.valueOf(((Long) anonymousClass3s7.f45591B.remove(gestureType)).longValue()));
            if (anonymousClass2k7 != null && anonymousClass2k7 == AnonymousClass2k7.GESTURE_IS_HANDLED_BY_ENGINE) {
                anonymousClass3s7.f45595F--;
            }
        }
        if (anonymousClass3s7.f45599J.contains(gestureType)) {
            anonymousClass3s7.f45599J.remove(gestureType);
        }
    }

    /* renamed from: I */
    public static void m21025I(AnonymousClass3s7 anonymousClass3s7) {
        anonymousClass3s7.f45601L.clear();
        if (anonymousClass3s7.f45603N.f33227G) {
            anonymousClass3s7.f45601L.add(GestureType.TAP);
        }
        if (anonymousClass3s7.f45603N.f33223C) {
            anonymousClass3s7.f45601L.add(GestureType.PAN);
        }
        if (anonymousClass3s7.f45603N.f33224D) {
            anonymousClass3s7.f45601L.add(GestureType.PINCH);
        }
        if (anonymousClass3s7.f45603N.f33226F) {
            anonymousClass3s7.f45601L.add(GestureType.ROTATE);
        }
        if (anonymousClass3s7.f45603N.f33222B) {
            anonymousClass3s7.f45601L.add(GestureType.LONG_PRESS);
        }
        if (anonymousClass3s7.f45603N.f33225E) {
            if (anonymousClass3s7.f45603N.f33225E) {
                anonymousClass3s7.f45601L.add(GestureType.RAW_TOUCH);
            }
            anonymousClass3s7.f45600K.f33206J = Boolean.valueOf(true);
        }
    }

    /* renamed from: J */
    private Handler m21026J() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return new Handler(myLooper);
        }
        if (this.f45593D == null) {
            HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName());
            this.f45593D = handlerThread;
            handlerThread.start();
        }
        return new Handler(this.f45593D.getLooper());
    }

    /* renamed from: K */
    private static void m21027K(AnonymousClass3s7 anonymousClass3s7) {
        anonymousClass3s7.f45591B.clear();
        anonymousClass3s7.f45592C.clear();
        anonymousClass3s7.f45598I.clear();
        anonymousClass3s7.f45597H.clear();
        anonymousClass3s7.f45599J.clear();
        anonymousClass3s7.f45605P.clear();
        anonymousClass3s7.f45596G = 0;
        anonymousClass3s7.f45595F = 0;
    }
}
