package X;

import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: X.5f4 */
public final class AnonymousClass5f4 {
    /* renamed from: B */
    public int f67933B = 12;
    /* renamed from: C */
    public int f67934C = 16;
    /* renamed from: D */
    public final TreeSet f67935D = new TreeSet();
    /* renamed from: E */
    private final List f67936E = new ArrayList();
    /* renamed from: F */
    private final List f67937F = new ArrayList();

    /* renamed from: B */
    public static TreeSet m28206B(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new AnonymousClass5f5(String.valueOf(str2).concat(" cannot be null or empty"));
        }
        TreeSet treeSet = new TreeSet();
        for (char c : str.toCharArray()) {
            if (PasswordSpecification.m28210C(c, 32, 126)) {
                throw new AnonymousClass5f5(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
            }
            treeSet.add(Character.valueOf(c));
        }
        return treeSet;
    }

    /* renamed from: A */
    public final AnonymousClass5f4 m28207A(String str, int i) {
        this.f67936E.add(PasswordSpecification.m28209B(AnonymousClass5f4.m28206B(str, "requiredChars")));
        this.f67937F.add(Integer.valueOf(1));
        return this;
    }

    /* renamed from: B */
    public final PasswordSpecification m28208B() {
        if (this.f67935D.isEmpty()) {
            throw new AnonymousClass5f5("no allowed characters specified");
        }
        int i = 0;
        for (Integer intValue : this.f67937F) {
            i += intValue.intValue();
        }
        if (i <= this.f67934C) {
            boolean[] zArr = new boolean[95];
            for (String toCharArray : this.f67936E) {
                for (char c : toCharArray.toCharArray()) {
                    i = c - 32;
                    if (zArr[i]) {
                        StringBuilder stringBuilder = new StringBuilder(58);
                        stringBuilder.append("character ");
                        stringBuilder.append(c);
                        stringBuilder.append(" occurs in more than one required character set");
                        throw new AnonymousClass5f5(stringBuilder.toString());
                    }
                    zArr[i] = true;
                }
            }
            return new PasswordSpecification(1, PasswordSpecification.m28209B(this.f67935D), this.f67936E, this.f67937F, this.f67933B, this.f67934C);
        }
        throw new AnonymousClass5f5("required character count cannot be greater than the max password size");
    }
}
