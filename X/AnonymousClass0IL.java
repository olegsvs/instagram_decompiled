package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0IL */
public class AnonymousClass0IL implements AnonymousClass0Hd, ComponentCallbacks, OnCreateContextMenuListener {
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final AnonymousClass0O8 sClassMap = new AnonymousClass0O8();
    public boolean mAdded;
    public AnonymousClass1lI mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mCalled;
    public boolean mCheckedForLoaderManager;
    public AnonymousClass0cP mChildFragmentManager;
    public AnonymousClass0e2 mChildNonConfig;
    public ViewGroup mContainer;
    public int mContainerId;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AnonymousClass0cP mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AnonymousClass0c8 mHost;
    public boolean mInLayout;
    public int mIndex = -1;
    public View mInnerView;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    public LayoutInflater mLayoutInflater;
    public AnonymousClass0dQ mLifecycleRegistry = new AnonymousClass0dQ(this);
    public AnonymousClass0Fy mLoaderManager;
    public boolean mLoadersStarted;
    public boolean mMenuVisible = true;
    public AnonymousClass0IL mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetaining;
    public Bundle mSavedFragmentState;
    public SparseArray mSavedViewState;
    public int mState = 0;
    public String mTag;
    public AnonymousClass0IL mTarget;
    public int mTargetIndex = -1;
    public int mTargetRequestCode;
    public boolean mUserVisibleHint = true;
    public View mView;
    public String mWho;

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(AnonymousClass0IL anonymousClass0IL) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public static void callStartTransitionListener(AnonymousClass0IL anonymousClass0IL) {
        AnonymousClass1lK anonymousClass1lK;
        AnonymousClass1lI anonymousClass1lI = anonymousClass0IL.mAnimationInfo;
        if (anonymousClass1lI == null) {
            anonymousClass1lK = null;
        } else {
            anonymousClass1lI.f22461H = false;
            anonymousClass1lK = anonymousClass1lI.f22472S;
            anonymousClass0IL.mAnimationInfo.f22472S = null;
        }
        if (anonymousClass1lK != null) {
            anonymousClass1lK.KBA();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (this.mLoaderManager != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            AnonymousClass0Fy anonymousClass0Fy = this.mLoaderManager;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            anonymousClass0Fy.m1708I(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            stringBuilder = new StringBuilder();
            stringBuilder.append("Child ");
            stringBuilder.append(this.mChildFragmentManager);
            stringBuilder.append(":");
            printWriter.println(stringBuilder.toString());
            AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            anonymousClass0cP.mo1451C(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    private AnonymousClass1lI ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnonymousClass1lI();
        }
        return this.mAnimationInfo;
    }

    public AnonymousClass0IL findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        return anonymousClass0cP != null ? anonymousClass0cP.CA(str) : null;
    }

    public final FragmentActivity getActivity() {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        return anonymousClass0c8 == null ? null : (FragmentActivity) anonymousClass0c8.mo1499G();
    }

    public boolean getAllowEnterTransitionOverlap() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI != null) {
            if (anonymousClass1lI.f22455B != null) {
                return this.mAnimationInfo.f22455B.booleanValue();
            }
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI != null) {
            if (anonymousClass1lI.f22456C != null) {
                return this.mAnimationInfo.f22456C.booleanValue();
            }
        }
        return true;
    }

