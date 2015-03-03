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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/bug_char.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_bug_char extends ScriptC {
    private static final String __rs_resource_name = "bug_char";
    // Constructor
    public  ScriptC_bug_char(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_bug_char(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __I8 = Element.I8(rs);
        __I8_2 = Element.I8_2(rs);
    }

    private Element __I8;
    private Element __I8_2;
    private FieldPacker __rs_fp_I8;
    private FieldPacker __rs_fp_I8_2;
    private final static int mExportVarIdx_rand_sc1_0 = 0;
    private byte mExportVar_rand_sc1_0;
    public synchronized void set_rand_sc1_0(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_rand_sc1_0, __rs_fp_I8);
        mExportVar_rand_sc1_0 = v;
    }

    public byte get_rand_sc1_0() {
        return mExportVar_rand_sc1_0;
    }

    public Script.FieldID getFieldID_rand_sc1_0() {
        return createFieldID(mExportVarIdx_rand_sc1_0, null);
    }

    private final static int mExportVarIdx_rand_sc1_1 = 1;
    private byte mExportVar_rand_sc1_1;
    public synchronized void set_rand_sc1_1(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_rand_sc1_1, __rs_fp_I8);
        mExportVar_rand_sc1_1 = v;
    }

    public byte get_rand_sc1_1() {
        return mExportVar_rand_sc1_1;
    }

    public Script.FieldID getFieldID_rand_sc1_1() {
        return createFieldID(mExportVarIdx_rand_sc1_1, null);
    }

    private final static int mExportVarIdx_rand_sc2_0 = 2;
    private Byte2 mExportVar_rand_sc2_0;
    public synchronized void set_rand_sc2_0(Byte2 v) {
        mExportVar_rand_sc2_0 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_sc2_0, fp, __I8_2, __dimArr);
    }

    public Byte2 get_rand_sc2_0() {
        return mExportVar_rand_sc2_0;
    }

    public Script.FieldID getFieldID_rand_sc2_0() {
        return createFieldID(mExportVarIdx_rand_sc2_0, null);
    }

    private final static int mExportVarIdx_rand_sc2_1 = 3;
    private Byte2 mExportVar_rand_sc2_1;
    public synchronized void set_rand_sc2_1(Byte2 v) {
        mExportVar_rand_sc2_1 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_sc2_1, fp, __I8_2, __dimArr);
    }

    public Byte2 get_rand_sc2_1() {
        return mExportVar_rand_sc2_1;
    }

    public Script.FieldID getFieldID_rand_sc2_1() {
        return createFieldID(mExportVarIdx_rand_sc2_1, null);
    }

    private final static int mExportVarIdx_min_rand_sc1_sc1 = 4;
    private byte mExportVar_min_rand_sc1_sc1;
    public synchronized void set_min_rand_sc1_sc1(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_min_rand_sc1_sc1, __rs_fp_I8);
        mExportVar_min_rand_sc1_sc1 = v;
    }

    public byte get_min_rand_sc1_sc1() {
        return mExportVar_min_rand_sc1_sc1;
    }

    public Script.FieldID getFieldID_min_rand_sc1_sc1() {
        return createFieldID(mExportVarIdx_min_rand_sc1_sc1, null);
    }

    private final static int mExportVarIdx_min_rand_sc2_sc2 = 5;
    private Byte2 mExportVar_min_rand_sc2_sc2;
    public synchronized void set_min_rand_sc2_sc2(Byte2 v) {
        mExportVar_min_rand_sc2_sc2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_min_rand_sc2_sc2, fp, __I8_2, __dimArr);
    }

    public Byte2 get_min_rand_sc2_sc2() {
        return mExportVar_min_rand_sc2_sc2;
    }

    public Script.FieldID getFieldID_min_rand_sc2_sc2() {
        return createFieldID(mExportVarIdx_min_rand_sc2_sc2, null);
    }

    private final static int mExportFuncIdx_bug_char_test = 0;
    public void invoke_bug_char_test() {
        invoke(mExportFuncIdx_bug_char_test);
    }

}

