package com.instagram.hashtag.ui;

import X.AnonymousClass19p;
import X.AnonymousClass1LV;
import X.AnonymousClass3Qt;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.C0164R;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.follow.UpdatableButton;

public class HashtagFollowButton extends UpdatableButton {
    /* renamed from: B */
    public String f41188B;

    public HashtagFollowButton(Context context) {
        this(context, null);
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m19625A(Hashtag hashtag, AnonymousClass1LV anonymousClass1LV) {
        boolean equals = AnonymousClass19p.Following.equals(hashtag.A());
        String str = hashtag.f2793M;
        setBlueButton(equals ^ 1);
        refreshDrawableState();
        setEnabled(true);
        setContentDescription(m19624B(this, equals, str));
        if (equals || TextUtils.isEmpty(this.f41188B)) {
            setText(equals ? C0164R.string.following_button_following : C0164R.string.following_button_follow);
        } else {
            setText(this.f41188B);
        }
        setOnClickListener(new AnonymousClass3Qt(this, equals, hashtag, anonymousClass1LV));
    }

    /* renamed from: B */
    public static String m19624B(HashtagFollowButton hashtagFollowButton, boolean z, String str) {
        if (z) {
            return hashtagFollowButton.getContext().getResources().getString(C0164R.string.following_button_following_voice, new Object[]{str});
        }
        return hashtagFollowButton.getContext().getResources().getString(C0164R.string.following_button_follow_voice, new Object[]{str});
    }

    public void setCustomFollowText(String str) {
        this.f41188B = str;
    }
}
