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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/int4.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_int4 extends ScriptC {
    private static final String __rs_resource_name = "int4";
    // Constructor
    public  ScriptC_int4(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_int4(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_u4 = new Short4();
        mExportVar_u4.x = 4;
        mExportVar_u4.y = 4;
        mExportVar_u4.z = 4;
        mExportVar_u4.w = 4;
        __U8_4 = Element.U8_4(rs);
        mExportVar_gi4 = new Int4();
        mExportVar_gi4.x = 2;
        mExportVar_gi4.y = 2;
        mExportVar_gi4.z = 2;
        mExportVar_gi4.w = 2;
        __I32_4 = Element.I32_4(rs);
    }

    private Element __I32_4;
    private Element __U8_4;
    private FieldPacker __rs_fp_I32_4;
    private FieldPacker __rs_fp_U8_4;
    private final static int mExportVarIdx_u4 = 0;
    private Short4 mExportVar_u4;
    public synchronized void set_u4(Short4 v) {
        mExportVar_u4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_u4, fp, __U8_4, __dimArr);
    }

    public Short4 get_u4() {
        return mExportVar_u4;
    }

    public Script.FieldID getFieldID_u4() {
        return createFieldID(mExportVarIdx_u4, null);
    }

    private final static int mExportVarIdx_gi4 = 1;
    private Int4 mExportVar_gi4;
    public synchronized void set_gi4(Int4 v) {
        mExportVar_gi4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_gi4, fp, __I32_4, __dimArr);
    }

    public Int4 get_gi4() {
        return mExportVar_gi4;
    }

    public Script.FieldID getFieldID_gi4() {
        return createFieldID(mExportVarIdx_gi4, null);
    }

    private final static int mExportFuncIdx_int4_test = 0;
    public void invoke_int4_test() {
        invoke(mExportFuncIdx_int4_test);
    }

}

