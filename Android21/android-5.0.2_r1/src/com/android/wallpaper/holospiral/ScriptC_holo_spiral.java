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
 * The source Renderscript file: packages/wallpapers/HoloSpiral/src/com/android/wallpaper/holospiral/holo_spiral.rs
 */

package com.android.wallpaper.holospiral;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_holo_spiral extends ScriptC {
    private static final String __rs_resource_name = "holo_spiral";
    // Constructor
    public  ScriptC_holo_spiral(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_holo_spiral(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
    }

    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_MESH;
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

    private final static int mExportVarIdx_gPVGeometry = 1;
    private ProgramVertex mExportVar_gPVGeometry;
    public synchronized void set_gPVGeometry(ProgramVertex v) {
        setVar(mExportVarIdx_gPVGeometry, v);
        mExportVar_gPVGeometry = v;
    }

    public ProgramVertex get_gPVGeometry() {
        return mExportVar_gPVGeometry;
    }

    private final static int mExportVarIdx_gPFBackground = 2;
    private ProgramFragment mExportVar_gPFBackground;
    public synchronized void set_gPFBackground(ProgramFragment v) {
        setVar(mExportVarIdx_gPFBackground, v);
        mExportVar_gPFBackground = v;
    }

    public ProgramFragment get_gPFBackground() {
        return mExportVar_gPFBackground;
    }

    private final static int mExportVarIdx_gPFGeometry = 3;
    private ProgramFragment mExportVar_gPFGeometry;
    public synchronized void set_gPFGeometry(ProgramFragment v) {
        setVar(mExportVarIdx_gPFGeometry, v);
        mExportVar_gPFGeometry = v;
    }

    public ProgramFragment get_gPFGeometry() {
        return mExportVar_gPFGeometry;
    }

    private final static int mExportVarIdx_gPSBackground = 4;
    private ProgramStore mExportVar_gPSBackground;
    public synchronized void set_gPSBackground(ProgramStore v) {
        setVar(mExportVarIdx_gPSBackground, v);
        mExportVar_gPSBackground = v;
    }

    public ProgramStore get_gPSBackground() {
        return mExportVar_gPSBackground;
    }

    private final static int mExportVarIdx_gPSGeometry = 5;
    private ProgramStore mExportVar_gPSGeometry;
    public synchronized void set_gPSGeometry(ProgramStore v) {
        setVar(mExportVarIdx_gPSGeometry, v);
        mExportVar_gPSGeometry = v;
    }

    public ProgramStore get_gPSGeometry() {
        return mExportVar_gPSGeometry;
    }

    private final static int mExportVarIdx_gInnerGeometry = 6;
    private Mesh mExportVar_gInnerGeometry;
    public synchronized void set_gInnerGeometry(Mesh v) {
        setVar(mExportVarIdx_gInnerGeometry, v);
        mExportVar_gInnerGeometry = v;
    }

    public Mesh get_gInnerGeometry() {
        return mExportVar_gInnerGeometry;
    }

    private final static int mExportVarIdx_gOuterGeometry = 7;
    private Mesh mExportVar_gOuterGeometry;
    public synchronized void set_gOuterGeometry(Mesh v) {
        setVar(mExportVarIdx_gOuterGeometry, v);
        mExportVar_gOuterGeometry = v;
    }

    public Mesh get_gOuterGeometry() {
        return mExportVar_gOuterGeometry;
    }

    private final static int mExportVarIdx_gBackgroundMesh = 8;
    private Mesh mExportVar_gBackgroundMesh;
    public synchronized void set_gBackgroundMesh(Mesh v) {
        setVar(mExportVarIdx_gBackgroundMesh, v);
        mExportVar_gBackgroundMesh = v;
    }

    public Mesh get_gBackgroundMesh() {
        return mExportVar_gBackgroundMesh;
    }

    private final static int mExportVarIdx_gPointTexture = 9;
    private Allocation mExportVar_gPointTexture;
    public synchronized void set_gPointTexture(Allocation v) {
        setVar(mExportVarIdx_gPointTexture, v);
        mExportVar_gPointTexture = v;
    }

    public Allocation get_gPointTexture() {
        return mExportVar_gPointTexture;
    }

    private final static int mExportVarIdx_gXOffset = 10;
    private float mExportVar_gXOffset;
    public synchronized void set_gXOffset(float v) {
        setVar(mExportVarIdx_gXOffset, v);
        mExportVar_gXOffset = v;
    }

    public float get_gXOffset() {
        return mExportVar_gXOffset;
    }

    private final static int mExportVarIdx_gNearPlane = 11;
    private float mExportVar_gNearPlane;
    public synchronized void set_gNearPlane(float v) {
        setVar(mExportVarIdx_gNearPlane, v);
        mExportVar_gNearPlane = v;
    }

    public float get_gNearPlane() {
        return mExportVar_gNearPlane;
    }

    private final static int mExportVarIdx_gFarPlane = 12;
    private float mExportVar_gFarPlane;
    public synchronized void set_gFarPlane(float v) {
        setVar(mExportVarIdx_gFarPlane, v);
        mExportVar_gFarPlane = v;
    }

    public float get_gFarPlane() {
        return mExportVar_gFarPlane;
    }

    private final static int mExportVarIdx_gVSConstants = 13;
    private ScriptField_VertexShaderConstants_s mExportVar_gVSConstants;
    public void bind_gVSConstants(ScriptField_VertexShaderConstants_s v) {
        mExportVar_gVSConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gVSConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gVSConstants);
    }

    public ScriptField_VertexShaderConstants_s get_gVSConstants() {
        return mExportVar_gVSConstants;
    }

    private final static int mExportVarIdx_VertexColor_s_dummy = 14;
    private ScriptField_VertexColor_s mExportVar_VertexColor_s_dummy;
    public void bind_VertexColor_s_dummy(ScriptField_VertexColor_s v) {
        mExportVar_VertexColor_s_dummy = v;
        if (v == null) bindAllocation(null, mExportVarIdx_VertexColor_s_dummy);
        else bindAllocation(v.getAllocation(), mExportVarIdx_VertexColor_s_dummy);
    }

    public ScriptField_VertexColor_s get_VertexColor_s_dummy() {
        return mExportVar_VertexColor_s_dummy;
    }

    private final static int mExportFuncIdx_resize = 0;
    public void invoke_resize(float width, float height) {
        FieldPacker resize_fp = new FieldPacker(8);
        resize_fp.addF32(width);
        resize_fp.addF32(height);
        invoke(mExportFuncIdx_resize, resize_fp);
    }

}

