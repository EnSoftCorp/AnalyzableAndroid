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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_16/src/com/android/rs/test/alloc.rs
 */

package com.android.rs.test_v16;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_alloc extends ScriptC {
    private static final String __rs_resource_name = "alloc";
    // Constructor
    public  ScriptC_alloc(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_alloc(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_a = 0;
    private Allocation mExportVar_a;
    public void bind_a(Allocation v) {
        mExportVar_a = v;
        if (v == null) bindAllocation(null, mExportVarIdx_a);
        else bindAllocation(v, mExportVarIdx_a);
    }

    public Allocation get_a() {
        return mExportVar_a;
    }

    private final static int mExportVarIdx_dimX = 1;
    private int mExportVar_dimX;
    public synchronized void set_dimX(int v) {
        setVar(mExportVarIdx_dimX, v);
        mExportVar_dimX = v;
    }

    public int get_dimX() {
        return mExportVar_dimX;
    }

    private final static int mExportVarIdx_dimY = 2;
    private int mExportVar_dimY;
    public synchronized void set_dimY(int v) {
        setVar(mExportVarIdx_dimY, v);
        mExportVar_dimY = v;
    }

    public int get_dimY() {
        return mExportVar_dimY;
    }

    private final static int mExportVarIdx_dimZ = 3;
    private int mExportVar_dimZ;
    public synchronized void set_dimZ(int v) {
        setVar(mExportVarIdx_dimZ, v);
        mExportVar_dimZ = v;
    }

    public int get_dimZ() {
        return mExportVar_dimZ;
    }

    private final static int mExportVarIdx_aRaw = 4;
    private Allocation mExportVar_aRaw;
    public synchronized void set_aRaw(Allocation v) {
        setVar(mExportVarIdx_aRaw, v);
        mExportVar_aRaw = v;
    }

    public Allocation get_aRaw() {
        return mExportVar_aRaw;
    }

    private final static int mExportVarIdx_aFaces = 5;
    private Allocation mExportVar_aFaces;
    public synchronized void set_aFaces(Allocation v) {
        setVar(mExportVarIdx_aFaces, v);
        mExportVar_aFaces = v;
    }

    public Allocation get_aFaces() {
        return mExportVar_aFaces;
    }

    private final static int mExportVarIdx_aLOD = 6;
    private Allocation mExportVar_aLOD;
    public synchronized void set_aLOD(Allocation v) {
        setVar(mExportVarIdx_aLOD, v);
        mExportVar_aLOD = v;
    }

    public Allocation get_aLOD() {
        return mExportVar_aLOD;
    }

    private final static int mExportVarIdx_aFacesLOD = 7;
    private Allocation mExportVar_aFacesLOD;
    public synchronized void set_aFacesLOD(Allocation v) {
        setVar(mExportVarIdx_aFacesLOD, v);
        mExportVar_aFacesLOD = v;
    }

    public Allocation get_aFacesLOD() {
        return mExportVar_aFacesLOD;
    }

    private final static int mExportForEachIdx_root = 0;
    public void forEach_root(Allocation aout) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_root, (Allocation) null, aout, null);
    }

    private final static int mExportFuncIdx_alloc_test = 0;
    public void invoke_alloc_test() {
        invoke(mExportFuncIdx_alloc_test);
    }

}

