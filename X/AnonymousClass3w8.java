package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Xml;
import com.facebook.common.dextricks.DexStore;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.webrtc.audio.WebRtcAudioRecord;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.3w8 */
public class AnonymousClass3w8 extends DefaultHandler implements AnonymousClass2yN {
    /* renamed from: D */
    private static final Pattern f47120D = Pattern.compile("CC([1-4])=.*");
    /* renamed from: E */
    private static final Pattern f47121E = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    /* renamed from: F */
    private static final Pattern f47122F = Pattern.compile("(\\d+)(?:/(\\d+))?");
    /* renamed from: B */
    public final String f47123B;
    /* renamed from: C */
    private final XmlPullParserFactory f47124C;

    public AnonymousClass3w8() {
        this(null);
    }

    public AnonymousClass3w8(String str) {
        this.f47123B = str;
        try {
            this.f47124C = XmlPullParserFactory.newInstance();
        } catch (String str2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", str2);
        }
    }

    /* renamed from: A */
    public AnonymousClass2xJ mo5270A(AnonymousClass2xE anonymousClass2xE, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        Format format = anonymousClass2xE.f36196E;
        if (anonymousClass2xE.f36195D != null) {
            str2 = anonymousClass2xE.f36195D;
        }
        List list = anonymousClass2xE.f36194C;
        list.addAll(arrayList);
        if (!list.isEmpty()) {
            AnonymousClass3w8.m21583E(list);
            format = format.m17677A(new DrmInitData(str2, list));
        }
        List list2 = anonymousClass2xE.f36197F;
        list2.addAll(arrayList2);
        return AnonymousClass2xJ.m17912B(str, anonymousClass2xE.f36198G, format, anonymousClass2xE.f36193B, anonymousClass2xE.f36199H, list2);
    }

