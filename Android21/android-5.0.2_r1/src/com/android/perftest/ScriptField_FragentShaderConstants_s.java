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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/PerfTest/src/com/android/perftest/torus_test.rs
 */

package com.android.perftest;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptField_FragentShaderConstants_s extends android.renderscript.Script.FieldBase {
    static public class Item {
        public static final int sizeof = 64;

        Float4 light0_DiffuseColor;
        Float4 light0_SpecularColor;
        Float4 light1_DiffuseColor;
        Float4 light1_SpecularColor;

        Item() {
            light0_DiffuseColor = new Float4();
            light0_SpecularColor = new Float4();
            light1_DiffuseColor = new Float4();
            light1_SpecularColor = new Float4();
        }

    }

    private Item mItemArray[];
    private FieldPacker mIOBuffer;
    private static java.lang.ref.WeakReference<Element> mElementCache = new java.lang.ref.WeakReference<Element>(null);
    public static Element createElement(RenderScript rs) {
        Element.Builder eb = new Element.Builder(rs);
        eb.add(Element.F32_4(rs), "light0_DiffuseColor");
        eb.add(Element.F32_4(rs), "light0_SpecularColor");
        eb.add(Element.F32_4(rs), "light1_DiffuseColor");
        eb.add(Element.F32_4(rs), "light1_SpecularColor");
        return eb.create();
    }

    private  ScriptField_FragentShaderConstants_s(RenderScript rs) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
    }

    public  ScriptField_FragentShaderConstants_s(RenderScript rs, int count) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count);
    }

    public  ScriptField_FragentShaderConstants_s(RenderScript rs, int count, int usages) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count, usages);
    }

    public static ScriptField_FragentShaderConstants_s create1D(RenderScript rs, int dimX, int usages) {
        ScriptField_FragentShaderConstants_s obj = new ScriptField_FragentShaderConstants_s(rs);
        obj.mAllocation = Allocation.createSized(rs, obj.mElement, dimX, usages);
        return obj;
    }

    public static ScriptField_FragentShaderConstants_s create1D(RenderScript rs, int dimX) {
        return create1D(rs, dimX, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_FragentShaderConstants_s create2D(RenderScript rs, int dimX, int dimY) {
        return create2D(rs, dimX, dimY, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_FragentShaderConstants_s create2D(RenderScript rs, int dimX, int dimY, int usages) {
        ScriptField_FragentShaderConstants_s obj = new ScriptField_FragentShaderConstants_s(rs);
        Type.Builder b = new Type.Builder(rs, obj.mElement);
        b.setX(dimX);
        b.setY(dimY);
        Type t = b.create();
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    public static Type.Builder createTypeBuilder(RenderScript rs) {
        Element e = createElement(rs);
        return new Type.Builder(rs, e);
    }

    public static ScriptField_FragentShaderConstants_s createCustom(RenderScript rs, Type.Builder tb, int usages) {
        ScriptField_FragentShaderConstants_s obj = new ScriptField_FragentShaderConstants_s(rs);
        Type t = tb.create();
        if (t.getElement() != obj.mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    private void copyToArrayLocal(Item i, FieldPacker fp) {
        fp.addF32(i.light0_DiffuseColor);
        fp.addF32(i.light0_SpecularColor);
        fp.addF32(i.light1_DiffuseColor);
        fp.addF32(i.light1_SpecularColor);
    }

    private void copyToArray(Item i, int index) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        mIOBuffer.reset(index * mElement.getBytesSize());
        copyToArrayLocal(i, mIOBuffer);
    }

    public synchronized void set(Item i, int index, boolean copyNow) {
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        mItemArray[index] = i;
        if (copyNow)  {
            copyToArray(i, index);
            FieldPacker fp = new FieldPacker(mElement.getBytesSize());
            copyToArrayLocal(i, fp);
            mAllocation.setFromFieldPacker(index, fp);
        }

    }

    public synchronized Item get(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index];
    }

    public synchronized void set_light0_DiffuseColor(int index, Float4 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light0_DiffuseColor = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize());
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(16);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 0, fp);
        }

    }

    public synchronized void set_light0_SpecularColor(int index, Float4 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light0_SpecularColor = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 16);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(16);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 1, fp);
        }

    }

    public synchronized void set_light1_DiffuseColor(int index, Float4 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light1_DiffuseColor = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 32);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(16);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 2, fp);
        }

    }

    public synchronized void set_light1_SpecularColor(int index, Float4 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light1_SpecularColor = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 48);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(16);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 3, fp);
        }

    }

    public synchronized Float4 get_light0_DiffuseColor(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].light0_DiffuseColor;
    }

    public synchronized Float4 get_light0_SpecularColor(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].light0_SpecularColor;
    }

    public synchronized Float4 get_light1_DiffuseColor(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].light1_DiffuseColor;
    }

    public synchronized Float4 get_light1_SpecularColor(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].light1_SpecularColor;
    }

    public synchronized void copyAll() {
        for (int ct = 0; ct < mItemArray.length; ct++) copyToArray(mItemArray[ct], ct);
        mAllocation.setFromFieldPacker(0, mIOBuffer);
    }

    public synchronized void resize(int newSize) {
        if (mItemArray != null)  {
            int oldSize = mItemArray.length;
            int copySize = Math.min(oldSize, newSize);
            if (newSize == oldSize) return;
            Item ni[] = new Item[newSize];
            System.arraycopy(mItemArray, 0, ni, 0, copySize);
            mItemArray = ni;
        }

        mAllocation.resize(newSize);
        if (mIOBuffer != null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
    }

}
