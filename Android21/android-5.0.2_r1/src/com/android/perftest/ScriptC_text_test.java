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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/PerfTest/src/com/android/perftest/text_test.rs
 */

package com.android.perftest;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_text_test extends ScriptC {
    private static final String __rs_resource_name = "text_test";
    // Constructor
    public  ScriptC_text_test(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_text_test(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __FONT = Element.FONT(rs);
    }

    private Element __FONT;
    private FieldPacker __rs_fp_FONT;
    private final static int mExportVarIdx_gFontSans = 0;
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

    private final static int mExportVarIdx_gFontSerif = 1;
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

    private final static int mExportVarIdx_gData = 2;
    private ScriptField_TextTestData_s mExportVar_gData;
    public void bind_gData(ScriptField_TextTestData_s v) {
        mExportVar_gData = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gData);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gData);
    }

    public ScriptField_TextTestData_s get_gData() {
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

}

