package X;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: X.2O1 */
public final class AnonymousClass2O1 implements AnonymousClass1l5 {
    /* renamed from: B */
    private static String f29874B = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    /* renamed from: C */
    private static String f29875C = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    /* renamed from: D */
    private static String f29876D = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    /* renamed from: E */
    private static String f29877E = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    /* renamed from: F */
    private static String f29878F = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    /* renamed from: G */
    private static String f29879G = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    /* renamed from: H */
    private static String f29880H = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: B */
    public static boolean m15406B(String str, Bundle bundle, AnonymousClass1l8 anonymousClass1l8) {
        Throwable th;
        if (TextUtils.equals(f29874B, str)) {
            if (bundle != null) {
                ResultReceiver resultReceiver;
                try {
                    resultReceiver = (ResultReceiver) bundle.getParcelable(f29880H);
                    try {
                        Uri uri = (Uri) bundle.getParcelable(f29875C);
                        ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(f29876D);
                        Uri uri2 = (Uri) bundle.getParcelable(f29878F);
                        boolean Ch = anonymousClass1l8.Ch(new AnonymousClass1lB(uri, clipDescription, uri2), bundle.getInt(f29877E), (Bundle) bundle.getParcelable(f29879G));
                        if (resultReceiver != null) {
                            resultReceiver.send(Ch, null);
                        }
                        return Ch;
                    } catch (Throwable th2) {
                        th = th2;
                        if (resultReceiver != null) {
                            resultReceiver.send(0, null);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    resultReceiver = null;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            }
        }
        return false;
    }

    public final InputConnection BG(InputConnection inputConnection, EditorInfo editorInfo, AnonymousClass1l8 anonymousClass1l8) {
        if (AnonymousClass1l4.f22443C.IK(editorInfo).length == 0) {
            return inputConnection;
        }
        return new AnonymousClass1l7(this, inputConnection, false, anonymousClass1l8);
    }
}
