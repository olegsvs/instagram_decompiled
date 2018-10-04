package X;

/* renamed from: X.2ui */
public final class AnonymousClass2ui extends Exception {
    public AnonymousClass2ui(int i, int i2, int i3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unhandled format: ");
        stringBuilder.append(i);
        stringBuilder.append(" Hz, ");
        stringBuilder.append(i2);
        stringBuilder.append(" channels in encoding ");
        stringBuilder.append(i3);
        super(stringBuilder.toString());
    }
}
