package com.facebook.react.views.picker;

import X.AnonymousClass0LR;
import X.AnonymousClass0rF;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.picker.ReactPicker.OnSelectListener;
import com.facebook.react.views.picker.events.PickerItemSelectEvent;

public abstract class ReactPickerManager extends SimpleViewManager {

    public final class ReactPickerAdapter extends ArrayAdapter {
        private final LayoutInflater mInflater;
        private Integer mPrimaryTextColor;

        public ReactPickerAdapter(Context context, ReadableMap[] readableMapArr) {
            super(context, 0, readableMapArr);
            this.mInflater = (LayoutInflater) AnonymousClass0LR.D(context.getSystemService("layout_inflater"));
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return getView(i, view, viewGroup, true);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getView(i, view, viewGroup, false);
        }

        private View getView(int i, View view, ViewGroup viewGroup, boolean z) {
            ReadableMap readableMap = (ReadableMap) getItem(i);
            if (view == null) {
                view = this.mInflater.inflate(z ? 17367049 : 17367048, viewGroup, false);
            }
            TextView textView = (TextView) view;
            textView.setText(readableMap.getString("label"));
            if (!z) {
                Integer num = this.mPrimaryTextColor;
                if (num != null) {
                    textView.setTextColor(num.intValue());
                    return view;
                }
            }
            if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                textView.setTextColor(readableMap.getInt("color"));
            }
            return view;
        }

        public final void setPrimaryTextColor(Integer num) {
            this.mPrimaryTextColor = num;
            AnonymousClass0rF.B(this, 1672933359);
        }
    }

    public final class PickerEventEmitter implements OnSelectListener {
        private final EventDispatcher mEventDispatcher;
        private final ReactPicker mReactPicker;

        public PickerEventEmitter(ReactPicker reactPicker, EventDispatcher eventDispatcher) {
            this.mReactPicker = reactPicker;
            this.mEventDispatcher = eventDispatcher;
        }

        public final void onItemSelected(int i) {
            this.mEventDispatcher.dispatchEvent(new PickerItemSelectEvent(this.mReactPicker.getId(), i));
        }
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, ReactPicker reactPicker) {
        reactPicker.setOnSelectListener(new PickerEventEmitter(reactPicker, ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    public void onAfterUpdateTransaction(ReactPicker reactPicker) {
        super.onAfterUpdateTransaction(reactPicker);
        reactPicker.updateStagedSelection();
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(ReactPicker reactPicker, Integer num) {
        reactPicker.setPrimaryColor(num);
        ReactPickerAdapter reactPickerAdapter = (ReactPickerAdapter) reactPicker.getAdapter();
        if (reactPickerAdapter != null) {
            reactPickerAdapter.setPrimaryTextColor(num);
        }
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactPicker reactPicker, boolean z) {
        reactPicker.setEnabled(z);
    }

    @ReactProp(name = "items")
    public void setItems(ReactPicker reactPicker, ReadableArray readableArray) {
        if (readableArray != null) {
            ReadableMap[] readableMapArr = new ReadableMap[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                readableMapArr[i] = readableArray.getMap(i);
            }
            SpinnerAdapter reactPickerAdapter = new ReactPickerAdapter(reactPicker.getContext(), readableMapArr);
            reactPickerAdapter.setPrimaryTextColor(reactPicker.getPrimaryColor());
            reactPicker.setAdapter(reactPickerAdapter);
            return;
        }
        reactPicker.setAdapter(null);
    }

    @ReactProp(name = "prompt")
    public void setPrompt(ReactPicker reactPicker, String str) {
        reactPicker.setPrompt(str);
    }

    @ReactProp(name = "selected")
    public void setSelected(ReactPicker reactPicker, int i) {
        reactPicker.setStagedSelection(i);
    }
}
