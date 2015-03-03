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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_14/src/com/android/rs/test/refcount.rs
 */

package com.android.rs.test_v14;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_refcount extends ScriptC {
    private static final String __rs_resource_name = "refcount";
    // Constructor
    public  ScriptC_refcount(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_refcount(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
    }

    private FieldPacker __rs_fp_ALLOCATION;
    private final static int mExportVarIdx_globalA = 0;
    private Allocation mExportVar_globalA;
    public synchronized void set_globalA(Allocation v) {
        setVar(mExportVarIdx_globalA, v);
        mExportVar_globalA = v;
    }

    public Allocation get_globalA() {
        return mExportVar_globalA;
    }

    private final static int mExportFuncIdx_refcount_test = 0;
    public void invoke_refcount_test() {
        invoke(mExportFuncIdx_refcount_test);
    }

}