    public View getAnimatingAway() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        return anonymousClass1lI.f22457D;
    }

    public Animator getAnimator() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        return anonymousClass1lI.f22458E;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AnonymousClass0IU getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            int i = this.mState;
            AnonymousClass0cP anonymousClass0cP;
            if (i >= 5) {
                anonymousClass0cP = this.mChildFragmentManager;
                anonymousClass0cP.f7149Z = false;
                AnonymousClass0cP.m5776D(anonymousClass0cP, 5);
            } else if (i >= 4) {
                anonymousClass0cP = this.mChildFragmentManager;
                anonymousClass0cP.f7149Z = false;
                AnonymousClass0cP.m5776D(anonymousClass0cP, 4);
            } else if (i >= 2) {
                anonymousClass0cP = this.mChildFragmentManager;
                anonymousClass0cP.f7149Z = false;
                AnonymousClass0cP.m5776D(anonymousClass0cP, 2);
            } else if (i >= 1) {
                this.mChildFragmentManager.m5827b();
            }
        }
        return this.mChildFragmentManager;
    }

    public Context getContext() {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        if (anonymousClass0c8 == null) {
            return null;
        }
        return anonymousClass0c8.f7002C;
    }

    public Object getEnterTransition() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        return anonymousClass1lI.f22459F;
    }

    public AnonymousClass0mC getEnterTransitionCallback() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        return anonymousClass1lI.f22460G;
    }

    public Object getExitTransition() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        return anonymousClass1lI.f22462I;
    }

    public AnonymousClass0mC getExitTransitionCallback() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        return anonymousClass1lI.f22463J;
    }

    public final AnonymousClass0IU getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        return anonymousClass0c8 == null ? null : anonymousClass0c8.mo1482M();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        if (anonymousClass0c8 != null) {
            LayoutInflater N = anonymousClass0c8.mo1483N();
            getChildFragmentManager();
            AnonymousClass11y.m8840C(N, this.mChildFragmentManager);
            return N;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public AnonymousClass0dR getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public AnonymousClass0Fz getLoaderManager() {
        AnonymousClass0Fz anonymousClass0Fz = this.mLoaderManager;
        if (anonymousClass0Fz != null) {
            return anonymousClass0Fz;
        }
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        if (anonymousClass0c8 != null) {
            this.mCheckedForLoaderManager = true;
            anonymousClass0Fz = anonymousClass0c8.m5704H(this.mWho, this.mLoadersStarted, true);
            this.mLoaderManager = anonymousClass0Fz;
            return anonymousClass0Fz;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int getNextAnim() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return 0;
        }
        return anonymousClass1lI.f22465L;
    }

    public int getNextTransition() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return 0;
        }
        return anonymousClass1lI.f22466M;
    }

    public int getNextTransitionStyle() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return 0;
        }
        return anonymousClass1lI.f22467N;
    }

    public final AnonymousClass0IL getParentFragment() {
        return this.mParentFragment;
    }

    public Object getReenterTransition() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        Object exitTransition;
        if (anonymousClass1lI.f22468O == USE_DEFAULT_TRANSITION) {
            exitTransition = getExitTransition();
        } else {
            exitTransition = this.mAnimationInfo.f22468O;
        }
        return exitTransition;
    }

    public final Resources getResources() {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        if (anonymousClass0c8 != null) {
            return anonymousClass0c8.f7002C.getResources();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        Object enterTransition;
        if (anonymousClass1lI.f22469P == USE_DEFAULT_TRANSITION) {
            enterTransition = getEnterTransition();
        } else {
            enterTransition = this.mAnimationInfo.f22469P;
        }
        return enterTransition;
    }

    public Object getSharedElementEnterTransition() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        return anonymousClass1lI.f22470Q;
    }

    public Object getSharedElementReturnTransition() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return null;
        }
        Object sharedElementEnterTransition;
        if (anonymousClass1lI.f22471R == USE_DEFAULT_TRANSITION) {
            sharedElementEnterTransition = getSharedElementEnterTransition();
        } else {
            sharedElementEnterTransition = this.mAnimationInfo.f22471R;
        }
        return sharedElementEnterTransition;
    }

    public int getStateAfterAnimating() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return 0;
        }
        return anonymousClass1lI.f22473T;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final AnonymousClass0IL getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
        this.mLoaderManager = null;
        this.mLoadersStarted = false;
        this.mCheckedForLoaderManager = false;
    }

    public static AnonymousClass0IL instantiate(Context context, String str) {
        return AnonymousClass0IL.instantiate(context, str, null);
    }

    public static AnonymousClass0IL instantiate(Context context, String str, Bundle bundle) {
        StringBuilder stringBuilder;
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            AnonymousClass0IL anonymousClass0IL = (AnonymousClass0IL) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(anonymousClass0IL.getClass().getClassLoader());
                anonymousClass0IL.setArguments(bundle);
            }
            return anonymousClass0IL;
        } catch (Context context2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new AnonymousClass1lJ(stringBuilder.toString(), context2);
        } catch (Context context22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new AnonymousClass1lJ(stringBuilder.toString(), context22);
        } catch (Context context222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new AnonymousClass1lJ(stringBuilder.toString(), context222);
        } catch (Context context2222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": could not find Fragment constructor");
            throw new AnonymousClass1lJ(stringBuilder.toString(), context2222);
        } catch (Context context22222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": calling Fragment constructor caused an exception");
            throw new AnonymousClass1lJ(stringBuilder.toString(), context22222);
        }
    }

    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            AnonymousClass0cP anonymousClass0cP = new AnonymousClass0cP();
            this.mChildFragmentManager = anonymousClass0cP;
            anonymousClass0cP.m5822W(this.mHost, new AnonymousClass11x(this), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return false;
        }
        return anonymousClass1lI.f22464K;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public boolean isPostponed() {
        AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
        if (anonymousClass1lI == null) {
            return false;
        }
        return anonymousClass1lI.f22461H;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 5;
    }

    public final boolean isStateSaved() {
        AnonymousClass0cP anonymousClass0cP = this.mFragmentManager;
        if (anonymousClass0cP == null) {
            return false;
        }
        return anonymousClass0cP.mo1459K();
    }

    public static boolean isSupportFragmentClass(android.content.Context r2, java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = sClassMap;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = r0.get(r3);	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = (java.lang.Class) r1;	 Catch:{ ClassNotFoundException -> 0x001e }
        if (r1 != 0) goto L_0x0017;	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x000a:
        r0 = r2.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = r0.loadClass(r3);	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = sClassMap;	 Catch:{ ClassNotFoundException -> 0x001e }
        r0.put(r3, r1);	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x0017:
        r0 = X.AnonymousClass0IL.class;	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r0.isAssignableFrom(r1);	 Catch:{ ClassNotFoundException -> 0x001e }
        return r0;	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x001e:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0IL.isSupportFragmentClass(android.content.Context, java.lang.String):boolean");
    }

    public final boolean isVisible() {
        if (isAdded() && !isHidden()) {
            View view = this.mView;
            if (!(view == null || view.getWindowToken() == null || this.mView.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    public void noteStateNotSaved() {
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.KA();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -2116898651);
        this.mCalled = true;
        AnonymousClass0cQ.m5857G(this, -2026142690, F);
    }

    public void onAttach(Activity activity) {
        int F = AnonymousClass0cQ.m5856F(this, -2130497100);
        this.mCalled = true;
        AnonymousClass0cQ.m5857G(this, 5009832, F);
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        Activity G = anonymousClass0c8 == null ? null : anonymousClass0c8.mo1499G();
        if (G != null) {
            this.mCalled = false;
            onAttach(G);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -1363317491);
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            if ((anonymousClass0cP.f7133J >= 1 ? 1 : null) == null) {
                this.mChildFragmentManager.m5827b();
            }
        }
        AnonymousClass0cQ.m5857G(this, -1142559604, F);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0cQ.m5857G(this, -930881840, AnonymousClass0cQ.m5856F(this, -683614892));
        return null;
    }

    public void onDestroy() {
        int F = AnonymousClass0cQ.m5856F(this, -374694174);
        this.mCalled = true;
        if (!this.mCheckedForLoaderManager) {
            this.mCheckedForLoaderManager = true;
            this.mLoaderManager = this.mHost.m5704H(this.mWho, this.mLoadersStarted, false);
        }
        AnonymousClass0Fy anonymousClass0Fy = this.mLoaderManager;
        if (anonymousClass0Fy != null) {
            anonymousClass0Fy.m1703D();
        }
        AnonymousClass0cQ.m5857G(this, -1309629998, F);
    }

    public void onDestroyView() {
        int F = AnonymousClass0cQ.m5856F(this, -1359697154);
        this.mCalled = true;
        AnonymousClass0cQ.m5857G(this, 778030228, F);
    }

    public void onDetach() {
        int F = AnonymousClass0cQ.m5856F(this, -345755806);
        this.mCalled = true;
        AnonymousClass0cQ.m5857G(this, -930358346, F);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        Activity G = anonymousClass0c8 == null ? null : anonymousClass0c8.mo1499G();
        if (G != null) {
            this.mCalled = false;
            onInflate(G, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onPause() {
        int F = AnonymousClass0cQ.m5856F(this, -805281132);
        this.mCalled = true;
        AnonymousClass0cQ.m5857G(this, -170025058, F);
    }

    public void onResume() {
        int F = AnonymousClass0cQ.m5856F(this, -1428850017);
        this.mCalled = true;
        AnonymousClass0cQ.m5857G(this, 502121966, F);
    }

    public void onStart() {
        int F = AnonymousClass0cQ.m5856F(this, -1404858125);
        this.mCalled = true;
        if (!this.mLoadersStarted) {
            this.mLoadersStarted = true;
            if (this.mCheckedForLoaderManager) {
                AnonymousClass0Fy anonymousClass0Fy = this.mLoaderManager;
                if (anonymousClass0Fy != null) {
                    anonymousClass0Fy.m1706G();
                }
            } else {
                this.mCheckedForLoaderManager = true;
                this.mLoaderManager = this.mHost.m5704H(this.mWho, this.mLoadersStarted, false);
            }
        }
        AnonymousClass0cQ.m5857G(this, -844673562, F);
    }

    public void onStop() {
        int F = AnonymousClass0cQ.m5856F(this, -1511811473);
        this.mCalled = true;
        AnonymousClass0cQ.m5857G(this, -54749819, F);
    }

    public void onViewStateRestored(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -1107675319);
        this.mCalled = true;
        AnonymousClass0cQ.m5857G(this, -657716619, F);
    }

    public AnonymousClass0IU peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    public void performActivityCreated(Bundle bundle) {
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.KA();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            AnonymousClass0cP anonymousClass0cP2 = this.mChildFragmentManager;
            if (anonymousClass0cP2 != null) {
                anonymousClass0cP2.f7149Z = false;
                AnonymousClass0cP.m5776D(anonymousClass0cP2, 2);
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onActivityCreated()");
        throw new AnonymousClass1lr(stringBuilder.toString());
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.m5825Z(configuration);
        }
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (!onContextItemSelected(menuItem)) {
                AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
                if (anonymousClass0cP != null && anonymousClass0cP.m5826a(menuItem)) {
                }
            }
            return true;
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.KA();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m6051A(AnonymousClass11I.ON_CREATE);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onCreate()");
        throw new AnonymousClass1lr(stringBuilder.toString());
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        return anonymousClass0cP != null ? z | anonymousClass0cP.m5828c(menu, menuInflater) : z;
    }

    public View performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.KA();
        }
        this.mPerformedCreateView = true;
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void performDestroy() {
        this.mLifecycleRegistry.m6051A(AnonymousClass11I.ON_DESTROY);
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.m5829d();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroy()");
        throw new AnonymousClass1lr(stringBuilder.toString());
    }

    public void performDestroyView() {
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            AnonymousClass0cP.m5776D(anonymousClass0cP, 1);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AnonymousClass0Fy anonymousClass0Fy = this.mLoaderManager;
            if (anonymousClass0Fy != null) {
                for (int I = anonymousClass0Fy.f2288E.m2849I() - 1; I >= 0; I--) {
                    ((AnonymousClass0dM) anonymousClass0Fy.f2288E.m2850J(I)).f7430L = true;
                }
            }
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroyView()");
        throw new AnonymousClass1lr(stringBuilder.toString());
    }

    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
            if (anonymousClass0cP == null) {
                return;
            }
            if (this.mRetaining) {
                anonymousClass0cP.m5829d();
                this.mChildFragmentManager = null;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Child FragmentManager of ");
            stringBuilder.append(this);
            stringBuilder.append(" was not ");
            stringBuilder.append(" destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDetach()");
        throw new AnonymousClass1lr(stringBuilder.toString());
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.m5830e();
        }
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.m5831f(z);
        }
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (!(this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem))) {
                AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
                if (anonymousClass0cP != null && anonymousClass0cP.m5846u(menuItem)) {
                }
            }
            return true;
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
            if (anonymousClass0cP != null) {
                anonymousClass0cP.m5847v(menu);
            }
        }
    }

    public void performPause() {
        this.mLifecycleRegistry.m6051A(AnonymousClass11I.ON_PAUSE);
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            AnonymousClass0cP.m5776D(anonymousClass0cP, 4);
        }
        this.mState = 4;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onPause()");
            throw new AnonymousClass1lr(stringBuilder.toString());
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.m5848w(z);
        }
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        return anonymousClass0cP != null ? z | anonymousClass0cP.m5849x(menu) : z;
    }

    public void performReallyStop() {
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            AnonymousClass0cP.m5776D(anonymousClass0cP, 2);
        }
        this.mState = 2;
        if (this.mLoadersStarted) {
            this.mLoadersStarted = false;
            if (!this.mCheckedForLoaderManager) {
                this.mCheckedForLoaderManager = true;
                this.mLoaderManager = this.mHost.m5704H(this.mWho, this.mLoadersStarted, false);
            }
            if (this.mLoaderManager == null) {
                return;
            }
            if (this.mHost.f7007H) {
                this.mLoaderManager.m1705F();
            } else {
                this.mLoaderManager.m1707H();
            }
        }
    }

    public void performResume() {
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.KA();
            this.mChildFragmentManager.AA();
        }
        this.mState = 5;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            AnonymousClass0cP anonymousClass0cP2 = this.mChildFragmentManager;
            if (anonymousClass0cP2 != null) {
                anonymousClass0cP2.f7149Z = false;
                AnonymousClass0cP.m5776D(anonymousClass0cP2, 5);
                this.mChildFragmentManager.AA();
            }
            this.mLifecycleRegistry.m6051A(AnonymousClass11I.ON_RESUME);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new AnonymousClass1lr(stringBuilder.toString());
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            Parcelable PA = anonymousClass0cP.PA();
            if (PA != null) {
                bundle.putParcelable("android:support:fragments", PA);
            }
        }
    }

    public void performStart() {
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.KA();
            this.mChildFragmentManager.AA();
        }
        this.mState = 4;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            AnonymousClass0cP anonymousClass0cP2 = this.mChildFragmentManager;
            if (anonymousClass0cP2 != null) {
                anonymousClass0cP2.f7149Z = false;
                AnonymousClass0cP.m5776D(anonymousClass0cP2, 4);
            }
            AnonymousClass0Fy anonymousClass0Fy = this.mLoaderManager;
            if (anonymousClass0Fy != null) {
                anonymousClass0Fy.m1704E();
            }
            this.mLifecycleRegistry.m6051A(AnonymousClass11I.ON_START);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new AnonymousClass1lr(stringBuilder.toString());
    }

    public void performStop() {
        this.mLifecycleRegistry.m6051A(AnonymousClass11I.ON_STOP);
        AnonymousClass0cP anonymousClass0cP = this.mChildFragmentManager;
        if (anonymousClass0cP != null) {
            anonymousClass0cP.f7149Z = true;
            AnonymousClass0cP.m5776D(anonymousClass0cP, 3);
        }
        this.mState = 3;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onStop()");
            throw new AnonymousClass1lr(stringBuilder.toString());
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f22461H = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] strArr, int i) {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        if (anonymousClass0c8 != null) {
            anonymousClass0c8.mo1486Q(this, strArr, i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void restoreChildFragmentState(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.mChildFragmentManager == null) {
                    instantiateChildFragmentManager();
                }
                this.mChildFragmentManager.OA(parcelable, this.mChildNonConfig);
                this.mChildNonConfig = null;
                this.mChildFragmentManager.m5827b();
            }
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onViewStateRestored()");
            throw new AnonymousClass1lr(stringBuilder.toString());
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f22455B = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f22456C = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f22457D = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f22458E = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex >= 0) {
            if (isStateSaved()) {
                throw new IllegalStateException("Fragment already active and state has been saved");
            }
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AnonymousClass0mC anonymousClass0mC) {
        ensureAnimationInfo().f22460G = anonymousClass0mC;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f22459F = obj;
    }

    public void setExitSharedElementCallback(AnonymousClass0mC anonymousClass0mC) {
        ensureAnimationInfo().f22463J = anonymousClass0mC;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f22462I = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo1491V();
            }
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f22464K = z;
    }

    public final void setIndex(int i, AnonymousClass0IL anonymousClass0IL) {
        this.mIndex = i;
        if (anonymousClass0IL != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(anonymousClass0IL.mWho);
            stringBuilder.append(":");
            stringBuilder.append(this.mIndex);
            this.mWho = stringBuilder.toString();
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("android:fragment:");
        stringBuilder.append(this.mIndex);
        this.mWho = stringBuilder.toString();
    }

    public void setInitialSavedState(Fragment$SavedState fragment$SavedState) {
        if (this.mIndex < 0) {
            Bundle bundle = (fragment$SavedState == null || fragment$SavedState.f22474B == null) ? null : fragment$SavedState.f22474B;
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo1491V();
            }
        }
    }

    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f22465L = i;
        }
    }

    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            AnonymousClass1lI anonymousClass1lI = this.mAnimationInfo;
            anonymousClass1lI.f22466M = i;
            anonymousClass1lI.f22467N = i2;
        }
    }

    public void setOnStartEnterTransitionListener(AnonymousClass1lK anonymousClass1lK) {
        ensureAnimationInfo();
        if (anonymousClass1lK != this.mAnimationInfo.f22472S) {
            if (anonymousClass1lK != null) {
                if (this.mAnimationInfo.f22472S != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Trying to set a replacement startPostponedEnterTransition on ");
                    stringBuilder.append(this);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            if (this.mAnimationInfo.f22461H) {
                this.mAnimationInfo.f22472S = anonymousClass1lK;
            }
            if (anonymousClass1lK != null) {
                anonymousClass1lK.gUA();
            }
        }
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f22468O = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f22469P = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f22470Q = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f22471R = obj;
    }

    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f22473T = i;
    }

    public void setTargetFragment(AnonymousClass0IL anonymousClass0IL, int i) {
        AnonymousClass0IU fragmentManager = getFragmentManager();
        AnonymousClass0IU fragmentManager2 = anonymousClass0IL != null ? anonymousClass0IL.getFragmentManager() : null;
        if (!(fragmentManager == null || fragmentManager2 == null)) {
            if (fragmentManager != fragmentManager2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Fragment ");
                stringBuilder.append(anonymousClass0IL);
                stringBuilder.append(" must share the same FragmentManager to be set as a target fragment");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        AnonymousClass0IL anonymousClass0IL2 = anonymousClass0IL;
        while (anonymousClass0IL2 != null) {
            if (anonymousClass0IL2 != this) {
                anonymousClass0IL2 = anonymousClass0IL2.getTargetFragment();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Setting ");
                stringBuilder.append(anonymousClass0IL);
                stringBuilder.append(" as the target of ");
                stringBuilder.append(this);
                stringBuilder.append(" would create a target cycle");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.mTarget = anonymousClass0IL;
        this.mTargetRequestCode = i;
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 4) {
            AnonymousClass0cP anonymousClass0cP = this.mFragmentManager;
            if (anonymousClass0cP != null) {
                anonymousClass0cP.LA(this);
            }
        }
        this.mUserVisibleHint = z;
        boolean z2 = this.mState < 4 && !z;
        this.mDeferStart = z2;
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        return anonymousClass0c8 != null ? anonymousClass0c8.mo1488S(str) : false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        if (anonymousClass0c8 != null) {
            anonymousClass0c8.mo1489T(this, intent, -1, bundle);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        if (anonymousClass0c8 != null) {
            anonymousClass0c8.mo1489T(this, intent, i, bundle);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        AnonymousClass0c8 anonymousClass0c8 = this.mHost;
        if (anonymousClass0c8 != null) {
            anonymousClass0c8.mo1490U(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void startPostponedEnterTransition() {
        AnonymousClass0cP anonymousClass0cP = this.mFragmentManager;
        if (anonymousClass0cP != null) {
            if (anonymousClass0cP.f7138O != null) {
                if (Looper.myLooper() != this.mFragmentManager.f7138O.f7004E.getLooper()) {
                    this.mFragmentManager.f7138O.f7004E.postAtFrontOfQueue(AnonymousClass0OR.m3623C(new AnonymousClass1lH(this), 769888827));
                    return;
                } else {
                    AnonymousClass0IL.callStartTransitionListener(this);
                    return;
                }
            }
        }
        ensureAnimationInfo().f22461H = false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        AnonymousClass1IL.m10648B(this, stringBuilder);
        if (this.mIndex >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.mTag);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
