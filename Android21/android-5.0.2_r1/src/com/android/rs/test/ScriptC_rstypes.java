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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/rstypes.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.rstypesBitCode;

/**
 * @hide
 */
public class ScriptC_rstypes extends ScriptC {
    private static final String __rs_resource_name = "rstypes";
    // Constructor
    public  ScriptC_rstypes(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              rstypesBitCode.getBitCode32(),
              rstypesBitCode.getBitCode64());
        __ELEMENT = Element.ELEMENT(rs);
        __TYPE = Element.TYPE(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __SAMPLER = Element.SAMPLER(rs);
        __SCRIPT = Element.SCRIPT(rs);
    }

    private Element __ALLOCATION;
    private Element __ELEMENT;
    private Element __SAMPLER;
    private Element __SCRIPT;
    private Element __TYPE;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_ELEMENT;
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

    public Script.FieldID getFieldID_elementTest() {
        return createFieldID(mExportVarIdx_elementTest, null);
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

    public Script.FieldID getFieldID_typeTest() {
        return createFieldID(mExportVarIdx_typeTest, null);
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

    public Script.FieldID getFieldID_allocationTest() {
        return createFieldID(mExportVarIdx_allocationTest, null);
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

    public Script.FieldID getFieldID_samplerTest() {
        return createFieldID(mExportVarIdx_samplerTest, null);
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

    public Script.FieldID getFieldID_scriptTest() {
        return createFieldID(mExportVarIdx_scriptTest, null);
    }

    private final static int mExportVarIdx_matrix4x4Test = 5;
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

    public Script.FieldID getFieldID_matrix4x4Test() {
        return createFieldID(mExportVarIdx_matrix4x4Test, null);
    }

    private final static int mExportVarIdx_matrix3x3Test = 6;
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

    public Script.FieldID getFieldID_matrix3x3Test() {
        return createFieldID(mExportVarIdx_matrix3x3Test, null);
    }

    private final static int mExportVarIdx_matrix2x2Test = 7;
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

    public Script.FieldID getFieldID_matrix2x2Test() {
        return createFieldID(mExportVarIdx_matrix2x2Test, null);
    }

    private final static int mExportFuncIdx_test_rstypes = 0;
    public void invoke_test_rstypes(long index, int test_num) {
        FieldPacker test_rstypes_fp = new FieldPacker(8);
        test_rstypes_fp.addU32(index);
        test_rstypes_fp.addI32(test_num);
        invoke(mExportFuncIdx_test_rstypes, test_rstypes_fp);
    }

}

