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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/unsigned.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_unsigned extends ScriptC {
    private static final String __rs_resource_name = "unsigned";
    // Constructor
    public  ScriptC_unsigned(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_unsigned(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_ui = 37;
        __U32 = Element.U32(rs);
        mExportVar_uc = 5;
        __U8 = Element.U8(rs);
    }

    private Element __U32;
    private Element __U8;
    private FieldPacker __rs_fp_U32;
    private FieldPacker __rs_fp_U8;
    private final static int mExportVarIdx_ui = 0;
    private long mExportVar_ui;
    public synchronized void set_ui(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_ui, __rs_fp_U32);
        mExportVar_ui = v;
    }

    public long get_ui() {
        return mExportVar_ui;
    }

    public Script.FieldID getFieldID_ui() {
        return createFieldID(mExportVarIdx_ui, null);
    }

    private final static int mExportVarIdx_uc = 1;
    private short mExportVar_uc;
    public synchronized void set_uc(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_uc, __rs_fp_U8);
        mExportVar_uc = v;
    }

    public short get_uc() {
        return mExportVar_uc;
    }

    public Script.FieldID getFieldID_uc() {
        return createFieldID(mExportVarIdx_uc, null);
    }

    private final static int mExportFuncIdx_unsigned_test = 0;
    public void invoke_unsigned_test() {
        invoke(mExportFuncIdx_unsigned_test);
    }

}

