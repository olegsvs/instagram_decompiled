package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

/* renamed from: X.0e4 */
public abstract class AnonymousClass0e4 extends AnonymousClass0c8 implements Factory {
    /* renamed from: J */
    public final void mo1500J(String str) {
    }

    /* renamed from: K */
    public void mo1480K(AnonymousClass0IL anonymousClass0IL) {
    }

    public AnonymousClass0e4(Context context) {
        super(context, new Handler(context.getMainLooper()), 0);
    }

    /* renamed from: G */
    public final Activity mo1499G() {
        return this.f7002C instanceof Activity ? (Activity) this.f7002C : null;
    }

    /* renamed from: T */
    public void mo1489T(AnonymousClass0IL anonymousClass0IL, Intent intent, int i, Bundle bundle) {
        this.f7002C.startActivity(intent);
    }

    /* renamed from: V */
    public void mo1491V() {
        AnonymousClass0cJ.m5754D(this.f7003D);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        AnonymousClass0IL anonymousClass0IL = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1lG.f22453B);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            if (string == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(attributeSet.getPositionDescription());
                stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with ");
                stringBuilder.append("an id for ");
                stringBuilder.append(attributeValue);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        AnonymousClass0cP anonymousClass0cP = this.f7003D;
        if (resourceId != -1) {
            anonymousClass0IL = anonymousClass0cP.mo1453E(resourceId);
        }
        if (anonymousClass0IL == null && string != null) {
            anonymousClass0IL = anonymousClass0cP.mo1454F(string);
        }
        if (AnonymousClass0cP.f7121e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("onCreateView: id=0x");
            stringBuilder.append(Integer.toHexString(resourceId));
            stringBuilder.append(" fname=");
            stringBuilder.append(attributeValue);
            stringBuilder.append(" existing=");
            stringBuilder.append(anonymousClass0IL);
            stringBuilder.toString();
        }
        if (anonymousClass0IL == null) {
            anonymousClass0IL = AnonymousClass0IL.instantiate(this.f7002C, attributeValue);
            anonymousClass0IL.mFromLayout = true;
            anonymousClass0IL.mFragmentId = resourceId != 0 ? resourceId : -1;
            anonymousClass0IL.mContainerId = -1;
            anonymousClass0IL.mTag = string;
            anonymousClass0IL.mInLayout = true;
            anonymousClass0IL.mFragmentManager = anonymousClass0cP;
            anonymousClass0IL.onInflate(this.f7002C, attributeSet, anonymousClass0IL.mSavedFragmentState);
            anonymousClass0cP.m5820U(anonymousClass0IL, true);
        } else if (anonymousClass0IL.mInLayout) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Duplicate id 0x");
            stringBuilder.append(Integer.toHexString(resourceId));
            stringBuilder.append(", tag ");
            stringBuilder.append(string);
            stringBuilder.append(", or parent id 0x");
            stringBuilder.append(Integer.toHexString(-1));
            stringBuilder.append(" with another fragment for ");
            stringBuilder.append(attributeValue);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            anonymousClass0IL.mInLayout = true;
            if (!anonymousClass0IL.mRetaining) {
                anonymousClass0IL.onInflate(this.f7002C, attributeSet, anonymousClass0IL.mSavedFragmentState);
            }
            anonymousClass0cP.IA(anonymousClass0IL);
        }
        if (anonymousClass0IL.mView != null) {
            if (resourceId != 0) {
                anonymousClass0IL.mView.setId(resourceId);
            }
            if (anonymousClass0IL.mView.getTag() == null) {
                anonymousClass0IL.mView.setTag(string);
            }
            return anonymousClass0IL.mView;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(attributeValue);
        stringBuilder.append(" did not create a view.");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
