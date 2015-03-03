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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/min.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.minBitCode;

/**
 * @hide
 */
public class ScriptC_min extends ScriptC {
    private static final String __rs_resource_name = "min";
    // Constructor
    public  ScriptC_min(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              minBitCode.getBitCode32(),
              minBitCode.getBitCode64());
        mExportVar_res_uc_2 = new Short2();
        mExportVar_res_uc_2.x = 1;
        mExportVar_res_uc_2.y = 1;
        __U8_2 = Element.U8_2(rs);
        mExportVar_src1_uc_2 = new Short2();
        mExportVar_src1_uc_2.x = 1;
        mExportVar_src1_uc_2.y = 1;
        mExportVar_src2_uc_2 = new Short2();
        mExportVar_src2_uc_2.x = 1;
        mExportVar_src2_uc_2.y = 1;
    }

    private Element __U8_2;
    private FieldPacker __rs_fp_U8_2;
    private final static int mExportVarIdx_res_uc_2 = 0;
    private Short2 mExportVar_res_uc_2;
    public synchronized void set_res_uc_2(Short2 v) {
        mExportVar_res_uc_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_res_uc_2, fp, __U8_2, __dimArr);
    }

    public Short2 get_res_uc_2() {
        return mExportVar_res_uc_2;
    }

    public Script.FieldID getFieldID_res_uc_2() {
        return createFieldID(mExportVarIdx_res_uc_2, null);
    }

    private final static int mExportVarIdx_src1_uc_2 = 1;
    private Short2 mExportVar_src1_uc_2;
    public synchronized void set_src1_uc_2(Short2 v) {
        mExportVar_src1_uc_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_src1_uc_2, fp, __U8_2, __dimArr);
    }

    public Short2 get_src1_uc_2() {
        return mExportVar_src1_uc_2;
    }

    public Script.FieldID getFieldID_src1_uc_2() {
        return createFieldID(mExportVarIdx_src1_uc_2, null);
    }

    private final static int mExportVarIdx_src2_uc_2 = 2;
    private Short2 mExportVar_src2_uc_2;
    public synchronized void set_src2_uc_2(Short2 v) {
        mExportVar_src2_uc_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_src2_uc_2, fp, __U8_2, __dimArr);
    }

    public Short2 get_src2_uc_2() {
        return mExportVar_src2_uc_2;
    }

    public Script.FieldID getFieldID_src2_uc_2() {
        return createFieldID(mExportVarIdx_src2_uc_2, null);
    }

    private final static int mExportFuncIdx_min_test = 0;
    public void invoke_min_test() {
        invoke(mExportFuncIdx_min_test);
    }

}

