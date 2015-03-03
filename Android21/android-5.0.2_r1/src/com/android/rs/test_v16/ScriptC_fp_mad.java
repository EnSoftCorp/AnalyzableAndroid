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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_16/src/com/android/rs/test/fp_mad.rs
 */

package com.android.rs.test_v16;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_fp_mad extends ScriptC {
    private static final String __rs_resource_name = "fp_mad";
    // Constructor
    public  ScriptC_fp_mad(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_fp_mad(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        mExportVar_TEST_COUNT = 1;
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_TEST_COUNT = 0;
    private int mExportVar_TEST_COUNT;
    public final static int const_TEST_COUNT = 1;
    public int get_TEST_COUNT() {
        return mExportVar_TEST_COUNT;
    }

    private final static int mExportFuncIdx_fp_mad_test = 0;
    public void invoke_fp_mad_test(long index, int test_num) {
        FieldPacker fp_mad_test_fp = new FieldPacker(8);
        fp_mad_test_fp.addU32(index);
        fp_mad_test_fp.addI32(test_num);
        invoke(mExportFuncIdx_fp_mad_test, fp_mad_test_fp);
    }

}

