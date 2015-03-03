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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_16/src/com/android/rs/test/test_root.rs
 */

package com.android.rs.test_v16;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_test_root extends ScriptC {
    private static final String __rs_resource_name = "test_root";
    // Constructor
    public  ScriptC_test_root(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_test_root(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
    }

    private final static int mExportVarIdx_results = 0;
    private ScriptField_TestResult mExportVar_results;
    public void bind_results(ScriptField_TestResult v) {
        mExportVar_results = v;
        if (v == null) bindAllocation(null, mExportVarIdx_results);
        else bindAllocation(v.getAllocation(), mExportVarIdx_results);
    }

    public ScriptField_TestResult get_results() {
        return mExportVar_results;
    }

}

