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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/PerfTest/src/com/android/perftest/rsbench.rs
 */

package com.android.perftest;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_rsbench extends ScriptC {
    private static final String __rs_resource_name = "rsbench";
    // Constructor
    public  ScriptC_rsbench(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_rsbench(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_RS_MSG_TEST_DONE = 100;
        __I32 = Element.I32(rs);
        mExportVar_RS_MSG_RESULTS_READY = 101;
        mExportVar_gMaxLoops = 1;
        mExportVar_gDisplayMode = 1;
        __FONT = Element.FONT(rs);
        __SAMPLER = Element.SAMPLER(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_gLoadComplete = false;
        __BOOLEAN = Element.BOOLEAN(rs);
        mExportVar_gPauseRendering = false;
    }

    private Element __ALLOCATION;
    private Element __BOOLEAN;
    private Element __FONT;
    private Element __I32;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_VERTEX;
    private Element __SAMPLER;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_BOOLEAN;
    private FieldPacker __rs_fp_FONT;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_VERTEX;
    private FieldPacker __rs_fp_SAMPLER;
    private final static int mExportVarIdx_RS_MSG_TEST_DONE = 0;
    private int mExportVar_RS_MSG_TEST_DONE;
    public final static int const_RS_MSG_TEST_DONE = 100;
    public int get_RS_MSG_TEST_DONE() {
        return mExportVar_RS_MSG_TEST_DONE;
    }

    public Script.FieldID getFieldID_RS_MSG_TEST_DONE() {
        return createFieldID(mExportVarIdx_RS_MSG_TEST_DONE, null);
    }

    private final static int mExportVarIdx_RS_MSG_RESULTS_READY = 1;
    private int mExportVar_RS_MSG_RESULTS_READY;
    public final static int const_RS_MSG_RESULTS_READY = 101;
    public int get_RS_MSG_RESULTS_READY() {
        return mExportVar_RS_MSG_RESULTS_READY;
    }

    public Script.FieldID getFieldID_RS_MSG_RESULTS_READY() {
        return createFieldID(mExportVarIdx_RS_MSG_RESULTS_READY, null);
    }

    private final static int mExportVarIdx_gMaxLoops = 2;
    private int mExportVar_gMaxLoops;
    public synchronized void set_gMaxLoops(int v) {
        setVar(mExportVarIdx_gMaxLoops, v);
        mExportVar_gMaxLoops = v;
    }

    public int get_gMaxLoops() {
        return mExportVar_gMaxLoops;
    }

    public Script.FieldID getFieldID_gMaxLoops() {
        return createFieldID(mExportVarIdx_gMaxLoops, null);
    }

    private final static int mExportVarIdx_gDisplayMode = 3;
    private int mExportVar_gDisplayMode;
    public synchronized void set_gDisplayMode(int v) {
        setVar(mExportVarIdx_gDisplayMode, v);
        mExportVar_gDisplayMode = v;
    }

    public int get_gDisplayMode() {
        return mExportVar_gDisplayMode;
    }

    public Script.FieldID getFieldID_gDisplayMode() {
        return createFieldID(mExportVarIdx_gDisplayMode, null);
    }

    private final static int mExportVarIdx_gFontSerif = 4;
    private Font mExportVar_gFontSerif;
    public synchronized void set_gFontSerif(Font v) {
        setVar(mExportVarIdx_gFontSerif, v);
        mExportVar_gFontSerif = v;
    }

    public Font get_gFontSerif() {
        return mExportVar_gFontSerif;
    }

    public Script.FieldID getFieldID_gFontSerif() {
        return createFieldID(mExportVarIdx_gFontSerif, null);
    }

    private final static int mExportVarIdx_gLinearClamp = 5;
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

    private final static int mExportVarIdx_gProgVertex = 6;
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

    private final static int mExportVarIdx_gProgFragmentTexture = 7;
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

    private final static int mExportVarIdx_gRenderBufferColor = 8;
    private Allocation mExportVar_gRenderBufferColor;
    public synchronized void set_gRenderBufferColor(Allocation v) {
        setVar(mExportVarIdx_gRenderBufferColor, v);
        mExportVar_gRenderBufferColor = v;
    }

    public Allocation get_gRenderBufferColor() {
        return mExportVar_gRenderBufferColor;
    }

    public Script.FieldID getFieldID_gRenderBufferColor() {
        return createFieldID(mExportVarIdx_gRenderBufferColor, null);
    }

    private final static int mExportVarIdx_gRenderBufferDepth = 9;
    private Allocation mExportVar_gRenderBufferDepth;
    public synchronized void set_gRenderBufferDepth(Allocation v) {
        setVar(mExportVarIdx_gRenderBufferDepth, v);
        mExportVar_gRenderBufferDepth = v;
    }

    public Allocation get_gRenderBufferDepth() {
        return mExportVar_gRenderBufferDepth;
    }

    public Script.FieldID getFieldID_gRenderBufferDepth() {
        return createFieldID(mExportVarIdx_gRenderBufferDepth, null);
    }

    private final static int mExportVarIdx_gVSInputs = 10;
    private ScriptField_VertexShaderInputs_s mExportVar_gVSInputs;
    public void bind_gVSInputs(ScriptField_VertexShaderInputs_s v) {
        mExportVar_gVSInputs = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gVSInputs);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gVSInputs);
    }

    public ScriptField_VertexShaderInputs_s get_gVSInputs() {
        return mExportVar_gVSInputs;
    }

    private final static int mExportVarIdx_gTestScripts = 11;
    private ScriptField_TestScripts_s mExportVar_gTestScripts;
    public void bind_gTestScripts(ScriptField_TestScripts_s v) {
        mExportVar_gTestScripts = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gTestScripts);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gTestScripts);
    }

    public ScriptField_TestScripts_s get_gTestScripts() {
        return mExportVar_gTestScripts;
    }

    private final static int mExportVarIdx_gLoadComplete = 12;
    private boolean mExportVar_gLoadComplete;
    public synchronized void set_gLoadComplete(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_gLoadComplete, __rs_fp_BOOLEAN);
        mExportVar_gLoadComplete = v;
    }

    public boolean get_gLoadComplete() {
        return mExportVar_gLoadComplete;
    }

    public Script.FieldID getFieldID_gLoadComplete() {
        return createFieldID(mExportVarIdx_gLoadComplete, null);
    }

    private final static int mExportVarIdx_gPauseRendering = 13;
    private boolean mExportVar_gPauseRendering;
    public synchronized void set_gPauseRendering(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_gPauseRendering, __rs_fp_BOOLEAN);
        mExportVar_gPauseRendering = v;
    }

    public boolean get_gPauseRendering() {
        return mExportVar_gPauseRendering;
    }

    public Script.FieldID getFieldID_gPauseRendering() {
        return createFieldID(mExportVarIdx_gPauseRendering, null);
    }

    private final static int mExportFuncIdx_setDebugMode = 0;
    public void invoke_setDebugMode(int testNumber) {
        FieldPacker setDebugMode_fp = new FieldPacker(4);
        setDebugMode_fp.addI32(testNumber);
        invoke(mExportFuncIdx_setDebugMode, setDebugMode_fp);
    }

    private final static int mExportFuncIdx_setBenchmarkMode = 1;
    public void invoke_setBenchmarkMode(int testNumber) {
        FieldPacker setBenchmarkMode_fp = new FieldPacker(4);
        setBenchmarkMode_fp.addI32(testNumber);
        invoke(mExportFuncIdx_setBenchmarkMode, setBenchmarkMode_fp);
    }

}

