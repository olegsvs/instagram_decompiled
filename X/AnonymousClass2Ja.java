package X;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: X.2Ja */
public abstract class AnonymousClass2Ja {
    /* renamed from: B */
    public static InputConnection m15013B(InputConnection inputConnection, EditorInfo editorInfo, String[] strArr, AnonymousClass2JZ anonymousClass2JZ) {
        AnonymousClass1l4.f22443C.RNA(editorInfo, strArr);
        AnonymousClass1l8 anonymousClass2br = new AnonymousClass2br(anonymousClass2JZ);
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        } else if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        } else if (anonymousClass2br != null) {
            return AnonymousClass1l9.f22446B.BG(inputConnection, editorInfo, anonymousClass2br);
        } else {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        }
    }
}
