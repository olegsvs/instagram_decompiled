package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.C0164R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3xB */
public final class AnonymousClass3xB extends AnonymousClass1Pn {
    /* renamed from: B */
    public List f47363B = new ArrayList();
    /* renamed from: C */
    public AnonymousClass33S f47364C;
    /* renamed from: D */
    public AnonymousClass35l f47365D;
    /* renamed from: E */
    public String f47366E;
    /* renamed from: F */
    private SearchEditText f47367F;
    /* renamed from: G */
    private boolean f47368G;

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.fb_page_categories, null);
        ListView listView = (ListView) inflate.findViewById(C0164R.id.category_list);
        this.f47367F = (SearchEditText) inflate.findViewById(C0164R.id.search);
        View findViewById = inflate.findViewById(C0164R.id.separator);
        if (this.f47368G) {
            this.f47367F.setVisibility(0);
            findViewById.setVisibility(8);
            this.f47367F.setOnFilterTextListener(new AnonymousClass35k(this));
        } else {
            this.f47367F.setVisibility(8);
            findViewById.setVisibility(8);
        }
        ListAdapter anonymousClass33S = new AnonymousClass33S(getContext(), this.f47363B, this, this.f47366E);
        this.f47364C = anonymousClass33S;
        listView.setAdapter(anonymousClass33S);
        anonymousClass0Sb.T(inflate);
        anonymousClass0Sb.E(true);
        anonymousClass0Sb.F(true);
        return anonymousClass0Sb.C();
    }
}
