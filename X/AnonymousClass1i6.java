package X;

import com.facebook.blescan.BleScanResult;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.location.ImmutableLocation;
import com.facebook.location.signalpackage.LocationSignalPackage;
import com.facebook.wifiscan.WifiScanResult;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1i6 */
public final class AnonymousClass1i6 extends AnonymousClass1Di {
    /* renamed from: B */
    public static final AnonymousClass1GF f21607B = new AnonymousClass1GF(AnonymousClass0Kd.f3087B, RealtimeSinceBootClock.get());

    public AnonymousClass1i6(String str) {
        super("267378613746747", str, true, AnonymousClass1kE.class);
    }

    /* renamed from: B */
    public static AnonymousClass1i6 m12652B(String str, List list, String str2) {
        if (str == null) {
            str = "0";
        }
        AnonymousClass1kH anonymousClass1kH = new AnonymousClass1kH(AnonymousClass1i6.m12653C(str, list, str2));
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass1kH.f22085B != null) {
                createGenerator.writeFieldName("input");
                AnonymousClass1kG anonymousClass1kG = anonymousClass1kH.f22085B;
                createGenerator.writeStartObject();
                if (anonymousClass1kG.f22078B != null) {
                    createGenerator.writeStringField("app_use_state", anonymousClass1kG.f22078B.m12823A());
                }
                if (anonymousClass1kG.f22080D != null) {
                    createGenerator.writeStringField("device_id", anonymousClass1kG.f22080D);
                }
                if (anonymousClass1kG.f22081E != null) {
                    createGenerator.writeFieldName("location_manager_info");
                    AnonymousClass1kJ anonymousClass1kJ = anonymousClass1kG.f22081E;
                    createGenerator.writeStartObject();
                    if (anonymousClass1kJ.f22090B != null) {
                        createGenerator.writeFieldName("locations");
                        createGenerator.writeStartArray();
                        for (AnonymousClass1kK anonymousClass1kK : anonymousClass1kJ.f22090B) {
                            if (anonymousClass1kK != null) {
                                createGenerator.writeStartObject();
                                createGenerator.writeNumberField("age_ms", anonymousClass1kK.f22092C);
                                createGenerator.writeNumberField("latitude", anonymousClass1kK.f22096G);
                                createGenerator.writeNumberField("longitude", anonymousClass1kK.f22097H);
                                createGenerator.writeNumberField("accuracy_meters", anonymousClass1kK.f22091B);
                                if (anonymousClass1kK.f22098I != null) {
                                    createGenerator.writeNumberField("speed_meters_per_second", anonymousClass1kK.f22098I.floatValue());
                                }
                                if (anonymousClass1kK.f22094E != null) {
                                    createGenerator.writeNumberField("altitude_meters", anonymousClass1kK.f22094E.doubleValue());
                                }
                                if (anonymousClass1kK.f22093D != null) {
                                    createGenerator.writeNumberField("altitude_accuracy_meters", anonymousClass1kK.f22093D.floatValue());
                                }
                                if (anonymousClass1kK.f22095F != null) {
                                    createGenerator.writeNumberField("bearing_degrees", anonymousClass1kK.f22095F.floatValue());
                                }
                                createGenerator.writeEndObject();
                            }
                        }
                        createGenerator.writeEndArray();
                    }
                    createGenerator.writeEndObject();
                }
                if (anonymousClass1kG.f22082F != null) {
                    createGenerator.writeFieldName("wifi_info");
                    AnonymousClass1kM.m12824B(createGenerator, anonymousClass1kG.f22082F, true);
                }
                if (anonymousClass1kG.f22079C != null) {
                    createGenerator.writeFieldName("bluetooth_info");
                    AnonymousClass1kO.m12825B(createGenerator, anonymousClass1kG.f22079C, true);
                }
                AnonymousClass1kP.m12826B(createGenerator, anonymousClass1kG, false);
                createGenerator.writeEndObject();
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            return new AnonymousClass1i6(stringWriter.toString());
        } catch (Throwable e) {
            String str3 = "Error serializing to JSON";
            String str4 = "FbLocationUpdateMutation";
            AnonymousClass0Dc.m1246I(str4, e, str3, new Object[0]);
            AnonymousClass0Gn.m1878E(str4, str3, e);
            return null;
        }
    }

    /* renamed from: C */
    public static AnonymousClass1kF m12653C(String str, List list, String str2) {
        List arrayList = new ArrayList(list.size());
        AnonymousClass1kL anonymousClass1kL = new AnonymousClass1kL();
        AnonymousClass1kN anonymousClass1kN = new AnonymousClass1kN();
        for (LocationSignalPackage locationSignalPackage : list) {
            ImmutableLocation immutableLocation = locationSignalPackage.f21594L;
            if (immutableLocation != null) {
                AnonymousClass1Cy.m9952G(immutableLocation);
                AnonymousClass1kK anonymousClass1kK = new AnonymousClass1kK();
                anonymousClass1kK.f22096G = immutableLocation.m10413F();
                anonymousClass1kK.f22097H = immutableLocation.m10420G();
                anonymousClass1kK.f22092C = (long) ((int) f21607B.m10443B(immutableLocation));
                Float A = immutableLocation.m10414A();
                if (A != null) {
                    anonymousClass1kK.f22091B = A.floatValue();
                }
                Double B = immutableLocation.m10415B();
                if (B != null) {
                    anonymousClass1kK.f22094E = B;
                }
                A = immutableLocation.m10416C();
                if (A != null) {
                    anonymousClass1kK.f22095F = A;
                }
                A = immutableLocation.m10423J();
                if (A != null) {
                    anonymousClass1kK.f22098I = A;
                }
                arrayList.add(anonymousClass1kK);
            }
            Boolean bool = locationSignalPackage.f21602T;
            if (bool != null) {
                anonymousClass1kL.f22100C = bool;
            }
            WifiScanResult wifiScanResult = locationSignalPackage.f21590H;
            if (wifiScanResult != null) {
                anonymousClass1kL.f22099B = AnonymousClass1i6.m12654D(wifiScanResult, true);
            }
            List<WifiScanResult> list2 = locationSignalPackage.f21603U;
            if (list2 != null) {
                if (anonymousClass1kL.f22101D == null) {
                    anonymousClass1kL.f22101D = new ArrayList(list2.size());
                }
                for (WifiScanResult D : list2) {
                    anonymousClass1kL.f22101D.add(AnonymousClass1i6.m12654D(D, false));
                }
            }
            bool = locationSignalPackage.f21586D;
            if (bool != null) {
                anonymousClass1kN.f22102B = bool;
            }
            List<BleScanResult> list3 = locationSignalPackage.f21587E;
            if (list3 != null) {
                if (anonymousClass1kN.f22103C == null) {
                    anonymousClass1kN.f22103C = new ArrayList(list3.size());
                }
                for (BleScanResult bleScanResult : list3) {
                    anonymousClass1kN.f22103C.add(new AnonymousClass1kR((int) (System.currentTimeMillis() - bleScanResult.f22113F), bleScanResult.f22109B, bleScanResult.f22111D, bleScanResult.f22110C));
                }
            }
        }
        return new AnonymousClass1kF(str, AnonymousClass1kI.Foreground, str2, new AnonymousClass1kJ(arrayList), anonymousClass1kL, anonymousClass1kN);
    }

    /* renamed from: D */
    private static AnonymousClass1kQ m12654D(WifiScanResult wifiScanResult, boolean z) {
        Integer num;
        int currentTimeMillis = (int) (System.currentTimeMillis() - wifiScanResult.f22018H);
        if (z) {
            num = null;
        } else {
            num = Integer.valueOf(currentTimeMillis);
        }
        return new AnonymousClass1kQ(num, wifiScanResult.f22012B, wifiScanResult.f22016F, wifiScanResult.f22013C, wifiScanResult.f22015E);
    }
}
