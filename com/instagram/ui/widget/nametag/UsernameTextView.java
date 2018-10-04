package com.instagram.ui.widget.nametag;

import X.AnonymousClass0Ca;
import X.AnonymousClass0nA;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UsernameTextView extends TextView {
    /* renamed from: B */
    public String f43817B;
    /* renamed from: C */
    private Drawable f43818C;
    /* renamed from: D */
    private String f43819D;

    public UsernameTextView(Context context) {
        super(context);
        m20530C();
    }

    public UsernameTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20530C();
    }

    public UsernameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20530C();
    }

    /* renamed from: A */
    public final void m20532A(int i, int i2) {
        this.f43818C.setBounds(0, 0, i, i);
        setCompoundDrawables(null, this.f43818C, null, null);
        setCompoundDrawablePadding(i2);
    }

    /* renamed from: B */
    public final void m20533B(float f, int i) {
        StringBuilder stringBuilder = new StringBuilder((this.f43817B.length() + 3) - 1);
        String[] strArr = new String[3];
        m20529B(this, this.f43817B.toUpperCase(Locale.US), strArr, 3, i);
        for (Object obj : strArr) {
            if (TextUtils.isEmpty(obj)) {
                break;
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(obj);
        }
        setText(stringBuilder.toString());
        setLineSpacing(f, 0.0f);
        measure(MeasureSpec.makeMeasureSpec(i, Process.WAIT_RESULT_TIMEOUT), MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: B */
    public static void m20529B(UsernameTextView usernameTextView, String str, String[] strArr, int i, int i2) {
        if (i != 0) {
            if (!TextUtils.isEmpty(str)) {
                int i3 = i2;
                Layout staticLayout = new StaticLayout(str, usernameTextView.getPaint(), i3, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                List arrayList = new ArrayList();
                for (int i4 = 0; i4 < staticLayout.getLineCount(); i4++) {
                    arrayList.add(str.substring(staticLayout.getLineStart(i4), staticLayout.getLineEnd(i4)));
                }
                if (arrayList.size() == 1) {
                    strArr[strArr.length - i] = str;
                    return;
                }
                String str2 = (String) arrayList.get(0);
                int length = str2.length();
                int max = Math.max(str2.lastIndexOf(95), str2.lastIndexOf(46));
                if (max > 0 && !m20531D(str2, max)) {
                    length = max + 1;
                } else if (!TextUtils.isEmpty(usernameTextView.f43819D) && str2.lastIndexOf(usernameTextView.f43819D) >= 0) {
                    length = str2.lastIndexOf(usernameTextView.f43819D) + usernameTextView.f43819D.length();
                } else if (arrayList.size() == 2) {
                    length = Math.round(((float) str.length()) / 2.0f);
                }
                strArr[strArr.length - i] = str.substring(0, length);
                m20529B(usernameTextView, str.substring(length), strArr, i - 1, i3);
            }
        }
    }

    /* renamed from: C */
    private void m20530C() {
        this.f43818C = AnonymousClass0Ca.E(getContext(), C0164R.drawable.nametag_card_glyph);
        setTextSize(0, (float) getContext().getResources().getDimensionPixelSize(C0164R.dimen.username_font_size));
        setTypeface(AnonymousClass0nA.B(getResources()));
        setAllCaps(true);
        setIncludeFontPadding(false);
        setGravity(17);
        if (VERSION.SDK_INT >= 21) {
            setLetterSpacing(0.03f);
        }
    }

    /* renamed from: D */
    private static boolean m20531D(String str, int i) {
        while (i >= 0) {
            char charAt = str.charAt(i);
            if (charAt != '_' && charAt != '.') {
                return false;
            }
            i--;
        }
        return true;
    }

    public void setName(String str, String str2) {
        this.f43817B = str;
        if (!TextUtils.isEmpty(str2)) {
            String trim = str2.trim();
            int indexOf = trim.indexOf(32);
            if (indexOf > 0) {
                this.f43819D = trim.substring(0, indexOf);
            } else {
                this.f43819D = trim;
            }
            this.f43819D = this.f43819D.toUpperCase(Locale.US);
        }
    }
}
