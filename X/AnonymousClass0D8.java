package X;

/* renamed from: X.0D8 */
public final class AnonymousClass0D8 {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static java.lang.String m1102B(java.lang.String r1) {
        /*
        r0 = r1.hashCode();
        switch(r0) {
            case -2099273442: goto L_0x04fa;
            case -2084134425: goto L_0x04ef;
            case -2039157120: goto L_0x04e4;
            case -1831813930: goto L_0x04d9;
            case -1739090202: goto L_0x04ce;
            case -1680134022: goto L_0x04c3;
            case -1507249578: goto L_0x04b8;
            case -1488483591: goto L_0x04ad;
            case -1280777695: goto L_0x04a2;
            case -1262367171: goto L_0x0497;
            case -1128332052: goto L_0x048c;
            case -977314478: goto L_0x0481;
            case -962087533: goto L_0x0475;
            case -947286519: goto L_0x0469;
            case -944391792: goto L_0x045d;
            case -897020359: goto L_0x0451;
            case -858888518: goto L_0x0445;
            case -834563796: goto L_0x0439;
            case -808070083: goto L_0x042d;
            case -806015212: goto L_0x0421;
            case -795137348: goto L_0x0415;
            case -732396026: goto L_0x040a;
            case -719656278: goto L_0x03fe;
            case -700883418: goto L_0x03f2;
            case -685187264: goto L_0x03e6;
            case -640104400: goto L_0x03da;
            case -612270739: goto L_0x03ce;
            case -607104567: goto L_0x03c2;
            case -507872062: goto L_0x03b6;
            case -463150147: goto L_0x03aa;
            case -447736923: goto L_0x039e;
            case -420549225: goto L_0x0392;
            case -351428652: goto L_0x0386;
            case -309425741: goto L_0x037a;
            case -305532775: goto L_0x036e;
            case -226861089: goto L_0x0362;
            case -161770613: goto L_0x0356;
            case -121704156: goto L_0x034a;
            case -93804585: goto L_0x033e;
            case -83857623: goto L_0x0332;
            case -29149890: goto L_0x0326;
            case -21464463: goto L_0x031a;
            case 98010: goto L_0x030f;
            case 3143491: goto L_0x0303;
            case 3482174: goto L_0x02f7;
            case 3539948: goto L_0x02eb;
            case 18261497: goto L_0x02df;
            case 38164588: goto L_0x02d3;
            case 60500516: goto L_0x02c7;
            case 97613200: goto L_0x02bb;
            case 102970551: goto L_0x02af;
            case 154711636: goto L_0x02a3;
            case 322728794: goto L_0x0297;
            case 353910297: goto L_0x028b;
            case 426816096: goto L_0x027f;
            case 474407600: goto L_0x0273;
            case 474408561: goto L_0x0267;
            case 474408592: goto L_0x025b;
            case 474408593: goto L_0x024f;
            case 474408594: goto L_0x0243;
            case 488365269: goto L_0x0238;
            case 503080810: goto L_0x022c;
            case 511046149: goto L_0x0220;
            case 512500291: goto L_0x0214;
            case 569142353: goto L_0x0208;
            case 596885413: goto L_0x01fc;
            case 656562322: goto L_0x01f0;
            case 818357554: goto L_0x01e4;
            case 828055196: goto L_0x01d8;
            case 878218353: goto L_0x01cc;
            case 978303937: goto L_0x01c0;
            case 988284984: goto L_0x01b4;
            case 1033199100: goto L_0x01a8;
            case 1047472087: goto L_0x019c;
            case 1077610435: goto L_0x0191;
            case 1103667135: goto L_0x0185;
            case 1138240432: goto L_0x0179;
            case 1156031681: goto L_0x016d;
            case 1210913926: goto L_0x0161;
            case 1211159225: goto L_0x0155;
            case 1311706228: goto L_0x0149;
            case 1354666246: goto L_0x013d;
            case 1363827503: goto L_0x0132;
            case 1374998964: goto L_0x0126;
            case 1418803097: goto L_0x011a;
            case 1428957523: goto L_0x010e;
            case 1474430409: goto L_0x0103;
            case 1526103215: goto L_0x00f7;
            case 1546955420: goto L_0x00eb;
            case 1584662397: goto L_0x00df;
            case 1616193763: goto L_0x00d4;
            case 1642880875: goto L_0x00c8;
            case 1644888755: goto L_0x00bc;
            case 1674313991: goto L_0x00b0;
            case 1693711107: goto L_0x00a4;
            case 1708186571: goto L_0x0098;
            case 1720765753: goto L_0x008c;
            case 1745383209: goto L_0x0080;
            case 1760941195: goto L_0x0074;
            case 1766595053: goto L_0x0068;
            case 1856358213: goto L_0x005c;
            case 1867933649: goto L_0x0050;
            case 1916425776: goto L_0x0044;
            case 1944311314: goto L_0x0038;
            case 2056107183: goto L_0x002c;
            case 2059219393: goto L_0x0020;
            case 2063020297: goto L_0x0014;
            case 2129113687: goto L_0x0009;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x0505;
    L_0x0009:
        r0 = "dextricks";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0011:
        r0 = 1;
        goto L_0x0506;
    L_0x0014:
        r0 = "folly_memory_mallctlhelperAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x001c:
        r0 = 29;
        goto L_0x0506;
    L_0x0020:
        r0 = "libraries_profilo_cpp_util_hooks";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0028:
        r0 = 77;
        goto L_0x0506;
    L_0x002c:
        r0 = "folly_stringAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0034:
        r0 = 48;
        goto L_0x0506;
    L_0x0038:
        r0 = "folly_portability_opensslAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0040:
        r0 = 33;
        goto L_0x0506;
    L_0x0044:
        r0 = "Reachability_ReachabilityAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x004c:
        r0 = 64;
        goto L_0x0506;
    L_0x0050:
        r0 = "libraries_profilo_cpp_util_util";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0058:
        r0 = 78;
        goto L_0x0506;
    L_0x005c:
        r0 = "profilo_threadmetadata";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0064:
        r0 = 91;
        goto L_0x0506;
    L_0x0068:
        r0 = "liger-native";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0070:
        r0 = 51;
        goto L_0x0506;
    L_0x0074:
        r0 = "folly_portability_sys_mmanAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x007c:
        r0 = 37;
        goto L_0x0506;
    L_0x0080:
        r0 = "libraries_profilo_cpp_writer_delta_visitor";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0088:
        r0 = 79;
        goto L_0x0506;
    L_0x008c:
        r0 = "third-party_librtmp_librtmpAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0094:
        r0 = 69;
        goto L_0x0506;
    L_0x0098:
        r0 = "folly_portability_sys_uioAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00a0:
        r0 = 41;
        goto L_0x0506;
    L_0x00a4:
        r0 = "third-party_opencv_opencv-coreAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00ac:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0506;
    L_0x00b0:
        r0 = "libraries_profilo_cpp_profiler_tracer_utils";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00b8:
        r0 = 75;
        goto L_0x0506;
    L_0x00bc:
        r0 = "folly_singletonAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00c4:
        r0 = 47;
        goto L_0x0506;
    L_0x00c8:
        r0 = "folly_portability_fcntlAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00d0:
        r0 = 32;
        goto L_0x0506;
    L_0x00d4:
        r0 = "jsc_delta_deltaAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00dc:
        r0 = 4;
        goto L_0x0506;
    L_0x00df:
        r0 = "folly_portability_timeAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00e7:
        r0 = 42;
        goto L_0x0506;
    L_0x00eb:
        r0 = "folly_f14_hashAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00f3:
        r0 = 20;
        goto L_0x0506;
    L_0x00f7:
        r0 = "profilo_stacktrace_artcompat";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x00ff:
        r0 = 89;
        goto L_0x0506;
    L_0x0103:
        r0 = "jscjsiAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x010b:
        r0 = 7;
        goto L_0x0506;
    L_0x010e:
        r0 = "proxygen-http";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0116:
        r0 = 53;
        goto L_0x0506;
    L_0x011a:
        r0 = "third-party_event_eventAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0122:
        r0 = 58;
        goto L_0x0506;
    L_0x0126:
        r0 = "folly_assumeAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x012e:
        r0 = 15;
        goto L_0x0506;
    L_0x0132:
        r0 = "jsc_fb_fbjscAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x013a:
        r0 = 5;
        goto L_0x0506;
    L_0x013d:
        r0 = "wtfAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0145:
        r0 = 8;
        goto L_0x0506;
    L_0x0149:
        r0 = "folly_portability_socketsAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0151:
        r0 = 34;
        goto L_0x0506;
    L_0x0155:
        r0 = "native_redex_shared_util";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x015d:
        r0 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        goto L_0x0506;
    L_0x0161:
        r0 = "native_redex_shared_mmap";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0169:
        r0 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        goto L_0x0506;
    L_0x016d:
        r0 = "folly_rangeAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0175:
        r0 = 45;
        goto L_0x0506;
    L_0x0179:
        r0 = "Statistics_StatisticsAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0181:
        r0 = 65;
        goto L_0x0506;
    L_0x0185:
        r0 = "folly_dynamicAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x018d:
        r0 = 18;
        goto L_0x0506;
    L_0x0191:
        r0 = "jsc_patch_patchAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0199:
        r0 = 6;
        goto L_0x0506;
    L_0x019c:
        r0 = "cryptox";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x01a4:
        r0 = 10;
        goto L_0x0506;
    L_0x01a8:
        r0 = "folly_portability_sys_fileAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x01b0:
        r0 = 36;
        goto L_0x0506;
    L_0x01b4:
        r0 = "folly_jsonAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x01bc:
        r0 = 27;
        goto L_0x0506;
    L_0x01c0:
        r0 = "folly_fbvectorAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x01c8:
        r0 = 21;
        goto L_0x0506;
    L_0x01cc:
        r0 = "folly_iobufAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x01d4:
        r0 = 26;
        goto L_0x0506;
    L_0x01d8:
        r0 = "libraries_profilo_cpp_logger_logger_static";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x01e0:
        r0 = 74;
        goto L_0x0506;
    L_0x01e4:
        r0 = "profilo_systemcounters";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x01ec:
        r0 = 90;
        goto L_0x0506;
    L_0x01f0:
        r0 = "double-conversion";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x01f8:
        r0 = 11;
        goto L_0x0506;
    L_0x01fc:
        r0 = "libraries_profilo_cpp_generated_cpp";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0204:
        r0 = 71;
        goto L_0x0506;
    L_0x0208:
        r0 = "android-reachability-announcer";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0210:
        r0 = 67;
        goto L_0x0506;
    L_0x0214:
        r0 = "native_redex_shared_quickening";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x021c:
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        goto L_0x0506;
    L_0x0220:
        r0 = "igardcache-jni";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0228:
        r0 = 99;
        goto L_0x0506;
    L_0x022c:
        r0 = "folly_thread_localAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0234:
        r0 = 50;
        goto L_0x0506;
    L_0x0238:
        r0 = "jscAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0240:
        r0 = 3;
        goto L_0x0506;
    L_0x0243:
        r0 = "profiloprofilerunwindc712";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x024b:
        r0 = 96;
        goto L_0x0506;
    L_0x024f:
        r0 = "profiloprofilerunwindc711";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0257:
        r0 = 95;
        goto L_0x0506;
    L_0x025b:
        r0 = "profiloprofilerunwindc710";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0263:
        r0 = 94;
        goto L_0x0506;
    L_0x0267:
        r0 = "profiloprofilerunwindc700";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x026f:
        r0 = 93;
        goto L_0x0506;
    L_0x0273:
        r0 = "profiloprofilerunwindc600";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x027b:
        r0 = 92;
        goto L_0x0506;
    L_0x027f:
        r0 = "xplat_RtmpSSL_LigerRtmpSSL";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0287:
        r0 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        goto L_0x0506;
    L_0x028b:
        r0 = "libraries_profilo_cpp_writer_timestamp_truncating_visitor";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0293:
        r0 = 83;
        goto L_0x0506;
    L_0x0297:
        r0 = "facetracker-model-cache-native-android";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x029f:
        r0 = 98;
        goto L_0x0506;
    L_0x02a3:
        r0 = "libraries_profilo_cpp_providers";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x02ab:
        r0 = 76;
        goto L_0x0506;
    L_0x02af:
        r0 = "liger";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x02b7:
        r0 = 52;
        goto L_0x0506;
    L_0x02bb:
        r0 = "folly";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x02c3:
        r0 = 14;
        goto L_0x0506;
    L_0x02c7:
        r0 = "folly_portability_sys_statAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x02cf:
        r0 = 39;
        goto L_0x0506;
    L_0x02d3:
        r0 = "folly_convAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x02db:
        r0 = 16;
        goto L_0x0506;
    L_0x02df:
        r0 = "libraries_profilo_cpp_writer_stack_visitor";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x02e7:
        r0 = 82;
        goto L_0x0506;
    L_0x02eb:
        r0 = "sslx";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x02f3:
        r0 = 56;
        goto L_0x0506;
    L_0x02f7:
        r0 = "quic";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x02ff:
        r0 = 54;
        goto L_0x0506;
    L_0x0303:
        r0 = "fizz";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x030b:
        r0 = 12;
        goto L_0x0506;
    L_0x030f:
        r0 = "bz2";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0317:
        r0 = 2;
        goto L_0x0506;
    L_0x031a:
        r0 = "libraries_profilo_cpp_writer_writer";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0322:
        r0 = 84;
        goto L_0x0506;
    L_0x0326:
        r0 = "libraries_profilo_cpp_logger_lfrb_lfrb";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x032e:
        r0 = 73;
        goto L_0x0506;
    L_0x0332:
        r0 = "android-rtmpssl";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x033a:
        r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        goto L_0x0506;
    L_0x033e:
        r0 = "LiveStreaming_LiveStreamingTslogAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0346:
        r0 = 63;
        goto L_0x0506;
    L_0x034a:
        r0 = "folly_fileAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0352:
        r0 = 22;
        goto L_0x0506;
    L_0x0356:
        r0 = "folly_portability_sys_timeAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x035e:
        r0 = 40;
        goto L_0x0506;
    L_0x0362:
        r0 = "android-live-streaming";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x036a:
        r0 = 66;
        goto L_0x0506;
    L_0x036e:
        r0 = "folly_file_utilAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0376:
        r0 = 23;
        goto L_0x0506;
    L_0x037a:
        r0 = "profilo";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0382:
        r0 = 85;
        goto L_0x0506;
    L_0x0386:
        r0 = "libraries_profilo_cpp_writer_packet_reassembler";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x038e:
        r0 = 80;
        goto L_0x0506;
    L_0x0392:
        r0 = "folly_portability_unistdAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x039a:
        r0 = 43;
        goto L_0x0506;
    L_0x039e:
        r0 = "LiveStreaming_LiveStreamingAdaptiveBitrateAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x03a6:
        r0 = 60;
        goto L_0x0506;
    L_0x03aa:
        r0 = "folly_randomAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x03b2:
        r0 = 44;
        goto L_0x0506;
    L_0x03b6:
        r0 = "LiveStreaming_LiveStreamingAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x03be:
        r0 = 61;
        goto L_0x0506;
    L_0x03c2:
        r0 = "profilo_stacktrace";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x03ca:
        r0 = 88;
        goto L_0x0506;
    L_0x03ce:
        r0 = "folly_executorAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x03d6:
        r0 = 19;
        goto L_0x0506;
    L_0x03da:
        r0 = "profilo_libcio";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x03e2:
        r0 = 87;
        goto L_0x0506;
    L_0x03e6:
        r0 = "folly_system_thread_idAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x03ee:
        r0 = 49;
        goto L_0x0506;
    L_0x03f2:
        r0 = "folly_safe_assertAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x03fa:
        r0 = 46;
        goto L_0x0506;
    L_0x03fe:
        r0 = "folly_portability_sys_resourceAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0406:
        r0 = 38;
        goto L_0x0506;
    L_0x040a:
        r0 = "arthook";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0412:
        r0 = 0;
        goto L_0x0506;
    L_0x0415:
        r0 = "wangle";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x041d:
        r0 = 59;
        goto L_0x0506;
    L_0x0421:
        r0 = "third-party_c-ares_c-ares-staticAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0429:
        r0 = 57;
        goto L_0x0506;
    L_0x042d:
        r0 = "LiveStreaming_LiveStreamingRTMPAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0435:
        r0 = 62;
        goto L_0x0506;
    L_0x0439:
        r0 = "folly_portability_direntAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0441:
        r0 = 31;
        goto L_0x0506;
    L_0x0445:
        r0 = "folly_portability_builtinsAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x044d:
        r0 = 30;
        goto L_0x0506;
    L_0x0451:
        r0 = "sodium";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0459:
        r0 = 55;
        goto L_0x0506;
    L_0x045d:
        r0 = "profilo_atrace";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0465:
        r0 = 86;
        goto L_0x0506;
    L_0x0469:
        r0 = "folly_formatAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0471:
        r0 = 24;
        goto L_0x0506;
    L_0x0475:
        r0 = "segmentation-model-cache-native-android";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x047d:
        r0 = 100;
        goto L_0x0506;
    L_0x0481:
        r0 = "folly_hashAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0489:
        r0 = 25;
        goto L_0x0506;
    L_0x048c:
        r0 = "MobileCoreHealth_fbsofterror_fbsofterrorAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0494:
        r0 = 9;
        goto L_0x0506;
    L_0x0497:
        r0 = "libraries_profilo_cpp_jni_jni";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x049f:
        r0 = 72;
        goto L_0x0506;
    L_0x04a2:
        r0 = "fbrtmp";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x04aa:
        r0 = 68;
        goto L_0x0506;
    L_0x04ad:
        r0 = "folly_portability_stringAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x04b5:
        r0 = 35;
        goto L_0x0506;
    L_0x04b8:
        r0 = "folly_detail_futexAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x04c0:
        r0 = 17;
        goto L_0x0506;
    L_0x04c3:
        r0 = "folly_json_pointerAndroid";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x04cb:
        r0 = 28;
        goto L_0x0506;
    L_0x04ce:
        r0 = "libraries_profilo_cpp_api_external_api_impl";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x04d6:
        r0 = 70;
        goto L_0x0506;
    L_0x04d9:
        r0 = "folly-extended";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x04e1:
        r0 = 13;
        goto L_0x0506;
    L_0x04e4:
        r0 = "native_redex_shared_dex";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x04ec:
        r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        goto L_0x0506;
    L_0x04ef:
        r0 = "ardcache-jni";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x04f7:
        r0 = 97;
        goto L_0x0506;
    L_0x04fa:
        r0 = "libraries_profilo_cpp_writer_print_visitor";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0505;
    L_0x0502:
        r0 = 81;
        goto L_0x0506;
    L_0x0505:
        r0 = -1;
    L_0x0506:
        switch(r0) {
            case 0: goto L_0x0523;
            case 1: goto L_0x0523;
            case 2: goto L_0x0520;
            case 3: goto L_0x0520;
            case 4: goto L_0x0520;
            case 5: goto L_0x0520;
            case 6: goto L_0x0520;
            case 7: goto L_0x0520;
            case 8: goto L_0x0520;
            case 9: goto L_0x051d;
            case 10: goto L_0x051d;
            case 11: goto L_0x051d;
            case 12: goto L_0x051d;
            case 13: goto L_0x051d;
            case 14: goto L_0x051d;
            case 15: goto L_0x051d;
            case 16: goto L_0x051d;
            case 17: goto L_0x051d;
            case 18: goto L_0x051d;
            case 19: goto L_0x051d;
            case 20: goto L_0x051d;
            case 21: goto L_0x051d;
            case 22: goto L_0x051d;
            case 23: goto L_0x051d;
            case 24: goto L_0x051d;
            case 25: goto L_0x051d;
            case 26: goto L_0x051d;
            case 27: goto L_0x051d;
            case 28: goto L_0x051d;
            case 29: goto L_0x051d;
            case 30: goto L_0x051d;
            case 31: goto L_0x051d;
            case 32: goto L_0x051d;
            case 33: goto L_0x051d;
            case 34: goto L_0x051d;
            case 35: goto L_0x051d;
            case 36: goto L_0x051d;
            case 37: goto L_0x051d;
            case 38: goto L_0x051d;
            case 39: goto L_0x051d;
            case 40: goto L_0x051d;
            case 41: goto L_0x051d;
            case 42: goto L_0x051d;
            case 43: goto L_0x051d;
            case 44: goto L_0x051d;
            case 45: goto L_0x051d;
            case 46: goto L_0x051d;
            case 47: goto L_0x051d;
            case 48: goto L_0x051d;
            case 49: goto L_0x051d;
            case 50: goto L_0x051d;
            case 51: goto L_0x051d;
            case 52: goto L_0x051d;
            case 53: goto L_0x051d;
            case 54: goto L_0x051d;
            case 55: goto L_0x051d;
            case 56: goto L_0x051d;
            case 57: goto L_0x051d;
            case 58: goto L_0x051d;
            case 59: goto L_0x051d;
            case 60: goto L_0x051a;
            case 61: goto L_0x051a;
            case 62: goto L_0x051a;
            case 63: goto L_0x051a;
            case 64: goto L_0x051a;
            case 65: goto L_0x051a;
            case 66: goto L_0x051a;
            case 67: goto L_0x051a;
            case 68: goto L_0x051a;
            case 69: goto L_0x051a;
            case 70: goto L_0x0517;
            case 71: goto L_0x0517;
            case 72: goto L_0x0517;
            case 73: goto L_0x0517;
            case 74: goto L_0x0517;
            case 75: goto L_0x0517;
            case 76: goto L_0x0517;
            case 77: goto L_0x0517;
            case 78: goto L_0x0517;
            case 79: goto L_0x0517;
            case 80: goto L_0x0517;
            case 81: goto L_0x0517;
            case 82: goto L_0x0517;
            case 83: goto L_0x0517;
            case 84: goto L_0x0517;
            case 85: goto L_0x0517;
            case 86: goto L_0x0517;
            case 87: goto L_0x0517;
            case 88: goto L_0x0517;
            case 89: goto L_0x0517;
            case 90: goto L_0x0517;
            case 91: goto L_0x0517;
            case 92: goto L_0x0517;
            case 93: goto L_0x0517;
            case 94: goto L_0x0517;
            case 95: goto L_0x0517;
            case 96: goto L_0x0517;
            case 97: goto L_0x0514;
            case 98: goto L_0x0514;
            case 99: goto L_0x0514;
            case 100: goto L_0x0514;
            case 101: goto L_0x0511;
            case 102: goto L_0x050e;
            case 103: goto L_0x050e;
            case 104: goto L_0x050e;
            case 105: goto L_0x050e;
            case 106: goto L_0x050b;
            case 107: goto L_0x050b;
            default: goto L_0x0509;
        };
    L_0x0509:
        r0 = 0;
        return r0;
    L_0x050b:
        r0 = "rtmpssl";
        return r0;
    L_0x050e:
        r0 = "redexsharedmerged";
        return r0;
    L_0x0511:
        r0 = "opencv";
        return r0;
    L_0x0514:
        r0 = "modelcache";
        return r0;
    L_0x0517:
        r0 = "loommerged";
        return r0;
    L_0x051a:
        r0 = "livestreaming";
        return r0;
    L_0x051d:
        r0 = "liger";
        return r0;
    L_0x0520:
        r0 = "fbjsc";
        return r0;
    L_0x0523:
        r0 = "dextricksmerged";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0D8.B(java.lang.String):java.lang.String");
    }
}
