package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.4Nb */
public final class AnonymousClass4Nb {
    /* renamed from: B */
    private final AnonymousClass5St f53399B;
    /* renamed from: C */
    private final AnonymousClass0Cm f53400C;

    public AnonymousClass4Nb(AnonymousClass5St anonymousClass5St, AnonymousClass0Cm anonymousClass0Cm) {
        this.f53399B = anonymousClass5St;
        this.f53400C = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final boolean m24054A() {
        boolean z = false;
        if (this.f53399B.f64121B.f7626n) {
            switch (AnonymousClass4Na.f53397B[this.f53399B.A().ordinal()]) {
                case 2:
                    break;
                case 3:
                    if (this.f53399B.B() != AnonymousClass4RJ.SEARCH) {
                        z = true;
                        break;
                    }
                    break;
                default:
                    return true;
            }
        }
        return z;
    }

    /* renamed from: B */
    public final boolean m24055B() {
        if (this.f53399B.A() != AnonymousClass3DU.TEXT) {
            return false;
        }
        if (this.f53399B.C().f54386a == null) {
            return true;
        }
        return this.f53399B.f64121B.f7633u;
    }

    /* renamed from: B */
    public static final boolean m24053B(AnonymousClass3DU anonymousClass3DU) {
        return AnonymousClass4Na.f53397B[anonymousClass3DU.ordinal()] == 2;
    }

    /* renamed from: C */
    public final boolean m24056C(AnonymousClass3DU anonymousClass3DU) {
        if (anonymousClass3DU != AnonymousClass3DU.TEXT) {
            if (anonymousClass3DU != AnonymousClass3DU.LIVE || this.f53399B.f64121B.f7590D) {
                if (this.f53399B.C().f54386a == null && ((String) AnonymousClass0CC.IL.H(this.f53400C)).equals("hidden_at_startup")) {
                    return this.f53399B.f64121B.f7598L.m18697O();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final boolean m24057D(AnonymousClass3DU anonymousClass3DU) {
        if (AnonymousClass4Na.f53397B[anonymousClass3DU.ordinal()] == 3) {
            switch (this.f53399B.B().ordinal()) {
                case 1:
                    return false;
                case 2:
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m24058E(AnonymousClass3DU anonymousClass3DU) {
        boolean z = false;
        switch (AnonymousClass4Na.f53397B[anonymousClass3DU.ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
                if (this.f53399B.C().f54386a != null) {
                    z = true;
                    break;
                }
                break;
            default:
                return true;
        }
        return z;
    }

    /* renamed from: F */
    public final boolean m24059F(AnonymousClass3DU anonymousClass3DU) {
        boolean z = false;
        switch (AnonymousClass4Na.f53397B[anonymousClass3DU.ordinal()]) {
            case 3:
            case 6:
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
            case 8:
                AnonymousClass5St anonymousClass5St = this.f53399B;
                Object obj = (anonymousClass5St.f64121B.UB.f5584B == AnonymousClass3AM.VIDEO_RECORDING && anonymousClass5St.f64121B.f7604R) ? 1 : null;
                if (obj != null && this.f53399B.f64121B.H(anonymousClass3DU)) {
                    z = true;
                    break;
                }
                break;
            case 4:
            case 5:
                break;
            case 9:
            case 10:
                return this.f53399B.f64121B.H(anonymousClass3DU);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("isFlashVisibleInVideoRecording() unsupported format=");
                stringBuilder.append(this.f53399B.A());
                AnonymousClass0Gn.H("ig_camera", stringBuilder.toString());
                return false;
        }
        return z;
    }

    /* renamed from: G */
    public final boolean m24060G(AnonymousClass3DU anonymousClass3DU) {
        if (AnonymousClass4MP.m24000D()) {
            switch (AnonymousClass4Na.f53397B[anonymousClass3DU.ordinal()]) {
                case 1:
                case 2:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m24061H(AnonymousClass3DU anonymousClass3DU) {
        if (AnonymousClass4Na.f53397B[anonymousClass3DU.ordinal()] == 3) {
            switch (this.f53399B.B().ordinal()) {
                case 1:
                    return false;
                case 2:
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final boolean m24062I() {
        if (!AnonymousClass0eB.N()) {
            return false;
        }
        if (!this.f53399B.f64121B.gB) {
            return false;
        }
        if (this.f53399B.A() == AnonymousClass3DU.SUPERZOOMV3 || ((Boolean) AnonymousClass0CC.NF.H(this.f53400C)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m24063J(AnonymousClass3DU anonymousClass3DU) {
        boolean z = false;
        if (AnonymousClass0eB.N()) {
            if (anonymousClass3DU != AnonymousClass3DU.TEXT) {
                return true;
            }
            if (this.f53399B.C().m24297A() != null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: K */
    public final boolean m24064K(AnonymousClass3DU anonymousClass3DU) {
        switch (AnonymousClass4Na.f53397B[anonymousClass3DU.ordinal()]) {
            case 2:
                return this.f53399B.f64121B.f7633u ^ true;
            case 3:
                switch (this.f53399B.B().ordinal()) {
                    case 1:
                        return false;
                    case 2:
                        break;
                    default:
                        break;
                }
        }
        return true;
    }
}
