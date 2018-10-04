package com.instagram.video.common.events;

public enum IgVideoRealtimeEventPayload$Type {
    JOIN,
    SERVER_MEDIA_UPDATE,
    HANGUP,
    ICE_CANDIDATE,
    RING,
    DISMISS,
    CONFERENCE_STATE,
    ADD_PARTICIPANTS,
    SUBSCRIPTION,
    CLIENT_MEDIA_UPDATE,
    DATA_MESSAGE,
    REMOVE_PARTICIPANTS,
    EXPERIMENT,
    P2P_PROTOCOL,
    P2P_ANSWER,
    P2P_ICE_CANDIDATE,
    UNKNOWN;

    /* renamed from: B */
    public static com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type m10621B(java.lang.String r0) {
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
        r0 = valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0005 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0005 }
    L_0x0005:
        r0 = UNKNOWN;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type.B(java.lang.String):com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type");
    }
}
