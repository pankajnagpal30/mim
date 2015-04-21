package org.motechproject.nms.flw.domain;

/**
 * Reason the call was disconnected, returned by IMI (the IVR provider)
 */
public enum CallDisconnectReason {
    INVALID, // 0
    NORMAL_DROP, // 1
    VXML_RUNTIME_EXCEPTION, // 2
    CONTENT_NOT_FOUND, // 3
    USAGE_CAP_EXCEEDED, // 4
    ERROR_IN_THE_API, // 5
    SYSTEM_ERROR; // 6

    public static CallDisconnectReason fromInt(int i) {
        if (i >= 1 && i < values().length) {
            return values()[i - 1];
        } else {
            throw new IllegalArgumentException(String.format("%d is an invalid CallDisconnectReason", i));
        }
    }
}
