package X;

/* renamed from: X.0WB */
public final class AnonymousClass0WB {
    /* renamed from: B */
    private static final String f5934B = new String(Character.toChars(10084));

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static java.lang.String m5042B(boolean r12, X.AnonymousClass0Cm r13, X.AnonymousClass0W7 r14, android.content.res.Resources r15) {
        /*
        r4 = r14;
        if (r14 != 0) goto L_0x0006;
    L_0x0003:
        r0 = "";
        return r0;
    L_0x0006:
        r2 = r13;
        r6 = r13.m1037B();
        r14 = r14.m5017S(r6);
        r1 = X.AnonymousClass1Sp.f18836D;
        r0 = r4.f5915s;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r7 = 0;
        r5 = 1;
        r13 = 0;
        switch(r0) {
            case 1: goto L_0x04aa;
            case 2: goto L_0x047c;
            case 3: goto L_0x0477;
            case 4: goto L_0x0464;
            case 5: goto L_0x0444;
            case 6: goto L_0x0415;
            case 7: goto L_0x027b;
            case 8: goto L_0x0243;
            case 9: goto L_0x0237;
            case 10: goto L_0x0208;
            case 11: goto L_0x01d9;
            case 12: goto L_0x019d;
            case 13: goto L_0x0149;
            case 14: goto L_0x012f;
            case 15: goto L_0x0117;
            case 16: goto L_0x0110;
            case 17: goto L_0x010d;
            case 18: goto L_0x00db;
            case 19: goto L_0x00d4;
            case 20: goto L_0x004d;
            case 21: goto L_0x002f;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = X.AnonymousClass0CB.m834D();
        if (r0 != 0) goto L_0x04b1;
    L_0x0025:
        r1 = "DirectMessageStringExtractor";
        r0 = "Unhandled message type";
        X.AnonymousClass0Gn.m1876C(r1, r0);
        r0 = "";
        return r0;
    L_0x002f:
        if (r14 == 0) goto L_0x0039;
    L_0x0031:
        r0 = 2131690495; // 0x7f0f03ff float:1.9010035E38 double:1.053195041E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0039:
        r2 = 2131690477; // 0x7f0f03ed float:1.9009999E38 double:1.0531950323E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5011M();
        r0 = r0.uT();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x004d:
        r6 = r4.f5876F;
        r6 = (X.AnonymousClass0W8) r6;
        r1 = r6.f5924C;
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x005a;
    L_0x0059:
        return r1;
    L_0x005a:
        r0 = r4.m5011M();
        if (r0 != 0) goto L_0x006a;
    L_0x0060:
        r1 = "DirectMessageStringExtractor";
        r0 = "Missing user info on video call event";
        X.AnonymousClass0Gn.m1876C(r1, r0);
        r0 = "";
        return r0;
    L_0x006a:
        r0 = r4.m5011M();
        r2 = r0.uT();
        r0 = r6.f5923B;
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x00be;
            case 1: goto L_0x0092;
            case 2: goto L_0x007c;
            case 3: goto L_0x00a8;
            default: goto L_0x007b;
        };
    L_0x007b:
        goto L_0x0003;
    L_0x007c:
        if (r14 == 0) goto L_0x0086;
    L_0x007e:
        r0 = 2131690763; // 0x7f0f050b float:1.9010579E38 double:1.0531951736E-314;
        r0 = r15.getString(r0);
        goto L_0x0091;
    L_0x0086:
        r1 = 2131690758; // 0x7f0f0506 float:1.9010569E38 double:1.053195171E-314;
        r0 = new java.lang.Object[r5];
        r0[r13] = r2;
        r0 = r15.getString(r1, r0);
    L_0x0091:
        return r0;
    L_0x0092:
        if (r14 == 0) goto L_0x009c;
    L_0x0094:
        r0 = 2131690762; // 0x7f0f050a float:1.9010577E38 double:1.053195173E-314;
        r0 = r15.getString(r0);
        goto L_0x0091;
    L_0x009c:
        r1 = 2131690757; // 0x7f0f0505 float:1.9010567E38 double:1.0531951706E-314;
        r0 = new java.lang.Object[r5];
        r0[r13] = r2;
        r0 = r15.getString(r1, r0);
        goto L_0x0091;
    L_0x00a8:
        if (r14 == 0) goto L_0x00b2;
    L_0x00aa:
        r0 = 2131690761; // 0x7f0f0509 float:1.9010575E38 double:1.0531951726E-314;
        r0 = r15.getString(r0);
        goto L_0x0091;
    L_0x00b2:
        r1 = 2131690756; // 0x7f0f0504 float:1.9010565E38 double:1.05319517E-314;
        r0 = new java.lang.Object[r5];
        r0[r13] = r2;
        r0 = r15.getString(r1, r0);
        goto L_0x0091;
    L_0x00be:
        if (r14 == 0) goto L_0x00c8;
    L_0x00c0:
        r0 = 2131690764; // 0x7f0f050c float:1.901058E38 double:1.053195174E-314;
        r0 = r15.getString(r0);
        goto L_0x0091;
    L_0x00c8:
        r1 = 2131690759; // 0x7f0f0507 float:1.901057E38 double:1.0531951716E-314;
        r0 = new java.lang.Object[r5];
        r0[r13] = r2;
        r0 = r15.getString(r1, r0);
        goto L_0x0091;
    L_0x00d4:
        r0 = r4.f5876F;
        r0 = (X.AnonymousClass1dJ) r0;
        r0 = r0.f20728C;
        return r0;
    L_0x00db:
        if (r14 == 0) goto L_0x00e5;
    L_0x00dd:
        r0 = 2131690501; // 0x7f0f0405 float:1.9010047E38 double:1.053195044E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x00e5:
        if (r12 == 0) goto L_0x0105;
    L_0x00e7:
        r0 = r4.m5011M();
        r0 = r0.uT();
        if (r0 == 0) goto L_0x0105;
    L_0x00f1:
        r2 = 2131690485; // 0x7f0f03f5 float:1.9010015E38 double:1.053195036E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5011M();
        r0 = r0.uT();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x0105:
        r0 = 2131690451; // 0x7f0f03d3 float:1.9009946E38 double:1.0531950194E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x010d:
        r0 = f5934B;
        return r0;
    L_0x0110:
        r0 = r4.f5876F;
        r0 = (com.instagram.model.venue.Venue) r0;
        r0 = r0.f6716M;
        return r0;
    L_0x0117:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "#";
        r1.append(r0);
        r0 = r4.f5876F;
        r0 = (com.instagram.model.hashtag.Hashtag) r0;
        r0 = r0.f2793M;
        r1.append(r0);
        r0 = r1.toString();
        return r0;
    L_0x012f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "@";
        r1.append(r0);
        r0 = r4.f5876F;
        r0 = (X.AnonymousClass0Ci) r0;
        r0 = r0.uT();
        r1.append(r0);
        r0 = r1.toString();
        return r0;
    L_0x0149:
        r1 = r4.f5876F;
        r1 = (X.AnonymousClass0Yb) r1;
        r0 = r1.f6279D;
        if (r0 == 0) goto L_0x0166;
    L_0x0151:
        r0 = r1.f6279D;
        r0 = r0.f4174b;
        r1 = r0.getId();
        r0 = r4.m5011M();
        r0 = r0.getId();
        r0 = X.AnonymousClass0LQ.m2954B(r1, r0);
        goto L_0x0167;
    L_0x0166:
        r0 = 0;
    L_0x0167:
        if (r14 == 0) goto L_0x0177;
    L_0x0169:
        if (r0 == 0) goto L_0x016f;
    L_0x016b:
        r0 = 2131690565; // 0x7f0f0445 float:1.9010177E38 double:1.0531950757E-314;
        goto L_0x0172;
    L_0x016f:
        r0 = 2131690572; // 0x7f0f044c float:1.9010191E38 double:1.053195079E-314;
    L_0x0172:
        r0 = r15.getString(r0);
        return r0;
    L_0x0177:
        if (r12 == 0) goto L_0x0193;
    L_0x0179:
        if (r0 == 0) goto L_0x017f;
    L_0x017b:
        r2 = 2131690567; // 0x7f0f0447 float:1.9010181E38 double:1.0531950767E-314;
        goto L_0x0182;
    L_0x017f:
        r2 = 2131690569; // 0x7f0f0449 float:1.9010185E38 double:1.0531950777E-314;
    L_0x0182:
        r1 = new java.lang.Object[r5];
        r0 = r4.m5011M();
        r0 = r0.uT();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x0193:
        if (r0 == 0) goto L_0x0199;
    L_0x0195:
        r0 = 2131690566; // 0x7f0f0446 float:1.901018E38 double:1.053195076E-314;
        goto L_0x0172;
    L_0x0199:
        r0 = 2131690570; // 0x7f0f044a float:1.9010187E38 double:1.053195078E-314;
        goto L_0x0172;
    L_0x019d:
        r1 = r4.f5876F;
        r1 = (X.AnonymousClass4gY) r1;
        if (r1 == 0) goto L_0x01ad;
    L_0x01a3:
        r0 = r1.f56268B;
        if (r0 == 0) goto L_0x01ad;
    L_0x01a7:
        r0 = r1.f56268B;
        r7 = r0.MA();
    L_0x01ad:
        if (r7 == 0) goto L_0x01c5;
    L_0x01af:
        if (r14 == 0) goto L_0x01b5;
    L_0x01b1:
        r2 = 2131691290; // 0x7f0f071a float:1.9011648E38 double:1.053195434E-314;
        goto L_0x01b8;
    L_0x01b5:
        r2 = 2131691289; // 0x7f0f0719 float:1.9011646E38 double:1.0531954334E-314;
    L_0x01b8:
        r1 = new java.lang.Object[r5];
        r0 = r7.uT();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x01c5:
        if (r14 == 0) goto L_0x01d0;
    L_0x01c7:
        r0 = 2131690537; // 0x7f0f0429 float:1.901012E38 double:1.053195062E-314;
        r0 = r15.getString(r0);
        goto L_0x0091;
    L_0x01d0:
        r0 = 2131690536; // 0x7f0f0428 float:1.9010118E38 double:1.0531950614E-314;
        r0 = r15.getString(r0);
        goto L_0x0091;
    L_0x01d9:
        if (r14 == 0) goto L_0x01e3;
    L_0x01db:
        r0 = 2131690498; // 0x7f0f0402 float:1.9010041E38 double:1.0531950426E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x01e3:
        if (r12 == 0) goto L_0x0200;
    L_0x01e5:
        r0 = r4.m5011M();
        if (r0 != 0) goto L_0x01ec;
    L_0x01eb:
        goto L_0x0200;
    L_0x01ec:
        r2 = 2131690482; // 0x7f0f03f2 float:1.9010009E38 double:1.0531950347E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5011M();
        r0 = r0.uT();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x0200:
        r0 = 2131690472; // 0x7f0f03e8 float:1.9009989E38 double:1.05319503E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0208:
        if (r14 == 0) goto L_0x0212;
    L_0x020a:
        r0 = 2131690496; // 0x7f0f0400 float:1.9010037E38 double:1.0531950416E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0212:
        if (r12 == 0) goto L_0x022f;
    L_0x0214:
        r0 = r4.m5011M();
        if (r0 != 0) goto L_0x021b;
    L_0x021a:
        goto L_0x022f;
    L_0x021b:
        r2 = 2131690478; // 0x7f0f03ee float:1.901E38 double:1.0531950327E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5011M();
        r0 = r0.uT();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x022f:
        r0 = 2131690466; // 0x7f0f03e2 float:1.9009976E38 double:1.053195027E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0237:
        if (r14 == 0) goto L_0x023e;
    L_0x0239:
        r0 = 2131690564; // 0x7f0f0444 float:1.9010175E38 double:1.053195075E-314;
        goto L_0x0172;
    L_0x023e:
        r0 = 2131690563; // 0x7f0f0443 float:1.9010173E38 double:1.0531950747E-314;
        goto L_0x0172;
    L_0x0243:
        r0 = r4.f5876F;
        r0 = (X.AnonymousClass0YV) r0;
        if (r14 == 0) goto L_0x0259;
    L_0x0249:
        r1 = r0.f6274H;
        r0 = X.AnonymousClass0Zg.HIGHLIGHT;
        if (r1 != r0) goto L_0x0254;
    L_0x024f:
        r0 = 2131690708; // 0x7f0f04d4 float:1.9010467E38 double:1.0531951464E-314;
        goto L_0x0172;
    L_0x0254:
        r0 = 2131690716; // 0x7f0f04dc float:1.9010483E38 double:1.0531951503E-314;
        goto L_0x0172;
    L_0x0259:
        if (r12 == 0) goto L_0x026b;
    L_0x025b:
        r1 = r0.f6274H;
        r0 = X.AnonymousClass0Zg.HIGHLIGHT;
        if (r1 != r0) goto L_0x0266;
    L_0x0261:
        r2 = 2131690705; // 0x7f0f04d1 float:1.9010461E38 double:1.053195145E-314;
        goto L_0x0182;
    L_0x0266:
        r2 = 2131690713; // 0x7f0f04d9 float:1.9010477E38 double:1.053195149E-314;
        goto L_0x0182;
    L_0x026b:
        r1 = r0.f6274H;
        r0 = X.AnonymousClass0Zg.HIGHLIGHT;
        if (r1 != r0) goto L_0x0276;
    L_0x0271:
        r0 = 2131690706; // 0x7f0f04d2 float:1.9010463E38 double:1.0531951454E-314;
        goto L_0x0172;
    L_0x0276:
        r0 = 2131690714; // 0x7f0f04da float:1.901048E38 double:1.0531951493E-314;
        goto L_0x0172;
    L_0x027b:
        r4 = r4.f5876F;
        r4 = (X.AnonymousClass0YJ) r4;
        r1 = r4.f6264M;
        r0 = X.AnonymousClass1Eb.f15920D;
        if (r1 != r0) goto L_0x0287;
    L_0x0285:
        r12 = 1;
        goto L_0x0288;
    L_0x0287:
        r12 = 0;
    L_0x0288:
        r1 = r4.f6264M;
        r0 = X.AnonymousClass1Eb.f15921E;
        if (r1 != r0) goto L_0x02ac;
    L_0x028e:
        r0 = X.AnonymousClass0CC.Bg;
        r0 = r0.m845G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x02aa;
    L_0x029c:
        r0 = X.AnonymousClass0CC.Dg;
        r0 = r0.m845G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x02ac;
    L_0x02aa:
        r11 = 1;
        goto L_0x02ad;
    L_0x02ac:
        r11 = 0;
    L_0x02ad:
        r1 = r4.f6262K;
        r0 = X.AnonymousClass0Zg.HIGHLIGHT;
        r10 = r1.equals(r0);
        r1 = r6.getId();
        r0 = r4.f6261J;
        r9 = r1.equals(r0);
        r8 = X.AnonymousClass4gg.B(r2, r4);
        if (r8 == 0) goto L_0x02d1;
    L_0x02c5:
        r1 = r8.f56272D;
        r0 = "question";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02d1;
    L_0x02cf:
        r7 = 1;
        goto L_0x02d2;
    L_0x02d1:
        r7 = 0;
    L_0x02d2:
        if (r8 == 0) goto L_0x02e0;
    L_0x02d4:
        r1 = r8.f56272D;
        r0 = "poll";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02e0;
    L_0x02de:
        r6 = 1;
        goto L_0x02e1;
    L_0x02e0:
        r6 = 0;
    L_0x02e1:
        if (r8 == 0) goto L_0x02ef;
    L_0x02e3:
        r1 = r8.f56272D;
        r0 = "slider";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02ef;
    L_0x02ed:
        r2 = 1;
        goto L_0x02f0;
    L_0x02ef:
        r2 = 0;
    L_0x02f0:
        if (r8 == 0) goto L_0x02fe;
    L_0x02f2:
        r1 = r8.f56272D;
        r0 = "reaction";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02fe;
    L_0x02fc:
        r0 = 1;
        goto L_0x02ff;
    L_0x02fe:
        r0 = 0;
    L_0x02ff:
        if (r14 == 0) goto L_0x03a9;
    L_0x0301:
        if (r12 == 0) goto L_0x0329;
    L_0x0303:
        r0 = r4.m5287A();
        if (r0 == 0) goto L_0x0319;
    L_0x0309:
        r2 = 2131690490; // 0x7f0f03fa float:1.9010025E38 double:1.0531950387E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5287A();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x0319:
        r2 = 2131690491; // 0x7f0f03fb float:1.9010027E38 double:1.053195039E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5288B();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x0329:
        if (r11 == 0) goto L_0x0346;
    L_0x032b:
        r2 = 2131690492; // 0x7f0f03fc float:1.901003E38 double:1.0531950397E-314;
        r0 = 2;
        r1 = new java.lang.Object[r0];
        r0 = r4.f6256E;
        r0 = r0.MA();
        r0 = r0.uT();
        r1[r13] = r0;
        r0 = r4.f6263L;
        r1[r5] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x0346:
        if (r7 == 0) goto L_0x0350;
    L_0x0348:
        r0 = 2131690463; // 0x7f0f03df float:1.900997E38 double:1.0531950253E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0350:
        if (r6 == 0) goto L_0x035a;
    L_0x0352:
        r0 = 2131690462; // 0x7f0f03de float:1.9009968E38 double:1.053195025E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x035a:
        if (r2 == 0) goto L_0x0364;
    L_0x035c:
        r0 = 2131690465; // 0x7f0f03e1 float:1.9009974E38 double:1.0531950263E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0364:
        if (r0 == 0) goto L_0x036e;
    L_0x0366:
        r0 = 2131690464; // 0x7f0f03e0 float:1.9009972E38 double:1.053195026E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x036e:
        if (r10 == 0) goto L_0x0390;
    L_0x0370:
        if (r9 == 0) goto L_0x037a;
    L_0x0372:
        r0 = 2131690497; // 0x7f0f0401 float:1.901004E38 double:1.053195042E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x037a:
        r2 = 2131690494; // 0x7f0f03fe float:1.9010033E38 double:1.0531950407E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.f6256E;
        r0 = r0.MA();
        r0 = r0.uT();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x0390:
        if (r9 == 0) goto L_0x0393;
    L_0x0392:
        goto L_0x0372;
    L_0x0393:
        r2 = 2131690493; // 0x7f0f03fd float:1.9010031E38 double:1.05319504E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.f6256E;
        r0 = r0.MA();
        r0 = r0.uT();
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x03a9:
        if (r12 == 0) goto L_0x03c1;
    L_0x03ab:
        r0 = r4.m5287A();
        if (r0 == 0) goto L_0x03b9;
    L_0x03b1:
        r0 = 2131690475; // 0x7f0f03eb float:1.9009995E38 double:1.0531950313E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x03b9:
        r0 = 2131690450; // 0x7f0f03d2 float:1.9009944E38 double:1.053195019E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x03c1:
        if (r11 == 0) goto L_0x03d1;
    L_0x03c3:
        r2 = 2131690454; // 0x7f0f03d6 float:1.9009952E38 double:1.053195021E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.f6263L;
        r1[r13] = r0;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x03d1:
        if (r7 == 0) goto L_0x03db;
    L_0x03d3:
        r0 = 2131690456; // 0x7f0f03d8 float:1.9009956E38 double:1.053195022E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x03db:
        if (r6 == 0) goto L_0x03e5;
    L_0x03dd:
        r0 = 2131690455; // 0x7f0f03d7 float:1.9009954E38 double:1.0531950214E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x03e5:
        if (r2 == 0) goto L_0x03ef;
    L_0x03e7:
        r0 = 2131690458; // 0x7f0f03da float:1.900996E38 double:1.053195023E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x03ef:
        if (r0 == 0) goto L_0x03f9;
    L_0x03f1:
        r0 = 2131690457; // 0x7f0f03d9 float:1.9009958E38 double:1.0531950224E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x03f9:
        if (r10 == 0) goto L_0x0403;
    L_0x03fb:
        r0 = 2131690467; // 0x7f0f03e3 float:1.9009978E38 double:1.0531950273E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0403:
        if (r9 == 0) goto L_0x040d;
    L_0x0405:
        r0 = 2131690461; // 0x7f0f03dd float:1.9009966E38 double:1.0531950243E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x040d:
        r0 = 2131690460; // 0x7f0f03dc float:1.9009964E38 double:1.053195024E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0415:
        if (r14 == 0) goto L_0x041f;
    L_0x0417:
        r0 = 2131690499; // 0x7f0f0403 float:1.9010043E38 double:1.053195043E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x041f:
        if (r12 != 0) goto L_0x0429;
    L_0x0421:
        r0 = 2131690473; // 0x7f0f03e9 float:1.900999E38 double:1.0531950303E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0429:
        r2 = 2131690483; // 0x7f0f03f3 float:1.901001E38 double:1.053195035E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5011M();
        if (r0 != 0) goto L_0x0435;
    L_0x0434:
        goto L_0x043d;
    L_0x0435:
        r0 = r4.m5011M();
        r7 = r0.uT();
    L_0x043d:
        r1[r13] = r7;
        r0 = r15.getString(r2, r1);
        return r0;
    L_0x0444:
        if (r14 == 0) goto L_0x044e;
    L_0x0446:
        r0 = 2131690500; // 0x7f0f0404 float:1.9010045E38 double:1.0531950436E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x044e:
        if (r12 != 0) goto L_0x0458;
    L_0x0450:
        r0 = 2131690474; // 0x7f0f03ea float:1.9009993E38 double:1.053195031E-314;
        r0 = r15.getString(r0);
        return r0;
    L_0x0458:
        r2 = 2131690484; // 0x7f0f03f4 float:1.9010013E38 double:1.0531950357E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5011M();
        if (r0 != 0) goto L_0x0435;
    L_0x0463:
        goto L_0x043d;
    L_0x0464:
        if (r14 == 0) goto L_0x0468;
    L_0x0466:
        goto L_0x0372;
    L_0x0468:
        if (r12 != 0) goto L_0x046b;
    L_0x046a:
        goto L_0x03fb;
    L_0x046b:
        r2 = 2131690479; // 0x7f0f03ef float:1.9010003E38 double:1.053195033E-314;
        r1 = new java.lang.Object[r5];
        r0 = r4.m5011M();
        if (r0 != 0) goto L_0x0435;
    L_0x0476:
        goto L_0x043d;
    L_0x0477:
        r0 = X.AnonymousClass0WB.m5043C(r12, r6, r4, r15);
        return r0;
    L_0x047c:
        if (r12 == 0) goto L_0x04a4;
    L_0x047e:
        r0 = r4.m5011M();
        if (r0 == 0) goto L_0x04a4;
    L_0x0484:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r4.m5011M();
        r0 = r0.uT();
        r1.append(r0);
        r0 = ": ";
        r1.append(r0);
        r0 = r4.f5876F;
        r1.append(r0);
        r0 = r1.toString();
        goto L_0x0091;
    L_0x04a4:
        r0 = r4.f5876F;
        r0 = (java.lang.String) r0;
        goto L_0x0091;
    L_0x04aa:
        r0 = r4.f5876F;
        r0 = (X.AnonymousClass1dH) r0;
        r0 = r0.f20725C;
        return r0;
    L_0x04b1:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Unhandled message type";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0WB.B(boolean, X.0Cm, X.0W7, android.content.res.Resources):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    private static java.lang.String m5043C(boolean r7, X.AnonymousClass0Ci r8, X.AnonymousClass0W7 r9, android.content.res.Resources r10) {
        /*
        r0 = r9.f5876F;
        r0 = r0 instanceof X.AnonymousClass0X1;
        r5 = 1;
        r6 = 0;
        if (r0 == 0) goto L_0x0017;
    L_0x0008:
        r0 = r9.f5876F;
        r0 = (X.AnonymousClass0X1) r0;
        r0 = r0.f6085E;
        r1 = r0.TO();
        r0 = X.AnonymousClass0ON.PHOTO;
        if (r1 != r0) goto L_0x0023;
    L_0x0016:
        goto L_0x0021;
    L_0x0017:
        r0 = r9.f5876F;
        r0 = (X.AnonymousClass0WE) r0;
        r1 = r0.f5940D;
        r0 = X.AnonymousClass0ON.PHOTO;
        if (r1 != r0) goto L_0x0023;
    L_0x0021:
        r2 = 1;
        goto L_0x0024;
    L_0x0023:
        r2 = 0;
    L_0x0024:
        r0 = r9.m5017S(r8);
        if (r0 == 0) goto L_0x0098;
    L_0x002a:
        r1 = r9.m4993D();
        if (r1 != 0) goto L_0x0038;
    L_0x0030:
        r0 = 2131690700; // 0x7f0f04cc float:1.9010451E38 double:1.0531951424E-314;
        r0 = r10.getString(r0);
        return r0;
    L_0x0038:
        r0 = r1.f20737B;
        r0 = r0.m12644B();
        r4 = r10.getString(r0);
        r3 = r1.f20738C;
        r2 = r1.f20737B;
        if (r7 == 0) goto L_0x0086;
    L_0x0048:
        if (r3 <= 0) goto L_0x0086;
    L_0x004a:
        r1 = X.AnonymousClass1Sp.f18835C;
        r0 = r2.ordinal();
        r0 = r1[r0];
        switch(r0) {
            case 1: goto L_0x0076;
            case 2: goto L_0x0066;
            case 3: goto L_0x0056;
            default: goto L_0x0055;
        };
    L_0x0055:
        return r4;
    L_0x0056:
        r2 = 2131690770; // 0x7f0f0512 float:1.9010593E38 double:1.053195177E-314;
        r1 = new java.lang.Object[r5];
        r0 = java.lang.Integer.valueOf(r3);
        r1[r6] = r0;
        r0 = r10.getString(r2, r1);
        return r0;
    L_0x0066:
        r2 = 2131690768; // 0x7f0f0510 float:1.9010589E38 double:1.053195176E-314;
        r1 = new java.lang.Object[r5];
        r0 = java.lang.Integer.valueOf(r3);
        r1[r6] = r0;
        r0 = r10.getString(r2, r1);
        return r0;
    L_0x0076:
        r2 = 2131690766; // 0x7f0f050e float:1.9010585E38 double:1.053195175E-314;
        r1 = new java.lang.Object[r5];
        r0 = java.lang.Integer.valueOf(r3);
        r1[r6] = r0;
        r0 = r10.getString(r2, r1);
        return r0;
    L_0x0086:
        r0 = X.AnonymousClass1i0.RAVEN_DELIVERED;
        if (r2 != r0) goto L_0x0055;
    L_0x008a:
        r0 = r9.m5027c();
        if (r0 == 0) goto L_0x0055;
    L_0x0090:
        r0 = 2131690459; // 0x7f0f03db float:1.9009962E38 double:1.0531950234E-314;
        r0 = r10.getString(r0);
        return r0;
    L_0x0098:
        if (r7 == 0) goto L_0x00bc;
    L_0x009a:
        if (r2 == 0) goto L_0x00a0;
    L_0x009c:
        r2 = 2131690480; // 0x7f0f03f0 float:1.9010005E38 double:1.0531950337E-314;
        goto L_0x00a3;
    L_0x00a0:
        r2 = 2131690481; // 0x7f0f03f1 float:1.9010007E38 double:1.053195034E-314;
    L_0x00a3:
        r1 = new java.lang.Object[r5];
        r0 = r9.m5011M();
        if (r0 != 0) goto L_0x00ad;
    L_0x00ab:
        r0 = 0;
        goto L_0x00b5;
    L_0x00ad:
        r0 = r9.m5011M();
        r0 = r0.uT();
    L_0x00b5:
        r1[r6] = r0;
        r0 = r10.getString(r2, r1);
        return r0;
    L_0x00bc:
        r0 = r9.m5027c();
        if (r0 == 0) goto L_0x00e4;
    L_0x00c2:
        r1 = r9.m5014P();
        r0 = "story";
        if (r1 != r0) goto L_0x00d2;
    L_0x00ca:
        r0 = 2131690461; // 0x7f0f03dd float:1.9009966E38 double:1.0531950243E-314;
        r0 = r10.getString(r0);
        return r0;
    L_0x00d2:
        if (r2 == 0) goto L_0x00dc;
    L_0x00d4:
        r0 = 2131690469; // 0x7f0f03e5 float:1.9009982E38 double:1.0531950283E-314;
        r0 = r10.getString(r0);
        goto L_0x00e3;
    L_0x00dc:
        r0 = 2131690471; // 0x7f0f03e7 float:1.9009987E38 double:1.0531950293E-314;
        r0 = r10.getString(r0);
    L_0x00e3:
        return r0;
    L_0x00e4:
        if (r2 == 0) goto L_0x00ea;
    L_0x00e6:
        r0 = 2131690468; // 0x7f0f03e4 float:1.900998E38 double:1.053195028E-314;
        goto L_0x00ed;
    L_0x00ea:
        r0 = 2131690470; // 0x7f0f03e6 float:1.9009985E38 double:1.053195029E-314;
    L_0x00ed:
        r0 = r10.getString(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0WB.C(boolean, X.0Ci, X.0W7, android.content.res.Resources):java.lang.String");
    }
}
