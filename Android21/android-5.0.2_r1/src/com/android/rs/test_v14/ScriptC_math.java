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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_14/src/com/android/rs/test/math.rs
 */

package com.android.rs.test_v14;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_math extends ScriptC {
    private static final String __rs_resource_name = "math";
    // Constructor
    public  ScriptC_math(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_math(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_res_c_1 = 1;
        mExportVar_res_c_2 = new Byte2();
        mExportVar_res_c_2.x = 1;
        mExportVar_res_c_2.y = 1;
        mExportVar_res_c_3 = new Byte3();
        mExportVar_res_c_3.x = 1;
        mExportVar_res_c_3.y = 1;
        mExportVar_res_c_3.z = 1;
        mExportVar_res_c_4 = new Byte4();
        mExportVar_res_c_4.x = 1;
        mExportVar_res_c_4.y = 1;
        mExportVar_res_c_4.z = 1;
        mExportVar_res_c_4.w = 1;
        mExportVar_res_uc_1 = 1;
        mExportVar_res_uc_2 = new Short2();
        mExportVar_res_uc_2.x = 1;
        mExportVar_res_uc_2.y = 1;
        mExportVar_res_uc_3 = new Short3();
        mExportVar_res_uc_3.x = 1;
        mExportVar_res_uc_3.y = 1;
        mExportVar_res_uc_3.z = 1;
        mExportVar_res_uc_4 = new Short4();
        mExportVar_res_uc_4.x = 1;
        mExportVar_res_uc_4.y = 1;
        mExportVar_res_uc_4.z = 1;
        mExportVar_res_uc_4.w = 1;
        mExportVar_res_s_1 = 1;
        mExportVar_res_s_2 = new Short2();
        mExportVar_res_s_2.x = 1;
        mExportVar_res_s_2.y = 1;
        mExportVar_res_s_3 = new Short3();
        mExportVar_res_s_3.x = 1;
        mExportVar_res_s_3.y = 1;
        mExportVar_res_s_3.z = 1;
        mExportVar_res_s_4 = new Short4();
        mExportVar_res_s_4.x = 1;
        mExportVar_res_s_4.y = 1;
        mExportVar_res_s_4.z = 1;
        mExportVar_res_s_4.w = 1;
        mExportVar_res_us_1 = 1;
        mExportVar_res_us_2 = new Int2();
        mExportVar_res_us_2.x = 1;
        mExportVar_res_us_2.y = 1;
        mExportVar_res_us_3 = new Int3();
        mExportVar_res_us_3.x = 1;
        mExportVar_res_us_3.y = 1;
        mExportVar_res_us_3.z = 1;
        mExportVar_res_us_4 = new Int4();
        mExportVar_res_us_4.x = 1;
        mExportVar_res_us_4.y = 1;
        mExportVar_res_us_4.z = 1;
        mExportVar_res_us_4.w = 1;
        mExportVar_res_i_1 = 1;
        mExportVar_res_i_2 = new Int2();
        mExportVar_res_i_2.x = 1;
        mExportVar_res_i_2.y = 1;
        mExportVar_res_i_3 = new Int3();
        mExportVar_res_i_3.x = 1;
        mExportVar_res_i_3.y = 1;
        mExportVar_res_i_3.z = 1;
        mExportVar_res_i_4 = new Int4();
        mExportVar_res_i_4.x = 1;
        mExportVar_res_i_4.y = 1;
        mExportVar_res_i_4.z = 1;
        mExportVar_res_i_4.w = 1;
        mExportVar_res_ui_1 = 1;
        mExportVar_res_ui_2 = new Long2();
        mExportVar_res_ui_2.x = 1;
        mExportVar_res_ui_2.y = 1;
        mExportVar_res_ui_3 = new Long3();
        mExportVar_res_ui_3.x = 1;
        mExportVar_res_ui_3.y = 1;
        mExportVar_res_ui_3.z = 1;
        mExportVar_res_ui_4 = new Long4();
        mExportVar_res_ui_4.x = 1;
        mExportVar_res_ui_4.y = 1;
        mExportVar_res_ui_4.z = 1;
        mExportVar_res_ui_4.w = 1;
        mExportVar_res_l_1 = 1L;
        mExportVar_res_ul_1 = 1L;
        mExportVar_src1_c_1 = 1;
        mExportVar_src1_c_2 = new Byte2();
        mExportVar_src1_c_2.x = 1;
        mExportVar_src1_c_2.y = 1;
        mExportVar_src1_c_3 = new Byte3();
        mExportVar_src1_c_3.x = 1;
        mExportVar_src1_c_3.y = 1;
        mExportVar_src1_c_3.z = 1;
        mExportVar_src1_c_4 = new Byte4();
        mExportVar_src1_c_4.x = 1;
        mExportVar_src1_c_4.y = 1;
        mExportVar_src1_c_4.z = 1;
        mExportVar_src1_c_4.w = 1;
        mExportVar_src1_uc_1 = 1;
        mExportVar_src1_uc_2 = new Short2();
        mExportVar_src1_uc_2.x = 1;
        mExportVar_src1_uc_2.y = 1;
        mExportVar_src1_uc_3 = new Short3();
        mExportVar_src1_uc_3.x = 1;
        mExportVar_src1_uc_3.y = 1;
        mExportVar_src1_uc_3.z = 1;
        mExportVar_src1_uc_4 = new Short4();
        mExportVar_src1_uc_4.x = 1;
        mExportVar_src1_uc_4.y = 1;
        mExportVar_src1_uc_4.z = 1;
        mExportVar_src1_uc_4.w = 1;
        mExportVar_src1_s_1 = 1;
        mExportVar_src1_s_2 = new Short2();
        mExportVar_src1_s_2.x = 1;
        mExportVar_src1_s_2.y = 1;
        mExportVar_src1_s_3 = new Short3();
        mExportVar_src1_s_3.x = 1;
        mExportVar_src1_s_3.y = 1;
        mExportVar_src1_s_3.z = 1;
        mExportVar_src1_s_4 = new Short4();
        mExportVar_src1_s_4.x = 1;
        mExportVar_src1_s_4.y = 1;
        mExportVar_src1_s_4.z = 1;
        mExportVar_src1_s_4.w = 1;
        mExportVar_src1_us_1 = 1;
        mExportVar_src1_us_2 = new Int2();
        mExportVar_src1_us_2.x = 1;
        mExportVar_src1_us_2.y = 1;
        mExportVar_src1_us_3 = new Int3();
        mExportVar_src1_us_3.x = 1;
        mExportVar_src1_us_3.y = 1;
        mExportVar_src1_us_3.z = 1;
        mExportVar_src1_us_4 = new Int4();
        mExportVar_src1_us_4.x = 1;
        mExportVar_src1_us_4.y = 1;
        mExportVar_src1_us_4.z = 1;
        mExportVar_src1_us_4.w = 1;
        mExportVar_src1_i_1 = 1;
        mExportVar_src1_i_2 = new Int2();
        mExportVar_src1_i_2.x = 1;
        mExportVar_src1_i_2.y = 1;
        mExportVar_src1_i_3 = new Int3();
        mExportVar_src1_i_3.x = 1;
        mExportVar_src1_i_3.y = 1;
        mExportVar_src1_i_3.z = 1;
        mExportVar_src1_i_4 = new Int4();
        mExportVar_src1_i_4.x = 1;
        mExportVar_src1_i_4.y = 1;
        mExportVar_src1_i_4.z = 1;
        mExportVar_src1_i_4.w = 1;
        mExportVar_src1_ui_1 = 1;
        mExportVar_src1_ui_2 = new Long2();
        mExportVar_src1_ui_2.x = 1;
        mExportVar_src1_ui_2.y = 1;
        mExportVar_src1_ui_3 = new Long3();
        mExportVar_src1_ui_3.x = 1;
        mExportVar_src1_ui_3.y = 1;
        mExportVar_src1_ui_3.z = 1;
        mExportVar_src1_ui_4 = new Long4();
        mExportVar_src1_ui_4.x = 1;
        mExportVar_src1_ui_4.y = 1;
        mExportVar_src1_ui_4.z = 1;
        mExportVar_src1_ui_4.w = 1;
        mExportVar_src1_l_1 = 1L;
        mExportVar_src1_ul_1 = 1L;
        mExportVar_src2_c_1 = 1;
        mExportVar_src2_c_2 = new Byte2();
        mExportVar_src2_c_2.x = 1;
        mExportVar_src2_c_2.y = 1;
        mExportVar_src2_c_3 = new Byte3();
        mExportVar_src2_c_3.x = 1;
        mExportVar_src2_c_3.y = 1;
        mExportVar_src2_c_3.z = 1;
        mExportVar_src2_c_4 = new Byte4();
        mExportVar_src2_c_4.x = 1;
        mExportVar_src2_c_4.y = 1;
        mExportVar_src2_c_4.z = 1;
        mExportVar_src2_c_4.w = 1;
        mExportVar_src2_uc_1 = 1;
        mExportVar_src2_uc_2 = new Short2();
        mExportVar_src2_uc_2.x = 1;
        mExportVar_src2_uc_2.y = 1;
        mExportVar_src2_uc_3 = new Short3();
        mExportVar_src2_uc_3.x = 1;
        mExportVar_src2_uc_3.y = 1;
        mExportVar_src2_uc_3.z = 1;
        mExportVar_src2_uc_4 = new Short4();
        mExportVar_src2_uc_4.x = 1;
        mExportVar_src2_uc_4.y = 1;
        mExportVar_src2_uc_4.z = 1;
        mExportVar_src2_uc_4.w = 1;
        mExportVar_src2_s_1 = 1;
        mExportVar_src2_s_2 = new Short2();
        mExportVar_src2_s_2.x = 1;
        mExportVar_src2_s_2.y = 1;
        mExportVar_src2_s_3 = new Short3();
        mExportVar_src2_s_3.x = 1;
        mExportVar_src2_s_3.y = 1;
        mExportVar_src2_s_3.z = 1;
        mExportVar_src2_s_4 = new Short4();
        mExportVar_src2_s_4.x = 1;
        mExportVar_src2_s_4.y = 1;
        mExportVar_src2_s_4.z = 1;
        mExportVar_src2_s_4.w = 1;
        mExportVar_src2_us_1 = 1;
        mExportVar_src2_us_2 = new Int2();
        mExportVar_src2_us_2.x = 1;
        mExportVar_src2_us_2.y = 1;
        mExportVar_src2_us_3 = new Int3();
        mExportVar_src2_us_3.x = 1;
        mExportVar_src2_us_3.y = 1;
        mExportVar_src2_us_3.z = 1;
        mExportVar_src2_us_4 = new Int4();
        mExportVar_src2_us_4.x = 1;
        mExportVar_src2_us_4.y = 1;
        mExportVar_src2_us_4.z = 1;
        mExportVar_src2_us_4.w = 1;
        mExportVar_src2_i_1 = 1;
        mExportVar_src2_i_2 = new Int2();
        mExportVar_src2_i_2.x = 1;
        mExportVar_src2_i_2.y = 1;
        mExportVar_src2_i_3 = new Int3();
        mExportVar_src2_i_3.x = 1;
        mExportVar_src2_i_3.y = 1;
        mExportVar_src2_i_3.z = 1;
        mExportVar_src2_i_4 = new Int4();
        mExportVar_src2_i_4.x = 1;
        mExportVar_src2_i_4.y = 1;
        mExportVar_src2_i_4.z = 1;
        mExportVar_src2_i_4.w = 1;
        mExportVar_src2_ui_1 = 1;
        mExportVar_src2_ui_2 = new Long2();
        mExportVar_src2_ui_2.x = 1;
        mExportVar_src2_ui_2.y = 1;
        mExportVar_src2_ui_3 = new Long3();
        mExportVar_src2_ui_3.x = 1;
        mExportVar_src2_ui_3.y = 1;
        mExportVar_src2_ui_3.z = 1;
        mExportVar_src2_ui_4 = new Long4();
        mExportVar_src2_ui_4.x = 1;
        mExportVar_src2_ui_4.y = 1;
        mExportVar_src2_ui_4.z = 1;
        mExportVar_src2_ui_4.w = 1;
        mExportVar_src2_l_1 = 1L;
        mExportVar_src2_ul_1 = 1L;
    }

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
    private FieldPacker __rs_fp_U8;
    private FieldPacker __rs_fp_U8_2;
    private FieldPacker __rs_fp_U8_3;
    private FieldPacker __rs_fp_U8_4;
    private final static int mExportVarIdx_f1 = 0;
    private float mExportVar_f1;
    public synchronized void set_f1(float v) {
        setVar(mExportVarIdx_f1, v);
        mExportVar_f1 = v;
    }

    public float get_f1() {
        return mExportVar_f1;
    }

    private final static int mExportVarIdx_f2 = 1;
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

    private final static int mExportVarIdx_f3 = 2;
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

    private final static int mExportVarIdx_f4 = 3;
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

    private final static int mExportVarIdx_i1 = 4;
    private int mExportVar_i1;
    public synchronized void set_i1(int v) {
        setVar(mExportVarIdx_i1, v);
        mExportVar_i1 = v;
    }

    public int get_i1() {
        return mExportVar_i1;
    }

    private final static int mExportVarIdx_i2 = 5;
    private Int2 mExportVar_i2;
    public synchronized void set_i2(Int2 v) {
        mExportVar_i2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        setVar(mExportVarIdx_i2, fp);
    }

    public Int2 get_i2() {
        return mExportVar_i2;
    }

    private final static int mExportVarIdx_i3 = 6;
    private Int3 mExportVar_i3;
    public synchronized void set_i3(Int3 v) {
        mExportVar_i3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_i3, fp);
    }

    public Int3 get_i3() {
        return mExportVar_i3;
    }

    private final static int mExportVarIdx_i4 = 7;
    private Int4 mExportVar_i4;
    public synchronized void set_i4(Int4 v) {
        mExportVar_i4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_i4, fp);
    }

    public Int4 get_i4() {
        return mExportVar_i4;
    }

    private final static int mExportVarIdx_ui1 = 8;
    private long mExportVar_ui1;
    public synchronized void set_ui1(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_ui1, __rs_fp_U32);
        mExportVar_ui1 = v;
    }

    public long get_ui1() {
        return mExportVar_ui1;
    }

    private final static int mExportVarIdx_ui2 = 9;
    private Long2 mExportVar_ui2;
    public synchronized void set_ui2(Long2 v) {
        mExportVar_ui2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        setVar(mExportVarIdx_ui2, fp);
    }

    public Long2 get_ui2() {
        return mExportVar_ui2;
    }

    private final static int mExportVarIdx_ui3 = 10;
    private Long3 mExportVar_ui3;
    public synchronized void set_ui3(Long3 v) {
        mExportVar_ui3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_ui3, fp);
    }

    public Long3 get_ui3() {
        return mExportVar_ui3;
    }

    private final static int mExportVarIdx_ui4 = 11;
    private Long4 mExportVar_ui4;
    public synchronized void set_ui4(Long4 v) {
        mExportVar_ui4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_ui4, fp);
    }

    public Long4 get_ui4() {
        return mExportVar_ui4;
    }

    private final static int mExportVarIdx_s1 = 12;
    private short mExportVar_s1;
    public synchronized void set_s1(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_s1, __rs_fp_I16);
        mExportVar_s1 = v;
    }

    public short get_s1() {
        return mExportVar_s1;
    }

    private final static int mExportVarIdx_s2 = 13;
    private Short2 mExportVar_s2;
    public synchronized void set_s2(Short2 v) {
        mExportVar_s2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        setVar(mExportVarIdx_s2, fp);
    }

    public Short2 get_s2() {
        return mExportVar_s2;
    }

    private final static int mExportVarIdx_s3 = 14;
    private Short3 mExportVar_s3;
    public synchronized void set_s3(Short3 v) {
        mExportVar_s3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_s3, fp);
    }

    public Short3 get_s3() {
        return mExportVar_s3;
    }

    private final static int mExportVarIdx_s4 = 15;
    private Short4 mExportVar_s4;
    public synchronized void set_s4(Short4 v) {
        mExportVar_s4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_s4, fp);
    }

    public Short4 get_s4() {
        return mExportVar_s4;
    }

    private final static int mExportVarIdx_us1 = 16;
    private int mExportVar_us1;
    public synchronized void set_us1(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_us1, __rs_fp_U16);
        mExportVar_us1 = v;
    }

    public int get_us1() {
        return mExportVar_us1;
    }

    private final static int mExportVarIdx_us2 = 17;
    private Int2 mExportVar_us2;
    public synchronized void set_us2(Int2 v) {
        mExportVar_us2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        setVar(mExportVarIdx_us2, fp);
    }

    public Int2 get_us2() {
        return mExportVar_us2;
    }

    private final static int mExportVarIdx_us3 = 18;
    private Int3 mExportVar_us3;
    public synchronized void set_us3(Int3 v) {
        mExportVar_us3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_us3, fp);
    }

    public Int3 get_us3() {
        return mExportVar_us3;
    }

    private final static int mExportVarIdx_us4 = 19;
    private Int4 mExportVar_us4;
    public synchronized void set_us4(Int4 v) {
        mExportVar_us4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_us4, fp);
    }

    public Int4 get_us4() {
        return mExportVar_us4;
    }

    private final static int mExportVarIdx_c1 = 20;
    private byte mExportVar_c1;
    public synchronized void set_c1(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_c1, __rs_fp_I8);
        mExportVar_c1 = v;
    }

    public byte get_c1() {
        return mExportVar_c1;
    }

    private final static int mExportVarIdx_c2 = 21;
    private Byte2 mExportVar_c2;
    public synchronized void set_c2(Byte2 v) {
        mExportVar_c2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        setVar(mExportVarIdx_c2, fp);
    }

    public Byte2 get_c2() {
        return mExportVar_c2;
    }

    private final static int mExportVarIdx_c3 = 22;
    private Byte3 mExportVar_c3;
    public synchronized void set_c3(Byte3 v) {
        mExportVar_c3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_c3, fp);
    }

    public Byte3 get_c3() {
        return mExportVar_c3;
    }

    private final static int mExportVarIdx_c4 = 23;
    private Byte4 mExportVar_c4;
    public synchronized void set_c4(Byte4 v) {
        mExportVar_c4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_c4, fp);
    }

    public Byte4 get_c4() {
        return mExportVar_c4;
    }

    private final static int mExportVarIdx_uc1 = 24;
    private short mExportVar_uc1;
    public synchronized void set_uc1(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_uc1, __rs_fp_U8);
        mExportVar_uc1 = v;
    }

    public short get_uc1() {
        return mExportVar_uc1;
    }

    private final static int mExportVarIdx_uc2 = 25;
    private Short2 mExportVar_uc2;
    public synchronized void set_uc2(Short2 v) {
        mExportVar_uc2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        setVar(mExportVarIdx_uc2, fp);
    }

    public Short2 get_uc2() {
        return mExportVar_uc2;
    }

    private final static int mExportVarIdx_uc3 = 26;
    private Short3 mExportVar_uc3;
    public synchronized void set_uc3(Short3 v) {
        mExportVar_uc3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_uc3, fp);
    }

    public Short3 get_uc3() {
        return mExportVar_uc3;
    }

    private final static int mExportVarIdx_uc4 = 27;
    private Short4 mExportVar_uc4;
    public synchronized void set_uc4(Short4 v) {
        mExportVar_uc4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_uc4, fp);
    }

    public Short4 get_uc4() {
        return mExportVar_uc4;
    }

    private final static int mExportVarIdx_res_c_1 = 28;
    private byte mExportVar_res_c_1;
    public synchronized void set_res_c_1(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_res_c_1, __rs_fp_I8);
        mExportVar_res_c_1 = v;
    }

    public byte get_res_c_1() {
        return mExportVar_res_c_1;
    }

    private final static int mExportVarIdx_res_c_2 = 29;
    private Byte2 mExportVar_res_c_2;
    public synchronized void set_res_c_2(Byte2 v) {
        mExportVar_res_c_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        setVar(mExportVarIdx_res_c_2, fp);
    }

    public Byte2 get_res_c_2() {
        return mExportVar_res_c_2;
    }

    private final static int mExportVarIdx_res_c_3 = 30;
    private Byte3 mExportVar_res_c_3;
    public synchronized void set_res_c_3(Byte3 v) {
        mExportVar_res_c_3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_res_c_3, fp);
    }

    public Byte3 get_res_c_3() {
        return mExportVar_res_c_3;
    }

    private final static int mExportVarIdx_res_c_4 = 31;
    private Byte4 mExportVar_res_c_4;
    public synchronized void set_res_c_4(Byte4 v) {
        mExportVar_res_c_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_res_c_4, fp);
    }

    public Byte4 get_res_c_4() {
        return mExportVar_res_c_4;
    }

    private final static int mExportVarIdx_res_uc_1 = 32;
    private short mExportVar_res_uc_1;
    public synchronized void set_res_uc_1(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_res_uc_1, __rs_fp_U8);
        mExportVar_res_uc_1 = v;
    }

    public short get_res_uc_1() {
        return mExportVar_res_uc_1;
    }

    private final static int mExportVarIdx_res_uc_2 = 33;
    private Short2 mExportVar_res_uc_2;
    public synchronized void set_res_uc_2(Short2 v) {
        mExportVar_res_uc_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        setVar(mExportVarIdx_res_uc_2, fp);
    }

    public Short2 get_res_uc_2() {
        return mExportVar_res_uc_2;
    }

    private final static int mExportVarIdx_res_uc_3 = 34;
    private Short3 mExportVar_res_uc_3;
    public synchronized void set_res_uc_3(Short3 v) {
        mExportVar_res_uc_3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_res_uc_3, fp);
    }

    public Short3 get_res_uc_3() {
        return mExportVar_res_uc_3;
    }

    private final static int mExportVarIdx_res_uc_4 = 35;
    private Short4 mExportVar_res_uc_4;
    public synchronized void set_res_uc_4(Short4 v) {
        mExportVar_res_uc_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_res_uc_4, fp);
    }

    public Short4 get_res_uc_4() {
        return mExportVar_res_uc_4;
    }

    private final static int mExportVarIdx_res_s_1 = 36;
    private short mExportVar_res_s_1;
    public synchronized void set_res_s_1(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_res_s_1, __rs_fp_I16);
        mExportVar_res_s_1 = v;
    }

    public short get_res_s_1() {
        return mExportVar_res_s_1;
    }

    private final static int mExportVarIdx_res_s_2 = 37;
    private Short2 mExportVar_res_s_2;
    public synchronized void set_res_s_2(Short2 v) {
        mExportVar_res_s_2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        setVar(mExportVarIdx_res_s_2, fp);
    }

    public Short2 get_res_s_2() {
        return mExportVar_res_s_2;
    }

    private final static int mExportVarIdx_res_s_3 = 38;
    private Short3 mExportVar_res_s_3;
    public synchronized void set_res_s_3(Short3 v) {
        mExportVar_res_s_3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_res_s_3, fp);
    }

    public Short3 get_res_s_3() {
        return mExportVar_res_s_3;
    }

    private final static int mExportVarIdx_res_s_4 = 39;
    private Short4 mExportVar_res_s_4;
    public synchronized void set_res_s_4(Short4 v) {
        mExportVar_res_s_4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_res_s_4, fp);
    }

    public Short4 get_res_s_4() {
        return mExportVar_res_s_4;
    }

    private final static int mExportVarIdx_res_us_1 = 40;
    private int mExportVar_res_us_1;
    public synchronized void set_res_us_1(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_res_us_1, __rs_fp_U16);
        mExportVar_res_us_1 = v;
    }

    public int get_res_us_1() {
        return mExportVar_res_us_1;
    }

    private final static int mExportVarIdx_res_us_2 = 41;
    private Int2 mExportVar_res_us_2;
    public synchronized void set_res_us_2(Int2 v) {
        mExportVar_res_us_2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        setVar(mExportVarIdx_res_us_2, fp);
    }

    public Int2 get_res_us_2() {
        return mExportVar_res_us_2;
    }

    private final static int mExportVarIdx_res_us_3 = 42;
    private Int3 mExportVar_res_us_3;
    public synchronized void set_res_us_3(Int3 v) {
        mExportVar_res_us_3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_res_us_3, fp);
    }

    public Int3 get_res_us_3() {
        return mExportVar_res_us_3;
    }

    private final static int mExportVarIdx_res_us_4 = 43;
    private Int4 mExportVar_res_us_4;
    public synchronized void set_res_us_4(Int4 v) {
        mExportVar_res_us_4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_res_us_4, fp);
    }

    public Int4 get_res_us_4() {
        return mExportVar_res_us_4;
    }

    private final static int mExportVarIdx_res_i_1 = 44;
    private int mExportVar_res_i_1;
    public synchronized void set_res_i_1(int v) {
        setVar(mExportVarIdx_res_i_1, v);
        mExportVar_res_i_1 = v;
    }

    public int get_res_i_1() {
        return mExportVar_res_i_1;
    }

    private final static int mExportVarIdx_res_i_2 = 45;
    private Int2 mExportVar_res_i_2;
    public synchronized void set_res_i_2(Int2 v) {
        mExportVar_res_i_2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        setVar(mExportVarIdx_res_i_2, fp);
    }

    public Int2 get_res_i_2() {
        return mExportVar_res_i_2;
    }

    private final static int mExportVarIdx_res_i_3 = 46;
    private Int3 mExportVar_res_i_3;
    public synchronized void set_res_i_3(Int3 v) {
        mExportVar_res_i_3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_res_i_3, fp);
    }

    public Int3 get_res_i_3() {
        return mExportVar_res_i_3;
    }

    private final static int mExportVarIdx_res_i_4 = 47;
    private Int4 mExportVar_res_i_4;
    public synchronized void set_res_i_4(Int4 v) {
        mExportVar_res_i_4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_res_i_4, fp);
    }

    public Int4 get_res_i_4() {
        return mExportVar_res_i_4;
    }

    private final static int mExportVarIdx_res_ui_1 = 48;
    private long mExportVar_res_ui_1;
    public synchronized void set_res_ui_1(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_res_ui_1, __rs_fp_U32);
        mExportVar_res_ui_1 = v;
    }

    public long get_res_ui_1() {
        return mExportVar_res_ui_1;
    }

    private final static int mExportVarIdx_res_ui_2 = 49;
    private Long2 mExportVar_res_ui_2;
    public synchronized void set_res_ui_2(Long2 v) {
        mExportVar_res_ui_2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        setVar(mExportVarIdx_res_ui_2, fp);
    }

    public Long2 get_res_ui_2() {
        return mExportVar_res_ui_2;
    }

    private final static int mExportVarIdx_res_ui_3 = 50;
    private Long3 mExportVar_res_ui_3;
    public synchronized void set_res_ui_3(Long3 v) {
        mExportVar_res_ui_3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_res_ui_3, fp);
    }

    public Long3 get_res_ui_3() {
        return mExportVar_res_ui_3;
    }

    private final static int mExportVarIdx_res_ui_4 = 51;
    private Long4 mExportVar_res_ui_4;
    public synchronized void set_res_ui_4(Long4 v) {
        mExportVar_res_ui_4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_res_ui_4, fp);
    }

    public Long4 get_res_ui_4() {
        return mExportVar_res_ui_4;
    }

    private final static int mExportVarIdx_res_l_1 = 52;
    private long mExportVar_res_l_1;
    public synchronized void set_res_l_1(long v) {
        setVar(mExportVarIdx_res_l_1, v);
        mExportVar_res_l_1 = v;
    }

    public long get_res_l_1() {
        return mExportVar_res_l_1;
    }

    private final static int mExportVarIdx_res_ul_1 = 53;
    private long mExportVar_res_ul_1;
    public synchronized void set_res_ul_1(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_res_ul_1, __rs_fp_U64);
        mExportVar_res_ul_1 = v;
    }

    public long get_res_ul_1() {
        return mExportVar_res_ul_1;
    }

    private final static int mExportVarIdx_src1_c_1 = 54;
    private byte mExportVar_src1_c_1;
    public synchronized void set_src1_c_1(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_src1_c_1, __rs_fp_I8);
        mExportVar_src1_c_1 = v;
    }

    public byte get_src1_c_1() {
        return mExportVar_src1_c_1;
    }

    private final static int mExportVarIdx_src1_c_2 = 55;
    private Byte2 mExportVar_src1_c_2;
    public synchronized void set_src1_c_2(Byte2 v) {
        mExportVar_src1_c_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        setVar(mExportVarIdx_src1_c_2, fp);
    }

    public Byte2 get_src1_c_2() {
        return mExportVar_src1_c_2;
    }

    private final static int mExportVarIdx_src1_c_3 = 56;
    private Byte3 mExportVar_src1_c_3;
    public synchronized void set_src1_c_3(Byte3 v) {
        mExportVar_src1_c_3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_src1_c_3, fp);
    }

    public Byte3 get_src1_c_3() {
        return mExportVar_src1_c_3;
    }

    private final static int mExportVarIdx_src1_c_4 = 57;
    private Byte4 mExportVar_src1_c_4;
    public synchronized void set_src1_c_4(Byte4 v) {
        mExportVar_src1_c_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_src1_c_4, fp);
    }

    public Byte4 get_src1_c_4() {
        return mExportVar_src1_c_4;
    }

    private final static int mExportVarIdx_src1_uc_1 = 58;
    private short mExportVar_src1_uc_1;
    public synchronized void set_src1_uc_1(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_src1_uc_1, __rs_fp_U8);
        mExportVar_src1_uc_1 = v;
    }

    public short get_src1_uc_1() {
        return mExportVar_src1_uc_1;
    }

    private final static int mExportVarIdx_src1_uc_2 = 59;
    private Short2 mExportVar_src1_uc_2;
    public synchronized void set_src1_uc_2(Short2 v) {
        mExportVar_src1_uc_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        setVar(mExportVarIdx_src1_uc_2, fp);
    }

    public Short2 get_src1_uc_2() {
        return mExportVar_src1_uc_2;
    }

    private final static int mExportVarIdx_src1_uc_3 = 60;
    private Short3 mExportVar_src1_uc_3;
    public synchronized void set_src1_uc_3(Short3 v) {
        mExportVar_src1_uc_3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_src1_uc_3, fp);
    }

    public Short3 get_src1_uc_3() {
        return mExportVar_src1_uc_3;
    }

    private final static int mExportVarIdx_src1_uc_4 = 61;
    private Short4 mExportVar_src1_uc_4;
    public synchronized void set_src1_uc_4(Short4 v) {
        mExportVar_src1_uc_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_src1_uc_4, fp);
    }

    public Short4 get_src1_uc_4() {
        return mExportVar_src1_uc_4;
    }

    private final static int mExportVarIdx_src1_s_1 = 62;
    private short mExportVar_src1_s_1;
    public synchronized void set_src1_s_1(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_src1_s_1, __rs_fp_I16);
        mExportVar_src1_s_1 = v;
    }

    public short get_src1_s_1() {
        return mExportVar_src1_s_1;
    }

    private final static int mExportVarIdx_src1_s_2 = 63;
    private Short2 mExportVar_src1_s_2;
    public synchronized void set_src1_s_2(Short2 v) {
        mExportVar_src1_s_2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        setVar(mExportVarIdx_src1_s_2, fp);
    }

    public Short2 get_src1_s_2() {
        return mExportVar_src1_s_2;
    }

    private final static int mExportVarIdx_src1_s_3 = 64;
    private Short3 mExportVar_src1_s_3;
    public synchronized void set_src1_s_3(Short3 v) {
        mExportVar_src1_s_3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_src1_s_3, fp);
    }

    public Short3 get_src1_s_3() {
        return mExportVar_src1_s_3;
    }

    private final static int mExportVarIdx_src1_s_4 = 65;
    private Short4 mExportVar_src1_s_4;
    public synchronized void set_src1_s_4(Short4 v) {
        mExportVar_src1_s_4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_src1_s_4, fp);
    }

    public Short4 get_src1_s_4() {
        return mExportVar_src1_s_4;
    }

    private final static int mExportVarIdx_src1_us_1 = 66;
    private int mExportVar_src1_us_1;
    public synchronized void set_src1_us_1(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_src1_us_1, __rs_fp_U16);
        mExportVar_src1_us_1 = v;
    }

    public int get_src1_us_1() {
        return mExportVar_src1_us_1;
    }

    private final static int mExportVarIdx_src1_us_2 = 67;
    private Int2 mExportVar_src1_us_2;
    public synchronized void set_src1_us_2(Int2 v) {
        mExportVar_src1_us_2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        setVar(mExportVarIdx_src1_us_2, fp);
    }

    public Int2 get_src1_us_2() {
        return mExportVar_src1_us_2;
    }

    private final static int mExportVarIdx_src1_us_3 = 68;
    private Int3 mExportVar_src1_us_3;
    public synchronized void set_src1_us_3(Int3 v) {
        mExportVar_src1_us_3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_src1_us_3, fp);
    }

    public Int3 get_src1_us_3() {
        return mExportVar_src1_us_3;
    }

    private final static int mExportVarIdx_src1_us_4 = 69;
    private Int4 mExportVar_src1_us_4;
    public synchronized void set_src1_us_4(Int4 v) {
        mExportVar_src1_us_4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_src1_us_4, fp);
    }

    public Int4 get_src1_us_4() {
        return mExportVar_src1_us_4;
    }

    private final static int mExportVarIdx_src1_i_1 = 70;
    private int mExportVar_src1_i_1;
    public synchronized void set_src1_i_1(int v) {
        setVar(mExportVarIdx_src1_i_1, v);
        mExportVar_src1_i_1 = v;
    }

    public int get_src1_i_1() {
        return mExportVar_src1_i_1;
    }

    private final static int mExportVarIdx_src1_i_2 = 71;
    private Int2 mExportVar_src1_i_2;
    public synchronized void set_src1_i_2(Int2 v) {
        mExportVar_src1_i_2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        setVar(mExportVarIdx_src1_i_2, fp);
    }

    public Int2 get_src1_i_2() {
        return mExportVar_src1_i_2;
    }

    private final static int mExportVarIdx_src1_i_3 = 72;
    private Int3 mExportVar_src1_i_3;
    public synchronized void set_src1_i_3(Int3 v) {
        mExportVar_src1_i_3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_src1_i_3, fp);
    }

    public Int3 get_src1_i_3() {
        return mExportVar_src1_i_3;
    }

    private final static int mExportVarIdx_src1_i_4 = 73;
    private Int4 mExportVar_src1_i_4;
    public synchronized void set_src1_i_4(Int4 v) {
        mExportVar_src1_i_4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_src1_i_4, fp);
    }

    public Int4 get_src1_i_4() {
        return mExportVar_src1_i_4;
    }

    private final static int mExportVarIdx_src1_ui_1 = 74;
    private long mExportVar_src1_ui_1;
    public synchronized void set_src1_ui_1(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_src1_ui_1, __rs_fp_U32);
        mExportVar_src1_ui_1 = v;
    }

    public long get_src1_ui_1() {
        return mExportVar_src1_ui_1;
    }

    private final static int mExportVarIdx_src1_ui_2 = 75;
    private Long2 mExportVar_src1_ui_2;
    public synchronized void set_src1_ui_2(Long2 v) {
        mExportVar_src1_ui_2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        setVar(mExportVarIdx_src1_ui_2, fp);
    }

    public Long2 get_src1_ui_2() {
        return mExportVar_src1_ui_2;
    }

    private final static int mExportVarIdx_src1_ui_3 = 76;
    private Long3 mExportVar_src1_ui_3;
    public synchronized void set_src1_ui_3(Long3 v) {
        mExportVar_src1_ui_3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_src1_ui_3, fp);
    }

    public Long3 get_src1_ui_3() {
        return mExportVar_src1_ui_3;
    }

    private final static int mExportVarIdx_src1_ui_4 = 77;
    private Long4 mExportVar_src1_ui_4;
    public synchronized void set_src1_ui_4(Long4 v) {
        mExportVar_src1_ui_4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_src1_ui_4, fp);
    }

    public Long4 get_src1_ui_4() {
        return mExportVar_src1_ui_4;
    }

    private final static int mExportVarIdx_src1_l_1 = 78;
    private long mExportVar_src1_l_1;
    public synchronized void set_src1_l_1(long v) {
        setVar(mExportVarIdx_src1_l_1, v);
        mExportVar_src1_l_1 = v;
    }

    public long get_src1_l_1() {
        return mExportVar_src1_l_1;
    }

    private final static int mExportVarIdx_src1_ul_1 = 79;
    private long mExportVar_src1_ul_1;
    public synchronized void set_src1_ul_1(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_src1_ul_1, __rs_fp_U64);
        mExportVar_src1_ul_1 = v;
    }

    public long get_src1_ul_1() {
        return mExportVar_src1_ul_1;
    }

    private final static int mExportVarIdx_src2_c_1 = 80;
    private byte mExportVar_src2_c_1;
    public synchronized void set_src2_c_1(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_src2_c_1, __rs_fp_I8);
        mExportVar_src2_c_1 = v;
    }

    public byte get_src2_c_1() {
        return mExportVar_src2_c_1;
    }

    private final static int mExportVarIdx_src2_c_2 = 81;
    private Byte2 mExportVar_src2_c_2;
    public synchronized void set_src2_c_2(Byte2 v) {
        mExportVar_src2_c_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        setVar(mExportVarIdx_src2_c_2, fp);
    }

    public Byte2 get_src2_c_2() {
        return mExportVar_src2_c_2;
    }

    private final static int mExportVarIdx_src2_c_3 = 82;
    private Byte3 mExportVar_src2_c_3;
    public synchronized void set_src2_c_3(Byte3 v) {
        mExportVar_src2_c_3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_src2_c_3, fp);
    }

    public Byte3 get_src2_c_3() {
        return mExportVar_src2_c_3;
    }

    private final static int mExportVarIdx_src2_c_4 = 83;
    private Byte4 mExportVar_src2_c_4;
    public synchronized void set_src2_c_4(Byte4 v) {
        mExportVar_src2_c_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        setVar(mExportVarIdx_src2_c_4, fp);
    }

    public Byte4 get_src2_c_4() {
        return mExportVar_src2_c_4;
    }

    private final static int mExportVarIdx_src2_uc_1 = 84;
    private short mExportVar_src2_uc_1;
    public synchronized void set_src2_uc_1(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_src2_uc_1, __rs_fp_U8);
        mExportVar_src2_uc_1 = v;
    }

    public short get_src2_uc_1() {
        return mExportVar_src2_uc_1;
    }

    private final static int mExportVarIdx_src2_uc_2 = 85;
    private Short2 mExportVar_src2_uc_2;
    public synchronized void set_src2_uc_2(Short2 v) {
        mExportVar_src2_uc_2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        setVar(mExportVarIdx_src2_uc_2, fp);
    }

    public Short2 get_src2_uc_2() {
        return mExportVar_src2_uc_2;
    }

    private final static int mExportVarIdx_src2_uc_3 = 86;
    private Short3 mExportVar_src2_uc_3;
    public synchronized void set_src2_uc_3(Short3 v) {
        mExportVar_src2_uc_3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_src2_uc_3, fp);
    }

    public Short3 get_src2_uc_3() {
        return mExportVar_src2_uc_3;
    }

    private final static int mExportVarIdx_src2_uc_4 = 87;
    private Short4 mExportVar_src2_uc_4;
    public synchronized void set_src2_uc_4(Short4 v) {
        mExportVar_src2_uc_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        setVar(mExportVarIdx_src2_uc_4, fp);
    }

    public Short4 get_src2_uc_4() {
        return mExportVar_src2_uc_4;
    }

    private final static int mExportVarIdx_src2_s_1 = 88;
    private short mExportVar_src2_s_1;
    public synchronized void set_src2_s_1(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_src2_s_1, __rs_fp_I16);
        mExportVar_src2_s_1 = v;
    }

    public short get_src2_s_1() {
        return mExportVar_src2_s_1;
    }

    private final static int mExportVarIdx_src2_s_2 = 89;
    private Short2 mExportVar_src2_s_2;
    public synchronized void set_src2_s_2(Short2 v) {
        mExportVar_src2_s_2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        setVar(mExportVarIdx_src2_s_2, fp);
    }

    public Short2 get_src2_s_2() {
        return mExportVar_src2_s_2;
    }

    private final static int mExportVarIdx_src2_s_3 = 90;
    private Short3 mExportVar_src2_s_3;
    public synchronized void set_src2_s_3(Short3 v) {
        mExportVar_src2_s_3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_src2_s_3, fp);
    }

    public Short3 get_src2_s_3() {
        return mExportVar_src2_s_3;
    }

    private final static int mExportVarIdx_src2_s_4 = 91;
    private Short4 mExportVar_src2_s_4;
    public synchronized void set_src2_s_4(Short4 v) {
        mExportVar_src2_s_4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        setVar(mExportVarIdx_src2_s_4, fp);
    }

    public Short4 get_src2_s_4() {
        return mExportVar_src2_s_4;
    }

    private final static int mExportVarIdx_src2_us_1 = 92;
    private int mExportVar_src2_us_1;
    public synchronized void set_src2_us_1(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_src2_us_1, __rs_fp_U16);
        mExportVar_src2_us_1 = v;
    }

    public int get_src2_us_1() {
        return mExportVar_src2_us_1;
    }

    private final static int mExportVarIdx_src2_us_2 = 93;
    private Int2 mExportVar_src2_us_2;
    public synchronized void set_src2_us_2(Int2 v) {
        mExportVar_src2_us_2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        setVar(mExportVarIdx_src2_us_2, fp);
    }

    public Int2 get_src2_us_2() {
        return mExportVar_src2_us_2;
    }

    private final static int mExportVarIdx_src2_us_3 = 94;
    private Int3 mExportVar_src2_us_3;
    public synchronized void set_src2_us_3(Int3 v) {
        mExportVar_src2_us_3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_src2_us_3, fp);
    }

    public Int3 get_src2_us_3() {
        return mExportVar_src2_us_3;
    }

    private final static int mExportVarIdx_src2_us_4 = 95;
    private Int4 mExportVar_src2_us_4;
    public synchronized void set_src2_us_4(Int4 v) {
        mExportVar_src2_us_4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        setVar(mExportVarIdx_src2_us_4, fp);
    }

    public Int4 get_src2_us_4() {
        return mExportVar_src2_us_4;
    }

    private final static int mExportVarIdx_src2_i_1 = 96;
    private int mExportVar_src2_i_1;
    public synchronized void set_src2_i_1(int v) {
        setVar(mExportVarIdx_src2_i_1, v);
        mExportVar_src2_i_1 = v;
    }

    public int get_src2_i_1() {
        return mExportVar_src2_i_1;
    }

    private final static int mExportVarIdx_src2_i_2 = 97;
    private Int2 mExportVar_src2_i_2;
    public synchronized void set_src2_i_2(Int2 v) {
        mExportVar_src2_i_2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        setVar(mExportVarIdx_src2_i_2, fp);
    }

    public Int2 get_src2_i_2() {
        return mExportVar_src2_i_2;
    }

    private final static int mExportVarIdx_src2_i_3 = 98;
    private Int3 mExportVar_src2_i_3;
    public synchronized void set_src2_i_3(Int3 v) {
        mExportVar_src2_i_3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_src2_i_3, fp);
    }

    public Int3 get_src2_i_3() {
        return mExportVar_src2_i_3;
    }

    private final static int mExportVarIdx_src2_i_4 = 99;
    private Int4 mExportVar_src2_i_4;
    public synchronized void set_src2_i_4(Int4 v) {
        mExportVar_src2_i_4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        setVar(mExportVarIdx_src2_i_4, fp);
    }

    public Int4 get_src2_i_4() {
        return mExportVar_src2_i_4;
    }

    private final static int mExportVarIdx_src2_ui_1 = 100;
    private long mExportVar_src2_ui_1;
    public synchronized void set_src2_ui_1(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_src2_ui_1, __rs_fp_U32);
        mExportVar_src2_ui_1 = v;
    }

    public long get_src2_ui_1() {
        return mExportVar_src2_ui_1;
    }

    private final static int mExportVarIdx_src2_ui_2 = 101;
    private Long2 mExportVar_src2_ui_2;
    public synchronized void set_src2_ui_2(Long2 v) {
        mExportVar_src2_ui_2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        setVar(mExportVarIdx_src2_ui_2, fp);
    }

    public Long2 get_src2_ui_2() {
        return mExportVar_src2_ui_2;
    }

    private final static int mExportVarIdx_src2_ui_3 = 102;
    private Long3 mExportVar_src2_ui_3;
    public synchronized void set_src2_ui_3(Long3 v) {
        mExportVar_src2_ui_3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_src2_ui_3, fp);
    }

    public Long3 get_src2_ui_3() {
        return mExportVar_src2_ui_3;
    }

    private final static int mExportVarIdx_src2_ui_4 = 103;
    private Long4 mExportVar_src2_ui_4;
    public synchronized void set_src2_ui_4(Long4 v) {
        mExportVar_src2_ui_4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        setVar(mExportVarIdx_src2_ui_4, fp);
    }

    public Long4 get_src2_ui_4() {
        return mExportVar_src2_ui_4;
    }

    private final static int mExportVarIdx_src2_l_1 = 104;
    private long mExportVar_src2_l_1;
    public synchronized void set_src2_l_1(long v) {
        setVar(mExportVarIdx_src2_l_1, v);
        mExportVar_src2_l_1 = v;
    }

    public long get_src2_l_1() {
        return mExportVar_src2_l_1;
    }

    private final static int mExportVarIdx_src2_ul_1 = 105;
    private long mExportVar_src2_ul_1;
    public synchronized void set_src2_ul_1(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_src2_ul_1, __rs_fp_U64);
        mExportVar_src2_ul_1 = v;
    }

    public long get_src2_ul_1() {
        return mExportVar_src2_ul_1;
    }

    private final static int mExportFuncIdx_math_test = 0;
    public void invoke_math_test(long index, int test_num) {
        FieldPacker math_test_fp = new FieldPacker(8);
        math_test_fp.addU32(index);
        math_test_fp.addI32(test_num);
        invoke(mExportFuncIdx_math_test, math_test_fp);
    }

}

