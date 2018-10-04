package com.facebook.analytics.appstatelogger;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class AppState {
    /* renamed from: B */
    public long f23011B;
    /* renamed from: C */
    public int f23012C;
    /* renamed from: D */
    public long f23013D;
    /* renamed from: E */
    public final int f23014E;
    /* renamed from: F */
    public final String f23015F;
    /* renamed from: G */
    public boolean f23016G;
    /* renamed from: H */
    public long f23017H;
    /* renamed from: I */
    public int f23018I;
    /* renamed from: J */
    public String f23019J;
    /* renamed from: K */
    public long f23020K;
    /* renamed from: L */
    public int f23021L;
    /* renamed from: M */
    public String f23022M;
    /* renamed from: N */
    public Boolean f23023N;
    /* renamed from: O */
    public Throwable f23024O;
    /* renamed from: P */
    public long f23025P;
    /* renamed from: Q */
    public long f23026Q;
    /* renamed from: R */
    public long f23027R;
    /* renamed from: S */
    public long f23028S;
    /* renamed from: T */
    public String f23029T;
    /* renamed from: U */
    public final int f23030U;
    /* renamed from: V */
    public final String f23031V;
    /* renamed from: W */
    public final boolean f23032W;
    /* renamed from: X */
    public String f23033X;

    public AppState(AppState appState) {
        this.f23031V = appState.f23031V;
        this.f23030U = appState.f23030U;
        this.f23015F = appState.f23015F;
        this.f23014E = appState.f23014E;
        this.f23022M = appState.f23022M;
        this.f23029T = appState.f23029T;
        this.f23032W = appState.f23032W;
        this.f23020K = appState.f23020K;
        this.f23011B = appState.f23011B;
        this.f23013D = appState.f23013D;
        this.f23025P = appState.f23025P;
        this.f23017H = appState.f23017H;
        this.f23027R = appState.f23027R;
        this.f23028S = appState.f23028S;
        this.f23026Q = appState.f23026Q;
        this.f23023N = appState.f23023N;
        this.f23018I = appState.f23018I;
        this.f23019J = appState.f23019J;
        this.f23012C = appState.f23012C;
        this.f23016G = appState.f23016G;
        this.f23024O = appState.f23024O;
        this.f23021L = appState.f23021L;
    }

    public AppState(String str, int i, String str2, int i2, boolean z, long j, long j2, Boolean bool) {
        this.f23031V = str;
        this.f23030U = i;
        this.f23015F = str2;
        this.f23014E = i2;
        String str3 = JsonProperty.USE_DEFAULT_NAME;
        this.f23022M = str3;
        this.f23029T = str3;
        this.f23032W = z;
        this.f23020K = -1;
        this.f23013D = j2;
        this.f23011B = j;
        this.f23023N = bool;
        this.f23018I = -1;
        this.f23019J = JsonProperty.USE_DEFAULT_NAME;
        this.f23016G = false;
    }
}
