package org.webrtc;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.NetworkMonitorAutoDetect.ConnectionType;
import org.webrtc.NetworkMonitorAutoDetect.NetworkInformation;
import org.webrtc.NetworkMonitorAutoDetect.Observer;

public class NetworkMonitor {
    private static final String TAG = "NetworkMonitor";
    private NetworkMonitorAutoDetect autoDetect;
    private final Object autoDetectLock;
    private volatile ConnectionType currentConnectionType;
    private final ArrayList nativeNetworkObservers;
    private final ArrayList networkObservers;
    private int numObservers;

    public class InstanceHolder {
        public static final NetworkMonitor instance = new NetworkMonitor();

        private InstanceHolder() {
        }
    }

    public interface NetworkObserver {
        void onConnectionTypeChanged(ConnectionType connectionType);
    }

    /* renamed from: org.webrtc.NetworkMonitor$1 */
    public class C02611 implements Observer {
        public void onConnectionTypeChanged(ConnectionType connectionType) {
            NetworkMonitor.updateCurrentConnectionType(NetworkMonitor.this, connectionType);
        }

        public void onNetworkConnect(NetworkInformation networkInformation) {
            NetworkMonitor.notifyObserversOfNetworkConnect(NetworkMonitor.this, networkInformation);
        }

        public void onNetworkDisconnect(long j) {
            NetworkMonitor.notifyObserversOfNetworkDisconnect(NetworkMonitor.this, j);
        }
    }

    public static void init(Context context) {
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j, NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    public NetworkMonitor() {
        this.autoDetectLock = new Object();
        this.nativeNetworkObservers = new ArrayList();
        this.networkObservers = new ArrayList();
        this.numObservers = 0;
        this.currentConnectionType = ConnectionType.CONNECTION_UNKNOWN;
    }

    public static void addNetworkObserver(NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    private static int androidSdkInt() {
        return VERSION.SDK_INT;
    }

    private static void assertIsTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected to be true");
        }
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context) {
        NetworkMonitor instance = getInstance();
        NetworkMonitorAutoDetect createAutoDetect = instance.createAutoDetect(context);
        instance.autoDetect = createAutoDetect;
        return createAutoDetect;
    }

    private NetworkMonitorAutoDetect createAutoDetect(Context context) {
        return new NetworkMonitorAutoDetect(new C02611(), context);
    }

    private ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    private long getCurrentDefaultNetId() {
        long defaultNetId;
        synchronized (this.autoDetectLock) {
            defaultNetId = this.autoDetect == null ? -1 : this.autoDetect.getDefaultNetId();
        }
        return defaultNetId;
    }

    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    private List getNativeNetworkObserversSync() {
        List arrayList;
        synchronized (this.nativeNetworkObservers) {
            arrayList = new ArrayList(this.nativeNetworkObservers);
        }
        return arrayList;
    }

    public NetworkMonitorAutoDetect getNetworkMonitorAutoDetect() {
        NetworkMonitorAutoDetect networkMonitorAutoDetect;
        synchronized (this.autoDetectLock) {
            networkMonitorAutoDetect = this.autoDetect;
        }
        return networkMonitorAutoDetect;
    }

    public int getNumObservers() {
        int i;
        synchronized (this.autoDetectLock) {
            i = this.numObservers;
        }
        return i;
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != ConnectionType.CONNECTION_NONE;
    }

    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.autoDetectLock) {
            z = this.autoDetect != null && this.autoDetect.supportNetworkCallback();
        }
        return z;
    }

    private void notifyObserversOfConnectionTypeChange(ConnectionType connectionType) {
        for (Long longValue : getNativeNetworkObserversSync()) {
            nativeNotifyConnectionTypeChanged(longValue.longValue());
        }
        synchronized (this.networkObservers) {
            List<NetworkObserver> arrayList = new ArrayList(this.networkObservers);
        }
        for (NetworkObserver onConnectionTypeChanged : arrayList) {
            onConnectionTypeChanged.onConnectionTypeChanged(connectionType);
        }
    }

    public static void notifyObserversOfNetworkConnect(NetworkMonitor networkMonitor, NetworkInformation networkInformation) {
        for (Long longValue : networkMonitor.getNativeNetworkObserversSync()) {
            networkMonitor.nativeNotifyOfNetworkConnect(longValue.longValue(), networkInformation);
        }
    }

    public static void notifyObserversOfNetworkDisconnect(NetworkMonitor networkMonitor, long j) {
        for (Long longValue : networkMonitor.getNativeNetworkObserversSync()) {
            networkMonitor.nativeNotifyOfNetworkDisconnect(longValue.longValue(), j);
        }
    }

    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void startMonitoring() {
        startMonitoring(ContextUtils.getApplicationContext());
    }

    public void startMonitoring(Context context) {
        synchronized (this.autoDetectLock) {
            this.numObservers++;
            if (this.autoDetect == null) {
                this.autoDetect = createAutoDetect(context);
            }
            this.currentConnectionType = NetworkMonitorAutoDetect.getConnectionType(this.autoDetect.getCurrentNetworkState());
        }
    }

    private void startMonitoring(Context context, long j) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Start monitoring with native observer ");
        stringBuilder.append(j);
        Logging.m29383d(str, stringBuilder.toString());
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        startMonitoring(context);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(Long.valueOf(j));
        }
        updateObserverActiveNetworkList(j);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }

    public void stopMonitoring() {
        synchronized (this.autoDetectLock) {
            int i = this.numObservers - 1;
            this.numObservers = i;
            if (i == 0) {
                this.autoDetect.destroy();
                this.autoDetect = null;
            }
        }
    }

    private void stopMonitoring(long j) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stop monitoring with native observer ");
        stringBuilder.append(j);
        Logging.m29383d(str, stringBuilder.toString());
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j));
        }
    }

    public static void updateCurrentConnectionType(NetworkMonitor networkMonitor, ConnectionType connectionType) {
        networkMonitor.currentConnectionType = connectionType;
        networkMonitor.notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j) {
        synchronized (this.autoDetectLock) {
            List activeNetworkList = this.autoDetect == null ? null : this.autoDetect.getActiveNetworkList();
        }
        if (activeNetworkList != null) {
            if (activeNetworkList.size() != 0) {
                nativeNotifyOfActiveNetworkList(j, (NetworkInformation[]) activeNetworkList.toArray(new NetworkInformation[activeNetworkList.size()]));
            }
        }
    }
}
