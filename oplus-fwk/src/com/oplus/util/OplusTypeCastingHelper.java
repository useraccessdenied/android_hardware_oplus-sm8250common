/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Stub of the Oplus framework helper used by OplusCamera (TypeFaceUtil).
 * Original semantics: return obj cast to cls if it is an instance, else null.
 */
package com.oplus.util;

public class OplusTypeCastingHelper {
    public static <T> T typeCasting(Class<T> clazz, Object obj) {
        if (clazz == null || obj == null || !clazz.isInstance(obj)) {
            return null;
        }
        return clazz.cast(obj);
    }
}
