package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: X.30l */
public final class AnonymousClass30l implements TextWatcher {
    /* renamed from: B */
    public String f36858B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass30o f36859C;
    /* renamed from: D */
    public final /* synthetic */ EditText f36860D;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass30l(EditText editText, AnonymousClass30o anonymousClass30o) {
        this.f36860D = editText;
        this.f36859C = anonymousClass30o;
    }

    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        if (!this.f36858B.equals(trim)) {
            if (Character.codePointCount(trim, 0, trim.length()) > 16) {
                trim = this.f36858B;
                this.f36860D.setText(trim);
                EditText editText = this.f36860D;
                editText.setSelection(editText.getText().length());
            }
            AnonymousClass30o anonymousClass30o = this.f36859C;
            if (anonymousClass30o != null) {
                anonymousClass30o.JC(trim);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f36858B = charSequence.toString();
    }
}
