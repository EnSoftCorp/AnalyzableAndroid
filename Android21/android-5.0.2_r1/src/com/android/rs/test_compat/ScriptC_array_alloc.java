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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/array_alloc.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_array_alloc extends ScriptC {
    private static final String __rs_resource_name = "array_alloc";
    // Constructor
    public  ScriptC_array_alloc(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_array_alloc(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_dimX = 20;
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_dimX = 0;
    private int mExportVar_dimX;
    public final static int const_dimX = 20;
    public int get_dimX() {
        return mExportVar_dimX;
    }

    public Script.FieldID getFieldID_dimX() {
        return createFieldID(mExportVarIdx_dimX, null);
    }

    private final static int mExportVarIdx_a = 1;
    private Allocation[] mExportVar_a;
    public synchronized void set_a(Allocation[] v) {
        mExportVar_a = v;
        FieldPacker fp = new FieldPacker(80);
        for (int ct1 = 0; ct1 < 20; ct1++) {
            fp.addObj(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 20;
        setVar(mExportVarIdx_a, fp, __ALLOCATION, __dimArr);
    }

    public Allocation[] get_a() {
        return mExportVar_a;
    }

    public Script.FieldID getFieldID_a() {
        return createFieldID(mExportVarIdx_a, null);
    }

    private final static int mExportFuncIdx_array_alloc_test = 0;
    public void invoke_array_alloc_test() {
        invoke(mExportFuncIdx_array_alloc_test);
    }

}

