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
 * The source Renderscript file: packages/wallpapers/MusicVisualization/src/com/android/musicvis/vis4/vu.rs
 */
package com.android.musicvis.vis4;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_vu extends ScriptC {
    private static final String __rs_resource_name = "vu";
    // Constructor
    public  ScriptC_vu(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_vu(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
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
    private final static int mExportVarIdx_gAngle = 0;
    private float mExportVar_gAngle;
    public synchronized void set_gAngle(float v) {
        setVar(mExportVarIdx_gAngle, v);
        mExportVar_gAngle = v;
    }

    public float get_gAngle() {
        return mExportVar_gAngle;
    }

    public Script.FieldID getFieldID_gAngle() {
        return createFieldID(mExportVarIdx_gAngle, null);
    }

    private final static int mExportVarIdx_gPeak = 1;
    private int mExportVar_gPeak;
    public synchronized void set_gPeak(int v) {
        setVar(mExportVarIdx_gPeak, v);
        mExportVar_gPeak = v;
    }

    public int get_gPeak() {
        return mExportVar_gPeak;
    }

    public Script.FieldID getFieldID_gPeak() {
        return createFieldID(mExportVarIdx_gPeak, null);
    }

    private final static int mExportVarIdx_gPVBackground = 2;
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

    private final static int mExportVarIdx_gPFBackground = 3;
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

    private final static int mExportVarIdx_gTvumeter_background = 4;
    private Allocation mExportVar_gTvumeter_background;
    public synchronized void set_gTvumeter_background(Allocation v) {
        setVar(mExportVarIdx_gTvumeter_background, v);
        mExportVar_gTvumeter_background = v;
    }

    public Allocation get_gTvumeter_background() {
        return mExportVar_gTvumeter_background;
    }

    public Script.FieldID getFieldID_gTvumeter_background() {
        return createFieldID(mExportVarIdx_gTvumeter_background, null);
    }

    private final static int mExportVarIdx_gTvumeter_peak_on = 5;
    private Allocation mExportVar_gTvumeter_peak_on;
    public synchronized void set_gTvumeter_peak_on(Allocation v) {
        setVar(mExportVarIdx_gTvumeter_peak_on, v);
        mExportVar_gTvumeter_peak_on = v;
    }

    public Allocation get_gTvumeter_peak_on() {
        return mExportVar_gTvumeter_peak_on;
    }

    public Script.FieldID getFieldID_gTvumeter_peak_on() {
        return createFieldID(mExportVarIdx_gTvumeter_peak_on, null);
    }

    private final static int mExportVarIdx_gTvumeter_peak_off = 6;
    private Allocation mExportVar_gTvumeter_peak_off;
    public synchronized void set_gTvumeter_peak_off(Allocation v) {
        setVar(mExportVarIdx_gTvumeter_peak_off, v);
        mExportVar_gTvumeter_peak_off = v;
    }

    public Allocation get_gTvumeter_peak_off() {
        return mExportVar_gTvumeter_peak_off;
    }

    public Script.FieldID getFieldID_gTvumeter_peak_off() {
        return createFieldID(mExportVarIdx_gTvumeter_peak_off, null);
    }

    private final static int mExportVarIdx_gTvumeter_needle = 7;
    private Allocation mExportVar_gTvumeter_needle;
    public synchronized void set_gTvumeter_needle(Allocation v) {
        setVar(mExportVarIdx_gTvumeter_needle, v);
        mExportVar_gTvumeter_needle = v;
    }

    public Allocation get_gTvumeter_needle() {
        return mExportVar_gTvumeter_needle;
    }

    public Script.FieldID getFieldID_gTvumeter_needle() {
        return createFieldID(mExportVarIdx_gTvumeter_needle, null);
    }

    private final static int mExportVarIdx_gTvumeter_black = 8;
    private Allocation mExportVar_gTvumeter_black;
    public synchronized void set_gTvumeter_black(Allocation v) {
        setVar(mExportVarIdx_gTvumeter_black, v);
        mExportVar_gTvumeter_black = v;
    }

    public Allocation get_gTvumeter_black() {
        return mExportVar_gTvumeter_black;
    }

    public Script.FieldID getFieldID_gTvumeter_black() {
        return createFieldID(mExportVarIdx_gTvumeter_black, null);
    }

    private final static int mExportVarIdx_gTvumeter_frame = 9;
    private Allocation mExportVar_gTvumeter_frame;
    public synchronized void set_gTvumeter_frame(Allocation v) {
        setVar(mExportVarIdx_gTvumeter_frame, v);
        mExportVar_gTvumeter_frame = v;
    }

    public Allocation get_gTvumeter_frame() {
        return mExportVar_gTvumeter_frame;
    }

    public Script.FieldID getFieldID_gTvumeter_frame() {
        return createFieldID(mExportVarIdx_gTvumeter_frame, null);
    }

    private final static int mExportVarIdx_gPFSBackground = 10;
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

}

