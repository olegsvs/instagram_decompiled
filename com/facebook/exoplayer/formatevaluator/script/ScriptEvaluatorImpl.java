package com.facebook.exoplayer.formatevaluator.script;

import X.AnonymousClass1Gk;
import X.AnonymousClass1Gl;
import android.os.SystemClock;
import com.facebook.jsi.JSRuntime;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.Map;

public class ScriptEvaluatorImpl {
    /* renamed from: F */
    private static volatile JSRuntime f45720F;
    /* renamed from: G */
    private static final JsonFactory f45721G = new JsonFactory();
    /* renamed from: B */
    private volatile boolean f45722B;
    /* renamed from: C */
    private int f45723C = -1;
    /* renamed from: D */
    private int f45724D;
    /* renamed from: E */
    private final String f45725E;

    public ScriptEvaluatorImpl(Map map) {
        this.f45725E = AnonymousClass1Gk.Y(map);
    }

    /* renamed from: A */
    public final void m21072A(X.AnonymousClass3tL r18, java.lang.String r19, java.util.List r20, long r21, X.AnonymousClass2rO[] r23, X.AnonymousClass2rP r24, long r25, java.util.Map r27, long r28, boolean r30, long r31, float[] r33, int r34) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r17 = this;
        r8 = r19;
        r4 = r34;
        r13 = android.os.SystemClock.elapsedRealtime();
        r1 = r20;
        r0 = r1.isEmpty();
        r16 = 2;
        r9 = 0;
        r15 = 1;
        r7 = r23;
        r5 = r24;
        r6 = r17;
        if (r0 != 0) goto L_0x005b;
    L_0x001a:
        r0 = r1.size();
        r0 = r0 - r15;
        r10 = r1.get(r0);
        r10 = (X.AnonymousClass43f) r10;
        r12 = "Last chunk %d, %d, next segment to load %d";
        r0 = 3;
        r11 = new java.lang.Object[r0];
        r0 = r10.f49129B;
        r0 = java.lang.Integer.valueOf(r0);
        r11[r9] = r0;
        r0 = r10.f49130C;
        r0 = java.lang.Long.valueOf(r0);
        r11[r15] = r0;
        r0 = java.lang.Integer.valueOf(r4);
        r11[r16] = r0;
        m21071B(r12, r11);
        r1 = r6.f45723C;
        r0 = r10.f49129B;
        if (r1 != r0) goto L_0x0057;
    L_0x0049:
        r0 = r6.f45724D;
        r0 = r23[r0];
        r5.f35072B = r0;
        r1 = "Same chunk, return early.";
        r0 = new java.lang.Object[r9];
        m21071B(r1, r0);
        return;
    L_0x0057:
        r0 = r10.f49129B;
        r6.f45723C = r0;
    L_0x005b:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r25 / r0;
        r10 = (int) r2;
        r3 = new java.io.StringWriter;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r3.<init>();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = f45721G;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2 = r0.createGenerator(r3);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeStartObject();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r5.f35072B;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        if (r0 == 0) goto L_0x007b;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x0072:
        r1 = "currentId";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r5.f35072B;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r0.f35068Q;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeStringField(r1, r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x007b:
        r9 = "bandwidth";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r28;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = (int) r0;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeNumberField(r9, r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = "bufferedDurationMs";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeNumberField(r0, r10);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = "isWifi";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = r30;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeBooleanField(r0, r1);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = "bitrates";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeFieldName(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeStartArray();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r9 = r7.length;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = 0;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x0099:
        if (r1 >= r9) goto L_0x00a5;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x009b:
        r0 = r23[r1];	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r0.f35055D;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeNumber(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = r1 + 1;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        goto L_0x0099;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00a5:
        r2.writeEndArray();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = "ids";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeFieldName(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeStartArray();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r9 = r7.length;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = 0;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00b2:
        if (r1 >= r9) goto L_0x00be;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00b4:
        r0 = r23[r1];	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r0.f35068Q;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeString(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = r1 + 1;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        goto L_0x00b2;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00be:
        r2.writeEndArray();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = "segmentBitrates";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeFieldName(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeStartArray();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r10 = r7.length;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r9 = 0;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00cb:
        if (r9 >= r10) goto L_0x00e3;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00cd:
        r0 = r23[r9];	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r0.f35068Q;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = r27;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r1.get(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = (X.AnonymousClass2rd) r0;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        if (r0 == 0) goto L_0x00e0;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00db:
        r0 = r0.f35106B;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeNumber(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00e0:
        r9 = r9 + 1;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        goto L_0x00cb;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00e3:
        r2.writeEndArray();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r9 = "durationMs";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r31;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeNumberField(r9, r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r9 = r33;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        if (r33 == 0) goto L_0x0114;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00f1:
        if (r34 < 0) goto L_0x0114;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00f3:
        r0 = r9.length;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        if (r4 >= r0) goto L_0x0114;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x00f6:
        r0 = "nextBitrates";	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeFieldName(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeStartArray();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = r34 + 10;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = r9.length;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = java.lang.Math.min(r1, r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = 1;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r1 = r1 - r0;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x0107:
        if (r4 > r1) goto L_0x0111;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x0109:
        r0 = r33[r4];	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.writeNumber(r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r4 = r4 + 1;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        goto L_0x0107;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x0111:
        r2.writeEndArray();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
    L_0x0114:
        r2.writeEndObject();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2.close();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r2 = r3.toString();	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = 0;	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r0 = new java.lang.Object[r0];	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        m21071B(r2, r0);	 Catch:{ JsonGenerationException -> 0x0198, IOException -> 0x0192 }
        r4 = r6.f45724D;
        r6.m21073B();
        r9 = com.facebook.exoplayer.formatevaluator.script.ScriptEvaluatorImpl.class;
        monitor-enter(r9);
        r1 = f45720F;	 Catch:{ Exception -> 0x0145 }
        r0 = "jsonStr";	 Catch:{ Exception -> 0x0145 }
        r1.setGlobalStringProperty(r0, r2);	 Catch:{ Exception -> 0x0145 }
        r1 = f45720F;	 Catch:{ Exception -> 0x0145 }
        r0 = "evaluate";	 Catch:{ Exception -> 0x0145 }
        r1.callFunction(r0);	 Catch:{ Exception -> 0x0145 }
        r1 = f45720F;	 Catch:{ Exception -> 0x0145 }
        r0 = "selectedIndex";	 Catch:{ Exception -> 0x0145 }
        r4 = r1.getGlobalNumberProperty(r0);	 Catch:{ Exception -> 0x0145 }
        goto L_0x016d;	 Catch:{ Exception -> 0x0145 }
    L_0x0143:
        r0 = move-exception;
        goto L_0x0190;
    L_0x0145:
        r3 = move-exception;
        r2 = "ScriptEvaluatorImpl";	 Catch:{ all -> 0x0143 }
        r1 = "Error from JSRuntime";	 Catch:{ all -> 0x0143 }
        r0 = 0;	 Catch:{ all -> 0x0143 }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0143 }
        X.AnonymousClass1Gl.F(r2, r3, r1, r0);	 Catch:{ all -> 0x0143 }
        r0 = r6.f45722B;	 Catch:{ all -> 0x0143 }
        if (r0 != 0) goto L_0x016d;	 Catch:{ all -> 0x0143 }
    L_0x0154:
        r10 = r18;	 Catch:{ all -> 0x0143 }
        if (r18 == 0) goto L_0x016d;	 Catch:{ all -> 0x0143 }
    L_0x0158:
        r2 = new X.1xl;	 Catch:{ all -> 0x0143 }
        if (r19 != 0) goto L_0x015e;	 Catch:{ all -> 0x0143 }
    L_0x015c:
        r8 = "";	 Catch:{ all -> 0x0143 }
    L_0x015e:
        r1 = "AbrScriptEvaluatorError";	 Catch:{ all -> 0x0143 }
        r0 = r3.getMessage();	 Catch:{ all -> 0x0143 }
        r2.<init>(r8, r1, r0);	 Catch:{ all -> 0x0143 }
        r10.m21177B(r2);	 Catch:{ all -> 0x0143 }
        r0 = 1;	 Catch:{ all -> 0x0143 }
        r6.f45722B = r0;	 Catch:{ all -> 0x0143 }
    L_0x016d:
        monitor-exit(r9);	 Catch:{ all -> 0x0143 }
        r3 = "selectedIndex: %d, Time to evaluate: %d\r\n";
        r0 = 2;
        r2 = new java.lang.Object[r0];
        r1 = java.lang.Integer.valueOf(r4);
        r0 = 0;
        r2[r0] = r1;
        r0 = android.os.SystemClock.elapsedRealtime();
        r0 = r0 - r13;
        r1 = java.lang.Long.valueOf(r0);
        r0 = 1;
        r2[r0] = r1;
        m21071B(r3, r2);
        r0 = r23[r4];
        r5.f35072B = r0;
        r6.f45724D = r4;
        return;
    L_0x0190:
        monitor-exit(r9);	 Catch:{ all -> 0x0143 }
        throw r0;
    L_0x0192:
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
    L_0x0198:
        r0 = new java.lang.RuntimeException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.script.ScriptEvaluatorImpl.A(X.3tL, java.lang.String, java.util.List, long, X.2rO[], X.2rP, long, java.util.Map, long, boolean, long, float[], int):void");
    }

    /* renamed from: B */
    public final void m21073B() {
        synchronized (ScriptEvaluatorImpl.class) {
            if (f45720F == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                f45720F = JSRuntime.makeCustomJSCRuntime();
                try {
                    f45720F.evaluateJavaScript(this.f45725E);
                } catch (Throwable e) {
                    AnonymousClass1Gl.F("ScriptEvaluatorImpl", e, "Error from evaluateJavaScript", new Object[0]);
                }
                m21071B("Time to load script: %d\n", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: B */
    private static void m21071B(String str, Object... objArr) {
        AnonymousClass1Gl.C("ScriptEvaluatorImpl", str, objArr);
    }
}
