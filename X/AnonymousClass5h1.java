package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar;

/* renamed from: X.5h1 */
public final class AnonymousClass5h1 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ InstantExperiencesAutofillBar f68166B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5h2 f68167C;
    /* renamed from: D */
    public final /* synthetic */ BrowserExtensionsAutofillData f68168D;

    public AnonymousClass5h1(InstantExperiencesAutofillBar instantExperiencesAutofillBar, AnonymousClass5h2 anonymousClass5h2, BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        this.f68166B = instantExperiencesAutofillBar;
        this.f68167C = anonymousClass5h2;
        this.f68168D = browserExtensionsAutofillData;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 911216765);
        this.f68167C.Be(this.f68168D);
        Activity activity = (Activity) this.f68166B.getContext();
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        AnonymousClass0cQ.L(this, 7628685, M);
    }
}
