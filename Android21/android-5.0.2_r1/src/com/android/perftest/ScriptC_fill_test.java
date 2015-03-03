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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/PerfTest/src/com/android/perftest/fill_test.rs
 */

package com.android.perftest;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_fill_test extends ScriptC {
    private static final String __rs_resource_name = "fill_test";
    // Constructor
    public  ScriptC_fill_test(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_fill_test(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __SAMPLER = Element.SAMPLER(rs);
    }

    private Element __ALLOCATION;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private Element __SAMPLER;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_STORE;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
    private FieldPacker __rs_fp_SAMPLER;
    private final static int mExportVarIdx_gProgVertex = 0;
    private ProgramVertex mExportVar_gProgVertex;
    public synchronized void set_gProgVertex(ProgramVertex v) {
        setVar(mExportVarIdx_gProgVertex, v);
        mExportVar_gProgVertex = v;
    }

    public ProgramVertex get_gProgVertex() {
        return mExportVar_gProgVertex;
    }

    public Script.FieldID getFieldID_gProgVertex() {
        return createFieldID(mExportVarIdx_gProgVertex, null);
    }

    private final static int mExportVarIdx_gProgFragmentTexture = 1;
    private ProgramFragment mExportVar_gProgFragmentTexture;
    public synchronized void set_gProgFragmentTexture(ProgramFragment v) {
        setVar(mExportVarIdx_gProgFragmentTexture, v);
        mExportVar_gProgFragmentTexture = v;
    }

    public ProgramFragment get_gProgFragmentTexture() {
        return mExportVar_gProgFragmentTexture;
    }

    public Script.FieldID getFieldID_gProgFragmentTexture() {
        return createFieldID(mExportVarIdx_gProgFragmentTexture, null);
    }

    private final static int mExportVarIdx_gProgFragmentTextureModulate = 2;
    private ProgramFragment mExportVar_gProgFragmentTextureModulate;
    public synchronized void set_gProgFragmentTextureModulate(ProgramFragment v) {
        setVar(mExportVarIdx_gProgFragmentTextureModulate, v);
        mExportVar_gProgFragmentTextureModulate = v;
    }

    public ProgramFragment get_gProgFragmentTextureModulate() {
        return mExportVar_gProgFragmentTextureModulate;
    }

    public Script.FieldID getFieldID_gProgFragmentTextureModulate() {
        return createFieldID(mExportVarIdx_gProgFragmentTextureModulate, null);
    }

    private final static int mExportVarIdx_gProgFragmentMultitex = 3;
    private ProgramFragment mExportVar_gProgFragmentMultitex;
    public synchronized void set_gProgFragmentMultitex(ProgramFragment v) {
        setVar(mExportVarIdx_gProgFragmentMultitex, v);
        mExportVar_gProgFragmentMultitex = v;
    }

    public ProgramFragment get_gProgFragmentMultitex() {
        return mExportVar_gProgFragmentMultitex;
    }

    public Script.FieldID getFieldID_gProgFragmentMultitex() {
        return createFieldID(mExportVarIdx_gProgFragmentMultitex, null);
    }

    private final static int mExportVarIdx_gProgStoreBlendNone = 4;
    private ProgramStore mExportVar_gProgStoreBlendNone;
    public synchronized void set_gProgStoreBlendNone(ProgramStore v) {
        setVar(mExportVarIdx_gProgStoreBlendNone, v);
        mExportVar_gProgStoreBlendNone = v;
    }

    public ProgramStore get_gProgStoreBlendNone() {
        return mExportVar_gProgStoreBlendNone;
    }

    public Script.FieldID getFieldID_gProgStoreBlendNone() {
        return createFieldID(mExportVarIdx_gProgStoreBlendNone, null);
    }

    private final static int mExportVarIdx_gProgStoreBlendAlpha = 5;
    private ProgramStore mExportVar_gProgStoreBlendAlpha;
    public synchronized void set_gProgStoreBlendAlpha(ProgramStore v) {
        setVar(mExportVarIdx_gProgStoreBlendAlpha, v);
        mExportVar_gProgStoreBlendAlpha = v;
    }

    public ProgramStore get_gProgStoreBlendAlpha() {
        return mExportVar_gProgStoreBlendAlpha;
    }

    public Script.FieldID getFieldID_gProgStoreBlendAlpha() {
        return createFieldID(mExportVarIdx_gProgStoreBlendAlpha, null);
    }

    private final static int mExportVarIdx_gTexOpaque = 6;
    private Allocation mExportVar_gTexOpaque;
    public synchronized void set_gTexOpaque(Allocation v) {
        setVar(mExportVarIdx_gTexOpaque, v);
        mExportVar_gTexOpaque = v;
    }

    public Allocation get_gTexOpaque() {
        return mExportVar_gTexOpaque;
    }

    public Script.FieldID getFieldID_gTexOpaque() {
        return createFieldID(mExportVarIdx_gTexOpaque, null);
    }

    private final static int mExportVarIdx_gTexTorus = 7;
    private Allocation mExportVar_gTexTorus;
    public synchronized void set_gTexTorus(Allocation v) {
        setVar(mExportVarIdx_gTexTorus, v);
        mExportVar_gTexTorus = v;
    }

    public Allocation get_gTexTorus() {
        return mExportVar_gTexTorus;
    }

    public Script.FieldID getFieldID_gTexTorus() {
        return createFieldID(mExportVarIdx_gTexTorus, null);
    }

    private final static int mExportVarIdx_gTexTransparent = 8;
    private Allocation mExportVar_gTexTransparent;
    public synchronized void set_gTexTransparent(Allocation v) {
        setVar(mExportVarIdx_gTexTransparent, v);
        mExportVar_gTexTransparent = v;
    }

    public Allocation get_gTexTransparent() {
        return mExportVar_gTexTransparent;
    }

    public Script.FieldID getFieldID_gTexTransparent() {
        return createFieldID(mExportVarIdx_gTexTransparent, null);
    }

    private final static int mExportVarIdx_gTexChecker = 9;
    private Allocation mExportVar_gTexChecker;
    public synchronized void set_gTexChecker(Allocation v) {
        setVar(mExportVarIdx_gTexChecker, v);
        mExportVar_gTexChecker = v;
    }

    public Allocation get_gTexChecker() {
        return mExportVar_gTexChecker;
    }

    public Script.FieldID getFieldID_gTexChecker() {
        return createFieldID(mExportVarIdx_gTexChecker, null);
    }

    private final static int mExportVarIdx_gLinearClamp = 10;
    private Sampler mExportVar_gLinearClamp;
    public synchronized void set_gLinearClamp(Sampler v) {
        setVar(mExportVarIdx_gLinearClamp, v);
        mExportVar_gLinearClamp = v;
    }

    public Sampler get_gLinearClamp() {
        return mExportVar_gLinearClamp;
    }

    public Script.FieldID getFieldID_gLinearClamp() {
        return createFieldID(mExportVarIdx_gLinearClamp, null);
    }

    private final static int mExportVarIdx_gLinearWrap = 11;
    private Sampler mExportVar_gLinearWrap;
    public synchronized void set_gLinearWrap(Sampler v) {
        setVar(mExportVarIdx_gLinearWrap, v);
        mExportVar_gLinearWrap = v;
    }

    public Sampler get_gLinearWrap() {
        return mExportVar_gLinearWrap;
    }

    public Script.FieldID getFieldID_gLinearWrap() {
        return createFieldID(mExportVarIdx_gLinearWrap, null);
    }

    private final static int mExportVarIdx_gData = 12;
    private ScriptField_FillTestData_s mExportVar_gData;
    public void bind_gData(ScriptField_FillTestData_s v) {
        mExportVar_gData = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gData);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gData);
    }

    public ScriptField_FillTestData_s get_gData() {
        return mExportVar_gData;
    }

    private final static int mExportVarIdx_gFragData = 13;
    private ScriptField_FillTestFragData_s mExportVar_gFragData;
    public void bind_gFragData(ScriptField_FillTestFragData_s v) {
        mExportVar_gFragData = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gFragData);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gFragData);
    }

    public ScriptField_FillTestFragData_s get_gFragData() {
        return mExportVar_gFragData;
    }

    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 31, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_root, ain, aout, null);
    }

}

