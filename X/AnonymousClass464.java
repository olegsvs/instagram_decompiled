package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.464 */
public final class AnonymousClass464 {
    /* renamed from: B */
    public static ArrayNode m23210B(Context context, AccessibilityManager accessibilityManager) {
        Context<AccessibilityServiceInfo> E = AnonymousClass464.m23213E(context, accessibilityManager);
        if (E != null) {
            if (E.size() != 0) {
                accessibilityManager = new ArrayNode(JsonNodeFactory.instance);
                for (AccessibilityServiceInfo D : E) {
                    accessibilityManager.add(AnonymousClass464.m23212D(D));
                }
                return accessibilityManager;
            }
        }
        return null;
    }

    /* renamed from: C */
    public static ArrayNode m23211C(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = accessibilityManager.getInstalledAccessibilityServiceList();
        if (installedAccessibilityServiceList != null) {
            if (installedAccessibilityServiceList.size() != 0) {
                accessibilityManager = new ArrayNode(JsonNodeFactory.instance);
                for (AccessibilityServiceInfo D : installedAccessibilityServiceList) {
                    accessibilityManager.add(AnonymousClass464.m23212D(D));
                }
                return accessibilityManager;
            }
        }
        return null;
    }

    /* renamed from: D */
    private static ObjectNode m23212D(AccessibilityServiceInfo accessibilityServiceInfo) {
        JsonNodeFactory jsonNodeFactory = JsonNodeFactory.instance;
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        int i = accessibilityServiceInfo.eventTypes;
        JsonNode arrayNode = new ArrayNode(jsonNodeFactory);
        while (i != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            String eventTypeToString = AccessibilityEvent.eventTypeToString(numberOfTrailingZeros);
            if (!eventTypeToString.equals(JsonProperty.USE_DEFAULT_NAME)) {
                arrayNode.add(eventTypeToString);
            }
            i &= numberOfTrailingZeros ^ -1;
        }
        if (arrayNode.size() > 0) {
            objectNode.put("event_type", arrayNode);
        }
        i = accessibilityServiceInfo.feedbackType;
        arrayNode = new ArrayNode(jsonNodeFactory);
        while (i != 0) {
            int numberOfTrailingZeros2 = 1 << Integer.numberOfTrailingZeros(i);
            int i2 = numberOfTrailingZeros2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            while (i2 > 0) {
                int numberOfTrailingZeros3 = 1 << Integer.numberOfTrailingZeros(i2);
                i2 &= numberOfTrailingZeros3 ^ -1;
                if (stringBuilder.length() > 1) {
                    stringBuilder.append(", ");
                }
                if (numberOfTrailingZeros3 == 4) {
                    stringBuilder.append("FEEDBACK_AUDIBLE");
                } else if (numberOfTrailingZeros3 == 8) {
                    stringBuilder.append("FEEDBACK_VISUAL");
                } else if (numberOfTrailingZeros3 != 16) {
                    switch (numberOfTrailingZeros3) {
                        case 1:
                            stringBuilder.append("FEEDBACK_SPOKEN");
                            break;
                        case 2:
                            stringBuilder.append("FEEDBACK_HAPTIC");
                            break;
                        default:
                            break;
                    }
                } else {
                    stringBuilder.append("FEEDBACK_GENERIC");
                }
            }
            stringBuilder.append("]");
            eventTypeToString = stringBuilder.toString();
            if (!eventTypeToString.equals("[]")) {
                arrayNode.add(eventTypeToString);
            }
            i &= numberOfTrailingZeros2 ^ -1;
        }
        if (arrayNode.size() > 0) {
            objectNode.put("feedback_type", arrayNode);
        }
        objectNode.put("id", accessibilityServiceInfo.getId());
        JsonNode arrayNode2 = new ArrayNode(jsonNodeFactory);
        int i3 = accessibilityServiceInfo.flags;
        while (i3 != 0) {
            int numberOfTrailingZeros4 = 1 << Integer.numberOfTrailingZeros(i3);
            String C = AnonymousClass1lD.m12935C(numberOfTrailingZeros4);
            if (C != null) {
                arrayNode2.add(C);
            }
            i3 &= numberOfTrailingZeros4 ^ -1;
        }
        if (arrayNode2.size() > 0) {
            objectNode.put("flags", arrayNode2);
        }
        JsonNode arrayNode3 = new ArrayNode(jsonNodeFactory);
        i = AnonymousClass1lD.f22449B.mo3496A(accessibilityServiceInfo);
        while (i != 0) {
            i3 = 1 << Integer.numberOfTrailingZeros(i);
            eventTypeToString = AnonymousClass1lD.m12934B(i3);
            if (!eventTypeToString.equals("UNKNOWN")) {
                arrayNode3.add(eventTypeToString);
            }
            i &= i3 ^ -1;
        }
        if (arrayNode3.size() > 0) {
            objectNode.put("capabilities", arrayNode3);
        }
        objectNode.put("notification_timeout", accessibilityServiceInfo.notificationTimeout);
        String[] strArr = accessibilityServiceInfo.packageNames;
        arrayNode2 = new ArrayNode(jsonNodeFactory);
        if (strArr != null && strArr.length > 0) {
            for (String C2 : strArr) {
                arrayNode2.add(C2);
            }
            objectNode.put("package_names", arrayNode2);
        }
        return objectNode;
    }

    /* renamed from: E */
    private static List m23213E(Context context, AccessibilityManager accessibilityManager) {
        if (AnonymousClass465.m23214B(context) == null) {
            return new ArrayList();
        }
        return accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }
}
