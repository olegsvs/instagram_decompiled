package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.DexStore;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0uo */
public final class AnonymousClass0uo implements AnonymousClass0up {
    /* renamed from: B */
    public final AnonymousClass0us f11927B;
    /* renamed from: C */
    private AnonymousClass1c8 f11928C;
    /* renamed from: D */
    private final boolean f11929D;
    /* renamed from: E */
    private final AnonymousClass1H9 f11930E;
    /* renamed from: F */
    private final AnonymousClass1dF f11931F;

    public AnonymousClass0uo(AnonymousClass0us anonymousClass0us, AnonymousClass0Cm anonymousClass0Cm) {
        this.f11927B = anonymousClass0us;
        this.f11931F = new AnonymousClass1dF(anonymousClass0Cm);
        this.f11929D = ((Boolean) AnonymousClass0CC.Nb.m846H(anonymousClass0Cm)).booleanValue();
        this.f11930E = new AnonymousClass1H9(anonymousClass0Cm);
    }

    /* renamed from: B */
    private boolean m8282B(AnonymousClass1c8 anonymousClass1c8) {
        return anonymousClass1c8 != null && (this.f11930E.m10618A() || this.f11930E.f16703B);
    }

    public final void IKA(AnonymousClass2NP anonymousClass2NP) {
        this.f11931F.m12195D(anonymousClass2NP);
    }

