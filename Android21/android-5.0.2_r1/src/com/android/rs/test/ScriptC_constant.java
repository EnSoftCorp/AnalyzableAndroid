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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/constant.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.constantBitCode;

/**
 * @hide
 */
public class ScriptC_constant extends ScriptC {
    private static final String __rs_resource_name = "constant";
    // Constructor
    public  ScriptC_constant(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              constantBitCode.getBitCode32(),
              constantBitCode.getBitCode64());
        mExportVar_floatTest = 1.99000001f;
        __F32 = Element.F32(rs);
        mExportVar_doubleTest = 2.0499999999999998;
        __F64 = Element.F64(rs);
        mExportVar_charTest = -8;
        __I8 = Element.I8(rs);
        mExportVar_shortTest = -16;
        __I16 = Element.I16(rs);
        mExportVar_intTest = -32;
        __I32 = Element.I32(rs);
        mExportVar_longTest = 17179869184L;
        __I64 = Element.I64(rs);
        mExportVar_longlongTest = 68719476736L;
        mExportVar_ucharTest = 8;
        __U8 = Element.U8(rs);
        mExportVar_ushortTest = 16;
        __U16 = Element.U16(rs);
        mExportVar_uintTest = 32;
        __U32 = Element.U32(rs);
        mExportVar_ulongTest = 4611686018427387904L;
        __U64 = Element.U64(rs);
        mExportVar_int64_tTest = -17179869184L;
        mExportVar_uint64_tTest = 117179869184L;
        mExportVar_boolTest = true;
        __BOOLEAN = Element.BOOLEAN(rs);
    }

    private Element __BOOLEAN;
    private Element __F32;
    private Element __F64;
    private Element __I16;
    private Element __I32;
    private Element __I64;
    private Element __I8;
    private Element __U16;
    private Element __U32;
    private Element __U64;
    private Element __U8;
    private FieldPacker __rs_fp_BOOLEAN;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F64;
    private FieldPacker __rs_fp_I16;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I64;
    private FieldPacker __rs_fp_I8;
    private FieldPacker __rs_fp_U16;
    private FieldPacker __rs_fp_U32;
    private FieldPacker __rs_fp_U64;
    private FieldPacker __rs_fp_U8;
    private final static int mExportVarIdx_floatTest = 0;
    private float mExportVar_floatTest;
    public final static float const_floatTest = 1.99000001f;
    public float get_floatTest() {
        return mExportVar_floatTest;
    }

    public Script.FieldID getFieldID_floatTest() {
        return createFieldID(mExportVarIdx_floatTest, null);
    }

    private final static int mExportVarIdx_doubleTest = 1;
    private double mExportVar_doubleTest;
    public final static double const_doubleTest = 2.0499999999999998;
    public double get_doubleTest() {
        return mExportVar_doubleTest;
    }

    public Script.FieldID getFieldID_doubleTest() {
        return createFieldID(mExportVarIdx_doubleTest, null);
    }

    private final static int mExportVarIdx_charTest = 2;
    private byte mExportVar_charTest;
    public final static byte const_charTest = -8;
    public byte get_charTest() {
        return mExportVar_charTest;
    }

    public Script.FieldID getFieldID_charTest() {
        return createFieldID(mExportVarIdx_charTest, null);
    }

    private final static int mExportVarIdx_shortTest = 3;
    private short mExportVar_shortTest;
    public final static short const_shortTest = -16;
    public short get_shortTest() {
        return mExportVar_shortTest;
    }

    public Script.FieldID getFieldID_shortTest() {
        return createFieldID(mExportVarIdx_shortTest, null);
    }

    private final static int mExportVarIdx_intTest = 4;
    private int mExportVar_intTest;
    public final static int const_intTest = -32;
    public int get_intTest() {
        return mExportVar_intTest;
    }

    public Script.FieldID getFieldID_intTest() {
        return createFieldID(mExportVarIdx_intTest, null);
    }

    private final static int mExportVarIdx_longTest = 5;
    private long mExportVar_longTest;
    public final static long const_longTest = 17179869184L;
    public long get_longTest() {
        return mExportVar_longTest;
    }

    public Script.FieldID getFieldID_longTest() {
        return createFieldID(mExportVarIdx_longTest, null);
    }

    private final static int mExportVarIdx_longlongTest = 6;
    private long mExportVar_longlongTest;
    public final static long const_longlongTest = 68719476736L;
    public long get_longlongTest() {
        return mExportVar_longlongTest;
    }

    public Script.FieldID getFieldID_longlongTest() {
        return createFieldID(mExportVarIdx_longlongTest, null);
    }

    private final static int mExportVarIdx_ucharTest = 7;
    private short mExportVar_ucharTest;
    public final static short const_ucharTest = 8;
    public short get_ucharTest() {
        return mExportVar_ucharTest;
    }

    public Script.FieldID getFieldID_ucharTest() {
        return createFieldID(mExportVarIdx_ucharTest, null);
    }

    private final static int mExportVarIdx_ushortTest = 8;
    private int mExportVar_ushortTest;
    public final static int const_ushortTest = 16;
    public int get_ushortTest() {
        return mExportVar_ushortTest;
    }

    public Script.FieldID getFieldID_ushortTest() {
        return createFieldID(mExportVarIdx_ushortTest, null);
    }

    private final static int mExportVarIdx_uintTest = 9;
    private long mExportVar_uintTest;
    public final static long const_uintTest = 32;
    public long get_uintTest() {
        return mExportVar_uintTest;
    }

    public Script.FieldID getFieldID_uintTest() {
        return createFieldID(mExportVarIdx_uintTest, null);
    }

    private final static int mExportVarIdx_ulongTest = 10;
    private long mExportVar_ulongTest;
    public final static long const_ulongTest = 4611686018427387904L;
    public long get_ulongTest() {
        return mExportVar_ulongTest;
    }

    public Script.FieldID getFieldID_ulongTest() {
        return createFieldID(mExportVarIdx_ulongTest, null);
    }

    private final static int mExportVarIdx_int64_tTest = 11;
    private long mExportVar_int64_tTest;
    public final static long const_int64_tTest = -17179869184L;
    public long get_int64_tTest() {
        return mExportVar_int64_tTest;
    }

    public Script.FieldID getFieldID_int64_tTest() {
        return createFieldID(mExportVarIdx_int64_tTest, null);
    }

    private final static int mExportVarIdx_uint64_tTest = 12;
    private long mExportVar_uint64_tTest;
    public final static long const_uint64_tTest = 117179869184L;
    public long get_uint64_tTest() {
        return mExportVar_uint64_tTest;
    }

    public Script.FieldID getFieldID_uint64_tTest() {
        return createFieldID(mExportVarIdx_uint64_tTest, null);
    }

    private final static int mExportVarIdx_boolTest = 13;
    private boolean mExportVar_boolTest;
    public final static boolean const_boolTest = true;
    public boolean get_boolTest() {
        return mExportVar_boolTest;
    }

    public Script.FieldID getFieldID_boolTest() {
        return createFieldID(mExportVarIdx_boolTest, null);
    }

}

