package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.school.fragment.UpdateSchoolViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5zo */
public final class AnonymousClass5zo extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5zz f70716B;

    public AnonymousClass5zo(AnonymousClass5zz anonymousClass5zz) {
        this.f70716B = anonymousClass5zz;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1201220667);
        super.onFail(anonymousClass0Q6);
        this.f70716B.f70742N = new UpdateSchoolViewModel();
        AnonymousClass5zz.m28740C(this.f70716B);
        AnonymousClass0cQ.H(this, 1485315593, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1736681633);
        super.onFinish();
        AnonymousClass5zz.m28741D(this.f70716B, false);
        AnonymousClass0cQ.H(this, -598911531, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1546462937);
        AnonymousClass5zX anonymousClass5zX = (AnonymousClass5zX) obj;
        int I2 = AnonymousClass0cQ.I(this, 709916433);
        super.onSuccess(anonymousClass5zX);
        this.f70716B.f70737I = anonymousClass5zX.f70700B;
        TextView textView = this.f70716B.f70740L;
        AnonymousClass5zW anonymousClass5zW = anonymousClass5zX.f70701C;
        textView.setText(anonymousClass5zW != null ? anonymousClass5zW.f70698B : JsonProperty.USE_DEFAULT_NAME);
        ImageView imageView = this.f70716B.f70739K;
        Context context = this.f70716B.getContext();
        List arrayList = new ArrayList();
        anonymousClass5zW = anonymousClass5zX.f70701C;
        if (anonymousClass5zW != null) {
            for (AnonymousClass0Ci DQ : anonymousClass5zW.f70699C) {
                arrayList.add(DQ.DQ());
            }
        }
        imageView.setImageDrawable(AnonymousClass64O.m28867B(context, arrayList, this.f70716B.getResources().getDimensionPixelSize(C0164R.dimen.school_intro_social_context_avatar_height), this.f70716B.getResources().getDimensionPixelSize(C0164R.dimen.school_intro_social_context_avatar_border_width), 5));
        AnonymousClass5zz anonymousClass5zz = this.f70716B;
        anonymousClass5zz.f70742N = new UpdateSchoolViewModel(anonymousClass5zz.f70737I);
        AnonymousClass5zz.m28740C(this.f70716B);
        AnonymousClass0cQ.H(this, -1135975157, I2);
        AnonymousClass0cQ.H(this, -1938755494, I);
    }
}
