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
 * The source Renderscript file: packages/wallpapers/PhaseBeam/src/com/android/phasebeam/phasebeam.rs
 */

package com.android.phasebeam;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_phasebeam extends ScriptC {
    private static final String __rs_resource_name = "phasebeam";
    // Constructor
    public  ScriptC_phasebeam(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_phasebeam(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __ALLOCATION = Element.ALLOCATION(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __MESH = Element.MESH(rs);
        __F32 = Element.F32(rs);
        mExportVar_xOffset = 0.5f;
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_VERTEX;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
    private final static int mExportVarIdx_textureDot = 0;
    private Allocation mExportVar_textureDot;
    public synchronized void set_textureDot(Allocation v) {
        setVar(mExportVarIdx_textureDot, v);
        mExportVar_textureDot = v;
    }

    public Allocation get_textureDot() {
        return mExportVar_textureDot;
    }

    public Script.FieldID getFieldID_textureDot() {
        return createFieldID(mExportVarIdx_textureDot, null);
    }

    private final static int mExportVarIdx_textureBeam = 1;
    private Allocation mExportVar_textureBeam;
    public synchronized void set_textureBeam(Allocation v) {
        setVar(mExportVarIdx_textureBeam, v);
        mExportVar_textureBeam = v;
    }

    public Allocation get_textureBeam() {
        return mExportVar_textureBeam;
    }

    public Script.FieldID getFieldID_textureBeam() {
        return createFieldID(mExportVarIdx_textureBeam, null);
    }

    private final static int mExportVarIdx_vertBg = 2;
    private ProgramVertex mExportVar_vertBg;
    public synchronized void set_vertBg(ProgramVertex v) {
        setVar(mExportVarIdx_vertBg, v);
        mExportVar_vertBg = v;
    }

    public ProgramVertex get_vertBg() {
        return mExportVar_vertBg;
    }

    public Script.FieldID getFieldID_vertBg() {
        return createFieldID(mExportVarIdx_vertBg, null);
    }

    private final static int mExportVarIdx_fragBg = 3;
    private ProgramFragment mExportVar_fragBg;
    public synchronized void set_fragBg(ProgramFragment v) {
        setVar(mExportVarIdx_fragBg, v);
        mExportVar_fragBg = v;
    }

    public ProgramFragment get_fragBg() {
        return mExportVar_fragBg;
    }

    public Script.FieldID getFieldID_fragBg() {
        return createFieldID(mExportVarIdx_fragBg, null);
    }

    private final static int mExportVarIdx_vertDots = 4;
    private ProgramVertex mExportVar_vertDots;
    public synchronized void set_vertDots(ProgramVertex v) {
        setVar(mExportVarIdx_vertDots, v);
        mExportVar_vertDots = v;
    }

    public ProgramVertex get_vertDots() {
        return mExportVar_vertDots;
    }

    public Script.FieldID getFieldID_vertDots() {
        return createFieldID(mExportVarIdx_vertDots, null);
    }

    private final static int mExportVarIdx_fragDots = 5;
    private ProgramFragment mExportVar_fragDots;
    public synchronized void set_fragDots(ProgramFragment v) {
        setVar(mExportVarIdx_fragDots, v);
        mExportVar_fragDots = v;
    }

    public ProgramFragment get_fragDots() {
        return mExportVar_fragDots;
    }

    public Script.FieldID getFieldID_fragDots() {
        return createFieldID(mExportVarIdx_fragDots, null);
    }

    private final static int mExportVarIdx_vpConstants = 6;
    private ScriptField_VpConsts mExportVar_vpConstants;
    public void bind_vpConstants(ScriptField_VpConsts v) {
        mExportVar_vpConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_vpConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_vpConstants);
    }

    public ScriptField_VpConsts get_vpConstants() {
        return mExportVar_vpConstants;
    }

    private final static int mExportVarIdx_vertexColors = 7;
    private ScriptField_VertexColor_s mExportVar_vertexColors;
    public void bind_vertexColors(ScriptField_VertexColor_s v) {
        mExportVar_vertexColors = v;
        if (v == null) bindAllocation(null, mExportVarIdx_vertexColors);
        else bindAllocation(v.getAllocation(), mExportVarIdx_vertexColors);
    }

    public ScriptField_VertexColor_s get_vertexColors() {
        return mExportVar_vertexColors;
    }

    private final static int mExportVarIdx_dotParticles = 8;
    private ScriptField_Particle mExportVar_dotParticles;
    public void bind_dotParticles(ScriptField_Particle v) {
        mExportVar_dotParticles = v;
        if (v == null) bindAllocation(null, mExportVarIdx_dotParticles);
        else bindAllocation(v.getAllocation(), mExportVarIdx_dotParticles);
    }

    public ScriptField_Particle get_dotParticles() {
        return mExportVar_dotParticles;
    }

    private final static int mExportVarIdx_beamParticles = 9;
    private ScriptField_Particle mExportVar_beamParticles;
    public void bind_beamParticles(ScriptField_Particle v) {
        mExportVar_beamParticles = v;
        if (v == null) bindAllocation(null, mExportVarIdx_beamParticles);
        else bindAllocation(v.getAllocation(), mExportVarIdx_beamParticles);
    }

    public ScriptField_Particle get_beamParticles() {
        return mExportVar_beamParticles;
    }

    private final static int mExportVarIdx_dotMesh = 10;
    private Mesh mExportVar_dotMesh;
    public synchronized void set_dotMesh(Mesh v) {
        setVar(mExportVarIdx_dotMesh, v);
        mExportVar_dotMesh = v;
    }

    public Mesh get_dotMesh() {
        return mExportVar_dotMesh;
    }

    public Script.FieldID getFieldID_dotMesh() {
        return createFieldID(mExportVarIdx_dotMesh, null);
    }

    private final static int mExportVarIdx_beamMesh = 11;
    private Mesh mExportVar_beamMesh;
    public synchronized void set_beamMesh(Mesh v) {
        setVar(mExportVarIdx_beamMesh, v);
        mExportVar_beamMesh = v;
    }

    public Mesh get_beamMesh() {
        return mExportVar_beamMesh;
    }

    public Script.FieldID getFieldID_beamMesh() {
        return createFieldID(mExportVarIdx_beamMesh, null);
    }

    private final static int mExportVarIdx_gBackgroundMesh = 12;
    private Mesh mExportVar_gBackgroundMesh;
    public synchronized void set_gBackgroundMesh(Mesh v) {
        setVar(mExportVarIdx_gBackgroundMesh, v);
        mExportVar_gBackgroundMesh = v;
    }

    public Mesh get_gBackgroundMesh() {
        return mExportVar_gBackgroundMesh;
    }

    public Script.FieldID getFieldID_gBackgroundMesh() {
        return createFieldID(mExportVarIdx_gBackgroundMesh, null);
    }

    private final static int mExportVarIdx_densityDPI = 13;
    private float mExportVar_densityDPI;
    public synchronized void set_densityDPI(float v) {
        setVar(mExportVarIdx_densityDPI, v);
        mExportVar_densityDPI = v;
    }

    public float get_densityDPI() {
        return mExportVar_densityDPI;
    }

    public Script.FieldID getFieldID_densityDPI() {
        return createFieldID(mExportVarIdx_densityDPI, null);
    }

    private final static int mExportVarIdx_xOffset = 14;
    private float mExportVar_xOffset;
    public synchronized void set_xOffset(float v) {
        setVar(mExportVarIdx_xOffset, v);
        mExportVar_xOffset = v;
    }

    public float get_xOffset() {
        return mExportVar_xOffset;
    }

    public Script.FieldID getFieldID_xOffset() {
        return createFieldID(mExportVarIdx_xOffset, null);
    }

    private final static int mExportFuncIdx_positionParticles = 0;
    public void invoke_positionParticles() {
        invoke(mExportFuncIdx_positionParticles);
    }

}