    public final void eKA(Object obj, int i, AnonymousClass0vL anonymousClass0vL) {
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null) {
            AnonymousClass0us anonymousClass0us = this.f11927B;
            int E = AnonymousClass1Eh.m10224E(B, anonymousClass0vL);
            boolean F = AnonymousClass1Eh.m10225F(B, anonymousClass0vL);
            obj = new AnonymousClass1Dv(F ? "video_audio_enabled" : "video_audio_disabled", anonymousClass0us.f11934B);
            obj.f15746N = E;
            obj.f15747O = anonymousClass0vL.f12043F;
            AnonymousClass1Dv G = obj.m10132G((double) E, (double) anonymousClass0vL.f12043F);
            G.f15760b = (float) anonymousClass0vL.f12049L;
            G.f15771m = AnonymousClass1Eh.m10223D();
            G = G.m10131F(B);
            G.f15778t = anonymousClass0us.f11935C;
            G.f15777s = anonymousClass0vL.f12051N;
            G.f15766h = anonymousClass0vL.f12039B;
            G.f15736D = AnonymousClass1Eh.m10222C(i);
            G = G.m10128C(F);
            G.f15753U = anonymousClass0vL.f12045H;
            G.f15745M = anonymousClass0vL.f12041D;
            AnonymousClass1Eh.m10226G(G.m10127B(anonymousClass0us), B);
        }
    }

    public final void fKA(Object obj, int i, AnonymousClass0vL anonymousClass0vL) {
        AnonymousClass1c8 anonymousClass1c8;
        if (this.f11929D) {
            anonymousClass1c8 = r3.f11928C;
        } else {
            anonymousClass1c8 = obj != null ? r3.f11927B.mo1953B(obj) : null;
        }
        if (anonymousClass1c8 != null) {
            AnonymousClass0us anonymousClass0us = r3.f11927B;
            AnonymousClass0vL anonymousClass0vL2 = anonymousClass0vL;
            AnonymousClass1Dv F = AnonymousClass1Eh.m10221B("video_buffering_finished", AnonymousClass1Eh.m10224E(anonymousClass1c8, anonymousClass0vL2), anonymousClass0vL2.f12048K, anonymousClass0vL2.f12043F, anonymousClass0vL2.f12045H, anonymousClass0vL2.f12049L, AnonymousClass1Eh.m10225F(anonymousClass1c8, anonymousClass0vL2), anonymousClass0us.f11934B).m10131F(anonymousClass1c8);
            F.f15778t = anonymousClass0us.f11935C;
            F.f15777s = anonymousClass0vL2.f12051N;
            F.f15766h = anonymousClass0vL2.f12039B;
            int i2 = i;
            F.f15739G = i2;
            F.f15748P = i2;
            F.f15745M = anonymousClass0vL2.f12041D;
            F.f15757Y = anonymousClass0vL2.f12047J;
            AnonymousClass1Eh.m10226G(F.m10127B(anonymousClass0us), anonymousClass1c8);
            if (m8282B(anonymousClass1c8)) {
                AnonymousClass1dF anonymousClass1dF = r3.f11931F;
                String str = anonymousClass1c8.f20594D;
                int i3 = anonymousClass0vL2.f12042E;
                int i4 = anonymousClass0vL2.f12048K;
                int i5 = anonymousClass0vL2.f12043F;
                String str2 = anonymousClass0vL2.f12050M;
                int C = AnonymousClass1dF.m12187C(str);
                long uptimeMillis = SystemClock.uptimeMillis();
                Map hashMap = new HashMap();
                hashMap.put("end_buffering_current_position_ms", Integer.toString(i3));
                hashMap.put("end_buffering_last_start_position_ms", Integer.toString(i4));
                hashMap.put("end_buffering_duration_sec", Float.toString((float) (((long) i5) / 1000)));
                hashMap.put("buffering_duration_sec", Float.toString((float) (((long) i2) / 1000)));
                AnonymousClass1dF.m12186B(1900562, C, hashMap);
                AnonymousClass0Ea.f1980C.markerEnd(1900562, C, (short) 291);
                AnonymousClass2NU anonymousClass2NU = (AnonymousClass2NU) AnonymousClass1dF.f20721D.get(Integer.valueOf(C));
                if (anonymousClass2NU != null) {
                    boolean z;
                    anonymousClass2NU.D(uptimeMillis);
                    synchronized (anonymousClass2NU) {
                        z = anonymousClass2NU.f29674D;
                    }
                    if (z && anonymousClass2NU.B() != null && anonymousClass2NU.B().f29670C == 0) {
                        Map hashMap2 = new HashMap();
                        AnonymousClass1dF.m12190F(hashMap2, anonymousClass2NU, uptimeMillis);
                        AnonymousClass1dF.m12186B(1900557, C, hashMap2);
                        AnonymousClass0Ea.f1980C.m1449W(1900557, C, (short) 116);
                        anonymousClass2NU.A();
                    }
                }
                AnonymousClass1dF.m12189E(anonymousClass1dF, AnonymousClass1xF.f24614H, str, str2, i3, null, null, null, null, null, 0, null);
            }
        }
    }

    public final void gKA(Object obj, AnonymousClass0vL anonymousClass0vL, List list) {
        AnonymousClass1c8 anonymousClass1c8;
        AnonymousClass0lA anonymousClass0lA = null;
        if (this.f11929D) {
            anonymousClass1c8 = r8.f11928C;
        } else {
            anonymousClass1c8 = obj != null ? r8.f11927B.mo1953B(obj) : null;
        }
        if (anonymousClass1c8 != null) {
            AnonymousClass0lA anonymousClass0lA2;
            AnonymousClass0lA anonymousClass0lA3;
            AnonymousClass0us anonymousClass0us = r8.f11927B;
            AnonymousClass0lA anonymousClass0lA4 = null;
            List list2 = list;
            if (list == null || list2.size() <= 0) {
                anonymousClass0lA2 = null;
                anonymousClass0lA3 = null;
            } else {
                anonymousClass0lA4 = AnonymousClass0lA.m7236B();
                anonymousClass0lA2 = AnonymousClass0lA.m7236B();
                anonymousClass0lA3 = AnonymousClass0lA.m7236B();
                AnonymousClass1H9.m10615B(anonymousClass0lA4, anonymousClass0lA2, anonymousClass0lA3, list2);
            }
            AnonymousClass0vL anonymousClass0vL2 = anonymousClass0vL;
            AnonymousClass1Dv F = AnonymousClass1Eh.m10221B("video_buffering_started", AnonymousClass1Eh.m10224E(anonymousClass1c8, anonymousClass0vL2), anonymousClass0vL2.f12048K, anonymousClass0vL2.f12043F, anonymousClass0vL2.f12045H, anonymousClass0vL2.f12049L, AnonymousClass1Eh.m10225F(anonymousClass1c8, anonymousClass0vL2), anonymousClass0us.f11934B).m10131F(anonymousClass1c8);
            F.f15778t = anonymousClass0us.f11935C;
            F.f15777s = anonymousClass0vL2.f12051N;
            F.f15766h = anonymousClass0vL2.f12039B;
            F.f15745M = anonymousClass0vL2.f12041D;
            F.f15757Y = anonymousClass0vL2.f12047J;
            F.f15751S = anonymousClass0lA4;
            F.f15750R = anonymousClass0lA2;
            F.f15752T = anonymousClass0lA3;
            AnonymousClass1Eh.m10226G(F.m10127B(anonymousClass0us), anonymousClass1c8);
            if (m8282B(anonymousClass1c8)) {
                AnonymousClass0lA anonymousClass0lA5;
                AnonymousClass0lA anonymousClass0lA6;
                if (list == null || list2.size() <= 0) {
                    anonymousClass0lA5 = null;
                    anonymousClass0lA6 = null;
                } else {
                    anonymousClass0lA = AnonymousClass0lA.m7236B();
                    anonymousClass0lA5 = AnonymousClass0lA.m7236B();
                    anonymousClass0lA6 = AnonymousClass0lA.m7236B();
                    AnonymousClass1H9.m10615B(anonymousClass0lA, anonymousClass0lA5, anonymousClass0lA6, list2);
                }
                AnonymousClass1dF anonymousClass1dF = r8.f11931F;
                String str = anonymousClass1c8.f20594D;
                int i = anonymousClass0vL2.f12042E;
                int i2 = anonymousClass0vL2.f12048K;
                int i3 = anonymousClass0vL2.f12043F;
                String str2 = anonymousClass0vL2.f12050M;
                int C = AnonymousClass1dF.m12187C(str);
                long uptimeMillis = SystemClock.uptimeMillis();
                AnonymousClass0Ea.f1980C.markerStart(1900562, C);
                Map hashMap = new HashMap();
                hashMap.put(TraceFieldType.VideoId, str);
                hashMap.put("start_buffering_current_position_ms", Integer.toString(i));
                hashMap.put("start_buffering_last_start_position_ms", Integer.toString(i2));
                hashMap.put("start_buffering_duration_sec", Float.toString((float) (((long) i3) / 1000)));
                if (!(anonymousClass0lA == null || anonymousClass0lA5 == null || anonymousClass0lA6 == null)) {
                    hashMap.put("start_buffering_historical_requested_bytes", anonymousClass0lA.toString());
                    hashMap.put("start_buffering_historical_bitrates", anonymousClass0lA5.toString());
                    hashMap.put("start_buffering_historical_stream_types", anonymousClass0lA6.toString());
                }
                AnonymousClass1dF.m12186B(1900562, C, hashMap);
                AnonymousClass2NU anonymousClass2NU = (AnonymousClass2NU) AnonymousClass1dF.f20721D.get(Integer.valueOf(C));
                if (anonymousClass2NU == null) {
                    anonymousClass2NU = new AnonymousClass2NU();
                }
                long j = (long) i;
                synchronized (anonymousClass2NU) {
                    AnonymousClass2NT anonymousClass2NT = new AnonymousClass2NT(j, uptimeMillis);
                    if (anonymousClass2NU.f29672B == null) {
                        anonymousClass2NU.f29672B = anonymousClass2NT;
                    } else {
                        if (anonymousClass2NU.f29672B.f29669B == 0) {
                            anonymousClass2NU.f29672B.f29669B = SystemClock.uptimeMillis();
                        }
                        anonymousClass2NU.f29676F = anonymousClass2NT;
                    }
                    anonymousClass2NU.f29675E = true;
                    anonymousClass2NU.f29677G++;
                }
                AnonymousClass1dF.f20721D.put(Integer.valueOf(C), anonymousClass2NU);
                AnonymousClass1dF.m12189E(anonymousClass1dF, AnonymousClass1xF.f24615I, str, str2, i, null, null, null, null, null, null, null);
            }
        }
    }

    public final void hKA(Object obj, String str, int i, String str2, AnonymousClass0vL anonymousClass0vL, String str3) {
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null) {
            float f = (float) i;
            AnonymousClass1Dv F = new AnonymousClass1Dv("video_format_changed", this.f11927B.f11934B).m10131F(B);
            F.f15767i = str;
            F.f15777s = anonymousClass0vL.f12051N;
            F.f15775q = anonymousClass0vL.f12044G;
            F.f15737E = f;
            F.f15761c = str2;
            F.f15746N = anonymousClass0vL.f12042E;
            F.f15758Z = anonymousClass0vL.f12048K;
            F.f15760b = (float) anonymousClass0vL.f12049L;
            F.f15745M = anonymousClass0vL.f12041D;
            F.f15757Y = anonymousClass0vL.f12047J;
            AnonymousClass1Eh.m10226G(F.m10126A(), B);
            AnonymousClass1dF anonymousClass1dF = this.f11931F;
            String str4 = B.f20594D;
            String str5 = anonymousClass0vL.f12050M;
            int i2 = anonymousClass0vL.f12042E;
            AnonymousClass2NR anonymousClass2NR = new AnonymousClass2NR(i, str3);
            if (anonymousClass1dF.f20722B != null) {
                AnonymousClass1dF.m12189E(anonymousClass1dF, AnonymousClass1xF.f24612F, str4, str5, i2, null, Integer.valueOf(anonymousClass1dF.f20722B.f29663B), anonymousClass1dF.f20722B.f29664C, Integer.valueOf(anonymousClass2NR.f29663B), anonymousClass2NR.f29664C, null, null);
            }
            anonymousClass1dF.f20722B = anonymousClass2NR;
        }
    }

    public final void iKA(Object obj, String str, String str2) {
        obj = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (obj != null) {
            AnonymousClass1Dv F = new AnonymousClass1Dv("video_failed_playing", this.f11927B.f11934B).m10131F(obj);
            F.f15765g = str;
            F.f15749Q = str2;
            AnonymousClass1Eh.m10226G(F.m10126A(), obj);
        }
    }

    public final void jKA(Object obj, boolean z) {
        obj = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (obj != null) {
            AnonymousClass0us anonymousClass0us = this.f11927B;
            AnonymousClass1Dv F = new AnonymousClass1Dv("video_fetched", anonymousClass0us.f11934B).m10131F(obj);
            F.f15754V = Boolean.valueOf(z);
            AnonymousClass1Eh.m10226G(F.m10127B(anonymousClass0us), obj);
        }
    }

    public final void kKA(Object obj, String str, AnonymousClass0vL anonymousClass0vL) {
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null && m8282B(B) && B.f20604N != null) {
            String str2 = B.f20594D;
            String D = AnonymousClass1H9.m10617D(B);
            int i = anonymousClass0vL.f12040C;
            AnonymousClass0i5 anonymousClass0i5 = B.f20604N;
            String moduleName = this.f11927B.f11934B.getModuleName();
            long j = (long) anonymousClass0vL.f12043F;
            String D2 = this.f11927B.m8288D(str);
            long uptimeMillis = SystemClock.uptimeMillis();
            int C = AnonymousClass1dF.m12187C(str2);
            Map hashMap = new HashMap();
            AnonymousClass1dF.m12191G(C, hashMap, uptimeMillis);
            hashMap.put(TraceFieldType.Duration, Integer.toString((int) (j / 1000)));
            AnonymousClass1dF.m12186B(1900557, C, hashMap);
            AnonymousClass0Ea.f1980C.markerEnd(1900557, C, (short) 2);
            AnonymousClass0Ea.f1980C.markerStart(1900557, AnonymousClass1dF.m12187C(str2));
            AnonymousClass2NU anonymousClass2NU = new AnonymousClass2NU();
            synchronized (anonymousClass2NU) {
                anonymousClass2NU.f29674D = true;
            }
            AnonymousClass1dF.f20721D.put(Integer.valueOf(C), anonymousClass2NU);
            Map hashMap2 = new HashMap();
            hashMap2.put(TraceFieldType.VideoId, str2);
            hashMap2.put("player_type", D);
            hashMap2.put("start_bitrate", Integer.toString(i));
            if (anonymousClass0i5 != null) {
                hashMap2.put("streaming_format", AnonymousClass0i5.m6824C(anonymousClass0i5));
            }
            hashMap2.put("is_live_streaming", D.equalsIgnoreCase(AnonymousClass0ON.LIVE.toString()) ? "1" : "0");
            hashMap2.put("player_origin", moduleName);
            hashMap2.put("original_play_reason", D2);
            AnonymousClass1dF.m12186B(1900557, C, hashMap2);
        }
    }

    public final void lKA(Object obj, int i) {
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null) {
            AnonymousClass1Eh.m10228I(B, i, this.f11927B);
        }
    }

    public final void mKA(Object obj, int i, String str, AnonymousClass0vL anonymousClass0vL) {
        if (obj != null) {
            AnonymousClass1c8 B = this.f11927B.mo1953B(obj);
            this.f11928C = B;
            String C = this.f11927B.m8287C(str);
            AnonymousClass1Eh.m10229J(B, C, this.f11927B);
            if (m8282B(B) && B.f20604N != null) {
                this.f11931F.m12194C(B.f20594D, C, this.f11927B.f11935C, i, this.f11927B.f11934B.getModuleName(), B, anonymousClass0vL.f12050M, B.f20604N);
            }
        }
    }

    public final void nKA(Object obj) {
        if (this.f11929D) {
            AnonymousClass1c8 anonymousClass1c8 = this.f11928C;
            if (anonymousClass1c8 != null && obj != null) {
                if (anonymousClass1c8.f20594D.equals(this.f11927B.mo1953B(obj).f20594D)) {
                    AnonymousClass1Eh.m10227H(this.f11928C, this.f11927B);
                    if (m8282B(this.f11928C)) {
                        AnonymousClass1dF.m12188D(this.f11928C.f20594D);
                    }
                    this.f11928C = null;
                }
            }
        } else if (obj != null) {
            AnonymousClass1c8 B = this.f11927B.mo1953B(obj);
            if (this.f11928C != null && B.f20594D.equals(this.f11928C.f20594D)) {
                this.f11928C = null;
                AnonymousClass1Eh.m10227H(B, this.f11927B);
                if (m8282B(B)) {
                    AnonymousClass1dF.m12188D(B.f20594D);
                }
            }
        }
    }

    public final void oKA(Object obj, String str, String str2, AnonymousClass0vL anonymousClass0vL) {
        AnonymousClass0uo anonymousClass0uo = this;
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null) {
            String D = this.f11927B.m8288D(str);
            AnonymousClass0us anonymousClass0us = this.f11927B;
            AnonymousClass0vL anonymousClass0vL2 = anonymousClass0vL;
            int E = AnonymousClass1Eh.m10224E(B, anonymousClass0vL2);
            int i = anonymousClass0vL2.f12048K;
            int i2 = anonymousClass0vL2.f12043F;
            int i3 = anonymousClass0vL2.f12045H;
            int i4 = anonymousClass0vL2.f12049L;
            boolean F = AnonymousClass1Eh.m10225F(B, anonymousClass0vL2);
            AnonymousClass1Dv anonymousClass1Dv = new AnonymousClass1Dv("video_paused", anonymousClass0us.f11934B);
            anonymousClass1Dv.f15753U = i3;
            anonymousClass1Dv.f15746N = E;
            anonymousClass1Dv.f15747O = i2;
            anonymousClass1Dv = anonymousClass1Dv.m10132G((double) E, (double) i2);
            anonymousClass1Dv.f15758Z = i;
            anonymousClass1Dv.f15760b = (float) i4;
            anonymousClass1Dv.f15771m = AnonymousClass1Eh.m10223D();
            AnonymousClass1Dv C = anonymousClass1Dv.m10128C(F);
            C.f15762d = D;
            String str3 = str2;
            C.f15765g = str3;
            anonymousClass1Dv = C.m10131F(B);
            anonymousClass1Dv.f15778t = anonymousClass0us.f11935C;
            anonymousClass1Dv.f15777s = anonymousClass0vL2.f12051N;
            anonymousClass1Dv.f15766h = anonymousClass0vL2.f12039B;
            anonymousClass1Dv.f15745M = anonymousClass0vL2.f12041D;
            anonymousClass1Dv.f15757Y = anonymousClass0vL2.f12047J;
            AnonymousClass1Eh.m10226G(anonymousClass1Dv.m10127B(anonymousClass0us), B);
            if (m8282B(B) && B.f20604N != null) {
                AnonymousClass1dF anonymousClass1dF = anonymousClass0uo.f11931F;
                String str4 = B.f20594D;
                int i5 = anonymousClass0vL2.f12042E;
                int i6 = anonymousClass0vL2.f12048K;
                int i7 = anonymousClass0vL2.f12043F;
                int i8 = anonymousClass0vL2.f12040C;
                String str5 = anonymousClass0vL2.f12050M;
                AnonymousClass0i5 anonymousClass0i5 = B.f20604N;
                long uptimeMillis = SystemClock.uptimeMillis();
                i4 = AnonymousClass1dF.m12187C(str4);
                Map hashMap = new HashMap();
                hashMap.put("last_bitrate", Integer.toString(i8));
                hashMap.put(TraceFieldType.Duration, Integer.toString((int) (((long) i7) / JsonMappingException.MAX_REFS_TO_LIST)));
                hashMap.put("last_start_video_time_position_ms", Integer.toString(i6));
                hashMap.put("end_video_time_position_ms", Integer.toString(i5));
                hashMap.put("pause_reason", str3);
                AnonymousClass1dF.m12191G(i4, hashMap, uptimeMillis);
                AnonymousClass1dF.m12186B(1900557, i4, hashMap);
                AnonymousClass0Ea.f1980C.markerEnd(1900557, i4, (short) 237);
                AnonymousClass1dF.m12189E(anonymousClass1dF, AnonymousClass1xF.f24611E, str4, str5, i5, AnonymousClass1H9.m10616C(anonymousClass0i5), Integer.valueOf(i8), null, null, null, Integer.valueOf(i7), Boolean.valueOf(anonymousClass0i5.m6827C()));
            }
        }
    }

    public final void pKA(Object obj, String str, AnonymousClass0vL anonymousClass0vL) {
        obj = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (obj != null) {
            if (!this.f11929D) {
                this.f11928C = obj;
            }
            String C = this.f11927B.m8287C(str);
            AnonymousClass1Eh.m10229J(obj, C, this.f11927B);
            if (m8282B(obj) && obj.f20604N != null) {
                this.f11931F.m12194C(obj.f20594D, C, this.f11927B.f11935C, anonymousClass0vL.f12042E, this.f11927B.f11934B.getModuleName(), obj, anonymousClass0vL.f12050M, obj.f20604N);
            }
        }
    }

    public final void qKA(Object obj, int i, AnonymousClass0vL anonymousClass0vL) {
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null) {
            AnonymousClass0us anonymousClass0us = this.f11927B;
            AnonymousClass1Dv F = new AnonymousClass1Dv("video_seek", anonymousClass0us.f11934B).m10131F(B);
            F.f15746N = anonymousClass0vL.f12042E;
            F.f15768j = anonymousClass0vL.f12042E;
            F.f15769k = i;
            F.f15758Z = anonymousClass0vL.f12048K;
            F.f15747O = anonymousClass0vL.f12043F;
            F.f15760b = (float) anonymousClass0vL.f12049L;
            F = F.m10128C(AnonymousClass1Eh.m10225F(B, anonymousClass0vL));
            F.f15778t = anonymousClass0us.f11935C;
            F.f15777s = anonymousClass0vL.f12051N;
            F.f15766h = anonymousClass0vL.f12039B;
            AnonymousClass1Eh.m10226G(F.m10127B(anonymousClass0us), B);
        }
    }

    public final void rKA(Object obj, long j, boolean z, String str, AnonymousClass0vL anonymousClass0vL) {
        AnonymousClass1c8 anonymousClass1c8;
        if (this.f11929D) {
            anonymousClass1c8 = this.f11928C;
        } else {
            anonymousClass1c8 = obj != null ? this.f11927B.mo1953B(obj) : null;
        }
        if (anonymousClass1c8 != null) {
            String D = this.f11927B.m8288D(str);
            AnonymousClass0us anonymousClass0us = this.f11927B;
            long j2 = j;
            AnonymousClass1Dv anonymousClass1Dv = new AnonymousClass1Dv("video_started_playing", anonymousClass0us.f11934B);
            anonymousClass1Dv.f15771m = AnonymousClass1Eh.m10223D();
            AnonymousClass0vL anonymousClass0vL2 = anonymousClass0vL;
            anonymousClass1Dv.f15753U = anonymousClass0vL2.f12045H;
            AnonymousClass1Dv C = anonymousClass1Dv.m10128C(AnonymousClass1Eh.m10225F(anonymousClass1c8, anonymousClass0vL2));
            C.f15765g = D;
            C.f15770l = j2;
            C.f15754V = Boolean.valueOf(z);
            C.f15756X = Boolean.valueOf(true);
            C.f15764f = DexStore.LOAD_RESULT_DEX2OAT_QUICKENED;
            AnonymousClass1Dv F = C.m10131F(anonymousClass1c8);
            F.f15778t = anonymousClass0us.f11935C;
            F.f15777s = anonymousClass0vL2.f12051N;
            F.f15775q = anonymousClass0vL2.f12044G;
            F.f15766h = anonymousClass0vL2.f12039B;
            AnonymousClass1Eh.m10226G(F.m10127B(anonymousClass0us), anonymousClass1c8);
            if (m8282B(anonymousClass1c8) && anonymousClass1c8.f20604N != null) {
                AnonymousClass1dF anonymousClass1dF = this.f11931F;
                String str2 = anonymousClass1c8.f20594D;
                int i = anonymousClass0vL2.f12040C;
                int i2 = anonymousClass0vL2.f12042E;
                AnonymousClass0i5 anonymousClass0i5 = anonymousClass1c8.f20604N;
                String str3 = anonymousClass0vL2.f12050M;
                j2 = SystemClock.uptimeMillis();
                int C2 = AnonymousClass1dF.m12187C(str2);
                AnonymousClass0Ea.f1980C.m1449W(1900557, C2, (short) 116);
                Map hashMap = new HashMap();
                hashMap.put("start_bitrate", Integer.toString(i));
                hashMap.put("start_video_time_position_ms", Integer.toString(i2));
                hashMap.put(TraceFieldType.StreamType, (z ? AnonymousClass2NS.f29666D : AnonymousClass2NS.f29667E).f29668B);
                hashMap.put("start_delay", Long.toString(j));
                hashMap.put("prefetch_size", Integer.toString(DexStore.LOAD_RESULT_DEX2OAT_QUICKENED));
                AnonymousClass2NU anonymousClass2NU = (AnonymousClass2NU) AnonymousClass1dF.f20721D.get(Integer.valueOf(C2));
                if (anonymousClass2NU != null) {
                    anonymousClass2NU.D(j2);
                    AnonymousClass1dF.m12190F(hashMap, anonymousClass2NU, j2);
                } else {
                    anonymousClass2NU = new AnonymousClass2NU();
                    AnonymousClass1dF.f20721D.put(Integer.valueOf(C2), anonymousClass2NU);
                }
                anonymousClass2NU.A();
                AnonymousClass1dF.m12186B(1900557, C2, hashMap);
                AnonymousClass1dF.m12189E(anonymousClass1dF, AnonymousClass1xF.f24616J, str2, str3, i2, AnonymousClass1H9.m10616C(anonymousClass0i5), Integer.valueOf(i), 0, null, false, null, Boolean.valueOf(anonymousClass0i5.m6827C()));
            }
        }
    }

    public final void sKA(Object obj, int i, int i2, int i3, AnonymousClass0vL anonymousClass0vL) {
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null) {
            AnonymousClass0us anonymousClass0us = this.f11927B;
            AnonymousClass1Dv F = new AnonymousClass1Dv("video_playing_update", anonymousClass0us.f11934B).m10131F(B);
            F.f15771m = AnonymousClass1Eh.m10223D();
            F = F.m10128C(AnonymousClass1Eh.m10225F(B, anonymousClass0vL));
            F.f15746N = anonymousClass0vL.f12042E;
            F.f15758Z = anonymousClass0vL.f12048K;
            F.f15772n = i3;
            F.f15778t = anonymousClass0us.f11935C;
            F.f15777s = anonymousClass0vL.f12051N;
            F.f15766h = anonymousClass0vL.f12039B;
            F.f15745M = anonymousClass0vL.f12041D;
            F.f15757Y = anonymousClass0vL.f12047J;
            F.f15738F = i;
            F.f15759a = i2;
            AnonymousClass1Eh.m10226G(F.m10127B(anonymousClass0us), B);
        }
    }

    public final void tKA(Object obj, long j, String str, String str2, int i) {
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null) {
            AnonymousClass0us anonymousClass0us = this.f11927B;
            AnonymousClass1Dv F = new AnonymousClass1Dv("video_rendered", anonymousClass0us.f11934B).m10131F(B);
            F.f15778t = anonymousClass0us.f11935C;
            F.f15770l = j;
            F.f15774p = str;
            F.f15735C = str2;
            F.f15773o = i;
            AnonymousClass1Eh.m10226G(F.m10127B(anonymousClass0us), B);
            if (m8282B(B)) {
                String str3 = B.f20594D;
                int C = AnonymousClass1dF.m12187C(str3);
                Map hashMap = new HashMap();
                hashMap.put(TraceFieldType.VideoId, str3);
                hashMap.put("render_delay", Long.toString(j));
                AnonymousClass1dF.m12186B(1900557, C, hashMap);
                AnonymousClass0Ea.f1980C.m1449W(1900557, C, (short) 640);
            }
        }
    }

    public final void uKA(Object obj, AnonymousClass0vL anonymousClass0vL) {
        AnonymousClass1c8 B = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (B != null) {
            AnonymousClass0us anonymousClass0us = this.f11927B;
            AnonymousClass1Dv F = new AnonymousClass1Dv("video_viewed", anonymousClass0us.f11934B).m10131F(B);
            F.f15771m = AnonymousClass1Eh.m10223D();
            F = F.m10128C(AnonymousClass1Eh.m10225F(B, anonymousClass0vL));
            F.f15746N = anonymousClass0vL.f12042E;
            F.f15758Z = anonymousClass0vL.f12048K;
            F.f15778t = anonymousClass0us.f11935C;
            F.f15777s = anonymousClass0vL.f12051N;
            F.f15766h = anonymousClass0vL.f12039B;
            F.f15745M = anonymousClass0vL.f12041D;
            F.f15757Y = anonymousClass0vL.f12047J;
            AnonymousClass1Eh.m10226G(F.m10127B(anonymousClass0us), B);
        }
    }

    public final void vKA(Object obj, String str, String str2) {
        obj = this.f11929D ? this.f11928C : obj != null ? this.f11927B.mo1953B(obj) : null;
        if (obj != null) {
            AnonymousClass1Dv F = new AnonymousClass1Dv("video_playback_warning", this.f11927B.f11934B).m10131F(obj);
            F.f15765g = str;
            F.f15749Q = str2;
            AnonymousClass1Eh.m10226G(F.m10126A(), obj);
        }
    }
}
