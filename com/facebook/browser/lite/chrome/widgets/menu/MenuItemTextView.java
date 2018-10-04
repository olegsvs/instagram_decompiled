package com.facebook.browser.lite.chrome.widgets.menu;

import X.AnonymousClass1qP;
import X.AnonymousClass1qT;
import X.AnonymousClass1qW;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class MenuItemTextView extends LinearLayout {
    /* renamed from: B */
    private Context f23290B;

    public MenuItemTextView(Context context) {
        this(context, null);
    }

    public MenuItemTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuItemTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23290B = context;
    }

    /* renamed from: A */
    public final void m13415A(AnonymousClass1qP anonymousClass1qP, AnonymousClass1qT anonymousClass1qT, boolean z) {
        if (anonymousClass1qP != null) {
            TextView textView = (TextView) findViewById(C0164R.id.title_textview);
            textView.setText(anonymousClass1qP.f23275E);
            int i = 0;
            if (anonymousClass1qP.f23274D > 0) {
                textView.setCompoundDrawablesWithIntrinsicBounds(anonymousClass1qP.f23274D, 0, 0, 0);
            }
            if (anonymousClass1qP.f23277G > 0) {
                Context context = this.f23290B;
                int i2 = anonymousClass1qP.f23277G;
                if (VERSION.SDK_INT >= 23) {
                    textView.setTextAppearance(i2);
                } else {
                    textView.setTextAppearance(context, i2);
                }
            }
            setOnClickListener(new AnonymousClass1qW(this, anonymousClass1qT, anonymousClass1qP));
            if (findViewById(C0164R.id.menu_divider) != null) {
                View findViewById = findViewById(C0164R.id.menu_divider);
                if (!z) {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
        }
    }
}
