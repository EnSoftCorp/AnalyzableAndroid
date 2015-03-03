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
 * The source Renderscript file: cts/tests/tests/hardware/src/android/hardware/camera2/cts/means_yuvx_444_1d_to_single.rs
 */

package android.hardware.camera2.cts;

import android.renderscript.*;
import android.hardware.camera2.cts.means_yuvx_444_1d_to_singleBitCode;

/**
 * @hide
 */
public class ScriptC_means_yuvx_444_1d_to_single extends ScriptC {
    private static final String __rs_resource_name = "means_yuvx_444_1d_to_single";
    // Constructor
    public  ScriptC_means_yuvx_444_1d_to_single(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              means_yuvx_444_1d_to_singleBitCode.getBitCode32(),
              means_yuvx_444_1d_to_singleBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __U32 = Element.U32(rs);
        __F32 = Element.F32(rs);
        __U8_3 = Element.U8_3(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __U32;
    private Element __U8_3;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_U32;
    private final static int mExportVarIdx_mInput = 0;
    private Allocation mExportVar_mInput;
    public synchronized void set_mInput(Allocation v) {
        setVar(mExportVarIdx_mInput, v);
        mExportVar_mInput = v;
    }

    public Allocation get_mInput() {
        return mExportVar_mInput;
    }

    public Script.FieldID getFieldID_mInput() {
        return createFieldID(mExportVarIdx_mInput, null);
    }

    private final static int mExportVarIdx_width = 1;
    private long mExportVar_width;
    public synchronized void set_width(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_width, __rs_fp_U32);
        mExportVar_width = v;
    }

    public long get_width() {
        return mExportVar_width;
    }

    public Script.FieldID getFieldID_width() {
        return createFieldID(mExportVarIdx_width, null);
    }

    private final static int mExportVarIdx_inv_width = 2;
    private float mExportVar_inv_width;
    public synchronized void set_inv_width(float v) {
        setVar(mExportVarIdx_inv_width, v);
        mExportVar_inv_width = v;
    }

    public float get_inv_width() {
        return mExportVar_inv_width;
    }

    public Script.FieldID getFieldID_inv_width() {
        return createFieldID(mExportVarIdx_inv_width, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_means_yuvx_444 = 1;
    public Script.KernelID getKernelID_means_yuvx_444() {
        return createKernelID(mExportForEachIdx_means_yuvx_444, 34, null, null);
    }

    public void forEach_means_yuvx_444(Allocation aout) {
        forEach_means_yuvx_444(aout, null);
    }

    public void forEach_means_yuvx_444(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_3)) {
            throw new RSRuntimeException("Type mismatch with U8_3!");
        }
        forEach(mExportForEachIdx_means_yuvx_444, (Allocation) null, aout, null, sc);
    }

}

