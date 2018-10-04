package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.webrtc.SessionDescription;

/* renamed from: X.5iy */
public final class AnonymousClass5iy implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6DU f68467B;
    /* renamed from: C */
    public final /* synthetic */ SessionDescription f68468C;

    public AnonymousClass5iy(AnonymousClass6DU anonymousClass6DU, SessionDescription sessionDescription) {
        this.f68467B = anonymousClass6DU;
        this.f68468C = sessionDescription;
    }

    public final void run() {
        String str;
        AnonymousClass5ik anonymousClass5ik = new AnonymousClass5ik(this.f68468C.description);
        AnonymousClass5ik.m28335B(anonymousClass5ik, this.f68467B.f73054B.f68523T.toString(), true);
        AnonymousClass5ik.m28335B(anonymousClass5ik, this.f68467B.f73054B.f68524U.toString(), false);
        String str2 = this.f68467B.f73054B.f68519P.f58311K;
        Pattern compile = Pattern.compile("^a=ssrc:(\\S+) cname:(\\S+)$");
        Iterator it = anonymousClass5ik.f68435B.iterator();
        int i = 0;
        while (it.hasNext()) {
            str = (String) it.next();
            if (compile.matcher(str).matches()) {
                int indexOf = str.indexOf("cname:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, indexOf));
                stringBuilder.append("cname:");
                stringBuilder.append(str2);
                String stringBuilder2 = stringBuilder.toString();
                Integer.valueOf(i);
                anonymousClass5ik.f68435B.set(i, stringBuilder2);
            }
            i++;
        }
        ListIterator listIterator = anonymousClass5ik.f68435B.listIterator();
        while (listIterator.hasNext()) {
            if (((String) listIterator.next()).startsWith("a=rtcp-fb:111 transport-cc")) {
                listIterator.set("a=rtcp-fb:111 nack");
            }
        }
        SessionDescription sessionDescription = new SessionDescription(this.f68468C.type, anonymousClass5ik.toString());
        this.f68467B.f73054B.f68515L = false;
        this.f68467B.f73054B.f68527X = false;
        this.f68467B.f73054B.f68514K = sessionDescription;
        AnonymousClass5Y4 anonymousClass5Y4 = this.f68467B.f73054B.f68509F;
        str = sessionDescription.description;
        AnonymousClass5jH anonymousClass5jH = this.f68467B.f73054B;
        Map hashMap = new HashMap();
        MediaStreamTrack mediaStreamTrack = anonymousClass5jH.f68513J;
        if (mediaStreamTrack != null) {
            hashMap.put(mediaStreamTrack.id(), Boolean.valueOf(anonymousClass5jH.f68513J.enabled()));
        } else {
            hashMap.put(anonymousClass5jH.f68512I.id(), Boolean.valueOf(false));
        }
        mediaStreamTrack = anonymousClass5jH.f68517N;
        if (mediaStreamTrack != null) {
            hashMap.put(mediaStreamTrack.id(), Boolean.valueOf(anonymousClass5jH.f68517N.enabled()));
        } else {
            hashMap.put(anonymousClass5jH.f68516M.id(), Boolean.valueOf(false));
        }
        if (anonymousClass5Y4 != null) {
            AnonymousClass0Sy.F(new AnonymousClass4tq(anonymousClass5Y4, str, hashMap));
        }
    }
}
