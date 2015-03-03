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
 * The source Renderscript file: frameworks/rs/java/tests/ImageProcessing_jb/src/com/android/rs/image/artistic1.rs
 */

package com.android.rs.imagejb;

import android.renderscript.*;
import com.android.rs.imagejb.artistic1BitCode;

/**
 * @hide
 */
public class ScriptC_artistic1 extends ScriptC {
    private static final String __rs_resource_name = "artistic1";
    // Constructor
    public  ScriptC_artistic1(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              artistic1BitCode.getBitCode32(),
              artistic1BitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private final static int mExportVarIdx_gBlur = 0;
    private Allocation mExportVar_gBlur;
    public synchronized void set_gBlur(Allocation v) {
        setVar(mExportVarIdx_gBlur, v);
        mExportVar_gBlur = v;
    }

    public Allocation get_gBlur() {
        return mExportVar_gBlur;
    }

    public Script.FieldID getFieldID_gBlur() {
        return createFieldID(mExportVarIdx_gBlur, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_process = 1;
    public Script.KernelID getKernelID_process() {
        return createKernelID(mExportForEachIdx_process, 59, null, null);
    }

    public void forEach_process(Allocation ain, Allocation aout) {
        forEach_process(ain, aout, null);
    }

    public void forEach_process(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_process, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_setup = 0;
    public void invoke_setup() {
        invoke(mExportFuncIdx_setup);
    }

}

