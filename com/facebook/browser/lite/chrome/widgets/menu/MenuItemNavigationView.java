package com.facebook.browser.lite.chrome.widgets.menu;

import X.AnonymousClass1qP;
import X.AnonymousClass1qT;
import X.AnonymousClass1qU;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MenuItemNavigationView extends LinearLayout {
    public MenuItemNavigationView(Context context) {
        this(context, null);
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    public static void m13413B(MenuItemNavigationView menuItemNavigationView, AnonymousClass1qP anonymousClass1qP, ImageButton imageButton, AnonymousClass1qT anonymousClass1qT) {
        imageButton.setEnabled(anonymousClass1qP.f23273C);
        if (anonymousClass1qP.f23273C) {
            imageButton.setOnClickListener(new AnonymousClass1qU(menuItemNavigationView, anonymousClass1qT, anonymousClass1qP));
        }
    }
}
