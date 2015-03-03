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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/ModelViewer/src/com/android/modelviewer/simplemodel.rs
 */

package com.android.modelviewer;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_simplemodel extends ScriptC {
    private static final String __rs_resource_name = "simplemodel";
    // Constructor
    public  ScriptC_simplemodel(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_simplemodel(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __FONT = Element.FONT(rs);
    }

    private Element __ALLOCATION;
    private Element __FONT;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_FONT;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_STORE;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
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

    private final static int mExportVarIdx_gTGrid = 2;
    private Allocation mExportVar_gTGrid;
    public synchronized void set_gTGrid(Allocation v) {
        setVar(mExportVarIdx_gTGrid, v);
        mExportVar_gTGrid = v;
    }

    public Allocation get_gTGrid() {
        return mExportVar_gTGrid;
    }

    public Script.FieldID getFieldID_gTGrid() {
        return createFieldID(mExportVarIdx_gTGrid, null);
    }

    private final static int mExportVarIdx_gPFSBackground = 3;
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

    private final static int mExportVarIdx_gItalic = 4;
    private Font mExportVar_gItalic;
    public synchronized void set_gItalic(Font v) {
        setVar(mExportVarIdx_gItalic, v);
        mExportVar_gItalic = v;
    }

    public Font get_gItalic() {
        return mExportVar_gItalic;
    }

    public Script.FieldID getFieldID_gItalic() {
        return createFieldID(mExportVarIdx_gItalic, null);
    }

    private final static int mExportVarIdx_gTextAlloc = 5;
    private Allocation mExportVar_gTextAlloc;
    public synchronized void set_gTextAlloc(Allocation v) {
        setVar(mExportVarIdx_gTextAlloc, v);
        mExportVar_gTextAlloc = v;
    }

    public Allocation get_gTextAlloc() {
        return mExportVar_gTextAlloc;
    }

    public Script.FieldID getFieldID_gTextAlloc() {
        return createFieldID(mExportVarIdx_gTextAlloc, null);
    }

    private final static int mExportVarIdx_gPostureMatrix = 6;
    private Matrix4f mExportVar_gPostureMatrix;
    public synchronized void set_gPostureMatrix(Matrix4f v) {
        mExportVar_gPostureMatrix = v;
        FieldPacker fp = new FieldPacker(64);
        fp.addMatrix(v);
        setVar(mExportVarIdx_gPostureMatrix, fp);
    }

    public Matrix4f get_gPostureMatrix() {
        return mExportVar_gPostureMatrix;
    }

    public Script.FieldID getFieldID_gPostureMatrix() {
        return createFieldID(mExportVarIdx_gPostureMatrix, null);
    }

    private final static int mExportVarIdx_gMeshes = 7;
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

    private final static int mExportFuncIdx_drawDescription = 4;
    public void invoke_drawDescription() {
        invoke(mExportFuncIdx_drawDescription);
    }

}

