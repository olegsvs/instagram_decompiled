package X;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.3Qp */
public final class AnonymousClass3Qp extends Filter {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Od f41177B;

    public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
    }

    public AnonymousClass3Qp(AnonymousClass1Od anonymousClass1Od) {
        this.f41177B = anonymousClass1Od;
    }

    public final CharSequence convertResultToString(Object obj) {
        StringBuilder stringBuilder;
        if (obj instanceof Hashtag) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("#");
            stringBuilder.append(((Hashtag) obj).f2793M);
            return stringBuilder.toString();
        } else if (!(obj instanceof AnonymousClass0Ci)) {
            return JsonProperty.USE_DEFAULT_NAME;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("@");
            stringBuilder.append(((AnonymousClass0Ci) obj).uT());
            return stringBuilder.toString();
        }
    }

    public final FilterResults performFiltering(CharSequence charSequence) {
        AnonymousClass0Sy.F(new AnonymousClass3Qo(this, charSequence));
        return null;
    }
}
