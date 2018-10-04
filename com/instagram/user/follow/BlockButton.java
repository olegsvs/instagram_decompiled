package com.instagram.user.follow;

import X.AnonymousClass0Ci;
import X.AnonymousClass1KI;
import X.AnonymousClass5S1;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockButton extends UpdatableButton {
    /* renamed from: B */
    public boolean f44114B;

    public BlockButton(Context context) {
        this(context, null, 0);
    }

    public BlockButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlockButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    public static void m20582B(BlockButton blockButton, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass5S1 anonymousClass5S1) {
        blockButton.f44114B ^= 1;
        blockButton.setBlueButton(blockButton.f44114B ^ 1);
        blockButton.refreshDrawableState();
        blockButton = anonymousClass5S1.f63741B;
        AnonymousClass1KI anonymousClass1KI = new AnonymousClass1KI(anonymousClass0Ci);
        if (blockButton.f51760C.contains(anonymousClass1KI)) {
            if (blockButton.f51763F.contains(anonymousClass1KI)) {
                blockButton.f51763F.remove(anonymousClass1KI);
            } else {
                blockButton.f51764G.add(anonymousClass1KI);
            }
            blockButton.f51760C.remove(anonymousClass1KI);
            blockButton.f51770M.add(anonymousClass1KI);
        } else {
            if (blockButton.f51764G.contains(anonymousClass1KI)) {
                blockButton.f51764G.remove(anonymousClass1KI);
            } else {
                blockButton.f51763F.add(anonymousClass1KI);
            }
            blockButton.f51770M.remove(anonymousClass1KI);
            blockButton.f51760C.add(anonymousClass1KI);
        }
        if (!TextUtils.isEmpty(anonymousClass5S1.f63747H.getText())) {
            anonymousClass5S1.f63747H.setText(JsonProperty.USE_DEFAULT_NAME);
            anonymousClass5S1.f63747H.clearFocus();
            anonymousClass5S1.f63747H.B();
        }
    }

    /* renamed from: C */
    public static void m20583C(BlockButton blockButton, AnonymousClass0Ci anonymousClass0Ci) {
        blockButton.setText(blockButton.f44114B ? C0164R.string.blocking_button_unblock : C0164R.string.blocking_button_block);
        Context context = blockButton.getContext();
        boolean z = blockButton.f44114B;
        String T = anonymousClass0Ci.T();
        blockButton.setContentDescription(context.getString(z ? C0164R.string.blocking_button_unblock_voice : C0164R.string.blocking_button_block_voice, new Object[]{T}));
        blockButton.setEnabled(true);
    }
}
