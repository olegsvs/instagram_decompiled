package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4fr */
public final class AnonymousClass4fr {
    /* renamed from: B */
    public static String m24714B(String str) {
        str = AnonymousClass0IE.O(str);
        return str.find() ? str.group(1).substring(1) : null;
    }

    /* renamed from: C */
    public static void m24715C(Context context, TextView textView, String str, boolean z) {
        Drawable background;
        if (AnonymousClass0IE.D().matcher(str).matches()) {
            background = textView.getBackground();
            if (background != null) {
                background.setAlpha(z ? 255 : 0);
            }
            textView.setTextSize(0, (float) context.getResources().getDimensionPixelSize(C0164R.dimen.direct_row_message_emoji_text_size));
            textView.setLineSpacing((float) context.getResources().getDimensionPixelSize(C0164R.dimen.direct_row_message_emoji_text_spacing), 1.0f);
            AnonymousClass4fr.m24716D(context, textView, z);
        } else {
            background = textView.getBackground();
            if (background != null) {
                background.setAlpha(225);
            }
            textView.setTextSize(0, (float) context.getResources().getDimensionPixelSize(C0164R.dimen.direct_row_message_comment_text_size));
            textView.setLineSpacing(0.0f, 1.0f);
            AnonymousClass4fr.m24716D(context, textView, true);
        }
        textView.setText(str);
    }

    /* renamed from: D */
    public static void m24716D(Context context, TextView textView, boolean z) {
        if (z) {
            context = context.getResources();
            textView.setPadding(context.getDimensionPixelSize(C0164R.dimen.direct_row_message_content_horizontal_padding), context.getDimensionPixelSize(C0164R.dimen.direct_row_message_content_vertical_padding), context.getDimensionPixelSize(C0164R.dimen.direct_row_message_content_horizontal_padding), context.getDimensionPixelSize(C0164R.dimen.direct_row_message_content_vertical_padding));
            return;
        }
        textView.setPadding(0, 0, 0, 0);
    }
}
