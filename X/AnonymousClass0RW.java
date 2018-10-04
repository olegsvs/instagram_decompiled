package X;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0164R;
import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

/* renamed from: X.0RW */
public final class AnonymousClass0RW {
    /* renamed from: B */
    public static void m4196B(Context context, String str, String str2, String str3, String str4, Uri uri, Intent intent) {
        if (str2 != null) {
            intent.setPackage(str2);
        }
        Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter(MemoryDumpUploadJob.EXTRA_USER_ID, str).appendQueryParameter("calling_package", context.getPackageName()).appendQueryParameter("entry_point", str4);
        if (str3 != null) {
            buildUpon.appendQueryParameter("attempt_id", str3);
        }
        intent.setData(buildUpon.build());
    }

    /* renamed from: C */
    public static Intent m4197C(Context context, String str, String str2, String str3, String str4, Uri uri) {
        Intent addFlags = new Intent().addFlags(268435456);
        AnonymousClass0RW.m4196B(context, str, str2, str3, str4, uri, addFlags);
        return addFlags;
    }

    /* renamed from: D */
    public static Uri m4198D(String str, String str2, List list, String str3, String str4, String str5) {
        Builder authority = new Builder().scheme(str).authority("direct_v2");
        if (str2 != null) {
            authority.appendQueryParameter("id", str2);
        }
        if (list != null) {
            try {
                String str6 = "recipients";
                AnonymousClass2F2 anonymousClass2F2 = new AnonymousClass2F2(list);
                Writer stringWriter = new StringWriter();
                JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
                createGenerator.writeStartObject();
                if (anonymousClass2F2.f27955B != null) {
                    createGenerator.writeFieldName(str6);
                    createGenerator.writeStartArray();
                    for (PendingRecipient pendingRecipient : anonymousClass2F2.f27955B) {
                        if (pendingRecipient != null) {
                            AnonymousClass1FN.m10350C(createGenerator, pendingRecipient, true);
                        }
                    }
                    createGenerator.writeEndArray();
                }
                createGenerator.writeEndObject();
                createGenerator.close();
                authority.appendQueryParameter(str6, stringWriter.toString());
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        if (str2 == null && list == null) {
            AnonymousClass0Gn.m1881H("DeeplinkingUtils", "both threadID and recipients are null.");
        }
        if (str4 != null) {
            authority.appendQueryParameter("t", str4);
        }
        if (str3 != null) {
            authority.appendQueryParameter("x", str3);
        }
        if (!TextUtils.isEmpty(str5)) {
            authority.appendQueryParameter("prefill_text", str5);
        }
        return authority.build();
    }

    /* renamed from: E */
    public static String m4199E(Uri uri) {
        return uri == null ? null : uri.getQueryParameter("attempt_id");
    }

    /* renamed from: F */
    public static Bundle m4200F(Context context) {
        int i;
        int i2;
        if (AnonymousClass0e8.m6200D(context)) {
            i = C0164R.anim.ig_deeplink_slide_in_from_left;
            i2 = C0164R.anim.ig_deeplink_slide_out_to_right;
        } else {
            i = C0164R.anim.ig_deeplink_slide_in_from_right;
            i2 = C0164R.anim.ig_deeplink_slide_out_to_left;
        }
        return ActivityOptions.makeCustomAnimation(context, i, i2).toBundle();
    }
}
