package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.1Yk */
public final class AnonymousClass1Yk {
    /* renamed from: B */
    public static void m11852B(X.AnonymousClass0OA r8, X.AnonymousClass3Yc r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = r8.YC;
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r1 = 0;
        goto L_0x000e;
    L_0x000a:
        r1 = java.lang.String.valueOf(r2);
    L_0x000e:
        if (r1 == 0) goto L_0x0025;
    L_0x0010:
        r0 = "client_shared_at";
        r9.A(r0, r1);
        r4 = "client_timestamp";
        r2 = java.lang.System.currentTimeMillis();
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r0;
        r0 = java.lang.String.valueOf(r2);
        r9.A(r4, r0);
    L_0x0025:
        r0 = r8.SB;
        if (r0 == 0) goto L_0x005f;
    L_0x0029:
        r1 = "is_multi_upload";
        r0 = "1";
        r9.A(r1, r0);
        r1 = "multi_upload_session_id";
        r0 = r8.eC;
        r9.A(r1, r0);
        r2 = r8.fC;
        if (r2 == 0) goto L_0x005f;
    L_0x003b:
        r1 = "is_segmented_video";
        r0 = "1";
        r9.A(r1, r0);
        r1 = "segmented_video_group_id";
        r0 = r2.f27959C;
        r9.A(r1, r0);
        r1 = "segmented_video_index";
        r0 = r2.f27960D;
        r0 = java.lang.String.valueOf(r0);
        r9.A(r1, r0);
        r1 = "segmented_video_count";
        r0 = r2.f27958B;
        r0 = java.lang.String.valueOf(r0);
        r9.A(r1, r0);
    L_0x005f:
        r2 = r8.m3570P();
        if (r2 == 0) goto L_0x026d;
    L_0x0065:
        r0 = X.AnonymousClass15c.MENTION_RESHARE;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        r1 = r0 ^ 1;
        r0 = X.AnonymousClass15c.MENTION;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        r4 = 0;
        if (r0 == 0) goto L_0x0084;
    L_0x0082:
        if (r1 == 0) goto L_0x00af;
    L_0x0084:
        r0 = X.AnonymousClass15c.MENTION;
        r3 = r2.get(r0);
        r3 = (java.util.List) r3;
        if (r1 == 0) goto L_0x00a6;
    L_0x008e:
        r0 = X.AnonymousClass15c.MENTION_RESHARE;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.get(r4);
        r0 = (X.AnonymousClass0ZF) r0;
        r3.add(r0);
        r1 = "reshared_media_id";
        r0 = r0.f6304L;
        r9.A(r1, r0);
    L_0x00a6:
        r1 = "reel_mentions";
        r0 = X.AnonymousClass0ZF.m5342C(r3);
        r9.A(r1, r0);
    L_0x00af:
        r0 = X.AnonymousClass15c.HASHTAG;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00ce;
    L_0x00bd:
        r1 = "story_hashtags";
        r0 = X.AnonymousClass15c.HASHTAG;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
    L_0x00ce:
        r0 = X.AnonymousClass15c.LOCATION;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00ed;
    L_0x00dc:
        r1 = "story_locations";
        r0 = X.AnonymousClass15c.LOCATION;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
    L_0x00ed:
        r0 = X.AnonymousClass15c.PRODUCT;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x010c;
    L_0x00fb:
        r1 = "story_product_items";
        r0 = X.AnonymousClass15c.PRODUCT;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
    L_0x010c:
        r0 = X.AnonymousClass15c.POLLING;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x012b;
    L_0x011a:
        r1 = "story_polls";
        r0 = X.AnonymousClass15c.POLLING;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
    L_0x012b:
        r0 = X.AnonymousClass15c.QUESTION;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x014a;
    L_0x0139:
        r1 = "story_questions";
        r0 = X.AnonymousClass15c.QUESTION;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
    L_0x014a:
        r0 = X.AnonymousClass15c.SLIDER;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0169;
    L_0x0158:
        r1 = "story_sliders";
        r0 = X.AnonymousClass15c.SLIDER;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
    L_0x0169:
        r0 = X.AnonymousClass15c.MUSIC_OVERLAY;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x01d9;
    L_0x0177:
        r0 = X.AnonymousClass15c.MUSIC_OVERLAY;
        r3 = r2.get(r0);
        r3 = (java.util.List) r3;
        r1 = "story_music_stickers";
        r0 = X.AnonymousClass0ZF.m5342C(r3);
        r9.A(r1, r0);
        r0 = r3.get(r4);
        r0 = (X.AnonymousClass0ZF) r0;
        r0 = r0.f6306N;
        r7 = new X.2Fw;
        r3 = r0.f28175N;
        r1 = r0.f28174M;
        r0 = r0.f28168G;
        r7.<init>(r3, r1, r0);
        r5 = "story_music_metadata";
        r6 = new java.io.StringWriter;
        r6.<init>();
        r0 = X.AnonymousClass0Lm.f3274B;
        r3 = r0.createGenerator(r6);
        r3.writeStartObject();
        r0 = r7.f28157D;
        if (r0 == 0) goto L_0x01b6;
    L_0x01af:
        r1 = "audio_asset_id";
        r0 = r7.f28157D;
        r3.writeStringField(r1, r0);
    L_0x01b6:
        r0 = r7.f28156C;
        if (r0 == 0) goto L_0x01c1;
    L_0x01ba:
        r1 = "song_name";
        r0 = r7.f28156C;
        r3.writeStringField(r1, r0);
    L_0x01c1:
        r0 = r7.f28155B;
        if (r0 == 0) goto L_0x01cc;
    L_0x01c5:
        r1 = "artist_name";
        r0 = r7.f28155B;
        r3.writeStringField(r1, r0);
    L_0x01cc:
        r3.writeEndObject();
        r3.close();
        r0 = r6.toString();
        r9.A(r5, r0);
    L_0x01d9:
        r0 = X.AnonymousClass15c.MEDIA;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x01f8;
    L_0x01e7:
        r1 = "attached_media";
        r0 = X.AnonymousClass15c.MEDIA;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
    L_0x01f8:
        r0 = X.AnonymousClass15c.HIGHLIGHT;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0224;
    L_0x0206:
        r0 = X.AnonymousClass15c.HIGHLIGHT;
        r3 = r2.get(r0);
        r3 = (java.util.List) r3;
        r1 = "shared_highlight_id";
        r0 = r3.get(r4);
        r0 = (X.AnonymousClass0ZF) r0;
        r0 = r0.f6299G;
        r9.A(r1, r0);
        r1 = "story_highlight";
        r0 = X.AnonymousClass0ZF.m5342C(r3);
        r9.A(r1, r0);
    L_0x0224:
        r0 = X.AnonymousClass15c.SOUND_ON;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0243;
    L_0x0232:
        r1 = "story_sound_on";
        r0 = X.AnonymousClass15c.SOUND_ON;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
    L_0x0243:
        r0 = X.AnonymousClass15c.FRIEND_LIST;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x026d;
    L_0x0251:
        r1 = "story_friend_lists";
        r0 = X.AnonymousClass15c.FRIEND_LIST;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r0 = X.AnonymousClass0ZF.m5342C(r0);
        r9.A(r1, r0);
        r1 = "audience";
        r0 = X.AnonymousClass0ZS.FRIEND_LIST;
        r0 = r0.m5371A();
        r9.A(r1, r0);
    L_0x026d:
        r0 = r8.JC;
        if (r0 == 0) goto L_0x02b8;
    L_0x0271:
        r3 = "question_response_metadata";	 Catch:{ JSONException -> 0x02b8 }
        r5 = r8.JC;	 Catch:{ JSONException -> 0x02b8 }
        r4 = new java.io.StringWriter;	 Catch:{ JSONException -> 0x02b8 }
        r4.<init>();	 Catch:{ JSONException -> 0x02b8 }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ JSONException -> 0x02b8 }
        r2 = r0.createGenerator(r4);	 Catch:{ JSONException -> 0x02b8 }
        r2.writeStartObject();	 Catch:{ JSONException -> 0x02b8 }
        r0 = r5.f28221B;	 Catch:{ JSONException -> 0x02b8 }
        if (r0 == 0) goto L_0x028e;	 Catch:{ JSONException -> 0x02b8 }
    L_0x0287:
        r1 = "original_question_id";	 Catch:{ JSONException -> 0x02b8 }
        r0 = r5.f28221B;	 Catch:{ JSONException -> 0x02b8 }
        r2.writeStringField(r1, r0);	 Catch:{ JSONException -> 0x02b8 }
    L_0x028e:
        r0 = r5.f28222C;	 Catch:{ JSONException -> 0x02b8 }
        if (r0 == 0) goto L_0x0299;	 Catch:{ JSONException -> 0x02b8 }
    L_0x0292:
        r1 = "question_response_id";	 Catch:{ JSONException -> 0x02b8 }
        r0 = r5.f28222C;	 Catch:{ JSONException -> 0x02b8 }
        r2.writeStringField(r1, r0);	 Catch:{ JSONException -> 0x02b8 }
    L_0x0299:
        r2.writeEndObject();	 Catch:{ JSONException -> 0x02b8 }
        r2.close();	 Catch:{ JSONException -> 0x02b8 }
        r2 = r4.toString();	 Catch:{ JSONException -> 0x02b8 }
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x02b8 }
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x02b8 }
        r0.<init>(r2);	 Catch:{ JSONException -> 0x02b8 }
        r0 = java.util.Collections.singletonList(r0);	 Catch:{ JSONException -> 0x02b8 }
        r1.<init>(r0);	 Catch:{ JSONException -> 0x02b8 }
        r0 = r1.toString();	 Catch:{ JSONException -> 0x02b8 }
        r9.A(r3, r0);	 Catch:{ JSONException -> 0x02b8 }
    L_0x02b8:
        r0 = r8.m3560F();
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x02d4;
    L_0x02c2:
        r2 = "caption_list";
        r1 = new org.json.JSONArray;
        r0 = r8.m3560F();
        r1.<init>(r0);
        r0 = r1.toString();
        r9.A(r2, r0);
    L_0x02d4:
        r0 = r8.KC;
        if (r0 == 0) goto L_0x02e0;
    L_0x02d8:
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x02e0;
    L_0x02de:
        r0 = 1;
        goto L_0x02e1;
    L_0x02e0:
        r0 = 0;
    L_0x02e1:
        if (r0 == 0) goto L_0x0311;
    L_0x02e3:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r8.KC;
        r1 = r0.iterator();
    L_0x02ee:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0302;
    L_0x02f4:
        r0 = r1.next();
        r0 = (X.AnonymousClass2ER) r0;
        r0 = r0.A();
        r2.add(r0);
        goto L_0x02ee;
    L_0x0302:
        r1 = "story_sticker_ids";
        r0 = ",";
        r0 = X.AnonymousClass0RR.m4157C(r0);
        r0 = r0.m4158A(r2);
        r9.A(r1, r0);
    L_0x0311:
        r0 = r8.jC;
        if (r0 == 0) goto L_0x031d;
    L_0x0315:
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x031d;
    L_0x031b:
        r0 = 1;
        goto L_0x031e;
    L_0x031d:
        r0 = 0;
    L_0x031e:
        if (r0 == 0) goto L_0x0330;
    L_0x0320:
        r2 = "rich_text_format_types";
        r1 = new org.json.JSONArray;
        r0 = r8.jC;
        r1.<init>(r0);
        r0 = r1.toString();
        r9.A(r2, r0);
    L_0x0330:
        r2 = r8.m3578X();
        r0 = r2.isEmpty();
        if (r0 != 0) goto L_0x0349;
    L_0x033a:
        r1 = "internal_features";
        r0 = ",";
        r0 = X.AnonymousClass0RR.m4157C(r0);
        r0 = r0.m4158A(r2);
        r9.A(r1, r0);
    L_0x0349:
        r0 = r8.f3832t;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0358;
    L_0x0351:
        r1 = "face_effect_id";
        r0 = r8.f3832t;
        r9.A(r1, r0);
    L_0x0358:
        r0 = r8.f3826n;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0367;
    L_0x0360:
        r1 = "effect_persisted_metadata";
        r0 = r8.f3826n;
        r9.A(r1, r0);
    L_0x0367:
        r0 = r8.f3806T;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0376;
    L_0x036f:
        r1 = "capture_type";
        r0 = r8.f3806T;
        r9.A(r1, r0);
    L_0x0376:
        r0 = r8.f3793G;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0385;
    L_0x037e:
        r1 = "app_attribution_android_namespace";
        r0 = r8.f3793G;
        r9.A(r1, r0);
    L_0x0385:
        r0 = r8.f3796J;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0394;
    L_0x038d:
        r1 = "attribution_content_url";
        r0 = r8.f3796J;
        r9.A(r1, r0);
    L_0x0394:
        r0 = r8.f3794H;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x03a3;
    L_0x039c:
        r1 = "archived_media_id";
        r0 = r8.f3794H;
        r9.A(r1, r0);
    L_0x03a3:
        r0 = r8.LC;
        if (r0 == 0) goto L_0x03af;
    L_0x03a7:
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x03af;
    L_0x03ad:
        r0 = 1;
        goto L_0x03b0;
    L_0x03af:
        r0 = 0;
    L_0x03b0:
        if (r0 == 0) goto L_0x0423;
    L_0x03b2:
        r4 = "story_cta";
        r6 = r8.LC;
        r5 = new java.io.StringWriter;
        r5.<init>();
        r0 = X.AnonymousClass0Lm.f3274B;
        r3 = r0.createGenerator(r5);
        r3.writeStartArray();
        r3.writeStartObject();
        r0 = "links";
        r3.writeArrayFieldStart(r0);
        r2 = 0;
        r0 = r6.get(r2);
        r0 = (X.AnonymousClass1D1) r0;
        r0 = r0.m9964B();
        if (r0 == 0) goto L_0x03ef;
    L_0x03d9:
        r3.writeStartObject();
        r1 = "webUri";
        r0 = r6.get(r2);
        r0 = (X.AnonymousClass1D1) r0;
        r0 = r0.m9964B();
        r3.writeStringField(r1, r0);
        r3.writeEndObject();
        goto L_0x0410;
    L_0x03ef:
        r0 = r6.get(r2);
        r0 = (X.AnonymousClass1D1) r0;
        r0 = r0.m9963A();
        if (r0 == 0) goto L_0x0410;
    L_0x03fb:
        r3.writeStartObject();
        r1 = "felix_video_id";
        r0 = r6.get(r2);
        r0 = (X.AnonymousClass1D1) r0;
        r0 = r0.m9963A();
        r3.writeStringField(r1, r0);
        r3.writeEndObject();
    L_0x0410:
        r3.writeEndArray();
        r3.writeEndObject();
        r3.writeEndArray();
        r3.close();
        r0 = r5.toString();
        r9.A(r4, r0);
    L_0x0423:
        r1 = r9.f42237D;
        r0 = X.AnonymousClass0OK.REEL_SHARE;
        if (r1 != r0) goto L_0x042c;
    L_0x0429:
        r3 = "1";
        goto L_0x045d;
    L_0x042c:
        r1 = r9.f42237D;
        r0 = X.AnonymousClass0OK.DIRECT_STORY_SHARE;
        if (r1 != r0) goto L_0x0435;
    L_0x0432:
        r3 = "2";
        goto L_0x0437;
    L_0x0435:
        r3 = "3";
    L_0x0437:
        r0 = r8.f3791E;
        if (r0 != 0) goto L_0x0440;
    L_0x043b:
        r0 = r8.f3824l;
        X.AnonymousClass1Yk.m11853C(r9, r0);
    L_0x0440:
        r2 = r8.f3823k;
        if (r2 == 0) goto L_0x0456;
    L_0x0444:
        r0 = r2.f15812C;
        if (r0 == 0) goto L_0x044f;
    L_0x0448:
        r1 = "reply_type";
        r0 = r2.f15812C;
        r9.A(r1, r0);
    L_0x044f:
        r0 = r2.f15811B;
        if (r0 == 0) goto L_0x0456;
    L_0x0453:
        r1 = r2.f15811B;
        goto L_0x0458;
    L_0x0456:
        r1 = "replayable";
    L_0x0458:
        r0 = "view_mode";
        r9.A(r0, r1);
    L_0x045d:
        r0 = r8.f3791E;
        if (r0 == 0) goto L_0x0468;
    L_0x0461:
        r1 = "allow_multi_configures";
        r0 = "1";
        r9.A(r1, r0);
    L_0x0468:
        r0 = "configure_mode";
        r9.A(r0, r3);
        r0 = r8.xB;
        if (r0 == 0) goto L_0x047c;
    L_0x0471:
        r1 = "add_to_highlights";
        r0 = r8.xB;
        r0 = X.AnonymousClass0PB.m3798C(r0);
        r9.B(r1, r0);
    L_0x047c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Yk.B(X.0OA, X.3Yc):void");
    }

    /* renamed from: C */
    public static void m11853C(AnonymousClass3Yc anonymousClass3Yc, List list) {
        String str = "thread_ids";
        JSONArray jSONArray = new JSONArray();
        for (DirectShareTarget C : list) {
            String C2 = C.m4805C();
            if (C2 != null) {
                jSONArray.put(C2);
            }
        }
        anonymousClass3Yc.A(str, jSONArray.toString());
        String str2 = "recipient_users";
        Iterable arrayList = new ArrayList();
        for (DirectShareTarget directShareTarget : list) {
            if (directShareTarget.m4805C() == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('[');
                stringBuilder.append(AnonymousClass0RR.m4156B(',').m4158A(directShareTarget.m4803A()));
                stringBuilder.append(']');
                arrayList.add(stringBuilder.toString());
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append('[');
        stringBuilder2.append(AnonymousClass0RR.m4156B(',').m4158A(arrayList));
        stringBuilder2.append(']');
        anonymousClass3Yc.A(str2, stringBuilder2.toString());
    }
}
