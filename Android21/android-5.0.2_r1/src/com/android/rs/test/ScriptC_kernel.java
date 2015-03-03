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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/kernel.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.kernelBitCode;

/**
 * @hide
 */
public class ScriptC_kernel extends ScriptC {
    private static final String __rs_resource_name = "kernel";
    // Constructor
    public  ScriptC_kernel(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              kernelBitCode.getBitCode32(),
              kernelBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_ain = 0;
    private Allocation mExportVar_ain;
    public void bind_ain(Allocation v) {
        mExportVar_ain = v;
        if (v == null) bindAllocation(null, mExportVarIdx_ain);
        else bindAllocation(v, mExportVarIdx_ain);
    }

    public Allocation get_ain() {
        return mExportVar_ain;
    }

    private final static int mExportVarIdx_aout = 1;
    private Allocation mExportVar_aout;
    public void bind_aout(Allocation v) {
        mExportVar_aout = v;
        if (v == null) bindAllocation(null, mExportVarIdx_aout);
        else bindAllocation(v, mExportVarIdx_aout);
    }

    public Allocation get_aout() {
        return mExportVar_aout;
    }

    private final static int mExportVarIdx_dimX = 2;
    private int mExportVar_dimX;
    public synchronized void set_dimX(int v) {
        setVar(mExportVarIdx_dimX, v);
        mExportVar_dimX = v;
    }

    public int get_dimX() {
        return mExportVar_dimX;
    }

    public Script.FieldID getFieldID_dimX() {
        return createFieldID(mExportVarIdx_dimX, null);
    }

    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 43, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout) {
        forEach_root(ain, aout, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_root, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_init_vars = 1;
    public Script.KernelID getKernelID_init_vars() {
        return createKernelID(mExportForEachIdx_init_vars, 2, null, null);
    }

    public void forEach_init_vars(Allocation aout) {
        forEach_init_vars(aout, null);
    }

    public void forEach_init_vars(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_init_vars, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_verify_root = 0;
    public void invoke_verify_root() {
        invoke(mExportFuncIdx_verify_root);
    }

    private final static int mExportFuncIdx_kernel_test = 1;
    public void invoke_kernel_test() {
        invoke(mExportFuncIdx_kernel_test);
    }

}

