package X;

import com.facebook.common.dextricks.DexStore;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import java.util.List;

/* renamed from: X.0EY */
public final class AnonymousClass0EY extends AnonymousClass0EZ {
    /* renamed from: B */
    private final ThreadLocal f1979B = new ThreadLocal();

    /* renamed from: B */
    private void m1402B(AnonymousClass0KT anonymousClass0KT, long j) {
        List list = anonymousClass0KT.f3072Y;
        if (list != null) {
            StringBuilder stringBuilder = (StringBuilder) this.f1979B.get();
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
                this.f1979B.set(stringBuilder);
            }
            int i = 0;
            stringBuilder.setLength(0);
            while (i < list.size()) {
                String str = (String) list.get(i);
                if (str == null) {
                    break;
                } else if (stringBuilder.length() + str.length() > DexStore.LOAD_RESULT_MIXED_MODE) {
                    break;
                } else {
                    if (str.length() > 0) {
                        if (i != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(str);
                    }
                    i++;
                }
            }
            if (stringBuilder.length() > 0) {
                Logger.writeEntryWithStringWithNoMatch(AnonymousClass0CI.f1520J, anonymousClass0KT.m2825C(), 66, anonymousClass0KT.getMarkerId(), j, "tags", stringBuilder.toString());
            }
        }
    }

    /* renamed from: C */
    private static long m1403C(AnonymousClass0KT anonymousClass0KT) {
        return (((long) anonymousClass0KT.f3075b) << 16) & 281474976645120L;
    }

    /* renamed from: D */
    private static long m1404D(AnonymousClass0KT anonymousClass0KT) {
        return AnonymousClass0EY.m1403C(anonymousClass0KT) | ((long) anonymousClass0KT.f3061N);
    }

    public final AnonymousClass1C3 kN() {
        AnonymousClass0Ey anonymousClass0Ey = AnonymousClass0Ey.f2041H;
        if (anonymousClass0Ey != null) {
            if (anonymousClass0Ey.m1492E()) {
                return AnonymousClass1C3.f15482D;
            }
            AnonymousClass1Mv anonymousClass1Mv = (AnonymousClass1Mv) anonymousClass0Ey.m1489B(AnonymousClass0Ec.f2002C);
            if (anonymousClass1Mv != null) {
                int[] iArr = anonymousClass1Mv.f17752C;
                if (iArr != null) {
                    return new AnonymousClass1C3(iArr, null);
                }
            }
        }
        return AnonymousClass1C3.f15483E;
    }

