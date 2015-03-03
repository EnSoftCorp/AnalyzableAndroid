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
 * The source Renderscript file: packages/wallpapers/MagicSmoke/src/com/android/magicsmoke/clouds.rs
 */
package com.android.magicsmoke;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_clouds extends ScriptC {
    private static final String __rs_resource_name = "clouds";
    // Constructor
    public  ScriptC_clouds(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_clouds(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __I32;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
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

    private final static int mExportVarIdx_gYOffset = 1;
    private float mExportVar_gYOffset;
    public synchronized void set_gYOffset(float v) {
        setVar(mExportVarIdx_gYOffset, v);
        mExportVar_gYOffset = v;
    }

    public float get_gYOffset() {
        return mExportVar_gYOffset;
    }

    public Script.FieldID getFieldID_gYOffset() {
        return createFieldID(mExportVarIdx_gYOffset, null);
    }

    private final static int mExportVarIdx_gPreset = 2;
    private int mExportVar_gPreset;
    public synchronized void set_gPreset(int v) {
        setVar(mExportVarIdx_gPreset, v);
        mExportVar_gPreset = v;
    }

    public int get_gPreset() {
        return mExportVar_gPreset;
    }

    public Script.FieldID getFieldID_gPreset() {
        return createFieldID(mExportVarIdx_gPreset, null);
    }

    private final static int mExportVarIdx_gTextureMask = 3;
    private int mExportVar_gTextureMask;
    public synchronized void set_gTextureMask(int v) {
        setVar(mExportVarIdx_gTextureMask, v);
        mExportVar_gTextureMask = v;
    }

    public int get_gTextureMask() {
        return mExportVar_gTextureMask;
    }

    public Script.FieldID getFieldID_gTextureMask() {
        return createFieldID(mExportVarIdx_gTextureMask, null);
    }

    private final static int mExportVarIdx_gRotate = 4;
    private int mExportVar_gRotate;
    public synchronized void set_gRotate(int v) {
        setVar(mExportVarIdx_gRotate, v);
        mExportVar_gRotate = v;
    }

    public int get_gRotate() {
        return mExportVar_gRotate;
    }

    public Script.FieldID getFieldID_gRotate() {
        return createFieldID(mExportVarIdx_gRotate, null);
    }

    private final static int mExportVarIdx_gTextureSwap = 5;
    private int mExportVar_gTextureSwap;
    public synchronized void set_gTextureSwap(int v) {
        setVar(mExportVarIdx_gTextureSwap, v);
        mExportVar_gTextureSwap = v;
    }

    public int get_gTextureSwap() {
        return mExportVar_gTextureSwap;
    }

    public Script.FieldID getFieldID_gTextureSwap() {
        return createFieldID(mExportVarIdx_gTextureSwap, null);
    }

    private final static int mExportVarIdx_gProcessTextureMode = 6;
    private int mExportVar_gProcessTextureMode;
    public synchronized void set_gProcessTextureMode(int v) {
        setVar(mExportVarIdx_gProcessTextureMode, v);
        mExportVar_gProcessTextureMode = v;
    }

    public int get_gProcessTextureMode() {
        return mExportVar_gProcessTextureMode;
    }

    public Script.FieldID getFieldID_gProcessTextureMode() {
        return createFieldID(mExportVarIdx_gProcessTextureMode, null);
    }

    private final static int mExportVarIdx_gBackCol = 7;
    private int mExportVar_gBackCol;
    public synchronized void set_gBackCol(int v) {
        setVar(mExportVarIdx_gBackCol, v);
        mExportVar_gBackCol = v;
    }

    public int get_gBackCol() {
        return mExportVar_gBackCol;
    }

    public Script.FieldID getFieldID_gBackCol() {
        return createFieldID(mExportVarIdx_gBackCol, null);
    }

    private final static int mExportVarIdx_gLowCol = 8;
    private int mExportVar_gLowCol;
    public synchronized void set_gLowCol(int v) {
        setVar(mExportVarIdx_gLowCol, v);
        mExportVar_gLowCol = v;
    }

    public int get_gLowCol() {
        return mExportVar_gLowCol;
    }

    public Script.FieldID getFieldID_gLowCol() {
        return createFieldID(mExportVarIdx_gLowCol, null);
    }

    private final static int mExportVarIdx_gHighCol = 9;
    private int mExportVar_gHighCol;
    public synchronized void set_gHighCol(int v) {
        setVar(mExportVarIdx_gHighCol, v);
        mExportVar_gHighCol = v;
    }

    public int get_gHighCol() {
        return mExportVar_gHighCol;
    }

    public Script.FieldID getFieldID_gHighCol() {
        return createFieldID(mExportVarIdx_gHighCol, null);
    }

    private final static int mExportVarIdx_gAlphaMul = 10;
    private float mExportVar_gAlphaMul;
    public synchronized void set_gAlphaMul(float v) {
        setVar(mExportVarIdx_gAlphaMul, v);
        mExportVar_gAlphaMul = v;
    }

    public float get_gAlphaMul() {
        return mExportVar_gAlphaMul;
    }

    public Script.FieldID getFieldID_gAlphaMul() {
        return createFieldID(mExportVarIdx_gAlphaMul, null);
    }

    private final static int mExportVarIdx_gPreMul = 11;
    private int mExportVar_gPreMul;
    public synchronized void set_gPreMul(int v) {
        setVar(mExportVarIdx_gPreMul, v);
        mExportVar_gPreMul = v;
    }

    public int get_gPreMul() {
        return mExportVar_gPreMul;
    }

    public Script.FieldID getFieldID_gPreMul() {
        return createFieldID(mExportVarIdx_gPreMul, null);
    }

    private final static int mExportVarIdx_gVSConstants = 12;
    private ScriptField_VertexShaderConstants_s mExportVar_gVSConstants;
    public void bind_gVSConstants(ScriptField_VertexShaderConstants_s v) {
        mExportVar_gVSConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gVSConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gVSConstants);
    }

    public ScriptField_VertexShaderConstants_s get_gVSConstants() {
        return mExportVar_gVSConstants;
    }

    private final static int mExportVarIdx_gFSConstants = 13;
    private ScriptField_FragmentShaderConstants_s mExportVar_gFSConstants;
    public void bind_gFSConstants(ScriptField_FragmentShaderConstants_s v) {
        mExportVar_gFSConstants = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gFSConstants);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gFSConstants);
    }

    public ScriptField_FragmentShaderConstants_s get_gFSConstants() {
        return mExportVar_gFSConstants;
    }

    private final static int mExportVarIdx_gVS = 14;
    private ScriptField_VertexInputs_s mExportVar_gVS;
    public void bind_gVS(ScriptField_VertexInputs_s v) {
        mExportVar_gVS = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gVS);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gVS);
    }

    public ScriptField_VertexInputs_s get_gVS() {
        return mExportVar_gVS;
    }

    private final static int mExportVarIdx_gPF5tex = 15;
    private ProgramFragment mExportVar_gPF5tex;
    public synchronized void set_gPF5tex(ProgramFragment v) {
        setVar(mExportVarIdx_gPF5tex, v);
        mExportVar_gPF5tex = v;
    }

    public ProgramFragment get_gPF5tex() {
        return mExportVar_gPF5tex;
    }

    public Script.FieldID getFieldID_gPF5tex() {
        return createFieldID(mExportVarIdx_gPF5tex, null);
    }

    private final static int mExportVarIdx_gPV5tex = 16;
    private ProgramVertex mExportVar_gPV5tex;
    public synchronized void set_gPV5tex(ProgramVertex v) {
        setVar(mExportVarIdx_gPV5tex, v);
        mExportVar_gPV5tex = v;
    }

    public ProgramVertex get_gPV5tex() {
        return mExportVar_gPV5tex;
    }

    public Script.FieldID getFieldID_gPV5tex() {
        return createFieldID(mExportVarIdx_gPV5tex, null);
    }

    private final static int mExportVarIdx_gPF4tex = 17;
    private ProgramFragment mExportVar_gPF4tex;
    public synchronized void set_gPF4tex(ProgramFragment v) {
        setVar(mExportVarIdx_gPF4tex, v);
        mExportVar_gPF4tex = v;
    }

    public ProgramFragment get_gPF4tex() {
        return mExportVar_gPF4tex;
    }

    public Script.FieldID getFieldID_gPF4tex() {
        return createFieldID(mExportVarIdx_gPF4tex, null);
    }

    private final static int mExportVarIdx_gPV4tex = 18;
    private ProgramVertex mExportVar_gPV4tex;
    public synchronized void set_gPV4tex(ProgramVertex v) {
        setVar(mExportVarIdx_gPV4tex, v);
        mExportVar_gPV4tex = v;
    }

    public ProgramVertex get_gPV4tex() {
        return mExportVar_gPV4tex;
    }

    public Script.FieldID getFieldID_gPV4tex() {
        return createFieldID(mExportVarIdx_gPV4tex, null);
    }

    private final static int mExportVarIdx_gPStore = 19;
    private ProgramStore mExportVar_gPStore;
    public synchronized void set_gPStore(ProgramStore v) {
        setVar(mExportVarIdx_gPStore, v);
        mExportVar_gPStore = v;
    }

    public ProgramStore get_gPStore() {
        return mExportVar_gPStore;
    }

    public Script.FieldID getFieldID_gPStore() {
        return createFieldID(mExportVarIdx_gPStore, null);
    }

    private final static int mExportVarIdx_gTnoise1 = 20;
    private Allocation mExportVar_gTnoise1;
    public synchronized void set_gTnoise1(Allocation v) {
        setVar(mExportVarIdx_gTnoise1, v);
        mExportVar_gTnoise1 = v;
    }

    public Allocation get_gTnoise1() {
        return mExportVar_gTnoise1;
    }

    public Script.FieldID getFieldID_gTnoise1() {
        return createFieldID(mExportVarIdx_gTnoise1, null);
    }

    private final static int mExportVarIdx_gTnoise2 = 21;
    private Allocation mExportVar_gTnoise2;
    public synchronized void set_gTnoise2(Allocation v) {
        setVar(mExportVarIdx_gTnoise2, v);
        mExportVar_gTnoise2 = v;
    }

    public Allocation get_gTnoise2() {
        return mExportVar_gTnoise2;
    }

    public Script.FieldID getFieldID_gTnoise2() {
        return createFieldID(mExportVarIdx_gTnoise2, null);
    }

    private final static int mExportVarIdx_gTnoise3 = 22;
    private Allocation mExportVar_gTnoise3;
    public synchronized void set_gTnoise3(Allocation v) {
        setVar(mExportVarIdx_gTnoise3, v);
        mExportVar_gTnoise3 = v;
    }

    public Allocation get_gTnoise3() {
        return mExportVar_gTnoise3;
    }

    public Script.FieldID getFieldID_gTnoise3() {
        return createFieldID(mExportVarIdx_gTnoise3, null);
    }

    private final static int mExportVarIdx_gTnoise4 = 23;
    private Allocation mExportVar_gTnoise4;
    public synchronized void set_gTnoise4(Allocation v) {
        setVar(mExportVarIdx_gTnoise4, v);
        mExportVar_gTnoise4 = v;
    }

    public Allocation get_gTnoise4() {
        return mExportVar_gTnoise4;
    }

    public Script.FieldID getFieldID_gTnoise4() {
        return createFieldID(mExportVarIdx_gTnoise4, null);
    }

    private final static int mExportVarIdx_gTnoise5 = 24;
    private Allocation mExportVar_gTnoise5;
    public synchronized void set_gTnoise5(Allocation v) {
        setVar(mExportVarIdx_gTnoise5, v);
        mExportVar_gTnoise5 = v;
    }

    public Allocation get_gTnoise5() {
        return mExportVar_gTnoise5;
    }

    public Script.FieldID getFieldID_gTnoise5() {
        return createFieldID(mExportVarIdx_gTnoise5, null);
    }

    private final static int mExportVarIdx_gNoisesrc1 = 25;
    private Allocation mExportVar_gNoisesrc1;
    public void bind_gNoisesrc1(Allocation v) {
        mExportVar_gNoisesrc1 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisesrc1);
        else bindAllocation(v, mExportVarIdx_gNoisesrc1);
    }

    public Allocation get_gNoisesrc1() {
        return mExportVar_gNoisesrc1;
    }

    private final static int mExportVarIdx_gNoisesrc2 = 26;
    private Allocation mExportVar_gNoisesrc2;
    public void bind_gNoisesrc2(Allocation v) {
        mExportVar_gNoisesrc2 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisesrc2);
        else bindAllocation(v, mExportVarIdx_gNoisesrc2);
    }

    public Allocation get_gNoisesrc2() {
        return mExportVar_gNoisesrc2;
    }

    private final static int mExportVarIdx_gNoisesrc3 = 27;
    private Allocation mExportVar_gNoisesrc3;
    public void bind_gNoisesrc3(Allocation v) {
        mExportVar_gNoisesrc3 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisesrc3);
        else bindAllocation(v, mExportVarIdx_gNoisesrc3);
    }

    public Allocation get_gNoisesrc3() {
        return mExportVar_gNoisesrc3;
    }

    private final static int mExportVarIdx_gNoisesrc4 = 28;
    private Allocation mExportVar_gNoisesrc4;
    public void bind_gNoisesrc4(Allocation v) {
        mExportVar_gNoisesrc4 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisesrc4);
        else bindAllocation(v, mExportVarIdx_gNoisesrc4);
    }

    public Allocation get_gNoisesrc4() {
        return mExportVar_gNoisesrc4;
    }

    private final static int mExportVarIdx_gNoisesrc5 = 29;
    private Allocation mExportVar_gNoisesrc5;
    public void bind_gNoisesrc5(Allocation v) {
        mExportVar_gNoisesrc5 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisesrc5);
        else bindAllocation(v, mExportVarIdx_gNoisesrc5);
    }

    public Allocation get_gNoisesrc5() {
        return mExportVar_gNoisesrc5;
    }

    private final static int mExportVarIdx_gNoisedst1 = 30;
    private Allocation mExportVar_gNoisedst1;
    public void bind_gNoisedst1(Allocation v) {
        mExportVar_gNoisedst1 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisedst1);
        else bindAllocation(v, mExportVarIdx_gNoisedst1);
    }

    public Allocation get_gNoisedst1() {
        return mExportVar_gNoisedst1;
    }

    private final static int mExportVarIdx_gNoisedst2 = 31;
    private Allocation mExportVar_gNoisedst2;
    public void bind_gNoisedst2(Allocation v) {
        mExportVar_gNoisedst2 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisedst2);
        else bindAllocation(v, mExportVarIdx_gNoisedst2);
    }

    public Allocation get_gNoisedst2() {
        return mExportVar_gNoisedst2;
    }

    private final static int mExportVarIdx_gNoisedst3 = 32;
    private Allocation mExportVar_gNoisedst3;
    public void bind_gNoisedst3(Allocation v) {
        mExportVar_gNoisedst3 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisedst3);
        else bindAllocation(v, mExportVarIdx_gNoisedst3);
    }

    public Allocation get_gNoisedst3() {
        return mExportVar_gNoisedst3;
    }

    private final static int mExportVarIdx_gNoisedst4 = 33;
    private Allocation mExportVar_gNoisedst4;
    public void bind_gNoisedst4(Allocation v) {
        mExportVar_gNoisedst4 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisedst4);
        else bindAllocation(v, mExportVarIdx_gNoisedst4);
    }

    public Allocation get_gNoisedst4() {
        return mExportVar_gNoisedst4;
    }

    private final static int mExportVarIdx_gNoisedst5 = 34;
    private Allocation mExportVar_gNoisedst5;
    public void bind_gNoisedst5(Allocation v) {
        mExportVar_gNoisedst5 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gNoisedst5);
        else bindAllocation(v, mExportVarIdx_gNoisedst5);
    }

    public Allocation get_gNoisedst5() {
        return mExportVar_gNoisedst5;
    }

}

