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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/rslist.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.rslistBitCode;

/**
 * @hide
 */
public class ScriptC_rslist extends ScriptC {
    private static final String __rs_resource_name = "rslist";
    // Constructor
    public  ScriptC_rslist(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              rslistBitCode.getBitCode32(),
              rslistBitCode.getBitCode64());
    }

    private final static int mExportVarIdx_gList = 0;
    private ScriptField_ListAllocs_s mExportVar_gList;
    public void bind_gList(ScriptField_ListAllocs_s v) {
        mExportVar_gList = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gList);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gList);
    }

    public ScriptField_ListAllocs_s get_gList() {
        return mExportVar_gList;
    }

}

