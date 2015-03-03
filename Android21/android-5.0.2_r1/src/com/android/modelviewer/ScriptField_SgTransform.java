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
 * The source Renderscript file: frameworks/base/tests/RenderScriptTests/ModelViewer/src/com/android/modelviewer/scenegraph.rs
 */

package com.android.modelviewer;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptField_SgTransform extends android.renderscript.Script.FieldBase {
    static public class Item {
        public static final int sizeof = 456;

        Matrix4f globalMat;
        Matrix4f localMat;
        Float4[] transforms;
        int[] transformTypes;
        int isDirty;
        Allocation children;

        Item() {
            globalMat = new Matrix4f();
            localMat = new Matrix4f();
            transforms = new Float4[16];
            for (int $ct = 0; $ct < 16; $ct++) {
                transforms[$ct] = new Float4();
            }

            transformTypes = new int[16];
        }

    }

    private Item mItemArray[];
    private FieldPacker mIOBuffer;
    private static java.lang.ref.WeakReference<Element> mElementCache = new java.lang.ref.WeakReference<Element>(null);
    public static Element createElement(RenderScript rs) {
        Element.Builder eb = new Element.Builder(rs);
        eb.add(Element.MATRIX_4X4(rs), "globalMat");
        eb.add(Element.MATRIX_4X4(rs), "localMat");
        eb.add(Element.F32_4(rs), "transforms", 16);
        eb.add(Element.I32(rs), "transformTypes", 16);
        eb.add(Element.I32(rs), "isDirty");
        eb.add(Element.ALLOCATION(rs), "children");
        return eb.create();
    }

    private  ScriptField_SgTransform(RenderScript rs) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
    }

    public  ScriptField_SgTransform(RenderScript rs, int count) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count);
    }

    public  ScriptField_SgTransform(RenderScript rs, int count, int usages) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count, usages);
    }

    public static ScriptField_SgTransform create1D(RenderScript rs, int dimX, int usages) {
        ScriptField_SgTransform obj = new ScriptField_SgTransform(rs);
        obj.mAllocation = Allocation.createSized(rs, obj.mElement, dimX, usages);
        return obj;
    }

    public static ScriptField_SgTransform create1D(RenderScript rs, int dimX) {
        return create1D(rs, dimX, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_SgTransform create2D(RenderScript rs, int dimX, int dimY) {
        return create2D(rs, dimX, dimY, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_SgTransform create2D(RenderScript rs, int dimX, int dimY, int usages) {
        ScriptField_SgTransform obj = new ScriptField_SgTransform(rs);
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

    public static ScriptField_SgTransform createCustom(RenderScript rs, Type.Builder tb, int usages) {
        ScriptField_SgTransform obj = new ScriptField_SgTransform(rs);
        Type t = tb.create();
        if (t.getElement() != obj.mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    private void copyToArrayLocal(Item i, FieldPacker fp) {
        fp.addMatrix(i.globalMat);
        fp.addMatrix(i.localMat);
        for (int ct2 = 0; ct2 < 16; ct2++) {
            fp.addF32(i.transforms[ct2]);
        }

        for (int ct2 = 0; ct2 < 16; ct2++) {
            fp.addI32(i.transformTypes[ct2]);
        }

        fp.addI32(i.isDirty);
        fp.addObj(i.children);
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

    public synchronized void set_globalMat(int index, Matrix4f v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].globalMat = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize());
            mIOBuffer.addMatrix(v);
            FieldPacker fp = new FieldPacker(64);
            fp.addMatrix(v);
            mAllocation.setFromFieldPacker(index, 0, fp);
        }

    }

    public synchronized void set_localMat(int index, Matrix4f v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].localMat = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 64);
            mIOBuffer.addMatrix(v);
            FieldPacker fp = new FieldPacker(64);
            fp.addMatrix(v);
            mAllocation.setFromFieldPacker(index, 1, fp);
        }

    }

    public synchronized void set_transforms(int index, Float4[] v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].transforms = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 128);
            for (int ct1 = 0; ct1 < 16; ct1++) {
                mIOBuffer.addF32(v[ct1]);
            }

            FieldPacker fp = new FieldPacker(256);
            for (int ct1 = 0; ct1 < 16; ct1++) {
                fp.addF32(v[ct1]);
            }

            mAllocation.setFromFieldPacker(index, 2, fp);
        }

    }

    public synchronized void set_transformTypes(int index, int[] v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].transformTypes = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 384);
            for (int ct1 = 0; ct1 < 16; ct1++) {
                mIOBuffer.addI32(v[ct1]);
            }

            FieldPacker fp = new FieldPacker(64);
            for (int ct1 = 0; ct1 < 16; ct1++) {
                fp.addI32(v[ct1]);
            }

            mAllocation.setFromFieldPacker(index, 3, fp);
        }

    }

    public synchronized void set_isDirty(int index, int v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].isDirty = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 448);
            mIOBuffer.addI32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addI32(v);
            mAllocation.setFromFieldPacker(index, 4, fp);
        }

    }

    public synchronized void set_children(int index, Allocation v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].children = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 452);
            mIOBuffer.addObj(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addObj(v);
            mAllocation.setFromFieldPacker(index, 5, fp);
        }

    }

    public synchronized Matrix4f get_globalMat(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].globalMat;
    }

    public synchronized Matrix4f get_localMat(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].localMat;
    }

    public synchronized Float4[] get_transforms(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].transforms;
    }

    public synchronized int[] get_transformTypes(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].transformTypes;
    }

    public synchronized int get_isDirty(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].isDirty;
    }

    public synchronized Allocation get_children(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].children;
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

