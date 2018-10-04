package com.instagram.debug.quickexperiment;

import X.AnonymousClass09h;
import X.AnonymousClass09i;
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
import X.AnonymousClass2JP;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QuickExperimentBisectFragment extends AnonymousClass0TM implements AnonymousClass0IT {
    public static final String TAG = "QuickExperimentBisectFragment";
    public final AnonymousClass09i mBisectOverlayDelegate = new C00373();
    public AnonymousClass09h mBisection;
    private final AnonymousClass2Id mEditDelegate = new C00062();
    private final OnEditorActionListener mTextDelegate = new C00051();
    public final AnonymousClass0M7 qeFactory = AnonymousClass0M7.f3347C;

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$1 */
    public class C00051 implements OnEditorActionListener {
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$2 */
    public class C00062 implements AnonymousClass2Id {
        public void onTextChanged(String str) {
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$4 */
    public class C00074 implements OnClickListener {
        public void onClick(View view) {
            int M = AnonymousClass0cQ.m5863M(this, -1728482114);
            QuickExperimentBisectFragment.this.mBisection.m643H();
            Integer.valueOf(QuickExperimentBisectFragment.this.mBisection.m640E());
            Integer.valueOf(QuickExperimentBisectFragment.this.mBisection.m630B());
            QuickExperimentBisectFragment.setContent(QuickExperimentBisectFragment.this);
            AnonymousClass0cQ.m5862L(this, 1148878476, M);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$5 */
    public class C00085 implements OnClickListener {
        public void onClick(View view) {
            int M = AnonymousClass0cQ.m5863M(this, -1517442363);
            QuickExperimentBisectFragment.this.mBisection.m642G();
            Integer.valueOf(QuickExperimentBisectFragment.this.mBisection.m640E());
            Integer.valueOf(QuickExperimentBisectFragment.this.mBisection.m630B());
            QuickExperimentBisectFragment.setContent(QuickExperimentBisectFragment.this);
            AnonymousClass0cQ.m5862L(this, 654449156, M);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$6 */
    public class C00096 implements OnClickListener {
        public void onClick(View view) {
            int M = AnonymousClass0cQ.m5863M(this, 1465673773);
            AnonymousClass09h.m630B();
            if (QuickExperimentBisectFragment.this.getActivity() != null) {
                ((BaseFragmentActivity) QuickExperimentBisectFragment.this.getActivity()).m2089U();
                QuickExperimentBisectFragment.setContent(QuickExperimentBisectFragment.this);
            }
            AnonymousClass0cQ.m5862L(this, 1142922951, M);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$7 */
    public class C00107 implements OnClickListener {
        public void onClick(View view) {
            int M = AnonymousClass0cQ.m5863M(this, -928957136);
            boolean I = QuickExperimentBisectFragment.this.mBisection.m644I();
            QuickExperimentBisectFragment.setContent(QuickExperimentBisectFragment.this);
            AnonymousClass0cQ.m5862L(this, 601251263, M);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$3 */
    public class C00373 implements AnonymousClass09i {
        public void onOperationStart() {
            if (QuickExperimentBisectFragment.this.getActivity() != null) {
                ((BaseFragmentActivity) QuickExperimentBisectFragment.this.getActivity()).m2089U();
                QuickExperimentBisectFragment.setContent(QuickExperimentBisectFragment.this);
            }
        }
    }

    public String getModuleName() {
        return TAG;
    }

    public void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.m6352a("QE Bisect");
    }

    private AnonymousClass2Ie getBisectIdEditText() {
        String str;
        String str2 = "Enter user's IGID to start bisect on";
        AnonymousClass09h anonymousClass09h = this.mBisection;
        if (anonymousClass09h == null) {
            str = JsonProperty.USE_DEFAULT_NAME;
        } else {
            str = anonymousClass09h.f1106B;
        }
        return new AnonymousClass2Ie(str2, str, this.mEditDelegate, this.mTextDelegate, Integer.valueOf(2), false);
    }

    private List getBisectResponseButtons() {
        OnClickListener c00074 = new C00074();
        OnClickListener c00085 = new C00085();
        OnClickListener c00096 = new C00096();
        OnClickListener c00107 = new C00107();
        List arrayList = new ArrayList();
        arrayList.add(new AnonymousClass2IX(C0164R.string.bisect_qe_up, c00107, C0164R.color.grey_8, 0.8f));
        arrayList.add(new AnonymousClass2IX(C0164R.string.bisect_qe_good, c00074, C0164R.color.grey_8, 0.8f));
        arrayList.add(new AnonymousClass2IX(C0164R.string.bisect_qe_bad, c00085, C0164R.color.grey_8, 0.8f));
        arrayList.add(new AnonymousClass2IX(C0164R.string.bisect_qe_end, c00096, C0164R.color.grey_8, 0.8f));
        return arrayList;
    }

    private List getBisectionStateSummaryItems(int i, int i2) {
        List arrayList = new ArrayList();
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("# of steps made: ");
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(Integer.toString(i));
        arrayList.add(new AnonymousClass2JP(spannableStringBuilder));
        spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("# of steps left: ");
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(Integer.toString(i2));
        arrayList.add(new AnonymousClass2JP(spannableStringBuilder));
        spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("Culprit:\n");
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(this.mBisection.m636A());
        arrayList.add(new AnonymousClass2JP(spannableStringBuilder));
        return arrayList;
    }

    private static AnonymousClass2JP getBisectionStatusItem(int i, int i2) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("Status: ");
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("Bisecting on ");
        spannableStringBuilder.append(Integer.toString(i));
        spannableStringBuilder.append("/");
        spannableStringBuilder.append(Integer.toString(i2));
        spannableStringBuilder.append(" experiments.");
        return new AnonymousClass2JP(spannableStringBuilder);
    }

    private static AnonymousClass2JP getNoBisectionStatusItem() {
        return new AnonymousClass2JP("QE Bisect Status: Not bisecting right now");
    }

    private AnonymousClass2IX getStartBisectButton(final AnonymousClass0Cm anonymousClass0Cm, final AnonymousClass2Ie anonymousClass2Ie) {
        return new AnonymousClass2IX(C0164R.string.bisect_qe_start, new OnClickListener() {
            public void onClick(View view) {
                int M = AnonymousClass0cQ.m5863M(this, 1230136843);
                if (!AnonymousClass0FZ.m1634B().m1638D() && QuickExperimentBisectFragment.this.qeFactory != null) {
                    String str = anonymousClass2Ie.f28714B;
                    QuickExperimentBisectFragment.this.qeFactory.f3348B = QuickExperimentBisectFragment.this.mBisectOverlayDelegate;
                    if (!QuickExperimentBisectFragment.this.qeFactory.mo866M(anonymousClass0Cm, str)) {
                        AnonymousClass0Dc.m1243F(QuickExperimentBisectFragment.TAG, "Failed to start QE Bisect");
                    }
                } else if (AnonymousClass0FZ.m1634B().m1638D()) {
                    Context context = QuickExperimentBisectFragment.this.getContext();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Already started bisect on");
                    stringBuilder.append(AnonymousClass0FZ.m1634B().m1642H());
                    Toast.makeText(context, stringBuilder.toString(), 0).show();
                } else {
                    AnonymousClass0Dc.m1243F(QuickExperimentBisectFragment.TAG, "Tried to bisect but QuickExperimentManagerFactory is null");
                }
                AnonymousClass0cQ.m5862L(this, 2133021049, M);
            }
        }, C0164R.color.grey_8, 0.8f);
    }

    public void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, 897907974);
        super.onCreate(bundle);
        setContent(this);
        AnonymousClass0cQ.m5857G(this, -395985024, F);
    }

    public static void setContent(QuickExperimentBisectFragment quickExperimentBisectFragment) {
        AnonymousClass0Cm G = AnonymousClass0Ce.m950G(quickExperimentBisectFragment.getArguments());
        Collection arrayList = new ArrayList();
        quickExperimentBisectFragment.mBisection = AnonymousClass09h.m631C(quickExperimentBisectFragment.getContext());
        QuickExperimentBisectStore bisectStore = QuickExperimentBisectStore.getBisectStore(quickExperimentBisectFragment.getContext().getFilesDir());
        AnonymousClass2Ie bisectIdEditText = quickExperimentBisectFragment.getBisectIdEditText();
        if (AnonymousClass09h.m632D()) {
            int qeCount = bisectStore.getQeCount();
            int B = (quickExperimentBisectFragment.mBisection.m630B() - quickExperimentBisectFragment.mBisection.m640E()) + 1;
            int ceil = (int) Math.ceil(Math.log((double) B) / Math.log(2.0d));
            int ceil2 = ((int) Math.ceil(Math.log((double) qeCount) / Math.log(2.0d))) - ceil;
            arrayList.add(getBisectionStatusItem(B, qeCount));
            arrayList.addAll(quickExperimentBisectFragment.getBisectionStateSummaryItems(ceil2, ceil));
            arrayList.add(bisectIdEditText);
            arrayList.addAll(quickExperimentBisectFragment.getBisectResponseButtons());
        } else {
            arrayList.add(getNoBisectionStatusItem());
            arrayList.add(bisectIdEditText);
            arrayList.add(quickExperimentBisectFragment.getStartBisectButton(G, bisectIdEditText));
        }
        quickExperimentBisectFragment.setItems(arrayList);
    }
}
