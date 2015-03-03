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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/apitest.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_apitest extends ScriptC {
    private static final String __rs_resource_name = "apitest";
    // Constructor
    public  ScriptC_apitest(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_apitest(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __U32 = Element.U32(rs);
        __ELEMENT = Element.ELEMENT(rs);
        __TYPE = Element.TYPE(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __SAMPLER = Element.SAMPLER(rs);
        __SCRIPT = Element.SCRIPT(rs);
        __I32 = Element.I32(rs);
        __BOOLEAN = Element.BOOLEAN(rs);
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
        __I32_2 = Element.I32_2(rs);
        __I32_3 = Element.I32_3(rs);
        __I32_4 = Element.I32_4(rs);
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
        __F32 = Element.F32(rs);
        __F32_2 = Element.F32_2(rs);
        __F32_3 = Element.F32_3(rs);
        __F32_4 = Element.F32_4(rs);
        __F64 = Element.F64(rs);
        __F64_2 = Element.F64_2(rs);
        __F64_3 = Element.F64_3(rs);
        __F64_4 = Element.F64_4(rs);
    }

    private Element __ALLOCATION;
    private Element __BOOLEAN;
    private Element __ELEMENT;
    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __F32_4;
    private Element __F64;
    private Element __F64_2;
    private Element __F64_3;
    private Element __F64_4;
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
    private Element __SAMPLER;
    private Element __SCRIPT;
    private Element __TYPE;
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
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_BOOLEAN;
    private FieldPacker __rs_fp_ELEMENT;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_2;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_F32_4;
    private FieldPacker __rs_fp_F64;
    private FieldPacker __rs_fp_F64_2;
    private FieldPacker __rs_fp_F64_3;
    private FieldPacker __rs_fp_F64_4;
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
    private FieldPacker __rs_fp_SAMPLER;
    private FieldPacker __rs_fp_SCRIPT;
    private FieldPacker __rs_fp_TYPE;
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
    private long mExportVar_x;
    public synchronized void set_x(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_x, __rs_fp_U32);
        mExportVar_x = v;
    }

    public long get_x() {
        return mExportVar_x;
    }

    public Script.FieldID getFieldID_x() {
        return createFieldID(mExportVarIdx_x, null);
    }

    private final static int mExportVarIdx_y = 1;
    private long mExportVar_y;
    public synchronized void set_y(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_y, __rs_fp_U32);
        mExportVar_y = v;
    }

    public long get_y() {
        return mExportVar_y;
    }

    public Script.FieldID getFieldID_y() {
        return createFieldID(mExportVarIdx_y, null);
    }

    private final static int mExportVarIdx_z = 2;
    private long mExportVar_z;
    public synchronized void set_z(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_z, __rs_fp_U32);
        mExportVar_z = v;
    }

    public long get_z() {
        return mExportVar_z;
    }

    public Script.FieldID getFieldID_z() {
        return createFieldID(mExportVarIdx_z, null);
    }

    private final static int mExportVarIdx_elemNull = 3;
    private Element mExportVar_elemNull;
    public synchronized void set_elemNull(Element v) {
        setVar(mExportVarIdx_elemNull, v);
        mExportVar_elemNull = v;
    }

    public Element get_elemNull() {
        return mExportVar_elemNull;
    }

    public Script.FieldID getFieldID_elemNull() {
        return createFieldID(mExportVarIdx_elemNull, null);
    }

    private final static int mExportVarIdx_elemNonNull = 4;
    private Element mExportVar_elemNonNull;
    public synchronized void set_elemNonNull(Element v) {
        setVar(mExportVarIdx_elemNonNull, v);
        mExportVar_elemNonNull = v;
    }

    public Element get_elemNonNull() {
        return mExportVar_elemNonNull;
    }

    public Script.FieldID getFieldID_elemNonNull() {
        return createFieldID(mExportVarIdx_elemNonNull, null);
    }

    private final static int mExportVarIdx_typeNull = 5;
    private Type mExportVar_typeNull;
    public synchronized void set_typeNull(Type v) {
        setVar(mExportVarIdx_typeNull, v);
        mExportVar_typeNull = v;
    }

    public Type get_typeNull() {
        return mExportVar_typeNull;
    }

    public Script.FieldID getFieldID_typeNull() {
        return createFieldID(mExportVarIdx_typeNull, null);
    }

    private final static int mExportVarIdx_typeNonNull = 6;
    private Type mExportVar_typeNonNull;
    public synchronized void set_typeNonNull(Type v) {
        setVar(mExportVarIdx_typeNonNull, v);
        mExportVar_typeNonNull = v;
    }

    public Type get_typeNonNull() {
        return mExportVar_typeNonNull;
    }

    public Script.FieldID getFieldID_typeNonNull() {
        return createFieldID(mExportVarIdx_typeNonNull, null);
    }

    private final static int mExportVarIdx_allocNull = 7;
    private Allocation mExportVar_allocNull;
    public synchronized void set_allocNull(Allocation v) {
        setVar(mExportVarIdx_allocNull, v);
        mExportVar_allocNull = v;
    }

    public Allocation get_allocNull() {
        return mExportVar_allocNull;
    }

    public Script.FieldID getFieldID_allocNull() {
        return createFieldID(mExportVarIdx_allocNull, null);
    }

    private final static int mExportVarIdx_allocNonNull = 8;
    private Allocation mExportVar_allocNonNull;
    public synchronized void set_allocNonNull(Allocation v) {
        setVar(mExportVarIdx_allocNonNull, v);
        mExportVar_allocNonNull = v;
    }

    public Allocation get_allocNonNull() {
        return mExportVar_allocNonNull;
    }

    public Script.FieldID getFieldID_allocNonNull() {
        return createFieldID(mExportVarIdx_allocNonNull, null);
    }

    private final static int mExportVarIdx_samplerNull = 9;
    private Sampler mExportVar_samplerNull;
    public synchronized void set_samplerNull(Sampler v) {
        setVar(mExportVarIdx_samplerNull, v);
        mExportVar_samplerNull = v;
    }

    public Sampler get_samplerNull() {
        return mExportVar_samplerNull;
    }

    public Script.FieldID getFieldID_samplerNull() {
        return createFieldID(mExportVarIdx_samplerNull, null);
    }

    private final static int mExportVarIdx_samplerNonNull = 10;
    private Sampler mExportVar_samplerNonNull;
    public synchronized void set_samplerNonNull(Sampler v) {
        setVar(mExportVarIdx_samplerNonNull, v);
        mExportVar_samplerNonNull = v;
    }

    public Sampler get_samplerNonNull() {
        return mExportVar_samplerNonNull;
    }

    public Script.FieldID getFieldID_samplerNonNull() {
        return createFieldID(mExportVarIdx_samplerNonNull, null);
    }

    private final static int mExportVarIdx_scriptNull = 11;
    private Script mExportVar_scriptNull;
    public synchronized void set_scriptNull(Script v) {
        setVar(mExportVarIdx_scriptNull, v);
        mExportVar_scriptNull = v;
    }

    public Script get_scriptNull() {
        return mExportVar_scriptNull;
    }

    public Script.FieldID getFieldID_scriptNull() {
        return createFieldID(mExportVarIdx_scriptNull, null);
    }

    private final static int mExportVarIdx_scriptNonNull = 12;
    private Script mExportVar_scriptNonNull;
    public synchronized void set_scriptNonNull(Script v) {
        setVar(mExportVarIdx_scriptNonNull, v);
        mExportVar_scriptNonNull = v;
    }

    public Script get_scriptNonNull() {
        return mExportVar_scriptNonNull;
    }

    public Script.FieldID getFieldID_scriptNonNull() {
        return createFieldID(mExportVarIdx_scriptNonNull, null);
    }

    private final static int mExportVarIdx_dt = 13;
    private int mExportVar_dt;
    public synchronized void set_dt(int v) {
        if (__rs_fp_I32!= null) {
            __rs_fp_I32.reset();
        } else {
            __rs_fp_I32 = new FieldPacker(4);
        }
        __rs_fp_I32.addI32(v);
        setVar(mExportVarIdx_dt, __rs_fp_I32);
        mExportVar_dt = v;
    }

    public int get_dt() {
        return mExportVar_dt;
    }

    public Script.FieldID getFieldID_dt() {
        return createFieldID(mExportVarIdx_dt, null);
    }

    private final static int mExportVarIdx_dk = 14;
    private int mExportVar_dk;
    public synchronized void set_dk(int v) {
        if (__rs_fp_I32!= null) {
            __rs_fp_I32.reset();
        } else {
            __rs_fp_I32 = new FieldPacker(4);
        }
        __rs_fp_I32.addI32(v);
        setVar(mExportVarIdx_dk, __rs_fp_I32);
        mExportVar_dk = v;
    }

    public int get_dk() {
        return mExportVar_dk;
    }

    public Script.FieldID getFieldID_dk() {
        return createFieldID(mExportVarIdx_dk, null);
    }

    private final static int mExportVarIdx_rsv = 15;
    private int mExportVar_rsv;
    public synchronized void set_rsv(int v) {
        if (__rs_fp_I32!= null) {
            __rs_fp_I32.reset();
        } else {
            __rs_fp_I32 = new FieldPacker(4);
        }
        __rs_fp_I32.addI32(v);
        setVar(mExportVarIdx_rsv, __rs_fp_I32);
        mExportVar_rsv = v;
    }

    public int get_rsv() {
        return mExportVar_rsv;
    }

    public Script.FieldID getFieldID_rsv() {
        return createFieldID(mExportVarIdx_rsv, null);
    }

    private final static int mExportVarIdx_rst = 16;
    private int mExportVar_rst;
    public synchronized void set_rst(int v) {
        setVar(mExportVarIdx_rst, v);
        mExportVar_rst = v;
    }

    public int get_rst() {
        return mExportVar_rst;
    }

    public Script.FieldID getFieldID_rst() {
        return createFieldID(mExportVarIdx_rst, null);
    }

    private final static int mExportVarIdx_allocPtr = 17;
    private Allocation mExportVar_allocPtr;
    public void bind_allocPtr(Allocation v) {
        mExportVar_allocPtr = v;
        if (v == null) bindAllocation(null, mExportVarIdx_allocPtr);
        else bindAllocation(v, mExportVarIdx_allocPtr);
    }

    public Allocation get_allocPtr() {
        return mExportVar_allocPtr;
    }

    private final static int mExportVarIdx_allocDst = 18;
    private Allocation mExportVar_allocDst;
    public synchronized void set_allocDst(Allocation v) {
        setVar(mExportVarIdx_allocDst, v);
        mExportVar_allocDst = v;
    }

    public Allocation get_allocDst() {
        return mExportVar_allocDst;
    }

    public Script.FieldID getFieldID_allocDst() {
        return createFieldID(mExportVarIdx_allocDst, null);
    }

    private final static int mExportVarIdx_b = 19;
    private boolean mExportVar_b;
    public synchronized void set_b(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_b, __rs_fp_BOOLEAN);
        mExportVar_b = v;
    }

    public boolean get_b() {
        return mExportVar_b;
    }

    public Script.FieldID getFieldID_b() {
        return createFieldID(mExportVarIdx_b, null);
    }

    private final static int mExportVarIdx_c = 20;
    private byte mExportVar_c;
    public synchronized void set_c(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_c, __rs_fp_I8);
        mExportVar_c = v;
    }

    public byte get_c() {
        return mExportVar_c;
    }

    public Script.FieldID getFieldID_c() {
        return createFieldID(mExportVarIdx_c, null);
    }

    private final static int mExportVarIdx_c2 = 21;
    private Byte2 mExportVar_c2;
    public synchronized void set_c2(Byte2 v) {
        mExportVar_c2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c2, fp, __I8_2, __dimArr);
    }

    public Byte2 get_c2() {
        return mExportVar_c2;
    }

    public Script.FieldID getFieldID_c2() {
        return createFieldID(mExportVarIdx_c2, null);
    }

    private final static int mExportVarIdx_c3 = 22;
    private Byte3 mExportVar_c3;
    public synchronized void set_c3(Byte3 v) {
        mExportVar_c3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c3, fp, __I8_3, __dimArr);
    }

    public Byte3 get_c3() {
        return mExportVar_c3;
    }

    public Script.FieldID getFieldID_c3() {
        return createFieldID(mExportVarIdx_c3, null);
    }

    private final static int mExportVarIdx_c4 = 23;
    private Byte4 mExportVar_c4;
    public synchronized void set_c4(Byte4 v) {
        mExportVar_c4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c4, fp, __I8_4, __dimArr);
    }

    public Byte4 get_c4() {
        return mExportVar_c4;
    }

    public Script.FieldID getFieldID_c4() {
        return createFieldID(mExportVarIdx_c4, null);
    }

    private final static int mExportVarIdx_uc = 24;
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

    private final static int mExportVarIdx_uc2 = 25;
    private Short2 mExportVar_uc2;
    public synchronized void set_uc2(Short2 v) {
        mExportVar_uc2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc2, fp, __U8_2, __dimArr);
    }

    public Short2 get_uc2() {
        return mExportVar_uc2;
    }

    public Script.FieldID getFieldID_uc2() {
        return createFieldID(mExportVarIdx_uc2, null);
    }

    private final static int mExportVarIdx_uc3 = 26;
    private Short3 mExportVar_uc3;
    public synchronized void set_uc3(Short3 v) {
        mExportVar_uc3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc3, fp, __U8_3, __dimArr);
    }

    public Short3 get_uc3() {
        return mExportVar_uc3;
    }

    public Script.FieldID getFieldID_uc3() {
        return createFieldID(mExportVarIdx_uc3, null);
    }

    private final static int mExportVarIdx_uc4 = 27;
    private Short4 mExportVar_uc4;
    public synchronized void set_uc4(Short4 v) {
        mExportVar_uc4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc4, fp, __U8_4, __dimArr);
    }

    public Short4 get_uc4() {
        return mExportVar_uc4;
    }

    public Script.FieldID getFieldID_uc4() {
        return createFieldID(mExportVarIdx_uc4, null);
    }

    private final static int mExportVarIdx_s = 28;
    private short mExportVar_s;
    public synchronized void set_s(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_s, __rs_fp_I16);
        mExportVar_s = v;
    }

    public short get_s() {
        return mExportVar_s;
    }

    public Script.FieldID getFieldID_s() {
        return createFieldID(mExportVarIdx_s, null);
    }

    private final static int mExportVarIdx_s2 = 29;
    private Short2 mExportVar_s2;
    public synchronized void set_s2(Short2 v) {
        mExportVar_s2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_s2, fp, __I16_2, __dimArr);
    }

    public Short2 get_s2() {
        return mExportVar_s2;
    }

    public Script.FieldID getFieldID_s2() {
        return createFieldID(mExportVarIdx_s2, null);
    }

    private final static int mExportVarIdx_s3 = 30;
    private Short3 mExportVar_s3;
    public synchronized void set_s3(Short3 v) {
        mExportVar_s3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_s3, fp, __I16_3, __dimArr);
    }

    public Short3 get_s3() {
        return mExportVar_s3;
    }

    public Script.FieldID getFieldID_s3() {
        return createFieldID(mExportVarIdx_s3, null);
    }

    private final static int mExportVarIdx_s4 = 31;
    private Short4 mExportVar_s4;
    public synchronized void set_s4(Short4 v) {
        mExportVar_s4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_s4, fp, __I16_4, __dimArr);
    }

    public Short4 get_s4() {
        return mExportVar_s4;
    }

    public Script.FieldID getFieldID_s4() {
        return createFieldID(mExportVarIdx_s4, null);
    }

    private final static int mExportVarIdx_us = 32;
    private int mExportVar_us;
    public synchronized void set_us(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_us, __rs_fp_U16);
        mExportVar_us = v;
    }

    public int get_us() {
        return mExportVar_us;
    }

    public Script.FieldID getFieldID_us() {
        return createFieldID(mExportVarIdx_us, null);
    }

    private final static int mExportVarIdx_us2 = 33;
    private Int2 mExportVar_us2;
    public synchronized void set_us2(Int2 v) {
        mExportVar_us2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_us2, fp, __U16_2, __dimArr);
    }

    public Int2 get_us2() {
        return mExportVar_us2;
    }

    public Script.FieldID getFieldID_us2() {
        return createFieldID(mExportVarIdx_us2, null);
    }

    private final static int mExportVarIdx_us3 = 34;
    private Int3 mExportVar_us3;
    public synchronized void set_us3(Int3 v) {
        mExportVar_us3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_us3, fp, __U16_3, __dimArr);
    }

    public Int3 get_us3() {
        return mExportVar_us3;
    }

    public Script.FieldID getFieldID_us3() {
        return createFieldID(mExportVarIdx_us3, null);
    }

    private final static int mExportVarIdx_us4 = 35;
    private Int4 mExportVar_us4;
    public synchronized void set_us4(Int4 v) {
        mExportVar_us4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_us4, fp, __U16_4, __dimArr);
    }

    public Int4 get_us4() {
        return mExportVar_us4;
    }

    public Script.FieldID getFieldID_us4() {
        return createFieldID(mExportVarIdx_us4, null);
    }

    private final static int mExportVarIdx_i = 36;
    private int mExportVar_i;
    public synchronized void set_i(int v) {
        setVar(mExportVarIdx_i, v);
        mExportVar_i = v;
    }

    public int get_i() {
        return mExportVar_i;
    }

    public Script.FieldID getFieldID_i() {
        return createFieldID(mExportVarIdx_i, null);
    }

    private final static int mExportVarIdx_i2 = 37;
    private Int2 mExportVar_i2;
    public synchronized void set_i2(Int2 v) {
        mExportVar_i2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_i2, fp, __I32_2, __dimArr);
    }

    public Int2 get_i2() {
        return mExportVar_i2;
    }

    public Script.FieldID getFieldID_i2() {
        return createFieldID(mExportVarIdx_i2, null);
    }

    private final static int mExportVarIdx_i3 = 38;
    private Int3 mExportVar_i3;
    public synchronized void set_i3(Int3 v) {
        mExportVar_i3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_i3, fp, __I32_3, __dimArr);
    }

    public Int3 get_i3() {
        return mExportVar_i3;
    }

    public Script.FieldID getFieldID_i3() {
        return createFieldID(mExportVarIdx_i3, null);
    }

    private final static int mExportVarIdx_i4 = 39;
    private Int4 mExportVar_i4;
    public synchronized void set_i4(Int4 v) {
        mExportVar_i4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_i4, fp, __I32_4, __dimArr);
    }

    public Int4 get_i4() {
        return mExportVar_i4;
    }

    public Script.FieldID getFieldID_i4() {
        return createFieldID(mExportVarIdx_i4, null);
    }

    private final static int mExportVarIdx_ui = 40;
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

    private final static int mExportVarIdx_ui2 = 41;
    private Long2 mExportVar_ui2;
    public synchronized void set_ui2(Long2 v) {
        mExportVar_ui2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_ui2, fp, __U32_2, __dimArr);
    }

    public Long2 get_ui2() {
        return mExportVar_ui2;
    }

    public Script.FieldID getFieldID_ui2() {
        return createFieldID(mExportVarIdx_ui2, null);
    }

    private final static int mExportVarIdx_ui3 = 42;
    private Long3 mExportVar_ui3;
    public synchronized void set_ui3(Long3 v) {
        mExportVar_ui3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_ui3, fp, __U32_3, __dimArr);
    }

    public Long3 get_ui3() {
        return mExportVar_ui3;
    }

    public Script.FieldID getFieldID_ui3() {
        return createFieldID(mExportVarIdx_ui3, null);
    }

    private final static int mExportVarIdx_ui4 = 43;
    private Long4 mExportVar_ui4;
    public synchronized void set_ui4(Long4 v) {
        mExportVar_ui4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_ui4, fp, __U32_4, __dimArr);
    }

    public Long4 get_ui4() {
        return mExportVar_ui4;
    }

    public Script.FieldID getFieldID_ui4() {
        return createFieldID(mExportVarIdx_ui4, null);
    }

    private final static int mExportVarIdx_l = 44;
    private long mExportVar_l;
    public synchronized void set_l(long v) {
        setVar(mExportVarIdx_l, v);
        mExportVar_l = v;
    }

    public long get_l() {
        return mExportVar_l;
    }

    public Script.FieldID getFieldID_l() {
        return createFieldID(mExportVarIdx_l, null);
    }

    private final static int mExportVarIdx_l2 = 45;
    private Long2 mExportVar_l2;
    public synchronized void set_l2(Long2 v) {
        mExportVar_l2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_l2, fp, __I64_2, __dimArr);
    }

    public Long2 get_l2() {
        return mExportVar_l2;
    }

    public Script.FieldID getFieldID_l2() {
        return createFieldID(mExportVarIdx_l2, null);
    }

    private final static int mExportVarIdx_l3 = 46;
    private Long3 mExportVar_l3;
    public synchronized void set_l3(Long3 v) {
        mExportVar_l3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_l3, fp, __I64_3, __dimArr);
    }

    public Long3 get_l3() {
        return mExportVar_l3;
    }

    public Script.FieldID getFieldID_l3() {
        return createFieldID(mExportVarIdx_l3, null);
    }

    private final static int mExportVarIdx_l4 = 47;
    private Long4 mExportVar_l4;
    public synchronized void set_l4(Long4 v) {
        mExportVar_l4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_l4, fp, __I64_4, __dimArr);
    }

    public Long4 get_l4() {
        return mExportVar_l4;
    }

    public Script.FieldID getFieldID_l4() {
        return createFieldID(mExportVarIdx_l4, null);
    }

    private final static int mExportVarIdx_ul = 48;
    private long mExportVar_ul;
    public synchronized void set_ul(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_ul, __rs_fp_U64);
        mExportVar_ul = v;
    }

    public long get_ul() {
        return mExportVar_ul;
    }

    public Script.FieldID getFieldID_ul() {
        return createFieldID(mExportVarIdx_ul, null);
    }

    private final static int mExportVarIdx_ul2 = 49;
    private Long2 mExportVar_ul2;
    public synchronized void set_ul2(Long2 v) {
        mExportVar_ul2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_ul2, fp, __U64_2, __dimArr);
    }

    public Long2 get_ul2() {
        return mExportVar_ul2;
    }

    public Script.FieldID getFieldID_ul2() {
        return createFieldID(mExportVarIdx_ul2, null);
    }

    private final static int mExportVarIdx_ul3 = 50;
    private Long3 mExportVar_ul3;
    public synchronized void set_ul3(Long3 v) {
        mExportVar_ul3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_ul3, fp, __U64_3, __dimArr);
    }

    public Long3 get_ul3() {
        return mExportVar_ul3;
    }

    public Script.FieldID getFieldID_ul3() {
        return createFieldID(mExportVarIdx_ul3, null);
    }

    private final static int mExportVarIdx_ul4 = 51;
    private Long4 mExportVar_ul4;
    public synchronized void set_ul4(Long4 v) {
        mExportVar_ul4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_ul4, fp, __U64_4, __dimArr);
    }

    public Long4 get_ul4() {
        return mExportVar_ul4;
    }

    public Script.FieldID getFieldID_ul4() {
        return createFieldID(mExportVarIdx_ul4, null);
    }

    private final static int mExportVarIdx_ll = 52;
    private long mExportVar_ll;
    public synchronized void set_ll(long v) {
        setVar(mExportVarIdx_ll, v);
        mExportVar_ll = v;
    }

    public long get_ll() {
        return mExportVar_ll;
    }

    public Script.FieldID getFieldID_ll() {
        return createFieldID(mExportVarIdx_ll, null);
    }

    private final static int mExportVarIdx_ull = 53;
    private long mExportVar_ull;
    public synchronized void set_ull(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_ull, __rs_fp_U64);
        mExportVar_ull = v;
    }

    public long get_ull() {
        return mExportVar_ull;
    }

    public Script.FieldID getFieldID_ull() {
        return createFieldID(mExportVarIdx_ull, null);
    }

    private final static int mExportVarIdx_f = 54;
    private float mExportVar_f;
    public synchronized void set_f(float v) {
        setVar(mExportVarIdx_f, v);
        mExportVar_f = v;
    }

    public float get_f() {
        return mExportVar_f;
    }

    public Script.FieldID getFieldID_f() {
        return createFieldID(mExportVarIdx_f, null);
    }

    private final static int mExportVarIdx_f2 = 55;
    private Float2 mExportVar_f2;
    public synchronized void set_f2(Float2 v) {
        mExportVar_f2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_f2, fp, __F32_2, __dimArr);
    }

    public Float2 get_f2() {
        return mExportVar_f2;
    }

    public Script.FieldID getFieldID_f2() {
        return createFieldID(mExportVarIdx_f2, null);
    }

    private final static int mExportVarIdx_f3 = 56;
    private Float3 mExportVar_f3;
    public synchronized void set_f3(Float3 v) {
        mExportVar_f3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_f3, fp, __F32_3, __dimArr);
    }

    public Float3 get_f3() {
        return mExportVar_f3;
    }

    public Script.FieldID getFieldID_f3() {
        return createFieldID(mExportVarIdx_f3, null);
    }

    private final static int mExportVarIdx_f4 = 57;
    private Float4 mExportVar_f4;
    public synchronized void set_f4(Float4 v) {
        mExportVar_f4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 4;
        setVar(mExportVarIdx_f4, fp, __F32_4, __dimArr);
    }

    public Float4 get_f4() {
        return mExportVar_f4;
    }

    public Script.FieldID getFieldID_f4() {
        return createFieldID(mExportVarIdx_f4, null);
    }

    private final static int mExportVarIdx_d = 58;
    private double mExportVar_d;
    public synchronized void set_d(double v) {
        setVar(mExportVarIdx_d, v);
        mExportVar_d = v;
    }

    public double get_d() {
        return mExportVar_d;
    }

    public Script.FieldID getFieldID_d() {
        return createFieldID(mExportVarIdx_d, null);
    }

    private final static int mExportVarIdx_d2 = 59;
    private Double2 mExportVar_d2;
    public synchronized void set_d2(Double2 v) {
        mExportVar_d2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_d2, fp, __F64_2, __dimArr);
    }

    public Double2 get_d2() {
        return mExportVar_d2;
    }

    public Script.FieldID getFieldID_d2() {
        return createFieldID(mExportVarIdx_d2, null);
    }

    private final static int mExportVarIdx_d3 = 60;
    private Double3 mExportVar_d3;
    public synchronized void set_d3(Double3 v) {
        mExportVar_d3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_d3, fp, __F64_3, __dimArr);
    }

    public Double3 get_d3() {
        return mExportVar_d3;
    }

    public Script.FieldID getFieldID_d3() {
        return createFieldID(mExportVarIdx_d3, null);
    }

    private final static int mExportVarIdx_d4 = 61;
    private Double4 mExportVar_d4;
    public synchronized void set_d4(Double4 v) {
        mExportVar_d4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 8;
        setVar(mExportVarIdx_d4, fp, __F64_4, __dimArr);
    }

    public Double4 get_d4() {
        return mExportVar_d4;
    }

    public Script.FieldID getFieldID_d4() {
        return createFieldID(mExportVarIdx_d4, null);
    }

    private final static int mExportVarIdx_fa = 62;
    private float[] mExportVar_fa;
    public synchronized void set_fa(float[] v) {
        mExportVar_fa = v;
        FieldPacker fp = new FieldPacker(64);
        for (int ct1 = 0; ct1 < 16; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 16;
        setVar(mExportVarIdx_fa, fp, __F32, __dimArr);
    }

    public float[] get_fa() {
        return mExportVar_fa;
    }

    public Script.FieldID getFieldID_fa() {
        return createFieldID(mExportVarIdx_fa, null);
    }

    private final static int mExportVarIdx_aChar = 63;
    private Allocation mExportVar_aChar;
    public synchronized void set_aChar(Allocation v) {
        setVar(mExportVarIdx_aChar, v);
        mExportVar_aChar = v;
    }

    public Allocation get_aChar() {
        return mExportVar_aChar;
    }

    public Script.FieldID getFieldID_aChar() {
        return createFieldID(mExportVarIdx_aChar, null);
    }

    private final static int mExportVarIdx_aChar2 = 64;
    private Allocation mExportVar_aChar2;
    public synchronized void set_aChar2(Allocation v) {
        setVar(mExportVarIdx_aChar2, v);
        mExportVar_aChar2 = v;
    }

    public Allocation get_aChar2() {
        return mExportVar_aChar2;
    }

    public Script.FieldID getFieldID_aChar2() {
        return createFieldID(mExportVarIdx_aChar2, null);
    }

    private final static int mExportVarIdx_aChar3 = 65;
    private Allocation mExportVar_aChar3;
    public synchronized void set_aChar3(Allocation v) {
        setVar(mExportVarIdx_aChar3, v);
        mExportVar_aChar3 = v;
    }

    public Allocation get_aChar3() {
        return mExportVar_aChar3;
    }

    public Script.FieldID getFieldID_aChar3() {
        return createFieldID(mExportVarIdx_aChar3, null);
    }

    private final static int mExportVarIdx_aChar4 = 66;
    private Allocation mExportVar_aChar4;
    public synchronized void set_aChar4(Allocation v) {
        setVar(mExportVarIdx_aChar4, v);
        mExportVar_aChar4 = v;
    }

    public Allocation get_aChar4() {
        return mExportVar_aChar4;
    }

    public Script.FieldID getFieldID_aChar4() {
        return createFieldID(mExportVarIdx_aChar4, null);
    }

    private final static int mExportVarIdx_aUChar = 67;
    private Allocation mExportVar_aUChar;
    public synchronized void set_aUChar(Allocation v) {
        setVar(mExportVarIdx_aUChar, v);
        mExportVar_aUChar = v;
    }

    public Allocation get_aUChar() {
        return mExportVar_aUChar;
    }

    public Script.FieldID getFieldID_aUChar() {
        return createFieldID(mExportVarIdx_aUChar, null);
    }

    private final static int mExportVarIdx_aUChar2 = 68;
    private Allocation mExportVar_aUChar2;
    public synchronized void set_aUChar2(Allocation v) {
        setVar(mExportVarIdx_aUChar2, v);
        mExportVar_aUChar2 = v;
    }

    public Allocation get_aUChar2() {
        return mExportVar_aUChar2;
    }

    public Script.FieldID getFieldID_aUChar2() {
        return createFieldID(mExportVarIdx_aUChar2, null);
    }

    private final static int mExportVarIdx_aUChar3 = 69;
    private Allocation mExportVar_aUChar3;
    public synchronized void set_aUChar3(Allocation v) {
        setVar(mExportVarIdx_aUChar3, v);
        mExportVar_aUChar3 = v;
    }

    public Allocation get_aUChar3() {
        return mExportVar_aUChar3;
    }

    public Script.FieldID getFieldID_aUChar3() {
        return createFieldID(mExportVarIdx_aUChar3, null);
    }

    private final static int mExportVarIdx_aUChar4 = 70;
    private Allocation mExportVar_aUChar4;
    public synchronized void set_aUChar4(Allocation v) {
        setVar(mExportVarIdx_aUChar4, v);
        mExportVar_aUChar4 = v;
    }

    public Allocation get_aUChar4() {
        return mExportVar_aUChar4;
    }

    public Script.FieldID getFieldID_aUChar4() {
        return createFieldID(mExportVarIdx_aUChar4, null);
    }

    private final static int mExportVarIdx_aShort = 71;
    private Allocation mExportVar_aShort;
    public synchronized void set_aShort(Allocation v) {
        setVar(mExportVarIdx_aShort, v);
        mExportVar_aShort = v;
    }

    public Allocation get_aShort() {
        return mExportVar_aShort;
    }

    public Script.FieldID getFieldID_aShort() {
        return createFieldID(mExportVarIdx_aShort, null);
    }

    private final static int mExportVarIdx_aShort2 = 72;
    private Allocation mExportVar_aShort2;
    public synchronized void set_aShort2(Allocation v) {
        setVar(mExportVarIdx_aShort2, v);
        mExportVar_aShort2 = v;
    }

    public Allocation get_aShort2() {
        return mExportVar_aShort2;
    }

    public Script.FieldID getFieldID_aShort2() {
        return createFieldID(mExportVarIdx_aShort2, null);
    }

    private final static int mExportVarIdx_aShort3 = 73;
    private Allocation mExportVar_aShort3;
    public synchronized void set_aShort3(Allocation v) {
        setVar(mExportVarIdx_aShort3, v);
        mExportVar_aShort3 = v;
    }

    public Allocation get_aShort3() {
        return mExportVar_aShort3;
    }

    public Script.FieldID getFieldID_aShort3() {
        return createFieldID(mExportVarIdx_aShort3, null);
    }

    private final static int mExportVarIdx_aShort4 = 74;
    private Allocation mExportVar_aShort4;
    public synchronized void set_aShort4(Allocation v) {
        setVar(mExportVarIdx_aShort4, v);
        mExportVar_aShort4 = v;
    }

    public Allocation get_aShort4() {
        return mExportVar_aShort4;
    }

    public Script.FieldID getFieldID_aShort4() {
        return createFieldID(mExportVarIdx_aShort4, null);
    }

    private final static int mExportVarIdx_aUShort = 75;
    private Allocation mExportVar_aUShort;
    public synchronized void set_aUShort(Allocation v) {
        setVar(mExportVarIdx_aUShort, v);
        mExportVar_aUShort = v;
    }

    public Allocation get_aUShort() {
        return mExportVar_aUShort;
    }

    public Script.FieldID getFieldID_aUShort() {
        return createFieldID(mExportVarIdx_aUShort, null);
    }

    private final static int mExportVarIdx_aUShort2 = 76;
    private Allocation mExportVar_aUShort2;
    public synchronized void set_aUShort2(Allocation v) {
        setVar(mExportVarIdx_aUShort2, v);
        mExportVar_aUShort2 = v;
    }

    public Allocation get_aUShort2() {
        return mExportVar_aUShort2;
    }

    public Script.FieldID getFieldID_aUShort2() {
        return createFieldID(mExportVarIdx_aUShort2, null);
    }

    private final static int mExportVarIdx_aUShort3 = 77;
    private Allocation mExportVar_aUShort3;
    public synchronized void set_aUShort3(Allocation v) {
        setVar(mExportVarIdx_aUShort3, v);
        mExportVar_aUShort3 = v;
    }

    public Allocation get_aUShort3() {
        return mExportVar_aUShort3;
    }

    public Script.FieldID getFieldID_aUShort3() {
        return createFieldID(mExportVarIdx_aUShort3, null);
    }

    private final static int mExportVarIdx_aUShort4 = 78;
    private Allocation mExportVar_aUShort4;
    public synchronized void set_aUShort4(Allocation v) {
        setVar(mExportVarIdx_aUShort4, v);
        mExportVar_aUShort4 = v;
    }

    public Allocation get_aUShort4() {
        return mExportVar_aUShort4;
    }

    public Script.FieldID getFieldID_aUShort4() {
        return createFieldID(mExportVarIdx_aUShort4, null);
    }

    private final static int mExportVarIdx_aInt = 79;
    private Allocation mExportVar_aInt;
    public synchronized void set_aInt(Allocation v) {
        setVar(mExportVarIdx_aInt, v);
        mExportVar_aInt = v;
    }

    public Allocation get_aInt() {
        return mExportVar_aInt;
    }

    public Script.FieldID getFieldID_aInt() {
        return createFieldID(mExportVarIdx_aInt, null);
    }

    private final static int mExportVarIdx_aInt2 = 80;
    private Allocation mExportVar_aInt2;
    public synchronized void set_aInt2(Allocation v) {
        setVar(mExportVarIdx_aInt2, v);
        mExportVar_aInt2 = v;
    }

    public Allocation get_aInt2() {
        return mExportVar_aInt2;
    }

    public Script.FieldID getFieldID_aInt2() {
        return createFieldID(mExportVarIdx_aInt2, null);
    }

    private final static int mExportVarIdx_aInt3 = 81;
    private Allocation mExportVar_aInt3;
    public synchronized void set_aInt3(Allocation v) {
        setVar(mExportVarIdx_aInt3, v);
        mExportVar_aInt3 = v;
    }

    public Allocation get_aInt3() {
        return mExportVar_aInt3;
    }

    public Script.FieldID getFieldID_aInt3() {
        return createFieldID(mExportVarIdx_aInt3, null);
    }

    private final static int mExportVarIdx_aInt4 = 82;
    private Allocation mExportVar_aInt4;
    public synchronized void set_aInt4(Allocation v) {
        setVar(mExportVarIdx_aInt4, v);
        mExportVar_aInt4 = v;
    }

    public Allocation get_aInt4() {
        return mExportVar_aInt4;
    }

    public Script.FieldID getFieldID_aInt4() {
        return createFieldID(mExportVarIdx_aInt4, null);
    }

    private final static int mExportVarIdx_aUInt = 83;
    private Allocation mExportVar_aUInt;
    public synchronized void set_aUInt(Allocation v) {
        setVar(mExportVarIdx_aUInt, v);
        mExportVar_aUInt = v;
    }

    public Allocation get_aUInt() {
        return mExportVar_aUInt;
    }

    public Script.FieldID getFieldID_aUInt() {
        return createFieldID(mExportVarIdx_aUInt, null);
    }

    private final static int mExportVarIdx_aUInt2 = 84;
    private Allocation mExportVar_aUInt2;
    public synchronized void set_aUInt2(Allocation v) {
        setVar(mExportVarIdx_aUInt2, v);
        mExportVar_aUInt2 = v;
    }

    public Allocation get_aUInt2() {
        return mExportVar_aUInt2;
    }

    public Script.FieldID getFieldID_aUInt2() {
        return createFieldID(mExportVarIdx_aUInt2, null);
    }

    private final static int mExportVarIdx_aUInt3 = 85;
    private Allocation mExportVar_aUInt3;
    public synchronized void set_aUInt3(Allocation v) {
        setVar(mExportVarIdx_aUInt3, v);
        mExportVar_aUInt3 = v;
    }

    public Allocation get_aUInt3() {
        return mExportVar_aUInt3;
    }

    public Script.FieldID getFieldID_aUInt3() {
        return createFieldID(mExportVarIdx_aUInt3, null);
    }

    private final static int mExportVarIdx_aUInt4 = 86;
    private Allocation mExportVar_aUInt4;
    public synchronized void set_aUInt4(Allocation v) {
        setVar(mExportVarIdx_aUInt4, v);
        mExportVar_aUInt4 = v;
    }

    public Allocation get_aUInt4() {
        return mExportVar_aUInt4;
    }

    public Script.FieldID getFieldID_aUInt4() {
        return createFieldID(mExportVarIdx_aUInt4, null);
    }

    private final static int mExportVarIdx_aLong = 87;
    private Allocation mExportVar_aLong;
    public synchronized void set_aLong(Allocation v) {
        setVar(mExportVarIdx_aLong, v);
        mExportVar_aLong = v;
    }

    public Allocation get_aLong() {
        return mExportVar_aLong;
    }

    public Script.FieldID getFieldID_aLong() {
        return createFieldID(mExportVarIdx_aLong, null);
    }

    private final static int mExportVarIdx_aLong2 = 88;
    private Allocation mExportVar_aLong2;
    public synchronized void set_aLong2(Allocation v) {
        setVar(mExportVarIdx_aLong2, v);
        mExportVar_aLong2 = v;
    }

    public Allocation get_aLong2() {
        return mExportVar_aLong2;
    }

    public Script.FieldID getFieldID_aLong2() {
        return createFieldID(mExportVarIdx_aLong2, null);
    }

    private final static int mExportVarIdx_aLong3 = 89;
    private Allocation mExportVar_aLong3;
    public synchronized void set_aLong3(Allocation v) {
        setVar(mExportVarIdx_aLong3, v);
        mExportVar_aLong3 = v;
    }

    public Allocation get_aLong3() {
        return mExportVar_aLong3;
    }

    public Script.FieldID getFieldID_aLong3() {
        return createFieldID(mExportVarIdx_aLong3, null);
    }

    private final static int mExportVarIdx_aLong4 = 90;
    private Allocation mExportVar_aLong4;
    public synchronized void set_aLong4(Allocation v) {
        setVar(mExportVarIdx_aLong4, v);
        mExportVar_aLong4 = v;
    }

    public Allocation get_aLong4() {
        return mExportVar_aLong4;
    }

    public Script.FieldID getFieldID_aLong4() {
        return createFieldID(mExportVarIdx_aLong4, null);
    }

    private final static int mExportVarIdx_aULong = 91;
    private Allocation mExportVar_aULong;
    public synchronized void set_aULong(Allocation v) {
        setVar(mExportVarIdx_aULong, v);
        mExportVar_aULong = v;
    }

    public Allocation get_aULong() {
        return mExportVar_aULong;
    }

    public Script.FieldID getFieldID_aULong() {
        return createFieldID(mExportVarIdx_aULong, null);
    }

    private final static int mExportVarIdx_aULong2 = 92;
    private Allocation mExportVar_aULong2;
    public synchronized void set_aULong2(Allocation v) {
        setVar(mExportVarIdx_aULong2, v);
        mExportVar_aULong2 = v;
    }

    public Allocation get_aULong2() {
        return mExportVar_aULong2;
    }

    public Script.FieldID getFieldID_aULong2() {
        return createFieldID(mExportVarIdx_aULong2, null);
    }

    private final static int mExportVarIdx_aULong3 = 93;
    private Allocation mExportVar_aULong3;
    public synchronized void set_aULong3(Allocation v) {
        setVar(mExportVarIdx_aULong3, v);
        mExportVar_aULong3 = v;
    }

    public Allocation get_aULong3() {
        return mExportVar_aULong3;
    }

    public Script.FieldID getFieldID_aULong3() {
        return createFieldID(mExportVarIdx_aULong3, null);
    }

    private final static int mExportVarIdx_aULong4 = 94;
    private Allocation mExportVar_aULong4;
    public synchronized void set_aULong4(Allocation v) {
        setVar(mExportVarIdx_aULong4, v);
        mExportVar_aULong4 = v;
    }

    public Allocation get_aULong4() {
        return mExportVar_aULong4;
    }

    public Script.FieldID getFieldID_aULong4() {
        return createFieldID(mExportVarIdx_aULong4, null);
    }

    private final static int mExportVarIdx_aFloat = 95;
    private Allocation mExportVar_aFloat;
    public synchronized void set_aFloat(Allocation v) {
        setVar(mExportVarIdx_aFloat, v);
        mExportVar_aFloat = v;
    }

    public Allocation get_aFloat() {
        return mExportVar_aFloat;
    }

    public Script.FieldID getFieldID_aFloat() {
        return createFieldID(mExportVarIdx_aFloat, null);
    }

    private final static int mExportVarIdx_aFloat2 = 96;
    private Allocation mExportVar_aFloat2;
    public synchronized void set_aFloat2(Allocation v) {
        setVar(mExportVarIdx_aFloat2, v);
        mExportVar_aFloat2 = v;
    }

    public Allocation get_aFloat2() {
        return mExportVar_aFloat2;
    }

    public Script.FieldID getFieldID_aFloat2() {
        return createFieldID(mExportVarIdx_aFloat2, null);
    }

    private final static int mExportVarIdx_aFloat3 = 97;
    private Allocation mExportVar_aFloat3;
    public synchronized void set_aFloat3(Allocation v) {
        setVar(mExportVarIdx_aFloat3, v);
        mExportVar_aFloat3 = v;
    }

    public Allocation get_aFloat3() {
        return mExportVar_aFloat3;
    }

    public Script.FieldID getFieldID_aFloat3() {
        return createFieldID(mExportVarIdx_aFloat3, null);
    }

    private final static int mExportVarIdx_aFloat4 = 98;
    private Allocation mExportVar_aFloat4;
    public synchronized void set_aFloat4(Allocation v) {
        setVar(mExportVarIdx_aFloat4, v);
        mExportVar_aFloat4 = v;
    }

    public Allocation get_aFloat4() {
        return mExportVar_aFloat4;
    }

    public Script.FieldID getFieldID_aFloat4() {
        return createFieldID(mExportVarIdx_aFloat4, null);
    }

    private final static int mExportVarIdx_aDouble = 99;
    private Allocation mExportVar_aDouble;
    public synchronized void set_aDouble(Allocation v) {
        setVar(mExportVarIdx_aDouble, v);
        mExportVar_aDouble = v;
    }

    public Allocation get_aDouble() {
        return mExportVar_aDouble;
    }

    public Script.FieldID getFieldID_aDouble() {
        return createFieldID(mExportVarIdx_aDouble, null);
    }

    private final static int mExportVarIdx_aDouble2 = 100;
    private Allocation mExportVar_aDouble2;
    public synchronized void set_aDouble2(Allocation v) {
        setVar(mExportVarIdx_aDouble2, v);
        mExportVar_aDouble2 = v;
    }

    public Allocation get_aDouble2() {
        return mExportVar_aDouble2;
    }

    public Script.FieldID getFieldID_aDouble2() {
        return createFieldID(mExportVarIdx_aDouble2, null);
    }

    private final static int mExportVarIdx_aDouble3 = 101;
    private Allocation mExportVar_aDouble3;
    public synchronized void set_aDouble3(Allocation v) {
        setVar(mExportVarIdx_aDouble3, v);
        mExportVar_aDouble3 = v;
    }

    public Allocation get_aDouble3() {
        return mExportVar_aDouble3;
    }

    public Script.FieldID getFieldID_aDouble3() {
        return createFieldID(mExportVarIdx_aDouble3, null);
    }

    private final static int mExportVarIdx_aDouble4 = 102;
    private Allocation mExportVar_aDouble4;
    public synchronized void set_aDouble4(Allocation v) {
        setVar(mExportVarIdx_aDouble4, v);
        mExportVar_aDouble4 = v;
    }

    public Allocation get_aDouble4() {
        return mExportVar_aDouble4;
    }

    public Script.FieldID getFieldID_aDouble4() {
        return createFieldID(mExportVarIdx_aDouble4, null);
    }

    private final static int mExportVarIdx_m2x2 = 103;
    private Matrix2f mExportVar_m2x2;
    public synchronized void set_m2x2(Matrix2f v) {
        mExportVar_m2x2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addMatrix(v);
        setVar(mExportVarIdx_m2x2, fp);
    }

    public Matrix2f get_m2x2() {
        return mExportVar_m2x2;
    }

    public Script.FieldID getFieldID_m2x2() {
        return createFieldID(mExportVarIdx_m2x2, null);
    }

    private final static int mExportVarIdx_m3x3 = 104;
    private Matrix3f mExportVar_m3x3;
    public synchronized void set_m3x3(Matrix3f v) {
        mExportVar_m3x3 = v;
        FieldPacker fp = new FieldPacker(36);
        fp.addMatrix(v);
        setVar(mExportVarIdx_m3x3, fp);
    }

    public Matrix3f get_m3x3() {
        return mExportVar_m3x3;
    }

    public Script.FieldID getFieldID_m3x3() {
        return createFieldID(mExportVarIdx_m3x3, null);
    }

    private final static int mExportVarIdx_m4x4 = 105;
    private Matrix4f mExportVar_m4x4;
    public synchronized void set_m4x4(Matrix4f v) {
        mExportVar_m4x4 = v;
        FieldPacker fp = new FieldPacker(64);
        fp.addMatrix(v);
        setVar(mExportVarIdx_m4x4, fp);
    }

    public Matrix4f get_m4x4() {
        return mExportVar_m4x4;
    }

    public Script.FieldID getFieldID_m4x4() {
        return createFieldID(mExportVarIdx_m4x4, null);
    }

    private final static int mExportFuncIdx_check_api_presence = 0;
    public void invoke_check_api_presence() {
        invoke(mExportFuncIdx_check_api_presence);
    }

    private final static int mExportFuncIdx_api_test = 1;
    public void invoke_api_test() {
        invoke(mExportFuncIdx_api_test);
    }

}

