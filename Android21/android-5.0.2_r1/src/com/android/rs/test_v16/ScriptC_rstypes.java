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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_16/src/com/android/rs/test/rstypes.rs
 */

package com.android.rs.test_v16;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_rstypes extends ScriptC {
    private static final String __rs_resource_name = "rstypes";
    // Constructor
    public  ScriptC_rstypes(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_rstypes(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __ELEMENT = Element.ELEMENT(rs);
        __TYPE = Element.TYPE(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __SAMPLER = Element.SAMPLER(rs);
        __SCRIPT = Element.SCRIPT(rs);
        __MESH = Element.MESH(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_RASTER = Element.PROGRAM_RASTER(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __FONT = Element.FONT(rs);
    }

    private Element __ALLOCATION;
    private Element __ELEMENT;
    private Element __FONT;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_RASTER;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private Element __SAMPLER;
    private Element __SCRIPT;
    private Element __TYPE;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_ELEMENT;
    private FieldPacker __rs_fp_FONT;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_RASTER;
    private FieldPacker __rs_fp_PROGRAM_STORE;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
    private FieldPacker __rs_fp_SAMPLER;
    private FieldPacker __rs_fp_SCRIPT;
    private FieldPacker __rs_fp_TYPE;
    private final static int mExportVarIdx_elementTest = 0;
    private Element mExportVar_elementTest;
    public synchronized void set_elementTest(Element v) {
        setVar(mExportVarIdx_elementTest, v);
        mExportVar_elementTest = v;
    }

    public Element get_elementTest() {
        return mExportVar_elementTest;
    }

    private final static int mExportVarIdx_typeTest = 1;
    private Type mExportVar_typeTest;
    public synchronized void set_typeTest(Type v) {
        setVar(mExportVarIdx_typeTest, v);
        mExportVar_typeTest = v;
    }

    public Type get_typeTest() {
        return mExportVar_typeTest;
    }

    private final static int mExportVarIdx_allocationTest = 2;
    private Allocation mExportVar_allocationTest;
    public synchronized void set_allocationTest(Allocation v) {
        setVar(mExportVarIdx_allocationTest, v);
        mExportVar_allocationTest = v;
    }

    public Allocation get_allocationTest() {
        return mExportVar_allocationTest;
    }

    private final static int mExportVarIdx_samplerTest = 3;
    private Sampler mExportVar_samplerTest;
    public synchronized void set_samplerTest(Sampler v) {
        setVar(mExportVarIdx_samplerTest, v);
        mExportVar_samplerTest = v;
    }

    public Sampler get_samplerTest() {
        return mExportVar_samplerTest;
    }

    private final static int mExportVarIdx_scriptTest = 4;
    private Script mExportVar_scriptTest;
    public synchronized void set_scriptTest(Script v) {
        setVar(mExportVarIdx_scriptTest, v);
        mExportVar_scriptTest = v;
    }

    public Script get_scriptTest() {
        return mExportVar_scriptTest;
    }

    private final static int mExportVarIdx_meshTest = 5;
    private Mesh mExportVar_meshTest;
    public synchronized void set_meshTest(Mesh v) {
        setVar(mExportVarIdx_meshTest, v);
        mExportVar_meshTest = v;
    }

    public Mesh get_meshTest() {
        return mExportVar_meshTest;
    }

    private final static int mExportVarIdx_program_fragmentTest = 6;
    private ProgramFragment mExportVar_program_fragmentTest;
    public synchronized void set_program_fragmentTest(ProgramFragment v) {
        setVar(mExportVarIdx_program_fragmentTest, v);
        mExportVar_program_fragmentTest = v;
    }

    public ProgramFragment get_program_fragmentTest() {
        return mExportVar_program_fragmentTest;
    }

    private final static int mExportVarIdx_program_vertexTest = 7;
    private ProgramVertex mExportVar_program_vertexTest;
    public synchronized void set_program_vertexTest(ProgramVertex v) {
        setVar(mExportVarIdx_program_vertexTest, v);
        mExportVar_program_vertexTest = v;
    }

    public ProgramVertex get_program_vertexTest() {
        return mExportVar_program_vertexTest;
    }

    private final static int mExportVarIdx_program_rasterTest = 8;
    private ProgramRaster mExportVar_program_rasterTest;
    public synchronized void set_program_rasterTest(ProgramRaster v) {
        setVar(mExportVarIdx_program_rasterTest, v);
        mExportVar_program_rasterTest = v;
    }

    public ProgramRaster get_program_rasterTest() {
        return mExportVar_program_rasterTest;
    }

    private final static int mExportVarIdx_program_storeTest = 9;
    private ProgramStore mExportVar_program_storeTest;
    public synchronized void set_program_storeTest(ProgramStore v) {
        setVar(mExportVarIdx_program_storeTest, v);
        mExportVar_program_storeTest = v;
    }

    public ProgramStore get_program_storeTest() {
        return mExportVar_program_storeTest;
    }

    private final static int mExportVarIdx_fontTest = 10;
    private Font mExportVar_fontTest;
    public synchronized void set_fontTest(Font v) {
        setVar(mExportVarIdx_fontTest, v);
        mExportVar_fontTest = v;
    }

    public Font get_fontTest() {
        return mExportVar_fontTest;
    }

    private final static int mExportVarIdx_matrix4x4Test = 11;
    private Matrix4f mExportVar_matrix4x4Test;
    public synchronized void set_matrix4x4Test(Matrix4f v) {
        mExportVar_matrix4x4Test = v;
        FieldPacker fp = new FieldPacker(64);
        fp.addMatrix(v);
        setVar(mExportVarIdx_matrix4x4Test, fp);
    }

    public Matrix4f get_matrix4x4Test() {
        return mExportVar_matrix4x4Test;
    }

    private final static int mExportVarIdx_matrix3x3Test = 12;
    private Matrix3f mExportVar_matrix3x3Test;
    public synchronized void set_matrix3x3Test(Matrix3f v) {
        mExportVar_matrix3x3Test = v;
        FieldPacker fp = new FieldPacker(36);
        fp.addMatrix(v);
        setVar(mExportVarIdx_matrix3x3Test, fp);
    }

    public Matrix3f get_matrix3x3Test() {
        return mExportVar_matrix3x3Test;
    }

    private final static int mExportVarIdx_matrix2x2Test = 13;
    private Matrix2f mExportVar_matrix2x2Test;
    public synchronized void set_matrix2x2Test(Matrix2f v) {
        mExportVar_matrix2x2Test = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addMatrix(v);
        setVar(mExportVarIdx_matrix2x2Test, fp);
    }

    public Matrix2f get_matrix2x2Test() {
        return mExportVar_matrix2x2Test;
    }

    private final static int mExportFuncIdx_test_rstypes = 0;
    public void invoke_test_rstypes(long index, int test_num) {
        FieldPacker test_rstypes_fp = new FieldPacker(8);
        test_rstypes_fp.addU32(index);
        test_rstypes_fp.addI32(test_num);
        invoke(mExportFuncIdx_test_rstypes, test_rstypes_fp);
    }

}

