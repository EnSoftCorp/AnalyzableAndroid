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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/ModelViewer/src/com/android/modelviewer/scenegraph.rs
 */

package com.android.modelviewer;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_scenegraph extends ScriptC {
    private static final String __rs_resource_name = "scenegraph";
    // Constructor
    public  ScriptC_scenegraph(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_scenegraph(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __MESH = Element.MESH(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __F32 = Element.F32(rs);
        __FONT = Element.FONT(rs);
        __SCRIPT = Element.SCRIPT(rs);
        __I32 = Element.I32(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __FONT;
    private Element __I32;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private Element __SCRIPT;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_FONT;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_STORE;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
    private FieldPacker __rs_fp_SCRIPT;
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

    private final static int mExportVarIdx_gTestMesh = 3;
    private Mesh mExportVar_gTestMesh;
    public synchronized void set_gTestMesh(Mesh v) {
        setVar(mExportVarIdx_gTestMesh, v);
        mExportVar_gTestMesh = v;
    }

    public Mesh get_gTestMesh() {
        return mExportVar_gTestMesh;
    }

    public Script.FieldID getFieldID_gTestMesh() {
        return createFieldID(mExportVarIdx_gTestMesh, null);
    }

    private final static int mExportVarIdx_gPFSBackground = 4;
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

    private final static int mExportVarIdx_gRotate = 5;
    private float mExportVar_gRotate;
    public synchronized void set_gRotate(float v) {
        setVar(mExportVarIdx_gRotate, v);
        mExportVar_gRotate = v;
    }

    public float get_gRotate() {
        return mExportVar_gRotate;
    }

    public Script.FieldID getFieldID_gRotate() {
        return createFieldID(mExportVarIdx_gRotate, null);
    }

    private final static int mExportVarIdx_gItalic = 6;
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

    private final static int mExportVarIdx_gTextAlloc = 7;
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

    private final static int mExportVarIdx_gTransformRS = 8;
    private Script mExportVar_gTransformRS;
    public synchronized void set_gTransformRS(Script v) {
        setVar(mExportVarIdx_gTransformRS, v);
        mExportVar_gTransformRS = v;
    }

    public Script get_gTransformRS() {
        return mExportVar_gTransformRS;
    }

    public Script.FieldID getFieldID_gTransformRS() {
        return createFieldID(mExportVarIdx_gTransformRS, null);
    }

    private final static int mExportVarIdx_gGroup = 9;
    private ScriptField_SgTransform mExportVar_gGroup;
    public void bind_gGroup(ScriptField_SgTransform v) {
        mExportVar_gGroup = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gGroup);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gGroup);
    }

    public ScriptField_SgTransform get_gGroup() {
        return mExportVar_gGroup;
    }

    private final static int mExportVarIdx_gRobot1 = 10;
    private ScriptField_SgTransform mExportVar_gRobot1;
    public void bind_gRobot1(ScriptField_SgTransform v) {
        mExportVar_gRobot1 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gRobot1);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gRobot1);
    }

    public ScriptField_SgTransform get_gRobot1() {
        return mExportVar_gRobot1;
    }

    private final static int mExportVarIdx_gRobot1Index = 11;
    private int mExportVar_gRobot1Index;
    public synchronized void set_gRobot1Index(int v) {
        setVar(mExportVarIdx_gRobot1Index, v);
        mExportVar_gRobot1Index = v;
    }

    public int get_gRobot1Index() {
        return mExportVar_gRobot1Index;
    }

    public Script.FieldID getFieldID_gRobot1Index() {
        return createFieldID(mExportVarIdx_gRobot1Index, null);
    }

    private final static int mExportVarIdx_gRobot2 = 12;
    private ScriptField_SgTransform mExportVar_gRobot2;
    public void bind_gRobot2(ScriptField_SgTransform v) {
        mExportVar_gRobot2 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gRobot2);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gRobot2);
    }

    public ScriptField_SgTransform get_gRobot2() {
        return mExportVar_gRobot2;
    }

    private final static int mExportVarIdx_gRobot2Index = 13;
    private int mExportVar_gRobot2Index;
    public synchronized void set_gRobot2Index(int v) {
        setVar(mExportVarIdx_gRobot2Index, v);
        mExportVar_gRobot2Index = v;
    }

    public int get_gRobot2Index() {
        return mExportVar_gRobot2Index;
    }

    public Script.FieldID getFieldID_gRobot2Index() {
        return createFieldID(mExportVarIdx_gRobot2Index, null);
    }

    private final static int mExportVarIdx_gRootNode = 14;
    private ScriptField_SgTransform mExportVar_gRootNode;
    public void bind_gRootNode(ScriptField_SgTransform v) {
        mExportVar_gRootNode = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gRootNode);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gRootNode);
    }

    public ScriptField_SgTransform get_gRootNode() {
        return mExportVar_gRootNode;
    }

}

