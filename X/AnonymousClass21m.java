package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.21m */
public final class AnonymousClass21m implements Runnable {
    /* renamed from: B */
    private final /* synthetic */ AnonymousClass21f f25331B;
    /* renamed from: C */
    private final /* synthetic */ AnonymousClass2TZ f25332C;

    public AnonymousClass21m(AnonymousClass2TZ anonymousClass2TZ, AnonymousClass21f anonymousClass21f) {
        this.f25332C = anonymousClass2TZ;
        this.f25331B = anonymousClass21f;
    }

    public final void run() {
        AnonymousClass21X anonymousClass21X = this.f25332C.f30803C;
        String[] strArr = (String[]) this.f25331B.f25320B.toArray(new String[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt(TraceFieldType.ErrorCode, 0);
        bundle.putStringArrayList("module_names", new ArrayList(Arrays.asList(strArr)));
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        anonymousClass21X.m14195B(AnonymousClass21g.m14203B(bundle));
    }
}
