/*
 * Copyright (C) 2011-2013 The Android Open Source Project
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
 * The source Renderscript file: packages/wallpapers/Basic/src/com/android/wallpaper/galaxy/galaxy.rs
 */
package com.android.wallpaper.galaxy;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_galaxy extends ScriptC {
    private static final String __rs_resource_name = "galaxy";
    // Constructor
    public  ScriptC_galaxy(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_galaxy(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __MESH = Element.MESH(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __I32;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_STORE;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
    private final static int mExportVarIdx_gXOffset = 0;
    private float mExportVar_gXOffset;
    public synchronized void set_gXOffset(float v) {
        setVar(mExportVarIdx_gXOffset, v);
        mExportVar_gXOffset = v;
    }

    public float get_gXOffset() {
        return mExportVar_gXOffset;
    }

    public Script.FieldID getFieldID_gXOffset() {
        return createFieldID(mExportVarIdx_gXOffset, null);
    }

    private final static int mExportVarIdx_gIsPreview = 1;
    private int mExportVar_gIsPreview;
    public synchronized void set_gIsPreview(int v) {
        setVar(mExportVarIdx_gIsPreview, v);
        mExportVar_gIsPreview = v;
    }

    public int get_gIsPreview() {
        return mExportVar_gIsPreview;
    }

    public Script.FieldID getFieldID_gIsPreview() {
        return createFieldID(mExportVarIdx_gIsPreview, null);
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

    public Script.FieldID getFieldID_gPFBackground() {
        return createFieldID(mExportVarIdx_gPFBackground, null);
    }

    private final static int mExportVarIdx_gPFStars = 3;
    private ProgramFragment mExportVar_gPFStars;
    public synchronized void set_gPFStars(ProgramFragment v) {
        setVar(mExportVarIdx_gPFStars, v);
        mExportVar_gPFStars = v;
    }

    public ProgramFragment get_gPFStars() {
        return mExportVar_gPFStars;
    }

    public Script.FieldID getFieldID_gPFStars() {
        return createFieldID(mExportVarIdx_gPFStars, null);
    }

    private final static int mExportVarIdx_gPVStars = 4;
    private ProgramVertex mExportVar_gPVStars;
    public synchronized void set_gPVStars(ProgramVertex v) {
        setVar(mExportVarIdx_gPVStars, v);
        mExportVar_gPVStars = v;
    }

    public ProgramVertex get_gPVStars() {
        return mExportVar_gPVStars;
    }

    public Script.FieldID getFieldID_gPVStars() {
        return createFieldID(mExportVarIdx_gPVStars, null);
    }

    private final static int mExportVarIdx_gPVBkProj = 5;
    private ProgramVertex mExportVar_gPVBkProj;
    public synchronized void set_gPVBkProj(ProgramVertex v) {
        setVar(mExportVarIdx_gPVBkProj, v);
        mExportVar_gPVBkProj = v;
    }

    public ProgramVertex get_gPVBkProj() {
        return mExportVar_gPVBkProj;
    }

    public Script.FieldID getFieldID_gPVBkProj() {
        return createFieldID(mExportVarIdx_gPVBkProj, null);
    }

    private final static int mExportVarIdx_gPSLights = 6;
    private ProgramStore mExportVar_gPSLights;
    public synchronized void set_gPSLights(ProgramStore v) {
        setVar(mExportVarIdx_gPSLights, v);
        mExportVar_gPSLights = v;
    }

    public ProgramStore get_gPSLights() {
        return mExportVar_gPSLights;
    }

    public Script.FieldID getFieldID_gPSLights() {
        return createFieldID(mExportVarIdx_gPSLights, null);
    }

    private final static int mExportVarIdx_gTSpace = 7;
    private Allocation mExportVar_gTSpace;
    public synchronized void set_gTSpace(Allocation v) {
        setVar(mExportVarIdx_gTSpace, v);
        mExportVar_gTSpace = v;
    }

    public Allocation get_gTSpace() {
        return mExportVar_gTSpace;
    }

    public Script.FieldID getFieldID_gTSpace() {
        return createFieldID(mExportVarIdx_gTSpace, null);
    }

    private final static int mExportVarIdx_gTFlares = 8;
    private Allocation mExportVar_gTFlares;
    public synchronized void set_gTFlares(Allocation v) {
        setVar(mExportVarIdx_gTFlares, v);
        mExportVar_gTFlares = v;
    }

    public Allocation get_gTFlares() {
        return mExportVar_gTFlares;
    }

    public Script.FieldID getFieldID_gTFlares() {
        return createFieldID(mExportVarIdx_gTFlares, null);
    }

    private final static int mExportVarIdx_gTLight1 = 9;
    private Allocation mExportVar_gTLight1;
    public synchronized void set_gTLight1(Allocation v) {
        setVar(mExportVarIdx_gTLight1, v);
        mExportVar_gTLight1 = v;
    }

    public Allocation get_gTLight1() {
        return mExportVar_gTLight1;
    }

    public Script.FieldID getFieldID_gTLight1() {
        return createFieldID(mExportVarIdx_gTLight1, null);
    }

    private final static int mExportVarIdx_gParticlesMesh = 10;
    private Mesh mExportVar_gParticlesMesh;
    public synchronized void set_gParticlesMesh(Mesh v) {
        setVar(mExportVarIdx_gParticlesMesh, v);
        mExportVar_gParticlesMesh = v;
    }

    public Mesh get_gParticlesMesh() {
        return mExportVar_gParticlesMesh;
    }

    public Script.FieldID getFieldID_gParticlesMesh() {
        return createFieldID(mExportVarIdx_gParticlesMesh, null);
    }

    private final static int mExportVarIdx_Particles = 11;
    private ScriptField_Particle mExportVar_Particles;
    public void bind_Particles(ScriptField_Particle v) {
        mExportVar_Particles = v;
        if (v == null) bindAllocation(null, mExportVarIdx_Particles);
        else bindAllocation(v.getAllocation(), mExportVarIdx_Particles);
    }

    public ScriptField_Particle get_Particles() {
        return mExportVar_Particles;
    }

    private final static int mExportVarIdx_vpConstants = 12;
    private ScriptField_VpConsts mExportVar_vpConstants;
    public void bind_vpConstants(ScriptField_VpConsts v) {
        mExportVar_vpConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_vpConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_vpConstants);
    }

    public ScriptField_VpConsts get_vpConstants() {
        return mExportVar_vpConstants;
    }

    private final static int mExportFuncIdx_initParticles = 0;
    public void invoke_initParticles() {
        invoke(mExportFuncIdx_initParticles);
    }

}

