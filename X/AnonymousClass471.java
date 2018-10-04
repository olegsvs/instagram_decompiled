package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.FilterWriter;
import java.io.Writer;

/* renamed from: X.471 */
public final class AnonymousClass471 extends FilterWriter {
    public AnonymousClass471(Writer writer) {
        super(writer);
    }

    /* renamed from: B */
    public static void m23273B(Writer writer, char c) {
        if (c == '\"' || c == '\\') {
            writer.write(92);
            writer.write(c);
            return;
        }
        switch (c) {
            case '\b':
                writer.write(92);
                writer.write(98);
                return;
            case '\t':
                writer.write(92);
                writer.write(ParserMinimalBase.INT_t);
                return;
            case '\n':
                writer.write(92);
                writer.write("n");
                return;
            default:
                switch (c) {
                    case '\f':
                        writer.write(92);
                        writer.write(ParserMinimalBase.INT_f);
                        return;
                    case ParserMinimalBase.INT_CR /*13*/:
                        writer.write(92);
                        writer.write(ParserMinimalBase.INT_r);
                        return;
                    default:
                        if (c > '\u001f' && c != ' ') {
                            if (c != ' ') {
                                writer.write(c);
                                return;
                            }
                        }
                        writer.write(String.format("\\u%04x", new Object[]{Integer.valueOf(c)}));
                        return;
                }
        }
    }

    public final void write(int i) {
        AnonymousClass471.m23273B(this.out, (char) i);
    }

    public final void write(String str, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            write(str.charAt(i3));
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            write(cArr[i3]);
        }
    }
}
