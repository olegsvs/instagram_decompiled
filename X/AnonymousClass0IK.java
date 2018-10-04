package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0IK */
public class AnonymousClass0IK extends AnonymousClass0IL implements AnonymousClass0IM, AnonymousClass0IN {
    /* renamed from: A */
    public void mo449A(Bundle bundle) {
    }

    /* renamed from: B */
    public void mo450B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
    }

    /* renamed from: N */
    public void mo451N() {
    }

    /* renamed from: O */
    public void mo452O() {
    }

    /* renamed from: P */
    public void mo453P() {
    }

    /* renamed from: Q */
    public void mo454Q() {
    }

    /* renamed from: W */
    public void mo455W() {
    }

    /* renamed from: Y */
    public void mo456Y() {
    }

    public final LayoutInflater getLayoutInflater(Bundle bundle) {
        if (this.mHost != null) {
            LayoutInflater cloneInContext = this.mHost.mo1483N().cloneInContext(this.mHost.f7002C);
            getChildFragmentManager();
            AnonymousClass11y.m8840C(cloneInContext, this.mChildFragmentManager);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final void instantiateChildFragmentManager() {
        AnonymousClass0mO.m7529B(this);
    }

    public void onAttach(Context context) {
        AnonymousClass0mO.m7530C(this, context);
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        AnonymousClass0mO.m7531D(this, context, attributeSet, bundle);
    }

    public final void performActivityCreated(Bundle bundle) {
        super.performActivityCreated(bundle);
    }

    public final void performCreate(Bundle bundle) {
        try {
            super.performCreate(bundle);
        } finally {
            mo449A(bundle);
        }
    }

    public final boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        return super.performCreateOptionsMenu(menu, menuInflater);
    }

    public final View performCreateOptionsView() {
        View view = null;
        if (this.mHidden) {
            return null;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            view = null;
        }
        return this.mChildFragmentManager != null ? AnonymousClass0cJ.m5752B(this.mChildFragmentManager) : view;
    }

    public final View performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = null;
        try {
            view = super.performCreateView(layoutInflater, viewGroup, bundle);
        } finally {
            mo450B(layoutInflater, viewGroup, bundle, view);
        }
        return view;
    }

    public final void performDestroy() {
        try {
            super.performDestroy();
        } finally {
            mo451N();
        }
    }

    public final void performDestroyView() {
        try {
            super.performDestroyView();
        } finally {
            mo452O();
        }
    }

    public final MenuInflater performGetMenuInflater() {
        if (!this.mHidden && this.mHasMenu) {
            boolean z = this.mMenuVisible;
        }
        return null;
    }

    public final void performInstantiateChildFragmentManager() {
        super.instantiateChildFragmentManager();
    }

    public final void performOnAttach(Context context) {
        super.onAttach(context);
    }

    public final void performOnInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
    }

    public final void performOnInvalidateOptionsMenu() {
        if (!this.mHidden && this.mChildFragmentManager != null) {
            AnonymousClass0cJ.m5754D(this.mChildFragmentManager);
        }
    }

    public final void performPause() {
        try {
            super.performPause();
        } finally {
            mo453P();
        }
    }

    public final void performResume() {
        try {
            super.performResume();
        } finally {
            mo454Q();
        }
    }

    public final void performStart() {
        try {
            super.performStart();
        } finally {
            mo455W();
        }
    }

    public final void performStop() {
        try {
            super.performStop();
        } finally {
            mo456Y();
        }
    }

    public final void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z && isMenuVisible()) {
            super.setHasOptionsMenu(z);
        }
    }
}