    public final void qq(AnonymousClass0KT anonymousClass0KT, String str, String str2) {
        String str3 = str;
        if (str != null) {
            String str4 = str2;
            if (str2 != null) {
                if (TraceEvents.isEnabled(AnonymousClass0CI.f1520J)) {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length != 0) {
                        if (length2 != 0) {
                            if (length + length2 <= 256) {
                                if (!str.equals("loom_id")) {
                                    int markerId = anonymousClass0KT.getMarkerId();
                                    long D = AnonymousClass0EY.m1404D(anonymousClass0KT);
                                    Logger.writeEntryWithStringWithNoMatch(AnonymousClass0CI.f1520J, anonymousClass0KT.m2825C(), 67, markerId, 281474976710656L | D, str3, str4, anonymousClass0KT.f3062O * 1000000);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void rq(AnonymousClass0KT anonymousClass0KT) {
        AnonymousClass0KT anonymousClass0KT2 = anonymousClass0KT;
        long C = AnonymousClass0EY.m1403C(anonymousClass0KT);
        if (!anonymousClass0KT.f3076c) {
            C |= 281474976710656L;
        }
        Logger.writeEntryWithoutMatchForThread(AnonymousClass0CI.f1520J, anonymousClass0KT.m2825C(), 57, anonymousClass0KT.getMarkerId(), C, anonymousClass0KT.f3062O * 1000000);
        AnonymousClass0Ey anonymousClass0Ey = AnonymousClass0Ey.f2041H;
        if (anonymousClass0Ey != null) {
            AnonymousClass0Ey.m1481B(anonymousClass0Ey, AnonymousClass0Ec.f2002C | AnonymousClass0Ef.f2005C, anonymousClass0KT2, 0, 0, 2);
        }
    }

    public final void sq(AnonymousClass0KT anonymousClass0KT) {
        if (TraceEvents.isEnabled(AnonymousClass0CI.f1520J)) {
            Logger.writeEntryWithoutMatchForThread(AnonymousClass0CI.f1520J, anonymousClass0KT.m2825C(), 58, anonymousClass0KT.getMarkerId(), AnonymousClass0EY.m1404D(anonymousClass0KT), anonymousClass0KT.f3062O * 1000000);
        }
    }

    public final void tq(AnonymousClass0KT anonymousClass0KT, String str, String str2, long j, boolean z) {
        if (TraceEvents.isEnabled(AnonymousClass0CI.f1520J)) {
            int i;
            int writeEntryWithoutMatchForThread;
            int markerId = anonymousClass0KT.getMarkerId();
            int C = anonymousClass0KT.m2825C();
            if (z) {
                long j2 = j * 1000000;
                i = AnonymousClass0CI.f1520J;
                writeEntryWithoutMatchForThread = Logger.writeEntryWithoutMatchForThread(i, C, 59, markerId, AnonymousClass0EY.m1403C(anonymousClass0KT), j2);
                Logger.writeEntry(i, 91, writeEntryWithoutMatchForThread, str);
            } else {
                i = AnonymousClass0CI.f1520J;
                writeEntryWithoutMatchForThread = Logger.writeEntryWithoutMatchForThread(i, C, 59, markerId, AnonymousClass0EY.m1403C(anonymousClass0KT));
                Logger.writeEntry(i, 91, writeEntryWithoutMatchForThread, str);
            }
            if (str2 != null) {
                Logger.writeKeyValueStringWithMatch(i, writeEntryWithoutMatchForThread, "QPL::data", str2);
            }
        }
    }

    public final void uq(AnonymousClass0KT anonymousClass0KT) {
        vq(anonymousClass0KT);
    }

    public final void vq(AnonymousClass0KT anonymousClass0KT) {
        AnonymousClass0Ey anonymousClass0Ey = AnonymousClass0Ey.f2041H;
        if (anonymousClass0Ey != null) {
            int markerId = anonymousClass0KT.getMarkerId();
            int i = 0;
            boolean F = anonymousClass0Ey.m1493F(AnonymousClass0Ec.f2002C, 0, anonymousClass0KT, markerId);
            String D = anonymousClass0Ey.m1491D(markerId);
            if (D != null) {
                anonymousClass0KT.m2824B("loom_id", D);
            }
            long C = AnonymousClass0EY.m1403C(anonymousClass0KT);
            if (!anonymousClass0KT.f3076c) {
                C |= 281474976710656L;
            }
            if (!(F || (anonymousClass0Ey.m1490C() & AnonymousClass0Ef.f2005C) == 0)) {
                if ((anonymousClass0Ey.m1491D(markerId) != null ? 1 : null) != null) {
                    i = 1;
                }
            }
            if (F || r3 != 0) {
                C |= 562949953421312L;
            }
            long j = anonymousClass0KT.f3065R * 1000000;
            i = anonymousClass0KT.m2825C();
            int i2 = AnonymousClass0CI.f1520J;
            Logger.writeEntryWithoutMatchForThread(i2, i, 55, anonymousClass0KT.getMarkerId(), C, j);
            if (TraceEvents.isEnabled(i2)) {
                m1402B(anonymousClass0KT, C);
            }
        }
    }

    public final void wq(AnonymousClass0KT anonymousClass0KT) {
        AnonymousClass0KT anonymousClass0KT2 = anonymousClass0KT;
        long D = AnonymousClass0EY.m1404D(anonymousClass0KT);
        if (!anonymousClass0KT.f3076c) {
            D |= 281474976710656L;
        }
        if (TraceEvents.isEnabled(AnonymousClass0CI.f1520J)) {
            m1402B(anonymousClass0KT, D);
        }
        int markerId = anonymousClass0KT.getMarkerId();
        long j = anonymousClass0KT.f3062O * 1000000;
        Logger.writeEntryWithoutMatchForThread(AnonymousClass0CI.f1520J, anonymousClass0KT.m2825C(), 56, markerId, D, j);
        AnonymousClass0Ey anonymousClass0Ey = AnonymousClass0Ey.f2041H;
        if (anonymousClass0Ey != null) {
            AnonymousClass0Ey.m1481B(anonymousClass0Ey, AnonymousClass0Ec.f2002C | AnonymousClass0Ef.f2005C, anonymousClass0KT2, 1, 0, null);
        }
    }
}
