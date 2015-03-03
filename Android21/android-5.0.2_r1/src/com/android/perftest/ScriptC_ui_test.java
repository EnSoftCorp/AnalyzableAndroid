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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/PerfTest/src/com/android/perftest/ui_test.rs
 */

package com.android.perftest;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_ui_test extends ScriptC {
    private static final String __rs_resource_name = "ui_test";
    // Constructor
    public  ScriptC_ui_test(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_ui_test(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __ALLOCATION = Element.ALLOCATION(rs);
        __MESH = Element.MESH(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        mExportVar_gXOffset = 0.5f;
        __F32 = Element.F32(rs);
        __FONT = Element.FONT(rs);
        __SAMPLER = Element.SAMPLER(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __FONT;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private Element __SAMPLER;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_FONT;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_STORE;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
    private FieldPacker __rs_fp_SAMPLER;
    private final static int mExportVarIdx_gTSpace = 0;
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

    private final static int mExportVarIdx_gTLight1 = 1;
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

    private final static int mExportVarIdx_gTFlares = 2;
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

    private final static int mExportVarIdx_gParticlesMesh = 3;
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

    private final static int mExportVarIdx_gPFBackground = 4;
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

    private final static int mExportVarIdx_gPFStars = 5;
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

    private final static int mExportVarIdx_gPVStars = 6;
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

    private final static int mExportVarIdx_gPVBkProj = 7;
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

    private final static int mExportVarIdx_gPSLights = 8;
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

    private final static int mExportVarIdx_gXOffset = 9;
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

    private final static int mExportVarIdx_Particles = 10;
    private ScriptField_Particle mExportVar_Particles;
    public void bind_Particles(ScriptField_Particle v) {
        mExportVar_Particles = v;
        if (v == null) bindAllocation(null, mExportVarIdx_Particles);
        else bindAllocation(v.getAllocation(), mExportVarIdx_Particles);
    }

    public ScriptField_Particle get_Particles() {
        return mExportVar_Particles;
    }

    private final static int mExportVarIdx_vpConstants = 11;
    private ScriptField_VpConsts mExportVar_vpConstants;
    public void bind_vpConstants(ScriptField_VpConsts v) {
        mExportVar_vpConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_vpConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_vpConstants);
    }

    public ScriptField_VpConsts get_vpConstants() {
        return mExportVar_vpConstants;
    }

    private final static int mExportVarIdx_gProgVertex = 12;
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

    private final static int mExportVarIdx_gProgFragmentColor = 13;
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

    private final static int mExportVarIdx_gProgFragmentTexture = 14;
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

    private final static int mExportVarIdx_gProgStoreBlendAlpha = 15;
    private ProgramStore mExportVar_gProgStoreBlendAlpha;
    public synchronized void set_gProgStoreBlendAlpha(ProgramStore v) {
        setVar(mExportVarIdx_gProgStoreBlendAlpha, v);
        mExportVar_gProgStoreBlendAlpha = v;
    }

    public ProgramStore get_gProgStoreBlendAlpha() {
        return mExportVar_gProgStoreBlendAlpha;
    }

    public Script.FieldID getFieldID_gProgStoreBlendAlpha() {
        return createFieldID(mExportVarIdx_gProgStoreBlendAlpha, null);
    }

    private final static int mExportVarIdx_gTexOpaque = 16;
    private Allocation mExportVar_gTexOpaque;
    public synchronized void set_gTexOpaque(Allocation v) {
        setVar(mExportVarIdx_gTexOpaque, v);
        mExportVar_gTexOpaque = v;
    }

    public Allocation get_gTexOpaque() {
        return mExportVar_gTexOpaque;
    }

    public Script.FieldID getFieldID_gTexOpaque() {
        return createFieldID(mExportVarIdx_gTexOpaque, null);
    }

    private final static int mExportVarIdx_gTexTorus = 17;
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

    private final static int mExportVarIdx_gTexGlobe = 18;
    private Allocation mExportVar_gTexGlobe;
    public synchronized void set_gTexGlobe(Allocation v) {
        setVar(mExportVarIdx_gTexGlobe, v);
        mExportVar_gTexGlobe = v;
    }

    public Allocation get_gTexGlobe() {
        return mExportVar_gTexGlobe;
    }

    public Script.FieldID getFieldID_gTexGlobe() {
        return createFieldID(mExportVarIdx_gTexGlobe, null);
    }

    private final static int mExportVarIdx_gTexList100 = 19;
    private ScriptField_ListAllocs_s mExportVar_gTexList100;
    public void bind_gTexList100(ScriptField_ListAllocs_s v) {
        mExportVar_gTexList100 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gTexList100);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gTexList100);
    }

    public ScriptField_ListAllocs_s get_gTexList100() {
        return mExportVar_gTexList100;
    }

    private final static int mExportVarIdx_gSampleTextList100 = 20;
    private ScriptField_ListAllocs_s mExportVar_gSampleTextList100;
    public void bind_gSampleTextList100(ScriptField_ListAllocs_s v) {
        mExportVar_gSampleTextList100 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gSampleTextList100);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gSampleTextList100);
    }

    public ScriptField_ListAllocs_s get_gSampleTextList100() {
        return mExportVar_gSampleTextList100;
    }

    private final static int mExportVarIdx_gListViewText = 21;
    private ScriptField_ListAllocs_s mExportVar_gListViewText;
    public void bind_gListViewText(ScriptField_ListAllocs_s v) {
        mExportVar_gListViewText = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gListViewText);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gListViewText);
    }

    public ScriptField_ListAllocs_s get_gListViewText() {
        return mExportVar_gListViewText;
    }

    private final static int mExportVarIdx_gSingleMesh = 22;
    private Mesh mExportVar_gSingleMesh;
    public synchronized void set_gSingleMesh(Mesh v) {
        setVar(mExportVarIdx_gSingleMesh, v);
        mExportVar_gSingleMesh = v;
    }

    public Mesh get_gSingleMesh() {
        return mExportVar_gSingleMesh;
    }

    public Script.FieldID getFieldID_gSingleMesh() {
        return createFieldID(mExportVarIdx_gSingleMesh, null);
    }

    private final static int mExportVarIdx_gFontSans = 23;
    private Font mExportVar_gFontSans;
    public synchronized void set_gFontSans(Font v) {
        setVar(mExportVarIdx_gFontSans, v);
        mExportVar_gFontSans = v;
    }

    public Font get_gFontSans() {
        return mExportVar_gFontSans;
    }

    public Script.FieldID getFieldID_gFontSans() {
        return createFieldID(mExportVarIdx_gFontSans, null);
    }

    private final static int mExportVarIdx_gLinearClamp = 24;
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

    private final static int mExportVarIdx_gData = 25;
    private ScriptField_UiTestData_s mExportVar_gData;
    public void bind_gData(ScriptField_UiTestData_s v) {
        mExportVar_gData = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gData);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gData);
    }

    public ScriptField_UiTestData_s get_gData() {
        return mExportVar_gData;
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

    private final static int mExportFuncIdx_initParticles = 0;
    public void invoke_initParticles() {
        invoke(mExportFuncIdx_initParticles);
    }

}

