package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.5hw */
public final class AnonymousClass5hw extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5hu f68313B;
    /* renamed from: C */
    private int f68314C;

    public final String getModuleName() {
        return "sponsored_debug";
    }

    /* renamed from: B */
    private String m28301B(AnonymousClass0vq anonymousClass0vq) {
        switch (anonymousClass0vq.f12147F.ordinal()) {
            case 0:
                return getString(C0164R.string.web_ad);
            case 1:
                return getString(C0164R.string.app_install_ad);
            case 2:
                return getString(C0164R.string.deep_link_ad);
            case 3:
                return getString(C0164R.string.phone_ad);
            case 4:
                return getString(C0164R.string.map_ad);
            case 5:
                return getString(C0164R.string.canvas_ad);
            case 6:
                return getString(C0164R.string.lead_ad);
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return getString(C0164R.string.profile_visit_ad);
            default:
                throw new IllegalArgumentException("Unknown destination");
        }
    }

    /* renamed from: C */
    private String m28302C(AnonymousClass0qk anonymousClass0qk) {
        return Integer.toString(AnonymousClass0qj.f10992C.A(anonymousClass0qk, this.f68314C));
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.debug_ad);
        anonymousClass0eT.n(true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1343225518);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_sponsored_debug, viewGroup, false);
        AnonymousClass0cQ.G(this, 735218970, F);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        List<AnonymousClass5hx> arrayList = new ArrayList();
        String string = arguments.getString("media_id", JsonProperty.USE_DEFAULT_NAME);
        arrayList.add(new AnonymousClass5hx(getString(C0164R.string.media_id), string));
        this.f68314C = arguments.getInt("position");
        arrayList.add(new AnonymousClass5hx(getString(C0164R.string.ad_gap), m28302C(AnonymousClass0qk.AD)));
        arrayList.add(new AnonymousClass5hx(getString(C0164R.string.netego_gap), m28302C(AnonymousClass0qk.NETEGO)));
        AnonymousClass0P7 A = AnonymousClass107.f13182C.A(string);
        AnonymousClass0LH.E(A);
        arrayList.add(new AnonymousClass5hx(getString(C0164R.string.tracking_token), A.YT()));
        String G = A.G();
        AnonymousClass0LH.E(G);
        arrayList.add(new AnonymousClass5hx(getString(C0164R.string.ad_id), G));
        AnonymousClass0vq B = AnonymousClass0vv.B(A, arguments.getInt("carousel_index"), getContext());
        if (B != null) {
            G = B.f12151J;
        } else {
            G = JsonProperty.USE_DEFAULT_NAME;
        }
        arrayList.add(new AnonymousClass5hx(getString(C0164R.string.android_link), G));
        arrayList.add(new AnonymousClass5hx(getString(C0164R.string.ad_destination), B != null ? m28301B(B) : JsonProperty.USE_DEFAULT_NAME));
        BaseAdapter anonymousClass5hu = new AnonymousClass5hu(getContext());
        this.f68313B = anonymousClass5hu;
        for (AnonymousClass5hx anonymousClass5hx : arrayList) {
            anonymousClass5hu.f68309B.add(anonymousClass5hx.f68315B);
            anonymousClass5hu.f68310C.add(Integer.valueOf(anonymousClass5hu.f68309B.size() - 1));
            anonymousClass5hu.f68309B.add(anonymousClass5hx.f68316C);
        }
        AnonymousClass0rF.B(anonymousClass5hu, 526939498);
        ListView listView = (ListView) view.findViewById(C0164R.id.debug_ad_view);
        listView.setAdapter(this.f68313B);
        listView.setOnItemClickListener(new AnonymousClass5hv(this));
    }
}
