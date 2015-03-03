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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/ModelViewer/src/com/android/modelviewer/transform.rs
 */

package com.android.modelviewer;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_transform extends ScriptC {
    private static final String __rs_resource_name = "transform";
    // Constructor
    public  ScriptC_transform(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_transform(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __SCRIPT = Element.SCRIPT(rs);
    }

    private Element __SCRIPT;
    private FieldPacker __rs_fp_SCRIPT;
    private final static int mExportVarIdx_transformScript = 0;
    private Script mExportVar_transformScript;
    public synchronized void set_transformScript(Script v) {
        setVar(mExportVarIdx_transformScript, v);
        mExportVar_transformScript = v;
    }

    public Script get_transformScript() {
        return mExportVar_transformScript;
    }

    public Script.FieldID getFieldID_transformScript() {
        return createFieldID(mExportVarIdx_transformScript, null);
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

}

