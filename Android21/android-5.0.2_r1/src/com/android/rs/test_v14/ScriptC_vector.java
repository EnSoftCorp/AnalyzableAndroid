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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_14/src/com/android/rs/test/vector.rs
 */

package com.android.rs.test_v14;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_vector extends ScriptC {
    private static final String __rs_resource_name = "vector";
    // Constructor
    public  ScriptC_vector(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_vector(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_f2 = new Float2();
        mExportVar_f2.x = 1.f;
        mExportVar_f2.y = 2.f;
        mExportVar_f3 = new Float3();
        mExportVar_f3.x = 1.f;
        mExportVar_f3.y = 2.f;
        mExportVar_f3.z = 3.f;
        mExportVar_f4 = new Float4();
        mExportVar_f4.x = 1.f;
        mExportVar_f4.y = 2.f;
        mExportVar_f4.z = 3.f;
        mExportVar_f4.w = 4.f;
        mExportVar_d2 = new Double2();
        mExportVar_d2.x = 1;
        mExportVar_d2.y = 2;
        mExportVar_d3 = new Double3();
        mExportVar_d3.x = 1;
        mExportVar_d3.y = 2;
        mExportVar_d3.z = 3;
        mExportVar_d4 = new Double4();
        mExportVar_d4.x = 1;
        mExportVar_d4.y = 2;
        mExportVar_d4.z = 3;
        mExportVar_d4.w = 4;
        mExportVar_i8_2 = new Byte2();
        mExportVar_i8_2.x = 1;
        mExportVar_i8_2.y = 2;
        mExportVar_i8_3 = new Byte3();
        mExportVar_i8_3.x = 1;
        mExportVar_i8_3.y = 2;
        mExportVar_i8_3.z = 3;
        mExportVar_i8_4 = new Byte4();
        mExportVar_i8_4.x = 1;
        mExportVar_i8_4.y = 2;
        mExportVar_i8_4.z = 3;
        mExportVar_i8_4.w = 4;
        mExportVar_u8_2 = new Short2();
        mExportVar_u8_2.x = 1;
        mExportVar_u8_2.y = 2;
        mExportVar_u8_3 = new Short3();
        mExportVar_u8_3.x = 1;
        mExportVar_u8_3.y = 2;
        mExportVar_u8_3.z = 3;
        mExportVar_u8_4 = new Short4();
        mExportVar_u8_4.x = 1;
        mExportVar_u8_4.y = 2;
        mExportVar_u8_4.z = 3;
        mExportVar_u8_4.w = 4;
        mExportVar_i16_2 = new Short2();
        mExportVar_i16_2.x = 1;
        mExportVar_i16_2.y = 2;
        mExportVar_i16_3 = new Short3();
        mExportVar_i16_3.x = 1;
        mExportVar_i16_3.y = 2;
        mExportVar_i16_3.z = 3;
        mExportVar_i16_4 = new Short4();
        mExportVar_i16_4.x = 1;
        mExportVar_i16_4.y = 2;
        mExportVar_i16_4.z = 3;
        mExportVar_i16_4.w = 4;
        mExportVar_u16_2 = new Int2();
        mExportVar_u16_2.x = 1;
        mExportVar_u16_2.y = 2;
        mExportVar_u16_3 = new Int3();
        mExportVar_u16_3.x = 1;
        mExportVar_u16_3.y = 2;
        mExportVar_u16_3.z = 3;
        mExportVar_u16_4 = new Int4();
        mExportVar_u16_4.x = 1;
        mExportVar_u16_4.y = 2;
        mExportVar_u16_4.z = 3;
        mExportVar_u16_4.w = 4;
        mExportVar_i32_2 = new Int2();
        mExportVar_i32_2.x = 1;
        mExportVar_i32_2.y = 2;
        mExportVar_i32_3 = new Int3();
        mExportVar_i32_3.x = 1;
        mExportVar_i32_3.y = 2;
        mExportVar_i32_3.z = 3;
        mExportVar_i32_4 = new Int4();
        mExportVar_i32_4.x = 1;
        mExportVar_i32_4.y = 2;
        mExportVar_i32_4.z = 3;
        mExportVar_i32_4.w = 4;
        mExportVar_u32_2 = new Long2();
        mExportVar_u32_2.x = 1;
        mExportVar_u32_2.y = 2;
        mExportVar_u32_3 = new Long3();
        mExportVar_u32_3.x = 1;
        mExportVar_u32_3.y = 2;
        mExportVar_u32_3.z = 3;
        mExportVar_u32_4 = new Long4();
        mExportVar_u32_4.x = 1;
        mExportVar_u32_4.y = 2;
        mExportVar_u32_4.z = 3;
        mExportVar_u32_4.w = 4;
        mExportVar_i64_2 = new Long2();
        mExportVar_i64_2.x = 1L;
        mExportVar_i64_2.y = 2L;
        mExportVar_i64_3 = new Long3();
        mExportVar_i64_3.x = 1L;
        mExportVar_i64_3.y = 2L;
        mExportVar_i64_3.z = 3L;
        mExportVar_i64_4 = new Long4();
        mExportVar_i64_4.x = 1L;
        mExportVar_i64_4.y = 2L;
        mExportVar_i64_4.z = 3L;
        mExportVar_i64_4.w = 4L;
        mExportVar_u64_2 = new Long2();
        mExportVar_u64_2.x = 1L;
        mExportVar_u64_2.y = 2L;
        mExportVar_u64_3 = new Long3();
        mExportVar_u64_3.x = 1L;
        mExportVar_u64_3.y = 2L;
        mExportVar_u64_3.z = 3L;
        mExportVar_u64_4 = new Long4();
        mExportVar_u64_4.x = 1L;
        mExportVar_u64_4.y = 2L;
        mExportVar_u64_4.z = 3L;
        mExportVar_u64_4.w = 4L;
    }

    private FieldPacker __rs_fp_F32_2;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_F32_4;
    private FieldPacker __rs_fp_F64_2;
    private FieldPacker __rs_fp_F64_3;
    private FieldPacker __rs_fp_F64_4;
    private FieldPacker __rs_fp_I16_2;
    private FieldPacker __rs_fp_I16_3;
    private FieldPacker __rs_fp_I16_4;
    private FieldPacker __rs_fp_I32_2;
    private FieldPacker __rs_fp_I32_3;
    private FieldPacker __rs_fp_I32_4;
    private FieldPacker __rs_fp_I64_2;
    private FieldPacker __rs_fp_I64_3;
    private FieldPacker __rs_fp_I64_4;
    private FieldPacker __rs_fp_I8_2;
    private FieldPacker __rs_fp_I8_3;
    private FieldPacker __rs_fp_I8_4;
    private FieldPacker __rs_fp_U16_2;
    private FieldPacker __rs_fp_U16_3;
    private FieldPacker __rs_fp_U16_4;
    private FieldPacker __rs_fp_U32_2;
    private FieldPacker __rs_fp_U32_3;
    private FieldPacker __rs_fp_U32_4;
    private FieldPacker __rs_fp_U64_2;
    private FieldPacker __rs_fp_U64_3;
    private FieldPacker __rs_fp_U64_4;
    private FieldPacker __rs_fp_U8_2;
    private FieldPacker __rs_fp_U8_3;
    private FieldPacker __rs_fp_U8_4;
    private final static int mExportVarIdx_f2 = 0;
    private Float2 mExportVar_f2;
    public synchronized void set_f2(Float2 v) {
        mExportVar_f2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        setVar(mExportVarIdx_f2, fp);
    }

    public Float2 get_f2() {
        return mExportVar_f2;
    }

    private final static int mExportVarIdx_f3 = 1;
    private Float3 mExportVar_f3;
    public synchronized void set_f3(Float3 v) {
        mExportVar_f3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        setVar(mExportVarIdx_f3, fp);
    }

    public Float3 get_f3() {
        return mExportVar_f3;
    }

    private final static int mExportVarIdx_f4 = 2;
    private Float4 mExportVar_f4;
    public synchronized void set_f4(Float4 v) {
        mExportVar_f4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        setVar(mExportVarIdx_f4, fp);
    }

    public Float4 get_f4() {
        return mExportVar_f4;
    }

    private final static int mExportVarIdx_d2 = 3;
    private Double2 mExportVar_d2;
    public synchronized void set_d2(Double2 v) {
        mExportVar_d2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF64(v);
        setVar(mExportVarIdx_d2, fp);
    }

    public Double2 get_d2() {
        return mExportVar_d2;
    }

    private final static int mExportVarIdx_d3 = 4;
    private Double3 mExportVar_d3;
    public synchronized void set_d3(Double3 v) {
        mExportVar_d3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF64(v);
        setVar(mExportVarIdx_d3, fp);
    }

    public Double3 get_d3() {
        return mExportVar_d3;
    }

    private final static int mExportVarIdx_d4 = 5;
    private Double4 mExportVar_d4;
    public synchronized void set_d4(Double4 v) {
        mExportVar_d4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF64(v);
        setVar(mExportVarIdx_d4, fp);
    }

    public Double4 get_d4() {
        return mExportVar_d4;
    }

    private final static int mExportVarIdx_i8_2 = 6;
    private Byte2 mExportVar_i8_2;
    public synchronized void set_i8_2(Byte2 v) {
        mExportVar_i8_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        setVar(mExportVarIdx_i8_2, fp);
    }

    public Byte2 get_i8_2() {
        return mExportVar_i8_2;
    }

    private final static int mExportVarIdx_i8_3 = 7;
    private Byte3 mExportVar_i8_3;
    public synchronized void set_i8_3(Byte3 v) {
        mExportVar_i8_3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_i8_3, fp);
    }

    public Byte3 get_i8_3() {
        return mExportVar_i8_3;
    }

    private final static int mExportVarIdx_i8_4 = 8;
    private Byte4 mExportVar_i8_4;
    public synchronized void set_i8_4(Byte4 v) {
        mExportVar_i8_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_i8_4, fp);
    }

    public Byte4 get_i8_4() {
        return mExportVar_i8_4;
    }

    private final static int mExportVarIdx_u8_2 = 9;
    private Short2 mExportVar_u8_2;
    public synchronized void set_u8_2(Short2 v) {
        mExportVar_u8_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        setVar(mExportVarIdx_u8_2, fp);
    }

    public Short2 get_u8_2() {
        return mExportVar_u8_2;
    }

    private final static int mExportVarIdx_u8_3 = 10;
    private Short3 mExportVar_u8_3;
    public synchronized void set_u8_3(Short3 v) {
        mExportVar_u8_3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_u8_3, fp);
    }

    public Short3 get_u8_3() {
        return mExportVar_u8_3;
    }

    private final static int mExportVarIdx_u8_4 = 11;
    private Short4 mExportVar_u8_4;
    public synchronized void set_u8_4(Short4 v) {
        mExportVar_u8_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_u8_4, fp);
    }

    public Short4 get_u8_4() {
        return mExportVar_u8_4;
    }

    private final static int mExportVarIdx_i16_2 = 12;
    private Short2 mExportVar_i16_2;
    public synchronized void set_i16_2(Short2 v) {
        mExportVar_i16_2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        setVar(mExportVarIdx_i16_2, fp);
    }

    public Short2 get_i16_2() {
        return mExportVar_i16_2;
    }

    private final static int mExportVarIdx_i16_3 = 13;
    private Short3 mExportVar_i16_3;
    public synchronized void set_i16_3(Short3 v) {
        mExportVar_i16_3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_i16_3, fp);
    }

    public Short3 get_i16_3() {
        return mExportVar_i16_3;
    }

    private final static int mExportVarIdx_i16_4 = 14;
    private Short4 mExportVar_i16_4;
    public synchronized void set_i16_4(Short4 v) {
        mExportVar_i16_4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_i16_4, fp);
    }

    public Short4 get_i16_4() {
        return mExportVar_i16_4;
    }

    private final static int mExportVarIdx_u16_2 = 15;
    private Int2 mExportVar_u16_2;
    public synchronized void set_u16_2(Int2 v) {
        mExportVar_u16_2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        setVar(mExportVarIdx_u16_2, fp);
    }

    public Int2 get_u16_2() {
        return mExportVar_u16_2;
    }

    private final static int mExportVarIdx_u16_3 = 16;
    private Int3 mExportVar_u16_3;
    public synchronized void set_u16_3(Int3 v) {
        mExportVar_u16_3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_u16_3, fp);
    }

    public Int3 get_u16_3() {
        return mExportVar_u16_3;
    }

    private final static int mExportVarIdx_u16_4 = 17;
    private Int4 mExportVar_u16_4;
    public synchronized void set_u16_4(Int4 v) {
        mExportVar_u16_4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_u16_4, fp);
    }

    public Int4 get_u16_4() {
        return mExportVar_u16_4;
    }

    private final static int mExportVarIdx_i32_2 = 18;
    private Int2 mExportVar_i32_2;
    public synchronized void set_i32_2(Int2 v) {
        mExportVar_i32_2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        setVar(mExportVarIdx_i32_2, fp);
    }

    public Int2 get_i32_2() {
        return mExportVar_i32_2;
    }

    private final static int mExportVarIdx_i32_3 = 19;
    private Int3 mExportVar_i32_3;
    public synchronized void set_i32_3(Int3 v) {
        mExportVar_i32_3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_i32_3, fp);
    }

    public Int3 get_i32_3() {
        return mExportVar_i32_3;
    }

    private final static int mExportVarIdx_i32_4 = 20;
    private Int4 mExportVar_i32_4;
    public synchronized void set_i32_4(Int4 v) {
        mExportVar_i32_4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_i32_4, fp);
    }

    public Int4 get_i32_4() {
        return mExportVar_i32_4;
    }

    private final static int mExportVarIdx_u32_2 = 21;
    private Long2 mExportVar_u32_2;
    public synchronized void set_u32_2(Long2 v) {
        mExportVar_u32_2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        setVar(mExportVarIdx_u32_2, fp);
    }

    public Long2 get_u32_2() {
        return mExportVar_u32_2;
    }

    private final static int mExportVarIdx_u32_3 = 22;
    private Long3 mExportVar_u32_3;
    public synchronized void set_u32_3(Long3 v) {
        mExportVar_u32_3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_u32_3, fp);
    }

    public Long3 get_u32_3() {
        return mExportVar_u32_3;
    }

    private final static int mExportVarIdx_u32_4 = 23;
    private Long4 mExportVar_u32_4;
    public synchronized void set_u32_4(Long4 v) {
        mExportVar_u32_4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_u32_4, fp);
    }

    public Long4 get_u32_4() {
        return mExportVar_u32_4;
    }

    private final static int mExportVarIdx_i64_2 = 24;
    private Long2 mExportVar_i64_2;
    public synchronized void set_i64_2(Long2 v) {
        mExportVar_i64_2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI64(v);
        setVar(mExportVarIdx_i64_2, fp);
    }

    public Long2 get_i64_2() {
        return mExportVar_i64_2;
    }

    private final static int mExportVarIdx_i64_3 = 25;
    private Long3 mExportVar_i64_3;
    public synchronized void set_i64_3(Long3 v) {
        mExportVar_i64_3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        setVar(mExportVarIdx_i64_3, fp);
    }

    public Long3 get_i64_3() {
        return mExportVar_i64_3;
    }

    private final static int mExportVarIdx_i64_4 = 26;
    private Long4 mExportVar_i64_4;
    public synchronized void set_i64_4(Long4 v) {
        mExportVar_i64_4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        setVar(mExportVarIdx_i64_4, fp);
    }

    public Long4 get_i64_4() {
        return mExportVar_i64_4;
    }

    private final static int mExportVarIdx_u64_2 = 27;
    private Long2 mExportVar_u64_2;
    public synchronized void set_u64_2(Long2 v) {
        mExportVar_u64_2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU64(v);
        setVar(mExportVarIdx_u64_2, fp);
    }

    public Long2 get_u64_2() {
        return mExportVar_u64_2;
    }

    private final static int mExportVarIdx_u64_3 = 28;
    private Long3 mExportVar_u64_3;
    public synchronized void set_u64_3(Long3 v) {
        mExportVar_u64_3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        setVar(mExportVarIdx_u64_3, fp);
    }

    public Long3 get_u64_3() {
        return mExportVar_u64_3;
    }

    private final static int mExportVarIdx_u64_4 = 29;
    private Long4 mExportVar_u64_4;
    public synchronized void set_u64_4(Long4 v) {
        mExportVar_u64_4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        setVar(mExportVarIdx_u64_4, fp);
    }

    public Long4 get_u64_4() {
        return mExportVar_u64_4;
    }

    private final static int mExportFuncIdx_vector_test = 0;
    public void invoke_vector_test() {
        invoke(mExportFuncIdx_vector_test);
    }

}

