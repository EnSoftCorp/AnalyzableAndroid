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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/math_agree.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_math_agree extends ScriptC {
    private static final String __rs_resource_name = "math_agree";
    // Constructor
    public  ScriptC_math_agree(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_math_agree(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_x = 0.f;
        __F32 = Element.F32(rs);
        mExportVar_y = 0.f;
        mExportVar_result_add = 0.f;
        mExportVar_result_sub = 0.f;
        mExportVar_result_mul = 0.f;
        mExportVar_result_div = 0.f;
        __F32_2 = Element.F32_2(rs);
        __F32_3 = Element.F32_3(rs);
        __F32_4 = Element.F32_4(rs);
        __I8 = Element.I8(rs);
        __I8_2 = Element.I8_2(rs);
        __I8_3 = Element.I8_3(rs);
        __I8_4 = Element.I8_4(rs);
        __U8 = Element.U8(rs);
        __U8_2 = Element.U8_2(rs);
        __U8_3 = Element.U8_3(rs);
        __U8_4 = Element.U8_4(rs);
        __I16 = Element.I16(rs);
        __I16_2 = Element.I16_2(rs);
        __I16_3 = Element.I16_3(rs);
        __I16_4 = Element.I16_4(rs);
        __U16 = Element.U16(rs);
        __U16_2 = Element.U16_2(rs);
        __U16_3 = Element.U16_3(rs);
        __U16_4 = Element.U16_4(rs);
        __I32 = Element.I32(rs);
        __I32_2 = Element.I32_2(rs);
        __I32_3 = Element.I32_3(rs);
        __I32_4 = Element.I32_4(rs);
        __U32 = Element.U32(rs);
        __U32_2 = Element.U32_2(rs);
        __U32_3 = Element.U32_3(rs);
        __U32_4 = Element.U32_4(rs);
        __I64 = Element.I64(rs);
        __I64_2 = Element.I64_2(rs);
        __I64_3 = Element.I64_3(rs);
        __I64_4 = Element.I64_4(rs);
        __U64 = Element.U64(rs);
        __U64_2 = Element.U64_2(rs);
        __U64_3 = Element.U64_3(rs);
        __U64_4 = Element.U64_4(rs);
    }

    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __F32_4;
    private Element __I16;
    private Element __I16_2;
    private Element __I16_3;
    private Element __I16_4;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_3;
    private Element __I32_4;
    private Element __I64;
    private Element __I64_2;
    private Element __I64_3;
    private Element __I64_4;
    private Element __I8;
    private Element __I8_2;
    private Element __I8_3;
    private Element __I8_4;
    private Element __U16;
    private Element __U16_2;
    private Element __U16_3;
    private Element __U16_4;
    private Element __U32;
    private Element __U32_2;
    private Element __U32_3;
    private Element __U32_4;
    private Element __U64;
    private Element __U64_2;
    private Element __U64_3;
    private Element __U64_4;
    private Element __U8;
    private Element __U8_2;
    private Element __U8_3;
    private Element __U8_4;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_2;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_F32_4;
    private FieldPacker __rs_fp_I16;
    private FieldPacker __rs_fp_I16_2;
    private FieldPacker __rs_fp_I16_3;
    private FieldPacker __rs_fp_I16_4;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I32_2;
    private FieldPacker __rs_fp_I32_3;
    private FieldPacker __rs_fp_I32_4;
    private FieldPacker __rs_fp_I64;
    private FieldPacker __rs_fp_I64_2;
    private FieldPacker __rs_fp_I64_3;
    private FieldPacker __rs_fp_I64_4;
    private FieldPacker __rs_fp_I8;
    private FieldPacker __rs_fp_I8_2;
    private FieldPacker __rs_fp_I8_3;
    private FieldPacker __rs_fp_I8_4;
    private FieldPacker __rs_fp_U16;
    private FieldPacker __rs_fp_U16_2;
    private FieldPacker __rs_fp_U16_3;
    private FieldPacker __rs_fp_U16_4;
    private FieldPacker __rs_fp_U32;
    private FieldPacker __rs_fp_U32_2;
    private FieldPacker __rs_fp_U32_3;
    private FieldPacker __rs_fp_U32_4;
    private FieldPacker __rs_fp_U64;
    private FieldPacker __rs_fp_U64_2;
    private FieldPacker __rs_fp_U64_3;
    private FieldPacker __rs_fp_U64_4;
    private FieldPacker __rs_fp_U8;
    private FieldPacker __rs_fp_U8_2;
    private FieldPacker __rs_fp_U8_3;
    private FieldPacker __rs_fp_U8_4;
    private final static int mExportVarIdx_x = 0;
    private float mExportVar_x;
    public synchronized void set_x(float v) {
        setVar(mExportVarIdx_x, v);
        mExportVar_x = v;
    }

    public float get_x() {
        return mExportVar_x;
    }

    public Script.FieldID getFieldID_x() {
        return createFieldID(mExportVarIdx_x, null);
    }

    private final static int mExportVarIdx_y = 1;
    private float mExportVar_y;
    public synchronized void set_y(float v) {
        setVar(mExportVarIdx_y, v);
        mExportVar_y = v;
    }

    public float get_y() {
        return mExportVar_y;
    }

    public Script.FieldID getFieldID_y() {
        return createFieldID(mExportVarIdx_y, null);
    }

    private final static int mExportVarIdx_result_add = 2;
    private float mExportVar_result_add;
    public synchronized void set_result_add(float v) {
        setVar(mExportVarIdx_result_add, v);
        mExportVar_result_add = v;
    }

    public float get_result_add() {
        return mExportVar_result_add;
    }

    public Script.FieldID getFieldID_result_add() {
        return createFieldID(mExportVarIdx_result_add, null);
    }

    private final static int mExportVarIdx_result_sub = 3;
    private float mExportVar_result_sub;
    public synchronized void set_result_sub(float v) {
        setVar(mExportVarIdx_result_sub, v);
        mExportVar_result_sub = v;
    }

    public float get_result_sub() {
        return mExportVar_result_sub;
    }

    public Script.FieldID getFieldID_result_sub() {
        return createFieldID(mExportVarIdx_result_sub, null);
    }

    private final static int mExportVarIdx_result_mul = 4;
    private float mExportVar_result_mul;
    public synchronized void set_result_mul(float v) {
        setVar(mExportVarIdx_result_mul, v);
        mExportVar_result_mul = v;
    }

    public float get_result_mul() {
        return mExportVar_result_mul;
    }

    public Script.FieldID getFieldID_result_mul() {
        return createFieldID(mExportVarIdx_result_mul, null);
    }

    private final static int mExportVarIdx_result_div = 5;
    private float mExportVar_result_div;
    public synchronized void set_result_div(float v) {
        setVar(mExportVarIdx_result_div, v);
        mExportVar_result_div = v;
    }

    public float get_result_div() {
        return mExportVar_result_div;
    }

    public Script.FieldID getFieldID_result_div() {
        return createFieldID(mExportVarIdx_result_div, null);
    }

    private final static int mExportVarIdx_rand_f1_0 = 6;
    private float mExportVar_rand_f1_0;
    public synchronized void set_rand_f1_0(float v) {
        setVar(mExportVarIdx_rand_f1_0, v);
        mExportVar_rand_f1_0 = v;
    }

    public float get_rand_f1_0() {
        return mExportVar_rand_f1_0;
    }

    public Script.FieldID getFieldID_rand_f1_0() {
        return createFieldID(mExportVarIdx_rand_f1_0, null);
    }

    private final static int mExportVarIdx_rand_f1_1 = 7;
    private float mExportVar_rand_f1_1;
    public synchronized void set_rand_f1_1(float v) {
        setVar(mExportVarIdx_rand_f1_1, v);
        mExportVar_rand_f1_1 = v;
    }

    public float get_rand_f1_1() {
        return mExportVar_rand_f1_1;
    }

    public Script.FieldID getFieldID_rand_f1_1() {
        return createFieldID(mExportVarIdx_rand_f1_1, null);
    }

    private final static int mExportVarIdx_rand_f2_0 = 8;
    private Float2 mExportVar_rand_f2_0;
    public synchronized void set_rand_f2_0(Float2 v) {
        mExportVar_rand_f2_0 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_f2_0, fp, __F32_2, __dimArr);
    }

    public Float2 get_rand_f2_0() {
        return mExportVar_rand_f2_0;
    }

    public Script.FieldID getFieldID_rand_f2_0() {
        return createFieldID(mExportVarIdx_rand_f2_0, null);
    }

    private final static int mExportVarIdx_rand_f2_1 = 9;
    private Float2 mExportVar_rand_f2_1;
    public synchronized void set_rand_f2_1(Float2 v) {
        mExportVar_rand_f2_1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_f2_1, fp, __F32_2, __dimArr);
    }

    public Float2 get_rand_f2_1() {
        return mExportVar_rand_f2_1;
    }

    public Script.FieldID getFieldID_rand_f2_1() {
        return createFieldID(mExportVarIdx_rand_f2_1, null);
    }

    private final static int mExportVarIdx_rand_f3_0 = 10;
    private Float3 mExportVar_rand_f3_0;
    public synchronized void set_rand_f3_0(Float3 v) {
        mExportVar_rand_f3_0 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_f3_0, fp, __F32_3, __dimArr);
    }

    public Float3 get_rand_f3_0() {
        return mExportVar_rand_f3_0;
    }

    public Script.FieldID getFieldID_rand_f3_0() {
        return createFieldID(mExportVarIdx_rand_f3_0, null);
    }

    private final static int mExportVarIdx_rand_f3_1 = 11;
    private Float3 mExportVar_rand_f3_1;
    public synchronized void set_rand_f3_1(Float3 v) {
        mExportVar_rand_f3_1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_f3_1, fp, __F32_3, __dimArr);
    }

    public Float3 get_rand_f3_1() {
        return mExportVar_rand_f3_1;
    }

    public Script.FieldID getFieldID_rand_f3_1() {
        return createFieldID(mExportVarIdx_rand_f3_1, null);
    }

    private final static int mExportVarIdx_rand_f4_0 = 12;
    private Float4 mExportVar_rand_f4_0;
    public synchronized void set_rand_f4_0(Float4 v) {
        mExportVar_rand_f4_0 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_f4_0, fp, __F32_4, __dimArr);
    }

    public Float4 get_rand_f4_0() {
        return mExportVar_rand_f4_0;
    }

    public Script.FieldID getFieldID_rand_f4_0() {
        return createFieldID(mExportVarIdx_rand_f4_0, null);
    }

    private final static int mExportVarIdx_rand_f4_1 = 13;
    private Float4 mExportVar_rand_f4_1;
    public synchronized void set_rand_f4_1(Float4 v) {
        mExportVar_rand_f4_1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_f4_1, fp, __F32_4, __dimArr);
    }

    public Float4 get_rand_f4_1() {
        return mExportVar_rand_f4_1;
    }

    public Script.FieldID getFieldID_rand_f4_1() {
        return createFieldID(mExportVarIdx_rand_f4_1, null);
    }

    private final static int mExportVarIdx_rand_sc1_0 = 14;
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

    private final static int mExportVarIdx_rand_sc1_1 = 15;
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

    private final static int mExportVarIdx_rand_sc2_0 = 16;
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

    private final static int mExportVarIdx_rand_sc2_1 = 17;
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

    private final static int mExportVarIdx_rand_sc3_0 = 18;
    private Byte3 mExportVar_rand_sc3_0;
    public synchronized void set_rand_sc3_0(Byte3 v) {
        mExportVar_rand_sc3_0 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_sc3_0, fp, __I8_3, __dimArr);
    }

    public Byte3 get_rand_sc3_0() {
        return mExportVar_rand_sc3_0;
    }

    public Script.FieldID getFieldID_rand_sc3_0() {
        return createFieldID(mExportVarIdx_rand_sc3_0, null);
    }

    private final static int mExportVarIdx_rand_sc3_1 = 19;
    private Byte3 mExportVar_rand_sc3_1;
    public synchronized void set_rand_sc3_1(Byte3 v) {
        mExportVar_rand_sc3_1 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_sc3_1, fp, __I8_3, __dimArr);
    }

    public Byte3 get_rand_sc3_1() {
        return mExportVar_rand_sc3_1;
    }

    public Script.FieldID getFieldID_rand_sc3_1() {
        return createFieldID(mExportVarIdx_rand_sc3_1, null);
    }

    private final static int mExportVarIdx_rand_sc4_0 = 20;
    private Byte4 mExportVar_rand_sc4_0;
    public synchronized void set_rand_sc4_0(Byte4 v) {
        mExportVar_rand_sc4_0 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_sc4_0, fp, __I8_4, __dimArr);
    }

    public Byte4 get_rand_sc4_0() {
        return mExportVar_rand_sc4_0;
    }

    public Script.FieldID getFieldID_rand_sc4_0() {
        return createFieldID(mExportVarIdx_rand_sc4_0, null);
    }

    private final static int mExportVarIdx_rand_sc4_1 = 21;
    private Byte4 mExportVar_rand_sc4_1;
    public synchronized void set_rand_sc4_1(Byte4 v) {
        mExportVar_rand_sc4_1 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_sc4_1, fp, __I8_4, __dimArr);
    }

    public Byte4 get_rand_sc4_1() {
        return mExportVar_rand_sc4_1;
    }

    public Script.FieldID getFieldID_rand_sc4_1() {
        return createFieldID(mExportVarIdx_rand_sc4_1, null);
    }

    private final static int mExportVarIdx_rand_uc1_0 = 22;
    private short mExportVar_rand_uc1_0;
    public synchronized void set_rand_uc1_0(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_rand_uc1_0, __rs_fp_U8);
        mExportVar_rand_uc1_0 = v;
    }

    public short get_rand_uc1_0() {
        return mExportVar_rand_uc1_0;
    }

    public Script.FieldID getFieldID_rand_uc1_0() {
        return createFieldID(mExportVarIdx_rand_uc1_0, null);
    }

    private final static int mExportVarIdx_rand_uc1_1 = 23;
    private short mExportVar_rand_uc1_1;
    public synchronized void set_rand_uc1_1(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_rand_uc1_1, __rs_fp_U8);
        mExportVar_rand_uc1_1 = v;
    }

    public short get_rand_uc1_1() {
        return mExportVar_rand_uc1_1;
    }

    public Script.FieldID getFieldID_rand_uc1_1() {
        return createFieldID(mExportVarIdx_rand_uc1_1, null);
    }

    private final static int mExportVarIdx_rand_uc2_0 = 24;
    private Short2 mExportVar_rand_uc2_0;
    public synchronized void set_rand_uc2_0(Short2 v) {
        mExportVar_rand_uc2_0 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_uc2_0, fp, __U8_2, __dimArr);
    }

    public Short2 get_rand_uc2_0() {
        return mExportVar_rand_uc2_0;
    }

    public Script.FieldID getFieldID_rand_uc2_0() {
        return createFieldID(mExportVarIdx_rand_uc2_0, null);
    }

    private final static int mExportVarIdx_rand_uc2_1 = 25;
    private Short2 mExportVar_rand_uc2_1;
    public synchronized void set_rand_uc2_1(Short2 v) {
        mExportVar_rand_uc2_1 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_uc2_1, fp, __U8_2, __dimArr);
    }

    public Short2 get_rand_uc2_1() {
        return mExportVar_rand_uc2_1;
    }

    public Script.FieldID getFieldID_rand_uc2_1() {
        return createFieldID(mExportVarIdx_rand_uc2_1, null);
    }

    private final static int mExportVarIdx_rand_uc3_0 = 26;
    private Short3 mExportVar_rand_uc3_0;
    public synchronized void set_rand_uc3_0(Short3 v) {
        mExportVar_rand_uc3_0 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_uc3_0, fp, __U8_3, __dimArr);
    }

    public Short3 get_rand_uc3_0() {
        return mExportVar_rand_uc3_0;
    }

    public Script.FieldID getFieldID_rand_uc3_0() {
        return createFieldID(mExportVarIdx_rand_uc3_0, null);
    }

    private final static int mExportVarIdx_rand_uc3_1 = 27;
    private Short3 mExportVar_rand_uc3_1;
    public synchronized void set_rand_uc3_1(Short3 v) {
        mExportVar_rand_uc3_1 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_uc3_1, fp, __U8_3, __dimArr);
    }

    public Short3 get_rand_uc3_1() {
        return mExportVar_rand_uc3_1;
    }

    public Script.FieldID getFieldID_rand_uc3_1() {
        return createFieldID(mExportVarIdx_rand_uc3_1, null);
    }

    private final static int mExportVarIdx_rand_uc4_0 = 28;
    private Short4 mExportVar_rand_uc4_0;
    public synchronized void set_rand_uc4_0(Short4 v) {
        mExportVar_rand_uc4_0 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_uc4_0, fp, __U8_4, __dimArr);
    }

    public Short4 get_rand_uc4_0() {
        return mExportVar_rand_uc4_0;
    }

    public Script.FieldID getFieldID_rand_uc4_0() {
        return createFieldID(mExportVarIdx_rand_uc4_0, null);
    }

    private final static int mExportVarIdx_rand_uc4_1 = 29;
    private Short4 mExportVar_rand_uc4_1;
    public synchronized void set_rand_uc4_1(Short4 v) {
        mExportVar_rand_uc4_1 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_rand_uc4_1, fp, __U8_4, __dimArr);
    }

    public Short4 get_rand_uc4_1() {
        return mExportVar_rand_uc4_1;
    }

    public Script.FieldID getFieldID_rand_uc4_1() {
        return createFieldID(mExportVarIdx_rand_uc4_1, null);
    }

    private final static int mExportVarIdx_rand_ss1_0 = 30;
    private short mExportVar_rand_ss1_0;
    public synchronized void set_rand_ss1_0(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_rand_ss1_0, __rs_fp_I16);
        mExportVar_rand_ss1_0 = v;
    }

    public short get_rand_ss1_0() {
        return mExportVar_rand_ss1_0;
    }

    public Script.FieldID getFieldID_rand_ss1_0() {
        return createFieldID(mExportVarIdx_rand_ss1_0, null);
    }

    private final static int mExportVarIdx_rand_ss1_1 = 31;
    private short mExportVar_rand_ss1_1;
    public synchronized void set_rand_ss1_1(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_rand_ss1_1, __rs_fp_I16);
        mExportVar_rand_ss1_1 = v;
    }

    public short get_rand_ss1_1() {
        return mExportVar_rand_ss1_1;
    }

    public Script.FieldID getFieldID_rand_ss1_1() {
        return createFieldID(mExportVarIdx_rand_ss1_1, null);
    }

    private final static int mExportVarIdx_rand_ss2_0 = 32;
    private Short2 mExportVar_rand_ss2_0;
    public synchronized void set_rand_ss2_0(Short2 v) {
        mExportVar_rand_ss2_0 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_ss2_0, fp, __I16_2, __dimArr);
    }

    public Short2 get_rand_ss2_0() {
        return mExportVar_rand_ss2_0;
    }

    public Script.FieldID getFieldID_rand_ss2_0() {
        return createFieldID(mExportVarIdx_rand_ss2_0, null);
    }

    private final static int mExportVarIdx_rand_ss2_1 = 33;
    private Short2 mExportVar_rand_ss2_1;
    public synchronized void set_rand_ss2_1(Short2 v) {
        mExportVar_rand_ss2_1 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_ss2_1, fp, __I16_2, __dimArr);
    }

    public Short2 get_rand_ss2_1() {
        return mExportVar_rand_ss2_1;
    }

    public Script.FieldID getFieldID_rand_ss2_1() {
        return createFieldID(mExportVarIdx_rand_ss2_1, null);
    }

    private final static int mExportVarIdx_rand_ss3_0 = 34;
    private Short3 mExportVar_rand_ss3_0;
    public synchronized void set_rand_ss3_0(Short3 v) {
        mExportVar_rand_ss3_0 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_ss3_0, fp, __I16_3, __dimArr);
    }

    public Short3 get_rand_ss3_0() {
        return mExportVar_rand_ss3_0;
    }

    public Script.FieldID getFieldID_rand_ss3_0() {
        return createFieldID(mExportVarIdx_rand_ss3_0, null);
    }

    private final static int mExportVarIdx_rand_ss3_1 = 35;
    private Short3 mExportVar_rand_ss3_1;
    public synchronized void set_rand_ss3_1(Short3 v) {
        mExportVar_rand_ss3_1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_ss3_1, fp, __I16_3, __dimArr);
    }

    public Short3 get_rand_ss3_1() {
        return mExportVar_rand_ss3_1;
    }

    public Script.FieldID getFieldID_rand_ss3_1() {
        return createFieldID(mExportVarIdx_rand_ss3_1, null);
    }

    private final static int mExportVarIdx_rand_ss4_0 = 36;
    private Short4 mExportVar_rand_ss4_0;
    public synchronized void set_rand_ss4_0(Short4 v) {
        mExportVar_rand_ss4_0 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_ss4_0, fp, __I16_4, __dimArr);
    }

    public Short4 get_rand_ss4_0() {
        return mExportVar_rand_ss4_0;
    }

    public Script.FieldID getFieldID_rand_ss4_0() {
        return createFieldID(mExportVarIdx_rand_ss4_0, null);
    }

    private final static int mExportVarIdx_rand_ss4_1 = 37;
    private Short4 mExportVar_rand_ss4_1;
    public synchronized void set_rand_ss4_1(Short4 v) {
        mExportVar_rand_ss4_1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_ss4_1, fp, __I16_4, __dimArr);
    }

    public Short4 get_rand_ss4_1() {
        return mExportVar_rand_ss4_1;
    }

    public Script.FieldID getFieldID_rand_ss4_1() {
        return createFieldID(mExportVarIdx_rand_ss4_1, null);
    }

    private final static int mExportVarIdx_rand_us1_0 = 38;
    private int mExportVar_rand_us1_0;
    public synchronized void set_rand_us1_0(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_rand_us1_0, __rs_fp_U16);
        mExportVar_rand_us1_0 = v;
    }

    public int get_rand_us1_0() {
        return mExportVar_rand_us1_0;
    }

    public Script.FieldID getFieldID_rand_us1_0() {
        return createFieldID(mExportVarIdx_rand_us1_0, null);
    }

    private final static int mExportVarIdx_rand_us1_1 = 39;
    private int mExportVar_rand_us1_1;
    public synchronized void set_rand_us1_1(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_rand_us1_1, __rs_fp_U16);
        mExportVar_rand_us1_1 = v;
    }

    public int get_rand_us1_1() {
        return mExportVar_rand_us1_1;
    }

    public Script.FieldID getFieldID_rand_us1_1() {
        return createFieldID(mExportVarIdx_rand_us1_1, null);
    }

    private final static int mExportVarIdx_rand_us2_0 = 40;
    private Int2 mExportVar_rand_us2_0;
    public synchronized void set_rand_us2_0(Int2 v) {
        mExportVar_rand_us2_0 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_us2_0, fp, __U16_2, __dimArr);
    }

    public Int2 get_rand_us2_0() {
        return mExportVar_rand_us2_0;
    }

    public Script.FieldID getFieldID_rand_us2_0() {
        return createFieldID(mExportVarIdx_rand_us2_0, null);
    }

    private final static int mExportVarIdx_rand_us2_1 = 41;
    private Int2 mExportVar_rand_us2_1;
    public synchronized void set_rand_us2_1(Int2 v) {
        mExportVar_rand_us2_1 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_us2_1, fp, __U16_2, __dimArr);
    }

    public Int2 get_rand_us2_1() {
        return mExportVar_rand_us2_1;
    }

    public Script.FieldID getFieldID_rand_us2_1() {
        return createFieldID(mExportVarIdx_rand_us2_1, null);
    }

    private final static int mExportVarIdx_rand_us3_0 = 42;
    private Int3 mExportVar_rand_us3_0;
    public synchronized void set_rand_us3_0(Int3 v) {
        mExportVar_rand_us3_0 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_us3_0, fp, __U16_3, __dimArr);
    }

    public Int3 get_rand_us3_0() {
        return mExportVar_rand_us3_0;
    }

    public Script.FieldID getFieldID_rand_us3_0() {
        return createFieldID(mExportVarIdx_rand_us3_0, null);
    }

    private final static int mExportVarIdx_rand_us3_1 = 43;
    private Int3 mExportVar_rand_us3_1;
    public synchronized void set_rand_us3_1(Int3 v) {
        mExportVar_rand_us3_1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_us3_1, fp, __U16_3, __dimArr);
    }

    public Int3 get_rand_us3_1() {
        return mExportVar_rand_us3_1;
    }

    public Script.FieldID getFieldID_rand_us3_1() {
        return createFieldID(mExportVarIdx_rand_us3_1, null);
    }

    private final static int mExportVarIdx_rand_us4_0 = 44;
    private Int4 mExportVar_rand_us4_0;
    public synchronized void set_rand_us4_0(Int4 v) {
        mExportVar_rand_us4_0 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_us4_0, fp, __U16_4, __dimArr);
    }

    public Int4 get_rand_us4_0() {
        return mExportVar_rand_us4_0;
    }

    public Script.FieldID getFieldID_rand_us4_0() {
        return createFieldID(mExportVarIdx_rand_us4_0, null);
    }

    private final static int mExportVarIdx_rand_us4_1 = 45;
    private Int4 mExportVar_rand_us4_1;
    public synchronized void set_rand_us4_1(Int4 v) {
        mExportVar_rand_us4_1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_rand_us4_1, fp, __U16_4, __dimArr);
    }

    public Int4 get_rand_us4_1() {
        return mExportVar_rand_us4_1;
    }

    public Script.FieldID getFieldID_rand_us4_1() {
        return createFieldID(mExportVarIdx_rand_us4_1, null);
    }

    private final static int mExportVarIdx_rand_si1_0 = 46;
    private int mExportVar_rand_si1_0;
    public synchronized void set_rand_si1_0(int v) {
        setVar(mExportVarIdx_rand_si1_0, v);
        mExportVar_rand_si1_0 = v;
    }

    public int get_rand_si1_0() {
        return mExportVar_rand_si1_0;
    }

    public Script.FieldID getFieldID_rand_si1_0() {
        return createFieldID(mExportVarIdx_rand_si1_0, null);
    }

    private final static int mExportVarIdx_rand_si1_1 = 47;
    private int mExportVar_rand_si1_1;
    public synchronized void set_rand_si1_1(int v) {
        setVar(mExportVarIdx_rand_si1_1, v);
        mExportVar_rand_si1_1 = v;
    }

    public int get_rand_si1_1() {
        return mExportVar_rand_si1_1;
    }

    public Script.FieldID getFieldID_rand_si1_1() {
        return createFieldID(mExportVarIdx_rand_si1_1, null);
    }

    private final static int mExportVarIdx_rand_si2_0 = 48;
    private Int2 mExportVar_rand_si2_0;
    public synchronized void set_rand_si2_0(Int2 v) {
        mExportVar_rand_si2_0 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_si2_0, fp, __I32_2, __dimArr);
    }

    public Int2 get_rand_si2_0() {
        return mExportVar_rand_si2_0;
    }

    public Script.FieldID getFieldID_rand_si2_0() {
        return createFieldID(mExportVarIdx_rand_si2_0, null);
    }

    private final static int mExportVarIdx_rand_si2_1 = 49;
    private Int2 mExportVar_rand_si2_1;
    public synchronized void set_rand_si2_1(Int2 v) {
        mExportVar_rand_si2_1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_si2_1, fp, __I32_2, __dimArr);
    }

    public Int2 get_rand_si2_1() {
        return mExportVar_rand_si2_1;
    }

    public Script.FieldID getFieldID_rand_si2_1() {
        return createFieldID(mExportVarIdx_rand_si2_1, null);
    }

    private final static int mExportVarIdx_rand_si3_0 = 50;
    private Int3 mExportVar_rand_si3_0;
    public synchronized void set_rand_si3_0(Int3 v) {
        mExportVar_rand_si3_0 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_si3_0, fp, __I32_3, __dimArr);
    }

    public Int3 get_rand_si3_0() {
        return mExportVar_rand_si3_0;
    }

    public Script.FieldID getFieldID_rand_si3_0() {
        return createFieldID(mExportVarIdx_rand_si3_0, null);
    }

    private final static int mExportVarIdx_rand_si3_1 = 51;
    private Int3 mExportVar_rand_si3_1;
    public synchronized void set_rand_si3_1(Int3 v) {
        mExportVar_rand_si3_1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_si3_1, fp, __I32_3, __dimArr);
    }

    public Int3 get_rand_si3_1() {
        return mExportVar_rand_si3_1;
    }

    public Script.FieldID getFieldID_rand_si3_1() {
        return createFieldID(mExportVarIdx_rand_si3_1, null);
    }

    private final static int mExportVarIdx_rand_si4_0 = 52;
    private Int4 mExportVar_rand_si4_0;
    public synchronized void set_rand_si4_0(Int4 v) {
        mExportVar_rand_si4_0 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_si4_0, fp, __I32_4, __dimArr);
    }

    public Int4 get_rand_si4_0() {
        return mExportVar_rand_si4_0;
    }

    public Script.FieldID getFieldID_rand_si4_0() {
        return createFieldID(mExportVarIdx_rand_si4_0, null);
    }

    private final static int mExportVarIdx_rand_si4_1 = 53;
    private Int4 mExportVar_rand_si4_1;
    public synchronized void set_rand_si4_1(Int4 v) {
        mExportVar_rand_si4_1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_si4_1, fp, __I32_4, __dimArr);
    }

    public Int4 get_rand_si4_1() {
        return mExportVar_rand_si4_1;
    }

    public Script.FieldID getFieldID_rand_si4_1() {
        return createFieldID(mExportVarIdx_rand_si4_1, null);
    }

    private final static int mExportVarIdx_rand_ui1_0 = 54;
    private long mExportVar_rand_ui1_0;
    public synchronized void set_rand_ui1_0(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_rand_ui1_0, __rs_fp_U32);
        mExportVar_rand_ui1_0 = v;
    }

    public long get_rand_ui1_0() {
        return mExportVar_rand_ui1_0;
    }

    public Script.FieldID getFieldID_rand_ui1_0() {
        return createFieldID(mExportVarIdx_rand_ui1_0, null);
    }

    private final static int mExportVarIdx_rand_ui1_1 = 55;
    private long mExportVar_rand_ui1_1;
    public synchronized void set_rand_ui1_1(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_rand_ui1_1, __rs_fp_U32);
        mExportVar_rand_ui1_1 = v;
    }

    public long get_rand_ui1_1() {
        return mExportVar_rand_ui1_1;
    }

    public Script.FieldID getFieldID_rand_ui1_1() {
        return createFieldID(mExportVarIdx_rand_ui1_1, null);
    }

    private final static int mExportVarIdx_rand_ui2_0 = 56;
    private Long2 mExportVar_rand_ui2_0;
    public synchronized void set_rand_ui2_0(Long2 v) {
        mExportVar_rand_ui2_0 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_ui2_0, fp, __U32_2, __dimArr);
    }

    public Long2 get_rand_ui2_0() {
        return mExportVar_rand_ui2_0;
    }

    public Script.FieldID getFieldID_rand_ui2_0() {
        return createFieldID(mExportVarIdx_rand_ui2_0, null);
    }

    private final static int mExportVarIdx_rand_ui2_1 = 57;
    private Long2 mExportVar_rand_ui2_1;
    public synchronized void set_rand_ui2_1(Long2 v) {
        mExportVar_rand_ui2_1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_ui2_1, fp, __U32_2, __dimArr);
    }

    public Long2 get_rand_ui2_1() {
        return mExportVar_rand_ui2_1;
    }

    public Script.FieldID getFieldID_rand_ui2_1() {
        return createFieldID(mExportVarIdx_rand_ui2_1, null);
    }

    private final static int mExportVarIdx_rand_ui3_0 = 58;
    private Long3 mExportVar_rand_ui3_0;
    public synchronized void set_rand_ui3_0(Long3 v) {
        mExportVar_rand_ui3_0 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_ui3_0, fp, __U32_3, __dimArr);
    }

    public Long3 get_rand_ui3_0() {
        return mExportVar_rand_ui3_0;
    }

    public Script.FieldID getFieldID_rand_ui3_0() {
        return createFieldID(mExportVarIdx_rand_ui3_0, null);
    }

    private final static int mExportVarIdx_rand_ui3_1 = 59;
    private Long3 mExportVar_rand_ui3_1;
    public synchronized void set_rand_ui3_1(Long3 v) {
        mExportVar_rand_ui3_1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_ui3_1, fp, __U32_3, __dimArr);
    }

    public Long3 get_rand_ui3_1() {
        return mExportVar_rand_ui3_1;
    }

    public Script.FieldID getFieldID_rand_ui3_1() {
        return createFieldID(mExportVarIdx_rand_ui3_1, null);
    }

    private final static int mExportVarIdx_rand_ui4_0 = 60;
    private Long4 mExportVar_rand_ui4_0;
    public synchronized void set_rand_ui4_0(Long4 v) {
        mExportVar_rand_ui4_0 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_ui4_0, fp, __U32_4, __dimArr);
    }

    public Long4 get_rand_ui4_0() {
        return mExportVar_rand_ui4_0;
    }

    public Script.FieldID getFieldID_rand_ui4_0() {
        return createFieldID(mExportVarIdx_rand_ui4_0, null);
    }

    private final static int mExportVarIdx_rand_ui4_1 = 61;
    private Long4 mExportVar_rand_ui4_1;
    public synchronized void set_rand_ui4_1(Long4 v) {
        mExportVar_rand_ui4_1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_rand_ui4_1, fp, __U32_4, __dimArr);
    }

    public Long4 get_rand_ui4_1() {
        return mExportVar_rand_ui4_1;
    }

    public Script.FieldID getFieldID_rand_ui4_1() {
        return createFieldID(mExportVarIdx_rand_ui4_1, null);
    }

    private final static int mExportVarIdx_rand_sl1_0 = 62;
    private long mExportVar_rand_sl1_0;
    public synchronized void set_rand_sl1_0(long v) {
        setVar(mExportVarIdx_rand_sl1_0, v);
        mExportVar_rand_sl1_0 = v;
    }

    public long get_rand_sl1_0() {
        return mExportVar_rand_sl1_0;
    }

    public Script.FieldID getFieldID_rand_sl1_0() {
        return createFieldID(mExportVarIdx_rand_sl1_0, null);
    }

    private final static int mExportVarIdx_rand_sl1_1 = 63;
    private long mExportVar_rand_sl1_1;
    public synchronized void set_rand_sl1_1(long v) {
        setVar(mExportVarIdx_rand_sl1_1, v);
        mExportVar_rand_sl1_1 = v;
    }

    public long get_rand_sl1_1() {
        return mExportVar_rand_sl1_1;
    }

    public Script.FieldID getFieldID_rand_sl1_1() {
        return createFieldID(mExportVarIdx_rand_sl1_1, null);
    }

    private final static int mExportVarIdx_rand_sl2_0 = 64;
    private Long2 mExportVar_rand_sl2_0;
    public synchronized void set_rand_sl2_0(Long2 v) {
        mExportVar_rand_sl2_0 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_sl2_0, fp, __I64_2, __dimArr);
    }

    public Long2 get_rand_sl2_0() {
        return mExportVar_rand_sl2_0;
    }

    public Script.FieldID getFieldID_rand_sl2_0() {
        return createFieldID(mExportVarIdx_rand_sl2_0, null);
    }

    private final static int mExportVarIdx_rand_sl2_1 = 65;
    private Long2 mExportVar_rand_sl2_1;
    public synchronized void set_rand_sl2_1(Long2 v) {
        mExportVar_rand_sl2_1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_sl2_1, fp, __I64_2, __dimArr);
    }

    public Long2 get_rand_sl2_1() {
        return mExportVar_rand_sl2_1;
    }

    public Script.FieldID getFieldID_rand_sl2_1() {
        return createFieldID(mExportVarIdx_rand_sl2_1, null);
    }

    private final static int mExportVarIdx_rand_sl3_0 = 66;
    private Long3 mExportVar_rand_sl3_0;
    public synchronized void set_rand_sl3_0(Long3 v) {
        mExportVar_rand_sl3_0 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_sl3_0, fp, __I64_3, __dimArr);
    }

    public Long3 get_rand_sl3_0() {
        return mExportVar_rand_sl3_0;
    }

    public Script.FieldID getFieldID_rand_sl3_0() {
        return createFieldID(mExportVarIdx_rand_sl3_0, null);
    }

    private final static int mExportVarIdx_rand_sl3_1 = 67;
    private Long3 mExportVar_rand_sl3_1;
    public synchronized void set_rand_sl3_1(Long3 v) {
        mExportVar_rand_sl3_1 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_sl3_1, fp, __I64_3, __dimArr);
    }

    public Long3 get_rand_sl3_1() {
        return mExportVar_rand_sl3_1;
    }

    public Script.FieldID getFieldID_rand_sl3_1() {
        return createFieldID(mExportVarIdx_rand_sl3_1, null);
    }

    private final static int mExportVarIdx_rand_sl4_0 = 68;
    private Long4 mExportVar_rand_sl4_0;
    public synchronized void set_rand_sl4_0(Long4 v) {
        mExportVar_rand_sl4_0 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_sl4_0, fp, __I64_4, __dimArr);
    }

    public Long4 get_rand_sl4_0() {
        return mExportVar_rand_sl4_0;
    }

    public Script.FieldID getFieldID_rand_sl4_0() {
        return createFieldID(mExportVarIdx_rand_sl4_0, null);
    }

    private final static int mExportVarIdx_rand_sl4_1 = 69;
    private Long4 mExportVar_rand_sl4_1;
    public synchronized void set_rand_sl4_1(Long4 v) {
        mExportVar_rand_sl4_1 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_sl4_1, fp, __I64_4, __dimArr);
    }

    public Long4 get_rand_sl4_1() {
        return mExportVar_rand_sl4_1;
    }

    public Script.FieldID getFieldID_rand_sl4_1() {
        return createFieldID(mExportVarIdx_rand_sl4_1, null);
    }

    private final static int mExportVarIdx_rand_ul1_0 = 70;
    private long mExportVar_rand_ul1_0;
    public synchronized void set_rand_ul1_0(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_rand_ul1_0, __rs_fp_U64);
        mExportVar_rand_ul1_0 = v;
    }

    public long get_rand_ul1_0() {
        return mExportVar_rand_ul1_0;
    }

    public Script.FieldID getFieldID_rand_ul1_0() {
        return createFieldID(mExportVarIdx_rand_ul1_0, null);
    }

    private final static int mExportVarIdx_rand_ul1_1 = 71;
    private long mExportVar_rand_ul1_1;
    public synchronized void set_rand_ul1_1(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_rand_ul1_1, __rs_fp_U64);
        mExportVar_rand_ul1_1 = v;
    }

    public long get_rand_ul1_1() {
        return mExportVar_rand_ul1_1;
    }

    public Script.FieldID getFieldID_rand_ul1_1() {
        return createFieldID(mExportVarIdx_rand_ul1_1, null);
    }

    private final static int mExportVarIdx_rand_ul2_0 = 72;
    private Long2 mExportVar_rand_ul2_0;
    public synchronized void set_rand_ul2_0(Long2 v) {
        mExportVar_rand_ul2_0 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_ul2_0, fp, __U64_2, __dimArr);
    }

    public Long2 get_rand_ul2_0() {
        return mExportVar_rand_ul2_0;
    }

    public Script.FieldID getFieldID_rand_ul2_0() {
        return createFieldID(mExportVarIdx_rand_ul2_0, null);
    }

    private final static int mExportVarIdx_rand_ul2_1 = 73;
    private Long2 mExportVar_rand_ul2_1;
    public synchronized void set_rand_ul2_1(Long2 v) {
        mExportVar_rand_ul2_1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_ul2_1, fp, __U64_2, __dimArr);
    }

    public Long2 get_rand_ul2_1() {
        return mExportVar_rand_ul2_1;
    }

    public Script.FieldID getFieldID_rand_ul2_1() {
        return createFieldID(mExportVarIdx_rand_ul2_1, null);
    }

    private final static int mExportVarIdx_rand_ul3_0 = 74;
    private Long3 mExportVar_rand_ul3_0;
    public synchronized void set_rand_ul3_0(Long3 v) {
        mExportVar_rand_ul3_0 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_ul3_0, fp, __U64_3, __dimArr);
    }

    public Long3 get_rand_ul3_0() {
        return mExportVar_rand_ul3_0;
    }

    public Script.FieldID getFieldID_rand_ul3_0() {
        return createFieldID(mExportVarIdx_rand_ul3_0, null);
    }

    private final static int mExportVarIdx_rand_ul3_1 = 75;
    private Long3 mExportVar_rand_ul3_1;
    public synchronized void set_rand_ul3_1(Long3 v) {
        mExportVar_rand_ul3_1 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_ul3_1, fp, __U64_3, __dimArr);
    }

    public Long3 get_rand_ul3_1() {
        return mExportVar_rand_ul3_1;
    }

    public Script.FieldID getFieldID_rand_ul3_1() {
        return createFieldID(mExportVarIdx_rand_ul3_1, null);
    }

    private final static int mExportVarIdx_rand_ul4_0 = 76;
    private Long4 mExportVar_rand_ul4_0;
    public synchronized void set_rand_ul4_0(Long4 v) {
        mExportVar_rand_ul4_0 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_ul4_0, fp, __U64_4, __dimArr);
    }

    public Long4 get_rand_ul4_0() {
        return mExportVar_rand_ul4_0;
    }

    public Script.FieldID getFieldID_rand_ul4_0() {
        return createFieldID(mExportVarIdx_rand_ul4_0, null);
    }

    private final static int mExportVarIdx_rand_ul4_1 = 77;
    private Long4 mExportVar_rand_ul4_1;
    public synchronized void set_rand_ul4_1(Long4 v) {
        mExportVar_rand_ul4_1 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_rand_ul4_1, fp, __U64_4, __dimArr);
    }

    public Long4 get_rand_ul4_1() {
        return mExportVar_rand_ul4_1;
    }

    public Script.FieldID getFieldID_rand_ul4_1() {
        return createFieldID(mExportVarIdx_rand_ul4_1, null);
    }

    private final static int mExportVarIdx_min_rand_f1_f1 = 78;
    private float mExportVar_min_rand_f1_f1;
    public synchronized void set_min_rand_f1_f1(float v) {
        setVar(mExportVarIdx_min_rand_f1_f1, v);
        mExportVar_min_rand_f1_f1 = v;
    }

    public float get_min_rand_f1_f1() {
        return mExportVar_min_rand_f1_f1;
    }

    public Script.FieldID getFieldID_min_rand_f1_f1() {
        return createFieldID(mExportVarIdx_min_rand_f1_f1, null);
    }

    private final static int mExportVarIdx_min_rand_f2_f2 = 79;
    private Float2 mExportVar_min_rand_f2_f2;
    public synchronized void set_min_rand_f2_f2(Float2 v) {
        mExportVar_min_rand_f2_f2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_f2_f2, fp, __F32_2, __dimArr);
    }

    public Float2 get_min_rand_f2_f2() {
        return mExportVar_min_rand_f2_f2;
    }

    public Script.FieldID getFieldID_min_rand_f2_f2() {
        return createFieldID(mExportVarIdx_min_rand_f2_f2, null);
    }

    private final static int mExportVarIdx_min_rand_f3_f3 = 80;
    private Float3 mExportVar_min_rand_f3_f3;
    public synchronized void set_min_rand_f3_f3(Float3 v) {
        mExportVar_min_rand_f3_f3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_f3_f3, fp, __F32_3, __dimArr);
    }

    public Float3 get_min_rand_f3_f3() {
        return mExportVar_min_rand_f3_f3;
    }

    public Script.FieldID getFieldID_min_rand_f3_f3() {
        return createFieldID(mExportVarIdx_min_rand_f3_f3, null);
    }

    private final static int mExportVarIdx_min_rand_f4_f4 = 81;
    private Float4 mExportVar_min_rand_f4_f4;
    public synchronized void set_min_rand_f4_f4(Float4 v) {
        mExportVar_min_rand_f4_f4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_f4_f4, fp, __F32_4, __dimArr);
    }

    public Float4 get_min_rand_f4_f4() {
        return mExportVar_min_rand_f4_f4;
    }

    public Script.FieldID getFieldID_min_rand_f4_f4() {
        return createFieldID(mExportVarIdx_min_rand_f4_f4, null);
    }

    private final static int mExportVarIdx_min_rand_sc1_sc1 = 82;
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

    private final static int mExportVarIdx_min_rand_sc2_sc2 = 83;
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

    private final static int mExportVarIdx_min_rand_sc3_sc3 = 84;
    private Byte3 mExportVar_min_rand_sc3_sc3;
    public synchronized void set_min_rand_sc3_sc3(Byte3 v) {
        mExportVar_min_rand_sc3_sc3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_min_rand_sc3_sc3, fp, __I8_3, __dimArr);
    }

    public Byte3 get_min_rand_sc3_sc3() {
        return mExportVar_min_rand_sc3_sc3;
    }

    public Script.FieldID getFieldID_min_rand_sc3_sc3() {
        return createFieldID(mExportVarIdx_min_rand_sc3_sc3, null);
    }

    private final static int mExportVarIdx_min_rand_sc4_sc4 = 85;
    private Byte4 mExportVar_min_rand_sc4_sc4;
    public synchronized void set_min_rand_sc4_sc4(Byte4 v) {
        mExportVar_min_rand_sc4_sc4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_min_rand_sc4_sc4, fp, __I8_4, __dimArr);
    }

    public Byte4 get_min_rand_sc4_sc4() {
        return mExportVar_min_rand_sc4_sc4;
    }

    public Script.FieldID getFieldID_min_rand_sc4_sc4() {
        return createFieldID(mExportVarIdx_min_rand_sc4_sc4, null);
    }

    private final static int mExportVarIdx_min_rand_uc1_uc1 = 86;
    private short mExportVar_min_rand_uc1_uc1;
    public synchronized void set_min_rand_uc1_uc1(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_min_rand_uc1_uc1, __rs_fp_U8);
        mExportVar_min_rand_uc1_uc1 = v;
    }

    public short get_min_rand_uc1_uc1() {
        return mExportVar_min_rand_uc1_uc1;
    }

    public Script.FieldID getFieldID_min_rand_uc1_uc1() {
        return createFieldID(mExportVarIdx_min_rand_uc1_uc1, null);
    }

    private final static int mExportVarIdx_min_rand_uc2_uc2 = 87;
    private Short2 mExportVar_min_rand_uc2_uc2;
    public synchronized void set_min_rand_uc2_uc2(Short2 v) {
        mExportVar_min_rand_uc2_uc2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_min_rand_uc2_uc2, fp, __U8_2, __dimArr);
    }

    public Short2 get_min_rand_uc2_uc2() {
        return mExportVar_min_rand_uc2_uc2;
    }

    public Script.FieldID getFieldID_min_rand_uc2_uc2() {
        return createFieldID(mExportVarIdx_min_rand_uc2_uc2, null);
    }

    private final static int mExportVarIdx_min_rand_uc3_uc3 = 88;
    private Short3 mExportVar_min_rand_uc3_uc3;
    public synchronized void set_min_rand_uc3_uc3(Short3 v) {
        mExportVar_min_rand_uc3_uc3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_min_rand_uc3_uc3, fp, __U8_3, __dimArr);
    }

    public Short3 get_min_rand_uc3_uc3() {
        return mExportVar_min_rand_uc3_uc3;
    }

    public Script.FieldID getFieldID_min_rand_uc3_uc3() {
        return createFieldID(mExportVarIdx_min_rand_uc3_uc3, null);
    }

    private final static int mExportVarIdx_min_rand_uc4_uc4 = 89;
    private Short4 mExportVar_min_rand_uc4_uc4;
    public synchronized void set_min_rand_uc4_uc4(Short4 v) {
        mExportVar_min_rand_uc4_uc4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_min_rand_uc4_uc4, fp, __U8_4, __dimArr);
    }

    public Short4 get_min_rand_uc4_uc4() {
        return mExportVar_min_rand_uc4_uc4;
    }

    public Script.FieldID getFieldID_min_rand_uc4_uc4() {
        return createFieldID(mExportVarIdx_min_rand_uc4_uc4, null);
    }

    private final static int mExportVarIdx_min_rand_ss1_ss1 = 90;
    private short mExportVar_min_rand_ss1_ss1;
    public synchronized void set_min_rand_ss1_ss1(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_min_rand_ss1_ss1, __rs_fp_I16);
        mExportVar_min_rand_ss1_ss1 = v;
    }

    public short get_min_rand_ss1_ss1() {
        return mExportVar_min_rand_ss1_ss1;
    }

    public Script.FieldID getFieldID_min_rand_ss1_ss1() {
        return createFieldID(mExportVarIdx_min_rand_ss1_ss1, null);
    }

    private final static int mExportVarIdx_min_rand_ss2_ss2 = 91;
    private Short2 mExportVar_min_rand_ss2_ss2;
    public synchronized void set_min_rand_ss2_ss2(Short2 v) {
        mExportVar_min_rand_ss2_ss2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_min_rand_ss2_ss2, fp, __I16_2, __dimArr);
    }

    public Short2 get_min_rand_ss2_ss2() {
        return mExportVar_min_rand_ss2_ss2;
    }

    public Script.FieldID getFieldID_min_rand_ss2_ss2() {
        return createFieldID(mExportVarIdx_min_rand_ss2_ss2, null);
    }

    private final static int mExportVarIdx_min_rand_ss3_ss3 = 92;
    private Short3 mExportVar_min_rand_ss3_ss3;
    public synchronized void set_min_rand_ss3_ss3(Short3 v) {
        mExportVar_min_rand_ss3_ss3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_min_rand_ss3_ss3, fp, __I16_3, __dimArr);
    }

    public Short3 get_min_rand_ss3_ss3() {
        return mExportVar_min_rand_ss3_ss3;
    }

    public Script.FieldID getFieldID_min_rand_ss3_ss3() {
        return createFieldID(mExportVarIdx_min_rand_ss3_ss3, null);
    }

    private final static int mExportVarIdx_min_rand_ss4_ss4 = 93;
    private Short4 mExportVar_min_rand_ss4_ss4;
    public synchronized void set_min_rand_ss4_ss4(Short4 v) {
        mExportVar_min_rand_ss4_ss4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_min_rand_ss4_ss4, fp, __I16_4, __dimArr);
    }

    public Short4 get_min_rand_ss4_ss4() {
        return mExportVar_min_rand_ss4_ss4;
    }

    public Script.FieldID getFieldID_min_rand_ss4_ss4() {
        return createFieldID(mExportVarIdx_min_rand_ss4_ss4, null);
    }

    private final static int mExportVarIdx_min_rand_us1_us1 = 94;
    private int mExportVar_min_rand_us1_us1;
    public synchronized void set_min_rand_us1_us1(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_min_rand_us1_us1, __rs_fp_U16);
        mExportVar_min_rand_us1_us1 = v;
    }

    public int get_min_rand_us1_us1() {
        return mExportVar_min_rand_us1_us1;
    }

    public Script.FieldID getFieldID_min_rand_us1_us1() {
        return createFieldID(mExportVarIdx_min_rand_us1_us1, null);
    }

    private final static int mExportVarIdx_min_rand_us2_us2 = 95;
    private Int2 mExportVar_min_rand_us2_us2;
    public synchronized void set_min_rand_us2_us2(Int2 v) {
        mExportVar_min_rand_us2_us2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_min_rand_us2_us2, fp, __U16_2, __dimArr);
    }

    public Int2 get_min_rand_us2_us2() {
        return mExportVar_min_rand_us2_us2;
    }

    public Script.FieldID getFieldID_min_rand_us2_us2() {
        return createFieldID(mExportVarIdx_min_rand_us2_us2, null);
    }

    private final static int mExportVarIdx_min_rand_us3_us3 = 96;
    private Int3 mExportVar_min_rand_us3_us3;
    public synchronized void set_min_rand_us3_us3(Int3 v) {
        mExportVar_min_rand_us3_us3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_min_rand_us3_us3, fp, __U16_3, __dimArr);
    }

    public Int3 get_min_rand_us3_us3() {
        return mExportVar_min_rand_us3_us3;
    }

    public Script.FieldID getFieldID_min_rand_us3_us3() {
        return createFieldID(mExportVarIdx_min_rand_us3_us3, null);
    }

    private final static int mExportVarIdx_min_rand_us4_us4 = 97;
    private Int4 mExportVar_min_rand_us4_us4;
    public synchronized void set_min_rand_us4_us4(Int4 v) {
        mExportVar_min_rand_us4_us4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_min_rand_us4_us4, fp, __U16_4, __dimArr);
    }

    public Int4 get_min_rand_us4_us4() {
        return mExportVar_min_rand_us4_us4;
    }

    public Script.FieldID getFieldID_min_rand_us4_us4() {
        return createFieldID(mExportVarIdx_min_rand_us4_us4, null);
    }

    private final static int mExportVarIdx_min_rand_si1_si1 = 98;
    private int mExportVar_min_rand_si1_si1;
    public synchronized void set_min_rand_si1_si1(int v) {
        setVar(mExportVarIdx_min_rand_si1_si1, v);
        mExportVar_min_rand_si1_si1 = v;
    }

    public int get_min_rand_si1_si1() {
        return mExportVar_min_rand_si1_si1;
    }

    public Script.FieldID getFieldID_min_rand_si1_si1() {
        return createFieldID(mExportVarIdx_min_rand_si1_si1, null);
    }

    private final static int mExportVarIdx_min_rand_si2_si2 = 99;
    private Int2 mExportVar_min_rand_si2_si2;
    public synchronized void set_min_rand_si2_si2(Int2 v) {
        mExportVar_min_rand_si2_si2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_si2_si2, fp, __I32_2, __dimArr);
    }

    public Int2 get_min_rand_si2_si2() {
        return mExportVar_min_rand_si2_si2;
    }

    public Script.FieldID getFieldID_min_rand_si2_si2() {
        return createFieldID(mExportVarIdx_min_rand_si2_si2, null);
    }

    private final static int mExportVarIdx_min_rand_si3_si3 = 100;
    private Int3 mExportVar_min_rand_si3_si3;
    public synchronized void set_min_rand_si3_si3(Int3 v) {
        mExportVar_min_rand_si3_si3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_si3_si3, fp, __I32_3, __dimArr);
    }

    public Int3 get_min_rand_si3_si3() {
        return mExportVar_min_rand_si3_si3;
    }

    public Script.FieldID getFieldID_min_rand_si3_si3() {
        return createFieldID(mExportVarIdx_min_rand_si3_si3, null);
    }

    private final static int mExportVarIdx_min_rand_si4_si4 = 101;
    private Int4 mExportVar_min_rand_si4_si4;
    public synchronized void set_min_rand_si4_si4(Int4 v) {
        mExportVar_min_rand_si4_si4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_si4_si4, fp, __I32_4, __dimArr);
    }

    public Int4 get_min_rand_si4_si4() {
        return mExportVar_min_rand_si4_si4;
    }

    public Script.FieldID getFieldID_min_rand_si4_si4() {
        return createFieldID(mExportVarIdx_min_rand_si4_si4, null);
    }

    private final static int mExportVarIdx_min_rand_ui1_ui1 = 102;
    private long mExportVar_min_rand_ui1_ui1;
    public synchronized void set_min_rand_ui1_ui1(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_min_rand_ui1_ui1, __rs_fp_U32);
        mExportVar_min_rand_ui1_ui1 = v;
    }

    public long get_min_rand_ui1_ui1() {
        return mExportVar_min_rand_ui1_ui1;
    }

    public Script.FieldID getFieldID_min_rand_ui1_ui1() {
        return createFieldID(mExportVarIdx_min_rand_ui1_ui1, null);
    }

    private final static int mExportVarIdx_min_rand_ui2_ui2 = 103;
    private Long2 mExportVar_min_rand_ui2_ui2;
    public synchronized void set_min_rand_ui2_ui2(Long2 v) {
        mExportVar_min_rand_ui2_ui2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_ui2_ui2, fp, __U32_2, __dimArr);
    }

    public Long2 get_min_rand_ui2_ui2() {
        return mExportVar_min_rand_ui2_ui2;
    }

    public Script.FieldID getFieldID_min_rand_ui2_ui2() {
        return createFieldID(mExportVarIdx_min_rand_ui2_ui2, null);
    }

    private final static int mExportVarIdx_min_rand_ui3_ui3 = 104;
    private Long3 mExportVar_min_rand_ui3_ui3;
    public synchronized void set_min_rand_ui3_ui3(Long3 v) {
        mExportVar_min_rand_ui3_ui3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_ui3_ui3, fp, __U32_3, __dimArr);
    }

    public Long3 get_min_rand_ui3_ui3() {
        return mExportVar_min_rand_ui3_ui3;
    }

    public Script.FieldID getFieldID_min_rand_ui3_ui3() {
        return createFieldID(mExportVarIdx_min_rand_ui3_ui3, null);
    }

    private final static int mExportVarIdx_min_rand_ui4_ui4 = 105;
    private Long4 mExportVar_min_rand_ui4_ui4;
    public synchronized void set_min_rand_ui4_ui4(Long4 v) {
        mExportVar_min_rand_ui4_ui4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_min_rand_ui4_ui4, fp, __U32_4, __dimArr);
    }

    public Long4 get_min_rand_ui4_ui4() {
        return mExportVar_min_rand_ui4_ui4;
    }

    public Script.FieldID getFieldID_min_rand_ui4_ui4() {
        return createFieldID(mExportVarIdx_min_rand_ui4_ui4, null);
    }

    private final static int mExportVarIdx_min_rand_sl1_sl1 = 106;
    private long mExportVar_min_rand_sl1_sl1;
    public synchronized void set_min_rand_sl1_sl1(long v) {
        setVar(mExportVarIdx_min_rand_sl1_sl1, v);
        mExportVar_min_rand_sl1_sl1 = v;
    }

    public long get_min_rand_sl1_sl1() {
        return mExportVar_min_rand_sl1_sl1;
    }

    public Script.FieldID getFieldID_min_rand_sl1_sl1() {
        return createFieldID(mExportVarIdx_min_rand_sl1_sl1, null);
    }

    private final static int mExportVarIdx_min_rand_sl2_sl2 = 107;
    private Long2 mExportVar_min_rand_sl2_sl2;
    public synchronized void set_min_rand_sl2_sl2(Long2 v) {
        mExportVar_min_rand_sl2_sl2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_min_rand_sl2_sl2, fp, __I64_2, __dimArr);
    }

    public Long2 get_min_rand_sl2_sl2() {
        return mExportVar_min_rand_sl2_sl2;
    }

    public Script.FieldID getFieldID_min_rand_sl2_sl2() {
        return createFieldID(mExportVarIdx_min_rand_sl2_sl2, null);
    }

    private final static int mExportVarIdx_min_rand_sl3_sl3 = 108;
    private Long3 mExportVar_min_rand_sl3_sl3;
    public synchronized void set_min_rand_sl3_sl3(Long3 v) {
        mExportVar_min_rand_sl3_sl3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_min_rand_sl3_sl3, fp, __I64_3, __dimArr);
    }

    public Long3 get_min_rand_sl3_sl3() {
        return mExportVar_min_rand_sl3_sl3;
    }

    public Script.FieldID getFieldID_min_rand_sl3_sl3() {
        return createFieldID(mExportVarIdx_min_rand_sl3_sl3, null);
    }

    private final static int mExportVarIdx_min_rand_sl4_sl4 = 109;
    private Long4 mExportVar_min_rand_sl4_sl4;
    public synchronized void set_min_rand_sl4_sl4(Long4 v) {
        mExportVar_min_rand_sl4_sl4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_min_rand_sl4_sl4, fp, __I64_4, __dimArr);
    }

    public Long4 get_min_rand_sl4_sl4() {
        return mExportVar_min_rand_sl4_sl4;
    }

    public Script.FieldID getFieldID_min_rand_sl4_sl4() {
        return createFieldID(mExportVarIdx_min_rand_sl4_sl4, null);
    }

    private final static int mExportVarIdx_min_rand_ul1_ul1 = 110;
    private long mExportVar_min_rand_ul1_ul1;
    public synchronized void set_min_rand_ul1_ul1(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_min_rand_ul1_ul1, __rs_fp_U64);
        mExportVar_min_rand_ul1_ul1 = v;
    }

    public long get_min_rand_ul1_ul1() {
        return mExportVar_min_rand_ul1_ul1;
    }

    public Script.FieldID getFieldID_min_rand_ul1_ul1() {
        return createFieldID(mExportVarIdx_min_rand_ul1_ul1, null);
    }

    private final static int mExportVarIdx_min_rand_ul2_ul2 = 111;
    private Long2 mExportVar_min_rand_ul2_ul2;
    public synchronized void set_min_rand_ul2_ul2(Long2 v) {
        mExportVar_min_rand_ul2_ul2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_min_rand_ul2_ul2, fp, __U64_2, __dimArr);
    }

    public Long2 get_min_rand_ul2_ul2() {
        return mExportVar_min_rand_ul2_ul2;
    }

    public Script.FieldID getFieldID_min_rand_ul2_ul2() {
        return createFieldID(mExportVarIdx_min_rand_ul2_ul2, null);
    }

    private final static int mExportVarIdx_min_rand_ul3_ul3 = 112;
    private Long3 mExportVar_min_rand_ul3_ul3;
    public synchronized void set_min_rand_ul3_ul3(Long3 v) {
        mExportVar_min_rand_ul3_ul3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_min_rand_ul3_ul3, fp, __U64_3, __dimArr);
    }

    public Long3 get_min_rand_ul3_ul3() {
        return mExportVar_min_rand_ul3_ul3;
    }

    public Script.FieldID getFieldID_min_rand_ul3_ul3() {
        return createFieldID(mExportVarIdx_min_rand_ul3_ul3, null);
    }

    private final static int mExportVarIdx_min_rand_ul4_ul4 = 113;
    private Long4 mExportVar_min_rand_ul4_ul4;
    public synchronized void set_min_rand_ul4_ul4(Long4 v) {
        mExportVar_min_rand_ul4_ul4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_min_rand_ul4_ul4, fp, __U64_4, __dimArr);
    }

    public Long4 get_min_rand_ul4_ul4() {
        return mExportVar_min_rand_ul4_ul4;
    }

    public Script.FieldID getFieldID_min_rand_ul4_ul4() {
        return createFieldID(mExportVarIdx_min_rand_ul4_ul4, null);
    }

    private final static int mExportVarIdx_max_rand_f1_f1 = 114;
    private float mExportVar_max_rand_f1_f1;
    public synchronized void set_max_rand_f1_f1(float v) {
        setVar(mExportVarIdx_max_rand_f1_f1, v);
        mExportVar_max_rand_f1_f1 = v;
    }

    public float get_max_rand_f1_f1() {
        return mExportVar_max_rand_f1_f1;
    }

    public Script.FieldID getFieldID_max_rand_f1_f1() {
        return createFieldID(mExportVarIdx_max_rand_f1_f1, null);
    }

    private final static int mExportVarIdx_max_rand_f2_f2 = 115;
    private Float2 mExportVar_max_rand_f2_f2;
    public synchronized void set_max_rand_f2_f2(Float2 v) {
        mExportVar_max_rand_f2_f2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_f2_f2, fp, __F32_2, __dimArr);
    }

    public Float2 get_max_rand_f2_f2() {
        return mExportVar_max_rand_f2_f2;
    }

    public Script.FieldID getFieldID_max_rand_f2_f2() {
        return createFieldID(mExportVarIdx_max_rand_f2_f2, null);
    }

    private final static int mExportVarIdx_max_rand_f3_f3 = 116;
    private Float3 mExportVar_max_rand_f3_f3;
    public synchronized void set_max_rand_f3_f3(Float3 v) {
        mExportVar_max_rand_f3_f3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_f3_f3, fp, __F32_3, __dimArr);
    }

    public Float3 get_max_rand_f3_f3() {
        return mExportVar_max_rand_f3_f3;
    }

    public Script.FieldID getFieldID_max_rand_f3_f3() {
        return createFieldID(mExportVarIdx_max_rand_f3_f3, null);
    }

    private final static int mExportVarIdx_max_rand_f4_f4 = 117;
    private Float4 mExportVar_max_rand_f4_f4;
    public synchronized void set_max_rand_f4_f4(Float4 v) {
        mExportVar_max_rand_f4_f4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_f4_f4, fp, __F32_4, __dimArr);
    }

    public Float4 get_max_rand_f4_f4() {
        return mExportVar_max_rand_f4_f4;
    }

    public Script.FieldID getFieldID_max_rand_f4_f4() {
        return createFieldID(mExportVarIdx_max_rand_f4_f4, null);
    }

    private final static int mExportVarIdx_max_rand_sc1_sc1 = 118;
    private byte mExportVar_max_rand_sc1_sc1;
    public synchronized void set_max_rand_sc1_sc1(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_max_rand_sc1_sc1, __rs_fp_I8);
        mExportVar_max_rand_sc1_sc1 = v;
    }

    public byte get_max_rand_sc1_sc1() {
        return mExportVar_max_rand_sc1_sc1;
    }

    public Script.FieldID getFieldID_max_rand_sc1_sc1() {
        return createFieldID(mExportVarIdx_max_rand_sc1_sc1, null);
    }

    private final static int mExportVarIdx_max_rand_sc2_sc2 = 119;
    private Byte2 mExportVar_max_rand_sc2_sc2;
    public synchronized void set_max_rand_sc2_sc2(Byte2 v) {
        mExportVar_max_rand_sc2_sc2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_max_rand_sc2_sc2, fp, __I8_2, __dimArr);
    }

    public Byte2 get_max_rand_sc2_sc2() {
        return mExportVar_max_rand_sc2_sc2;
    }

    public Script.FieldID getFieldID_max_rand_sc2_sc2() {
        return createFieldID(mExportVarIdx_max_rand_sc2_sc2, null);
    }

    private final static int mExportVarIdx_max_rand_sc3_sc3 = 120;
    private Byte3 mExportVar_max_rand_sc3_sc3;
    public synchronized void set_max_rand_sc3_sc3(Byte3 v) {
        mExportVar_max_rand_sc3_sc3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_max_rand_sc3_sc3, fp, __I8_3, __dimArr);
    }

    public Byte3 get_max_rand_sc3_sc3() {
        return mExportVar_max_rand_sc3_sc3;
    }

    public Script.FieldID getFieldID_max_rand_sc3_sc3() {
        return createFieldID(mExportVarIdx_max_rand_sc3_sc3, null);
    }

    private final static int mExportVarIdx_max_rand_sc4_sc4 = 121;
    private Byte4 mExportVar_max_rand_sc4_sc4;
    public synchronized void set_max_rand_sc4_sc4(Byte4 v) {
        mExportVar_max_rand_sc4_sc4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_max_rand_sc4_sc4, fp, __I8_4, __dimArr);
    }

    public Byte4 get_max_rand_sc4_sc4() {
        return mExportVar_max_rand_sc4_sc4;
    }

    public Script.FieldID getFieldID_max_rand_sc4_sc4() {
        return createFieldID(mExportVarIdx_max_rand_sc4_sc4, null);
    }

    private final static int mExportVarIdx_max_rand_uc1_uc1 = 122;
    private short mExportVar_max_rand_uc1_uc1;
    public synchronized void set_max_rand_uc1_uc1(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_max_rand_uc1_uc1, __rs_fp_U8);
        mExportVar_max_rand_uc1_uc1 = v;
    }

    public short get_max_rand_uc1_uc1() {
        return mExportVar_max_rand_uc1_uc1;
    }

    public Script.FieldID getFieldID_max_rand_uc1_uc1() {
        return createFieldID(mExportVarIdx_max_rand_uc1_uc1, null);
    }

    private final static int mExportVarIdx_max_rand_uc2_uc2 = 123;
    private Short2 mExportVar_max_rand_uc2_uc2;
    public synchronized void set_max_rand_uc2_uc2(Short2 v) {
        mExportVar_max_rand_uc2_uc2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_max_rand_uc2_uc2, fp, __U8_2, __dimArr);
    }

    public Short2 get_max_rand_uc2_uc2() {
        return mExportVar_max_rand_uc2_uc2;
    }

    public Script.FieldID getFieldID_max_rand_uc2_uc2() {
        return createFieldID(mExportVarIdx_max_rand_uc2_uc2, null);
    }

    private final static int mExportVarIdx_max_rand_uc3_uc3 = 124;
    private Short3 mExportVar_max_rand_uc3_uc3;
    public synchronized void set_max_rand_uc3_uc3(Short3 v) {
        mExportVar_max_rand_uc3_uc3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_max_rand_uc3_uc3, fp, __U8_3, __dimArr);
    }

    public Short3 get_max_rand_uc3_uc3() {
        return mExportVar_max_rand_uc3_uc3;
    }

    public Script.FieldID getFieldID_max_rand_uc3_uc3() {
        return createFieldID(mExportVarIdx_max_rand_uc3_uc3, null);
    }

    private final static int mExportVarIdx_max_rand_uc4_uc4 = 125;
    private Short4 mExportVar_max_rand_uc4_uc4;
    public synchronized void set_max_rand_uc4_uc4(Short4 v) {
        mExportVar_max_rand_uc4_uc4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_max_rand_uc4_uc4, fp, __U8_4, __dimArr);
    }

    public Short4 get_max_rand_uc4_uc4() {
        return mExportVar_max_rand_uc4_uc4;
    }

    public Script.FieldID getFieldID_max_rand_uc4_uc4() {
        return createFieldID(mExportVarIdx_max_rand_uc4_uc4, null);
    }

    private final static int mExportVarIdx_max_rand_ss1_ss1 = 126;
    private short mExportVar_max_rand_ss1_ss1;
    public synchronized void set_max_rand_ss1_ss1(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_max_rand_ss1_ss1, __rs_fp_I16);
        mExportVar_max_rand_ss1_ss1 = v;
    }

    public short get_max_rand_ss1_ss1() {
        return mExportVar_max_rand_ss1_ss1;
    }

    public Script.FieldID getFieldID_max_rand_ss1_ss1() {
        return createFieldID(mExportVarIdx_max_rand_ss1_ss1, null);
    }

    private final static int mExportVarIdx_max_rand_ss2_ss2 = 127;
    private Short2 mExportVar_max_rand_ss2_ss2;
    public synchronized void set_max_rand_ss2_ss2(Short2 v) {
        mExportVar_max_rand_ss2_ss2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_max_rand_ss2_ss2, fp, __I16_2, __dimArr);
    }

    public Short2 get_max_rand_ss2_ss2() {
        return mExportVar_max_rand_ss2_ss2;
    }

    public Script.FieldID getFieldID_max_rand_ss2_ss2() {
        return createFieldID(mExportVarIdx_max_rand_ss2_ss2, null);
    }

    private final static int mExportVarIdx_max_rand_ss3_ss3 = 128;
    private Short3 mExportVar_max_rand_ss3_ss3;
    public synchronized void set_max_rand_ss3_ss3(Short3 v) {
        mExportVar_max_rand_ss3_ss3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_max_rand_ss3_ss3, fp, __I16_3, __dimArr);
    }

    public Short3 get_max_rand_ss3_ss3() {
        return mExportVar_max_rand_ss3_ss3;
    }

    public Script.FieldID getFieldID_max_rand_ss3_ss3() {
        return createFieldID(mExportVarIdx_max_rand_ss3_ss3, null);
    }

    private final static int mExportVarIdx_max_rand_ss4_ss4 = 129;
    private Short4 mExportVar_max_rand_ss4_ss4;
    public synchronized void set_max_rand_ss4_ss4(Short4 v) {
        mExportVar_max_rand_ss4_ss4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_max_rand_ss4_ss4, fp, __I16_4, __dimArr);
    }

    public Short4 get_max_rand_ss4_ss4() {
        return mExportVar_max_rand_ss4_ss4;
    }

    public Script.FieldID getFieldID_max_rand_ss4_ss4() {
        return createFieldID(mExportVarIdx_max_rand_ss4_ss4, null);
    }

    private final static int mExportVarIdx_max_rand_us1_us1 = 130;
    private int mExportVar_max_rand_us1_us1;
    public synchronized void set_max_rand_us1_us1(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_max_rand_us1_us1, __rs_fp_U16);
        mExportVar_max_rand_us1_us1 = v;
    }

    public int get_max_rand_us1_us1() {
        return mExportVar_max_rand_us1_us1;
    }

    public Script.FieldID getFieldID_max_rand_us1_us1() {
        return createFieldID(mExportVarIdx_max_rand_us1_us1, null);
    }

    private final static int mExportVarIdx_max_rand_us2_us2 = 131;
    private Int2 mExportVar_max_rand_us2_us2;
    public synchronized void set_max_rand_us2_us2(Int2 v) {
        mExportVar_max_rand_us2_us2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_max_rand_us2_us2, fp, __U16_2, __dimArr);
    }

    public Int2 get_max_rand_us2_us2() {
        return mExportVar_max_rand_us2_us2;
    }

    public Script.FieldID getFieldID_max_rand_us2_us2() {
        return createFieldID(mExportVarIdx_max_rand_us2_us2, null);
    }

    private final static int mExportVarIdx_max_rand_us3_us3 = 132;
    private Int3 mExportVar_max_rand_us3_us3;
    public synchronized void set_max_rand_us3_us3(Int3 v) {
        mExportVar_max_rand_us3_us3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_max_rand_us3_us3, fp, __U16_3, __dimArr);
    }

    public Int3 get_max_rand_us3_us3() {
        return mExportVar_max_rand_us3_us3;
    }

    public Script.FieldID getFieldID_max_rand_us3_us3() {
        return createFieldID(mExportVarIdx_max_rand_us3_us3, null);
    }

    private final static int mExportVarIdx_max_rand_us4_us4 = 133;
    private Int4 mExportVar_max_rand_us4_us4;
    public synchronized void set_max_rand_us4_us4(Int4 v) {
        mExportVar_max_rand_us4_us4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_max_rand_us4_us4, fp, __U16_4, __dimArr);
    }

    public Int4 get_max_rand_us4_us4() {
        return mExportVar_max_rand_us4_us4;
    }

    public Script.FieldID getFieldID_max_rand_us4_us4() {
        return createFieldID(mExportVarIdx_max_rand_us4_us4, null);
    }

    private final static int mExportVarIdx_max_rand_si1_si1 = 134;
    private int mExportVar_max_rand_si1_si1;
    public synchronized void set_max_rand_si1_si1(int v) {
        setVar(mExportVarIdx_max_rand_si1_si1, v);
        mExportVar_max_rand_si1_si1 = v;
    }

    public int get_max_rand_si1_si1() {
        return mExportVar_max_rand_si1_si1;
    }

    public Script.FieldID getFieldID_max_rand_si1_si1() {
        return createFieldID(mExportVarIdx_max_rand_si1_si1, null);
    }

    private final static int mExportVarIdx_max_rand_si2_si2 = 135;
    private Int2 mExportVar_max_rand_si2_si2;
    public synchronized void set_max_rand_si2_si2(Int2 v) {
        mExportVar_max_rand_si2_si2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_si2_si2, fp, __I32_2, __dimArr);
    }

    public Int2 get_max_rand_si2_si2() {
        return mExportVar_max_rand_si2_si2;
    }

    public Script.FieldID getFieldID_max_rand_si2_si2() {
        return createFieldID(mExportVarIdx_max_rand_si2_si2, null);
    }

    private final static int mExportVarIdx_max_rand_si3_si3 = 136;
    private Int3 mExportVar_max_rand_si3_si3;
    public synchronized void set_max_rand_si3_si3(Int3 v) {
        mExportVar_max_rand_si3_si3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_si3_si3, fp, __I32_3, __dimArr);
    }

    public Int3 get_max_rand_si3_si3() {
        return mExportVar_max_rand_si3_si3;
    }

    public Script.FieldID getFieldID_max_rand_si3_si3() {
        return createFieldID(mExportVarIdx_max_rand_si3_si3, null);
    }

    private final static int mExportVarIdx_max_rand_si4_si4 = 137;
    private Int4 mExportVar_max_rand_si4_si4;
    public synchronized void set_max_rand_si4_si4(Int4 v) {
        mExportVar_max_rand_si4_si4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_si4_si4, fp, __I32_4, __dimArr);
    }

    public Int4 get_max_rand_si4_si4() {
        return mExportVar_max_rand_si4_si4;
    }

    public Script.FieldID getFieldID_max_rand_si4_si4() {
        return createFieldID(mExportVarIdx_max_rand_si4_si4, null);
    }

    private final static int mExportVarIdx_max_rand_ui1_ui1 = 138;
    private long mExportVar_max_rand_ui1_ui1;
    public synchronized void set_max_rand_ui1_ui1(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_max_rand_ui1_ui1, __rs_fp_U32);
        mExportVar_max_rand_ui1_ui1 = v;
    }

    public long get_max_rand_ui1_ui1() {
        return mExportVar_max_rand_ui1_ui1;
    }

    public Script.FieldID getFieldID_max_rand_ui1_ui1() {
        return createFieldID(mExportVarIdx_max_rand_ui1_ui1, null);
    }

    private final static int mExportVarIdx_max_rand_ui2_ui2 = 139;
    private Long2 mExportVar_max_rand_ui2_ui2;
    public synchronized void set_max_rand_ui2_ui2(Long2 v) {
        mExportVar_max_rand_ui2_ui2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_ui2_ui2, fp, __U32_2, __dimArr);
    }

    public Long2 get_max_rand_ui2_ui2() {
        return mExportVar_max_rand_ui2_ui2;
    }

    public Script.FieldID getFieldID_max_rand_ui2_ui2() {
        return createFieldID(mExportVarIdx_max_rand_ui2_ui2, null);
    }

    private final static int mExportVarIdx_max_rand_ui3_ui3 = 140;
    private Long3 mExportVar_max_rand_ui3_ui3;
    public synchronized void set_max_rand_ui3_ui3(Long3 v) {
        mExportVar_max_rand_ui3_ui3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_ui3_ui3, fp, __U32_3, __dimArr);
    }

    public Long3 get_max_rand_ui3_ui3() {
        return mExportVar_max_rand_ui3_ui3;
    }

    public Script.FieldID getFieldID_max_rand_ui3_ui3() {
        return createFieldID(mExportVarIdx_max_rand_ui3_ui3, null);
    }

    private final static int mExportVarIdx_max_rand_ui4_ui4 = 141;
    private Long4 mExportVar_max_rand_ui4_ui4;
    public synchronized void set_max_rand_ui4_ui4(Long4 v) {
        mExportVar_max_rand_ui4_ui4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_max_rand_ui4_ui4, fp, __U32_4, __dimArr);
    }

    public Long4 get_max_rand_ui4_ui4() {
        return mExportVar_max_rand_ui4_ui4;
    }

    public Script.FieldID getFieldID_max_rand_ui4_ui4() {
        return createFieldID(mExportVarIdx_max_rand_ui4_ui4, null);
    }

    private final static int mExportVarIdx_max_rand_sl1_sl1 = 142;
    private long mExportVar_max_rand_sl1_sl1;
    public synchronized void set_max_rand_sl1_sl1(long v) {
        setVar(mExportVarIdx_max_rand_sl1_sl1, v);
        mExportVar_max_rand_sl1_sl1 = v;
    }

    public long get_max_rand_sl1_sl1() {
        return mExportVar_max_rand_sl1_sl1;
    }

    public Script.FieldID getFieldID_max_rand_sl1_sl1() {
        return createFieldID(mExportVarIdx_max_rand_sl1_sl1, null);
    }

    private final static int mExportVarIdx_max_rand_sl2_sl2 = 143;
    private Long2 mExportVar_max_rand_sl2_sl2;
    public synchronized void set_max_rand_sl2_sl2(Long2 v) {
        mExportVar_max_rand_sl2_sl2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_max_rand_sl2_sl2, fp, __I64_2, __dimArr);
    }

    public Long2 get_max_rand_sl2_sl2() {
        return mExportVar_max_rand_sl2_sl2;
    }

    public Script.FieldID getFieldID_max_rand_sl2_sl2() {
        return createFieldID(mExportVarIdx_max_rand_sl2_sl2, null);
    }

    private final static int mExportVarIdx_max_rand_sl3_sl3 = 144;
    private Long3 mExportVar_max_rand_sl3_sl3;
    public synchronized void set_max_rand_sl3_sl3(Long3 v) {
        mExportVar_max_rand_sl3_sl3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_max_rand_sl3_sl3, fp, __I64_3, __dimArr);
    }

    public Long3 get_max_rand_sl3_sl3() {
        return mExportVar_max_rand_sl3_sl3;
    }

    public Script.FieldID getFieldID_max_rand_sl3_sl3() {
        return createFieldID(mExportVarIdx_max_rand_sl3_sl3, null);
    }

    private final static int mExportVarIdx_max_rand_sl4_sl4 = 145;
    private Long4 mExportVar_max_rand_sl4_sl4;
    public synchronized void set_max_rand_sl4_sl4(Long4 v) {
        mExportVar_max_rand_sl4_sl4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_max_rand_sl4_sl4, fp, __I64_4, __dimArr);
    }

    public Long4 get_max_rand_sl4_sl4() {
        return mExportVar_max_rand_sl4_sl4;
    }

    public Script.FieldID getFieldID_max_rand_sl4_sl4() {
        return createFieldID(mExportVarIdx_max_rand_sl4_sl4, null);
    }

    private final static int mExportVarIdx_max_rand_ul1_ul1 = 146;
    private long mExportVar_max_rand_ul1_ul1;
    public synchronized void set_max_rand_ul1_ul1(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_max_rand_ul1_ul1, __rs_fp_U64);
        mExportVar_max_rand_ul1_ul1 = v;
    }

    public long get_max_rand_ul1_ul1() {
        return mExportVar_max_rand_ul1_ul1;
    }

    public Script.FieldID getFieldID_max_rand_ul1_ul1() {
        return createFieldID(mExportVarIdx_max_rand_ul1_ul1, null);
    }

    private final static int mExportVarIdx_max_rand_ul2_ul2 = 147;
    private Long2 mExportVar_max_rand_ul2_ul2;
    public synchronized void set_max_rand_ul2_ul2(Long2 v) {
        mExportVar_max_rand_ul2_ul2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_max_rand_ul2_ul2, fp, __U64_2, __dimArr);
    }

    public Long2 get_max_rand_ul2_ul2() {
        return mExportVar_max_rand_ul2_ul2;
    }

    public Script.FieldID getFieldID_max_rand_ul2_ul2() {
        return createFieldID(mExportVarIdx_max_rand_ul2_ul2, null);
    }

    private final static int mExportVarIdx_max_rand_ul3_ul3 = 148;
    private Long3 mExportVar_max_rand_ul3_ul3;
    public synchronized void set_max_rand_ul3_ul3(Long3 v) {
        mExportVar_max_rand_ul3_ul3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_max_rand_ul3_ul3, fp, __U64_3, __dimArr);
    }

    public Long3 get_max_rand_ul3_ul3() {
        return mExportVar_max_rand_ul3_ul3;
    }

    public Script.FieldID getFieldID_max_rand_ul3_ul3() {
        return createFieldID(mExportVarIdx_max_rand_ul3_ul3, null);
    }

    private final static int mExportVarIdx_max_rand_ul4_ul4 = 149;
    private Long4 mExportVar_max_rand_ul4_ul4;
    public synchronized void set_max_rand_ul4_ul4(Long4 v) {
        mExportVar_max_rand_ul4_ul4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_max_rand_ul4_ul4, fp, __U64_4, __dimArr);
    }

    public Long4 get_max_rand_ul4_ul4() {
        return mExportVar_max_rand_ul4_ul4;
    }

    public Script.FieldID getFieldID_max_rand_ul4_ul4() {
        return createFieldID(mExportVarIdx_max_rand_ul4_ul4, null);
    }

    private final static int mExportVarIdx_fmin_rand_f1_f1 = 150;
    private float mExportVar_fmin_rand_f1_f1;
    public synchronized void set_fmin_rand_f1_f1(float v) {
        setVar(mExportVarIdx_fmin_rand_f1_f1, v);
        mExportVar_fmin_rand_f1_f1 = v;
    }

    public float get_fmin_rand_f1_f1() {
        return mExportVar_fmin_rand_f1_f1;
    }

    public Script.FieldID getFieldID_fmin_rand_f1_f1() {
        return createFieldID(mExportVarIdx_fmin_rand_f1_f1, null);
    }

    private final static int mExportVarIdx_fmin_rand_f2_f2 = 151;
    private Float2 mExportVar_fmin_rand_f2_f2;
    public synchronized void set_fmin_rand_f2_f2(Float2 v) {
        mExportVar_fmin_rand_f2_f2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmin_rand_f2_f2, fp, __F32_2, __dimArr);
    }

    public Float2 get_fmin_rand_f2_f2() {
        return mExportVar_fmin_rand_f2_f2;
    }

    public Script.FieldID getFieldID_fmin_rand_f2_f2() {
        return createFieldID(mExportVarIdx_fmin_rand_f2_f2, null);
    }

    private final static int mExportVarIdx_fmin_rand_f3_f3 = 152;
    private Float3 mExportVar_fmin_rand_f3_f3;
    public synchronized void set_fmin_rand_f3_f3(Float3 v) {
        mExportVar_fmin_rand_f3_f3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmin_rand_f3_f3, fp, __F32_3, __dimArr);
    }

    public Float3 get_fmin_rand_f3_f3() {
        return mExportVar_fmin_rand_f3_f3;
    }

    public Script.FieldID getFieldID_fmin_rand_f3_f3() {
        return createFieldID(mExportVarIdx_fmin_rand_f3_f3, null);
    }

    private final static int mExportVarIdx_fmin_rand_f4_f4 = 153;
    private Float4 mExportVar_fmin_rand_f4_f4;
    public synchronized void set_fmin_rand_f4_f4(Float4 v) {
        mExportVar_fmin_rand_f4_f4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmin_rand_f4_f4, fp, __F32_4, __dimArr);
    }

    public Float4 get_fmin_rand_f4_f4() {
        return mExportVar_fmin_rand_f4_f4;
    }

    public Script.FieldID getFieldID_fmin_rand_f4_f4() {
        return createFieldID(mExportVarIdx_fmin_rand_f4_f4, null);
    }

    private final static int mExportVarIdx_fmin_rand_f2_f1 = 154;
    private Float2 mExportVar_fmin_rand_f2_f1;
    public synchronized void set_fmin_rand_f2_f1(Float2 v) {
        mExportVar_fmin_rand_f2_f1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmin_rand_f2_f1, fp, __F32_2, __dimArr);
    }

    public Float2 get_fmin_rand_f2_f1() {
        return mExportVar_fmin_rand_f2_f1;
    }

    public Script.FieldID getFieldID_fmin_rand_f2_f1() {
        return createFieldID(mExportVarIdx_fmin_rand_f2_f1, null);
    }

    private final static int mExportVarIdx_fmin_rand_f3_f1 = 155;
    private Float3 mExportVar_fmin_rand_f3_f1;
    public synchronized void set_fmin_rand_f3_f1(Float3 v) {
        mExportVar_fmin_rand_f3_f1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmin_rand_f3_f1, fp, __F32_3, __dimArr);
    }

    public Float3 get_fmin_rand_f3_f1() {
        return mExportVar_fmin_rand_f3_f1;
    }

    public Script.FieldID getFieldID_fmin_rand_f3_f1() {
        return createFieldID(mExportVarIdx_fmin_rand_f3_f1, null);
    }

    private final static int mExportVarIdx_fmin_rand_f4_f1 = 156;
    private Float4 mExportVar_fmin_rand_f4_f1;
    public synchronized void set_fmin_rand_f4_f1(Float4 v) {
        mExportVar_fmin_rand_f4_f1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmin_rand_f4_f1, fp, __F32_4, __dimArr);
    }

    public Float4 get_fmin_rand_f4_f1() {
        return mExportVar_fmin_rand_f4_f1;
    }

    public Script.FieldID getFieldID_fmin_rand_f4_f1() {
        return createFieldID(mExportVarIdx_fmin_rand_f4_f1, null);
    }

    private final static int mExportVarIdx_fmax_rand_f1_f1 = 157;
    private float mExportVar_fmax_rand_f1_f1;
    public synchronized void set_fmax_rand_f1_f1(float v) {
        setVar(mExportVarIdx_fmax_rand_f1_f1, v);
        mExportVar_fmax_rand_f1_f1 = v;
    }

    public float get_fmax_rand_f1_f1() {
        return mExportVar_fmax_rand_f1_f1;
    }

    public Script.FieldID getFieldID_fmax_rand_f1_f1() {
        return createFieldID(mExportVarIdx_fmax_rand_f1_f1, null);
    }

    private final static int mExportVarIdx_fmax_rand_f2_f2 = 158;
    private Float2 mExportVar_fmax_rand_f2_f2;
    public synchronized void set_fmax_rand_f2_f2(Float2 v) {
        mExportVar_fmax_rand_f2_f2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmax_rand_f2_f2, fp, __F32_2, __dimArr);
    }

    public Float2 get_fmax_rand_f2_f2() {
        return mExportVar_fmax_rand_f2_f2;
    }

    public Script.FieldID getFieldID_fmax_rand_f2_f2() {
        return createFieldID(mExportVarIdx_fmax_rand_f2_f2, null);
    }

    private final static int mExportVarIdx_fmax_rand_f3_f3 = 159;
    private Float3 mExportVar_fmax_rand_f3_f3;
    public synchronized void set_fmax_rand_f3_f3(Float3 v) {
        mExportVar_fmax_rand_f3_f3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmax_rand_f3_f3, fp, __F32_3, __dimArr);
    }

    public Float3 get_fmax_rand_f3_f3() {
        return mExportVar_fmax_rand_f3_f3;
    }

    public Script.FieldID getFieldID_fmax_rand_f3_f3() {
        return createFieldID(mExportVarIdx_fmax_rand_f3_f3, null);
    }

    private final static int mExportVarIdx_fmax_rand_f4_f4 = 160;
    private Float4 mExportVar_fmax_rand_f4_f4;
    public synchronized void set_fmax_rand_f4_f4(Float4 v) {
        mExportVar_fmax_rand_f4_f4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmax_rand_f4_f4, fp, __F32_4, __dimArr);
    }

    public Float4 get_fmax_rand_f4_f4() {
        return mExportVar_fmax_rand_f4_f4;
    }

    public Script.FieldID getFieldID_fmax_rand_f4_f4() {
        return createFieldID(mExportVarIdx_fmax_rand_f4_f4, null);
    }

    private final static int mExportVarIdx_fmax_rand_f2_f1 = 161;
    private Float2 mExportVar_fmax_rand_f2_f1;
    public synchronized void set_fmax_rand_f2_f1(Float2 v) {
        mExportVar_fmax_rand_f2_f1 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmax_rand_f2_f1, fp, __F32_2, __dimArr);
    }

    public Float2 get_fmax_rand_f2_f1() {
        return mExportVar_fmax_rand_f2_f1;
    }

    public Script.FieldID getFieldID_fmax_rand_f2_f1() {
        return createFieldID(mExportVarIdx_fmax_rand_f2_f1, null);
    }

    private final static int mExportVarIdx_fmax_rand_f3_f1 = 162;
    private Float3 mExportVar_fmax_rand_f3_f1;
    public synchronized void set_fmax_rand_f3_f1(Float3 v) {
        mExportVar_fmax_rand_f3_f1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmax_rand_f3_f1, fp, __F32_3, __dimArr);
    }

    public Float3 get_fmax_rand_f3_f1() {
        return mExportVar_fmax_rand_f3_f1;
    }

    public Script.FieldID getFieldID_fmax_rand_f3_f1() {
        return createFieldID(mExportVarIdx_fmax_rand_f3_f1, null);
    }

    private final static int mExportVarIdx_fmax_rand_f4_f1 = 163;
    private Float4 mExportVar_fmax_rand_f4_f1;
    public synchronized void set_fmax_rand_f4_f1(Float4 v) {
        mExportVar_fmax_rand_f4_f1 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fmax_rand_f4_f1, fp, __F32_4, __dimArr);
    }

    public Float4 get_fmax_rand_f4_f1() {
        return mExportVar_fmax_rand_f4_f1;
    }

    public Script.FieldID getFieldID_fmax_rand_f4_f1() {
        return createFieldID(mExportVarIdx_fmax_rand_f4_f1, null);
    }

    private final static int mExportFuncIdx_math_agree_test = 0;
    public void invoke_math_agree_test() {
        invoke(mExportFuncIdx_math_agree_test);
    }

}

