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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/ShadersTest/src/com/android/shaderstest/shaderstest.rs
 */

package com.android.shaderstest;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_shaderstest extends ScriptC {
    private static final String __rs_resource_name = "shaderstest";
    // Constructor
    public  ScriptC_shaderstest(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_shaderstest(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __SAMPLER = Element.SAMPLER(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
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
    private final static int mExportVarIdx_gPVBackground = 0;
    private ProgramVertex mExportVar_gPVBackground;
    public synchronized void set_gPVBackground(ProgramVertex v) {
        setVar(mExportVarIdx_gPVBackground, v);
        mExportVar_gPVBackground = v;
    }

    public ProgramVertex get_gPVBackground() {
        return mExportVar_gPVBackground;
    }

    public Script.FieldID getFieldID_gPVBackground() {
        return createFieldID(mExportVarIdx_gPVBackground, null);
    }

    private final static int mExportVarIdx_gPFBackground = 1;
    private ProgramFragment mExportVar_gPFBackground;
    public synchronized void set_gPFBackground(ProgramFragment v) {
        setVar(mExportVarIdx_gPFBackground, v);
        mExportVar_gPFBackground = v;
    }

    public ProgramFragment get_gPFBackground() {
        return mExportVar_gPFBackground;
    }

    public Script.FieldID getFieldID_gPFBackground() {
        return createFieldID(mExportVarIdx_gPFBackground, null);
    }

    private final static int mExportVarIdx_gFSVignetteConstants = 2;
    private ScriptField_VignetteConstants_s mExportVar_gFSVignetteConstants;
    public void bind_gFSVignetteConstants(ScriptField_VignetteConstants_s v) {
        mExportVar_gFSVignetteConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gFSVignetteConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gFSVignetteConstants);
    }

    public ScriptField_VignetteConstants_s get_gFSVignetteConstants() {
        return mExportVar_gFSVignetteConstants;
    }

    private final static int mExportVarIdx_gPFVignette = 3;
    private ProgramFragment mExportVar_gPFVignette;
    public synchronized void set_gPFVignette(ProgramFragment v) {
        setVar(mExportVarIdx_gPFVignette, v);
        mExportVar_gPFVignette = v;
    }

    public ProgramFragment get_gPFVignette() {
        return mExportVar_gPFVignette;
    }

    public Script.FieldID getFieldID_gPFVignette() {
        return createFieldID(mExportVarIdx_gPFVignette, null);
    }

    private final static int mExportVarIdx_gTMesh = 4;
    private Allocation mExportVar_gTMesh;
    public synchronized void set_gTMesh(Allocation v) {
        setVar(mExportVarIdx_gTMesh, v);
        mExportVar_gTMesh = v;
    }

    public Allocation get_gTMesh() {
        return mExportVar_gTMesh;
    }

    public Script.FieldID getFieldID_gTMesh() {
        return createFieldID(mExportVarIdx_gTMesh, null);
    }

    private final static int mExportVarIdx_gLinear = 5;
    private Sampler mExportVar_gLinear;
    public synchronized void set_gLinear(Sampler v) {
        setVar(mExportVarIdx_gLinear, v);
        mExportVar_gLinear = v;
    }

    public Sampler get_gLinear() {
        return mExportVar_gLinear;
    }

    public Script.FieldID getFieldID_gLinear() {
        return createFieldID(mExportVarIdx_gLinear, null);
    }

    private final static int mExportVarIdx_gNearest = 6;
    private Sampler mExportVar_gNearest;
    public synchronized void set_gNearest(Sampler v) {
        setVar(mExportVarIdx_gNearest, v);
        mExportVar_gNearest = v;
    }

    public Sampler get_gNearest() {
        return mExportVar_gNearest;
    }

    public Script.FieldID getFieldID_gNearest() {
        return createFieldID(mExportVarIdx_gNearest, null);
    }

    private final static int mExportVarIdx_gPFSBackground = 7;
    private ProgramStore mExportVar_gPFSBackground;
    public synchronized void set_gPFSBackground(ProgramStore v) {
        setVar(mExportVarIdx_gPFSBackground, v);
        mExportVar_gPFSBackground = v;
    }

    public ProgramStore get_gPFSBackground() {
        return mExportVar_gPFSBackground;
    }

    public Script.FieldID getFieldID_gPFSBackground() {
        return createFieldID(mExportVarIdx_gPFSBackground, null);
    }

    private final static int mExportVarIdx_gScreenDepth = 8;
    private Allocation mExportVar_gScreenDepth;
    public synchronized void set_gScreenDepth(Allocation v) {
        setVar(mExportVarIdx_gScreenDepth, v);
        mExportVar_gScreenDepth = v;
    }

    public Allocation get_gScreenDepth() {
        return mExportVar_gScreenDepth;
    }

    public Script.FieldID getFieldID_gScreenDepth() {
        return createFieldID(mExportVarIdx_gScreenDepth, null);
    }

    private final static int mExportVarIdx_gScreen = 9;
    private Allocation mExportVar_gScreen;
    public synchronized void set_gScreen(Allocation v) {
        setVar(mExportVarIdx_gScreen, v);
        mExportVar_gScreen = v;
    }

    public Allocation get_gScreen() {
        return mExportVar_gScreen;
    }

    public Script.FieldID getFieldID_gScreen() {
        return createFieldID(mExportVarIdx_gScreen, null);
    }

    private final static int mExportVarIdx_gMeshes = 10;
    private ScriptField_MeshInfo mExportVar_gMeshes;
    public void bind_gMeshes(ScriptField_MeshInfo v) {
        mExportVar_gMeshes = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gMeshes);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gMeshes);
    }

    public ScriptField_MeshInfo get_gMeshes() {
        return mExportVar_gMeshes;
    }

    private final static int mExportFuncIdx_onActionDown = 0;
    public void invoke_onActionDown(float x, float y) {
        FieldPacker onActionDown_fp = new FieldPacker(8);
        onActionDown_fp.addF32(x);
        onActionDown_fp.addF32(y);
        invoke(mExportFuncIdx_onActionDown, onActionDown_fp);
    }

    private final static int mExportFuncIdx_onActionScale = 1;
    public void invoke_onActionScale(float scale) {
        FieldPacker onActionScale_fp = new FieldPacker(4);
        onActionScale_fp.addF32(scale);
        invoke(mExportFuncIdx_onActionScale, onActionScale_fp);
    }

    private final static int mExportFuncIdx_onActionMove = 2;
    public void invoke_onActionMove(float x, float y) {
        FieldPacker onActionMove_fp = new FieldPacker(8);
        onActionMove_fp.addF32(x);
        onActionMove_fp.addF32(y);
        invoke(mExportFuncIdx_onActionMove, onActionMove_fp);
    }

    private final static int mExportFuncIdx_updateMeshInfo = 3;
    public void invoke_updateMeshInfo() {
        invoke(mExportFuncIdx_updateMeshInfo);
    }

}

