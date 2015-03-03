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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/foreach_bounds.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_foreach_bounds extends ScriptC {
    private static final String __rs_resource_name = "foreach_bounds";
    // Constructor
    public  ScriptC_foreach_bounds(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_foreach_bounds(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __I32 = Element.I32(rs);
        mExportVar_xStart = 0;
        mExportVar_xEnd = 0;
        mExportVar_yStart = 0;
        mExportVar_yEnd = 0;
        __SCRIPT = Element.SCRIPT(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private Element __SCRIPT;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_SCRIPT;
    private final static int mExportVarIdx_dimX = 0;
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

    private final static int mExportVarIdx_dimY = 1;
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

    private final static int mExportVarIdx_xStart = 2;
    private int mExportVar_xStart;
    public synchronized void set_xStart(int v) {
        setVar(mExportVarIdx_xStart, v);
        mExportVar_xStart = v;
    }

    public int get_xStart() {
        return mExportVar_xStart;
    }

    public Script.FieldID getFieldID_xStart() {
        return createFieldID(mExportVarIdx_xStart, null);
    }

    private final static int mExportVarIdx_xEnd = 3;
    private int mExportVar_xEnd;
    public synchronized void set_xEnd(int v) {
        setVar(mExportVarIdx_xEnd, v);
        mExportVar_xEnd = v;
    }

    public int get_xEnd() {
        return mExportVar_xEnd;
    }

    public Script.FieldID getFieldID_xEnd() {
        return createFieldID(mExportVarIdx_xEnd, null);
    }

    private final static int mExportVarIdx_yStart = 4;
    private int mExportVar_yStart;
    public synchronized void set_yStart(int v) {
        setVar(mExportVarIdx_yStart, v);
        mExportVar_yStart = v;
    }

    public int get_yStart() {
        return mExportVar_yStart;
    }

    public Script.FieldID getFieldID_yStart() {
        return createFieldID(mExportVarIdx_yStart, null);
    }

    private final static int mExportVarIdx_yEnd = 5;
    private int mExportVar_yEnd;
    public synchronized void set_yEnd(int v) {
        setVar(mExportVarIdx_yEnd, v);
        mExportVar_yEnd = v;
    }

    public int get_yEnd() {
        return mExportVar_yEnd;
    }

    public Script.FieldID getFieldID_yEnd() {
        return createFieldID(mExportVarIdx_yEnd, null);
    }

    private final static int mExportVarIdx_s = 6;
    private Script mExportVar_s;
    public synchronized void set_s(Script v) {
        setVar(mExportVarIdx_s, v);
        mExportVar_s = v;
    }

    public Script get_s() {
        return mExportVar_s;
    }

    public Script.FieldID getFieldID_s() {
        return createFieldID(mExportVarIdx_s, null);
    }

    private final static int mExportVarIdx_aRaw = 7;
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

    private final static int mExportVarIdx_ain = 8;
    private Allocation mExportVar_ain;
    public synchronized void set_ain(Allocation v) {
        setVar(mExportVarIdx_ain, v);
        mExportVar_ain = v;
    }

    public Allocation get_ain() {
        return mExportVar_ain;
    }

    public Script.FieldID getFieldID_ain() {
        return createFieldID(mExportVarIdx_ain, null);
    }

    private final static int mExportVarIdx_aout = 9;
    private Allocation mExportVar_aout;
    public synchronized void set_aout(Allocation v) {
        setVar(mExportVarIdx_aout, v);
        mExportVar_aout = v;
    }

    public Allocation get_aout() {
        return mExportVar_aout;
    }

    public Script.FieldID getFieldID_aout() {
        return createFieldID(mExportVarIdx_aout, null);
    }

    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 26, null, null);
    }

    public void forEach_root(Allocation aout) {
        forEach_root(aout, null);
    }

    public void forEach_root(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_root, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_zero = 1;
    public Script.KernelID getKernelID_zero() {
        return createKernelID(mExportForEachIdx_zero, 34, null, null);
    }

    public void forEach_zero(Allocation aout) {
        forEach_zero(aout, null);
    }

    public void forEach_zero(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_zero, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_foreach_bounds_test = 0;
    public void invoke_foreach_bounds_test() {
        invoke(mExportFuncIdx_foreach_bounds_test);
    }

}

