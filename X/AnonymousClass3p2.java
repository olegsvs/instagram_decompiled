package X;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: X.3p2 */
public final class AnonymousClass3p2 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1XV f44882B;
    /* renamed from: C */
    public final /* synthetic */ Context f44883C;
    /* renamed from: D */
    public final /* synthetic */ Uri f44884D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass3pA f44885E;

    public AnonymousClass3p2(AnonymousClass1XV anonymousClass1XV, AnonymousClass3pA anonymousClass3pA, Uri uri, Context context) {
        this.f44882B = anonymousClass1XV;
        this.f44885E = anonymousClass3pA;
        this.f44884D = uri;
        this.f44883C = context;
    }

    public final void run() {
        AnonymousClass42P anonymousClass42P;
        AnonymousClass3p2 anonymousClass3p2;
        try {
            anonymousClass3p2 = this;
            AnonymousClass0OA anonymousClass0OA = anonymousClass3p2.f44885E.f44907I;
            AnonymousClass1XV anonymousClass1XV = anonymousClass3p2.f44882B;
            Uri uri = anonymousClass3p2.f44884D;
            anonymousClass1XV.f19779T = new MediaExtractor();
            anonymousClass1XV.f19779T.setDataSource(anonymousClass1XV.f19766G, uri, null);
            anonymousClass1XV.f19796k = anonymousClass1XV.f19795j.m20789B(anonymousClass1XV.f19779T);
            if (anonymousClass0OA.f3799M == null) {
                anonymousClass1XV.f19763D = anonymousClass1XV.f19795j.m20788A(anonymousClass1XV.f19779T);
            } else {
                anonymousClass1XV.f19763D = null;
            }
            anonymousClass1XV = anonymousClass3p2.f44882B;
            Context context = anonymousClass3p2.f44883C;
            int i = anonymousClass3p2.f44885E.f44904F;
            boolean z = anonymousClass3p2.f44885E.f44901C;
            AnonymousClass2Ms anonymousClass2Ms = new AnonymousClass2Ms(anonymousClass0OA, context);
            Point point = anonymousClass2Ms.f29589B;
            anonymousClass1XV.f19793h = point.x;
            anonymousClass1XV.f19792g = point.y;
            AnonymousClass3oo anonymousClass3oo = new AnonymousClass3oo(AnonymousClass3ol.CODEC_VIDEO_H264, anonymousClass1XV.f19793h, anonymousClass1XV.f19792g, 2130708361);
            anonymousClass3oo.f44865E = anonymousClass2Ms.m15258B();
            anonymousClass3oo.f44864D = i;
            anonymousClass3oo.f44866F = 30;
            anonymousClass3oo.f44862B = z;
            anonymousClass3oo.f44863C = ((Integer) AnonymousClass0CC.cj.G()).intValue();
            MediaFormat A = anonymousClass3oo.m20784A();
            anonymousClass1XV.f19769J = MediaCodec.createEncoderByType(AnonymousClass3ol.CODEC_VIDEO_H264.f44848B);
            anonymousClass1XV.f19769J.configure(A, null, null, 1);
            anonymousClass1XV.f19775P = anonymousClass1XV.f19769J.createInputSurface();
            anonymousClass1XV.f19769J.start();
            AnonymousClass1XV anonymousClass1XV2 = anonymousClass3p2.f44882B;
            Context context2 = anonymousClass3p2.f44883C;
            AnonymousClass3pA anonymousClass3pA = anonymousClass3p2.f44885E;
            anonymousClass1XV2.f19784Y = new AnonymousClass3q8(context2, anonymousClass0OA, anonymousClass3pA.f44900B, anonymousClass3pA.f44903E, anonymousClass3pA.f44909K, anonymousClass1XV2.f19775P, null, anonymousClass1XV2);
            MediaFormat mediaFormat = anonymousClass3p2.f44882B.f19796k.f44872B;
            if (((Boolean) AnonymousClass0CC.uj.G()).booleanValue()) {
                AnonymousClass3on B = AnonymousClass3oz.m20796B(mediaFormat, new AnonymousClass3om(), anonymousClass3p2.f44882B.f19784Y.f45140I);
                anonymousClass3p2.f44882B.f19767H = B.f44856D;
                anonymousClass3p2.f44882B.f19768I = B.f44854B;
            } else {
                AnonymousClass1XV anonymousClass1XV3 = anonymousClass3p2.f44882B;
                String string = mediaFormat.getString("mime");
                if (AnonymousClass3om.m20771E(string)) {
                    try {
                        anonymousClass1XV3.f19767H = MediaCodec.createDecoderByType(string);
                        anonymousClass1XV3.f19767H.configure(mediaFormat, anonymousClass1XV3.f19784Y.f45140I, null, 0);
                        anonymousClass1XV3.f19767H.start();
                    } catch (Throwable e) {
                        anonymousClass42P = new AnonymousClass42P(e);
                        throw anonymousClass42P;
                    }
                }
                throw AnonymousClass42P.m22248B(string);
            }
            int i2 = -1;
            int integer = mediaFormat.containsKey(TraceFieldType.Bitrate) ? mediaFormat.getInteger(TraceFieldType.Bitrate) : -1;
            if (A.containsKey(TraceFieldType.Bitrate)) {
                i2 = A.getInteger(TraceFieldType.Bitrate);
            }
            anonymousClass0OA.f3803Q = new AnonymousClass1Kk(integer, i2);
            anonymousClass3p2.f44882B.f19777R = true;
            anonymousClass3p2.f44882B.f19783X = (long) (anonymousClass3p2.f44885E.f44910L * JsonMappingException.MAX_REFS_TO_LIST);
            anonymousClass3p2.f44882B.f19794i = anonymousClass3p2.f44882B.f19783X;
            anonymousClass3p2.f44882B.f19770K = (long) (anonymousClass3p2.f44885E.f44902D * JsonMappingException.MAX_REFS_TO_LIST);
            Long.valueOf(anonymousClass3p2.f44882B.f19794i);
            Long.valueOf(anonymousClass3p2.f44882B.f19770K);
            switch (AnonymousClass3p6.f44890B[anonymousClass3p2.f44882B.f19789d.f29631C.ordinal()]) {
                case 1:
                    anonymousClass3p2.f44882B.f19794i += anonymousClass3p2.f44882B.f19789d.f29630B;
                    Long.valueOf(anonymousClass3p2.f44882B.f19794i);
                    break;
                case 2:
                    break;
                case 3:
                    anonymousClass3p2.f44882B.f19764E.DF(anonymousClass3p2.f44885E.f44906H.getPath());
                    AnonymousClass1XV.F(anonymousClass3p2.f44882B, null);
                    break;
                case 4:
                    AnonymousClass1XV.F(anonymousClass3p2.f44882B, null);
                    break;
                default:
                    break;
            }
            anonymousClass3p2.f44882B.f19764E.DF(anonymousClass3p2.f44885E.f44906H.getPath());
            AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass3p3(anonymousClass3p2.f44882B), -768453883);
            AnonymousClass1XV anonymousClass1XV4 = anonymousClass3p2.f44882B;
            AnonymousClass0OR.D(anonymousClass1XV4.f19774O, new AnonymousClass3p4(anonymousClass1XV4), -1054978552);
            AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass3p5(anonymousClass3p2.f44882B, anonymousClass0OA), 1268186799);
            AnonymousClass3p7.m20799D(anonymousClass3p2.f44882B.f19790e);
        } catch (Throwable e2) {
            anonymousClass42P = new AnonymousClass42P(e2);
        } catch (Throwable e22) {
            AnonymousClass1XV.F(anonymousClass3p2.f44882B, e22);
        }
    }
}
