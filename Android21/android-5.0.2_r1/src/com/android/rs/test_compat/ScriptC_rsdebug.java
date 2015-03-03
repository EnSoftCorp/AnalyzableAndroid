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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/rsdebug.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_rsdebug extends ScriptC {
    private static final String __rs_resource_name = "rsdebug";
    // Constructor
    public  ScriptC_rsdebug(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_rsdebug(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_floatTest = 1.99000001f;
        __F32 = Element.F32(rs);
        mExportVar_float2Test = new Float2();
        mExportVar_float2Test.x = 2.99000001f;
        mExportVar_float2Test.y = 12.9899998f;
        __F32_2 = Element.F32_2(rs);
        mExportVar_float3Test = new Float3();
        mExportVar_float3Test.x = 3.99000001f;
        mExportVar_float3Test.y = 13.9899998f;
        mExportVar_float3Test.z = 23.9899998f;
        __F32_3 = Element.F32_3(rs);
        mExportVar_float4Test = new Float4();
        mExportVar_float4Test.x = 4.98999977f;
        mExportVar_float4Test.y = 14.9899998f;
        mExportVar_float4Test.z = 24.9899998f;
        mExportVar_float4Test.w = 34.9900017f;
        __F32_4 = Element.F32_4(rs);
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
    }

    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __F32_4;
    private Element __F64;
    private Element __I16;
    private Element __I32;
    private Element __I64;
    private Element __I8;
    private Element __U16;
    private Element __U32;
    private Element __U64;
    private Element __U8;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_2;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_F32_4;
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
    public synchronized void set_floatTest(float v) {
        setVar(mExportVarIdx_floatTest, v);
        mExportVar_floatTest = v;
    }

    public float get_floatTest() {
        return mExportVar_floatTest;
    }

    public Script.FieldID getFieldID_floatTest() {
        return createFieldID(mExportVarIdx_floatTest, null);
    }

    private final static int mExportVarIdx_float2Test = 1;
    private Float2 mExportVar_float2Test;
    public synchronized void set_float2Test(Float2 v) {
        mExportVar_float2Test = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_float2Test, fp, __F32_2, __dimArr);
    }

    public Float2 get_float2Test() {
        return mExportVar_float2Test;
    }

    public Script.FieldID getFieldID_float2Test() {
        return createFieldID(mExportVarIdx_float2Test, null);
    }

    private final static int mExportVarIdx_float3Test = 2;
    private Float3 mExportVar_float3Test;
    public synchronized void set_float3Test(Float3 v) {
        mExportVar_float3Test = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_float3Test, fp, __F32_3, __dimArr);
    }

    public Float3 get_float3Test() {
        return mExportVar_float3Test;
    }

    public Script.FieldID getFieldID_float3Test() {
        return createFieldID(mExportVarIdx_float3Test, null);
    }

    private final static int mExportVarIdx_float4Test = 3;
    private Float4 mExportVar_float4Test;
    public synchronized void set_float4Test(Float4 v) {
        mExportVar_float4Test = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_float4Test, fp, __F32_4, __dimArr);
    }

    public Float4 get_float4Test() {
        return mExportVar_float4Test;
    }

    public Script.FieldID getFieldID_float4Test() {
        return createFieldID(mExportVarIdx_float4Test, null);
    }

    private final static int mExportVarIdx_doubleTest = 4;
    private double mExportVar_doubleTest;
    public synchronized void set_doubleTest(double v) {
        setVar(mExportVarIdx_doubleTest, v);
        mExportVar_doubleTest = v;
    }

    public double get_doubleTest() {
        return mExportVar_doubleTest;
    }

    public Script.FieldID getFieldID_doubleTest() {
        return createFieldID(mExportVarIdx_doubleTest, null);
    }

    private final static int mExportVarIdx_charTest = 5;
    private byte mExportVar_charTest;
    public synchronized void set_charTest(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_charTest, __rs_fp_I8);
        mExportVar_charTest = v;
    }

    public byte get_charTest() {
        return mExportVar_charTest;
    }

    public Script.FieldID getFieldID_charTest() {
        return createFieldID(mExportVarIdx_charTest, null);
    }

    private final static int mExportVarIdx_shortTest = 6;
    private short mExportVar_shortTest;
    public synchronized void set_shortTest(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_shortTest, __rs_fp_I16);
        mExportVar_shortTest = v;
    }

    public short get_shortTest() {
        return mExportVar_shortTest;
    }

    public Script.FieldID getFieldID_shortTest() {
        return createFieldID(mExportVarIdx_shortTest, null);
    }

    private final static int mExportVarIdx_intTest = 7;
    private int mExportVar_intTest;
    public synchronized void set_intTest(int v) {
        setVar(mExportVarIdx_intTest, v);
        mExportVar_intTest = v;
    }

    public int get_intTest() {
        return mExportVar_intTest;
    }

    public Script.FieldID getFieldID_intTest() {
        return createFieldID(mExportVarIdx_intTest, null);
    }

    private final static int mExportVarIdx_longTest = 8;
    private long mExportVar_longTest;
    public synchronized void set_longTest(long v) {
        setVar(mExportVarIdx_longTest, v);
        mExportVar_longTest = v;
    }

    public long get_longTest() {
        return mExportVar_longTest;
    }

    public Script.FieldID getFieldID_longTest() {
        return createFieldID(mExportVarIdx_longTest, null);
    }

    private final static int mExportVarIdx_longlongTest = 9;
    private long mExportVar_longlongTest;
    public synchronized void set_longlongTest(long v) {
        setVar(mExportVarIdx_longlongTest, v);
        mExportVar_longlongTest = v;
    }

    public long get_longlongTest() {
        return mExportVar_longlongTest;
    }

    public Script.FieldID getFieldID_longlongTest() {
        return createFieldID(mExportVarIdx_longlongTest, null);
    }

    private final static int mExportVarIdx_ucharTest = 10;
    private short mExportVar_ucharTest;
    public synchronized void set_ucharTest(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_ucharTest, __rs_fp_U8);
        mExportVar_ucharTest = v;
    }

    public short get_ucharTest() {
        return mExportVar_ucharTest;
    }

    public Script.FieldID getFieldID_ucharTest() {
        return createFieldID(mExportVarIdx_ucharTest, null);
    }

    private final static int mExportVarIdx_ushortTest = 11;
    private int mExportVar_ushortTest;
    public synchronized void set_ushortTest(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_ushortTest, __rs_fp_U16);
        mExportVar_ushortTest = v;
    }

    public int get_ushortTest() {
        return mExportVar_ushortTest;
    }

    public Script.FieldID getFieldID_ushortTest() {
        return createFieldID(mExportVarIdx_ushortTest, null);
    }

    private final static int mExportVarIdx_uintTest = 12;
    private long mExportVar_uintTest;
    public synchronized void set_uintTest(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_uintTest, __rs_fp_U32);
        mExportVar_uintTest = v;
    }

    public long get_uintTest() {
        return mExportVar_uintTest;
    }

    public Script.FieldID getFieldID_uintTest() {
        return createFieldID(mExportVarIdx_uintTest, null);
    }

    private final static int mExportVarIdx_ulongTest = 13;
    private long mExportVar_ulongTest;
    public synchronized void set_ulongTest(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_ulongTest, __rs_fp_U64);
        mExportVar_ulongTest = v;
    }

    public long get_ulongTest() {
        return mExportVar_ulongTest;
    }

    public Script.FieldID getFieldID_ulongTest() {
        return createFieldID(mExportVarIdx_ulongTest, null);
    }

    private final static int mExportVarIdx_int64_tTest = 14;
    private long mExportVar_int64_tTest;
    public synchronized void set_int64_tTest(long v) {
        setVar(mExportVarIdx_int64_tTest, v);
        mExportVar_int64_tTest = v;
    }

    public long get_int64_tTest() {
        return mExportVar_int64_tTest;
    }

    public Script.FieldID getFieldID_int64_tTest() {
        return createFieldID(mExportVarIdx_int64_tTest, null);
    }

    private final static int mExportVarIdx_uint64_tTest = 15;
    private long mExportVar_uint64_tTest;
    public synchronized void set_uint64_tTest(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_uint64_tTest, __rs_fp_U64);
        mExportVar_uint64_tTest = v;
    }

    public long get_uint64_tTest() {
        return mExportVar_uint64_tTest;
    }

    public Script.FieldID getFieldID_uint64_tTest() {
        return createFieldID(mExportVarIdx_uint64_tTest, null);
    }

    private final static int mExportFuncIdx_test_rsdebug = 0;
    public void invoke_test_rsdebug(long index, int test_num) {
        FieldPacker test_rsdebug_fp = new FieldPacker(8);
        test_rsdebug_fp.addU32(index);
        test_rsdebug_fp.addI32(test_num);
        invoke(mExportFuncIdx_test_rsdebug, test_rsdebug_fp);
    }

}

