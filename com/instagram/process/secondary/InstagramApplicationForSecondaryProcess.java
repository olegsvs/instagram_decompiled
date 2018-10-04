package com.instagram.process.secondary;

import X.AnonymousClass0CB;
import X.AnonymousClass0CF;
import X.AnonymousClass0CH;
import X.AnonymousClass0Dc;
import X.AnonymousClass1qc;
import android.content.Context;
import com.facebook.breakpad.BreakpadManager;
import java.io.File;

public class InstagramApplicationForSecondaryProcess extends AnonymousClass0CH {
    private final Class TAG = InstagramApplicationForSecondaryProcess.class;
    private final Context mContext;

    public InstagramApplicationForSecondaryProcess(Context context) {
        this.mContext = context;
    }

    public Object getAppService(Class cls) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown service type ");
        stringBuilder.append(cls);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public File getCacheDir(File file) {
        return AnonymousClass1qc.B(file);
    }

    public String getDir(String str, int i) {
        return AnonymousClass1qc.C(str);
    }

    public void onCreate(String str, long j, long j2) {
        super.onCreate(str, j, j2);
        if (str == null || str.isEmpty()) {
            throw new IllegalStateException("Can't find current process's name");
        }
        AnonymousClass0Dc.K(AnonymousClass0CB.J() ? 6 : 2);
        AnonymousClass0CF.C(this.mContext, AnonymousClass0CB.H());
        try {
            AnonymousClass0CF.E("gnustl_shared");
            BreakpadManager.start(this.mContext);
        } catch (Throwable th) {
            AnonymousClass0Dc.C(this.TAG, "Can't load breakpad", th);
        }
    }
}
