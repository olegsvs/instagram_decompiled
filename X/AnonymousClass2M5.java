package X;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;

/* renamed from: X.2M5 */
public final class AnonymousClass2M5 {
    /* renamed from: B */
    public static boolean m15188B(EditText editText, AnonymousClass1Oc anonymousClass1Oc, int i) {
        Editable text = editText.getText();
        if (text.length() >= i) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd == 0 || !Character.isWhitespace(text.charAt(selectionEnd - 1))) {
                for (selectionEnd--; selectionEnd >= 0; selectionEnd--) {
                    if (AnonymousClass2M5.m15192F(text.charAt(selectionEnd), anonymousClass1Oc)) {
                        if (selectionEnd != 0) {
                            char charAt = text.charAt(selectionEnd - 1);
                            Object obj = (charAt >= '' || !Character.isLetterOrDigit(charAt)) ? null : 1;
                            if (obj == null) {
                            }
                        }
                        return true;
                    } else if (Character.isWhitespace(text.charAt(selectionEnd))) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static String m15189C(EditText editText, AnonymousClass1Oc anonymousClass1Oc) {
        String obj = editText.getText().toString();
        int selectionEnd = editText.getSelectionEnd() - 1;
        String str = null;
        if (selectionEnd >= obj.length()) {
            Integer.valueOf(selectionEnd);
            Integer.valueOf(obj.length());
            return null;
        }
        int selectionEnd2 = editText.getSelectionEnd();
        while (selectionEnd >= 0) {
            if (AnonymousClass2M5.m15192F(obj.charAt(selectionEnd), anonymousClass1Oc)) {
                break;
            } else if (Character.isWhitespace(obj.charAt(selectionEnd))) {
                break;
            } else {
                selectionEnd--;
            }
        }
        selectionEnd = -1;
        if (selectionEnd != -1) {
            str = obj.substring(selectionEnd, selectionEnd2);
        }
        return str;
    }

    /* renamed from: D */
    public static void m15190D(EditText editText, CharSequence charSequence, AnonymousClass1Oc anonymousClass1Oc) {
        Editable text = editText.getText();
        CharSequence stringBuilder = new StringBuilder(text.length());
        int E = AnonymousClass2M5.m15191E(editText, text, anonymousClass1Oc, AnonymousClass2M5.m15192F(charSequence.charAt(0), anonymousClass1Oc) ^ 1);
        stringBuilder.append(text);
        stringBuilder.delete(E, editText.getSelectionEnd());
        if (editText.getSelectionEnd() != text.length()) {
            if (Character.isWhitespace(text.charAt(editText.getSelectionEnd()))) {
                stringBuilder.insert(E, charSequence);
                editText.setText(stringBuilder);
                Selection.setSelection(editText.getText(), (E + charSequence.length()) + 1);
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(charSequence);
        stringBuilder2.append(" ");
        stringBuilder.insert(E, stringBuilder2.toString());
        editText.setText(stringBuilder);
        Selection.setSelection(editText.getText(), (E + charSequence.length()) + 1);
    }

    /* renamed from: E */
    private static int m15191E(EditText editText, Editable editable, AnonymousClass1Oc anonymousClass1Oc, boolean z) {
        for (editText = editText.getSelectionEnd() - 1; editText >= null; editText--) {
            if (AnonymousClass2M5.m15192F(editable.charAt(editText), anonymousClass1Oc)) {
                return editText + z;
            }
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: F */
    private static boolean m15192F(char r5, X.AnonymousClass1Oc r6) {
        /*
        r1 = X.AnonymousClass2M4.f29487B;
        r0 = r6.ordinal();
        r4 = r1[r0];
        r3 = 35;
        r2 = 64;
        r1 = 1;
        r0 = 0;
        switch(r4) {
            case 1: goto L_0x001c;
            case 2: goto L_0x0019;
            case 3: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        return r0;
    L_0x0012:
        if (r5 == r2) goto L_0x0018;
    L_0x0014:
        if (r5 != r3) goto L_0x0017;
    L_0x0016:
        goto L_0x0018;
    L_0x0017:
        r1 = 0;
    L_0x0018:
        return r1;
    L_0x0019:
        if (r5 != r3) goto L_0x0017;
    L_0x001b:
        goto L_0x0018;
    L_0x001c:
        if (r5 != r2) goto L_0x0017;
    L_0x001e:
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2M5.F(char, X.1Oc):boolean");
    }
}
