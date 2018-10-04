package X;

import android.text.Editable;
import android.widget.EditText;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Uy */
public final class AnonymousClass1Uy extends AnonymousClass2KI {
    /* renamed from: D */
    public static Pattern f19256D = Pattern.compile("\\A\\s+", 8);
    /* renamed from: E */
    public static Pattern f19257E = Pattern.compile("\\s+\\Z", 8);
    /* renamed from: B */
    private EditText f19258B;
    /* renamed from: C */
    private AnonymousClass2KK f19259C;

    public AnonymousClass1Uy(EditText editText, AnonymousClass2KK anonymousClass2KK) {
        this.f19258B = editText;
        this.f19259C = anonymousClass2KK;
    }

    /* renamed from: B */
    private boolean m11644B(CharSequence charSequence) {
        Matcher matcher = f19256D.matcher(charSequence);
        if (!matcher.find()) {
            return false;
        }
        int selectionStart = this.f19258B.getSelectionStart() - matcher.group(0).length();
        this.f19258B.setText(matcher.replaceFirst(JsonProperty.USE_DEFAULT_NAME));
        this.f19258B.setSelection(Math.max(selectionStart, 0));
        return true;
    }

    /* renamed from: C */
    private boolean m11645C(CharSequence charSequence) {
        Matcher matcher = f19257E.matcher(charSequence);
        if (!matcher.find()) {
            return false;
        }
        int selectionStart = this.f19258B.getSelectionStart();
        this.f19258B.setText(matcher.replaceFirst(JsonProperty.USE_DEFAULT_NAME));
        EditText editText = this.f19258B;
        editText.setSelection(Math.min(selectionStart, editText.length()));
        return true;
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.f19259C.ordinal()) {
            case 0:
                m11644B(editable);
                return;
            case 1:
                break;
            case 2:
                if (m11644B(editable)) {
                    m11645C(this.f19258B.getText());
                    return;
                }
                break;
            default:
                return;
        }
        m11645C(editable);
    }
}
