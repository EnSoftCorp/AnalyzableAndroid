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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest_16/src/com/android/rs/test/rslist.rs
 */

package com.android.rs.test_v16;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_rslist extends ScriptC {
    private static final String __rs_resource_name = "rslist";
    // Constructor
    public  ScriptC_rslist(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_rslist(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __F32 = Element.F32(rs);
        __FONT = Element.FONT(rs);
        mExportVar_textPos = 0;
        __I32 = Element.I32(rs);
    }

    private Element __F32;
    private Element __FONT;
    private Element __I32;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_FONT;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_gDY = 0;
    private float mExportVar_gDY;
    public synchronized void set_gDY(float v) {
        setVar(mExportVarIdx_gDY, v);
        mExportVar_gDY = v;
    }

    public float get_gDY() {
        return mExportVar_gDY;
    }

    private final static int mExportVarIdx_gFont = 1;
    private Font mExportVar_gFont;
    public synchronized void set_gFont(Font v) {
        setVar(mExportVarIdx_gFont, v);
        mExportVar_gFont = v;
    }

    public Font get_gFont() {
        return mExportVar_gFont;
    }

    private final static int mExportVarIdx_gList = 2;
    private ScriptField_ListAllocs_s mExportVar_gList;
    public void bind_gList(ScriptField_ListAllocs_s v) {
        mExportVar_gList = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gList);
        else bindAllocation(v.getAllocation(), mExportVarIdx_gList);
    }

    public ScriptField_ListAllocs_s get_gList() {
        return mExportVar_gList;
    }

    private final static int mExportVarIdx_textPos = 3;
    private int mExportVar_textPos;
    public synchronized void set_textPos(int v) {
        setVar(mExportVarIdx_textPos, v);
        mExportVar_textPos = v;
    }

    public int get_textPos() {
        return mExportVar_textPos;
    }

}

