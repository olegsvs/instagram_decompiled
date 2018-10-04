package X;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.1NV */
public class AnonymousClass1NV extends AnonymousClass1NW {
    /* renamed from: B */
    public AnonymousClass1NY[] f17796B;
    /* renamed from: C */
    public final ZipFile f17797C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cw f17798D;
    /* renamed from: E */
    private final AnonymousClass0Cx f17799E;

    /* renamed from: D */
    public boolean mo2500D(ZipEntry zipEntry, String str) {
        return true;
    }

    public AnonymousClass1NV(AnonymousClass0Cw anonymousClass0Cw, AnonymousClass0Cx anonymousClass0Cx) {
        this.f17798D = anonymousClass0Cw;
        this.f17797C = new ZipFile(anonymousClass0Cw.f1784B);
        this.f17799E = anonymousClass0Cx;
    }

    /* renamed from: A */
    public final AnonymousClass1NX mo157A() {
        return new AnonymousClass1NX(m11054C());
    }

    /* renamed from: B */
    public final AnonymousClass1Nb mo158B() {
        return new AnonymousClass1Na(this);
    }

    /* renamed from: C */
    public final AnonymousClass1NY[] m11054C() {
        if (this.f17796B == null) {
            Set linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(this.f17798D.f1785C);
            String[] F = AnonymousClass0Cz.m1084F();
            Enumeration entries = this.f17797C.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                Matcher matcher = compile.matcher(zipEntry.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    int C = AnonymousClass0Cz.m1081C(F, group);
                    if (C >= 0) {
                        linkedHashSet.add(group);
                        AnonymousClass1NY anonymousClass1NY = (AnonymousClass1NY) hashMap.get(group2);
                        if (anonymousClass1NY == null || C < anonymousClass1NY.f17801B) {
                            hashMap.put(group2, new AnonymousClass1NY(group2, zipEntry, C));
                        }
                    }
                }
            }
            String[] strArr = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
            AnonymousClass1NY[] anonymousClass1NYArr = (AnonymousClass1NY[]) hashMap.values().toArray(new AnonymousClass1NY[hashMap.size()]);
            Arrays.sort(anonymousClass1NYArr);
            int i = 0;
            for (int i2 = 0; i2 < anonymousClass1NYArr.length; i2++) {
                AnonymousClass1NZ anonymousClass1NZ = anonymousClass1NYArr[i2];
                if (mo2500D(anonymousClass1NZ.f17802C, anonymousClass1NZ.f17804C)) {
                    i++;
                } else {
                    anonymousClass1NYArr[i2] = null;
                }
            }
            AnonymousClass1NY[] anonymousClass1NYArr2 = new AnonymousClass1NY[i];
            i = 0;
            for (AnonymousClass1NY anonymousClass1NY2 : anonymousClass1NYArr) {
                if (anonymousClass1NY2 != null) {
                    int i3 = i + 1;
                    anonymousClass1NYArr2[i] = anonymousClass1NY2;
                    i = i3;
                }
            }
            this.f17796B = anonymousClass1NYArr2;
        }
        return this.f17796B;
    }

    public final void close() {
        this.f17797C.close();
    }
}
