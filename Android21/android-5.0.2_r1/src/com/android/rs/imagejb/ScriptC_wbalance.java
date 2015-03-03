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
 * The source Renderscript file: frameworks/rs/java/tests/ImageProcessing_jb/src/com/android/rs/image/wbalance.rs
 */

package com.android.rs.imagejb;

import android.renderscript.*;
import com.android.rs.imagejb.wbalanceBitCode;

/**
 * @hide
 */
public class ScriptC_wbalance extends ScriptC {
    private static final String __rs_resource_name = "wbalance";
    // Constructor
    public  ScriptC_wbalance(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              wbalanceBitCode.getBitCode32(),
              wbalanceBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __U32 = Element.U32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __U32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_U32;
    private final static int mExportVarIdx_histogramSource = 0;
    private Allocation mExportVar_histogramSource;
    public synchronized void set_histogramSource(Allocation v) {
        setVar(mExportVarIdx_histogramSource, v);
        mExportVar_histogramSource = v;
    }

    public Allocation get_histogramSource() {
        return mExportVar_histogramSource;
    }

    public Script.FieldID getFieldID_histogramSource() {
        return createFieldID(mExportVarIdx_histogramSource, null);
    }

    private final static int mExportVarIdx_histogramHeight = 1;
    private long mExportVar_histogramHeight;
    public synchronized void set_histogramHeight(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_histogramHeight, __rs_fp_U32);
        mExportVar_histogramHeight = v;
    }

    public long get_histogramHeight() {
        return mExportVar_histogramHeight;
    }

    public Script.FieldID getFieldID_histogramHeight() {
        return createFieldID(mExportVarIdx_histogramHeight, null);
    }

    private final static int mExportVarIdx_histogramWidth = 2;
    private long mExportVar_histogramWidth;
    public synchronized void set_histogramWidth(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_histogramWidth, __rs_fp_U32);
        mExportVar_histogramWidth = v;
    }

    public long get_histogramWidth() {
        return mExportVar_histogramWidth;
    }

    public Script.FieldID getFieldID_histogramWidth() {
        return createFieldID(mExportVarIdx_histogramWidth, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_whiteBalanceKernel = 1;
    public Script.KernelID getKernelID_whiteBalanceKernel() {
        return createKernelID(mExportForEachIdx_whiteBalanceKernel, 35, null, null);
    }

    public void forEach_whiteBalanceKernel(Allocation ain, Allocation aout) {
        forEach_whiteBalanceKernel(ain, aout, null);
    }

    public void forEach_whiteBalanceKernel(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_whiteBalanceKernel, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_prepareWhiteBalance = 0;
    public void invoke_prepareWhiteBalance() {
        invoke(mExportFuncIdx_prepareWhiteBalance);
    }

}