    /* renamed from: B */
    public final AnonymousClass3w7 m21604B(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f47124C.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                AnonymousClass2uR anonymousClass2uR;
                String uri2 = uri.toString();
                long M = AnonymousClass3w8.m21591M(newPullParser, "availabilityStartTime", -9223372036854775807L);
                long P = AnonymousClass3w8.m21594P(newPullParser, "mediaPresentationDuration", -9223372036854775807L);
                long P2 = AnonymousClass3w8.m21594P(newPullParser, "minBufferTime", -9223372036854775807L);
                String attributeValue = newPullParser.getAttributeValue(null, "type");
                Object obj = null;
                boolean z = attributeValue != null && "dynamic".equals(attributeValue);
                long P3 = z ? AnonymousClass3w8.m21594P(newPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
                long P4 = z ? AnonymousClass3w8.m21594P(newPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
                long P5 = z ? AnonymousClass3w8.m21594P(newPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
                long M2 = AnonymousClass3w8.m21591M(newPullParser, "publishTime", -9223372036854775807L);
                List arrayList = new ArrayList();
                long j = z ? -9223372036854775807L : 0;
                Object obj2 = null;
                AnonymousClass2xN anonymousClass2xN = null;
                uri = null;
                do {
                    newPullParser.next();
                    if (AnonymousClass2yj.m18114E(newPullParser, "BaseURL")) {
                        if (obj == null) {
                            uri2 = AnonymousClass3w8.m21586H(newPullParser, uri2);
                            obj = 1;
                        }
                    } else if (AnonymousClass2yj.m18114E(newPullParser, "UTCTiming")) {
                        AnonymousClass2xN anonymousClass2xN2 = new AnonymousClass2xN(newPullParser.getAttributeValue(null, "schemeIdUri"), newPullParser.getAttributeValue(null, "value"));
                    } else if (AnonymousClass2yj.m18114E(newPullParser, "Location")) {
                        uri = Uri.parse(newPullParser.nextText());
                    } else if (AnonymousClass2yj.m18114E(newPullParser, "Period") && r22 == null) {
                        String str = uri2;
                        String attributeValue2 = newPullParser.getAttributeValue(null, "id");
                        long P6 = AnonymousClass3w8.m21594P(newPullParser, "start", j);
                        long P7 = AnonymousClass3w8.m21594P(newPullParser, TraceFieldType.Duration, -9223372036854775807L);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2 = new ArrayList();
                        Object obj3 = null;
                        AnonymousClass3wC anonymousClass3wC = null;
                        do {
                            newPullParser.next();
                            if (AnonymousClass2yj.m18114E(newPullParser, "BaseURL")) {
                                if (obj3 == null) {
                                    str = AnonymousClass3w8.m21586H(newPullParser, str);
                                    obj3 = 1;
                                }
                            } else if (AnonymousClass2yj.m18114E(newPullParser, "AdaptationSet")) {
                                XmlPullParser xmlPullParser = newPullParser;
                                AnonymousClass3w8 anonymousClass3w8 = this;
                                int S = AnonymousClass3w8.m21597S(newPullParser, "id", -1);
                                int L = AnonymousClass3w8.m21590L(xmlPullParser);
                                String attributeValue3 = newPullParser.getAttributeValue(null, "mimeType");
                                String attributeValue4 = newPullParser.getAttributeValue(null, "codecs");
                                int S2 = AnonymousClass3w8.m21597S(newPullParser, "width", -1);
                                int S3 = AnonymousClass3w8.m21597S(newPullParser, "height", -1);
                                float R = AnonymousClass3w8.m21596R(newPullParser, -1.0f);
                                int S4 = AnonymousClass3w8.m21597S(newPullParser, "audioSamplingRate", -1);
                                r41 = newPullParser.getAttributeValue(null, "lang");
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3 = new ArrayList();
                                arrayList3 = new ArrayList();
                                arrayList3 = new ArrayList();
                                arrayList3 = new ArrayList();
                                String str2 = str;
                                AnonymousClass3wC anonymousClass3wC2 = anonymousClass3wC;
                                String str3 = null;
                                Object obj4 = null;
                                int i = 0;
                                int i2 = -1;
                                do {
                                    xmlPullParser.next();
                                    if (AnonymousClass2yj.m18114E(newPullParser, "BaseURL")) {
                                        if (obj4 == null) {
                                            str2 = AnonymousClass3w8.m21586H(newPullParser, str2);
                                            obj4 = 1;
                                        }
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "ContentProtection")) {
                                        Pair K = AnonymousClass3w8.m21589K(xmlPullParser);
                                        if (K.first != null) {
                                            str3 = (String) K.first;
                                        }
                                        if (K.second != null) {
                                            arrayList3.add(K.second);
                                        }
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "ContentComponent")) {
                                        r41 = AnonymousClass3w8.m21582D(r41, newPullParser.getAttributeValue(null, "lang"));
                                        L = AnonymousClass3w8.m21581C(L, AnonymousClass3w8.m21590L(xmlPullParser));
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "Role")) {
                                        attributeValue = AnonymousClass3w8.m21599U(newPullParser, "schemeIdUri", null);
                                        r2 = AnonymousClass3w8.m21599U(newPullParser, "value", null);
                                        do {
                                            newPullParser.next();
                                        } while (!AnonymousClass2yj.m18112C(newPullParser, "Role"));
                                        r0 = ("urn:mpeg:dash:role:2011".equals(attributeValue) && "main".equals(r2)) ? 1 : 0;
                                        i |= r0;
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "AudioChannelConfiguration")) {
                                        i2 = AnonymousClass3w8.m21585G(xmlPullParser);
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "Accessibility")) {
                                        arrayList3.add(AnonymousClass3w8.m21592N(newPullParser, "Accessibility"));
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "SupplementalProperty")) {
                                        arrayList3.add(AnonymousClass3w8.m21592N(newPullParser, "SupplementalProperty"));
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "Representation")) {
                                        AnonymousClass2xL anonymousClass3wC3;
                                        String str4 = str2;
                                        XmlPullParser xmlPullParser2 = newPullParser;
                                        int i3 = S2;
                                        int i4 = S3;
                                        float f = R;
                                        int i5 = i2;
                                        int i6 = S4;
                                        String str5 = r41;
                                        int i7 = i;
                                        ArrayList arrayList4 = arrayList3;
                                        AnonymousClass3wC anonymousClass3wC4 = anonymousClass3wC2;
                                        AnonymousClass3w8 anonymousClass3w82 = this;
                                        attributeValue = null;
                                        String attributeValue5 = newPullParser.getAttributeValue(null, "id");
                                        int S5 = AnonymousClass3w8.m21597S(newPullParser, "bandwidth", -1);
                                        String U = AnonymousClass3w8.m21599U(newPullParser, "mimeType", attributeValue3);
                                        XmlPullParser xmlPullParser3 = newPullParser;
                                        String U2 = AnonymousClass3w8.m21599U(xmlPullParser3, "codecs", attributeValue4);
                                        int S6 = AnonymousClass3w8.m21597S(xmlPullParser3, "width", i3);
                                        int S7 = AnonymousClass3w8.m21597S(newPullParser, "height", i4);
                                        float R2 = AnonymousClass3w8.m21596R(newPullParser, f);
                                        int S8 = AnonymousClass3w8.m21597S(newPullParser, "audioSamplingRate", i6);
                                        String U3 = AnonymousClass3w8.m21599U(newPullParser, "FBQualityLabel", null);
                                        r2 = AnonymousClass3w8.m21599U(newPullParser, "FBAbrPolicyTags", null);
                                        Object obj5 = null;
                                        boolean z2 = r2 != null && r2.contains("hvq_mobile_landscape");
                                        boolean z3 = r2 != null && r2.contains("hvq_mobile_portrait");
                                        boolean z4 = r2 != null && r2.contains("avoid_on_cellular");
                                        boolean z5 = r2 != null && r2.contains("avoid_on_cellular_intentional");
                                        ArrayList arrayList5 = new ArrayList();
                                        ArrayList arrayList6 = new ArrayList();
                                        ArrayList arrayList7 = new ArrayList();
                                        do {
                                            xmlPullParser2.next();
                                            if (AnonymousClass2yj.m18114E(newPullParser, "BaseURL")) {
                                                if (obj5 == null) {
                                                    str4 = AnonymousClass3w8.m21586H(newPullParser, str4);
                                                    obj5 = 1;
                                                }
                                            } else if (AnonymousClass2yj.m18114E(newPullParser, "AudioChannelConfiguration")) {
                                                i5 = AnonymousClass3w8.m21585G(xmlPullParser2);
                                            } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentBase")) {
                                                anonymousClass3wC4 = mo5271D(newPullParser, anonymousClass3wC4);
                                            } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentList")) {
                                                anonymousClass3wC4 = m21607E(newPullParser, (AnonymousClass44A) anonymousClass3wC4);
                                            } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentTemplate")) {
                                                anonymousClass3wC4 = m21608F(newPullParser, (AnonymousClass44B) anonymousClass3wC4);
                                            } else if (AnonymousClass2yj.m18114E(newPullParser, "ContentProtection")) {
                                                Pair K2 = AnonymousClass3w8.m21589K(xmlPullParser2);
                                                if (K2.first != null) {
                                                    attributeValue = (String) K2.first;
                                                }
                                                if (K2.second != null) {
                                                    arrayList5.add(K2.second);
                                                }
                                            } else if (AnonymousClass2yj.m18114E(newPullParser, "InbandEventStream")) {
                                                arrayList6.add(AnonymousClass3w8.m21592N(newPullParser, "InbandEventStream"));
                                            } else if (AnonymousClass2yj.m18114E(newPullParser, "SupplementalProperty")) {
                                                arrayList7.add(AnonymousClass3w8.m21592N(newPullParser, "SupplementalProperty"));
                                            }
                                        } while (!AnonymousClass2yj.m18112C(newPullParser, "Representation"));
                                        Format B = AnonymousClass3w8.m21580B(attributeValue5, U, S6, S7, R2, i5, S8, S5, str5, i7, arrayList4, U2, arrayList7, U3, z2, z3, z4, z5);
                                        if (anonymousClass3wC3 == null) {
                                            anonymousClass3wC3 = new AnonymousClass3wC();
                                        }
                                        AnonymousClass2xE anonymousClass2xE = new AnonymousClass2xE(B, str4, anonymousClass3wC3, attributeValue, arrayList5, arrayList6, -1);
                                        L = AnonymousClass3w8.m21581C(L, AnonymousClass3w8.m21584F(anonymousClass2xE.f36196E));
                                        arrayList3.add(anonymousClass2xE);
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentBase")) {
                                        anonymousClass3wC2 = mo5271D(newPullParser, anonymousClass3wC2);
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentList")) {
                                        anonymousClass3wC2 = m21607E(newPullParser, (AnonymousClass44A) anonymousClass3wC2);
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentTemplate")) {
                                        anonymousClass3wC2 = m21608F(newPullParser, (AnonymousClass44B) anonymousClass3wC2);
                                    } else if (AnonymousClass2yj.m18114E(newPullParser, "InbandEventStream")) {
                                        arrayList3.add(AnonymousClass3w8.m21592N(newPullParser, "InbandEventStream"));
                                    } else {
                                        boolean D = AnonymousClass2yj.m18113D(xmlPullParser);
                                    }
                                } while (!AnonymousClass2yj.m18112C(newPullParser, "AdaptationSet"));
                                List arrayList8 = new ArrayList(arrayList3.size());
                                for (r1 = 0; r1 < arrayList3.size(); r1++) {
                                    arrayList8.add(mo5270A((AnonymousClass2xE) arrayList3.get(r1), this.f47123B, str3, arrayList3, arrayList3));
                                }
                                arrayList2.add(new AnonymousClass2xD(S, L, arrayList8, arrayList3, arrayList3));
                            } else if (AnonymousClass2yj.m18114E(newPullParser, "EventStream")) {
                                String str6 = JsonProperty.USE_DEFAULT_NAME;
                                String U4 = AnonymousClass3w8.m21599U(newPullParser, "schemeIdUri", str6);
                                String U5 = AnonymousClass3w8.m21599U(newPullParser, "value", str6);
                                long T = AnonymousClass3w8.m21598T(newPullParser, "timescale", 1);
                                List arrayList9 = new ArrayList();
                                OutputStream byteArrayOutputStream = new ByteArrayOutputStream(DexStore.LOAD_RESULT_DEX2OAT_QUICKENED);
                                do {
                                    newPullParser.next();
                                    if (AnonymousClass2yj.m18114E(newPullParser, "Event")) {
                                        r41 = U4;
                                        String str7 = U5;
                                        long j2 = T;
                                        long T2 = AnonymousClass3w8.m21598T(newPullParser, "id", 0);
                                        long T3 = AnonymousClass3w8.m21598T(newPullParser, TraceFieldType.Duration, -9223372036854775807L);
                                        long T4 = AnonymousClass3w8.m21598T(newPullParser, "presentationTime", 0);
                                        long a = AnonymousClass2yi.m18106a(T3, 1000, j2);
                                        long a2 = AnonymousClass2yi.m18106a(T4, 1000000, j2);
                                        byteArrayOutputStream.reset();
                                        XmlSerializer newSerializer = Xml.newSerializer();
                                        newSerializer.setOutput(byteArrayOutputStream, null);
                                        while (true) {
                                            newPullParser.nextToken();
                                            if (!AnonymousClass2yj.m18112C(newPullParser, "Event")) {
                                                r1 = 0;
                                                switch (newPullParser.getEventType()) {
                                                    case 0:
                                                        newSerializer.startDocument(null, Boolean.valueOf(false));
                                                        break;
                                                    case 1:
                                                        newSerializer.endDocument();
                                                        break;
                                                    case 2:
                                                        newSerializer.startTag(newPullParser.getNamespace(), newPullParser.getName());
                                                        while (r1 < newPullParser.getAttributeCount()) {
                                                            newSerializer.attribute(newPullParser.getAttributeNamespace(r1), newPullParser.getAttributeName(r1), newPullParser.getAttributeValue(r1));
                                                            r1++;
                                                        }
                                                        break;
                                                    case 3:
                                                        newSerializer.endTag(newPullParser.getNamespace(), newPullParser.getName());
                                                        break;
                                                    case 4:
                                                        newSerializer.text(newPullParser.getText());
                                                        break;
                                                    case 5:
                                                        newSerializer.cdsect(newPullParser.getText());
                                                        break;
                                                    case 6:
                                                        newSerializer.entityRef(newPullParser.getText());
                                                        break;
                                                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                                                        newSerializer.ignorableWhitespace(newPullParser.getText());
                                                        break;
                                                    case 8:
                                                        newSerializer.processingInstruction(newPullParser.getText());
                                                        break;
                                                    case 9:
                                                        newSerializer.comment(newPullParser.getText());
                                                        break;
                                                    case 10:
                                                        newSerializer.docdecl(newPullParser.getText());
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            newSerializer.flush();
                                            arrayList9.add(new EventMessage(r41, str7, a, T2, byteArrayOutputStream.toByteArray(), a2));
                                        }
                                    }
                                } while (!AnonymousClass2yj.m18112C(newPullParser, "EventStream"));
                                long[] jArr = new long[arrayList9.size()];
                                EventMessage[] eventMessageArr = new EventMessage[arrayList9.size()];
                                for (r0 = 0; r0 < arrayList9.size(); r0++) {
                                    EventMessage eventMessage = (EventMessage) arrayList9.get(r0);
                                    jArr[r0] = eventMessage.f46974E;
                                    eventMessageArr[r0] = eventMessage;
                                }
                                arrayList2.add(new AnonymousClass2xG(U4, U5, T, jArr, eventMessageArr));
                            } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentBase")) {
                                anonymousClass3wC = mo5271D(newPullParser, null);
                            } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentList")) {
                                anonymousClass3wC = m21607E(newPullParser, null);
                            } else if (AnonymousClass2yj.m18114E(newPullParser, "SegmentTemplate")) {
                                anonymousClass3wC = m21608F(newPullParser, null);
                            }
                        } while (!AnonymousClass2yj.m18112C(newPullParser, "Period"));
                        Pair create = Pair.create(new AnonymousClass2xH(attributeValue2, P6, arrayList2, arrayList2), Long.valueOf(P7));
                        AnonymousClass2xH anonymousClass2xH = (AnonymousClass2xH) create.first;
                        if (anonymousClass2xH.f36211E != -9223372036854775807L) {
                            j = ((Long) create.second).longValue();
                            if (j == -9223372036854775807L) {
                                j = -9223372036854775807L;
                            } else {
                                j += anonymousClass2xH.f36211E;
                            }
                            arrayList.add(anonymousClass2xH);
                        } else if (z) {
                            obj2 = 1;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unable to determine start of period ");
                            stringBuilder.append(arrayList.size());
                            anonymousClass2uR = new AnonymousClass2uR(stringBuilder.toString());
                        }
                    }
                    throw anonymousClass2uR;
                } while (!AnonymousClass2yj.m18112C(newPullParser, "MPD"));
                if (P == -9223372036854775807L && j != -9223372036854775807L) {
                    P = j;
                }
                if (!arrayList.isEmpty()) {
                    return new AnonymousClass3w7(M, P, P2, z, P3, P4, P5, M2, anonymousClass2xN, uri, arrayList);
                }
                anonymousClass2uR = new AnonymousClass2uR("No periods found.");
                throw anonymousClass2uR;
            }
            throw new AnonymousClass2uR("inputStream does not contain a valid media presentation description");
        } catch (Throwable e) {
            throw new AnonymousClass2uR(e);
        }
    }

    /* renamed from: B */
    public static final Format m21580B(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, int i6, List list, String str4, List list2, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        String str6 = str4;
        String str7 = str2;
        String W = AnonymousClass3w8.m21601W(str7, str6);
        int i7 = i6;
        String str8 = str3;
        int i8 = i5;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        String str9 = str5;
        String str10 = str;
        if (W != null) {
            if ("audio/eac3".equals(W)) {
                W = AnonymousClass3w8.m21595Q(list2);
            }
            if (AnonymousClass2yY.m18033J(W)) {
                return new Format(str10, str7, W, str6, i8, -1, i, i2, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i7, null, -1, Long.MAX_VALUE, null, null, null, str9, z8, z7, z6, z5);
            } else if (AnonymousClass2yY.m18031H(W)) {
                return new Format(str10, str7, W, str6, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, -1, -1, -1, i7, str8, -1, Long.MAX_VALUE, null, null, null);
            } else if (AnonymousClass3w8.m21602X(W)) {
                int I = "application/cea-608".equals(W) ? AnonymousClass3w8.m21587I(list) : "application/cea-708".equals(W) ? AnonymousClass3w8.m21588J(list) : -1;
                return new Format(str10, str7, W, str6, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i7, str8, I, Long.MAX_VALUE, null, null, null);
            }
        }
        return new Format(str10, str7, W, str6, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i7, str8, -1, Long.MAX_VALUE, null, null, null, str9, z8, z7, z6, z5);
    }

    public final /* bridge */ /* synthetic */ Object BHA(Uri uri, InputStream inputStream) {
        return m21604B(uri, inputStream);
    }

    /* renamed from: C */
    public static int m21581C(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        AnonymousClass2yO.m18017F(i == i2);
        return i;
    }

    /* renamed from: C */
    public final AnonymousClass2xI m21605C(XmlPullParser xmlPullParser, String str, String str2) {
        long parseLong;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            parseLong = Long.parseLong(split[0]);
            if (split.length == 2) {
                str = (Long.parseLong(split[1]) - parseLong) + 1;
                return new AnonymousClass2xI(attributeValue, parseLong, str);
            }
        }
        parseLong = 0;
        str = -1;
        return new AnonymousClass2xI(attributeValue, parseLong, str);
    }

    /* renamed from: D */
    public AnonymousClass3wC mo5271D(XmlPullParser xmlPullParser, AnonymousClass3wC anonymousClass3wC) {
        AnonymousClass2xL anonymousClass2xL = anonymousClass3wC;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long T = AnonymousClass3w8.m21598T(xmlPullParser2, "timescale", anonymousClass3wC != null ? anonymousClass2xL.f36225D : 1);
        long j = 0;
        long T2 = AnonymousClass3w8.m21598T(xmlPullParser2, "presentationTimeOffset", anonymousClass3wC != null ? anonymousClass2xL.f36224C : 0);
        long j2 = anonymousClass3wC != null ? anonymousClass2xL.f47133C : 0;
        if (anonymousClass3wC != null) {
            j = anonymousClass2xL.f47132B;
        }
        String str = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j2 = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - j2) + 1;
        }
        if (anonymousClass3wC != null) {
            str = anonymousClass2xL.f36223B;
        }
        do {
            xmlPullParser2.next();
            if (AnonymousClass2yj.m18114E(xmlPullParser2, "Initialization")) {
                str = m21605C(xmlPullParser2, "sourceURL", "range");
            }
        } while (!AnonymousClass2yj.m18112C(xmlPullParser2, "SegmentBase"));
        return new AnonymousClass3wC(str, T, T2, j2, j);
    }

    /* renamed from: D */
    public static String m21582D(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AnonymousClass2yO.m18017F(str.equals(str2));
        return str;
    }

    /* renamed from: E */
    public final AnonymousClass44A m21607E(XmlPullParser xmlPullParser, AnonymousClass44A anonymousClass44A) {
        long j = 1;
        AnonymousClass2xL anonymousClass2xL = anonymousClass44A;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long T = AnonymousClass3w8.m21598T(xmlPullParser2, "timescale", anonymousClass44A != null ? anonymousClass2xL.f36225D : 1);
        long T2 = AnonymousClass3w8.m21598T(xmlPullParser2, "presentationTimeOffset", anonymousClass44A != null ? anonymousClass2xL.f36224C : 0);
        long T3 = AnonymousClass3w8.m21598T(xmlPullParser2, TraceFieldType.Duration, anonymousClass44A != null ? anonymousClass2xL.f47129B : -9223372036854775807L);
        String str = "startNumber";
        if (anonymousClass44A != null) {
            j = anonymousClass2xL.f47131D;
        }
        long T4 = AnonymousClass3w8.m21598T(xmlPullParser2, str, j);
        List list = null;
        AnonymousClass2xI anonymousClass2xI = null;
        List list2 = null;
        do {
            xmlPullParser2.next();
            AnonymousClass3w8 anonymousClass3w8 = this;
            if (AnonymousClass2yj.m18114E(xmlPullParser2, "Initialization")) {
                anonymousClass2xI = m21605C(xmlPullParser2, "sourceURL", "range");
            } else if (AnonymousClass2yj.m18114E(xmlPullParser2, "SegmentTimeline")) {
                list2 = m21585G(xmlPullParser2);
            } else if (AnonymousClass2yj.m18114E(xmlPullParser2, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(m21605C(xmlPullParser2, "media", "mediaRange"));
            }
        } while (!AnonymousClass2yj.m18112C(xmlPullParser2, "SegmentList"));
        if (anonymousClass44A != null) {
            if (anonymousClass2xI == null) {
                anonymousClass2xI = anonymousClass2xL.f36223B;
            }
            if (list2 == null) {
                list2 = anonymousClass2xL.f47130C;
            }
            if (list == null) {
                list = anonymousClass2xL.f49408B;
            }
        }
        return new AnonymousClass44A(anonymousClass2xI, T, T2, T4, T3, list2, list);
    }

    /* renamed from: E */
    public static void m21583E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            SchemeData schemeData = (SchemeData) arrayList.get(size);
            if (!schemeData.m17769A()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    Object obj;
                    SchemeData schemeData2 = (SchemeData) arrayList.get(i);
                    if (schemeData2.m17769A() && !schemeData.m17769A()) {
                        UUID uuid = schemeData.f35785E;
                        if (!AnonymousClass2uA.f35532E.equals(schemeData2.f35785E)) {
                            if (!uuid.equals(schemeData2.f35785E)) {
                                obj = null;
                                if (obj != null) {
                                    obj = 1;
                                    if (obj == null) {
                                        arrayList.remove(size);
                                        break;
                                    }
                                }
                            }
                        }
                        obj = 1;
                        if (obj != null) {
                            obj = 1;
                            if (obj == null) {
                                arrayList.remove(size);
                                break;
                            }
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public static final int m21584F(Format format) {
        format = format.f35577a;
        if (!TextUtils.isEmpty(format)) {
            if (AnonymousClass2yY.m18033J(format)) {
                return 2;
            }
            if (AnonymousClass2yY.m18031H(format)) {
                return 1;
            }
            if (AnonymousClass3w8.m21602X(format)) {
                return 3;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public final AnonymousClass44B m21608F(XmlPullParser xmlPullParser, AnonymousClass44B anonymousClass44B) {
        long j = 1;
        AnonymousClass2xL anonymousClass2xL = anonymousClass44B;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long T = AnonymousClass3w8.m21598T(xmlPullParser2, "timescale", anonymousClass44B != null ? anonymousClass2xL.f36225D : 1);
        long T2 = AnonymousClass3w8.m21598T(xmlPullParser2, "presentationTimeOffset", anonymousClass44B != null ? anonymousClass2xL.f36224C : 0);
        long T3 = AnonymousClass3w8.m21598T(xmlPullParser2, TraceFieldType.Duration, anonymousClass44B != null ? anonymousClass2xL.f47129B : -9223372036854775807L);
        String str = "startNumber";
        if (anonymousClass44B != null) {
            j = anonymousClass2xL.f47131D;
        }
        long T4 = AnonymousClass3w8.m21598T(xmlPullParser2, str, j);
        AnonymousClass2xI anonymousClass2xI = null;
        AnonymousClass2xM V = AnonymousClass3w8.m21600V(xmlPullParser2, "media", anonymousClass44B != null ? anonymousClass2xL.f49410C : null);
        AnonymousClass2xM V2 = AnonymousClass3w8.m21600V(xmlPullParser2, "initialization", anonymousClass44B != null ? anonymousClass2xL.f49409B : null);
        List list = null;
        do {
            xmlPullParser2.next();
            AnonymousClass3w8 anonymousClass3w8 = this;
            if (AnonymousClass2yj.m18114E(xmlPullParser2, "Initialization")) {
                anonymousClass2xI = m21605C(xmlPullParser2, "sourceURL", "range");
            } else if (AnonymousClass2yj.m18114E(xmlPullParser2, "SegmentTimeline")) {
                list = m21585G(xmlPullParser2);
            }
        } while (!AnonymousClass2yj.m18112C(xmlPullParser2, "SegmentTemplate"));
        if (anonymousClass44B != null) {
            if (anonymousClass2xI == null) {
                anonymousClass2xI = anonymousClass2xL.f36223B;
            }
            if (list == null) {
                list = anonymousClass2xL.f47130C;
            }
        }
        return new AnonymousClass44B(anonymousClass2xI, T, T2, T4, T3, list, V2, V);
    }

    /* renamed from: G */
    public static final int m21585G(XmlPullParser xmlPullParser) {
        String U = AnonymousClass3w8.m21599U(xmlPullParser, "schemeIdUri", null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(U)) {
            i = AnonymousClass3w8.m21597S(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(U)) {
            i = AnonymousClass3w8.m21593O(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!AnonymousClass2yj.m18112C(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* renamed from: G */
    public final List m21609G(XmlPullParser xmlPullParser) {
        List arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (AnonymousClass2yj.m18114E(xmlPullParser, "S")) {
                j = AnonymousClass3w8.m21598T(xmlPullParser, "t", j);
                long T = AnonymousClass3w8.m21598T(xmlPullParser, "d", -9223372036854775807L);
                int i = 0;
                int S = AnonymousClass3w8.m21597S(xmlPullParser, "r", 0) + 1;
                while (i < S) {
                    arrayList.add(new AnonymousClass2xK(j, T));
                    j += T;
                    i++;
                }
            }
        } while (!AnonymousClass2yj.m18112C(xmlPullParser, "SegmentTimeline"));
        return arrayList.isEmpty() ? null : arrayList;
    }

    /* renamed from: H */
    public static String m21586H(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return AnonymousClass2yg.m18078B(str, xmlPullParser.getText());
    }

    /* renamed from: I */
    public static int m21587I(List list) {
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass2xF anonymousClass2xF = (AnonymousClass2xF) list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(anonymousClass2xF.f36201C) && anonymousClass2xF.f36202D != null) {
                Matcher matcher = f47120D.matcher(anonymousClass2xF.f36202D);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to parse CEA-608 channel number from: ");
                stringBuilder.append(anonymousClass2xF.f36202D);
                Log.w("MpdParser", stringBuilder.toString());
            }
        }
        return -1;
    }

    /* renamed from: J */
    public static int m21588J(List list) {
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass2xF anonymousClass2xF = (AnonymousClass2xF) list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(anonymousClass2xF.f36201C) && anonymousClass2xF.f36202D != null) {
                Matcher matcher = f47121E.matcher(anonymousClass2xF.f36202D);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to parse CEA-708 service block number from: ");
                stringBuilder.append(anonymousClass2xF.f36202D);
                Log.w("MpdParser", stringBuilder.toString());
            }
        }
        return -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: K */
    public static final android.util.Pair m21589K(org.xmlpull.v1.XmlPullParser r8) {
        /*
        r0 = "schemeIdUri";
        r6 = 0;
        r0 = r8.getAttributeValue(r6, r0);
        r7 = 0;
        if (r0 == 0) goto L_0x008a;
    L_0x000a:
        r2 = X.AnonymousClass2yi.m18110e(r0);
        r1 = r2.hashCode();
        r0 = 489446379; // 0x1d2c5beb float:2.281153E-21 double:2.418186413E-315;
        if (r1 == r0) goto L_0x0036;
    L_0x0017:
        r0 = 755418770; // 0x2d06c692 float:7.66111E-12 double:3.732264625E-315;
        if (r1 == r0) goto L_0x002c;
    L_0x001c:
        r0 = 1812765994; // 0x6c0c9d2a float:6.799672E26 double:8.956254016E-315;
        if (r1 == r0) goto L_0x0022;
    L_0x0021:
        goto L_0x0040;
    L_0x0022:
        r0 = "urn:mpeg:dash:mp4protection:2011";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0040;
    L_0x002a:
        r0 = 0;
        goto L_0x0041;
    L_0x002c:
        r0 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0040;
    L_0x0034:
        r0 = 2;
        goto L_0x0041;
    L_0x0036:
        r0 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0040;
    L_0x003e:
        r0 = 1;
        goto L_0x0041;
    L_0x0040:
        r0 = -1;
    L_0x0041:
        switch(r0) {
            case 0: goto L_0x004c;
            case 1: goto L_0x0048;
            case 2: goto L_0x0045;
            default: goto L_0x0044;
        };
    L_0x0044:
        goto L_0x008a;
    L_0x0045:
        r4 = X.AnonymousClass2uA.f35533F;
        goto L_0x004a;
    L_0x0048:
        r4 = X.AnonymousClass2uA.f35531D;
    L_0x004a:
        r1 = r6;
        goto L_0x008c;
    L_0x004c:
        r0 = "value";
        r5 = r8.getAttributeValue(r6, r0);
        r0 = "cenc:default_KID";
        r1 = r8.getAttributeValue(r6, r0);
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x0087;
    L_0x005e:
        r0 = "00000000-0000-0000-0000-000000000000";
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0087;
    L_0x0066:
        r0 = "\\s+";
        r3 = r1.split(r0);
        r0 = r3.length;
        r2 = new java.util.UUID[r0];
        r1 = 0;
    L_0x0070:
        r0 = r3.length;
        if (r1 >= r0) goto L_0x007e;
    L_0x0073:
        r0 = r3[r1];
        r0 = java.util.UUID.fromString(r0);
        r2[r1] = r0;
        r1 = r1 + 1;
        goto L_0x0070;
    L_0x007e:
        r0 = X.AnonymousClass2uA.f35530C;
        r1 = X.AnonymousClass2vo.m17819B(r0, r2, r6);
        r4 = X.AnonymousClass2uA.f35530C;
        goto L_0x008d;
    L_0x0087:
        r4 = r6;
        r1 = r6;
        goto L_0x008d;
    L_0x008a:
        r4 = r6;
        r1 = r6;
    L_0x008c:
        r5 = r6;
    L_0x008d:
        r3 = 0;
    L_0x008e:
        r8.next();
        r0 = "widevine:license";
        r0 = X.AnonymousClass2yj.m18114E(r8, r0);
        if (r0 == 0) goto L_0x00ad;
    L_0x0099:
        r0 = "robustness_level";
        r2 = r8.getAttributeValue(r6, r0);
        if (r2 == 0) goto L_0x00ab;
    L_0x00a1:
        r0 = "HW";
        r0 = r2.startsWith(r0);
        if (r0 == 0) goto L_0x00ab;
    L_0x00a9:
        r3 = 1;
        goto L_0x00fa;
    L_0x00ab:
        r3 = 0;
        goto L_0x00fa;
    L_0x00ad:
        if (r1 != 0) goto L_0x00fa;
    L_0x00af:
        r0 = "cenc:pssh";
        r0 = X.AnonymousClass2yj.m18114E(r8, r0);
        r2 = 4;
        if (r0 == 0) goto L_0x00d5;
    L_0x00b8:
        r0 = r8.next();
        if (r0 != r2) goto L_0x00d5;
    L_0x00be:
        r0 = r8.getText();
        r1 = android.util.Base64.decode(r0, r7);
        r4 = X.AnonymousClass2vo.m17820C(r1);
        if (r4 != 0) goto L_0x00fa;
    L_0x00cc:
        r1 = "MpdParser";
        r0 = "Skipping malformed cenc:pssh data";
        android.util.Log.w(r1, r0);
        r1 = r6;
        goto L_0x00fa;
    L_0x00d5:
        r0 = X.AnonymousClass2uA.f35531D;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x00fa;
    L_0x00dd:
        r0 = "mspr:pro";
        r0 = X.AnonymousClass2yj.m18114E(r8, r0);
        if (r0 == 0) goto L_0x00fa;
    L_0x00e5:
        r0 = r8.next();
        if (r0 != r2) goto L_0x00fa;
    L_0x00eb:
        r2 = X.AnonymousClass2uA.f35531D;
        r0 = r8.getText();
        r1 = android.util.Base64.decode(r0, r7);
        r0 = 0;
        r1 = X.AnonymousClass2vo.m17819B(r2, r0, r1);
    L_0x00fa:
        r0 = "ContentProtection";
        r0 = X.AnonymousClass2yj.m18112C(r8, r0);
        if (r0 == 0) goto L_0x008e;
    L_0x0102:
        if (r4 == 0) goto L_0x010b;
    L_0x0104:
        r6 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData;
        r0 = "video/mp4";
        r6.<init>(r4, r0, r1, r3);
    L_0x010b:
        r0 = android.util.Pair.create(r5, r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3w8.K(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: L */
    public static final int m21590L(XmlPullParser xmlPullParser) {
        xmlPullParser = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(xmlPullParser)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(xmlPullParser)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(xmlPullParser)) {
            return 2;
        }
        if ("text".equals(xmlPullParser)) {
            return 3;
        }
        return -1;
    }

    /* renamed from: M */
    public static long m21591M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return AnonymousClass2yi.m18102W(attributeValue);
    }

    /* renamed from: N */
    public static AnonymousClass2xF m21592N(XmlPullParser xmlPullParser, String str) {
        String U = AnonymousClass3w8.m21599U(xmlPullParser, "schemeIdUri", JsonProperty.USE_DEFAULT_NAME);
        String U2 = AnonymousClass3w8.m21599U(xmlPullParser, "value", null);
        String U3 = AnonymousClass3w8.m21599U(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!AnonymousClass2yj.m18112C(xmlPullParser, str));
        return new AnonymousClass2xF(U, U2, U3);
    }

    /* renamed from: O */
    public static int m21593O(XmlPullParser xmlPullParser) {
        xmlPullParser = AnonymousClass2yi.m18110e(xmlPullParser.getAttributeValue(null, "value"));
        if (xmlPullParser != null) {
            Object obj;
            int hashCode = xmlPullParser.hashCode();
            if (hashCode == 1596796) {
                if (xmlPullParser.equals("4000")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            return 1;
                        case 1:
                            return 2;
                        case 2:
                            return 6;
                        case 3:
                            return 8;
                        default:
                            break;
                    }
                }
            } else if (hashCode == 2937391) {
                if (xmlPullParser.equals("a000")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            return 1;
                        case 1:
                            return 2;
                        case 2:
                            return 6;
                        case 3:
                            return 8;
                        default:
                            break;
                    }
                }
            } else if (hashCode == 3094035) {
                if (xmlPullParser.equals("f801")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            return 1;
                        case 1:
                            return 2;
                        case 2:
                            return 6;
                        case 3:
                            return 8;
                        default:
                            break;
                    }
                }
            } else if (hashCode == 3133436) {
                if (xmlPullParser.equals("fa01")) {
                    obj = 3;
                    switch (obj) {
                        case null:
                            return 1;
                        case 1:
                            return 2;
                        case 2:
                            return 6;
                        case 3:
                            return 8;
                        default:
                            break;
                    }
                }
            }
            obj = -1;
            switch (obj) {
                case null:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 6;
                case 3:
                    return 8;
                default:
                    break;
            }
        }
        return -1;
    }

    /* renamed from: P */
    public static long m21594P(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return AnonymousClass2yi.m18103X(attributeValue);
    }

    /* renamed from: Q */
    public static String m21595Q(List list) {
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass2xF anonymousClass2xF = (AnonymousClass2xF) list.get(i);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(anonymousClass2xF.f36201C) && "ec+3".equals(anonymousClass2xF.f36202D)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: R */
    public static float m21596R(XmlPullParser xmlPullParser, float f) {
        CharSequence attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f47122F.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        xmlPullParser = Integer.parseInt(matcher.group(1));
        Object group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) xmlPullParser) / ((float) Integer.parseInt(group)) : (float) xmlPullParser;
    }

    /* renamed from: S */
    public static int m21597S(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* renamed from: T */
    public static long m21598T(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* renamed from: U */
    public static String m21599U(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: V */
    public static final AnonymousClass2xM m21600V(XmlPullParser xmlPullParser, String str, AnonymousClass2xM anonymousClass2xM) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return anonymousClass2xM;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = JsonProperty.USE_DEFAULT_NAME;
        int i = 0;
        int i2 = 0;
        while (i < attributeValue.length()) {
            xmlPullParser = attributeValue.indexOf("$", i);
            Object obj = -1;
            StringBuilder stringBuilder;
            if (xmlPullParser == -1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(strArr[i2]);
                stringBuilder.append(attributeValue.substring(i));
                strArr[i2] = stringBuilder.toString();
                i = attributeValue.length();
            } else {
                if (xmlPullParser != i) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(strArr[i2]);
                    stringBuilder.append(attributeValue.substring(i, xmlPullParser));
                    strArr[i2] = stringBuilder.toString();
                } else if (attributeValue.startsWith("$$", i)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(strArr[i2]);
                    stringBuilder.append("$");
                    strArr[i2] = stringBuilder.toString();
                    i += 2;
                } else {
                    int i3 = i + 1;
                    int indexOf = attributeValue.indexOf("$", i3);
                    str = attributeValue.substring(i3, indexOf);
                    if (str.equals("RepresentationID")) {
                        iArr[i2] = 1;
                    } else {
                        anonymousClass2xM = str.indexOf("%0");
                        String str2 = "%01d";
                        if (anonymousClass2xM != -1) {
                            str2 = str.substring(anonymousClass2xM);
                            if (!str2.endsWith("d")) {
                                xmlPullParser = new StringBuilder();
                                xmlPullParser.append(str2);
                                xmlPullParser.append("d");
                                str2 = xmlPullParser.toString();
                            }
                            str = str.substring(0, anonymousClass2xM);
                        }
                        anonymousClass2xM = str.hashCode();
                        if (anonymousClass2xM != -1950496919) {
                            if (anonymousClass2xM != 2606829) {
                                if (anonymousClass2xM == 38199441) {
                                    if (str.equals("Bandwidth")) {
                                        obj = 1;
                                    }
                                }
                            } else if (str.equals("Time")) {
                                obj = 2;
                            }
                        } else if (str.equals("Number")) {
                            obj = null;
                        }
                        switch (obj) {
                            case null:
                                iArr[i2] = 2;
                                break;
                            case 1:
                                iArr[i2] = 3;
                                break;
                            case 2:
                                iArr[i2] = 4;
                                break;
                            default:
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid template: ");
                                stringBuilder.append(attributeValue);
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        strArr2[i2] = str2;
                    }
                    i2++;
                    strArr[i2] = JsonProperty.USE_DEFAULT_NAME;
                    xmlPullParser = indexOf + 1;
                }
                i = xmlPullParser;
            }
        }
        return new AnonymousClass2xM(strArr, iArr, strArr2, i2);
    }

    /* renamed from: W */
    private static String m21601W(String str, String str2) {
        if (AnonymousClass2yY.m18031H(str)) {
            return AnonymousClass2yY.m18025B(str2);
        }
        if (AnonymousClass2yY.m18033J(str)) {
            return AnonymousClass2yY.m18030G(str2);
        }
        if (AnonymousClass3w8.m21602X(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if ("stpp".equals(str2)) {
                return "application/ttml+xml";
            }
            if ("wvtt".equals(str2)) {
                return "application/x-mp4-vtt";
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    /* renamed from: X */
    private static boolean m21602X(String str) {
        if (!(AnonymousClass2yY.m18032I(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str))) {
            if (!"application/cea-608".equals(str)) {
                return false;
            }
        }
        return true;
    }
}
