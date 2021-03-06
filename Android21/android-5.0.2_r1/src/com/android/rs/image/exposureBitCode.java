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
 * The source Renderscript file: frameworks/rs/java/tests/ImageProcessing/src/com/android/rs/image/exposure.rs
 */

package com.android.rs.image;

/**
 * @hide
 */
public class exposureBitCode {
    // return byte array representation of the 32-bit bitcode.
    public static byte[] getBitCode32() {
        return getBitCode32Internal();
    };

    private static byte[] getSegment32_0() {
        byte[] data = {
             -34,  -64,   23,   11,    0,    0,    0,    0,   44,    0,    0,    0,    0,    6,    0,    0,
               0,    0,    0,    0,   21,    0,    0,    0,    0,    0,    0,    0,    1,   64,    4,    0,
             109,    7,    0,    0,    2,   64,    4,    0,    3,    0,    0,    0,   66,   67,  -64,  -34,
              33,   12,    0,    0,  125,    1,    0,    0,    1,   16,    0,    0,   18,    0,    0,    0,
               7, -127,   35, -111,   65,  -56,    4,   73,    6,   16,   50,   57, -110,    1, -124,   12,
              37,    5,    8,   25,   30,    4, -117,   98, -128,   20,   69,    2,   66, -110,   11,   66,
             -92,   16,   50,   20,   56,    8,   24,   73,   10,   50,   68,   36,   72,   10, -112,   33,
              35,  -60,   82, -128,   12,   25,   33,  114,   36,    7,  -56,   72,   17,   98,  -88,  -96,
             -88,   64,  -58,  -16,    1,    0,    0,    0,   73,   24,    0,    0,   13,    0,    0,    0,
              11, -124,   -1,   -1,   -1,   -1,   31,  -64,   96, -127,  -16,   -1,   -1,   -1,   -1,    3,
              24,    6,   11, -124,   -1,   -1,   -1,   -1,   31,  -64,  104,    1,   17, -128,   32,    8,
            -126,   32,  -15,   -1,   -1,   -1,   -1,    3,   24,   10,   11, -124,   -1,   -1,   -1,   -1,
              31,  -64,    8,    0, -119,   32,    0,    0,   24,    0,    0,    0,   50,   34,   72,    9,
              32,  100, -123,    4, -109,   34,  -92, -124,    4, -109,   34,  -29, -124,  -95, -112,   20,
              18,   76, -118, -116,   11, -124,  -92,   76,   16,  112,   51,    0,    4,   70,    0, -118,
              32,    0, -115,   57,    2,  100,   24, -127,   40, -118,   96,   12,  -99,   97, -124,    1,
              24,   70,   24, -118,   34,   36,   69,  107, -114,    0,   12, -122,   17, -122,  -90,    8,
             -54,  -47,   43, -124,  115,  -83,   81,   44, -126,   75,   52,   77,    0,  -88,   22,   65,
              88,  -70,    3,    1,  115,    4,  -96,   48, -116,   64,   52,    0,   19,  -80,  112, -112,
            -121,  118,  -80, -121,   59,  104,    3,  119,  120,    7,  119,   40, -121,   54,   96, -121,
             116,  112, -121,  122,  -64, -121,   54,   56,    7,  119,  -88, -121,  114,    8,    7,  113,
              72, -121,   13,  104,   80,   14,  109,  -48,   14,  122,   80,   14,  109,    0,   15,  122,
              48,    7,  114,  -96,    7,  115,   32,    7,  109, -112,   14,  118,   64,    7,  122,   96,
               7,  116,  -48,    6,  -10,   16,    7,  114, -128,    7,  122,   96,    7,  116,  -96,    7,
             113,   32,    7,  120,  -48,    6,  -18,   48,    7,  114,  -48,    6,  -77,   96,    7,  116,
             -96,  -13,   64, -126,    4,   50,   66,   68,    4,  -40,  -95,    4,    0,   51,   12,    0,
               0,    4,  -64,   16, -123,    0,    0,   32,    0,    0,    0,    0, -122,   40,    8,    0,
               0,    2,    0,    0,    0,   48,   68,   97, -128,    0,   24,    0,    0,    0, -128,   33,
              10,    4,    4,  -64,    0,    0,    0,    0,   12,   81,   36,   32,    0,    6,    0,    0,
               0,   96, -120,   66,    1,    1,   48,    0,    0,    0,    0,   67,   20,   12,    0,    0,
               2,    0,    0,    0,  -56,    2,    1,    0,    7,    0,    0,    0,   50,   30, -104,   16,
              25,   17,   76, -112, -116,    9,   38,   71,  -58,    4,   67,  -46,   35,    0,  -44,   74,
             -96,   16,    8, -116,    0,    0,    0,    0,  121,   24,    0,    0, -125,    0,    0,    0,
              67, -116,   38,  -55, -126,   70,   89,  -96,  -36,  -61,   56,  -96,   67,   56,  -56,  -61,
              47,  -52,   67,   58,  -24,   67,   57,   12,   49, -102,   36,   27,   26,  101,   65,  -45,
              14,  -23,  -32,   14,  -65,   80,   14,  -18,   80,   15,  -19,  -16,   11,  -13, -112,   14,
              -6,   80,   14,   67, -124,  -84,   88,   32, -115,    3,   59, -124, -125,   59, -100,    3,
              24,  -40,   67,   57,  -56,  -61,   60,  -92,  -61,   59,  -72,    3,   24,  -52, -127,   27,
             -44,    1,   24,   12,   33,  -78,   35,   67,   22,   28,  -10,   80,   14,  -14,   48,   15,
             -23,  -16,   14,  -18,  -80,   32, -120, -125,   33,   68,  -90,  100,  -53, -126,   72,   29,
             -62,  -63,   30,  -62,  -31,   23,  -32,   33,   28,  -58,   97,   29,  -62,  -31,   28,  -54,
             -31,   23,  -36,   33,   28,  -38,  -95,   28,   22,   80,  -29,  -16,   14,  -19,  -32,    6,
             -31,  -32,   14,  -28,   32,   15,  -17, -112,   14,  -28,  -32,    6,  -14,   48,   15,  110,
            -112,   14,  -19,   16,   14,  -25,   80,   14,   67, -120,  -84,  -55, -100,    5, -115,   60,
             -52,  -61,   47, -104,    3,   60,   -4, -126,   60, -108,    3,   59, -124,    3,   62, -108,
               3,   57,   44,    0, -122,    8,   25,  -76,   32,  114,    3,  116,   40,    7,  118, -128,
            -121,  114, -112, -121,   95, -104, -121,  114,  -96,    7,   81, -112, -121,  116,   56,    7,
             116,  -96, -121,   33,   66,   38,   45,   32,  -28,  -31,   29,  -34, -127,   30, -122,    8,
              25,  -75,    0,   41,    7,  124, -128, -121,  119, -104, -121,  122, -112, -121,  114,   24,
              34,  100,  -42, -126,    0,   14, -122,    8,   25,  -74,   64, -104, -125,   58,   24,   98,
             100,   90,  -90,  105,  -56,   16,   35,  -37,   50,   78,   67,   22,   20,  -26,  -64,   14,
             -17,   16,   14,  -12,   48,  -60,  -56,  -70,  -52,  -45, -112,    5,  -49,   59,  -76, -125,
              59,  -92,    3,   60,  -68,    3,   61, -108, -125,   59,  -48,    3,   24, -116,    3,   58,
            -124, -125,   60,   12,   17,  -78,  111,   65,   52,   11,  -23,  -48,   14,  -16,  -64,   14,
             -27,    0,    6,  -93,  -16,    6,  -93,  -80,    6,  107,    0,    6,  -76,   32,   10,  -95,
              16,   10,   35,   34,  118,   96,    7,  123,  104,    7,   55,  104, -121,  119,   32, -121,
             122,   96, -121,  114,  112,    3,  115,   96, -121,  112,   56, -121,  121, -104,   34,    0,
             -62,    8, -123,   29,  -40,  -63,   30,  -38,  -63,   13,  -46, -127,   28,  -54,  -63,   29,
             -24,   97,   74,   64, -116,   56,  -58,    0,   30,  -28,   33,   28,  -50,  -95,   29,  -62,
              97,  -54,   96,   36,  -52, -120,  103,   12,  -28,   97,   30,  126,  -95,   28,  -16,    1,
              30,  -34,   65,   30,  -24,  -31,   23,  -52,  -95,   30,  -36,   97,   28,  -90,    4,  -49,
            -120,  107,   12,  -28,   97,   30,  126,  -95,   28,  -16,    1,   30,  -34,   65,   30,  -24,
             -31,   23,  -52,  -31,   29,  -28,  -95,   28,  -62,   97,   28,  -48,  -31,   23,  -36,   33,
              28,  -38,  -95,   28,  -90,    8,  -47,   52,   66,   26,    3,  121, -104, -121,   95,   40,
               7,  124, -128, -121,  119, -112,    7,  122,   -8,    5,  115,  120,    7,  121,   40, -121,
             112,   24,    7,  116, -104,   34,   84,   23,    0,    0,    0,    0,  121,   24,    0,    0,
              23,    0,    0,    0,   51,    8, -128,   28,  -60,  -31,   28,  102,   20,    1,   61, -120,
              67,   56, -124,  -61, -116,   66, -128,    7,  121,  120,    7,  115, -104,  113,   12,  -26,
               0,   15,  -19,   16,   14,  -12, -128,   14,   51,   12,   66,   30,  -62,  -63,   29,  -50,
             -95,   28,  102,   48,    5,   61, -120,   67,   56, -124, -125,   27,  -52,    3,   61,  -56,
              67,   61, -116,    3,   61,  -52,  120, -116,  116,  112,    7,  123,    8,    7,  121,   72,
            -121,  112,  112,    7,  122,  112,    3,  118,  120, -121,  112,   32,    7,    0,    0,    0,
             113,   32,    0,    0,   28,    0,    0,    0,    6,   96,    4,   17,   98,   28, -109,   21,
              60,   -1, -100,   11,   11,  -64,   60,   93,  117,   -1,    8, -126,   24,  -63,  -11,  -49,
              53,   46,   56,   77,   69,   68,  -45,   79,    9,    7,   16,  -35,   93,  117,   -1, -120,
              29,   68,   -2,   65,   44,   15,   17,   -3,   18,   49,  109,   17,   98,   28, -109,    9,
              32,  -60,  -11,   56,   18,   21,   17,   22, -112,   72,  -60,  -76,   69, -120,  113,   76,
             102,   80,   -3,  115,  109,   11,   78,   83,   17,  -47,  -12,   35,  -51,  116,  119,  -43,
              -3,   23,   54,  112,   -3,  115, -115,   11,   78,   83,   17,  -47,  -12,   23, -117,    3,
              76,  119,   87,  -35,   -1,    1,    0,    0,   97,   32,    0,    0,   17,    0,    0,    0,
              19,    4,   65,   44,   16,    0,    0,    0,    3,    0,    0,    0,    4,  -58,    8,   64,
              16,  -12,  -17,   48,    0,    0,    0,    0,  -43,   48,   81, -115,   67, -125,   17,  -64,
              51,    0,   24,   14,    4,    0,    0,    0,    1,    0,    0,    0,  -58,   16,   84,    0,
               1,   49,    0,    0,    2,    0,    0,    0,   91,    6,   33,  -56,    0,    0,    0,    0,
               0,    0,    0,    0,   97,   32,    0,    0,   41,    0,    0,    0,   19,    4,   65,   44,
              16,    0,    0,    0,   14,    0,    0,    0,   84,  102,    0,  106, -128,  -52,   12,  -64,
              28,   68,  -45,   52,   14,  -19,  -79,    8,  -94,   48,    6,   82,   51,    0,  -44,   70,
               0, -118,  -96,   -4,    7,  102,    0,   74,  -95,   24,  -54, -128,  -36,   88,    3,   16,
               8,   35,    0,  -76,  -25,   32,  -90, -124,  -78,   40,  -51,    0,    0,    0,    0,    0,
            -125,   12,  -52,  -93, -115,   24,   16,   69,   48,  120,    4, -116,   57, -122,   14,   12,
             -90,   65, -122,   48,  -24,  -74,   -6,  -60,   64,   70,   12, -120,   34,   48,  -58,   96,
             -60,  -64,   40, -126, -126,   12,  -90,  106,  -60, -128,   40,    2,  -94,   12,    6,   25,
             -52,   64,  -30,    6,   25,  -96,   51, -120,   18,   13,  -62, -127,    0,    0,    0,    0,
               2,    0,    0,    0,  -58,   32,   32,   13,    0,    0,    0,    0,    1,   49,    0,    0,
               2,    0,    0,    0,   91,    6,   33,  -56,    0,    0,    0,    0,    0,    0,    0,    0,
              97,   32,    0,    0,   12,    0,    0,    0,   19,    4,   65,   44,   16,    0,    0,    0,
               1,    0,    0,    0,  -44,   70,    0,    0,  -29,   13,   76,  -45, -112,   51,   70,   12,
               8,   32,    8,   30,   12,    7,    2,    0,    2,    0,    0,    0,    7,   80,   16,  -51,
              20,   97,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
        };
        return data;
    }

