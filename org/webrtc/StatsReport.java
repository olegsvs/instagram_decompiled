package org.webrtc;

public class StatsReport {
    public final String id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public class Value {
        public final String name;
        public final String value;

        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.name);
            stringBuilder.append(": ");
            stringBuilder.append(this.value);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: ");
        stringBuilder.append(this.id);
        stringBuilder.append(", type: ");
        stringBuilder.append(this.type);
        stringBuilder.append(", timestamp: ");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", values: ");
        int i = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i >= valueArr.length) {
                return stringBuilder.toString();
            }
            stringBuilder.append(valueArr[i].toString());
            stringBuilder.append(", ");
            i++;
        }
    }
}
