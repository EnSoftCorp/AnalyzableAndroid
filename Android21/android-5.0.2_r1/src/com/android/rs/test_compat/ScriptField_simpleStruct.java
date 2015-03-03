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
 * The source Renderscript file: frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/kernel_struct.rs
 */

package com.android.rs.test_compat;

import android.support.v8.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptField_simpleStruct extends android.support.v8.renderscript.Script.FieldBase {
    static public class Item {
        public static final int sizeof = 24;

        int i1;
        byte ignored1;
        float f1;
        int i2;
        byte ignored2;
        float f2;

        Item() {
        }

    }

    private Item mItemArray[];
    private FieldPacker mIOBuffer;
    private static java.lang.ref.WeakReference<Element> mElementCache = new java.lang.ref.WeakReference<Element>(null);
    public static Element createElement(RenderScript rs) {
        Element.Builder eb = new Element.Builder(rs);
        eb.add(Element.I32(rs), "i1");
        eb.add(Element.I8(rs), "ignored1");
        eb.add(Element.U16(rs), "#rs_padding_1");
        eb.add(Element.U8(rs), "#rs_padding_2");
        eb.add(Element.F32(rs), "f1");
        eb.add(Element.I32(rs), "i2");
        eb.add(Element.I8(rs), "ignored2");
        eb.add(Element.U16(rs), "#rs_padding_3");
        eb.add(Element.U8(rs), "#rs_padding_4");
        eb.add(Element.F32(rs), "f2");
        return eb.create();
    }

    private  ScriptField_simpleStruct(RenderScript rs) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
    }

    public  ScriptField_simpleStruct(RenderScript rs, int count) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count);
    }

    public  ScriptField_simpleStruct(RenderScript rs, int count, int usages) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count, usages);
    }

    public static ScriptField_simpleStruct create1D(RenderScript rs, int dimX, int usages) {
        ScriptField_simpleStruct obj = new ScriptField_simpleStruct(rs);
        obj.mAllocation = Allocation.createSized(rs, obj.mElement, dimX, usages);
        return obj;
    }

    public static ScriptField_simpleStruct create1D(RenderScript rs, int dimX) {
        return create1D(rs, dimX, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_simpleStruct create2D(RenderScript rs, int dimX, int dimY) {
        return create2D(rs, dimX, dimY, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_simpleStruct create2D(RenderScript rs, int dimX, int dimY, int usages) {
        ScriptField_simpleStruct obj = new ScriptField_simpleStruct(rs);
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

    public static ScriptField_simpleStruct createCustom(RenderScript rs, Type.Builder tb, int usages) {
        ScriptField_simpleStruct obj = new ScriptField_simpleStruct(rs);
        Type t = tb.create();
        if (t.getElement() != obj.mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    private void copyToArrayLocal(Item i, FieldPacker fp) {
        fp.addI32(i.i1);
        fp.addI8(i.ignored1);
        fp.skip(3);
        fp.addF32(i.f1);
        fp.addI32(i.i2);
        fp.addI8(i.ignored2);
        fp.skip(3);
        fp.addF32(i.f2);
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

    public synchronized void set_i1(int index, int v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].i1 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize());
            mIOBuffer.addI32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addI32(v);
            mAllocation.setFromFieldPacker(index, 0, fp);
        }

    }

    public synchronized void set_ignored1(int index, byte v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].ignored1 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 4);
            mIOBuffer.addI8(v);
            FieldPacker fp = new FieldPacker(1);
            fp.addI8(v);
            mAllocation.setFromFieldPacker(index, 1, fp);
        }

    }

    public synchronized void set_f1(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].f1 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 8);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 4, fp);
        }

    }

    public synchronized void set_i2(int index, int v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].i2 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 12);
            mIOBuffer.addI32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addI32(v);
            mAllocation.setFromFieldPacker(index, 5, fp);
        }

    }

    public synchronized void set_ignored2(int index, byte v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].ignored2 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 16);
            mIOBuffer.addI8(v);
            FieldPacker fp = new FieldPacker(1);
            fp.addI8(v);
            mAllocation.setFromFieldPacker(index, 6, fp);
        }

    }

    public synchronized void set_f2(int index, float v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].f2 = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize() + 20);
            mIOBuffer.addF32(v);
            FieldPacker fp = new FieldPacker(4);
            fp.addF32(v);
            mAllocation.setFromFieldPacker(index, 9, fp);
        }

    }

    public synchronized int get_i1(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].i1;
    }

    public synchronized byte get_ignored1(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].ignored1;
    }

    public synchronized float get_f1(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].f1;
    }

    public synchronized int get_i2(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].i2;
    }

    public synchronized byte get_ignored2(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].ignored2;
    }

    public synchronized float get_f2(int index) {
        if (mItemArray == null) return 0;
        return mItemArray[index].f2;
    }

    public synchronized void copyAll() {
        for (int ct = 0; ct < mItemArray.length; ct++) copyToArray(mItemArray[ct], ct);
        mAllocation.setFromFieldPacker(0, mIOBuffer);
    }

}

