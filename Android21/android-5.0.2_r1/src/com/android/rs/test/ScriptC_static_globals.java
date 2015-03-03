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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/static_globals.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.static_globalsBitCode;

/**
 * @hide
 */
public class ScriptC_static_globals extends ScriptC {
    private static final String __rs_resource_name = "static_globals";
    // Constructor
    public  ScriptC_static_globals(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              static_globalsBitCode.getBitCode32(),
              static_globalsBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 25, null, null);
    }

    public void forEach_root(Allocation ain) {
        forEach_root(ain, null);
    }

    public void forEach_root(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_root, ain, null, null, sc);
    }

    private final static int mExportFuncIdx_static_globals_test = 0;
    public void invoke_static_globals_test() {
        invoke(mExportFuncIdx_static_globals_test);
    }

}

