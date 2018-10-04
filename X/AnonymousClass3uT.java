package X;

/* renamed from: X.3uT */
public final class AnonymousClass3uT extends AnonymousClass2qk {
    public AnonymousClass3uT(AnonymousClass2sN[] anonymousClass2sNArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("None of the available extractors (");
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < anonymousClass2sNArr.length; i++) {
            stringBuilder2.append(anonymousClass2sNArr[i].getClass().getSimpleName());
            if (i < anonymousClass2sNArr.length - 1) {
                stringBuilder2.append(", ");
            }
        }
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append(") could read the stream.");
        super(stringBuilder.toString());
    }
}
