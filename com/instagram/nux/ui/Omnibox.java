package com.instagram.nux.ui;

import X.AnonymousClass0LH;
import X.AnonymousClass3YB;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Patterns;
import android.widget.AutoCompleteTextView;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Omnibox extends AutoCompleteTextView {
    /* renamed from: C */
    private static final Pattern f42183C = Pattern.compile("[\\w_\\.]+");
    /* renamed from: B */
    public final Set f42184B = new HashSet();

    public Omnibox(Context context) {
        super(context);
        m19934B();
    }

    public Omnibox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19934B();
    }

    public Omnibox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19934B();
    }

    /* renamed from: A */
    public final AnonymousClass3YB m19935A() {
        CharSequence obj = getText().toString();
        if (!obj.isEmpty()) {
            AnonymousClass3YB anonymousClass3YB = AnonymousClass3YB.PHONE_NUMBER;
            if (!(this.f42184B.contains(anonymousClass3YB) && Patterns.PHONE.matcher(obj).matches())) {
                anonymousClass3YB = AnonymousClass3YB.USERNAME;
                if (!this.f42184B.contains(anonymousClass3YB) || !f42183C.matcher(obj).matches()) {
                    anonymousClass3YB = AnonymousClass3YB.EMAIL;
                    if (this.f42184B.contains(anonymousClass3YB) && Patterns.EMAIL_ADDRESS.matcher(obj).matches()) {
                    }
                }
            }
            return anonymousClass3YB;
        }
        return AnonymousClass3YB.UNKNOWN;
    }

    /* renamed from: B */
    private void m19934B() {
        setExpected(AnonymousClass3YB.EMAIL, AnonymousClass3YB.PHONE_NUMBER, AnonymousClass3YB.USERNAME);
    }

    public void setExpected(AnonymousClass3YB... anonymousClass3YBArr) {
        AnonymousClass0LH.E(anonymousClass3YBArr);
        Collection asList = Arrays.asList(anonymousClass3YBArr);
        AnonymousClass0LH.C(asList.isEmpty() ^ 1, "Provide at least 1 contact type");
        AnonymousClass0LH.C(asList.contains(AnonymousClass3YB.UNKNOWN) ^ 1, "Cannot expect UNKNOWN");
        this.f42184B.clear();
        this.f42184B.addAll(asList);
    }
}