    private static int bitCode32Length = 1580;

    private static byte[] getBitCode32Internal() {
        byte[] bc = new byte[bitCode32Length];
        int offset = 0;
        byte[] seg;
        seg = getSegment32_0();
        System.arraycopy(seg, 0, bc, offset, seg.length);
        offset += seg.length;
        return bc;
    }

    // return byte array representation of the 64-bit bitcode.
    public static byte[] getBitCode64() {
        return getBitCode64Internal();
    };

    private static byte[] getSegment64_0() {
        byte[] data = {
             -34,  -64,   23,   11,    0,    0,    0,    0,   44,    0,    0,    0,  -80,    5,    0,    0,
               0,    0,    0,    0,   21,    0,    0,    0,    0,    0,    0,    0,    1,   64,    4,    0,
             109,    7,    0,    0,    2,   64,    4,    0,    3,    0,    0,    0,   66,   67,  -64,  -34,
              33,   12,    0,    0,  105,    1,    0,    0,    1,   16,    0,    0,   18,    0,    0,    0,
               7, -127,   35, -111,   65,  -56,    4,   73,    6,   16,   50,   57, -110,    1, -124,   12,
              37,    5,    8,   25,   30,    4, -117,   98, -128,   20,   69,    2,   66, -110,   11,   66,
             -92,   16,   50,   20,   56,    8,   24,   73,   10,   50,   68,   36,   72,   10, -112,   33,
              35,  -60,   82, -128,   12,   25,   33,  114,   36,    7,  -56,   72,   17,   98,  -88,  -96,
             -88,   64,  -58,  -16,    1,    0,    0,    0,   73,   24,    0,    0,   13,    0,    0,    0,
              11, -124,   -1,   -1,   -1,   -1,   31,  -64,   96, -127,  -16,   -1,   -1,   -1,   -1,    3,
              24,    6,   11, -124,   -1,   -1,   -1,   -1,   31,  -64,  104,    1,   17, -128,   32,    8,
            -126,   32,  -15,   -1,   -1,   -1,   -1,    3,   24,   10,   11, -124,   -1,   -1,   -1,   -1,
              31,  -64,    8,    0, -119,   32,    0,    0,   25,    0,    0,    0,   50,   34,   72,    9,
              32,  100, -123,    4, -109,   34,  -92, -124,    4, -109,   34,  -29, -124,  -95, -112,   20,
              18,   76, -118, -116,   11, -124,  -92,   76,   16,  116,   51,    0,    4,   70,    0, -118,
              32,    0, -115,   57,    2,  100,   24, -127,   40,  -26,    8,  -64,  -96,    8,  -26,   16,
              26,   70,   24, -128,   34,  -88,   67,  107,   24,   97,   40, -122,   17, -120,  -93,    8,
             -51,  -47,   27,   70,   24, -114,   66,   68,  119,   14,  -55,   34,   68,   71,  -44,    4,
            -128,  108,   17,  -60,   37,   60,   16,   48,   71,    0,   10,  -61,    8,    4,    0,    0,
              19,  -76,  112,    8,    7,  121,   24,    7,  116,  -80,    3,   58,  104,    3,  119,  120,
               7,  119,   40, -121,   54,   96, -121,  116,  112, -121,  122,  -64, -121,   54,   56,    7,
             119,  -88, -121,  114,    8,    7,  113,   72, -121,   13,   97,   80,   14,  109,  -48,   14,
             122,   80,   14,  109, -112,   14,  118,   64,    7,  122,   96,    7,  116,  -48,    6,  -23,
              16,    7,  114, -128,    7,  122,   16,    7,  114, -128,    7,  109,  -32,   14,  115,   32,
               7,  122,   96,    7,  116,  -48,    6,  -77,   16,    7,  114, -128,    7,   58,   15,   36,
              72,   32,   35,   68,   68, -128,   29,   74,    0,   40,  -61,    0,    0,   64,    0,   12,
              81,    8,    0,    0,    2,    0,    0,    0,   96, -120, -110,    0,    0,   32,    0,    0,
               0,    0,   67,   20,    6,    8, -128,    1,    0,    0,    0,   24,  -94,   64,   64,    0,
              12,    0,    0,    0,  -64,   16,  101,    2,    2,   96,    0,    0,    0,    0, -122,   40,
              21,   16,    0,    3,    0,    0,    0,   48,   68,  -55,    0,    0,   32,    0,    0,    0,
            -128,   44,   16,    0,    6,    0,    0,    0,   50,   30, -104,   16,   25,   17,   76, -112,
            -116,    9,   38,   71,  -58,    4,   67,  -38,   35,    0,    4,   70,    0,    0,    0,    0,
             121,   24,    0,    0,  110,    0,    0,    0,   67,    4,   45,   88,   32, -115,    3,   59,
            -124, -125,   59, -100,    3,   24,  -40,   67,   57,  -56,  -61,   60,  -92,  -61,   59,  -72,
               3,   24,  -52, -127,   27,  -44,    1,   24,   12,   33,  -76,   65,   35,   22,   28,  -10,
              80,   14,  -14,   48,   15,  -23,  -16,   14,  -18,  -80,   32, -120, -125,   33, -124,  102,
             104,  -57, -126,   72,   29,  -62,  -63,   30,  -62,  -31,   23,  -32,   33,   28,  -58,   97,
              29,  -62,  -31,   28,  -54,  -31,   23,  -36,   33,   28,  -38,  -95,   28,   22,   80,  -29,
             -16,   14,  -19,  -32,    6,  -31,  -32,   14,  -28,   32,   15,  -17, -112,   14,  -28,  -32,
               6,  -14,   48,   15,  110, -112,   14,  -19,   16,   14,  -25,   80,   14,   67,    8,   45,
             -47, -108,    5, -115,   60,  -52,  -61,   47, -104,    3,   60,   -4, -126,   60, -108,    3,
              59, -124,    3,   62, -108,    3,   57,   44,    0, -122,    8,   26,  -77,   32,  114,    3,
             116,   40,    7,  118, -128, -121,  114, -112, -121,   95, -104, -121,  114,  -96,    7,   81,
            -112, -121,  116,   56,    7,  116,  -96, -121,   33, -126,  -26,   44,   32,  -28,  -31,   29,
             -34, -127,   30, -122,    8,   26,  -76,    0,   41,    7,  124, -128, -121,  119, -104, -121,
             122, -112, -121,  114,   24,   34,  104,  -46, -126,    0,   14, -122,    8,   26,  -75,   64,
            -104, -125,   58,   24,   98,  104, -106,  102,  109,  -56,   16,   67,  -69,   52,  108,   67,
              22,   20,  -26,  -64,   14,  -17,   16,   14,  -12,   48,  -60,  -48,   50,   77,  -37, -112,
               5,  -49,   59,  -76, -125,   59,  -92,    3,   60,  -68,    3,   61, -108, -125,   59,  -48,
               3,   24, -116,    3,   58, -124, -125,   60,   12,   17,  -76,  109,   65,   52,   11,  -23,
             -48,   14,  -16,  -64,   14,  -27,    0,    6,  -93,  -16,    6,  -93,  -80,    6,  107,    0,
               6,  -76,   32,   10,  -95,   16,   10,   35,   20,  118,   96,    7,  123,  104,    7,   55,
              72,    7,  114,   40,    7,  119,  -96, -121,   41,    1,   48,  -30,   24,    3,  120, -112,
            -121,  112,   56, -121,  118,    8, -121,   41, -125,   80,   32,   35,  -98,   49, -112, -121,
             121,   -8, -123,  114,  -64,    7,  120,  120,    7,  121,  -96, -121,   95,   48, -121,  122,
             112, -121,  113, -104,   18,   44,   35,  -82,   49, -112, -121,  121,   -8, -123,  114,  -64,
               7,  120,  120,    7,  121,  -96, -121,   95,   48, -121,  119, -112, -121,  114,    8, -121,
             113,   64, -121,   95,  112, -121,  112,  104, -121,  114, -104,   34,   52,  -49,    8,  105,
              12,  -28,   97,   30,  126,  -95,   28,  -16,    1,   30,  -34,   65,   30,  -24,  -31,   23,
             -52,  -31,   29,  -28,  -95,   28,  -62,   97,   28,  -48,   97, -118,   16,   77,    0,    0,
             121,   24,    0,    0,   23,    0,    0,    0,   51,    8, -128,   28,  -60,  -31,   28,  102,
              20,    1,   61, -120,   67,   56, -124,  -61, -116,   66, -128,    7,  121,  120,    7,  115,
            -104,  113,   12,  -26,    0,   15,  -19,   16,   14,  -12, -128,   14,   51,   12,   66,   30,
             -62,  -63,   29,  -50,  -95,   28,  102,   48,    5,   61, -120,   67,   56, -124, -125,   27,
             -52,    3,   61,  -56,   67,   61, -116,    3,   61,  -52,  120, -116,  116,  112,    7,  123,
               8,    7,  121,   72, -121,  112,  112,    7,  122,  112,    3,  118,  120, -121,  112,   32,
               7,    0,    0,    0,  113,   32,    0,    0,   28,    0,    0,    0,    6,   96,    4,   17,
              98,   28, -109,   21,   60,   -1, -100,   11,   11,  -64,   60,   93,  117,   -1,    8, -126,
              24,  -63,  -11,  -49,   53,   46,   56,   77,   69,   68,  -45,   79,    9,    7,   16,  -35,
              93,  117,   -1, -120,   29,   68,   -2,   65,   44,   15,   17,   -3,   18,   49,  109,   17,
              98,   28, -109,    9,   32,  -60,  -11,   56,   18,   21,   17,   22, -112,   72,  -60,  -76,
              69, -120,  113,   76,  102,   80,   -3,  115,  109,   11,   78,   83,   17,  -47,  -12,   35,
             -51,  116,  119,  -43,   -3,   23,   54,  112,   -3,  115, -115,   11,   78,   83,   17,  -47,
             -12,   23, -117,    3,   76,  119,   87,  -35,   -1,    1,    0,    0,   97,   32,    0,    0,
              17,    0,    0,    0,   19,    4,   65,   44,   16,    0,    0,    0,    3,    0,    0,    0,
               4,  -58,    8,   64,   16,  -12,  -17,   48,    0,    0,    0,    0,  -75,   40,   81,   11,
              67, -125,   17,   64,   51,    0,   24,   14,    4,    0,    0,    0,    1,    0,    0,    0,
             -90,   16,   84,    0,    1,   49,    0,    0,    2,    0,    0,    0,   91,    6,   33,  -88,
               0,    0,    0,    0,    0,    0,    0,    0,   97,   32,    0,    0,   44,    0,    0,    0,
              19,    4,   65,   44,   16,    0,    0,    0,   13,    0,    0,    0,   84,  102,    0,  106,
            -128,  -52,   28,  -60,  -78,   44,   12,  -99,   17, -128,   18,   40, -126,   25, -128,  -14,
              31,   40, -124,   82,   40, -122,   50,  -96,   56,    2,   64,  109,    6, -128,  -36,   28,
            -124,  -13,   64,  -47,   88,    4,   81,   24,    3,  -59,   25,    0,   82,   51,    0,    0,
              35,    6,   68,   17,   12,   10,    1,   99, -114, -127,  -13, -100,   65, -122, -113,  -69,
             -86,    3,    3,   25,  100,    8,    3,   46,   59,   49,  112,   59,   98,   64,   20, -127,
              49,    6, -125,   12,  100,  -80,  101,   35,    6,   70,   17,   20,  101,  -32,   72, -125,
              12,  102,  -80,  101,   35,    6,   68,   17,   16,  103,   48,  -56, -128,    6,   88,   54,
             -56,  -48,  -92, -127, -106,  106,   16,   14,    4,    0,    0,    0,    3,    0,    0,    0,
             -90, -112,   32, -115,   47,   56,   68,   36,   16,    0,    0,    0,    1,   49,    0,    0,
               2,    0,    0,    0,   91, -122,   32,  -88,    0,    0,    0,    0,    0,    0,    0,    0,
              97,   32,    0,    0,   12,    0,    0,    0,   19,    4,   65,   44,   16,    0,    0,    0,
               1,    0,    0,    0,  116,   70,    0,    0,  -29,   13,   10,  -78,   16,   51,   70,   12,
               8,   32,    8,   26,   12,    7,    2,    0,    2,    0,    0,    0,    7,   80,   16,  -51,
              20,   97,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
        };
        return data;
    }

    private static int bitCode64Length = 1500;

    private static byte[] getBitCode64Internal() {
        byte[] bc = new byte[bitCode64Length];
        int offset = 0;
        byte[] seg;
        seg = getSegment64_0();
        System.arraycopy(seg, 0, bc, offset, seg.length);
        offset += seg.length;
        return bc;
    }

}

