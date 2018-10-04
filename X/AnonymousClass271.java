package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.analytics.appstatelogger.AppStateLogger;
import java.util.List;

/* renamed from: X.271 */
public final class AnonymousClass271 {
    /* renamed from: B */
    public static final String f26083B = "IgAppStateLogger";

    /* renamed from: B */
    public static boolean m14478B(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        if (!AppStateLogger.m13345D()) {
            return false;
        }
        AnonymousClass2V9 anonymousClass2V9 = new AnonymousClass2V9(anonymousClass0Cm);
        AnonymousClass0Db.F(context, "android_foreground_app_death_logging", anonymousClass2V9.m16102B());
        AnonymousClass0Db.F(context, "android_background_app_death_logging", anonymousClass2V9.m16101A());
        AnonymousClass0Db.F(context, "app_state_file_writing_non_critical_writes_lower_priority", true);
        AnonymousClass0Db.F(context, "app_state_log_anr_recovered_state_enabled", true);
        AnonymousClass0Db.G(context, "app_state_file_writing_maximim_time_between_writes_forground_ms", 30000);
        AnonymousClass1oq B = AppStateLogger.m13343B();
        if (B != null) {
            AnonymousClass2V8 anonymousClass2V8 = new AnonymousClass2V8();
            synchronized (B) {
                List list = null;
                if (anonymousClass2V8 == null) {
                    B.f23036D = 0;
                    B.f23034B = null;
                } else {
                    B.f23035C = anonymousClass2V8;
                    List list2 = B.f23034B;
                    B.f23034B = null;
                    list = list2;
                }
            }
            if (r1 != null) {
                for (Pair pair : r1) {
                    String str = (String) pair.first;
                    Throwable th = (Throwable) pair.second;
                    if (th != null) {
                        AnonymousClass0Gn.E(f26083B, str, th);
                    } else {
                        AnonymousClass0Gn.C(f26083B, str);
                    }
                }
            }
        } else {
            AnonymousClass0Dc.F(f26083B, "AppStateErrorLogger is null");
        }
        try {
            new AnonymousClass274(context, new AnonymousClass1ow(), anonymousClass2V9).m14487A();
            return true;
        } catch (Throwable e) {
            AnonymousClass0Gn.E(f26083B, "Unable to create parser", e);
            return false;
        }
    }
}
