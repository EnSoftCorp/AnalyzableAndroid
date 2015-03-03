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
public class ScriptField_VertexShaderConstants_s extends android.renderscript.Script.FieldBase {
    static public class Item {
        public static final int sizeof = 192;

        Matrix4f model;
        Matrix4f proj;
        Float4 light0_Posision;
        float light0_Diffuse;
        float light0_Specular;
        float light0_CosinePower;
        Float4 light1_Posision;
        float light1_Diffuse;
        float light1_Specular;
        float light1_CosinePower;

        Item() {
            model = new Matrix4f();
            proj = new Matrix4f();
            light0_Posision = new Float4();
            light1_Posision = new Float4();
        }

    }

    private Item mItemArray[];
    private FieldPacker mIOBuffer;
    private static java.lang.ref.WeakReference<Element> mElementCache = new java.lang.ref.WeakReference<Element>(null);
    public static Element createElement(RenderScript rs) {
        Element.Builder eb = new Element.Builder(rs);
        eb.add(Element.MATRIX_4X4(rs), "model");
        eb.add(Element.MATRIX_4X4(rs), "proj");
        eb.add(Element.F32_4(rs), "light0_Posision");
        eb.add(Element.F32(rs), "light0_Diffuse");
        eb.add(Element.F32(rs), "light0_Specular");
        eb.add(Element.F32(rs), "light0_CosinePower");
        eb.add(Element.U32(rs), "#rs_padding_1");
        eb.add(Element.F32_4(rs), "light1_Posision");
        eb.add(Element.F32(rs), "light1_Diffuse");
        eb.add(Element.F32(rs), "light1_Specular");
        eb.add(Element.F32(rs), "light1_CosinePower");
        eb.add(Element.U32(rs), "#rs_padding_2");
        return eb.create();
    }

    private  ScriptField_VertexShaderConstants_s(RenderScript rs) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
    }

    public  ScriptField_VertexShaderConstants_s(RenderScript rs, int count) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count);
    }

    public  ScriptField_VertexShaderConstants_s(RenderScript rs, int count, int usages) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count, usages);
    }

    public static ScriptField_VertexShaderConstants_s create1D(RenderScript rs, int dimX, int usages) {
        ScriptField_VertexShaderConstants_s obj = new ScriptField_VertexShaderConstants_s(rs);
        obj.mAllocation = Allocation.createSized(rs, obj.mElement, dimX, usages);
        return obj;
    }

    public static ScriptField_VertexShaderConstants_s create1D(RenderScript rs, int dimX) {
        return create1D(rs, dimX, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_VertexShaderConstants_s create2D(RenderScript rs, int dimX, int dimY) {
        return create2D(rs, dimX, dimY, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_VertexShaderConstants_s create2D(RenderScript rs, int dimX, int dimY, int usages) {
        ScriptField_VertexShaderConstants_s obj = new ScriptField_VertexShaderConstants_s(rs);
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

    public static ScriptField_VertexShaderConstants_s createCustom(RenderScript rs, Type.Builder tb, int usages) {
        ScriptField_VertexShaderConstants_s obj = new ScriptField_VertexShaderConstants_s(rs);
        Type t = tb.create();
        if (t.getElement() != obj.mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    private void copyToArrayLocal(Item i, FieldPacker fp) {
        fp.addMatrix(i.model);
        fp.addMatrix(i.proj);
        fp.addF32(i.light0_Posision);
        fp.addF32(i.light0_Diffuse);
        fp.addF32(i.light0_Specular);
        fp.addF32(i.light0_CosinePower);
        fp.skip(4);
        fp.addF32(i.light1_Posision);
        fp.addF32(i.light1_Diffuse);
        fp.addF32(i.light1_Specular);
        fp.addF32(i.light1_CosinePower);
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

    public synchronized void set_model(int index, Matrix4f v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].model = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize());
            mIOBuffer.addMatrix(v);
            FieldPacker fp = new FieldPacker(64);
            fp.addMatrix(v);
            mAllocation.setFromFieldPacker(index, 0, fp);
        }

    }

    public synchronized void set_proj(int index, Matrix4f v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].proj = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 64);
            mIOBuffer.addMatrix(v);
            FieldPacker fp = new FieldPacker(64);
            fp.addMatrix(v);
            mAllocation.setFromFieldPacker(index, 1, fp);
        }

    }

    public synchronized void set_light0_Posision(int index, Float4 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light0_Posision = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 128);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(16);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 2, fp);
        }

    }

    public synchronized void set_light0_Diffuse(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light0_Diffuse = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 144);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 3, fp);
        }

    }

    public synchronized void set_light0_Specular(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light0_Specular = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 148);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 4, fp);
        }

    }

    public synchronized void set_light0_CosinePower(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light0_CosinePower = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 152);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 5, fp);
        }

    }

    public synchronized void set_light1_Posision(int index, Float4 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light1_Posision = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 160);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(16);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 7, fp);
        }

    }

    public synchronized void set_light1_Diffuse(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light1_Diffuse = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 176);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 8, fp);
        }

    }

    public synchronized void set_light1_Specular(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light1_Specular = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 180);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 9, fp);
        }

    }

    public synchronized void set_light1_CosinePower(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].light1_CosinePower = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 184);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 10, fp);
        }

    }

    public synchronized Matrix4f get_model(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].model;
    }

    public synchronized Matrix4f get_proj(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].proj;
    }

    public synchronized Float4 get_light0_Posision(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].light0_Posision;
    }

    public synchronized float get_light0_Diffuse(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].light0_Diffuse;
    }

    public synchronized float get_light0_Specular(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].light0_Specular;
    }

    public synchronized float get_light0_CosinePower(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].light0_CosinePower;
    }

    public synchronized Float4 get_light1_Posision(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].light1_Posision;
    }

    public synchronized float get_light1_Diffuse(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].light1_Diffuse;
    }

    public synchronized float get_light1_Specular(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].light1_Specular;
    }

    public synchronized float get_light1_CosinePower(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].light1_CosinePower;
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

