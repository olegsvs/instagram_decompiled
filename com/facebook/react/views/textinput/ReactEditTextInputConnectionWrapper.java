package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class ReactEditTextInputConnectionWrapper extends InputConnectionWrapper {
    private ReactEditText mEditText;
    private EventDispatcher mEventDispatcher;
    private boolean mIsBatchEdit;
    private String mKey = null;

    public ReactEditTextInputConnectionWrapper(InputConnection inputConnection, ReactContext reactContext, ReactEditText reactEditText) {
        super(inputConnection, false);
        this.mEventDispatcher = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.mEditText = reactEditText;
    }

    public final boolean beginBatchEdit() {
        this.mIsBatchEdit = true;
        return super.beginBatchEdit();
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 1) {
            if (charSequence2.equals(JsonProperty.USE_DEFAULT_NAME)) {
                charSequence2 = "Backspace";
            }
            dispatchKeyEventOrEnqueue(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        dispatchKeyEvent("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    private void dispatchKeyEvent(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.mEventDispatcher.dispatchEvent(new ReactTextInputKeyPressEvent(this.mEditText.getId(), str));
    }

    private void dispatchKeyEventOrEnqueue(String str) {
        if (this.mIsBatchEdit) {
            this.mKey = str;
        } else {
            dispatchKeyEvent(str);
        }
    }

    public final boolean endBatchEdit() {
        this.mIsBatchEdit = false;
        String str = this.mKey;
        if (str != null) {
            dispatchKeyEvent(str);
            this.mKey = null;
        }
        return super.endBatchEdit();
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                dispatchKeyEvent("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                dispatchKeyEvent("Enter");
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        String valueOf;
        int selectionStart = this.mEditText.getSelectionStart();
        int selectionEnd = this.mEditText.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.mEditText.getSelectionStart();
        Object obj = null;
        Object obj2 = selectionStart == selectionEnd ? 1 : null;
        Object obj3 = selectionStart2 == selectionStart ? 1 : null;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0) {
            obj = 1;
        }
        if (obj == null) {
            if (obj2 != null || obj3 == null) {
                valueOf = String.valueOf(this.mEditText.getText().charAt(selectionStart2 - 1));
                dispatchKeyEventOrEnqueue(valueOf);
                return composingText;
            }
        }
        valueOf = "Backspace";
        dispatchKeyEventOrEnqueue(valueOf);
        return composingText;
    }
}
