package X;

import java.io.File;

/* renamed from: X.5RG */
public final class AnonymousClass5RG extends AnonymousClass46N {
    /* renamed from: B */
    public static AnonymousClass46N f63386B;

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ AnonymousClass46M m26512A(Object obj) {
        File file = (File) obj;
        try {
            return new AnonymousClass5RF(this, file);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected error, failed to create file: ");
            stringBuilder.append(file);
            throw new AnonymousClass46Q(stringBuilder.toString(), e);
        }
    }
}
