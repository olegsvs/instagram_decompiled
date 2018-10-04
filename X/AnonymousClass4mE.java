package X;

import android.app.Activity;
import android.media.MediaRecorder;
import android.os.Message;
import java.io.IOException;

/* renamed from: X.4mE */
public final class AnonymousClass4mE implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5X7 f57128B;

    public AnonymousClass4mE(AnonymousClass5X7 anonymousClass5X7) {
        this.f57128B = anonymousClass5X7;
    }

    public final void run() {
        if (this.f57128B.f65758I) {
            AnonymousClass5X7 anonymousClass5X7 = this.f57128B;
            if (AnonymousClass1Ba.D(anonymousClass5X7.f65751B, "android.permission.RECORD_AUDIO")) {
                anonymousClass5X7.f65757H = true;
                anonymousClass5X7.f65762M.A().setVisibility(0);
                AnonymousClass5X7.m27362B(anonymousClass5X7);
                AnonymousClass4mL anonymousClass4mL = anonymousClass5X7.f65768S;
                anonymousClass4mL.f57137C = new AnonymousClass4mN(anonymousClass4mL.f57136B);
                MediaRecorder mediaRecorder = new MediaRecorder();
                anonymousClass4mL.f57139E = mediaRecorder;
                mediaRecorder.setAudioSource(1);
                anonymousClass4mL.f57139E.setOutputFormat(2);
                anonymousClass4mL.f57139E.setOutputFile(anonymousClass4mL.f57137C.f57148B);
                anonymousClass4mL.f57139E.setAudioEncoder(3);
                try {
                    anonymousClass4mL.f57139E.prepare();
                } catch (IOException e) {
                    AnonymousClass0Dc.H("VoiceRecordController", "Record prepare() failed %s", new Object[]{e.getLocalizedMessage()});
                }
                anonymousClass4mL.f57139E.start();
                anonymousClass4mL.f57140F.f62166C.sendMessage(Message.obtain());
                return;
            }
            AnonymousClass1Ba.H((Activity) AnonymousClass0T1.B(anonymousClass5X7.f65751B, Activity.class), new AnonymousClass4mJ(anonymousClass5X7), new String[]{"android.permission.RECORD_AUDIO"});
        }
    }
}
