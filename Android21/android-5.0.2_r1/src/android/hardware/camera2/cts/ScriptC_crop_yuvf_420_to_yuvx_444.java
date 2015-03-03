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
 * The source Renderscript file: cts/tests/tests/hardware/src/android/hardware/camera2/cts/crop_yuvf_420_to_yuvx_444.rs
 */

package android.hardware.camera2.cts;

import android.renderscript.*;
import android.hardware.camera2.cts.crop_yuvf_420_to_yuvx_444BitCode;

/**
 * @hide
 */
public class ScriptC_crop_yuvf_420_to_yuvx_444 extends ScriptC {
    private static final String __rs_resource_name = "crop_yuvf_420_to_yuvx_444";
    // Constructor
    public  ScriptC_crop_yuvf_420_to_yuvx_444(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              crop_yuvf_420_to_yuvx_444BitCode.getBitCode32(),
              crop_yuvf_420_to_yuvx_444BitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __U32 = Element.U32(rs);
        __U8_3 = Element.U8_3(rs);
    }

    private Element __ALLOCATION;
    private Element __U32;
    private Element __U8_3;
    private FieldPacker __rs_fp_ALLOCATION;
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

    private final static int mExportVarIdx_src_x = 1;
    private long mExportVar_src_x;
    public synchronized void set_src_x(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_src_x, __rs_fp_U32);
        mExportVar_src_x = v;
    }

    public long get_src_x() {
        return mExportVar_src_x;
    }

    public Script.FieldID getFieldID_src_x() {
        return createFieldID(mExportVarIdx_src_x, null);
    }

    private final static int mExportVarIdx_src_y = 2;
    private long mExportVar_src_y;
    public synchronized void set_src_y(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_src_y, __rs_fp_U32);
        mExportVar_src_y = v;
    }

    public long get_src_y() {
        return mExportVar_src_y;
    }

    public Script.FieldID getFieldID_src_y() {
        return createFieldID(mExportVarIdx_src_y, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_crop = 1;
    public Script.KernelID getKernelID_crop() {
        return createKernelID(mExportForEachIdx_crop, 58, null, null);
    }

    public void forEach_crop(Allocation aout) {
        forEach_crop(aout, null);
    }

    public void forEach_crop(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_3)) {
            throw new RSRuntimeException("Type mismatch with U8_3!");
        }
        forEach(mExportForEachIdx_crop, (Allocation) null, aout, null, sc);
    }

}

