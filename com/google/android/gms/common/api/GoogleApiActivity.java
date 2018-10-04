package com.google.android.gms.common.api;

import X.AnonymousClass0cQ;
import X.AnonymousClass1En;
import X.AnonymousClass20K;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.ConnectionResult;

public class GoogleApiActivity extends Activity implements OnCancelListener {
    /* renamed from: B */
    private int f15973B = 0;

    /* renamed from: B */
    public static Intent m10287B(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f15973B = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                AnonymousClass20K B = AnonymousClass20K.B(this);
                switch (i2) {
                    case -1:
                        B.E();
                        break;
                    case 0:
                        B.C(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                        break;
                    default:
                        break;
                }
            }
        } else if (i == 2) {
            this.f15973B = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f15973B = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Activity activity = this;
        int B = AnonymousClass0cQ.m5852B(this, 717675665);
        super.onCreate(bundle);
        if (bundle != null) {
            this.f15973B = bundle.getInt("resolution");
        }
        if (this.f15973B != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                i = 1910397801;
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get(TraceFieldType.ErrorCode);
                if (pendingIntent == null && num == null) {
                    Log.e("GoogleApiActivity", "Activity started without resolution");
                    finish();
                    i = 1256905274;
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        activity.f15973B = 1;
                        i = -695541485;
                    } catch (Throwable e) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        finish();
                        i = -1185611661;
                    }
                } else {
                    AnonymousClass1En.f15943B.m10239E(this, num.intValue(), 2, this);
                    this.f15973B = 1;
                }
            }
            AnonymousClass0cQ.m5853C(activity, i, B);
        }
        i = 573847665;
        AnonymousClass0cQ.m5853C(activity, i, B);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f15973B);
        super.onSaveInstanceState(bundle);
    }
}
