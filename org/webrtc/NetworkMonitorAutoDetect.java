package org.webrtc;

import X.AnonymousClass0cQ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest.Builder;
import android.net.wifi.WifiInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.os.Build.VERSION;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

public class NetworkMonitorAutoDetect extends BroadcastReceiver {
    public static final long INVALID_NET_ID = -1;
    private static final String TAG = "NetworkMonitorAutoDetect";
    private final NetworkCallback allNetworkCallback;
    private ConnectionType connectionType;
    public ConnectivityManagerDelegate connectivityManagerDelegate;
    private final Context context;
    private final IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private boolean isRegistered;
    private final NetworkCallback mobileNetworkCallback;
    public final Observer observer;
    private WifiDirectManagerDelegate wifiDirectManagerDelegate;
    private WifiManagerDelegate wifiManagerDelegate;
    private String wifiSSID;

    public enum ConnectionType {
        CONNECTION_UNKNOWN,
        CONNECTION_ETHERNET,
        CONNECTION_WIFI,
        CONNECTION_4G,
        CONNECTION_3G,
        CONNECTION_2G,
        CONNECTION_UNKNOWN_CELLULAR,
        CONNECTION_BLUETOOTH,
        CONNECTION_VPN,
        CONNECTION_NONE
    }

    public class ConnectivityManagerDelegate {
        private final ConnectivityManager connectivityManager;

        public ConnectivityManagerDelegate() {
            this.connectivityManager = null;
        }

        public ConnectivityManagerDelegate(Context context) {
            this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }

        public List getActiveNetworkList() {
            if (!supportNetworkCallback()) {
                return null;
            }
            List arrayList = new ArrayList();
            for (Network networkToInfo : getAllNetworks()) {
                NetworkInformation networkToInfo2 = networkToInfo(this, networkToInfo);
                if (networkToInfo2 != null) {
                    arrayList.add(networkToInfo2);
                }
            }
            return arrayList;
        }

        public Network[] getAllNetworks() {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager == null) {
                return new Network[0];
            }
            return connectivityManager.getAllNetworks();
        }

