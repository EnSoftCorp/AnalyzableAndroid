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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/struct.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.structBitCode;

/**
 * @hide
 */
public class ScriptC_struct extends ScriptC {
    private static final String __rs_resource_name = "struct";
    // Constructor
    public  ScriptC_struct(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              structBitCode.getBitCode32(),
              structBitCode.getBitCode64());
    }

    private final static int mExportVarIdx_point2 = 0;
    private ScriptField_Point2 mExportVar_point2;
    public void bind_point2(ScriptField_Point2 v) {
        mExportVar_point2 = v;
        if (v == null) bindAllocation(null, mExportVarIdx_point2);
        else bindAllocation(v.getAllocation(), mExportVarIdx_point2);
    }

    public ScriptField_Point2 get_point2() {
        return mExportVar_point2;
    }

    private final static int mExportFuncIdx_struct_test = 0;
    public void invoke_struct_test(int expected) {
        FieldPacker struct_test_fp = new FieldPacker(4);
        struct_test_fp.addI32(expected);
        invoke(mExportFuncIdx_struct_test, struct_test_fp);
    }

}

