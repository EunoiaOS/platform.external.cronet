// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.net.impl;

import androidx.annotation.RequiresApi;

@RequiresApi(api = 34)
class AndroidCallbackExceptionWrapper extends org.chromium.net.CallbackException {
    protected AndroidCallbackExceptionWrapper(android.net.http.CallbackException e) {
        // The CallbackException contract states the cause of the top level exception is the
        // exception thrown by the callback.
        super(e.getMessage(), e.getCause());
    }
}
