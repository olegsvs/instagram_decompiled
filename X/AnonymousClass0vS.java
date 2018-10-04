package X;

import android.view.ViewStub;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.0vS */
public final class AnonymousClass0vS {
    /* renamed from: B */
    public static void m8328B(AnonymousClass0vR anonymousClass0vR, List list) {
        if (list.isEmpty()) {
            AnonymousClass0vS.m8330D(anonymousClass0vR);
            return;
        }
        CharSequence stringBuilder = new StringBuilder();
        for (CharSequence charSequence : list) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(charSequence);
        }
        if (anonymousClass0vR.f12072C == null) {
            TextView textView = (TextView) anonymousClass0vR.f12073D.inflate();
            anonymousClass0vR.f12072C = textView;
            textView.getPaint().setFakeBoldText(true);
        }
        if (anonymousClass0vR.f12071B != 0) {
            AnonymousClass0Nm.m3444W(anonymousClass0vR.f12072C, anonymousClass0vR.f12071B);
        }
        anonymousClass0vR.f12072C.setText(stringBuilder);
        anonymousClass0vR.f12072C.setVisibility(0);
    }

    /* renamed from: C */
    public static AnonymousClass0vR m8329C(ViewStub viewStub) {
        return new AnonymousClass0vR(viewStub);
    }

    /* renamed from: D */
    public static void m8330D(AnonymousClass0vR anonymousClass0vR) {
        if (anonymousClass0vR.f12072C != null) {
            anonymousClass0vR.f12072C.setVisibility(8);
        }
    }
}
