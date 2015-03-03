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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/Fountain_v11/src/com/android/fountain/fountain.rs
 */

package com.android.fountain_v11;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_fountain extends ScriptC {
    private static final String __rs_resource_name = "fountain";
    // Constructor
    public  ScriptC_fountain(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_fountain(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
    }

    private FieldPacker __rs_fp_MESH;
    private final static int mExportVarIdx_partMesh = 0;
    private Mesh mExportVar_partMesh;
    public synchronized void set_partMesh(Mesh v) {
        setVar(mExportVarIdx_partMesh, v);
        mExportVar_partMesh = v;
    }

    public Mesh get_partMesh() {
        return mExportVar_partMesh;
    }

    private final static int mExportVarIdx_point = 1;
    private ScriptField_Point mExportVar_point;
    public void bind_point(ScriptField_Point v) {
        mExportVar_point = v;
        if (v == null) bindAllocation(null, mExportVarIdx_point);
        else bindAllocation(v.getAllocation(), mExportVarIdx_point);
    }

    public ScriptField_Point get_point() {
        return mExportVar_point;
    }

    private final static int mExportFuncIdx_addParticles = 0;
    public void invoke_addParticles(int rate, float x, float y, int index, boolean newColor) {
        FieldPacker addParticles_fp = new FieldPacker(20);
        addParticles_fp.addI32(rate);
        addParticles_fp.addF32(x);
        addParticles_fp.addF32(y);
        addParticles_fp.addI32(index);
        addParticles_fp.addBoolean(newColor);
        addParticles_fp.skip(3);
        invoke(mExportFuncIdx_addParticles, addParticles_fp);
    }

}

