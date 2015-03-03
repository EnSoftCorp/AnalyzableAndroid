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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/PerfTest/src/com/android/perftest/torus_test.rs
 */

package com.android.perftest;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_torus_test extends ScriptC {
    private static final String __rs_resource_name = "torus_test";
    // Constructor
    public  ScriptC_torus_test(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_torus_test(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __MESH = Element.MESH(rs);
        __PROGRAM_RASTER = Element.PROGRAM_RASTER(rs);
        __SAMPLER = Element.SAMPLER(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_gLight0Rotation = 0.f;
        __F32 = Element.F32(rs);
        mExportVar_gLight1Rotation = 0.f;
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_RASTER;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private Element __SAMPLER;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_RASTER;
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

    private final static int mExportVarIdx_gProgFragmentColor = 1;
    private ProgramFragment mExportVar_gProgFragmentColor;
    public synchronized void set_gProgFragmentColor(ProgramFragment v) {
        setVar(mExportVarIdx_gProgFragmentColor, v);
        mExportVar_gProgFragmentColor = v;
    }

    public ProgramFragment get_gProgFragmentColor() {
        return mExportVar_gProgFragmentColor;
    }

    public Script.FieldID getFieldID_gProgFragmentColor() {
        return createFieldID(mExportVarIdx_gProgFragmentColor, null);
    }

    private final static int mExportVarIdx_gProgFragmentTexture = 2;
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

    private final static int mExportVarIdx_gProgStoreBlendNoneDepth = 3;
    private ProgramStore mExportVar_gProgStoreBlendNoneDepth;
    public synchronized void set_gProgStoreBlendNoneDepth(ProgramStore v) {
        setVar(mExportVarIdx_gProgStoreBlendNoneDepth, v);
        mExportVar_gProgStoreBlendNoneDepth = v;
    }

    public ProgramStore get_gProgStoreBlendNoneDepth() {
        return mExportVar_gProgStoreBlendNoneDepth;
    }

    public Script.FieldID getFieldID_gProgStoreBlendNoneDepth() {
        return createFieldID(mExportVarIdx_gProgStoreBlendNoneDepth, null);
    }

    private final static int mExportVarIdx_gTorusMesh = 4;
    private Mesh mExportVar_gTorusMesh;
    public synchronized void set_gTorusMesh(Mesh v) {
        setVar(mExportVarIdx_gTorusMesh, v);
        mExportVar_gTorusMesh = v;
    }

    public Mesh get_gTorusMesh() {
        return mExportVar_gTorusMesh;
    }

    public Script.FieldID getFieldID_gTorusMesh() {
        return createFieldID(mExportVarIdx_gTorusMesh, null);
    }

    private final static int mExportVarIdx_gCullBack = 5;
    private ProgramRaster mExportVar_gCullBack;
    public synchronized void set_gCullBack(ProgramRaster v) {
        setVar(mExportVarIdx_gCullBack, v);
        mExportVar_gCullBack = v;
    }

    public ProgramRaster get_gCullBack() {
        return mExportVar_gCullBack;
    }

    public Script.FieldID getFieldID_gCullBack() {
        return createFieldID(mExportVarIdx_gCullBack, null);
    }

    private final static int mExportVarIdx_gCullFront = 6;
    private ProgramRaster mExportVar_gCullFront;
    public synchronized void set_gCullFront(ProgramRaster v) {
        setVar(mExportVarIdx_gCullFront, v);
        mExportVar_gCullFront = v;
    }

    public ProgramRaster get_gCullFront() {
        return mExportVar_gCullFront;
    }

    public Script.FieldID getFieldID_gCullFront() {
        return createFieldID(mExportVarIdx_gCullFront, null);
    }

    private final static int mExportVarIdx_gVSConstants = 7;
    private ScriptField_VertexShaderConstants_s mExportVar_gVSConstants;
    public void bind_gVSConstants(ScriptField_VertexShaderConstants_s v) {
        mExportVar_gVSConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gVSConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gVSConstants);
    }

    public ScriptField_VertexShaderConstants_s get_gVSConstants() {
        return mExportVar_gVSConstants;
    }

    private final static int mExportVarIdx_gFSConstants = 8;
    private ScriptField_FragentShaderConstants_s mExportVar_gFSConstants;
    public void bind_gFSConstants(ScriptField_FragentShaderConstants_s v) {
        mExportVar_gFSConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gFSConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gFSConstants);
    }

    public ScriptField_FragentShaderConstants_s get_gFSConstants() {
        return mExportVar_gFSConstants;
    }

    private final static int mExportVarIdx_gVSConstPixel = 9;
    private ScriptField_VertexShaderConstants3_s mExportVar_gVSConstPixel;
    public void bind_gVSConstPixel(ScriptField_VertexShaderConstants3_s v) {
        mExportVar_gVSConstPixel = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gVSConstPixel);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gVSConstPixel);
    }

    public ScriptField_VertexShaderConstants3_s get_gVSConstPixel() {
        return mExportVar_gVSConstPixel;
    }

    private final static int mExportVarIdx_gFSConstPixel = 10;
    private ScriptField_FragentShaderConstants3_s mExportVar_gFSConstPixel;
    public void bind_gFSConstPixel(ScriptField_FragentShaderConstants3_s v) {
        mExportVar_gFSConstPixel = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gFSConstPixel);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gFSConstPixel);
    }

    public ScriptField_FragentShaderConstants3_s get_gFSConstPixel() {
        return mExportVar_gFSConstPixel;
    }

    private final static int mExportVarIdx_gProgVertexCustom = 11;
    private ProgramVertex mExportVar_gProgVertexCustom;
    public synchronized void set_gProgVertexCustom(ProgramVertex v) {
        setVar(mExportVarIdx_gProgVertexCustom, v);
        mExportVar_gProgVertexCustom = v;
    }

    public ProgramVertex get_gProgVertexCustom() {
        return mExportVar_gProgVertexCustom;
    }

    public Script.FieldID getFieldID_gProgVertexCustom() {
        return createFieldID(mExportVarIdx_gProgVertexCustom, null);
    }

    private final static int mExportVarIdx_gProgFragmentCustom = 12;
    private ProgramFragment mExportVar_gProgFragmentCustom;
    public synchronized void set_gProgFragmentCustom(ProgramFragment v) {
        setVar(mExportVarIdx_gProgFragmentCustom, v);
        mExportVar_gProgFragmentCustom = v;
    }

    public ProgramFragment get_gProgFragmentCustom() {
        return mExportVar_gProgFragmentCustom;
    }

    public Script.FieldID getFieldID_gProgFragmentCustom() {
        return createFieldID(mExportVarIdx_gProgFragmentCustom, null);
    }

    private final static int mExportVarIdx_gLinearClamp = 13;
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

    private final static int mExportVarIdx_gTexTorus = 14;
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

    private final static int mExportVarIdx_gProgVertexPixelLight = 15;
    private ProgramVertex mExportVar_gProgVertexPixelLight;
    public synchronized void set_gProgVertexPixelLight(ProgramVertex v) {
        setVar(mExportVarIdx_gProgVertexPixelLight, v);
        mExportVar_gProgVertexPixelLight = v;
    }

    public ProgramVertex get_gProgVertexPixelLight() {
        return mExportVar_gProgVertexPixelLight;
    }

    public Script.FieldID getFieldID_gProgVertexPixelLight() {
        return createFieldID(mExportVarIdx_gProgVertexPixelLight, null);
    }

    private final static int mExportVarIdx_gProgVertexPixelLightMove = 16;
    private ProgramVertex mExportVar_gProgVertexPixelLightMove;
    public synchronized void set_gProgVertexPixelLightMove(ProgramVertex v) {
        setVar(mExportVarIdx_gProgVertexPixelLightMove, v);
        mExportVar_gProgVertexPixelLightMove = v;
    }

    public ProgramVertex get_gProgVertexPixelLightMove() {
        return mExportVar_gProgVertexPixelLightMove;
    }

    public Script.FieldID getFieldID_gProgVertexPixelLightMove() {
        return createFieldID(mExportVarIdx_gProgVertexPixelLightMove, null);
    }

    private final static int mExportVarIdx_gProgFragmentPixelLight = 17;
    private ProgramFragment mExportVar_gProgFragmentPixelLight;
    public synchronized void set_gProgFragmentPixelLight(ProgramFragment v) {
        setVar(mExportVarIdx_gProgFragmentPixelLight, v);
        mExportVar_gProgFragmentPixelLight = v;
    }

    public ProgramFragment get_gProgFragmentPixelLight() {
        return mExportVar_gProgFragmentPixelLight;
    }

    public Script.FieldID getFieldID_gProgFragmentPixelLight() {
        return createFieldID(mExportVarIdx_gProgFragmentPixelLight, null);
    }

    private final static int mExportVarIdx_gData = 18;
    private ScriptField_TorusTestData_s mExportVar_gData;
    public void bind_gData(ScriptField_TorusTestData_s v) {
        mExportVar_gData = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gData);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gData);
    }

    public ScriptField_TorusTestData_s get_gData() {
        return mExportVar_gData;
    }

    private final static int mExportVarIdx_gLight0Rotation = 19;
    private float mExportVar_gLight0Rotation;
    public synchronized void set_gLight0Rotation(float v) {
        setVar(mExportVarIdx_gLight0Rotation, v);
        mExportVar_gLight0Rotation = v;
    }

    public float get_gLight0Rotation() {
        return mExportVar_gLight0Rotation;
    }

    public Script.FieldID getFieldID_gLight0Rotation() {
        return createFieldID(mExportVarIdx_gLight0Rotation, null);
    }

    private final static int mExportVarIdx_gLight1Rotation = 20;
    private float mExportVar_gLight1Rotation;
    public synchronized void set_gLight1Rotation(float v) {
        setVar(mExportVarIdx_gLight1Rotation, v);
        mExportVar_gLight1Rotation = v;
    }

    public float get_gLight1Rotation() {
        return mExportVar_gLight1Rotation;
    }

    public Script.FieldID getFieldID_gLight1Rotation() {
        return createFieldID(mExportVarIdx_gLight1Rotation, null);
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

