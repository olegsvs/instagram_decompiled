package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4zI */
public final class AnonymousClass4zI extends AnonymousClass0TM implements AnonymousClass0IS, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass1P7 f59095B;
    /* renamed from: C */
    public boolean f59096C;
    /* renamed from: D */
    public boolean f59097D;
    /* renamed from: E */
    public boolean f59098E = false;
    /* renamed from: F */
    public final AnonymousClass0Iw f59099F = new AnonymousClass4zF(this);
    /* renamed from: G */
    public Dialog f59100G;

    public final String getModuleName() {
        return "backup_codes";
    }

    /* renamed from: B */
    public static boolean m25524B(X.AnonymousClass4zI r5, android.graphics.Bitmap r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = new java.io.File;
        r0 = android.os.Environment.DIRECTORY_PICTURES;
        r1 = android.os.Environment.getExternalStoragePublicDirectory(r0);
        r0 = "ig_backup_code.jpg";
        r4.<init>(r1, r0);
        r3 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x003b }
        r2.<init>(r4);	 Catch:{ IOException -> 0x003b }
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ IOException -> 0x003b }
        r0 = 100;	 Catch:{ IOException -> 0x003b }
        r6.compress(r1, r0, r2);	 Catch:{ IOException -> 0x003b }
        r2.flush();	 Catch:{ IOException -> 0x003b }
        X.AnonymousClass0Du.B(r2, r3);	 Catch:{ IOException -> 0x003b }
        r1 = new android.content.Intent;
        r0 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
        r1.<init>(r0);
        r0 = android.net.Uri.fromFile(r4);
        r1.setData(r0);
        r0 = r5.getActivity();
        r0 = r0.getBaseContext();
        r0.sendBroadcast(r1);
        r0 = 1;
        return r0;
    L_0x003b:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.4zI.B(X.4zI, android.graphics.Bitmap):boolean");
    }

    /* renamed from: C */
    public static List m25525C(AnonymousClass4zI anonymousClass4zI) {
        List arrayList = new ArrayList();
        if (anonymousClass4zI.getArguments() != null) {
            ArrayList stringArrayList = anonymousClass4zI.getArguments().getStringArrayList("backup_codes_key");
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new AnonymousClass2bo((String) stringArrayList.get(i)));
            }
            arrayList.add(new AnonymousClass2bo(C0164R.string.backup_codes_gen_code, new AnonymousClass4zC(anonymousClass4zI)));
            arrayList.add(new AnonymousClass2JP(anonymousClass4zI.getString(C0164R.string.backup_codes_get_code_description)));
            arrayList.add(new AnonymousClass2bo(C0164R.string.backup_codes_copy_to_clipboard, new AnonymousClass4zD(anonymousClass4zI, stringArrayList)));
            arrayList.add(new AnonymousClass2bo(C0164R.string.backup_codes_take_screenshot, new AnonymousClass4zE(anonymousClass4zI)));
            arrayList.add(new AnonymousClass2JP(anonymousClass4zI.getString(C0164R.string.backup_codes_support_text)));
        }
        return arrayList;
    }

    /* renamed from: D */
    public static void m25526D(AnonymousClass4zI anonymousClass4zI) {
        Context activity = anonymousClass4zI.getActivity().getParent() == null ? anonymousClass4zI.getActivity() : anonymousClass4zI.getActivity().getParent();
        if (AnonymousClass1Ba.D(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            anonymousClass4zI.f59097D = true;
            AnonymousClass0eT.D(AnonymousClass0eT.E(anonymousClass4zI.getActivity()));
            View listView = anonymousClass4zI.getListView();
            listView.setBackground(new ColorDrawable(-1));
            listView.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(listView.getDrawingCache());
            listView.setDrawingCacheEnabled(false);
            listView.setBackground(null);
            AnonymousClass0Ix.D(new AnonymousClass4zH(anonymousClass4zI, createBitmap));
            return;
        }
        AnonymousClass1Ba.H(activity, new AnonymousClass4zG(anonymousClass4zI), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* renamed from: E */
    private void m25527E(int i) {
        if (getRootActivity() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) getRootActivity()).CSA(i);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.backup_codes_header);
        anonymousClass0eT.n(true);
        anonymousClass0eT.m(this.f59097D, null);
        anonymousClass0eT.Y(this.f59097D);
    }

    public final boolean onBackPressed() {
        if (!this.f59096C) {
            return false;
        }
        getFragmentManager().Q(null, 1);
        this.f59096C = false;
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass1P7 anonymousClass1P7;
        int F = AnonymousClass0cQ.F(this, 159627732);
        if (getArguments() == null) {
            anonymousClass1P7 = AnonymousClass1P7.ARGUMENT_DEFAULT_FLOW;
        } else {
            anonymousClass1P7 = AnonymousClass1P7.B(getArguments());
        }
        this.f59095B = anonymousClass1P7;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0cQ.G(this, -1132496796, F);
        return onCreateView;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -959580197);
        super.onPause();
        m25527E(0);
        AnonymousClass0cQ.G(this, -1855505953, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 203759027);
        super.onResume();
        setItems(AnonymousClass4zI.m25525C(this));
        if (!(AnonymousClass1P7.ARGUMENT_TWOFAC_FLOW != this.f59095B || AnonymousClass0FH.f2099C.f2100B.getBoolean("has_backup_codes", false) || this.f59098E)) {
            this.f59096C = true;
            if (this.f59100G == null) {
                this.f59100G = new AnonymousClass0Sb(getContext()).Q(C0164R.string.two_fac_screenshot_dialog_title).H(C0164R.string.two_fac_screenshot_dialog_body).O(C0164R.string.ok, new AnonymousClass4zB(this)).L(C0164R.string.cancel, new AnonymousClass4zA(this)).C();
            }
            this.f59100G.show();
        }
        m25527E(8);
        AnonymousClass0cQ.G(this, 1149290457, F);
    }
}
