package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack.MediaType;

public class RtpParameters {
    public final List codecs;
    public final List encodings;
    public final String transactionId;

    public class Codec {
        public Integer clockRate;
        public MediaType kind;
        public String name;
        public Integer numChannels;
        public Map parameters;
        public int payloadType;

        public Codec(int i, String str, MediaType mediaType, Integer num, Integer num2, Map map) {
            this.payloadType = i;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
        }

        public Integer getClockRate() {
            return this.clockRate;
        }

        public MediaType getKind() {
            return this.kind;
        }

        public String getName() {
            return this.name;
        }

        public Integer getNumChannels() {
            return this.numChannels;
        }

        public Map getParameters() {
            return this.parameters;
        }

        public int getPayloadType() {
            return this.payloadType;
        }
    }

    public class Encoding {
        public boolean active = true;
        public Integer maxBitrateBps;
        public Long ssrc;

        public Encoding(boolean z, Integer num, Long l) {
            this.active = z;
            this.maxBitrateBps = num;
            this.ssrc = l;
        }

        public boolean getActive() {
            return this.active;
        }

        public Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        public Long getSsrc() {
            return this.ssrc;
        }
    }

    public RtpParameters(String str, List list, List list2) {
        this.transactionId = str;
        this.encodings = list;
        this.codecs = list2;
    }

    public List getCodecs() {
        return this.codecs;
    }

    public List getEncodings() {
        return this.encodings;
    }

    public String getTransactionId() {
        return this.transactionId;
    }
}
