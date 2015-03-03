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
 * The source Renderscript file: frameworks/rs/java/tests/RsTest/src/com/android/rs/test/element.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.elementBitCode;

/**
 * @hide
 */
public class ScriptField_ComplexStruct extends android.renderscript.Script.FieldBase {
    static public class Item {

        float subElem0;
        float subElem1;
        int subElem2;
        float[] arrayElem0;
        int[] arrayElem1;
        byte subElem3;
        float subElem4;
        Float2 subElem5;
        Float3 subElem6;
        Float4 subElem_7;

        Item() {
            arrayElem0 = new float[2];
            arrayElem1 = new int[5];
            subElem5 = new Float2();
            subElem6 = new Float3();
            subElem_7 = new Float4();
        }

    }

    private Item mItemArray[];
    private FieldPacker mIOBuffer;
    private static java.lang.ref.WeakReference<Element> mElementCache = new java.lang.ref.WeakReference<Element>(null);
    public static Element createElement(RenderScript rs) {
        Element.Builder eb = new Element.Builder(rs);
        eb.add(Element.F32(rs), "subElem0");
        eb.add(Element.F32(rs), "subElem1");
        eb.add(Element.I32(rs), "subElem2");
        eb.add(Element.F32(rs), "arrayElem0", 2);
        eb.add(Element.I32(rs), "arrayElem1", 5);
        eb.add(Element.I8(rs), "subElem3");
        eb.add(Element.U16(rs), "#rs_padding_1");
        eb.add(Element.U8(rs), "#rs_padding_2");
        eb.add(Element.F32(rs), "subElem4");
        eb.add(Element.F32_2(rs), "subElem5");
        eb.add(Element.U32(rs), "#rs_padding_3");
        eb.add(Element.U32(rs), "#rs_padding_4");
        eb.add(Element.F32_3(rs), "subElem6");
        eb.add(Element.F32_4(rs), "subElem_7");
        return eb.create();
    }

    private  ScriptField_ComplexStruct(RenderScript rs) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
    }

    public  ScriptField_ComplexStruct(RenderScript rs, int count) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count);
    }

    public  ScriptField_ComplexStruct(RenderScript rs, int count, int usages) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count, usages);
    }

    public static ScriptField_ComplexStruct create1D(RenderScript rs, int dimX, int usages) {
        ScriptField_ComplexStruct obj = new ScriptField_ComplexStruct(rs);
        obj.mAllocation = Allocation.createSized(rs, obj.mElement, dimX, usages);
        return obj;
    }

    public static ScriptField_ComplexStruct create1D(RenderScript rs, int dimX) {
        return create1D(rs, dimX, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_ComplexStruct create2D(RenderScript rs, int dimX, int dimY) {
        return create2D(rs, dimX, dimY, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_ComplexStruct create2D(RenderScript rs, int dimX, int dimY, int usages) {
        ScriptField_ComplexStruct obj = new ScriptField_ComplexStruct(rs);
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

    public static ScriptField_ComplexStruct createCustom(RenderScript rs, Type.Builder tb, int usages) {
        ScriptField_ComplexStruct obj = new ScriptField_ComplexStruct(rs);
        Type t = tb.create();
        if (t.getElement() != obj.mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    private void copyToArrayLocal(Item i, FieldPacker fp) {
        fp.addF32(i.subElem0);
        fp.addF32(i.subElem1);
        fp.addI32(i.subElem2);
        for (int ct2 = 0; ct2 < 2; ct2++) {
            fp.addF32(i.arrayElem0[ct2]);
        }

        for (int ct2 = 0; ct2 < 5; ct2++) {
            fp.addI32(i.arrayElem1[ct2]);
        }

        fp.addI8(i.subElem3);
        fp.skip(3);
        fp.addF32(i.subElem4);
        fp.addF32(i.subElem5);
        fp.skip(8);
        fp.addF32(i.subElem6);
        fp.skip(4);
        fp.addF32(i.subElem_7);
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

    public synchronized void set_subElem0(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].subElem0 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize());
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 0, fp);
        }

    }

    public synchronized void set_subElem1(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].subElem1 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 4);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 1, fp);
        }

    }

    public synchronized void set_subElem2(int index, int v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].subElem2 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 8);
            mIOBuffer.addI32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addI32(v);
            mAllocation.setFromFieldPacker(index, 2, fp);
        }

    }

    public synchronized void set_arrayElem0(int index, float[] v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].arrayElem0 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 12);
            for (int ct1 = 0; ct1 < 2; ct1++) {
                mIOBuffer.addF32(v[ct1]);
            }

            FieldPacker fp = new FieldPacker(8);
            for (int ct1 = 0; ct1 < 2; ct1++) {
                fp.addF32(v[ct1]);
            }

            mAllocation.setFromFieldPacker(index, 3, fp);
        }

    }

    public synchronized void set_arrayElem1(int index, int[] v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].arrayElem1 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 20);
            for (int ct1 = 0; ct1 < 5; ct1++) {
                mIOBuffer.addI32(v[ct1]);
            }

            FieldPacker fp = new FieldPacker(20);
            for (int ct1 = 0; ct1 < 5; ct1++) {
                fp.addI32(v[ct1]);
            }

            mAllocation.setFromFieldPacker(index, 4, fp);
        }

    }

    public synchronized void set_subElem3(int index, byte v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].subElem3 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 40);
            mIOBuffer.addI8(v);
            FieldPacker fp = new FieldPacker(1);
            fp.addI8(v);
            mAllocation.setFromFieldPacker(index, 5, fp);
        }

    }

    public synchronized void set_subElem4(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].subElem4 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 44);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 8, fp);
        }

    }

    public synchronized void set_subElem5(int index, Float2 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].subElem5 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 48);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(8);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 9, fp);
        }

    }

    public synchronized void set_subElem6(int index, Float3 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].subElem6 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 64);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(12);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 12, fp);
        }

    }

    public synchronized void set_subElem_7(int index, Float4 v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].subElem_7 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 80);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(16);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 13, fp);
        }

    }

    public synchronized float get_subElem0(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].subElem0;
    }

    public synchronized float get_subElem1(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].subElem1;
    }

    public synchronized int get_subElem2(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].subElem2;
    }

    public synchronized float[] get_arrayElem0(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].arrayElem0;
    }

    public synchronized int[] get_arrayElem1(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].arrayElem1;
    }

    public synchronized byte get_subElem3(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].subElem3;
    }

    public synchronized float get_subElem4(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].subElem4;
    }

    public synchronized Float2 get_subElem5(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].subElem5;
    }

    public synchronized Float3 get_subElem6(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].subElem6;
    }

    public synchronized Float4 get_subElem_7(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].subElem_7;
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

