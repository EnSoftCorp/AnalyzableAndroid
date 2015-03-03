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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/instance.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_instance extends ScriptC {
    private static final String __rs_resource_name = "instance";
    // Constructor
    public  ScriptC_instance(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_instance(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_i = 0;
    private int mExportVar_i;
    public synchronized void set_i(int v) {
        setVar(mExportVarIdx_i, v);
        mExportVar_i = v;
    }

    public int get_i() {
        return mExportVar_i;
    }

    public Script.FieldID getFieldID_i() {
        return createFieldID(mExportVarIdx_i, null);
    }

    private final static int mExportVarIdx_ai = 1;
    private Allocation mExportVar_ai;
    public synchronized void set_ai(Allocation v) {
        setVar(mExportVarIdx_ai, v);
        mExportVar_ai = v;
    }

    public Allocation get_ai() {
        return mExportVar_ai;
    }

    public Script.FieldID getFieldID_ai() {
        return createFieldID(mExportVarIdx_ai, null);
    }

    private final static int mExportFuncIdx_instance_test = 0;
    public void invoke_instance_test() {
        invoke(mExportFuncIdx_instance_test);
    }

}

