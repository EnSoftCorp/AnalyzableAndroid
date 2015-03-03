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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/element.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_element extends ScriptC {
    private static final String __rs_resource_name = "element";
    // Constructor
    public  ScriptC_element(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_element(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __ELEMENT = Element.ELEMENT(rs);
    }

    private Element __ELEMENT;
    private FieldPacker __rs_fp_ELEMENT;
    private final static int mExportVarIdx_simpleElem = 0;
    private Element mExportVar_simpleElem;
    public synchronized void set_simpleElem(Element v) {
        setVar(mExportVarIdx_simpleElem, v);
        mExportVar_simpleElem = v;
    }

    public Element get_simpleElem() {
        return mExportVar_simpleElem;
    }

    public Script.FieldID getFieldID_simpleElem() {
        return createFieldID(mExportVarIdx_simpleElem, null);
    }

    private final static int mExportVarIdx_complexElem = 1;
    private Element mExportVar_complexElem;
    public synchronized void set_complexElem(Element v) {
        setVar(mExportVarIdx_complexElem, v);
        mExportVar_complexElem = v;
    }

    public Element get_complexElem() {
        return mExportVar_complexElem;
    }

    public Script.FieldID getFieldID_complexElem() {
        return createFieldID(mExportVarIdx_complexElem, null);
    }

    private final static int mExportVarIdx_complexStruct = 2;
    private ScriptField_ComplexStruct mExportVar_complexStruct;
    public void bind_complexStruct(ScriptField_ComplexStruct v) {
        mExportVar_complexStruct = v;
        if (v == null) bindAllocation(null, mExportVarIdx_complexStruct);
        else bindAllocation(v.getAllocation(), mExportVarIdx_complexStruct);
    }

    public ScriptField_ComplexStruct get_complexStruct() {
        return mExportVar_complexStruct;
    }

    private final static int mExportFuncIdx_element_test = 0;
    public void invoke_element_test() {
        invoke(mExportFuncIdx_element_test);
    }

}

