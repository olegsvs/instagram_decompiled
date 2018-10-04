package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.0R5 */
public enum AnonymousClass0R5 {
    CLICKED("clicked"),
    DISMISSED(DialogModule.ACTION_DISMISSED),
    SUPRESSED("supressed");
    
    /* renamed from: B */
    public final String f4594B;

    private AnonymousClass0R5(String str) {
        this.f4594B = str;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("videocall notification action type: ");
        stringBuilder.append(this.f4594B);
        return stringBuilder.toString();
    }
}
