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
 * The source Renderscript file: packages/wallpapers/NoiseField/src/com/android/noisefield/noisefield.rs
 */
package com.android.noisefield;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_noisefield extends ScriptC {
    private static final String __rs_resource_name = "noisefield";
    // Constructor
    public  ScriptC_noisefield(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_noisefield(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __ALLOCATION = Element.ALLOCATION(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __MESH = Element.MESH(rs);
        __F32 = Element.F32(rs);
        mExportVar_touchDown = false;
        __BOOLEAN = Element.BOOLEAN(rs);
    }

    private Element __ALLOCATION;
    private Element __BOOLEAN;
    private Element __F32;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_BOOLEAN;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_STORE;
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

    private final static int mExportVarIdx_textureVignette = 1;
    private Allocation mExportVar_textureVignette;
    public synchronized void set_textureVignette(Allocation v) {
        setVar(mExportVarIdx_textureVignette, v);
        mExportVar_textureVignette = v;
    }

    public Allocation get_textureVignette() {
        return mExportVar_textureVignette;
    }

    public Script.FieldID getFieldID_textureVignette() {
        return createFieldID(mExportVarIdx_textureVignette, null);
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

    private final static int mExportVarIdx_storeAlpha = 6;
    private ProgramStore mExportVar_storeAlpha;
    public synchronized void set_storeAlpha(ProgramStore v) {
        setVar(mExportVarIdx_storeAlpha, v);
        mExportVar_storeAlpha = v;
    }

    public ProgramStore get_storeAlpha() {
        return mExportVar_storeAlpha;
    }

    public Script.FieldID getFieldID_storeAlpha() {
        return createFieldID(mExportVarIdx_storeAlpha, null);
    }

    private final static int mExportVarIdx_storeAdd = 7;
    private ProgramStore mExportVar_storeAdd;
    public synchronized void set_storeAdd(ProgramStore v) {
        setVar(mExportVarIdx_storeAdd, v);
        mExportVar_storeAdd = v;
    }

    public ProgramStore get_storeAdd() {
        return mExportVar_storeAdd;
    }

    public Script.FieldID getFieldID_storeAdd() {
        return createFieldID(mExportVarIdx_storeAdd, null);
    }

    private final static int mExportVarIdx_vpConstants = 8;
    private ScriptField_VpConsts mExportVar_vpConstants;
    public void bind_vpConstants(ScriptField_VpConsts v) {
        mExportVar_vpConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_vpConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_vpConstants);
    }

    public ScriptField_VpConsts get_vpConstants() {
        return mExportVar_vpConstants;
    }

    private final static int mExportVarIdx_dotParticles = 9;
    private ScriptField_Particle mExportVar_dotParticles;
    public void bind_dotParticles(ScriptField_Particle v) {
        mExportVar_dotParticles = v;
        if (v == null) bindAllocation(null, mExportVarIdx_dotParticles);
        else bindAllocation(v.getAllocation(), mExportVarIdx_dotParticles);
    }

    public ScriptField_Particle get_dotParticles() {
        return mExportVar_dotParticles;
    }

    private final static int mExportVarIdx_vertexColors = 10;
    private ScriptField_VertexColor_s mExportVar_vertexColors;
    public void bind_vertexColors(ScriptField_VertexColor_s v) {
        mExportVar_vertexColors = v;
        if (v == null) bindAllocation(null, mExportVarIdx_vertexColors);
        else bindAllocation(v.getAllocation(), mExportVarIdx_vertexColors);
    }

    public ScriptField_VertexColor_s get_vertexColors() {
        return mExportVar_vertexColors;
    }

    private final static int mExportVarIdx_dotMesh = 11;
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

    private final static int mExportVarIdx_touchDown = 14;
    private boolean mExportVar_touchDown;
    public synchronized void set_touchDown(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_touchDown, __rs_fp_BOOLEAN);
        mExportVar_touchDown = v;
    }

    public boolean get_touchDown() {
        return mExportVar_touchDown;
    }

    public Script.FieldID getFieldID_touchDown() {
        return createFieldID(mExportVarIdx_touchDown, null);
    }

    private final static int mExportFuncIdx_positionParticles = 0;
    public void invoke_positionParticles() {
        invoke(mExportFuncIdx_positionParticles);
    }

    private final static int mExportFuncIdx_touch = 1;
    public void invoke_touch(float x, float y) {
        FieldPacker touch_fp = new FieldPacker(8);
        touch_fp.addF32(x);
        touch_fp.addF32(y);
        invoke(mExportFuncIdx_touch, touch_fp);
    }

}

