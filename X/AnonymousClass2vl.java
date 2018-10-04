package X;

import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;

/* renamed from: X.2vl */
public final class AnonymousClass2vl {
    /* renamed from: B */
    private static final int f35957B = AnonymousClass2yi.m18091L("alb");
    /* renamed from: C */
    private static final int f35958C = AnonymousClass2yi.m18091L("ART");
    /* renamed from: D */
    private static final int f35959D = AnonymousClass2yi.m18091L("cmt");
    /* renamed from: E */
    private static final int f35960E = AnonymousClass2yi.m18091L("com");
    /* renamed from: F */
    private static final int f35961F = AnonymousClass2yi.m18091L("wrt");
    /* renamed from: G */
    private static final int f35962G = AnonymousClass2yi.m18091L("too");
    /* renamed from: H */
    private static final int f35963H = AnonymousClass2yi.m18091L("gen");
    /* renamed from: I */
    private static final int f35964I = AnonymousClass2yi.m18091L("lyr");
    /* renamed from: J */
    private static final int f35965J = AnonymousClass2yi.m18091L("nam");
    /* renamed from: K */
    private static final int f35966K = AnonymousClass2yi.m18091L("trk");
    /* renamed from: L */
    private static final int f35967L = AnonymousClass2yi.m18091L("day");
    /* renamed from: M */
    private static final String[] f35968M = new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    /* renamed from: N */
    private static final int f35969N = AnonymousClass2yi.m18091L("aART");
    /* renamed from: O */
    private static final int f35970O = AnonymousClass2yi.m18091L("cpil");
    /* renamed from: P */
    private static final int f35971P = AnonymousClass2yi.m18091L("covr");
    /* renamed from: Q */
    private static final int f35972Q = AnonymousClass2yi.m18091L("disk");
    /* renamed from: R */
    private static final int f35973R = AnonymousClass2yi.m18091L("pgap");
    /* renamed from: S */
    private static final int f35974S = AnonymousClass2yi.m18091L("gnre");
    /* renamed from: T */
    private static final int f35975T = AnonymousClass2yi.m18091L("grp");
    /* renamed from: U */
    private static final int f35976U = AnonymousClass2yi.m18091L("----");
    /* renamed from: V */
    private static final int f35977V = AnonymousClass2yi.m18091L("rtng");
    /* renamed from: W */
    private static final int f35978W = AnonymousClass2yi.m18091L("soal");
    /* renamed from: X */
    private static final int f35979X = AnonymousClass2yi.m18091L("soaa");
    /* renamed from: Y */
    private static final int f35980Y = AnonymousClass2yi.m18091L("soar");
    /* renamed from: Z */
    private static final int f35981Z = AnonymousClass2yi.m18091L("soco");
    /* renamed from: a */
    private static final int f35982a = AnonymousClass2yi.m18091L("sonm");
    /* renamed from: b */
    private static final int f35983b = AnonymousClass2yi.m18091L("tmpo");
    /* renamed from: c */
    private static final int f35984c = AnonymousClass2yi.m18091L("trkn");
    /* renamed from: d */
    private static final int f35985d = AnonymousClass2yi.m18091L("tvsh");
    /* renamed from: e */
    private static final int f35986e = AnonymousClass2yi.m18091L("sosn");

