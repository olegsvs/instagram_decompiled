package X;

import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.45Z */
public final class AnonymousClass45Z extends AnonymousClass44C {
    /* renamed from: G */
    private static final Pattern f49954G = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    /* renamed from: B */
    public final boolean f49955B;
    /* renamed from: C */
    private int f49956C;
    /* renamed from: D */
    private int f49957D;
    /* renamed from: E */
    private int f49958E;
    /* renamed from: F */
    private int f49959F;

    public AnonymousClass45Z() {
        this(null);
    }

    public AnonymousClass45Z(List list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f49955B = false;
            return;
        }
        this.f49955B = true;
        String str = new String((byte[]) list.get(0));
        AnonymousClass2yO.m18013B(str.startsWith("Format: "));
        AnonymousClass45Z.m22929E(this, str);
        AnonymousClass45Z.m22930F(new AnonymousClass2yc((byte[]) list.get(1)));
    }

    /* renamed from: D */
    public static void m22928D(AnonymousClass45Z anonymousClass45Z, String str, List list, AnonymousClass2yW anonymousClass2yW) {
        if (anonymousClass45Z.f49957D == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Skipping dialogue line before complete format: ");
            stringBuilder.append(str);
            Log.w("SsaDecoder", stringBuilder.toString());
            return;
        }
        String[] split = str.substring(10).split(",", anonymousClass45Z.f49957D);
        if (split.length != anonymousClass45Z.f49957D) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Skipping dialogue line with fewer columns than format: ");
            stringBuilder.append(str);
            Log.w("SsaDecoder", stringBuilder.toString());
            return;
        }
        long G = AnonymousClass45Z.m22931G(split[anonymousClass45Z.f49958E]);
        if (G != -9223372036854775807L) {
            long j;
            String str2 = split[anonymousClass45Z.f49956C];
            if (str2.trim().isEmpty()) {
                j = -9223372036854775807L;
            } else {
                j = AnonymousClass45Z.m22931G(str2);
                if (j == -9223372036854775807L) {
                }
            }
            String str3 = "\n";
            list.add(new AnonymousClass2xO(split[anonymousClass45Z.f49959F].replaceAll("\\{.*?\\}", JsonProperty.USE_DEFAULT_NAME).replaceAll("\\\\N", str3).replaceAll("\\\\n", str3)));
            anonymousClass2yW.m18023A(G);
            if (j != -9223372036854775807L) {
                list.add(null);
                anonymousClass2yW.m18023A(j);
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Skipping invalid timing: ");
        stringBuilder.append(str);
        Log.w("SsaDecoder", stringBuilder.toString());
    }

    /* renamed from: E */
    public static void m22929E(AnonymousClass45Z anonymousClass45Z, String str) {
        String[] split = TextUtils.split(str.substring(8), ",");
        anonymousClass45Z.f49957D = split.length;
        anonymousClass45Z.f49958E = -1;
        anonymousClass45Z.f49956C = -1;
        anonymousClass45Z.f49959F = -1;
        for (int i = 0; i < anonymousClass45Z.f49957D; i++) {
            Object obj;
            String e = AnonymousClass2yi.m18110e(split[i].trim());
            int hashCode = e.hashCode();
            if (hashCode != 100571) {
                if (hashCode != 3556653) {
                    if (hashCode == 109757538) {
                        if (e.equals("start")) {
                            obj = null;
                            switch (obj) {
                                case null:
                                    anonymousClass45Z.f49958E = i;
                                    break;
                                case 1:
                                    anonymousClass45Z.f49956C = i;
                                    break;
                                case 2:
                                    anonymousClass45Z.f49959F = i;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                } else if (e.equals("text")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            anonymousClass45Z.f49958E = i;
                            break;
                        case 1:
                            anonymousClass45Z.f49956C = i;
                            break;
                        case 2:
                            anonymousClass45Z.f49959F = i;
                            break;
                        default:
                            break;
                    }
                }
            } else if (e.equals("end")) {
                obj = 1;
                switch (obj) {
                    case null:
                        anonymousClass45Z.f49958E = i;
                        break;
                    case 1:
                        anonymousClass45Z.f49956C = i;
                        break;
                    case 2:
                        anonymousClass45Z.f49959F = i;
                        break;
                    default:
                        break;
                }
            }
            obj = -1;
            switch (obj) {
                case null:
                    anonymousClass45Z.f49958E = i;
                    break;
                case 1:
                    anonymousClass45Z.f49956C = i;
                    break;
                case 2:
                    anonymousClass45Z.f49959F = i;
                    break;
                default:
                    break;
            }
        }
        if (anonymousClass45Z.f49958E == -1 || anonymousClass45Z.f49956C == -1 || anonymousClass45Z.f49959F == -1) {
            anonymousClass45Z.f49957D = 0;
        }
    }

    /* renamed from: F */
    public static void m22930F(AnonymousClass2yc anonymousClass2yc) {
        String E;
        do {
            E = anonymousClass2yc.m18049E();
            if (E == null) {
                return;
            }
        } while (!E.startsWith("[Events]"));
    }

    /* renamed from: G */
    public static long m22931G(String str) {
        str = f49954G.matcher(str);
        if (str.matches()) {
            return (((((Long.parseLong(str.group(1)) * 60) * 60) * 1000000) + ((Long.parseLong(str.group(2)) * 60) * 1000000)) + (Long.parseLong(str.group(3)) * 1000000)) + (Long.parseLong(str.group(4)) * 10000);
        }
        return -9223372036854775807L;
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ AnonymousClass2xP mo5380G(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass2yW anonymousClass2yW = new AnonymousClass2yW();
        AnonymousClass2yc anonymousClass2yc = new AnonymousClass2yc(bArr, i);
        if (!this.f49955B) {
            AnonymousClass45Z.m22930F(anonymousClass2yc);
        }
        while (true) {
            String E = anonymousClass2yc.m18049E();
            if (E == null) {
                AnonymousClass2xO[] anonymousClass2xOArr = new AnonymousClass2xO[arrayList.size()];
                arrayList.toArray(anonymousClass2xOArr);
                return new AnonymousClass3wK(anonymousClass2xOArr, Arrays.copyOf(anonymousClass2yW.f36525C, anonymousClass2yW.f36524B));
            } else if (!this.f49955B && E.startsWith("Format: ")) {
                AnonymousClass45Z.m22929E(this, E);
            } else if (E.startsWith("Dialogue: ")) {
                AnonymousClass45Z.m22928D(this, E, arrayList, anonymousClass2yW);
            }
        }
    }
}
