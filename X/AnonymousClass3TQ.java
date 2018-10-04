package X;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.3TQ */
public final class AnonymousClass3TQ implements TextWatcher {
    /* renamed from: B */
    private final EditText f41510B;
    /* renamed from: C */
    private boolean f41511C;
    /* renamed from: D */
    private final AnonymousClass1PK f41512D;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass3TQ(EditText editText, AnonymousClass1PK anonymousClass1PK) {
        this.f41510B = editText;
        this.f41512D = anonymousClass1PK;
    }

    /* renamed from: A */
    public final String m19707A() {
        return this.f41510B.getText().toString().replaceAll("\\D+", JsonProperty.USE_DEFAULT_NAME);
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.f41511C) {
            CharSequence charSequence = JsonProperty.USE_DEFAULT_NAME;
            String replaceAll = editable.toString().replaceAll("\\D+", charSequence);
            int length = replaceAll.length();
            boolean z = true;
            this.f41511C = true;
            if (length == 0) {
                this.f41510B.setText(charSequence);
            } else {
                int i;
                int length2 = this.f41510B.getHint().length();
                StringBuilder stringBuilder = new StringBuilder(length2);
                int i2 = 6 - length;
                for (i = 0; i < i2; i++) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(replaceAll);
                    stringBuilder2.append('#');
                    replaceAll = stringBuilder2.toString();
                }
                i = 0;
                for (int i3 = 0; i3 < replaceAll.length(); i3++) {
                    if (Character.isDigit(replaceAll.charAt(i3))) {
                        i += 2;
                    }
                    stringBuilder.append(replaceAll.charAt(i3));
                    stringBuilder.append(" ");
                    if (i3 == 2) {
                        if (Character.isDigit(replaceAll.charAt(i3))) {
                            i += 2;
                        }
                        stringBuilder.append("   ");
                    }
                }
                CharSequence spannableString = new SpannableString(stringBuilder.toString().trim());
                spannableString.setSpan(new ForegroundColorSpan(this.f41510B.getCurrentHintTextColor()), i, spannableString.length(), 33);
                this.f41510B.setText(spannableString);
                if (length <= 3) {
                    this.f41510B.setSelection(Math.max((length * 2) - 1, 0));
                } else {
                    this.f41510B.setSelection(Math.min((length + 1) * 2, length2));
                }
            }
            this.f41511C = false;
            AnonymousClass1PK anonymousClass1PK = this.f41512D;
            if (anonymousClass1PK != null) {
                if (m19707A().length() != 6) {
                    z = false;
                }
                anonymousClass1PK.f(z);
            }
        }
    }
}
