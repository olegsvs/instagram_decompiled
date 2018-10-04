package X;

import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import com.facebook.C0164R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5xI */
public final class AnonymousClass5xI extends AnonymousClass0ay {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5xK f70282B;

    public AnonymousClass5xI(AnonymousClass5xK anonymousClass5xK) {
        this.f70282B = anonymousClass5xK;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object m28665A(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        List arrayList = new ArrayList();
        for (Uri path : listArr[0]) {
            arrayList.add(new File(path.getPath()));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AnonymousClass2NO.N(this.f70282B.f70286C));
        stringBuilder.append("/");
        stringBuilder.append(new SimpleDateFormat("'archive'_yyyyMMdd_HHmmss", Locale.US).format(new Date(System.nanoTime())));
        stringBuilder.append(".mp4");
        boolean z = AnonymousClass2NI.B(arrayList, new File(stringBuilder.toString()), false) > 0.0f;
        new AnonymousClass5xG(this.f70282B).B(new Void[0]);
        return Boolean.valueOf(z);
    }

    /* renamed from: D */
    public final /* bridge */ /* synthetic */ void m28666D(Object obj) {
        Boolean bool = (Boolean) obj;
        super.D(bool);
        if (bool.booleanValue()) {
            obj = this.f70282B;
            AnonymousClass5xE.m28661B(obj.f70285B, true, obj.f70290G);
            AnonymousClass0OR.D(new Handler(), new AnonymousClass5xF(obj), 1841294536);
            Toast.makeText(obj.f70286C, C0164R.string.reel_save_story_success, 0).show();
            return;
        }
        AnonymousClass5xK.m28668B(this.f70282B);
    }
}
