/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/clamp_relaxed.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.clamp_relaxedBitCode;

/**
 * @hide
 */
public class ScriptC_clamp_relaxed extends ScriptC {
    private static final String __rs_resource_name = "clamp_relaxed";
    // Constructor
    public  ScriptC_clamp_relaxed(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              clamp_relaxedBitCode.getBitCode32(),
              clamp_relaxedBitCode.getBitCode64());
    }

    private final static int mExportFuncIdx_clamp_test = 0;
    public void invoke_clamp_test() {
        invoke(mExportFuncIdx_clamp_test);
    }

}