    /* renamed from: B */
    public static Entry m17810B(AnonymousClass2yc anonymousClass2yc) {
        Entry G;
        int D = anonymousClass2yc.f36539D + anonymousClass2yc.m18048D();
        int D2 = anonymousClass2yc.m18048D();
        int i = (D2 >> 24) & 255;
        if (i != 169) {
            if (i != 65533) {
                try {
                    if (D2 == f35974S) {
                        G = AnonymousClass2vl.m17815G(anonymousClass2yc);
                        return G;
                    } else if (D2 == f35972Q) {
                        G = AnonymousClass2vl.m17813E(D2, "TPOS", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35984c) {
                        G = AnonymousClass2vl.m17813E(D2, "TRCK", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35983b) {
                        G = AnonymousClass2vl.m17817I(D2, "TBPM", anonymousClass2yc, true, false);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35970O) {
                        G = AnonymousClass2vl.m17817I(D2, "TCMP", anonymousClass2yc, true, true);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35971P) {
                        G = AnonymousClass2vl.m17812D(anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35969N) {
                        G = AnonymousClass2vl.m17816H(D2, "TPE2", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35982a) {
                        G = AnonymousClass2vl.m17816H(D2, "TSOT", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35978W) {
                        G = AnonymousClass2vl.m17816H(D2, "TSO2", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35980Y) {
                        G = AnonymousClass2vl.m17816H(D2, "TSOA", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35979X) {
                        G = AnonymousClass2vl.m17816H(D2, "TSOP", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35981Z) {
                        G = AnonymousClass2vl.m17816H(D2, "TSOC", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35977V) {
                        G = AnonymousClass2vl.m17817I(D2, "ITUNESADVISORY", anonymousClass2yc, false, false);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35973R) {
                        G = AnonymousClass2vl.m17817I(D2, "ITUNESGAPLESS", anonymousClass2yc, false, true);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35986e) {
                        G = AnonymousClass2vl.m17816H(D2, "TVSHOWSORT", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else if (D2 == f35985d) {
                        G = AnonymousClass2vl.m17816H(D2, "TVSHOW", anonymousClass2yc);
                        anonymousClass2yc.m18064T(D);
                        return G;
                    } else {
                        if (D2 == f35976U) {
                            G = AnonymousClass2vl.m17814F(anonymousClass2yc, D);
                            anonymousClass2yc.m18064T(D);
                            return G;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Skipped unknown metadata entry: ");
                        stringBuilder.append(AnonymousClass2vb.mo4572B(D2));
                        stringBuilder.toString();
                        anonymousClass2yc.m18064T(D);
                        return null;
                    }
                } finally {
                    anonymousClass2yc.m18064T(D);
                }
            }
        }
        i = 16777215 & D2;
        if (i == f35959D) {
            G = AnonymousClass2vl.m17811C(D2, anonymousClass2yc);
            anonymousClass2yc.m18064T(D);
            return G;
        }
        if (i != f35965J) {
            if (i != f35966K) {
                if (i != f35960E) {
                    if (i != f35961F) {
                        if (i == f35967L) {
                            G = AnonymousClass2vl.m17816H(D2, "TDRC", anonymousClass2yc);
                            anonymousClass2yc.m18064T(D);
                            return G;
                        } else if (i == f35958C) {
                            G = AnonymousClass2vl.m17816H(D2, "TPE1", anonymousClass2yc);
                            anonymousClass2yc.m18064T(D);
                            return G;
                        } else if (i == f35962G) {
                            G = AnonymousClass2vl.m17816H(D2, "TSSE", anonymousClass2yc);
                            anonymousClass2yc.m18064T(D);
                            return G;
                        } else if (i == f35957B) {
                            G = AnonymousClass2vl.m17816H(D2, "TALB", anonymousClass2yc);
                            anonymousClass2yc.m18064T(D);
                            return G;
                        } else if (i == f35964I) {
                            G = AnonymousClass2vl.m17816H(D2, "USLT", anonymousClass2yc);
                            anonymousClass2yc.m18064T(D);
                            return G;
                        } else if (i == f35963H) {
                            G = AnonymousClass2vl.m17816H(D2, "TCON", anonymousClass2yc);
                            anonymousClass2yc.m18064T(D);
                            return G;
                        } else {
                            if (i == f35975T) {
                                G = AnonymousClass2vl.m17816H(D2, "TIT1", anonymousClass2yc);
                                anonymousClass2yc.m18064T(D);
                                return G;
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Skipped unknown metadata entry: ");
                            stringBuilder2.append(AnonymousClass2vb.mo4572B(D2));
                            stringBuilder2.toString();
                            anonymousClass2yc.m18064T(D);
                            return null;
                        }
                    }
                }
                G = AnonymousClass2vl.m17816H(D2, "TCOM", anonymousClass2yc);
                anonymousClass2yc.m18064T(D);
                return G;
            }
        }
        G = AnonymousClass2vl.m17816H(D2, "TIT2", anonymousClass2yc);
        anonymousClass2yc.m18064T(D);
        return G;
    }

    /* renamed from: C */
    private static CommentFrame m17811C(int i, AnonymousClass2yc anonymousClass2yc) {
        int D = anonymousClass2yc.m18048D();
        if (anonymousClass2yc.m18048D() == AnonymousClass2vb.f35874P) {
            anonymousClass2yc.m18065U(8);
            String H = anonymousClass2yc.m18052H(D - 16);
            return new CommentFrame("und", H, H);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse comment attribute: ");
        stringBuilder.append(AnonymousClass2vb.mo4572B(i));
        Log.w("MetadataUtil", stringBuilder.toString());
        return null;
    }

    /* renamed from: D */
    private static ApicFrame m17812D(AnonymousClass2yc anonymousClass2yc) {
        int D = anonymousClass2yc.m18048D();
        if (anonymousClass2yc.m18048D() == AnonymousClass2vb.f35874P) {
            int C = AnonymousClass2vb.m17786C(anonymousClass2yc.m18048D());
            String str = C == 13 ? "image/jpeg" : C == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized cover art flags: ");
                stringBuilder.append(C);
                Log.w("MetadataUtil", stringBuilder.toString());
                return null;
            }
            anonymousClass2yc.m18065U(4);
            byte[] bArr = new byte[(D - 16)];
            anonymousClass2yc.m18047C(bArr, 0, bArr.length);
            return new ApicFrame(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: E */
    private static TextInformationFrame m17813E(int i, String str, AnonymousClass2yc anonymousClass2yc) {
        StringBuilder stringBuilder;
        int D = anonymousClass2yc.m18048D();
        if (anonymousClass2yc.m18048D() == AnonymousClass2vb.f35874P && D >= 22) {
            anonymousClass2yc.m18065U(10);
            int O = anonymousClass2yc.m18059O();
            if (O > 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(O);
                String stringBuilder3 = stringBuilder2.toString();
                D = anonymousClass2yc.m18059O();
                if (D > 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(stringBuilder3);
                    stringBuilder.append("/");
                    stringBuilder.append(D);
                    stringBuilder3 = stringBuilder.toString();
                }
                return new TextInformationFrame(str, null, stringBuilder3);
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse index/count attribute: ");
        stringBuilder.append(AnonymousClass2vb.mo4572B(i));
        Log.w("MetadataUtil", stringBuilder.toString());
        return null;
    }

    /* renamed from: F */
    private static Id3Frame m17814F(AnonymousClass2yc anonymousClass2yc, int i) {
        Object obj = null;
        String str = null;
        int i2 = -1;
        int i3 = -1;
        while (anonymousClass2yc.f36539D < i) {
            int i4 = anonymousClass2yc.f36539D;
            int D = anonymousClass2yc.m18048D();
            int D2 = anonymousClass2yc.m18048D();
            anonymousClass2yc.m18065U(4);
            if (D2 == AnonymousClass2vb.f35899o) {
                obj = anonymousClass2yc.m18052H(D - 12);
            } else if (D2 == AnonymousClass2vb.f35909y) {
                str = anonymousClass2yc.m18052H(D - 12);
            } else {
                if (D2 == AnonymousClass2vb.f35874P) {
                    i2 = i4;
                    i3 = D;
                }
                anonymousClass2yc.m18065U(D - 12);
            }
        }
        if ("com.apple.iTunes".equals(obj) && "iTunSMPB".equals(str)) {
            if (i2 != -1) {
                anonymousClass2yc.m18064T(i2);
                anonymousClass2yc.m18065U(16);
                return new CommentFrame("und", str, anonymousClass2yc.m18052H(i3 - 16));
            }
        }
        return null;
    }

    /* renamed from: G */
    private static TextInformationFrame m17815G(AnonymousClass2yc anonymousClass2yc) {
        String str;
        int J = AnonymousClass2vl.m17818J(anonymousClass2yc);
        if (J > 0) {
            String[] strArr = f35968M;
            if (J <= strArr.length) {
                str = strArr[J - 1];
                if (str != null) {
                    return new TextInformationFrame("TCON", null, str);
                }
                Log.w("MetadataUtil", "Failed to parse standard genre code");
                return null;
            }
        }
        str = null;
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        Log.w("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    /* renamed from: H */
    private static TextInformationFrame m17816H(int i, String str, AnonymousClass2yc anonymousClass2yc) {
        int D = anonymousClass2yc.m18048D();
        if (anonymousClass2yc.m18048D() == AnonymousClass2vb.f35874P) {
            anonymousClass2yc.m18065U(8);
            return new TextInformationFrame(str, null, anonymousClass2yc.m18052H(D - 16));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse text attribute: ");
        stringBuilder.append(AnonymousClass2vb.mo4572B(i));
        Log.w("MetadataUtil", stringBuilder.toString());
        return null;
    }

    /* renamed from: I */
    private static Id3Frame m17817I(int i, String str, AnonymousClass2yc anonymousClass2yc, boolean z, boolean z2) {
        int J = AnonymousClass2vl.m17818J(anonymousClass2yc);
        if (z2) {
            J = Math.min(1, J);
        }
        if (J >= 0) {
            Id3Frame textInformationFrame;
            if (z) {
                textInformationFrame = new TextInformationFrame(str, null, Integer.toString(J));
            } else {
                textInformationFrame = new CommentFrame("und", str, Integer.toString(J));
            }
            return textInformationFrame;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse uint8 attribute: ");
        stringBuilder.append(AnonymousClass2vb.mo4572B(i));
        Log.w("MetadataUtil", stringBuilder.toString());
        return null;
    }

    /* renamed from: J */
    private static int m17818J(AnonymousClass2yc anonymousClass2yc) {
        anonymousClass2yc.m18065U(4);
        if (anonymousClass2yc.m18048D() == AnonymousClass2vb.f35874P) {
            anonymousClass2yc.m18065U(8);
            return anonymousClass2yc.m18055K();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
