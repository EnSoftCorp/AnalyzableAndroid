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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/ShadersTest/src/com/android/shaderstest/shaderstest.rs
 */

package com.android.shaderstest;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptField_MeshInfo extends android.renderscript.Script.FieldBase {
    static public class Item {
        public static final int sizeof = 48;

        Mesh mMesh;
        int mNumIndexSets;
        Float3 bBoxMin;
        Float3 bBoxMax;

        Item() {
            bBoxMin = new Float3();
            bBoxMax = new Float3();
        }

    }

    private Item mItemArray[];
    private FieldPacker mIOBuffer;
    private static java.lang.ref.WeakReference<Element> mElementCache = new java.lang.ref.WeakReference<Element>(null);
    public static Element createElement(RenderScript rs) {
        Element.Builder eb = new Element.Builder(rs);
        eb.add(Element.MESH(rs), "mMesh");
        eb.add(Element.I32(rs), "mNumIndexSets");
        eb.add(Element.U32(rs), "#rs_padding_1");
        eb.add(Element.U32(rs), "#rs_padding_2");
        eb.add(Element.F32_3(rs), "bBoxMin");
        eb.add(Element.F32_3(rs), "bBoxMax");
        return eb.create();
    }

    private  ScriptField_MeshInfo(RenderScript rs) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
    }

    public  ScriptField_MeshInfo(RenderScript rs, int count) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count);
    }

    public  ScriptField_MeshInfo(RenderScript rs, int count, int usages) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count, usages);
    }

    public static ScriptField_MeshInfo create1D(RenderScript rs, int dimX, int usages) {
        ScriptField_MeshInfo obj = new ScriptField_MeshInfo(rs);
        obj.mAllocation = Allocation.createSized(rs, obj.mElement, dimX, usages);
        return obj;
    }

    public static ScriptField_MeshInfo create1D(RenderScript rs, int dimX) {
        return create1D(rs, dimX, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_MeshInfo create2D(RenderScript rs, int dimX, int dimY) {
        return create2D(rs, dimX, dimY, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_MeshInfo create2D(RenderScript rs, int dimX, int dimY, int usages) {
        ScriptField_MeshInfo obj = new ScriptField_MeshInfo(rs);
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

    public static ScriptField_MeshInfo createCustom(RenderScript rs, Type.Builder tb, int usages) {
        ScriptField_MeshInfo obj = new ScriptField_MeshInfo(rs);
        Type t = tb.create();
        if (t.getElement() != obj.mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    private void copyToArrayLocal(Item i, FieldPacker fp) {
        fp.addObj(i.mMesh);
        fp.addI32(i.mNumIndexSets);
        fp.skip(8);
        fp.addF32(i.bBoxMin);
        fp.skip(4);
        fp.addF32(i.bBoxMax);
        fp.skip(4);
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

    public synchronized void set_mMesh(int index, Mesh v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].mMesh = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize());
            mIOBuffer.addObj(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addObj(v);
            mAllocation.setFromFieldPacker(index, 0, fp);
        }

    }

    public synchronized void set_mNumIndexSets(int index, int v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].mNumIndexSets = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 4);
            mIOBuffer.addI32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addI32(v);
            mAllocation.setFromFieldPacker(index, 1, fp);
        }

    }

    public synchronized void set_bBoxMin(int index, Float3 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].bBoxMin = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 16);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(12);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 4, fp);
        }

    }

    public synchronized void set_bBoxMax(int index, Float3 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].bBoxMax = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 32);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(12);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 5, fp);
        }

    }

    public synchronized Mesh get_mMesh(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].mMesh;
    }

    public synchronized int get_mNumIndexSets(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].mNumIndexSets;
    }

    public synchronized Float3 get_bBoxMin(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].bBoxMin;
    }

    public synchronized Float3 get_bBoxMax(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].bBoxMax;
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

