package com.instagram.debug.sandbox;

import X.AnonymousClass0FZ;
import X.AnonymousClass0Hh;
import X.AnonymousClass0IG;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Sb;
import X.AnonymousClass0fz;
import X.AnonymousClass0gV;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;
import java.util.Locale;

public class SandboxUtil {

    /* renamed from: com.instagram.debug.sandbox.SandboxUtil$1 */
    public final class C01211 implements OnClickListener {
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ AnonymousClass0FZ val$devPreferences;
        public final /* synthetic */ ViewGroup val$view;

        public C01211(ViewGroup viewGroup, AnonymousClass0FZ anonymousClass0FZ, Activity activity) {
            this.val$view = viewGroup;
            this.val$devPreferences = anonymousClass0FZ;
            this.val$activity = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            EditText editText = (EditText) this.val$view.findViewById(C0164R.id.dev_server);
            Object toLowerCase = editText.getText().toString().trim().toLowerCase(Locale.US);
            if (TextUtils.isEmpty(toLowerCase)) {
                this.val$devPreferences.V(false);
            } else {
                this.val$devPreferences.V(true);
                this.val$devPreferences.f2177B.edit().putString("dev_server_name", AnonymousClass0fz.D(toLowerCase)).apply();
            }
            Activity activity = this.val$activity;
            if (activity instanceof AnonymousClass0Hh) {
                ((AnonymousClass0Hh) activity).ji();
            }
            String toLowerCase2 = ((EditText) this.val$view.findViewById(C0164R.id.dev_mqtt_server)).getText().toString().trim().toLowerCase(Locale.US);
            if (TextUtils.isEmpty(toLowerCase2)) {
                this.val$devPreferences.W(false);
            } else {
                this.val$devPreferences.W(true);
                if (toLowerCase2.contains(JsonProperty.USE_DEFAULT_NAME)) {
                    this.val$devPreferences.P(toLowerCase2);
                } else {
                    AnonymousClass0FZ anonymousClass0FZ = this.val$devPreferences;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(toLowerCase2);
                    stringBuilder.append(".sb.facebook.com:8883");
                    anonymousClass0FZ.P(stringBuilder.toString());
                }
            }
            AnonymousClass0Nm.N(editText);
            AnonymousClass0IG.I(this.val$activity.getString(C0164R.string.dev_hosts_set_to, new Object[]{AnonymousClass0fz.C(), RealtimeClientManager.getLatestMqttHost(AnonymousClass0gV.B(null))}));
            dialogInterface.dismiss();
        }
    }

    public static Dialog getSandboxDialog(Activity activity, List list) {
        AnonymousClass0FZ B = AnonymousClass0FZ.B();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(C0164R.layout.layout_dev_host_options, null, false);
        EditText editText = (EditText) viewGroup.findViewById(C0164R.id.dev_server);
        if (B.N()) {
            editText.setText(B.A());
        }
        if (list != null) {
            for (View addView : list) {
                viewGroup.addView(addView);
            }
        }
        return new AnonymousClass0Sb(activity).Q(C0164R.string.dev_choose_hosts).T(viewGroup).E(true).O(C0164R.string.done, new C01211(viewGroup, B, activity)).C();
    }
}
