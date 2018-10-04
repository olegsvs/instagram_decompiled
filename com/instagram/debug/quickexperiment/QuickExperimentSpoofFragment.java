package com.instagram.debug.quickexperiment;

import X.AnonymousClass09i;
import X.AnonymousClass0CQ;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dc;
import X.AnonymousClass0FZ;
import X.AnonymousClass0IT;
import X.AnonymousClass0M7;
import X.AnonymousClass0TM;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass2IX;
import X.AnonymousClass2Id;
import X.AnonymousClass2Ie;
import X.AnonymousClass2If;
import X.AnonymousClass2Io;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QuickExperimentSpoofFragment extends AnonymousClass0TM implements AnonymousClass0IT {
    private final AnonymousClass2Id mEditDelegate = new C00282();
    public final AnonymousClass09i mSpoofOverlayDelegate = new C00383();
    private final OnEditorActionListener mTextDelegate = new C00271();

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment$1 */
    public class C00271 implements OnEditorActionListener {
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment$2 */
    public class C00282 implements AnonymousClass2Id {
        public void onTextChanged(String str) {
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment$5 */
    public class C00305 implements OnClickListener {
        public void onClick(View view) {
            int M = AnonymousClass0cQ.m5863M(this, 2050375452);
            QuickExperimentDebugStore userSpoofStore = QuickExperimentDebugStoreManager.getUserSpoofStore(QuickExperimentSpoofFragment.this.getActivity().getFilesDir());
            if (userSpoofStore != null) {
                userSpoofStore.removeAll();
            }
            AnonymousClass0FZ.m1634B().m1655U(null);
            if (QuickExperimentSpoofFragment.this.getActivity() != null) {
                ((BaseFragmentActivity) QuickExperimentSpoofFragment.this.getActivity()).m2089U();
            }
            AnonymousClass0cQ.m5862L(this, 685853219, M);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment$7 */
    public class C00327 implements OnClickListener {
        public void onClick(View view) {
            int M = AnonymousClass0cQ.m5863M(this, 479793891);
            QuickExperimentDebugStore deviceSpoofStore = QuickExperimentDebugStoreManager.getDeviceSpoofStore(QuickExperimentSpoofFragment.this.getActivity().getFilesDir());
            if (deviceSpoofStore != null) {
                deviceSpoofStore.removeAll();
            }
            AnonymousClass0FZ.m1634B().m1651Q(null);
            if (QuickExperimentSpoofFragment.this.getActivity() != null) {
                ((BaseFragmentActivity) QuickExperimentSpoofFragment.this.getActivity()).m2089U();
            }
            AnonymousClass0cQ.m5862L(this, 50143147, M);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment$3 */
    public class C00383 implements AnonymousClass09i {
        public void onOperationStart() {
            if (QuickExperimentSpoofFragment.this.getActivity() != null) {
                ((BaseFragmentActivity) QuickExperimentSpoofFragment.this.getActivity()).m2089U();
            }
        }
    }

    public String getModuleName() {
        return "QuickExperimentSpoofFragment";
    }

    public void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.m6352a("Spoof menu");
    }

    private List getDeviceSpoofOptions() {
        List arrayList = new ArrayList();
        final AnonymousClass0Cm G = AnonymousClass0Ce.m950G(getArguments());
        final AnonymousClass0FZ B = AnonymousClass0FZ.m1634B();
        arrayList.add(new AnonymousClass2If("Device Spoof"));
        String G2 = B.m1641G();
        String str = "Enter spoofed device's id";
        if (G2 == null) {
            G2 = JsonProperty.USE_DEFAULT_NAME;
        }
        final AnonymousClass2Ie anonymousClass2Ie = new AnonymousClass2Ie(str, G2, this.mEditDelegate, this.mTextDelegate, Integer.valueOf(524288), true);
        OnClickListener c00316 = new OnClickListener() {
            public void onClick(View view) {
                int M = AnonymousClass0cQ.m5863M(this, 1957219772);
                if (B.m1637C()) {
                    Context activity = QuickExperimentSpoofFragment.this.getActivity();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Already Spoofing on ");
                    stringBuilder.append(B.m1641G());
                    stringBuilder.append(". Clear spoof before spoofing again.");
                    Toast.makeText(activity, stringBuilder.toString(), 0).show();
                } else {
                    AnonymousClass0M7 anonymousClass0M7 = AnonymousClass0M7.f3347C;
                    if (anonymousClass0M7 != null) {
                        String str = anonymousClass2Ie.f28714B;
                        anonymousClass0M7.f3348B = QuickExperimentSpoofFragment.this.mSpoofOverlayDelegate;
                        anonymousClass0M7.mo865L(AnonymousClass0CQ.Device, G, str);
                    } else {
                        AnonymousClass0Dc.m1243F(QuickExperimentSpoofFragment.this.getModuleName(), "QuickExperimentManagerFactory is null");
                    }
                }
                AnonymousClass0cQ.m5862L(this, 766395888, M);
            }
        };
        OnClickListener c00327 = new C00327();
        AnonymousClass2IX anonymousClass2IX = new AnonymousClass2IX(C0164R.string.spoof_qe_device, c00316, C0164R.color.grey_8, 0.8f);
        AnonymousClass2IX anonymousClass2IX2 = new AnonymousClass2IX(C0164R.string.clear_qe_device_spoof, c00327, C0164R.color.grey_8, 0.8f);
        arrayList.add(anonymousClass2Ie);
        arrayList.add(anonymousClass2IX);
        arrayList.add(anonymousClass2IX2);
        return arrayList;
    }

    private List getUserSpoofOptions() {
        List arrayList = new ArrayList();
        final AnonymousClass0Cm G = AnonymousClass0Ce.m950G(getArguments());
        final AnonymousClass0FZ B = AnonymousClass0FZ.m1634B();
        String I = B.m1643I();
        arrayList.add(new AnonymousClass2If("User Spoof"));
        String str = "Enter spoofed user's IGID";
        if (I == null) {
            I = JsonProperty.USE_DEFAULT_NAME;
        }
        final AnonymousClass2Ie anonymousClass2Ie = new AnonymousClass2Ie(str, I, this.mEditDelegate, this.mTextDelegate, Integer.valueOf(2), true);
        OnClickListener c00294 = new OnClickListener() {
            public void onClick(View view) {
                int M = AnonymousClass0cQ.m5863M(this, -1135532999);
                if (B.m1639E()) {
                    Context activity = QuickExperimentSpoofFragment.this.getActivity();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Already Spoofing on ");
                    stringBuilder.append(B.m1643I());
                    stringBuilder.append(". Clear spoof before spoofing again.");
                    Toast.makeText(activity, stringBuilder.toString(), 0).show();
                } else {
                    AnonymousClass0M7 anonymousClass0M7 = AnonymousClass0M7.f3347C;
                    if (anonymousClass0M7 != null) {
                        String str = anonymousClass2Ie.f28714B;
                        anonymousClass0M7.f3348B = QuickExperimentSpoofFragment.this.mSpoofOverlayDelegate;
                        anonymousClass0M7.mo865L(AnonymousClass0CQ.User, G, str);
                    } else {
                        AnonymousClass0Dc.m1243F(QuickExperimentSpoofFragment.this.getModuleName(), "QuickExperimentManagerFactory is null");
                    }
                }
                AnonymousClass0cQ.m5862L(this, -262103899, M);
            }
        };
        OnClickListener c00305 = new C00305();
        AnonymousClass2IX anonymousClass2IX = new AnonymousClass2IX(C0164R.string.spoof_qe_user, c00294, C0164R.color.grey_8, 0.8f);
        AnonymousClass2IX anonymousClass2IX2 = new AnonymousClass2IX(C0164R.string.clear_qe_user_spoof, c00305, C0164R.color.grey_8, 0.8f);
        arrayList.add(anonymousClass2Ie);
        arrayList.add(anonymousClass2IX);
        arrayList.add(anonymousClass2IX2);
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -790715324);
        super.onCreate(bundle);
        Collection arrayList = new ArrayList();
        arrayList.addAll(getUserSpoofOptions());
        arrayList.add(new AnonymousClass2Io());
        arrayList.addAll(getDeviceSpoofOptions());
        setItems(arrayList);
        AnonymousClass0cQ.m5857G(this, 732412857, F);
    }
}
