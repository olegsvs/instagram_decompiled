package X;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import java.util.regex.Pattern;

/* renamed from: X.1g3 */
public final class AnonymousClass1g3 {
    /* renamed from: B */
    public static void m12472B(TextView textView, String str, String str2, ClickableSpan clickableSpan) {
        textView.setText(AnonymousClass1g3.m12473C(str, new SpannableStringBuilder(str2), clickableSpan));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    /* renamed from: C */
    public static SpannableStringBuilder m12473C(String str, SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append(str);
        stringBuilder.append(")");
        str = Pattern.compile(stringBuilder.toString(), 2).matcher(spannableStringBuilder.toString());
        while (str.find()) {
            spannableStringBuilder.setSpan(clickableSpan, str.start(1), str.end(1), 33);
        }
        return spannableStringBuilder;
    }

    /* renamed from: D */
    public static SpannableStringBuilder m12474D(String str, String str2, Uri uri) {
        return AnonymousClass1g3.m12473C(str, new SpannableStringBuilder(str2), new AnonymousClass2K9(uri));
    }
}
