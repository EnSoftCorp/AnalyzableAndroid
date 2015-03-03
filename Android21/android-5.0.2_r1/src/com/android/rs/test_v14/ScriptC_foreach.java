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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_14/src/com/android/rs/test/foreach.rs
 */

package com.android.rs.test_v14;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_foreach extends ScriptC {
    private static final String __rs_resource_name = "foreach";
    // Constructor
    public  ScriptC_foreach(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_foreach(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_aRaw = 0;
    private Allocation mExportVar_aRaw;
    public synchronized void set_aRaw(Allocation v) {
        setVar(mExportVarIdx_aRaw, v);
        mExportVar_aRaw = v;
    }

    public Allocation get_aRaw() {
        return mExportVar_aRaw;
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

    private final static int mExportForEachIdx_root = 0;
    public void forEach_root(Allocation aout) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_root, (Allocation) null, aout, null);
    }

    private final static int mExportFuncIdx_verify_root = 0;
    public void invoke_verify_root() {
        invoke(mExportFuncIdx_verify_root);
    }

    private final static int mExportFuncIdx_foreach_test = 1;
    public void invoke_foreach_test() {
        invoke(mExportFuncIdx_foreach_test);
    }

}

