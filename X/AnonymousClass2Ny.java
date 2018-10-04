package X;

import android.view.inputmethod.EditorInfo;

/* renamed from: X.2Ny */
public final class AnonymousClass2Ny implements AnonymousClass1l3 {
    public final String[] IK(EditorInfo editorInfo) {
        String[] strArr = editorInfo.contentMimeTypes;
        return strArr != null ? strArr : AnonymousClass1l4.f22442B;
    }

    public final void RNA(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }
}
