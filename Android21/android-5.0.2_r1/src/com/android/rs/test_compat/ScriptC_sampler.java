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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/sampler.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_sampler extends ScriptC {
    private static final String __rs_resource_name = "sampler";
    // Constructor
    public  ScriptC_sampler(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_sampler(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __SAMPLER = Element.SAMPLER(rs);
    }

    private Element __SAMPLER;
    private FieldPacker __rs_fp_SAMPLER;
    private final static int mExportVarIdx_minification = 0;
    private Sampler mExportVar_minification;
    public synchronized void set_minification(Sampler v) {
        setVar(mExportVarIdx_minification, v);
        mExportVar_minification = v;
    }

    public Sampler get_minification() {
        return mExportVar_minification;
    }

    public Script.FieldID getFieldID_minification() {
        return createFieldID(mExportVarIdx_minification, null);
    }

    private final static int mExportVarIdx_magnification = 1;
    private Sampler mExportVar_magnification;
    public synchronized void set_magnification(Sampler v) {
        setVar(mExportVarIdx_magnification, v);
        mExportVar_magnification = v;
    }

    public Sampler get_magnification() {
        return mExportVar_magnification;
    }

    public Script.FieldID getFieldID_magnification() {
        return createFieldID(mExportVarIdx_magnification, null);
    }

    private final static int mExportVarIdx_wrapS = 2;
    private Sampler mExportVar_wrapS;
    public synchronized void set_wrapS(Sampler v) {
        setVar(mExportVarIdx_wrapS, v);
        mExportVar_wrapS = v;
    }

    public Sampler get_wrapS() {
        return mExportVar_wrapS;
    }

    public Script.FieldID getFieldID_wrapS() {
        return createFieldID(mExportVarIdx_wrapS, null);
    }

    private final static int mExportVarIdx_wrapT = 3;
    private Sampler mExportVar_wrapT;
    public synchronized void set_wrapT(Sampler v) {
        setVar(mExportVarIdx_wrapT, v);
        mExportVar_wrapT = v;
    }

    public Sampler get_wrapT() {
        return mExportVar_wrapT;
    }

    public Script.FieldID getFieldID_wrapT() {
        return createFieldID(mExportVarIdx_wrapT, null);
    }

    private final static int mExportVarIdx_anisotropy = 4;
    private Sampler mExportVar_anisotropy;
    public synchronized void set_anisotropy(Sampler v) {
        setVar(mExportVarIdx_anisotropy, v);
        mExportVar_anisotropy = v;
    }

    public Sampler get_anisotropy() {
        return mExportVar_anisotropy;
    }

    public Script.FieldID getFieldID_anisotropy() {
        return createFieldID(mExportVarIdx_anisotropy, null);
    }

    private final static int mExportFuncIdx_sampler_test = 0;
    public void invoke_sampler_test() {
        invoke(mExportFuncIdx_sampler_test);
    }

}

