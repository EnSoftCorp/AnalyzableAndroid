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
 * The source Renderscript file: packages/wallpapers/MusicVisualization/src/com/android/musicvis/vis5/many.rs
 */

package com.android.musicvis.vis5;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_many extends ScriptC {
    private static final String __rs_resource_name = "many";
    // Constructor
    public  ScriptC_many(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_many(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
        __PROGRAM_VERTEX = Element.PROGRAM_VERTEX(rs);
        __PROGRAM_FRAGMENT = Element.PROGRAM_FRAGMENT(rs);
        __PROGRAM_RASTER = Element.PROGRAM_RASTER(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __PROGRAM_STORE = Element.PROGRAM_STORE(rs);
        __MESH = Element.MESH(rs);
        mExportVar_fadeoutcounter = 0;
        mExportVar_fadeincounter = 0;
        mExportVar_wave1pos = 0;
        mExportVar_wave1amp = 0;
        mExportVar_wave2pos = 0;
        mExportVar_wave2amp = 0;
        mExportVar_wave3pos = 0;
        mExportVar_wave3amp = 0;
        mExportVar_wave4pos = 0;
        mExportVar_wave4amp = 0;
        mExportVar_waveCounter = 0;
        mExportVar_lastuptime = 0;
        mExportVar_autorotation = 0.f;
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __I32;
    private Element __MESH;
    private Element __PROGRAM_FRAGMENT;
    private Element __PROGRAM_RASTER;
    private Element __PROGRAM_STORE;
    private Element __PROGRAM_VERTEX;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_MESH;
    private FieldPacker __rs_fp_PROGRAM_FRAGMENT;
    private FieldPacker __rs_fp_PROGRAM_RASTER;
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

    private final static int mExportVarIdx_gRotate = 2;
    private float mExportVar_gRotate;
    public synchronized void set_gRotate(float v) {
        setVar(mExportVarIdx_gRotate, v);
        mExportVar_gRotate = v;
    }

    public float get_gRotate() {
        return mExportVar_gRotate;
    }

    public Script.FieldID getFieldID_gRotate() {
        return createFieldID(mExportVarIdx_gRotate, null);
    }

    private final static int mExportVarIdx_gTilt = 3;
    private float mExportVar_gTilt;
    public synchronized void set_gTilt(float v) {
        setVar(mExportVarIdx_gTilt, v);
        mExportVar_gTilt = v;
    }

    public float get_gTilt() {
        return mExportVar_gTilt;
    }

    public Script.FieldID getFieldID_gTilt() {
        return createFieldID(mExportVarIdx_gTilt, null);
    }

    private final static int mExportVarIdx_gIdle = 4;
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

    private final static int mExportVarIdx_gWaveCounter = 5;
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

    private final static int mExportVarIdx_gPVBackground = 6;
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

    private final static int mExportVarIdx_gPFBackgroundMip = 7;
    private ProgramFragment mExportVar_gPFBackgroundMip;
    public synchronized void set_gPFBackgroundMip(ProgramFragment v) {
        setVar(mExportVarIdx_gPFBackgroundMip, v);
        mExportVar_gPFBackgroundMip = v;
    }

    public ProgramFragment get_gPFBackgroundMip() {
        return mExportVar_gPFBackgroundMip;
    }

    public Script.FieldID getFieldID_gPFBackgroundMip() {
        return createFieldID(mExportVarIdx_gPFBackgroundMip, null);
    }

    private final static int mExportVarIdx_gPFBackgroundNoMip = 8;
    private ProgramFragment mExportVar_gPFBackgroundNoMip;
    public synchronized void set_gPFBackgroundNoMip(ProgramFragment v) {
        setVar(mExportVarIdx_gPFBackgroundNoMip, v);
        mExportVar_gPFBackgroundNoMip = v;
    }

    public ProgramFragment get_gPFBackgroundNoMip() {
        return mExportVar_gPFBackgroundNoMip;
    }

    public Script.FieldID getFieldID_gPFBackgroundNoMip() {
        return createFieldID(mExportVarIdx_gPFBackgroundNoMip, null);
    }

    private final static int mExportVarIdx_gPR = 9;
    private ProgramRaster mExportVar_gPR;
    public synchronized void set_gPR(ProgramRaster v) {
        setVar(mExportVarIdx_gPR, v);
        mExportVar_gPR = v;
    }

    public ProgramRaster get_gPR() {
        return mExportVar_gPR;
    }

    public Script.FieldID getFieldID_gPR() {
        return createFieldID(mExportVarIdx_gPR, null);
    }

    private final static int mExportVarIdx_gTvumeter_background = 10;
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

    private final static int mExportVarIdx_gTvumeter_peak_on = 11;
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

    private final static int mExportVarIdx_gTvumeter_peak_off = 12;
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

    private final static int mExportVarIdx_gTvumeter_needle = 13;
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

    private final static int mExportVarIdx_gTvumeter_black = 14;
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

    private final static int mExportVarIdx_gTvumeter_frame = 15;
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

    private final static int mExportVarIdx_gTvumeter_album = 16;
    private Allocation mExportVar_gTvumeter_album;
    public synchronized void set_gTvumeter_album(Allocation v) {
        setVar(mExportVarIdx_gTvumeter_album, v);
        mExportVar_gTvumeter_album = v;
    }

    public Allocation get_gTvumeter_album() {
        return mExportVar_gTvumeter_album;
    }

    public Script.FieldID getFieldID_gTvumeter_album() {
        return createFieldID(mExportVarIdx_gTvumeter_album, null);
    }

    private final static int mExportVarIdx_gPFSBackground = 17;
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

    private final static int mExportVarIdx_gPoints = 18;
    private ScriptField_Vertex mExportVar_gPoints;
    public void bind_gPoints(ScriptField_Vertex v) {
        mExportVar_gPoints = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gPoints);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gPoints);
    }

    public ScriptField_Vertex get_gPoints() {
        return mExportVar_gPoints;
    }

    private final static int mExportVarIdx_gPointBuffer = 19;
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

    private final static int mExportVarIdx_gTlinetexture = 20;
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

    private final static int mExportVarIdx_gCubeMesh = 21;
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

    private final static int mExportVarIdx_fadeoutcounter = 22;
    private int mExportVar_fadeoutcounter;
    public synchronized void set_fadeoutcounter(int v) {
        setVar(mExportVarIdx_fadeoutcounter, v);
        mExportVar_fadeoutcounter = v;
    }

    public int get_fadeoutcounter() {
        return mExportVar_fadeoutcounter;
    }

    public Script.FieldID getFieldID_fadeoutcounter() {
        return createFieldID(mExportVarIdx_fadeoutcounter, null);
    }

    private final static int mExportVarIdx_fadeincounter = 23;
    private int mExportVar_fadeincounter;
    public synchronized void set_fadeincounter(int v) {
        setVar(mExportVarIdx_fadeincounter, v);
        mExportVar_fadeincounter = v;
    }

    public int get_fadeincounter() {
        return mExportVar_fadeincounter;
    }

    public Script.FieldID getFieldID_fadeincounter() {
        return createFieldID(mExportVarIdx_fadeincounter, null);
    }

    private final static int mExportVarIdx_wave1pos = 24;
    private int mExportVar_wave1pos;
    public synchronized void set_wave1pos(int v) {
        setVar(mExportVarIdx_wave1pos, v);
        mExportVar_wave1pos = v;
    }

    public int get_wave1pos() {
        return mExportVar_wave1pos;
    }

    public Script.FieldID getFieldID_wave1pos() {
        return createFieldID(mExportVarIdx_wave1pos, null);
    }

    private final static int mExportVarIdx_wave1amp = 25;
    private int mExportVar_wave1amp;
    public synchronized void set_wave1amp(int v) {
        setVar(mExportVarIdx_wave1amp, v);
        mExportVar_wave1amp = v;
    }

    public int get_wave1amp() {
        return mExportVar_wave1amp;
    }

    public Script.FieldID getFieldID_wave1amp() {
        return createFieldID(mExportVarIdx_wave1amp, null);
    }

    private final static int mExportVarIdx_wave2pos = 26;
    private int mExportVar_wave2pos;
    public synchronized void set_wave2pos(int v) {
        setVar(mExportVarIdx_wave2pos, v);
        mExportVar_wave2pos = v;
    }

    public int get_wave2pos() {
        return mExportVar_wave2pos;
    }

    public Script.FieldID getFieldID_wave2pos() {
        return createFieldID(mExportVarIdx_wave2pos, null);
    }

    private final static int mExportVarIdx_wave2amp = 27;
    private int mExportVar_wave2amp;
    public synchronized void set_wave2amp(int v) {
        setVar(mExportVarIdx_wave2amp, v);
        mExportVar_wave2amp = v;
    }

    public int get_wave2amp() {
        return mExportVar_wave2amp;
    }

    public Script.FieldID getFieldID_wave2amp() {
        return createFieldID(mExportVarIdx_wave2amp, null);
    }

    private final static int mExportVarIdx_wave3pos = 28;
    private int mExportVar_wave3pos;
    public synchronized void set_wave3pos(int v) {
        setVar(mExportVarIdx_wave3pos, v);
        mExportVar_wave3pos = v;
    }

    public int get_wave3pos() {
        return mExportVar_wave3pos;
    }

    public Script.FieldID getFieldID_wave3pos() {
        return createFieldID(mExportVarIdx_wave3pos, null);
    }

    private final static int mExportVarIdx_wave3amp = 29;
    private int mExportVar_wave3amp;
    public synchronized void set_wave3amp(int v) {
        setVar(mExportVarIdx_wave3amp, v);
        mExportVar_wave3amp = v;
    }

    public int get_wave3amp() {
        return mExportVar_wave3amp;
    }

    public Script.FieldID getFieldID_wave3amp() {
        return createFieldID(mExportVarIdx_wave3amp, null);
    }

    private final static int mExportVarIdx_wave4pos = 30;
    private int mExportVar_wave4pos;
    public synchronized void set_wave4pos(int v) {
        setVar(mExportVarIdx_wave4pos, v);
        mExportVar_wave4pos = v;
    }

    public int get_wave4pos() {
        return mExportVar_wave4pos;
    }

    public Script.FieldID getFieldID_wave4pos() {
        return createFieldID(mExportVarIdx_wave4pos, null);
    }

    private final static int mExportVarIdx_wave4amp = 31;
    private int mExportVar_wave4amp;
    public synchronized void set_wave4amp(int v) {
        setVar(mExportVarIdx_wave4amp, v);
        mExportVar_wave4amp = v;
    }

    public int get_wave4amp() {
        return mExportVar_wave4amp;
    }

    public Script.FieldID getFieldID_wave4amp() {
        return createFieldID(mExportVarIdx_wave4amp, null);
    }

    private final static int mExportVarIdx_idle = 32;
    private float[] mExportVar_idle;
    public synchronized void set_idle(float[] v) {
        mExportVar_idle = v;
        FieldPacker fp = new FieldPacker(16384);
        for (int ct1 = 0; ct1 < 4096; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 4096;
        setVar(mExportVarIdx_idle, fp, __F32, __dimArr);
    }

    public float[] get_idle() {
        return mExportVar_idle;
    }

    public Script.FieldID getFieldID_idle() {
        return createFieldID(mExportVarIdx_idle, null);
    }

    private final static int mExportVarIdx_waveCounter = 33;
    private int mExportVar_waveCounter;
    public synchronized void set_waveCounter(int v) {
        setVar(mExportVarIdx_waveCounter, v);
        mExportVar_waveCounter = v;
    }

    public int get_waveCounter() {
        return mExportVar_waveCounter;
    }

    public Script.FieldID getFieldID_waveCounter() {
        return createFieldID(mExportVarIdx_waveCounter, null);
    }

    private final static int mExportVarIdx_lastuptime = 34;
    private int mExportVar_lastuptime;
    public synchronized void set_lastuptime(int v) {
        setVar(mExportVarIdx_lastuptime, v);
        mExportVar_lastuptime = v;
    }

    public int get_lastuptime() {
        return mExportVar_lastuptime;
    }

    public Script.FieldID getFieldID_lastuptime() {
        return createFieldID(mExportVarIdx_lastuptime, null);
    }

    private final static int mExportVarIdx_autorotation = 35;
    private float mExportVar_autorotation;
    public synchronized void set_autorotation(float v) {
        setVar(mExportVarIdx_autorotation, v);
        mExportVar_autorotation = v;
    }

    public float get_autorotation() {
        return mExportVar_autorotation;
    }

    public Script.FieldID getFieldID_autorotation() {
        return createFieldID(mExportVarIdx_autorotation, null);
    }

}

