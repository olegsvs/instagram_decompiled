package X;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.4CG */
public final class AnonymousClass4CG implements OnFocusChangeListener {
    public AnonymousClass4CG(AnonymousClass4CK anonymousClass4CK) {
    }

    public final void onFocusChange(View view, boolean z) {
        ((SearchEditText) view).setClearButtonEnabled(z);
    }
}
