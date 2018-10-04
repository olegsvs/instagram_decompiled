package com.facebook.proxygen;

public class NetworkType {

    public enum CellularType {
        NOT_CELLULAR(0),
        G2(1),
        G3(2),
        G4(3),
        UNKNOWN(4);
        
        public int value;

        private CellularType(int i) {
            this.value = i;
        }
    }

    public enum ConnectivityType {
        NOCONN(0),
        WIFI(1),
        CELLULAR(2),
        OTHER(3);
        
        public int value;

        private ConnectivityType(int i) {
            this.value = i;
        }
    }
}
