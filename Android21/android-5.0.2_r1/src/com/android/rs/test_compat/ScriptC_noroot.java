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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/noroot.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_noroot extends ScriptC {
    private static final String __rs_resource_name = "noroot";
    // Constructor
    public  ScriptC_noroot(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_noroot(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __ALLOCATION = Element.ALLOCATION(rs);
        __I32 = Element.I32(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_aRaw = 0;
    private Allocation mExportVar_aRaw;
    public synchronized void set_aRaw(Allocation v) {
        setVar(mExportVarIdx_aRaw, v);
        mExportVar_aRaw = v;
    }

    public Allocation get_aRaw() {
        return mExportVar_aRaw;
    }

    public Script.FieldID getFieldID_aRaw() {
        return createFieldID(mExportVarIdx_aRaw, null);
    }

    private final static int mExportVarIdx_dimX = 1;
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

    private final static int mExportVarIdx_dimY = 2;
    private int mExportVar_dimY;
    public synchronized void set_dimY(int v) {
        setVar(mExportVarIdx_dimY, v);
        mExportVar_dimY = v;
    }

    public int get_dimY() {
        return mExportVar_dimY;
    }

    public Script.FieldID getFieldID_dimY() {
        return createFieldID(mExportVarIdx_dimY, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_foo = 1;
    public Script.KernelID getKernelID_foo() {
        return createKernelID(mExportForEachIdx_foo, 27, null, null);
    }

    public void forEach_foo(Allocation ain, Allocation aout) {
        forEach_foo(ain, aout, null);
    }

    public void forEach_foo(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_foo, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_verify_foo = 0;
    public void invoke_verify_foo() {
        invoke(mExportFuncIdx_verify_foo);
    }

    private final static int mExportFuncIdx_noroot_test = 1;
    public void invoke_noroot_test() {
        invoke(mExportFuncIdx_noroot_test);
    }

}

