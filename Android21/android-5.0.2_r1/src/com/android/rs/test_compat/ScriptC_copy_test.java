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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/copy_test.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_copy_test extends ScriptC {
    private static final String __rs_resource_name = "copy_test";
    // Constructor
    public  ScriptC_copy_test(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_copy_test(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __F32_2 = Element.F32_2(rs);
        __F32_3 = Element.F32_3(rs);
        __F32_4 = Element.F32_4(rs);
    }

    private Element __F32_2;
    private Element __F32_3;
    private Element __F32_4;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_copyFloat2 = 1;
    public Script.KernelID getKernelID_copyFloat2() {
        return createKernelID(mExportForEachIdx_copyFloat2, 35, null, null);
    }

    public void forEach_copyFloat2(Allocation ain, Allocation aout) {
        forEach_copyFloat2(ain, aout, null);
    }

    public void forEach_copyFloat2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
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

        forEach(mExportForEachIdx_copyFloat2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_copyFloat3 = 2;
    public Script.KernelID getKernelID_copyFloat3() {
        return createKernelID(mExportForEachIdx_copyFloat3, 35, null, null);
    }

    public void forEach_copyFloat3(Allocation ain, Allocation aout) {
        forEach_copyFloat3(ain, aout, null);
    }

    public void forEach_copyFloat3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
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

        forEach(mExportForEachIdx_copyFloat3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_copyFloat4 = 3;
    public Script.KernelID getKernelID_copyFloat4() {
        return createKernelID(mExportForEachIdx_copyFloat4, 35, null, null);
    }

    public void forEach_copyFloat4(Allocation ain, Allocation aout) {
        forEach_copyFloat4(ain, aout, null);
    }

    public void forEach_copyFloat4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
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

        forEach(mExportForEachIdx_copyFloat4, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_sendResult = 0;
    public void invoke_sendResult(boolean pass) {
        FieldPacker sendResult_fp = new FieldPacker(1);
        sendResult_fp.addBoolean(pass);
        invoke(mExportFuncIdx_sendResult, sendResult_fp);
    }

}

