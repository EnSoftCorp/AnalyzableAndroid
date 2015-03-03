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
 * The source Renderscript file: frameworks/rs/java/tests/ImageProcessing_jb/src/com/android/rs/image/blend.rs
 */

package com.android.rs.imagejb;

import android.renderscript.*;
import com.android.rs.imagejb.blendBitCode;

/**
 * @hide
 */
public class ScriptC_blend extends ScriptC {
    private static final String __rs_resource_name = "blend";
    // Constructor
    public  ScriptC_blend(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              blendBitCode.getBitCode32(),
              blendBitCode.getBitCode64());
        mExportVar_alpha = 0;
        __U8 = Element.U8(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __U8;
    private Element __U8_4;
    private FieldPacker __rs_fp_U8;
    private final static int mExportVarIdx_alpha = 0;
    private short mExportVar_alpha;
    public synchronized void set_alpha(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_alpha, __rs_fp_U8);
        mExportVar_alpha = v;
    }

    public short get_alpha() {
        return mExportVar_alpha;
    }

    public Script.FieldID getFieldID_alpha() {
        return createFieldID(mExportVarIdx_alpha, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_setImageAlpha = 1;
    public Script.KernelID getKernelID_setImageAlpha() {
        return createKernelID(mExportForEachIdx_setImageAlpha, 59, null, null);
    }

    public void forEach_setImageAlpha(Allocation ain, Allocation aout) {
        forEach_setImageAlpha(ain, aout, null);
    }

    public void forEach_setImageAlpha(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_setImageAlpha, ain, aout, null, sc);
    }

}

