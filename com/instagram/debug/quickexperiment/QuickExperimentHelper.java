package com.instagram.debug.quickexperiment;

import X.AnonymousClass0CD;
import X.AnonymousClass0CE;
import X.AnonymousClass0CP;
import X.AnonymousClass0CR;
import X.AnonymousClass0CU;
import X.AnonymousClass0E6;
import X.AnonymousClass0FZ;
import X.AnonymousClass0Sb;
import X.AnonymousClass0cQ;
import X.AnonymousClass0rF;
import X.AnonymousClass1To;
import X.AnonymousClass2If;
import X.AnonymousClass2In;
import X.AnonymousClass2Io;
import X.AnonymousClass2JC;
import X.AnonymousClass2bo;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.List;

public class QuickExperimentHelper {

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$1 */
    public final class C00161 implements OnCheckedChangeListener {
        public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
        public final /* synthetic */ AnonymousClass0CE val$experimentParameter;
        public final /* synthetic */ AnonymousClass2JC val$listAdapter;
        public final /* synthetic */ String val$parameterName;
        public final /* synthetic */ AnonymousClass1To val$switchItem;
        public final /* synthetic */ String val$universeName;

        public C00161(AnonymousClass0CE anonymousClass0CE, QuickExperimentDebugStore quickExperimentDebugStore, String str, String str2, AnonymousClass1To anonymousClass1To, AnonymousClass2JC anonymousClass2JC) {
            this.val$experimentParameter = anonymousClass0CE;
            this.val$debugStore = quickExperimentDebugStore;
            this.val$universeName = str;
            this.val$parameterName = str2;
            this.val$switchItem = anonymousClass1To;
            this.val$listAdapter = anonymousClass2JC;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RecentQuickExperimentManager.markRecentExperimentParameter(this.val$experimentParameter);
            this.val$debugStore.removeOverriddenParameter(this.val$universeName, this.val$parameterName);
            if (z != ((Boolean) QuickExperimentHelper.peek(this.val$experimentParameter)).booleanValue()) {
                this.val$debugStore.putOverriddenParameter(this.val$universeName, this.val$parameterName, String.valueOf(z));
            }
            this.val$debugStore.persist();
            this.val$switchItem.f18989M = QuickExperimentHelper.getLabel(this.val$experimentParameter, this.val$debugStore);
            AnonymousClass0rF.m7947B(this.val$listAdapter, -970533596);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$2 */
    public final class C00172 implements OnLongClickListener {
        public final /* synthetic */ String val$universeName;

        public C00172(String str) {
            this.val$universeName = str;
        }

        public boolean onLongClick(View view) {
            ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("QE Universe Name", this.val$universeName));
            Context context = view.getContext();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Copied to clipboard: ");
            stringBuilder.append(this.val$universeName);
            Toast.makeText(context, stringBuilder.toString(), 0).show();
            return true;
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$3 */
    public final class C00213 implements OnClickListener {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
        public final /* synthetic */ AnonymousClass0CE val$experimentParameter;
        public final /* synthetic */ AnonymousClass2JC val$listAdapter;
        public final /* synthetic */ AnonymousClass2bo val$menuItem;
        public final /* synthetic */ String val$parameterName;
        public final /* synthetic */ String val$universeName;

        /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$3$1 */
        public class C00181 implements DialogInterface.OnClickListener {
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(C00213.this.val$experimentParameter);
                C00213.this.val$debugStore.removeOverriddenParameterAndPersist(C00213.this.val$universeName, C00213.this.val$parameterName);
                C00213.this.val$menuItem.f31491G = QuickExperimentHelper.getLabel(C00213.this.val$experimentParameter, C00213.this.val$debugStore);
                AnonymousClass0rF.m7947B(C00213.this.val$listAdapter, -1096060445);
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$3$2 */
        public class C00192 implements DialogInterface.OnClickListener {
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(C00213.this.val$experimentParameter);
                C00213.this.val$debugStore.putOverriddenParameterAndPersist(C00213.this.val$universeName, C00213.this.val$parameterName, String.valueOf(C00213.this.val$experimentParameter.f1491B));
                C00213.this.val$menuItem.f31491G = QuickExperimentHelper.getLabel(C00213.this.val$experimentParameter, C00213.this.val$debugStore);
                AnonymousClass0rF.m7947B(C00213.this.val$listAdapter, 483883149);
                dialogInterface.dismiss();
            }
        }

        public C00213(Context context, AnonymousClass0CE anonymousClass0CE, QuickExperimentDebugStore quickExperimentDebugStore, String str, String str2, AnonymousClass2bo anonymousClass2bo, AnonymousClass2JC anonymousClass2JC) {
            this.val$context = context;
            this.val$experimentParameter = anonymousClass0CE;
            this.val$debugStore = quickExperimentDebugStore;
            this.val$universeName = str;
            this.val$parameterName = str2;
            this.val$menuItem = anonymousClass2bo;
            this.val$listAdapter = anonymousClass2JC;
        }

        public void onClick(View view) {
            int M = AnonymousClass0cQ.m5863M(this, -519032703);
            final View editText = new EditText(this.val$context);
            editText.setInputType(QuickExperimentHelper.getInputType(this.val$experimentParameter));
            editText.setText(String.valueOf(QuickExperimentHelper.peek(this.val$experimentParameter)));
            Builder title = new Builder(this.val$context).setTitle(this.val$experimentParameter.f1495F.m908C());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Override ");
            stringBuilder.append(this.val$experimentParameter.f1493D);
            stringBuilder.append(":");
            title.setMessage(stringBuilder.toString()).setView(editText).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    RecentQuickExperimentManager.markRecentExperimentParameter(C00213.this.val$experimentParameter);
                    if (!TextUtils.isEmpty(editText.getText().toString())) {
                        C00213.this.val$debugStore.putOverriddenParameterAndPersist(C00213.this.val$universeName, C00213.this.val$parameterName, editText.getText().toString());
                        C00213.this.val$menuItem.f31491G = QuickExperimentHelper.getLabel(C00213.this.val$experimentParameter, C00213.this.val$debugStore);
                        AnonymousClass0rF.m7947B(C00213.this.val$listAdapter, 1986980650);
                    }
                    dialogInterface.dismiss();
                }
            }).setNeutralButton("Client Default", new C00192()).setNegativeButton("No Override", new C00181()).show();
            AnonymousClass0cQ.m5862L(this, -930189367, M);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$4 */
    public final class C00254 implements OnClickListener {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
        public final /* synthetic */ AnonymousClass0CE val$experimentParameter;
        public final /* synthetic */ AnonymousClass2JC val$listAdapter;
        public final /* synthetic */ AnonymousClass2bo val$menuItem;
        public final /* synthetic */ String val$parameterName;
        public final /* synthetic */ String val$universeName;
        public final /* synthetic */ String[] val$values;

        /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$4$1 */
        public class C00221 implements DialogInterface.OnClickListener {
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(C00254.this.val$experimentParameter);
                C00254.this.val$debugStore.removeOverriddenParameterAndPersist(C00254.this.val$universeName, C00254.this.val$parameterName);
                C00254.this.val$menuItem.f31491G = QuickExperimentHelper.getLabel(C00254.this.val$experimentParameter, C00254.this.val$debugStore);
                AnonymousClass0rF.m7947B(C00254.this.val$listAdapter, 1852071604);
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$4$2 */
        public class C00232 implements DialogInterface.OnClickListener {
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(C00254.this.val$experimentParameter);
                C00254.this.val$debugStore.putOverriddenParameterAndPersist(C00254.this.val$universeName, C00254.this.val$parameterName, String.valueOf(C00254.this.val$experimentParameter.f1491B));
                C00254.this.val$menuItem.f31491G = QuickExperimentHelper.getLabel(C00254.this.val$experimentParameter, C00254.this.val$debugStore);
                AnonymousClass0rF.m7947B(C00254.this.val$listAdapter, 745614093);
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$4$3 */
        public class C00243 implements DialogInterface.OnClickListener {
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(C00254.this.val$experimentParameter);
                C00254.this.val$debugStore.putOverriddenParameterAndPersist(C00254.this.val$universeName, C00254.this.val$parameterName, C00254.this.val$values[i]);
                C00254.this.val$menuItem.f31491G = QuickExperimentHelper.getLabel(C00254.this.val$experimentParameter, C00254.this.val$debugStore);
                AnonymousClass0rF.m7947B(C00254.this.val$listAdapter, -66825946);
                dialogInterface.dismiss();
            }
        }

        public C00254(Context context, String[] strArr, AnonymousClass0CE anonymousClass0CE, QuickExperimentDebugStore quickExperimentDebugStore, String str, String str2, AnonymousClass2bo anonymousClass2bo, AnonymousClass2JC anonymousClass2JC) {
            this.val$context = context;
            this.val$values = strArr;
            this.val$experimentParameter = anonymousClass0CE;
            this.val$debugStore = quickExperimentDebugStore;
            this.val$universeName = str;
            this.val$parameterName = str2;
            this.val$menuItem = anonymousClass2bo;
            this.val$listAdapter = anonymousClass2JC;
        }

        public void onClick(View view) {
            int M = AnonymousClass0cQ.m5863M(this, 904408969);
            new AnonymousClass0Sb(this.val$context).m4365G(this.val$values, new C00243()).m4363E(true).m4364F(true).m4376R("Override Experiment Value").m4374P("Client Default", new C00232()).m4371M("No Override", new C00221()).m4361C().show();
            AnonymousClass0cQ.m5862L(this, -1901380175, M);
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$5 */
    public final class C00265 implements OnCheckedChangeListener {
        public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
        public final /* synthetic */ String val$parameterName;
        public final /* synthetic */ AnonymousClass2In val$selectable;
        public final /* synthetic */ String val$universeName;

        public C00265(QuickExperimentDebugStore quickExperimentDebugStore, String str, String str2, AnonymousClass2In anonymousClass2In) {
            this.val$debugStore = quickExperimentDebugStore;
            this.val$universeName = str;
            this.val$parameterName = str2;
            this.val$selectable = anonymousClass2In;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.val$debugStore.trackParameterAndPersist(this.val$universeName, this.val$parameterName);
            } else {
                this.val$debugStore.removeTrackedParameterAndPersist(this.val$universeName, this.val$parameterName);
            }
            this.val$selectable.setSelected(z);
        }
    }

    private static AnonymousClass2bo createCategoryMenuItem(AnonymousClass0CE anonymousClass0CE, QuickExperimentDebugStore quickExperimentDebugStore, Context context, AnonymousClass2JC anonymousClass2JC, String[] strArr) {
        AnonymousClass0CE anonymousClass0CE2 = anonymousClass0CE;
        QuickExperimentDebugStore quickExperimentDebugStore2 = quickExperimentDebugStore;
        AnonymousClass2bo anonymousClass2bo = new AnonymousClass2bo(getLabel(anonymousClass0CE, quickExperimentDebugStore));
        anonymousClass2bo.f31492H = AnonymousClass0FZ.m1634B().m1645K();
        String C = anonymousClass0CE.f1495F.m908C();
        String str = anonymousClass0CE.f1493D;
        anonymousClass2bo.f31489E = new C00254(context, strArr, anonymousClass0CE2, quickExperimentDebugStore2, C, str, anonymousClass2bo, anonymousClass2JC);
        anonymousClass2bo.setSelected(quickExperimentDebugStore.isParameterTracked(C, str));
        anonymousClass2bo.f31490F = makeTrackingListener(anonymousClass2bo, quickExperimentDebugStore, C, str);
        return anonymousClass2bo;
    }

    private static AnonymousClass2bo createSimpleMenuItem(AnonymousClass0CE anonymousClass0CE, QuickExperimentDebugStore quickExperimentDebugStore, Context context, AnonymousClass2JC anonymousClass2JC) {
        AnonymousClass0CE anonymousClass0CE2 = anonymousClass0CE;
        QuickExperimentDebugStore quickExperimentDebugStore2 = quickExperimentDebugStore;
        AnonymousClass2bo anonymousClass2bo = new AnonymousClass2bo(getLabel(anonymousClass0CE, quickExperimentDebugStore));
        anonymousClass2bo.f31492H = AnonymousClass0FZ.m1634B().m1645K();
        String C = anonymousClass0CE.f1495F.m908C();
        String str = anonymousClass0CE.f1493D;
        anonymousClass2bo.f31489E = new C00213(context, anonymousClass0CE2, quickExperimentDebugStore2, C, str, anonymousClass2bo, anonymousClass2JC);
        anonymousClass2bo.setSelected(quickExperimentDebugStore.isParameterTracked(C, str));
        anonymousClass2bo.f31490F = makeTrackingListener(anonymousClass2bo, quickExperimentDebugStore, C, str);
        return anonymousClass2bo;
    }

    private static AnonymousClass1To createSwitchItem(AnonymousClass0CE anonymousClass0CE, QuickExperimentDebugStore quickExperimentDebugStore, AnonymousClass2JC anonymousClass2JC) {
        AnonymousClass0CE anonymousClass0CE2 = anonymousClass0CE;
        String C = anonymousClass0CE.f1495F.m908C();
        String str = anonymousClass0CE.f1493D;
        QuickExperimentDebugStore quickExperimentDebugStore2 = quickExperimentDebugStore;
        anonymousClass0CE = new AnonymousClass1To(getLabel(anonymousClass0CE2, quickExperimentDebugStore), ((Boolean) peek(anonymousClass0CE2)).booleanValue(), null);
        OnCheckedChangeListener c00161 = new C00161(anonymousClass0CE2, quickExperimentDebugStore2, C, str, anonymousClass0CE, anonymousClass2JC);
        OnLongClickListener c00172 = new C00172(C);
        anonymousClass0CE.f18978B = true;
        anonymousClass0CE.f18984H = c00161;
        anonymousClass0CE.f18985I = c00172;
        anonymousClass0CE.f18987K = AnonymousClass0FZ.m1634B().m1645K();
        anonymousClass0CE.setSelected(quickExperimentDebugStore2.isParameterTracked(C, str));
        anonymousClass0CE.f18986J = makeTrackingListener(anonymousClass0CE, quickExperimentDebugStore2, C, str);
        return anonymousClass0CE;
    }

    public static int getInputType(AnonymousClass0CE anonymousClass0CE) {
        if (anonymousClass0CE.f1494E == Integer.class) {
            return 2;
        }
        return anonymousClass0CE.f1494E == Double.class ? 8194 : 1;
    }

    public static String getLabel(AnonymousClass0CE anonymousClass0CE, QuickExperimentDebugStore quickExperimentDebugStore) {
        String C = anonymousClass0CE.f1495F.m908C();
        String str = anonymousClass0CE.f1493D;
        String overriddenParameter = quickExperimentDebugStore.getOverriddenParameter(C, str);
        String obj = anonymousClass0CE.f1491B.toString();
        if (overriddenParameter == null) {
            overriddenParameter = peek(anonymousClass0CE).toString();
            C = overriddenParameter.equals(obj) ? GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT : "server";
        } else {
            quickExperimentDebugStore.removeOverriddenParameter(C, str);
            String obj2 = peek(anonymousClass0CE).toString();
            quickExperimentDebugStore.putOverriddenParameter(C, str, overriddenParameter);
            C = overriddenParameter.equals(obj) ? overriddenParameter.equals(obj2) ? "overridden to default & server" : "overridden to default" : overriddenParameter.equals(obj2) ? "overridden to server" : "overridden";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getNiceUniverseName(anonymousClass0CE.f1495F));
        stringBuilder.append(":\n\t");
        stringBuilder.append(anonymousClass0CE.f1493D.replace("_", " "));
        stringBuilder.append(" = ");
        stringBuilder.append(overriddenParameter);
        stringBuilder.append(" (");
        stringBuilder.append(C);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static List getMenuItems(List list, Context context, AnonymousClass2JC anonymousClass2JC, boolean z) {
        QuickExperimentDebugStore overrideStore = QuickExperimentDebugStoreManager.getOverrideStore(context.getFilesDir());
        List arrayList = new ArrayList();
        AnonymousClass0CR anonymousClass0CR = null;
        for (AnonymousClass0CE anonymousClass0CE : list) {
            AnonymousClass0CP anonymousClass0CP = anonymousClass0CE.f1495F;
            if (anonymousClass0CP.m906A() != anonymousClass0CR && z) {
                if (anonymousClass0CR != null) {
                    arrayList.add(new AnonymousClass2Io());
                }
                arrayList.add(new AnonymousClass2If(anonymousClass0CP.m906A().f1630B));
                anonymousClass0CR = anonymousClass0CP.m906A();
            }
            if (anonymousClass0CE.f1494E == Boolean.class) {
                arrayList.add(createSwitchItem(anonymousClass0CE, overrideStore, anonymousClass2JC));
            } else {
                String[] strArr = anonymousClass0CE.f1496G;
                if ((strArr == null ? 0 : strArr.length) > 1) {
                    arrayList.add(createCategoryMenuItem(anonymousClass0CE, overrideStore, context, anonymousClass2JC, anonymousClass0CE.f1496G));
                } else {
                    arrayList.add(createSimpleMenuItem(anonymousClass0CE, overrideStore, context, anonymousClass2JC));
                }
            }
        }
        return arrayList;
    }

    public static String getNiceUniverseName(AnonymousClass0CP anonymousClass0CP) {
        anonymousClass0CP = JsonProperty.USE_DEFAULT_NAME;
        return anonymousClass0CP.m908C().replace("ig_android_", anonymousClass0CP).replace("ig_", anonymousClass0CP).replace("_", " ");
    }

    private static OnCheckedChangeListener makeTrackingListener(AnonymousClass2In anonymousClass2In, QuickExperimentDebugStore quickExperimentDebugStore, String str, String str2) {
        return new C00265(quickExperimentDebugStore, str, str2, anonymousClass2In);
    }

    public static Object peek(AnonymousClass0CE anonymousClass0CE) {
        if (anonymousClass0CE instanceof AnonymousClass0CD) {
            return AnonymousClass0E6.m1317C((AnonymousClass0CD) anonymousClass0CE);
        }
        return AnonymousClass0E6.m1316B((AnonymousClass0CU) anonymousClass0CE);
    }

    public static void setupMenuItems(List list, Context context, AnonymousClass2JC anonymousClass2JC, boolean z) {
        anonymousClass2JC.setItems(getMenuItems(list, context, anonymousClass2JC, z));
    }
}
