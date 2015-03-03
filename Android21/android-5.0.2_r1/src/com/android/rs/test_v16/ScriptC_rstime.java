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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_16/src/com/android/rs/test/rstime.rs
 */

package com.android.rs.test_v16;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_rstime extends ScriptC {
    private static final String __rs_resource_name = "rstime";
    // Constructor
    public  ScriptC_rstime(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_rstime(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
    }

    private final static int mExportFuncIdx_test_rstime = 0;
    public void invoke_test_rstime(long index, int test_num) {
        FieldPacker test_rstime_fp = new FieldPacker(8);
        test_rstime_fp.addU32(index);
        test_rstime_fp.addI32(test_num);
        invoke(mExportFuncIdx_test_rstime, test_rstime_fp);
    }

}

