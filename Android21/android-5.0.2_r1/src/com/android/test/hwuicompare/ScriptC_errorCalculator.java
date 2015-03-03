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
 * The source Renderscript file: frameworks/base/tests/CanvasCompare/src/com/android/test/hwuicompare/errorCalculator.rs
 */

package com.android.test.hwuicompare;

import android.renderscript.*;
import com.android.test.hwuicompare.errorCalculatorBitCode;

/**
 * @hide
 */
public class ScriptC_errorCalculator extends ScriptC {
    private static final String __rs_resource_name = "errorcalculator";
    // Constructor
    public  ScriptC_errorCalculator(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              errorCalculatorBitCode.getBitCode32(),
              errorCalculatorBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_REGION_SIZE = 0;
    private int mExportVar_REGION_SIZE;
    public synchronized void set_REGION_SIZE(int v) {
        setVar(mExportVarIdx_REGION_SIZE, v);
        mExportVar_REGION_SIZE = v;
    }

    public int get_REGION_SIZE() {
        return mExportVar_REGION_SIZE;
    }

    public Script.FieldID getFieldID_REGION_SIZE() {
        return createFieldID(mExportVarIdx_REGION_SIZE, null);
    }

    private final static int mExportVarIdx_WIDTH = 1;
    private int mExportVar_WIDTH;
    public synchronized void set_WIDTH(int v) {
        setVar(mExportVarIdx_WIDTH, v);
        mExportVar_WIDTH = v;
    }

    public int get_WIDTH() {
        return mExportVar_WIDTH;
    }

    public Script.FieldID getFieldID_WIDTH() {
        return createFieldID(mExportVarIdx_WIDTH, null);
    }

    private final static int mExportVarIdx_HEIGHT = 2;
    private int mExportVar_HEIGHT;
    public synchronized void set_HEIGHT(int v) {
        setVar(mExportVarIdx_HEIGHT, v);
        mExportVar_HEIGHT = v;
    }

    public int get_HEIGHT() {
        return mExportVar_HEIGHT;
    }

    public Script.FieldID getFieldID_HEIGHT() {
        return createFieldID(mExportVarIdx_HEIGHT, null);
    }

    private final static int mExportVarIdx_ideal = 3;
    private Allocation mExportVar_ideal;
    public synchronized void set_ideal(Allocation v) {
        setVar(mExportVarIdx_ideal, v);
        mExportVar_ideal = v;
    }

    public Allocation get_ideal() {
        return mExportVar_ideal;
    }

    public Script.FieldID getFieldID_ideal() {
        return createFieldID(mExportVarIdx_ideal, null);
    }

    private final static int mExportVarIdx_given = 4;
    private Allocation mExportVar_given;
    public synchronized void set_given(Allocation v) {
        setVar(mExportVarIdx_given, v);
        mExportVar_given = v;
    }

    public Allocation get_given() {
        return mExportVar_given;
    }

    public Script.FieldID getFieldID_given() {
        return createFieldID(mExportVarIdx_given, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_countInterestingRegions = 1;
    public Script.KernelID getKernelID_countInterestingRegions() {
        return createKernelID(mExportForEachIdx_countInterestingRegions, 3, null, null);
    }

    public void forEach_countInterestingRegions(Allocation ain, Allocation aout) {
        forEach_countInterestingRegions(ain, aout, null);
    }

    public void forEach_countInterestingRegions(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_countInterestingRegions, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_accumulateError = 2;
    public Script.KernelID getKernelID_accumulateError() {
        return createKernelID(mExportForEachIdx_accumulateError, 3, null, null);
    }

    public void forEach_accumulateError(Allocation ain, Allocation aout) {
        forEach_accumulateError(ain, aout, null);
    }

    public void forEach_accumulateError(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_accumulateError, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_displayDifference = 3;
    public Script.KernelID getKernelID_displayDifference() {
        return createKernelID(mExportForEachIdx_displayDifference, 27, null, null);
    }

    public void forEach_displayDifference(Allocation ain, Allocation aout) {
        forEach_displayDifference(ain, aout, null);
    }

    public void forEach_displayDifference(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
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

        forEach(mExportForEachIdx_displayDifference, ain, aout, null, sc);
    }

}

