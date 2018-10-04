package X;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.widget.EditText;

/* renamed from: X.4QY */
public final class AnonymousClass4QY implements AnonymousClass3dy {
    /* renamed from: B */
    public final AnonymousClass5TZ f53944B;
    /* renamed from: C */
    public EditText f53945C;
    /* renamed from: D */
    public final AnonymousClass3e5 f53946D = new AnonymousClass41j();
    /* renamed from: E */
    private final AnonymousClass3e0 f53947E;
    /* renamed from: F */
    private final AnonymousClass0Cm f53948F;

    public final void Ax(String str, AnonymousClass0Q6 anonymousClass0Q6) {
    }

    public final void Fx(String str) {
    }

    public final void Lx(String str) {
    }

    public AnonymousClass4QY(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5TZ anonymousClass5TZ) {
        this.f53948F = anonymousClass0Cm;
        this.f53944B = anonymousClass5TZ;
        AnonymousClass3e0 anonymousClass3e0 = new AnonymousClass3e0(null, this.f53946D);
        this.f53947E = anonymousClass3e0;
        anonymousClass3e0.f42947D = this;
    }

    /* renamed from: A */
    public final void m24187A(EditText editText, int i, int i2) {
        this.f53945C = editText;
        String B = AnonymousClass4QY.m24186B(editText);
        if (B != null) {
            int i3 = 0;
            if (AnonymousClass2CG.m14642C(B) && B.charAt(0) == '#') {
                i3 = 1;
            }
            if (i3 != 0) {
                this.f53947E.m20288C(B);
            }
        }
    }

    /* renamed from: B */
    public static String m24186B(EditText editText) {
        if (editText == null) {
            return null;
        }
        CharSequence subSequence;
        Editable text = editText.getText();
        int selectionEnd = Selection.getSelectionEnd(text) - 1;
        int i = selectionEnd;
        while (i >= 0) {
            if (text.charAt(i) == ' ') {
                break;
            } else if (text.charAt(i) != '#') {
                i--;
            } else if (i != selectionEnd) {
                subSequence = text.subSequence(i, selectionEnd + 1);
                if (subSequence != null) {
                    return null;
                }
                return subSequence.toString();
            }
        }
        subSequence = null;
        if (subSequence != null) {
            return subSequence.toString();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void Qx(String str, AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass3dm anonymousClass3dm = (AnonymousClass3dm) anonymousClass0Pn;
        CharSequence B = AnonymousClass4QY.m24186B(this.f53945C);
        if (!anonymousClass3dm.VN().isEmpty() && !TextUtils.isEmpty(B) && str.equals(B)) {
            AnonymousClass5TZ anonymousClass5TZ = this.f53944B;
            anonymousClass5TZ.f64499B.m24185P(anonymousClass3dm.VN());
        }
    }

    public final AnonymousClass0Iu tF(String str) {
        return AnonymousClass3de.m20265C(this.f53948F, str.substring(1), null);
    }
}
