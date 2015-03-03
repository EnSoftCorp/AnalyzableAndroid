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
 * The source Renderscript file: packages/wallpapers/Galaxy4/src/com/android/galaxy4/galaxy.rs
 */
package com.android.galaxy4;

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
        __MESH = Element.MESH(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __F32 = Element.F32(rs);
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
    private final static int mExportVarIdx_vpConstants = 0;
    private ScriptField_VpConsts mExportVar_vpConstants;
    public void bind_vpConstants(ScriptField_VpConsts v) {
        mExportVar_vpConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_vpConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_vpConstants);
    }

    public ScriptField_VpConsts get_vpConstants() {
        return mExportVar_vpConstants;
    }

    private final static int mExportVarIdx_spaceClouds = 1;
    private ScriptField_Particle mExportVar_spaceClouds;
    public void bind_spaceClouds(ScriptField_Particle v) {
        mExportVar_spaceClouds = v;
        if (v == null) bindAllocation(null, mExportVarIdx_spaceClouds);
        else bindAllocation(v.getAllocation(), mExportVarIdx_spaceClouds);
    }

    public ScriptField_Particle get_spaceClouds() {
        return mExportVar_spaceClouds;
    }

    private final static int mExportVarIdx_bgStars = 2;
    private ScriptField_Particle mExportVar_bgStars;
    public void bind_bgStars(ScriptField_Particle v) {
        mExportVar_bgStars = v;
        if (v == null) bindAllocation(null, mExportVarIdx_bgStars);
        else bindAllocation(v.getAllocation(), mExportVarIdx_bgStars);
    }

    public ScriptField_Particle get_bgStars() {
        return mExportVar_bgStars;
    }

    private final static int mExportVarIdx_staticStars = 3;
    private ScriptField_Particle mExportVar_staticStars;
    public void bind_staticStars(ScriptField_Particle v) {
        mExportVar_staticStars = v;
        if (v == null) bindAllocation(null, mExportVarIdx_staticStars);
        else bindAllocation(v.getAllocation(), mExportVarIdx_staticStars);
    }

    public ScriptField_Particle get_staticStars() {
        return mExportVar_staticStars;
    }

    private final static int mExportVarIdx_spaceCloudsMesh = 4;
    private Mesh mExportVar_spaceCloudsMesh;
    public synchronized void set_spaceCloudsMesh(Mesh v) {
        setVar(mExportVarIdx_spaceCloudsMesh, v);
        mExportVar_spaceCloudsMesh = v;
    }

    public Mesh get_spaceCloudsMesh() {
        return mExportVar_spaceCloudsMesh;
    }

    public Script.FieldID getFieldID_spaceCloudsMesh() {
        return createFieldID(mExportVarIdx_spaceCloudsMesh, null);
    }

    private final static int mExportVarIdx_bgStarsMesh = 5;
    private Mesh mExportVar_bgStarsMesh;
    public synchronized void set_bgStarsMesh(Mesh v) {
        setVar(mExportVarIdx_bgStarsMesh, v);
        mExportVar_bgStarsMesh = v;
    }

    public Mesh get_bgStarsMesh() {
        return mExportVar_bgStarsMesh;
    }

    public Script.FieldID getFieldID_bgStarsMesh() {
        return createFieldID(mExportVarIdx_bgStarsMesh, null);
    }

    private final static int mExportVarIdx_staticStarsMesh = 6;
    private Mesh mExportVar_staticStarsMesh;
    public synchronized void set_staticStarsMesh(Mesh v) {
        setVar(mExportVarIdx_staticStarsMesh, v);
        mExportVar_staticStarsMesh = v;
    }

    public Mesh get_staticStarsMesh() {
        return mExportVar_staticStarsMesh;
    }

    public Script.FieldID getFieldID_staticStarsMesh() {
        return createFieldID(mExportVarIdx_staticStarsMesh, null);
    }

    private final static int mExportVarIdx_vertSpaceClouds = 7;
    private ProgramVertex mExportVar_vertSpaceClouds;
    public synchronized void set_vertSpaceClouds(ProgramVertex v) {
        setVar(mExportVarIdx_vertSpaceClouds, v);
        mExportVar_vertSpaceClouds = v;
    }

    public ProgramVertex get_vertSpaceClouds() {
        return mExportVar_vertSpaceClouds;
    }

    public Script.FieldID getFieldID_vertSpaceClouds() {
        return createFieldID(mExportVarIdx_vertSpaceClouds, null);
    }

    private final static int mExportVarIdx_vertBgStars = 8;
    private ProgramVertex mExportVar_vertBgStars;
    public synchronized void set_vertBgStars(ProgramVertex v) {
        setVar(mExportVarIdx_vertBgStars, v);
        mExportVar_vertBgStars = v;
    }

    public ProgramVertex get_vertBgStars() {
        return mExportVar_vertBgStars;
    }

    public Script.FieldID getFieldID_vertBgStars() {
        return createFieldID(mExportVarIdx_vertBgStars, null);
    }

    private final static int mExportVarIdx_vertStaticStars = 9;
    private ProgramVertex mExportVar_vertStaticStars;
    public synchronized void set_vertStaticStars(ProgramVertex v) {
        setVar(mExportVarIdx_vertStaticStars, v);
        mExportVar_vertStaticStars = v;
    }

    public ProgramVertex get_vertStaticStars() {
        return mExportVar_vertStaticStars;
    }

    public Script.FieldID getFieldID_vertStaticStars() {
        return createFieldID(mExportVarIdx_vertStaticStars, null);
    }

    private final static int mExportVarIdx_fragSpaceClouds = 10;
    private ProgramFragment mExportVar_fragSpaceClouds;
    public synchronized void set_fragSpaceClouds(ProgramFragment v) {
        setVar(mExportVarIdx_fragSpaceClouds, v);
        mExportVar_fragSpaceClouds = v;
    }

    public ProgramFragment get_fragSpaceClouds() {
        return mExportVar_fragSpaceClouds;
    }

    public Script.FieldID getFieldID_fragSpaceClouds() {
        return createFieldID(mExportVarIdx_fragSpaceClouds, null);
    }

    private final static int mExportVarIdx_fragBgStars = 11;
    private ProgramFragment mExportVar_fragBgStars;
    public synchronized void set_fragBgStars(ProgramFragment v) {
        setVar(mExportVarIdx_fragBgStars, v);
        mExportVar_fragBgStars = v;
    }

    public ProgramFragment get_fragBgStars() {
        return mExportVar_fragBgStars;
    }

    public Script.FieldID getFieldID_fragBgStars() {
        return createFieldID(mExportVarIdx_fragBgStars, null);
    }

    private final static int mExportVarIdx_fragStaticStars = 12;
    private ProgramFragment mExportVar_fragStaticStars;
    public synchronized void set_fragStaticStars(ProgramFragment v) {
        setVar(mExportVarIdx_fragStaticStars, v);
        mExportVar_fragStaticStars = v;
    }

    public ProgramFragment get_fragStaticStars() {
        return mExportVar_fragStaticStars;
    }

    public Script.FieldID getFieldID_fragStaticStars() {
        return createFieldID(mExportVarIdx_fragStaticStars, null);
    }

    private final static int mExportVarIdx_vertBg = 13;
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

    private final static int mExportVarIdx_fragBg = 14;
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

    private final static int mExportVarIdx_textureSpaceCloud = 15;
    private Allocation mExportVar_textureSpaceCloud;
    public synchronized void set_textureSpaceCloud(Allocation v) {
        setVar(mExportVarIdx_textureSpaceCloud, v);
        mExportVar_textureSpaceCloud = v;
    }

    public Allocation get_textureSpaceCloud() {
        return mExportVar_textureSpaceCloud;
    }

    public Script.FieldID getFieldID_textureSpaceCloud() {
        return createFieldID(mExportVarIdx_textureSpaceCloud, null);
    }

    private final static int mExportVarIdx_textureStaticStar = 16;
    private Allocation mExportVar_textureStaticStar;
    public synchronized void set_textureStaticStar(Allocation v) {
        setVar(mExportVarIdx_textureStaticStar, v);
        mExportVar_textureStaticStar = v;
    }

    public Allocation get_textureStaticStar() {
        return mExportVar_textureStaticStar;
    }

    public Script.FieldID getFieldID_textureStaticStar() {
        return createFieldID(mExportVarIdx_textureStaticStar, null);
    }

    private final static int mExportVarIdx_textureStaticStar2 = 17;
    private Allocation mExportVar_textureStaticStar2;
    public synchronized void set_textureStaticStar2(Allocation v) {
        setVar(mExportVarIdx_textureStaticStar2, v);
        mExportVar_textureStaticStar2 = v;
    }

    public Allocation get_textureStaticStar2() {
        return mExportVar_textureStaticStar2;
    }

    public Script.FieldID getFieldID_textureStaticStar2() {
        return createFieldID(mExportVarIdx_textureStaticStar2, null);
    }

    private final static int mExportVarIdx_textureBg = 18;
    private Allocation mExportVar_textureBg;
    public synchronized void set_textureBg(Allocation v) {
        setVar(mExportVarIdx_textureBg, v);
        mExportVar_textureBg = v;
    }

    public Allocation get_textureBg() {
        return mExportVar_textureBg;
    }

    public Script.FieldID getFieldID_textureBg() {
        return createFieldID(mExportVarIdx_textureBg, null);
    }

    private final static int mExportVarIdx_densityDPI = 19;
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

    private final static int mExportFuncIdx_positionParticles = 0;
    public void invoke_positionParticles() {
        invoke(mExportFuncIdx_positionParticles);
    }

}

