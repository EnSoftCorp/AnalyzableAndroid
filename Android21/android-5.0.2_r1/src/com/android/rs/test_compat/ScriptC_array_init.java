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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/array_init.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_array_init extends ScriptC {
    private static final String __rs_resource_name = "array_init";
    // Constructor
    public  ScriptC_array_init(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_array_init(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_fa = new float[4];
        mExportVar_fa[0] = 1.f;
        mExportVar_fa[1] = 9.99989986f;
        __F32 = Element.F32(rs);
        mExportVar_da = new double[2];
        mExportVar_da[0] = 7;
        mExportVar_da[1] = 8.8888800000000003;
        __F64 = Element.F64(rs);
        mExportVar_ca = new byte[4];
        mExportVar_ca[0] = 97;
        mExportVar_ca[1] = 7;
        mExportVar_ca[2] = 98;
        mExportVar_ca[3] = 99;
        __I8 = Element.I8(rs);
        mExportVar_sa = new short[4];
        mExportVar_sa[0] = 1;
        mExportVar_sa[1] = 1;
        mExportVar_sa[2] = 2;
        mExportVar_sa[3] = 3;
        __I16 = Element.I16(rs);
        mExportVar_ia = new int[4];
        mExportVar_ia[0] = 5;
        mExportVar_ia[1] = 8;
        __I32 = Element.I32(rs);
        mExportVar_la = new long[2];
        mExportVar_la[0] = 13L;
        mExportVar_la[1] = 21L;
        __I64 = Element.I64(rs);
        mExportVar_lla = new long[4];
        mExportVar_lla[0] = 34L;
        mExportVar_ba = new boolean[3];
        mExportVar_ba[0] = true;
        mExportVar_ba[1] = false;
        __BOOLEAN = Element.BOOLEAN(rs);
    }

    private Element __BOOLEAN;
    private Element __F32;
    private Element __F64;
    private Element __I16;
    private Element __I32;
    private Element __I64;
    private Element __I8;
    private FieldPacker __rs_fp_BOOLEAN;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F64;
    private FieldPacker __rs_fp_I16;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I64;
    private FieldPacker __rs_fp_I8;
    private final static int mExportVarIdx_fa = 0;
    private float[] mExportVar_fa;
    public synchronized void set_fa(float[] v) {
        mExportVar_fa = v;
        FieldPacker fp = new FieldPacker(16);
        for (int ct1 = 0; ct1 < 4; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_fa, fp, __F32, __dimArr);
    }

    public float[] get_fa() {
        return mExportVar_fa;
    }

    public Script.FieldID getFieldID_fa() {
        return createFieldID(mExportVarIdx_fa, null);
    }

    private final static int mExportVarIdx_da = 1;
    private double[] mExportVar_da;
    public synchronized void set_da(double[] v) {
        mExportVar_da = v;
        FieldPacker fp = new FieldPacker(16);
        for (int ct1 = 0; ct1 < 2; ct1++) {
            fp.addF64(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_da, fp, __F64, __dimArr);
    }

    public double[] get_da() {
        return mExportVar_da;
    }

    public Script.FieldID getFieldID_da() {
        return createFieldID(mExportVarIdx_da, null);
    }

    private final static int mExportVarIdx_ca = 2;
    private byte[] mExportVar_ca;
    public synchronized void set_ca(byte[] v) {
        mExportVar_ca = v;
        FieldPacker fp = new FieldPacker(4);
        for (int ct1 = 0; ct1 < 4; ct1++) {
            fp.addI8(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_ca, fp, __I8, __dimArr);
    }

    public byte[] get_ca() {
        return mExportVar_ca;
    }

    public Script.FieldID getFieldID_ca() {
        return createFieldID(mExportVarIdx_ca, null);
    }

    private final static int mExportVarIdx_sa = 3;
    private short[] mExportVar_sa;
    public synchronized void set_sa(short[] v) {
        mExportVar_sa = v;
        FieldPacker fp = new FieldPacker(8);
        for (int ct1 = 0; ct1 < 4; ct1++) {
            fp.addI16(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_sa, fp, __I16, __dimArr);
    }

    public short[] get_sa() {
        return mExportVar_sa;
    }

    public Script.FieldID getFieldID_sa() {
        return createFieldID(mExportVarIdx_sa, null);
    }

    private final static int mExportVarIdx_ia = 4;
    private int[] mExportVar_ia;
    public synchronized void set_ia(int[] v) {
        mExportVar_ia = v;
        FieldPacker fp = new FieldPacker(16);
        for (int ct1 = 0; ct1 < 4; ct1++) {
            fp.addI32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_ia, fp, __I32, __dimArr);
    }

    public int[] get_ia() {
        return mExportVar_ia;
    }

    public Script.FieldID getFieldID_ia() {
        return createFieldID(mExportVarIdx_ia, null);
    }

    private final static int mExportVarIdx_la = 5;
    private long[] mExportVar_la;
    public synchronized void set_la(long[] v) {
        mExportVar_la = v;
        FieldPacker fp = new FieldPacker(16);
        for (int ct1 = 0; ct1 < 2; ct1++) {
            fp.addI64(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_la, fp, __I64, __dimArr);
    }

    public long[] get_la() {
        return mExportVar_la;
    }

    public Script.FieldID getFieldID_la() {
        return createFieldID(mExportVarIdx_la, null);
    }

    private final static int mExportVarIdx_lla = 6;
    private long[] mExportVar_lla;
    public synchronized void set_lla(long[] v) {
        mExportVar_lla = v;
        FieldPacker fp = new FieldPacker(32);
        for (int ct1 = 0; ct1 < 4; ct1++) {
            fp.addI64(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_lla, fp, __I64, __dimArr);
    }

    public long[] get_lla() {
        return mExportVar_lla;
    }

    public Script.FieldID getFieldID_lla() {
        return createFieldID(mExportVarIdx_lla, null);
    }

    private final static int mExportVarIdx_ba = 7;
    private boolean[] mExportVar_ba;
    public synchronized void set_ba(boolean[] v) {
        mExportVar_ba = v;
        FieldPacker fp = new FieldPacker(3);
        for (int ct1 = 0; ct1 < 3; ct1++) {
            fp.addBoolean(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 3;
        setVar(mExportVarIdx_ba, fp, __BOOLEAN, __dimArr);
    }

    public boolean[] get_ba() {
        return mExportVar_ba;
    }

    public Script.FieldID getFieldID_ba() {
        return createFieldID(mExportVarIdx_ba, null);
    }

    private final static int mExportFuncIdx_array_init_test = 0;
    public void invoke_array_init_test() {
        invoke(mExportFuncIdx_array_init_test);
    }

}