        public long getDefaultNetId() {
            if (supportNetworkCallback()) {
                NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    long j = -1;
                    for (Network network : getAllNetworks()) {
                        if (hasInternetCapability(network)) {
                            NetworkInfo networkInfo = this.connectivityManager.getNetworkInfo(network);
                            if (networkInfo != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                                if (j == -1) {
                                    j = NetworkMonitorAutoDetect.networkToNetId(network);
                                } else {
                                    throw new RuntimeException("Multiple connected networks of same type are not supported.");
                                }
                            }
                        }
                    }
                    return j;
                }
            }
            return -1;
        }

        public IPAddress[] getIPAddresses(LinkProperties linkProperties) {
            IPAddress[] iPAddressArr = new IPAddress[linkProperties.getLinkAddresses().size()];
            int i = 0;
            for (LinkAddress address : linkProperties.getLinkAddresses()) {
                iPAddressArr[i] = new IPAddress(address.getAddress().getAddress());
                i++;
            }
            return iPAddressArr;
        }

        public NetworkState getNetworkState() {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return getNetworkState(connectivityManager.getActiveNetworkInfo());
        }

        public NetworkState getNetworkState(Network network) {
            if (network != null) {
                ConnectivityManager connectivityManager = this.connectivityManager;
                if (connectivityManager != null) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    if (networkInfo == null) {
                        String str = NetworkMonitorAutoDetect.TAG;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Couldn't retrieve information from network ");
                        stringBuilder.append(network.toString());
                        Logging.m29387w(str, stringBuilder.toString());
                        return new NetworkState(false, -1, -1, -1, -1);
                    }
                    if (networkInfo.getType() != 17) {
                        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities != null) {
                            if (networkCapabilities.hasTransport(4)) {
                                return new NetworkState(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                            }
                        }
                    } else if (networkInfo.getType() == 17 && network.equals(this.connectivityManager.getActiveNetwork())) {
                        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo.getType() != 17) {
                            return new NetworkState(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                        }
                    }
                    return getNetworkState(networkInfo);
                }
            }
            return new NetworkState(false, -1, -1, -1, -1);
        }

        private NetworkState getNetworkState(NetworkInfo networkInfo) {
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    return new NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
                }
            }
            return new NetworkState(false, -1, -1, -1, -1);
        }

        public boolean hasInternetCapability(Network network) {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager == null) {
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
                return false;
            }
            return true;
        }

        public static NetworkInformation networkToInfo(ConnectivityManagerDelegate connectivityManagerDelegate, Network network) {
            if (network != null) {
                ConnectivityManager connectivityManager = connectivityManagerDelegate.connectivityManager;
                if (connectivityManager != null) {
                    LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                    String str;
                    StringBuilder stringBuilder;
                    if (linkProperties == null) {
                        str = NetworkMonitorAutoDetect.TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Detected unknown network: ");
                        stringBuilder.append(network.toString());
                        Logging.m29387w(str, stringBuilder.toString());
                        return null;
                    } else if (linkProperties.getInterfaceName() == null) {
                        str = NetworkMonitorAutoDetect.TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Null interface name for network ");
                        stringBuilder.append(network.toString());
                        Logging.m29387w(str, stringBuilder.toString());
                        return null;
                    } else {
                        NetworkState networkState = connectivityManagerDelegate.getNetworkState(network);
                        ConnectionType connectionType = NetworkMonitorAutoDetect.getConnectionType(networkState);
                        if (connectionType == ConnectionType.CONNECTION_NONE) {
                            str = NetworkMonitorAutoDetect.TAG;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Network ");
                            stringBuilder.append(network.toString());
                            stringBuilder.append(" is disconnected");
                            Logging.m29383d(str, stringBuilder.toString());
                            return null;
                        }
                        if (connectionType == ConnectionType.CONNECTION_UNKNOWN || connectionType == ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                            String str2 = NetworkMonitorAutoDetect.TAG;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Network ");
                            stringBuilder2.append(network.toString());
                            stringBuilder2.append(" connection type is ");
                            stringBuilder2.append(connectionType);
                            stringBuilder2.append(" because it has type ");
                            stringBuilder2.append(networkState.getNetworkType());
                            stringBuilder2.append(" and subtype ");
                            stringBuilder2.append(networkState.getNetworkSubType());
                            Logging.m29383d(str2, stringBuilder2.toString());
                        }
                        return new NetworkInformation(linkProperties.getInterfaceName(), connectionType, NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(networkState), NetworkMonitorAutoDetect.networkToNetId(network), connectivityManagerDelegate.getIPAddresses(linkProperties));
                    }
                }
            }
            return null;
        }

        public void registerNetworkCallback(NetworkCallback networkCallback) {
            this.connectivityManager.registerNetworkCallback(new Builder().addCapability(12).build(), networkCallback);
        }

        public void releaseCallback(NetworkCallback networkCallback) {
            if (supportNetworkCallback()) {
                Logging.m29383d(NetworkMonitorAutoDetect.TAG, "Unregister network callback");
                this.connectivityManager.unregisterNetworkCallback(networkCallback);
            }
        }

        public void requestMobileNetwork(NetworkCallback networkCallback) {
            Builder builder = new Builder();
            builder.addCapability(12).addTransportType(0);
            this.connectivityManager.requestNetwork(builder.build(), networkCallback);
        }

        public boolean supportNetworkCallback() {
            return VERSION.SDK_INT >= 21 && this.connectivityManager != null;
        }
    }

    public class IPAddress {
        public final byte[] address;

        public IPAddress(byte[] bArr) {
            this.address = bArr;
        }

        private byte[] getAddress() {
            return this.address;
        }
    }

    public class NetworkInformation {
        public final long handle;
        public final IPAddress[] ipAddresses;
        public final String name;
        public final ConnectionType type;
        public final ConnectionType underlyingTypeForVpn;

        public NetworkInformation(String str, ConnectionType connectionType, ConnectionType connectionType2, long j, IPAddress[] iPAddressArr) {
            this.name = str;
            this.type = connectionType;
            this.underlyingTypeForVpn = connectionType2;
            this.handle = j;
            this.ipAddresses = iPAddressArr;
        }

        private ConnectionType getConnectionType() {
            return this.type;
        }

        private long getHandle() {
            return this.handle;
        }

        private IPAddress[] getIpAddresses() {
            return this.ipAddresses;
        }

        private String getName() {
            return this.name;
        }

        private ConnectionType getUnderlyingConnectionTypeForVpn() {
            return this.underlyingTypeForVpn;
        }
    }

    public class NetworkState {
        private final boolean connected;
        private final int subtype;
        private final int type;
        private final int underlyingNetworkSubtypeForVpn;
        private final int underlyingNetworkTypeForVpn;

        public NetworkState(boolean z, int i, int i2, int i3, int i4) {
            this.connected = z;
            this.type = i;
            this.subtype = i2;
            this.underlyingNetworkTypeForVpn = i3;
            this.underlyingNetworkSubtypeForVpn = i4;
        }

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public boolean isConnected() {
            return this.connected;
        }
    }

    public interface Observer {
        void onConnectionTypeChanged(ConnectionType connectionType);

        void onNetworkConnect(NetworkInformation networkInformation);

        void onNetworkDisconnect(long j);
    }

    public class SimpleNetworkCallback extends NetworkCallback {
        public void onAvailable(Network network) {
            String str = NetworkMonitorAutoDetect.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Network becomes available: ");
            stringBuilder.append(network.toString());
            Logging.m29383d(str, stringBuilder.toString());
            onNetworkChanged(network);
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            String str = NetworkMonitorAutoDetect.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("capabilities changed: ");
            stringBuilder.append(networkCapabilities.toString());
            Logging.m29383d(str, stringBuilder.toString());
            onNetworkChanged(network);
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            String str = NetworkMonitorAutoDetect.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("link properties changed: ");
            stringBuilder.append(linkProperties.toString());
            Logging.m29383d(str, stringBuilder.toString());
            onNetworkChanged(network);
        }

        public void onLosing(Network network, int i) {
            String str = NetworkMonitorAutoDetect.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Network ");
            stringBuilder.append(network.toString());
            stringBuilder.append(" is about to lose in ");
            stringBuilder.append(i);
            stringBuilder.append("ms");
            Logging.m29383d(str, stringBuilder.toString());
        }

        public void onLost(Network network) {
            String str = NetworkMonitorAutoDetect.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Network ");
            stringBuilder.append(network.toString());
            stringBuilder.append(" is disconnected");
            Logging.m29383d(str, stringBuilder.toString());
            NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(NetworkMonitorAutoDetect.networkToNetId(network));
        }

        private void onNetworkChanged(Network network) {
            NetworkInformation networkToInfo = ConnectivityManagerDelegate.networkToInfo(NetworkMonitorAutoDetect.this.connectivityManagerDelegate, network);
            if (networkToInfo != null) {
                NetworkMonitorAutoDetect.this.observer.onNetworkConnect(networkToInfo);
            }
        }
    }

    public class WifiDirectManagerDelegate extends BroadcastReceiver {
        private static final int WIFI_P2P_NETWORK_HANDLE = 0;
        private final Context context;
        private final Observer observer;
        private NetworkInformation wifiP2pNetworkInfo = null;

        public WifiDirectManagerDelegate(Observer observer, Context context) {
            this.context = context;
            this.observer = observer;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context.registerReceiver(this, intentFilter);
        }

        public List getActiveNetworkList() {
            NetworkInformation networkInformation = this.wifiP2pNetworkInfo;
            if (networkInformation != null) {
                return Collections.singletonList(networkInformation);
            }
            return Collections.emptyList();
        }

        public void onReceive(Context context, Intent intent) {
            int D = AnonymousClass0cQ.D(this, -637725672);
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                onWifiP2pGroupChange((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
            AnonymousClass0cQ.E(this, context, intent, 109953860, D);
        }

        private void onWifiP2pGroupChange(WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup != null) {
                if (wifiP2pGroup.getInterface() != null) {
                    try {
                        List list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                        IPAddress[] iPAddressArr = new IPAddress[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            iPAddressArr[i] = new IPAddress(((InetAddress) list.get(i)).getAddress());
                        }
                        this.wifiP2pNetworkInfo = new NetworkInformation(wifiP2pGroup.getInterface(), ConnectionType.CONNECTION_WIFI, ConnectionType.CONNECTION_NONE, 0, iPAddressArr);
                        this.observer.onNetworkConnect(this.wifiP2pNetworkInfo);
                    } catch (Throwable e) {
                        Logging.m29385e(NetworkMonitorAutoDetect.TAG, "Unable to get WifiP2p network interface", e);
                    }
                }
            }
        }

        private void onWifiP2pStateChange(int i) {
            if (i == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0);
            }
        }

        public void release() {
            this.context.unregisterReceiver(this);
        }
    }

    public class WifiManagerDelegate {
        private final Context context;

        public WifiManagerDelegate() {
            this.context = null;
        }

        public WifiManagerDelegate(Context context) {
            this.context = context;
        }

        public String getWifiSSID() {
            Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver != null) {
                WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
                if (wifiInfo != null) {
                    String ssid = wifiInfo.getSSID();
                    if (ssid != null) {
                        return ssid;
                    }
                }
            }
            return JsonProperty.USE_DEFAULT_NAME;
        }
    }

    public NetworkMonitorAutoDetect(org.webrtc.NetworkMonitorAutoDetect.Observer r4, android.content.Context r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.<init>();
        r3.observer = r4;
        r3.context = r5;
        r0 = new org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate;
        r0.<init>(r5);
        r3.connectivityManagerDelegate = r0;
        r0 = new org.webrtc.NetworkMonitorAutoDetect$WifiManagerDelegate;
        r0.<init>(r5);
        r3.wifiManagerDelegate = r0;
        r0 = r3.connectivityManagerDelegate;
        r1 = r0.getNetworkState();
        r0 = getConnectionType(r1);
        r3.connectionType = r0;
        r0 = r3.getWifiSSID(r1);
        r3.wifiSSID = r0;
        r1 = new android.content.IntentFilter;
        r0 = "android.net.conn.CONNECTIVITY_CHANGE";
        r1.<init>(r0);
        r3.intentFilter = r1;
        r0 = "IncludeWifiDirect";
        r1 = org.webrtc.PeerConnectionFactory.fieldTrialsFindFullName(r0);
        r0 = "Enabled";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x003e:
        r0 = new org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate;
        r0.<init>(r4, r5);
        r3.wifiDirectManagerDelegate = r0;
    L_0x0045:
        r3.registerReceiver();
        r0 = r3.connectivityManagerDelegate;
        r0 = r0.supportNetworkCallback();
        r2 = 0;
        if (r0 == 0) goto L_0x0075;
    L_0x0051:
        r1 = new android.net.ConnectivityManager$NetworkCallback;
        r1.<init>();
        r0 = r3.connectivityManagerDelegate;	 Catch:{ SecurityException -> 0x005c }
        r0.requestMobileNetwork(r1);	 Catch:{ SecurityException -> 0x005c }
        goto L_0x0064;	 Catch:{ SecurityException -> 0x005c }
    L_0x005c:
        r1 = "NetworkMonitorAutoDetect";
        r0 = "Unable to obtain permission to request a cellular network.";
        org.webrtc.Logging.m29387w(r1, r0);
        r1 = r2;
    L_0x0064:
        r3.mobileNetworkCallback = r1;
        r0 = new org.webrtc.NetworkMonitorAutoDetect$SimpleNetworkCallback;
        r0.<init>();
        r3.allNetworkCallback = r0;
        r1 = r3.connectivityManagerDelegate;
        r0 = r3.allNetworkCallback;
        r1.registerNetworkCallback(r0);
        goto L_0x0079;
    L_0x0075:
        r3.mobileNetworkCallback = r2;
        r3.allNetworkCallback = r2;
    L_0x0079:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitorAutoDetect.<init>(org.webrtc.NetworkMonitorAutoDetect$Observer, android.content.Context):void");
    }

    private void connectionTypeChanged(NetworkState networkState) {
        ConnectionType connectionType = getConnectionType(networkState);
        String wifiSSID = getWifiSSID(networkState);
        if (connectionType != this.connectionType || !wifiSSID.equals(this.wifiSSID)) {
            this.connectionType = connectionType;
            this.wifiSSID = wifiSSID;
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Network connectivity changed, type is: ");
            stringBuilder.append(this.connectionType);
            Logging.m29383d(str, stringBuilder.toString());
            this.observer.onConnectionTypeChanged(connectionType);
        }
    }

    public void destroy() {
        NetworkCallback networkCallback = this.allNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        networkCallback = this.mobileNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            wifiDirectManagerDelegate.release();
        }
        unregisterReceiver();
    }

    public List getActiveNetworkList() {
        Collection activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            return null;
        }
        List arrayList = new ArrayList(activeNetworkList);
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            arrayList.addAll(wifiDirectManagerDelegate.getActiveNetworkList());
        }
        return arrayList;
    }

    public static ConnectionType getConnectionType(NetworkState networkState) {
        return getConnectionType(networkState.isConnected(), networkState.getNetworkType(), networkState.getNetworkSubType());
    }

    private static ConnectionType getConnectionType(boolean z, int i, int i2) {
        if (!z) {
            return ConnectionType.CONNECTION_NONE;
        }
        switch (i) {
            case 0:
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    case 11:
                        return ConnectionType.CONNECTION_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return ConnectionType.CONNECTION_3G;
                    case ParserMinimalBase.INT_CR /*13*/:
                        break;
                    default:
                        return ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                }
            case 1:
                return ConnectionType.CONNECTION_WIFI;
            case 6:
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return ConnectionType.CONNECTION_BLUETOOTH;
            case 9:
                return ConnectionType.CONNECTION_ETHERNET;
            case 17:
                return ConnectionType.CONNECTION_VPN;
            default:
                return ConnectionType.CONNECTION_UNKNOWN;
        }
        return ConnectionType.CONNECTION_4G;
    }

    public NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    public static ConnectionType getUnderlyingConnectionTypeForVpn(NetworkState networkState) {
        if (networkState.getNetworkType() != 17) {
            return ConnectionType.CONNECTION_NONE;
        }
        return getConnectionType(networkState.isConnected(), networkState.getUnderlyingNetworkTypeForVpn(), networkState.getUnderlyingNetworkSubtypeForVpn());
    }

    private String getWifiSSID(NetworkState networkState) {
        if (getConnectionType(networkState) != ConnectionType.CONNECTION_WIFI) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        return this.wifiManagerDelegate.getWifiSSID();
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    public static long networkToNetId(Network network) {
        if (VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    public void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, -1282974911);
        NetworkState currentNetworkState = getCurrentNetworkState();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            connectionTypeChanged(currentNetworkState);
        }
        AnonymousClass0cQ.E(this, context, intent, -1952484097, D);
    }

    private void registerReceiver() {
        if (!this.isRegistered) {
            this.isRegistered = true;
            this.context.registerReceiver(this, this.intentFilter);
        }
    }

    public void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.connectivityManagerDelegate = connectivityManagerDelegate;
    }

    public void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        this.wifiManagerDelegate = wifiManagerDelegate;
    }

    public boolean supportNetworkCallback() {
        return this.connectivityManagerDelegate.supportNetworkCallback();
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }
}
