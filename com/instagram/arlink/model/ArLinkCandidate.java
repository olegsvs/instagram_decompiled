package com.instagram.arlink.model;

import android.graphics.RectF;
import java.util.List;

public class ArLinkCandidate {
    private final float mConfidenceScore;
    private final RectF mIconRect;
    private final List mTextBoxes;

    public ArLinkCandidate(float f, RectF rectF, List list) {
        this.mConfidenceScore = f;
        this.mIconRect = rectF;
        this.mTextBoxes = list;
    }

    public float getConfidenceScore() {
        return this.mConfidenceScore;
    }

    public RectF getIconRect() {
        return this.mIconRect;
    }

    public float getRotationDegree() {
        return !this.mTextBoxes.isEmpty() ? ((ArLinkTextBox) this.mTextBoxes.get(0)).getRotationDegree() : 0.0f;
    }

    public List getTextBoxes() {
        return this.mTextBoxes;
    }

    public RectF getTextRect() {
        if (this.mTextBoxes.isEmpty()) {
            return null;
        }
        RectF rectF = new RectF(((ArLinkTextBox) this.mTextBoxes.get(0)).getTextRect());
        for (int i = 1; i < this.mTextBoxes.size(); i++) {
            RectF textRect = ((ArLinkTextBox) this.mTextBoxes.get(i)).getTextRect();
            rectF.left = Math.min(textRect.left, rectF.left);
            rectF.top = Math.min(textRect.top, rectF.top);
            rectF.right = Math.max(textRect.right, rectF.right);
            rectF.bottom = Math.max(textRect.bottom, rectF.bottom);
        }
        return rectF;
    }
}
