package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.4jM */
public final class AnonymousClass4jM extends ArrayAdapter {
    public AnonymousClass4jM(Context context, int i, List list) {
        super(context, i, list);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int selectedItemPosition;
        TextView textView;
        if (viewGroup instanceof AdapterView) {
            selectedItemPosition = ((AdapterView) viewGroup).getSelectedItemPosition();
            if (selectedItemPosition != -1) {
                textView = (TextView) super.getView(i, view, viewGroup);
                textView.setText((CharSequence) getItem(selectedItemPosition));
                return textView;
            }
        }
        selectedItemPosition = i;
        textView = (TextView) super.getView(i, view, viewGroup);
        textView.setText((CharSequence) getItem(selectedItemPosition));
        return textView;
    }
}
