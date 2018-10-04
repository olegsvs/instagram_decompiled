package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.46S */
public final class AnonymousClass46S implements Iterator {
    /* renamed from: B */
    public int f50298B;
    /* renamed from: C */
    public AnonymousClass5RE f50299C;
    /* renamed from: D */
    public boolean f50300D;
    /* renamed from: E */
    private final AnonymousClass46I f50301E;
    /* renamed from: F */
    private final AnonymousClass46L f50302F;
    /* renamed from: G */
    private AnonymousClass46N f50303G;
    /* renamed from: H */
    private File f50304H;
    /* renamed from: I */
    private final long f50305I = ((System.currentTimeMillis() / AnonymousClass46A.f50266B) - 7);
    /* renamed from: J */
    private final long f50306J = ((System.currentTimeMillis() / AnonymousClass46A.f50267C) - 168);
    /* renamed from: K */
    private final AnonymousClass5RO f50307K;
    /* renamed from: L */
    private final int f50308L;

    public AnonymousClass46S(File file, AnonymousClass46L anonymousClass46L, AnonymousClass5RO anonymousClass5RO, int i) {
        this.f50301E = new AnonymousClass46I(new AnonymousClass5bC(file));
        this.f50302F = anonymousClass46L;
        this.f50307K = anonymousClass5RO;
        this.f50308L = i;
    }

    /* renamed from: B */
    private AnonymousClass5RE m23240B() {
        AnonymousClass46R anonymousClass46R = new AnonymousClass46R();
        Object arrayList = new ArrayList(4);
        AnonymousClass46E anonymousClass46E = null;
        int i = 0;
        while (true) {
            if ((i == 0 || i < this.f50308L) && this.f50301E.hasNext()) {
                AnonymousClass46G A = this.f50301E.m23224A();
                AnonymousClass46E anonymousClass46E2 = A.f50278C;
                switch (A.f50277B) {
                    case 1:
                        if (!(anonymousClass46E2 instanceof AnonymousClass5bD)) {
                            if (!(anonymousClass46E2 instanceof AnonymousClass5bE)) {
                                break;
                            }
                            anonymousClass46E2 = (AnonymousClass5bE) anonymousClass46E2;
                            if (!AnonymousClass46S.m23242D(this, anonymousClass46E2)) {
                                break;
                            }
                            anonymousClass46E = anonymousClass46E2;
                            break;
                        }
                        this.f50303G = AnonymousClass46N.m23234B(true ^ anonymousClass46E2.f50275B.getName().equals(AnonymousClass1M1.B()));
                        break;
                    case 2:
                        if (anonymousClass46E != null) {
                            File file = anonymousClass46E2.f50275B;
                            if (!file.isDirectory()) {
                                AnonymousClass0Dc.R("FileBatchPayloadIterator", "%s: not a directory, deleting anyway...", new Object[]{file});
                            }
                            file.delete();
                            if (anonymousClass46E.f50275B.equals(anonymousClass46E2.f50275B)) {
                                anonymousClass46E = null;
                            }
                        } else {
                            anonymousClass46R.f50297B.add((AnonymousClass5RD) anonymousClass46E2);
                        }
                        if (!(anonymousClass46E2 instanceof AnonymousClass5bD)) {
                            break;
                        }
                        AnonymousClass5RO anonymousClass5RO = this.f50307K;
                        File file2 = anonymousClass46E2.f50275B;
                        File file3 = this.f50304H;
                        anonymousClass5RO.f63398B.f50330E.put(file2.getName(), file3);
                        this.f50304H = null;
                        break;
                    case 3:
                        if (anonymousClass46E == null) {
                            AnonymousClass5cL anonymousClass5cL = new AnonymousClass5cL(this.f50302F, anonymousClass46E2.f50275B, this.f50303G);
                            arrayList.add(anonymousClass5cL);
                            i = (int) (((long) i) + anonymousClass5cL.f67380B.length());
                            this.f50304H = anonymousClass46E2.f50275B;
                            break;
                        }
                        AnonymousClass46S.m23243E(this, anonymousClass46E2.f50275B, this.f50303G);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("eventType=");
                        stringBuilder.append(A.f50277B);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            int size = arrayList.size();
            if (size <= 0) {
                return null;
            }
            AnonymousClass5RE anonymousClass5bH;
            this.f50298B += size;
            if (size > 1) {
                Integer.valueOf(arrayList.size());
                Integer.valueOf(i);
                anonymousClass5bH = new AnonymousClass5bH(arrayList, this.f50302F);
            } else {
                anonymousClass5bH = (AnonymousClass5RE) arrayList.get(0);
            }
            return new AnonymousClass5bG(anonymousClass5bH, anonymousClass46R);
        }
    }

    /* renamed from: C */
    private static boolean m23241C(AnonymousClass5bE anonymousClass5bE, long j) {
        long C = anonymousClass5bE.C(-1);
        if (C < 0) {
            return true;
        }
        return C < j;
    }

    /* renamed from: D */
    private static boolean m23242D(AnonymousClass46S anonymousClass46S, AnonymousClass5bE anonymousClass5bE) {
        if (anonymousClass5bE instanceof AnonymousClass5cJ) {
            return AnonymousClass46S.m23241C(anonymousClass5bE, anonymousClass46S.f50305I);
        }
        if (anonymousClass5bE instanceof AnonymousClass5cK) {
            return AnonymousClass46S.m23241C(anonymousClass5bE, anonymousClass46S.f50306J);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("directoryNode=");
        stringBuilder.append(anonymousClass5bE);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: E */
    private static boolean m23243E(AnonymousClass46S anonymousClass46S, File file, AnonymousClass46N anonymousClass46N) {
        synchronized (anonymousClass46N) {
            AnonymousClass46M anonymousClass46M = (AnonymousClass46M) anonymousClass46N.f50290B.get(file);
            if (anonymousClass46M == null) {
                anonymousClass46M = anonymousClass46N.m23235A(file);
                anonymousClass46N.f50290B.put(file, anonymousClass46M);
            }
            anonymousClass46M.f50288D++;
        }
        try {
            if (anonymousClass46M.m23232H(anonymousClass46S)) {
                if (file.delete()) {
                    anonymousClass46M.m23231G(anonymousClass46S);
                    anonymousClass46M.m23225A();
                    anonymousClass46M.m23233I(anonymousClass46S);
                    anonymousClass46M.m23230F();
                    return true;
                }
                anonymousClass46M.m23233I(anonymousClass46S);
            }
            anonymousClass46M.m23230F();
            return false;
        } catch (Throwable th) {
            anonymousClass46M.m23230F();
        }
    }

    public final boolean hasNext() {
        if (!this.f50300D) {
            this.f50300D = true;
            this.f50299C = m23240B();
        }
        if (this.f50299C != null) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            AnonymousClass5RE anonymousClass5RE = this.f50299C;
            this.f50300D = false;
            this.f50299C = null;
            return anonymousClass5RE;
        }
        throw new IllegalStateException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("File removal should be accomplished via markSuccessful");
    }
}
