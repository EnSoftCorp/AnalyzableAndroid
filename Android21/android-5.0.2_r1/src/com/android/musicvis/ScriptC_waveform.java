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
 * The source Renderscript file: packages/wallpapers/MusicVisualization/src/com/android/musicvis/waveform.rs
 */

package com.android.musicvis;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_waveform extends ScriptC {
    private static final String __rs_resource_name = "waveform";
    // Constructor
    public  ScriptC_waveform(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_waveform(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __MESH = Element.MESH(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __I32;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_VERTEX;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
    private final static int mExportVarIdx_gYRotation = 0;
    private float mExportVar_gYRotation;
    public synchronized void set_gYRotation(float v) {
        setVar(mExportVarIdx_gYRotation, v);
        mExportVar_gYRotation = v;
    }

    public float get_gYRotation() {
        return mExportVar_gYRotation;
    }

    public Script.FieldID getFieldID_gYRotation() {
        return createFieldID(mExportVarIdx_gYRotation, null);
    }

    private final static int mExportVarIdx_gIdle = 1;
    private int mExportVar_gIdle;
    public synchronized void set_gIdle(int v) {
        setVar(mExportVarIdx_gIdle, v);
        mExportVar_gIdle = v;
    }

    public int get_gIdle() {
        return mExportVar_gIdle;
    }

    public Script.FieldID getFieldID_gIdle() {
        return createFieldID(mExportVarIdx_gIdle, null);
    }

    private final static int mExportVarIdx_gWaveCounter = 2;
    private int mExportVar_gWaveCounter;
    public synchronized void set_gWaveCounter(int v) {
        setVar(mExportVarIdx_gWaveCounter, v);
        mExportVar_gWaveCounter = v;
    }

    public int get_gWaveCounter() {
        return mExportVar_gWaveCounter;
    }

    public Script.FieldID getFieldID_gWaveCounter() {
        return createFieldID(mExportVarIdx_gWaveCounter, null);
    }

    private final static int mExportVarIdx_gWidth = 3;
    private int mExportVar_gWidth;
    public synchronized void set_gWidth(int v) {
        setVar(mExportVarIdx_gWidth, v);
        mExportVar_gWidth = v;
    }

    public int get_gWidth() {
        return mExportVar_gWidth;
    }

    public Script.FieldID getFieldID_gWidth() {
        return createFieldID(mExportVarIdx_gWidth, null);
    }

    private final static int mExportVarIdx_gPVBackground = 4;
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

    private final static int mExportVarIdx_gPFBackground = 5;
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

    private final static int mExportVarIdx_gPoints = 6;
    private ScriptField_Vertex mExportVar_gPoints;
    public void bind_gPoints(ScriptField_Vertex v) {
        mExportVar_gPoints = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gPoints);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gPoints);
    }

    public ScriptField_Vertex get_gPoints() {
        return mExportVar_gPoints;
    }

    private final static int mExportVarIdx_gPointBuffer = 7;
    private Allocation mExportVar_gPointBuffer;
    public synchronized void set_gPointBuffer(Allocation v) {
        setVar(mExportVarIdx_gPointBuffer, v);
        mExportVar_gPointBuffer = v;
    }

    public Allocation get_gPointBuffer() {
        return mExportVar_gPointBuffer;
    }

    public Script.FieldID getFieldID_gPointBuffer() {
        return createFieldID(mExportVarIdx_gPointBuffer, null);
    }

    private final static int mExportVarIdx_gTlinetexture = 8;
    private Allocation mExportVar_gTlinetexture;
    public synchronized void set_gTlinetexture(Allocation v) {
        setVar(mExportVarIdx_gTlinetexture, v);
        mExportVar_gTlinetexture = v;
    }

    public Allocation get_gTlinetexture() {
        return mExportVar_gTlinetexture;
    }

    public Script.FieldID getFieldID_gTlinetexture() {
        return createFieldID(mExportVarIdx_gTlinetexture, null);
    }

    private final static int mExportVarIdx_gCubeMesh = 9;
    private Mesh mExportVar_gCubeMesh;
    public synchronized void set_gCubeMesh(Mesh v) {
        setVar(mExportVarIdx_gCubeMesh, v);
        mExportVar_gCubeMesh = v;
    }

    public Mesh get_gCubeMesh() {
        return mExportVar_gCubeMesh;
    }

    public Script.FieldID getFieldID_gCubeMesh() {
        return createFieldID(mExportVarIdx_gCubeMesh, null);
    }

}

