package com.instagram.canvas.view.widget;

import X.AnonymousClass39M;
import X.AnonymousClass39N;
import X.AnonymousClass39O;
import X.AnonymousClass3yL;
import X.AnonymousClass3yM;
import X.AnonymousClass3yP;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class RichTextView extends TextView {
    public RichTextView(Context context) {
        super(context);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setText(AnonymousClass3yL anonymousClass3yL) {
        CharSequence spannableString = new SpannableString(anonymousClass3yL.f47609C);
        for (AnonymousClass3yM anonymousClass3yM : anonymousClass3yL.f47608B) {
            if (!(anonymousClass3yM == null || anonymousClass3yM.f47610B == null)) {
                switch (AnonymousClass39N.f38401B[anonymousClass3yM.f47610B.ordinal()]) {
                    case 1:
                        spannableString.setSpan(new StyleSpan(1), anonymousClass3yM.f47612D, anonymousClass3yM.f47612D + anonymousClass3yM.f47611C, 0);
                        break;
                    case 2:
                        spannableString.setSpan(new StyleSpan(2), anonymousClass3yM.f47612D, anonymousClass3yM.f47612D + anonymousClass3yM.f47611C, 0);
                        break;
                    case 3:
                        spannableString.setSpan(new UnderlineSpan(), anonymousClass3yM.f47612D, anonymousClass3yM.f47612D + anonymousClass3yM.f47611C, 0);
                        break;
                    case 4:
                        spannableString.setSpan(new StrikethroughSpan(), anonymousClass3yM.f47612D, anonymousClass3yM.f47612D + anonymousClass3yM.f47611C, 0);
                        break;
                    default:
                        break;
                }
            }
        }
        setText(spannableString);
    }

    public void setTextDescriptor(AnonymousClass3yP anonymousClass3yP) {
        setTextColor(anonymousClass3yP.f47624F);
        setTypeface(AnonymousClass39M.m18765B(anonymousClass3yP.f47620B));
        setTextSize(2, Float.parseFloat(anonymousClass3yP.f47621C));
        AnonymousClass39O.m18767C(this, anonymousClass3yP.f47623E);
        AnonymousClass39O.m18766B(this, anonymousClass3yP.f47622D);
    }
}
