package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5ik */
public final class AnonymousClass5ik {
    /* renamed from: B */
    public final LinkedList f68435B;

    public AnonymousClass5ik(String str) {
        this.f68435B = new LinkedList(Arrays.asList(str.split("\\r\\n?|\\n")));
    }

    /* renamed from: B */
    public static void m28335B(AnonymousClass5ik anonymousClass5ik, String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("^a=rtpmap:(\\d+) ");
        stringBuilder.append(str);
        stringBuilder.append("(/\\d+)+[\r]?$");
        Pattern compile = Pattern.compile(stringBuilder.toString());
        String str2 = "m=video ";
        if (z) {
            str2 = "m=audio ";
        }
        ListIterator listIterator = anonymousClass5ik.f68435B.listIterator();
        String str3 = null;
        String str4 = null;
        int i = -1;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            String str5 = (String) listIterator.next();
            if (str5.startsWith(str2)) {
                i = nextIndex;
                str4 = str5;
            } else {
                Matcher matcher = compile.matcher(str5);
                if (matcher.matches()) {
                    str3 = matcher.group(1);
                }
            }
        }
        if (i == -1) {
            AnonymousClass0Dc.R("SdpEditor", "No %s line, so can't prefer %s", new Object[]{str2, str});
        } else if (str3 == null) {
            AnonymousClass0Dc.R("SdpEditor", "No rtpmap for %s", new Object[]{str});
        } else {
            String[] split = str4.split(" ");
            int i2 = 3;
            if (split.length > 3) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(split[0]);
                stringBuilder2.append(" ");
                stringBuilder2.append(split[1]);
                str5 = " ";
                stringBuilder2.append(str5);
                stringBuilder2.append(split[2]);
                stringBuilder2.append(str5);
                stringBuilder2.append(str3);
                while (i2 < split.length) {
                    if (!split[i2].equals(str3)) {
                        stringBuilder2.append(str5);
                        stringBuilder2.append(split[i2]);
                    }
                    i2++;
                }
                anonymousClass5ik.f68435B.set(i, stringBuilder2.toString());
            } else {
                AnonymousClass0Dc.H("SdpEditor", "Wrong SDP media description format: %s", new Object[]{str4});
            }
        }
    }

    /* renamed from: C */
    public static void m28336C(AnonymousClass5ik anonymousClass5ik, String str, int i, int i2, boolean z) {
        Matcher matcher;
        String str2;
        int i3;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("^a=rtpmap:(\\d+) ");
        stringBuilder.append(str);
        stringBuilder.append("(/\\d+)+[\r]?$");
        Pattern compile = Pattern.compile(stringBuilder.toString());
        ListIterator listIterator = anonymousClass5ik.f68435B.listIterator();
        do {
            str2 = null;
            if (!listIterator.hasNext()) {
                i3 = -1;
                break;
            } else {
                i3 = listIterator.nextIndex();
                matcher = compile.matcher((String) listIterator.next());
            }
        } while (!matcher.matches());
        str2 = matcher.group(1);
        if (str2 == null) {
            AnonymousClass0Dc.R("SdpEditor", "No rtpmap for %s codec", new Object[]{str});
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("^a=fmtp:");
        stringBuilder.append(str2);
        stringBuilder.append(" \\w+=\\d+.*[\r]?$");
        Pattern compile2 = Pattern.compile(stringBuilder.toString());
        ListIterator listIterator2 = anonymousClass5ik.f68435B.listIterator();
        while (listIterator2.hasNext()) {
            String str3 = (String) listIterator2.next();
            if (compile2.matcher(str3).matches()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str3);
                stringBuilder.append("; ");
                listIterator2.set(AnonymousClass5ik.m28337D(stringBuilder.toString(), i, i2, z));
                return;
            }
        }
        if (i3 > -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("a=fmtp:");
            stringBuilder.append(str2);
            stringBuilder.append(" ");
            anonymousClass5ik.f68435B.add(i3 + 1, AnonymousClass5ik.m28337D(stringBuilder.toString(), i, i2, z));
        }
    }

    /* renamed from: D */
    private static String m28337D(String str, int i, int i2, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        if (i > 0) {
            AnonymousClass0LH.I(z, "Start Bitrate is supported for video codec only");
            stringBuilder.append("x-google-start-bitrate");
            stringBuilder.append('=');
            stringBuilder.append(i);
        }
        if (i2 > 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("; ");
            }
            stringBuilder.append(z ? "x-google-max-bitrate" : "maxaveragebitrate");
            stringBuilder.append('=');
            if (!z) {
                i2 *= JsonMappingException.MAX_REFS_TO_LIST;
            }
            stringBuilder.append(i2);
        }
        stringBuilder.insert(0, str);
        return stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.f68435B.iterator();
        while (it.hasNext()) {
            stringBuilder.append((String) it.next());
            stringBuilder.append("\r\n");
        }
        return stringBuilder.toString();
    }
}
