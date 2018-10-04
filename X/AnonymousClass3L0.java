package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.3L0 */
public final class AnonymousClass3L0 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Y9 f40253B;

    public AnonymousClass3L0(AnonymousClass1Y9 anonymousClass1Y9) {
        this.f40253B = anonymousClass1Y9;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f40253B.f19973B.f12614T);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = AnonymousClass0IE.E("media/%s/edit_media/", new Object[]{this.f40253B.f19973B.f12604J.getId()});
        anonymousClass0Pt = anonymousClass0Pt.M(AnonymousClass3cV.class).D("device_id", AnonymousClass0Dt.B(this.f40253B.f19973B.f12596B)).N();
        try {
            String id = this.f40253B.f19973B.f12604J.z().getId();
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            createGenerator.writeArrayFieldStart("removed");
            createGenerator.writeString(id);
            createGenerator.writeEndArray();
            createGenerator.writeEndObject();
            createGenerator.close();
            anonymousClass0Pt.D("sponsor_tags", stringWriter.toString());
        } catch (Throwable e) {
            AnonymousClass0Dc.C(AnonymousClass0xX.f12595V, "Unable to parse branded content tag", e);
        }
        AnonymousClass0GA H = anonymousClass0Pt.H();
        H.f2849B = new AnonymousClass3Kz(this);
        AnonymousClass0Ix.B().schedule(H);
    }
}
