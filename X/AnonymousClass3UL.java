package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.3UL */
public final class AnonymousClass3UL implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ Context f41596B;
    /* renamed from: C */
    public final /* synthetic */ double f41597C;
    /* renamed from: D */
    public final /* synthetic */ double f41598D;

    public AnonymousClass3UL(Context context, double d, double d2) {
        this.f41596B = context;
        this.f41597C = d;
        this.f41598D = d2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                dialogInterface.dismiss();
                return;
            case -1:
                Context context = this.f41596B;
                dialogInterface = this.f41597C;
                double d = this.f41598D;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(dialogInterface);
                stringBuilder.append(", ");
                stringBuilder.append(d);
                String encode = Uri.encode(stringBuilder.toString());
                Intent flags = new Intent("android.intent.action.VIEW").setFlags(268435456);
                stringBuilder = new StringBuilder();
                stringBuilder.append("geo:0,0?q=");
                stringBuilder.append(encode);
                flags = flags.setData(Uri.parse(stringBuilder.toString()));
                if (context.getPackageManager().queryIntentActivities(flags, 65536).isEmpty()) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("http://maps.google.com/maps?q=");
                    stringBuilder.append(encode);
                    flags.setData(Uri.parse(stringBuilder.toString()));
                }
                AnonymousClass0IW.Q(flags, context);
                return;
            default:
                return;
        }
    }
}
