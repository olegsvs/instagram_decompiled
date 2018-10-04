package com.facebook.proxygen;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RequestStats {
    private static final Map mFlowTimeMap = Collections.unmodifiableMap(new C00411());
    private TraceEvent[] mEvents;

    /* renamed from: com.facebook.proxygen.RequestStats$1 */
    public final class C00411 extends HashMap {
        public C00411() {
            put(TraceEventType.RequestExchange, Arrays.asList(new String[]{TraceFieldType.Uri, TraceFieldType.IsSecure, TraceFieldType.StatusCode, TraceFieldType.ContentType, TraceFieldType.LocalPort, TraceFieldType.ReqHeaderSize, TraceFieldType.ReqHeaderCompSize, TraceFieldType.ReqBodySize, TraceFieldType.RspHeaderSize, TraceFieldType.RspHeaderCompSize, TraceFieldType.RedirectLocation, TraceFieldType.NumRedirects, TraceFieldType.UsingHTTP2, TraceFieldType.FirstBodyByteFlushedRatio, TraceFieldType.LastBodyByteFlushedRatio, TraceFieldType.SecurityProtocol, TraceFieldType.FlowControlPauses, TraceFieldType.ReplaySafe, TraceFieldType.HTTPMethod, TraceFieldType.RangeRequest, TraceFieldType.TraceStringId}));
            put(TraceEventType.ResponseBodyRead, Arrays.asList(new String[]{TraceFieldType.RspIntvlAvg, TraceFieldType.RspIntvlStdDev, TraceFieldType.RspNumOnBody, TraceFieldType.ServerQuality, TraceFieldType.RecvToAck, TraceFieldType.EOMSuccess, TraceFieldType.ServerUpstreamLatency}));
            put(TraceEventType.TotalConnect, Arrays.asList(new String[0]));
            put(TraceEventType.PreConnect, Arrays.asList(new String[]{TraceFieldType.NewConnection, TraceFieldType.IsWaitingForNewConn, TraceFieldType.NewConnTimeout, TraceFieldType.InFlightConns, TraceFieldType.CachedSessions, TraceFieldType.CachedActiveSessions, TraceFieldType.ConnRoutingStale, TraceFieldType.UsedAltSvc, TraceFieldType.StartedQuicAsync, TraceFieldType.ConnsStarted, TraceFieldType.RequestsWaited, TraceFieldType.TotalConnsStarted, TraceFieldType.TotalBackupConnsStarted, TraceFieldType.TotalRequestsWaited, TraceFieldType.SessionCacheHitType, TraceFieldType.PerDomainLimit, TraceFieldType.PerDomainMaxConns, TraceFieldType.DynamicDomainLimitRatio, TraceFieldType.LoadBalancing, TraceFieldType.MaxConnectionRetryCount, TraceFieldType.MaxIdleHTTPSessions, TraceFieldType.MaxIdleHTTP2Sessions, TraceFieldType.StartedExtraTcp, TraceFieldType.InflightQuicConns}));
            put(TraceEventType.DnsConnect, Arrays.asList(new String[0]));
            put(TraceEventType.DnsResolution, Arrays.asList(new String[]{TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.ResolversSerialized, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.TXT, TraceFieldType.DNSCryptUsed, TraceFieldType.DNSCryptCertSerial}));
            put(TraceEventType.DnsCache, Arrays.asList(new String[]{TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.DNSCacheHit, TraceFieldType.DNSCacheHitV4, TraceFieldType.DNSCacheHitV6, TraceFieldType.DNSCacheStale, TraceFieldType.DNSCacheStaleV4, TraceFieldType.DNSCacheStaleV6}));
            put(TraceEventType.RetryingDnsResolution, Arrays.asList(new String[]{TraceFieldType.NumberDNSRetries, TraceFieldType.ResolvedSuccess}));
            put(TraceEventType.FallbackDnsResolution, Arrays.asList(new String[]{TraceFieldType.FallbackBranchSuccess}));
            put(TraceEventType.FallbackDnsAttempt, Arrays.asList(new String[0]));
            put(TraceEventType.TcpConnect, Arrays.asList(new String[]{TraceFieldType.CachedFamily, TraceFieldType.CachedFamilyStatus, TraceFieldType.HEDrivenDns, TraceFieldType.HESerializedEvents}));
            put(TraceEventType.TlsSetup, Arrays.asList(new String[]{TraceFieldType.TLSReused, TraceFieldType.TLSCacheHit, TraceFieldType.CipherName, TraceFieldType.TLSVersion, TraceFieldType.OpenSSLVersion, TraceFieldType.TLSCachePersistence}));
            put(TraceEventType.ProxyConnect, Arrays.asList(new String[]{TraceFieldType.ProxyHost, TraceFieldType.ProxyPort}));
            put(TraceEventType.PostConnect, Arrays.asList(new String[]{TraceFieldType.NewSession, TraceFieldType.NumWaiting, TraceFieldType.TransportType}));
            put(TraceEventType.SessionTransactions, Arrays.asList(new String[]{TraceFieldType.CurrentTransactions, TraceFieldType.HistoricalMaximumTransactions, TraceFieldType.NumberTransactionsServed}));
            put(TraceEventType.TransportInfo, Arrays.asList(new String[]{TraceFieldType.Cwnd, TraceFieldType.CwndBytes, TraceFieldType.TotalRetx, TraceFieldType.InflightPacketLoss, TraceFieldType.RTT, TraceFieldType.RTTVar, TraceFieldType.RTO, TraceFieldType.MSS, TraceFieldType.MTU, TraceFieldType.RcvWnd, TraceFieldType.UpstreamCapacity, TraceFieldType.QuicClientCID, TraceFieldType.QuicServerCID, TraceFieldType.RTOCount, TraceFieldType.TotalRTOCount}));
            put(TraceEventType.ConnInfo, Arrays.asList(new String[]{TraceFieldType.ConnLifeSpan, TraceFieldType.EgressBuffered}));
            put(TraceEventType.Decompression, Arrays.asList(new String[]{TraceFieldType.RspBodySize, TraceFieldType.RspBodyCompSize, TraceFieldType.CompressionType}));
            put(TraceEventType.ReplaySafety, Arrays.asList(new String[0]));
            put(TraceEventType.Push, Arrays.asList(new String[]{TraceFieldType.IsPushRequest, TraceFieldType.PushConnectedInFlight, TraceFieldType.PushOrphaned}));
            put(TraceEventType.HTTPPerfParameters, Arrays.asList(new String[]{TraceFieldType.AnalyticsTags}));
            put(TraceEventType.TLSCachedInfo, Arrays.asList(new String[]{TraceFieldType.TLSCachedInfoHit}));
            put(TraceEventType.FizzConnect, Arrays.asList(new String[]{TraceFieldType.FizzHandshakeSuccess, TraceFieldType.FizzProtocolVersion, TraceFieldType.FizzPskType, TraceFieldType.FizzEarlyDataType}));
            put(TraceEventType.QuicConnect, Arrays.asList(new String[]{TraceFieldType.QuicClientCID, TraceFieldType.QuicDNSAddrs, TraceFieldType.QuicTransportReplaySafe}));
            put(TraceEventType.ConnSelector, Arrays.asList(new String[]{TraceFieldType.QuicResult}));
            put(TraceEventType.AltSvc, Arrays.asList(new String[]{TraceFieldType.AltSvcHeader, TraceFieldType.AltSvcCachedHost, TraceFieldType.AltSvcExpired, TraceFieldType.AltSvcCachedError, TraceFieldType.AltSvcErrorHost}));
        }
    }

    public RequestStats(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }

    public Map getCertificateVerificationData() {
        Map hashMap = new HashMap();
        Object obj = null;
        for (TraceEvent traceEvent : this.mEvents) {
            if (traceEvent.getName().equals(TraceEventType.CertVerification)) {
                for (Entry entry : traceEvent.getMetaData().entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
                obj = 1;
            } else {
                Map metaData;
                String readStrMeta;
                int readIntMeta;
                String str;
                StringBuilder stringBuilder;
                if (!(traceEvent.getName().equals(TraceEventType.QuicConnect) || traceEvent.getName().equals(TraceEventType.TcpConnect))) {
                    if (!traceEvent.getName().equals(TraceEventType.PostConnect)) {
                        if (traceEvent.getName().equals(TraceEventType.TlsSetup)) {
                            metaData = traceEvent.getMetaData();
                            String readStrMeta2 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.CipherName, JsonProperty.USE_DEFAULT_NAME);
                            int readIntMeta2 = TraceEventUtil.readIntMeta(metaData, TraceFieldType.TLSVersion, 0);
                            long readIntMeta3 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.OpenSSLVersion, 0);
                            if (!readStrMeta2.equals(JsonProperty.USE_DEFAULT_NAME)) {
                                hashMap.put(TraceFieldType.CipherName, readStrMeta2);
                            }
                            if (readIntMeta2 != 0) {
                                hashMap.put(TraceFieldType.TLSVersion, String.valueOf(readIntMeta2));
                            }
                            if (readIntMeta3 != 0) {
                                hashMap.put(TraceFieldType.OpenSSLVersion, String.valueOf(readIntMeta3));
                            }
                        } else if (traceEvent.getName().equals(TraceEventType.ProxyConnect)) {
                            metaData = traceEvent.getMetaData();
                            readStrMeta = TraceEventUtil.readStrMeta(metaData, TraceFieldType.ProxyHost, JsonProperty.USE_DEFAULT_NAME);
                            readIntMeta = TraceEventUtil.readIntMeta(metaData, TraceFieldType.ProxyPort, 0);
                            if (!readStrMeta.equals(JsonProperty.USE_DEFAULT_NAME) && readIntMeta > 0) {
                                str = TraceFieldType.VerifiedProxyAddress;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(readStrMeta);
                                stringBuilder.append(":");
                                stringBuilder.append(String.valueOf(readIntMeta));
                                hashMap.put(str, stringBuilder.toString());
                            }
                        }
                    }
                }
                metaData = traceEvent.getMetaData();
                readStrMeta = TraceEventUtil.readStrMeta(metaData, TraceFieldType.ServerAddr, JsonProperty.USE_DEFAULT_NAME);
                readIntMeta = TraceEventUtil.readIntMeta(metaData, TraceFieldType.ServerPort, 0);
                if (!readStrMeta.equals(JsonProperty.USE_DEFAULT_NAME) && readIntMeta > 0) {
                    str = TraceFieldType.VerifiedServerAddress;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(readStrMeta);
                    stringBuilder.append(":");
                    stringBuilder.append(String.valueOf(readIntMeta));
                    hashMap.put(str, stringBuilder.toString());
                }
            }
        }
        return obj == null ? new HashMap(0) : hashMap;
    }

    public HTTPFlowStats getFlowStats() {
        String str = JsonProperty.USE_DEFAULT_NAME;
        String str2 = JsonProperty.USE_DEFAULT_NAME;
        String str3 = JsonProperty.USE_DEFAULT_NAME;
        TraceEvent[] traceEventArr = this.mEvents;
        int length = traceEventArr.length;
        int i = 0;
        String str4 = str2;
        long j = -1;
        long j2 = -1;
        long j3 = -1;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z6 = false;
        int i10 = 0;
        while (i10 < length) {
            TraceEvent traceEvent = traceEventArr[i10];
            Map metaData = traceEvent.getMetaData();
            if (TraceEventType.RequestExchange.equals(traceEvent.getName())) {
                str = TraceEventUtil.readStrMeta(metaData, TraceFieldType.Protocol, JsonProperty.USE_DEFAULT_NAME);
                z = isValidCodecProtocolStr(str);
                i3 = TraceEventUtil.readIntMeta(metaData, TraceFieldType.LocalPort, i);
                i4 = TraceEventUtil.readIntMeta(metaData, TraceFieldType.ReqHeaderSize, i);
                i5 = TraceEventUtil.readIntMeta(metaData, TraceFieldType.ReqHeaderCompSize, i);
                z4 = true;
                z3 = i4 != 0;
                i6 = TraceEventUtil.readIntMeta(metaData, TraceFieldType.ReqBodySize, i);
                i7 = TraceEventUtil.readIntMeta(metaData, TraceFieldType.RspHeaderSize, i);
                i8 = TraceEventUtil.readIntMeta(metaData, TraceFieldType.RspHeaderCompSize, i);
                if (i7 == 0) {
                    i7 = 0;
                    z4 = false;
                }
                j7 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.RequestSendTime, i);
            } else if (TraceEventType.PostConnect.equals(traceEvent.getName())) {
                z2 = TraceEventUtil.readBooleanMeta(metaData, TraceFieldType.NewSession, false);
                str3 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.ServerAddr, str3);
            } else if (TraceEventType.ResponseBodyRead.equals(traceEvent.getName())) {
                j15 = traceEvent.getEnd() - traceEvent.getStart();
                str4 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.ServerQuality, JsonProperty.USE_DEFAULT_NAME);
                j = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.ServerRtt, -1);
                j2 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.ServerRtx, -1);
                j3 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.ServerCwnd, -1);
                j4 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.ServerMss, -1);
                j5 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.ServerTotalBytesWritten, -1);
                j6 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.ServerUpstreamLatency, -1);
            } else if (TraceEventType.TcpConnect.equals(traceEvent.getName())) {
                str3 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.ServerAddr, str3);
                j9 = traceEvent.getEnd() - traceEvent.getStart();
            } else if (TraceEventType.QuicConnect.equals(traceEvent.getName())) {
                str3 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.ServerAddr, str3);
            } else {
                if (!TraceEventType.PreConnect.equals(traceEvent.getName())) {
                    if (!TraceEventType.DnsCache.equals(traceEvent.getName())) {
                        if (TraceEventType.DnsResolution.equals(traceEvent.getName())) {
                            str2 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.HostName, str2);
                            j8 = traceEvent.getEnd() - traceEvent.getStart();
                            str3 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.ServerAddr, str3);
                        } else if (TraceEventType.TlsSetup.equals(traceEvent.getName())) {
                            j10 = traceEvent.getEnd() - traceEvent.getStart();
                            str3 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.ServerAddr, str3);
                        } else if (TraceEventType.Decompression.equals(traceEvent.getName())) {
                            i9 = TraceEventUtil.readIntMeta(metaData, TraceFieldType.RspBodySize, 0);
                            int readIntMeta = TraceEventUtil.readIntMeta(metaData, TraceFieldType.RspBodyCompSize, 0);
                            if (readIntMeta != 0 && (i2 == 0 || readIntMeta < i2)) {
                                i2 = readIntMeta;
                            }
                        } else if (TraceEventType.TransportInfo.equals(traceEvent.getName())) {
                            j11 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.RTT, 0);
                        } else if (TraceEventType.TotalRequest.equals(traceEvent.getName())) {
                            j12 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.TTFB, 0);
                            j13 = (long) TraceEventUtil.readIntMeta(metaData, TraceFieldType.TTLB, 0);
                        } else if (TraceEventType.TotalConnect.equals(traceEvent.getName())) {
                            j14 = traceEvent.getEnd() - traceEvent.getStart();
                        } else if (TraceEventType.TLSCachedInfo.equals(traceEvent.getName())) {
                            z5 = TraceEventUtil.readBooleanMeta(metaData, TraceFieldType.TLSCachedInfoHit, false);
                        } else if (TraceEventType.Push.equals(traceEvent.getName())) {
                            z6 = TraceEventUtil.readBooleanMeta(metaData, TraceFieldType.IsPushRequest, false);
                        }
                    }
                }
                str2 = TraceEventUtil.readStrMeta(metaData, TraceFieldType.HostName, str2);
            }
            i10++;
            i = 0;
        }
        return new HTTPFlowStats(str2, str3, i3, z, z2, z3, z4, z5, str, i4, i5, i6, i7, i8, i9, i2, j8, j9, j10, j11, j12, j13, j14, j15, str4, new ConnQuality(j, j2, j3, j4, j5, j6), j7, z6);
    }

    public Map getFlowTimeData() {
        Map hashMap = new HashMap();
        for (TraceEvent traceEvent : this.mEvents) {
            if (mFlowTimeMap.containsKey(traceEvent.getName())) {
                String str;
                Map metaData = traceEvent.getMetaData();
                if (!(traceEvent.getStart() == 0 || traceEvent.getEnd() == 0 || traceEvent.getStart() >= traceEvent.getEnd())) {
                    hashMap.put(traceEvent.getName(), String.valueOf(traceEvent.getEnd() - traceEvent.getStart()));
                }
                for (String str2 : (List) mFlowTimeMap.get(traceEvent.getName())) {
                    if (metaData.containsKey(str2)) {
                        hashMap.put(str2, metaData.get(str2));
                    }
                }
                if (metaData.containsKey(TraceFieldType.ServerAddr)) {
                    str2 = TraceFieldType.ServerAddr;
                    hashMap.put(str2, metaData.get(str2));
                    str2 = TraceFieldType.ServerPort;
                    hashMap.put(str2, metaData.get(str2));
                }
                if (metaData.containsKey(TraceFieldType.Error)) {
                    if (hashMap.containsKey(TraceFieldType.ErrorStage)) {
                        String str3 = TraceFieldType.ErrorStage;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String) hashMap.get(str3));
                        stringBuilder.append(";");
                        stringBuilder.append(traceEvent.getName());
                        hashMap.put(str3, stringBuilder.toString());
                    } else {
                        hashMap.put(TraceFieldType.ErrorStage, traceEvent.getName());
                    }
                    joinMetaFields(metaData, hashMap, TraceFieldType.Error);
                    joinMetaFields(metaData, hashMap, TraceFieldType.DirectionError);
                    joinMetaFields(metaData, hashMap, TraceFieldType.ProxygenError);
                    joinMetaFields(metaData, hashMap, TraceFieldType.CodecError);
                }
                if (metaData.containsKey(TraceFieldType.PriorityChanges)) {
                    joinMetaFields(metaData, hashMap, TraceFieldType.PriorityChanges);
                }
                if (metaData.containsKey(TraceFieldType.FallbackBranchAttempt)) {
                    joinMetaFields(metaData, hashMap, TraceFieldType.FallbackBranchAttempt);
                }
            }
        }
        return hashMap;
    }

    public static Map getFlowTimeFieldsMap() {
        return mFlowTimeMap;
    }

    public TraceEvent[] getTraceEvents() {
        return this.mEvents;
    }

    private static boolean isValidCodecProtocolStr(String str) {
        if (!str.equals("http/1.1")) {
            if (!str.equals("http/2")) {
                return false;
            }
        }
        return true;
    }

    private static void joinMetaFields(Map map, Map map2, String str) {
        if (!map.containsKey(str)) {
            return;
        }
        if (map2.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String) map2.get(str));
            stringBuilder.append(";");
            stringBuilder.append((String) map.get(str));
            map2.put(str, stringBuilder.toString());
            return;
        }
        map2.put(str, map.get(str));
    }
}
