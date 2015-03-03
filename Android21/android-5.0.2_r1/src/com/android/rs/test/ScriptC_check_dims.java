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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/check_dims.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.check_dimsBitCode;

/**
 * @hide
 */
public class ScriptC_check_dims extends ScriptC {
    private static final String __rs_resource_name = "check_dims";
    // Constructor
    public  ScriptC_check_dims(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              check_dimsBitCode.getBitCode32(),
              check_dimsBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_pattern = 0;
    private int mExportVar_pattern;
    public synchronized void set_pattern(int v) {
        setVar(mExportVarIdx_pattern, v);
        mExportVar_pattern = v;
    }

    public int get_pattern() {
        return mExportVar_pattern;
    }

    public Script.FieldID getFieldID_pattern() {
        return createFieldID(mExportVarIdx_pattern, null);
    }

    private final static int mExportVarIdx_aFailed = 1;
    private Allocation mExportVar_aFailed;
    public synchronized void set_aFailed(Allocation v) {
        setVar(mExportVarIdx_aFailed, v);
        mExportVar_aFailed = v;
    }

    public Allocation get_aFailed() {
        return mExportVar_aFailed;
    }

    public Script.FieldID getFieldID_aFailed() {
        return createFieldID(mExportVarIdx_aFailed, null);
    }

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

    private final static int mExportFuncIdx_check_dims_test = 0;
    public void invoke_check_dims_test() {
        invoke(mExportFuncIdx_check_dims_test);
    }

}

