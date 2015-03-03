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
 * The source Renderscript file: frameworks/rs/java/tests/ImageProcessing/src/com/android/rs/image/convolve3x3.rs
 */

package com.android.rs.image;

/**
 * @hide
 */
public class convolve3x3BitCode {
    // return byte array representation of the 32-bit bitcode.
    public static byte[] getBitCode32() {
        return getBitCode32Internal();
    };

    private static byte[] getSegment32_0() {
        byte[] data = {
             -34,  -64,   23,   11,    0,    0,    0,    0,   44,    0,    0,    0,   28,    8,    0,    0,
               0,    0,    0,    0,   21,    0,    0,    0,    0,    0,    0,    0,    1,   64,    4,    0,
             109,    7,    0,    0,    2,   64,    4,    0,    3,    0,    0,    0,   66,   67,  -64,  -34,
              33,   12,    0,    0,    4,    2,    0,    0,    1,   16,    0,    0,   18,    0,    0,    0,
               7, -127,   35, -111,   65,  -56,    4,   73,    6,   16,   50,   57, -110,    1, -124,   12,
              37,    5,    8,   25,   30,    4, -117,   98, -128,   24,   69,    2,   66, -110,   11,   66,
             -60,   16,   50,   20,   56,    8,   24,   73,   10,   50,   68,   36,   72,   10, -112,   33,
              35,  -60,   82, -128,   12,   25,   33,  114,   36,    7,  -56, -120,   17,   98,  -88,  -96,
             -88,   64,  -58,  -16,    1,    0,    0,    0,   73,   24,    0,    0,   11,    0,    0,    0,
              11, -124,   -1,   -1,   -1,   -1,   31,  -64,   96, -127,  -16,   -1,   -1,   -1,   -1,    3,
              24,   45,   16,   -2,   -1,   -1,   -1,  127,    0,   22,    8,   -1,   -1,   -1,   -1,   63,
            -128,  -47,    2,  -31,   -1,   -1,   -1,   -1,    7,   48,    0,    0, -119,   32,    0,    0,
              32,    0,    0,    0,   50,   34, -120,    9,   32,  100, -123,    4,   19,   35,  -92, -124,
               4,   19,   35,  -29, -124,  -95, -112,   20,   18,   76, -116, -116,   11, -124,  -60,   76,
              16, -124,  -63,   28,    1,   24,   16,  112, -106,   52,   69, -108,   48,   -7, -111,  -12,
               3,  -53,  -30,    8,  -64, -124,   56, -115,  111,  -93,   32,   32,   97,    6,   32,   19,
               8,   42,  -26,    8, -112,   97,    4,  -30,   40,    3,    2,    0, -108, -108,    1,    0,
               0,   90, -122,   17,    8,  -94,    8,   13,   66,   78,    6,    0, -123,   64,   32,    0,
             -96,  -88,   16,   77,   67,   16,   52,   21,    1,  105,  -88,   26,    1,   40,  -63,   69,
              88,   17,  -82, -127,  -76, -127, -128,   57,    2,   80,   32, -120, -120,   97,    4,    2,
               0,    0,    0,    0,   19,  -80,  112, -112, -121,  118,  -80, -121,   59,  104,    3,  119,
             120,    7,  119,   40, -121,   54,   96, -121,  116,  112, -121,  122,  -64, -121,   54,   56,
               7,  119,  -88, -121,  114,    8,    7,  113,   72, -121,   13,  104,   80,   14,  109,  -48,
              14,  122,   80,   14,  109,    0,   15,  122,   48,    7,  114,  -96,    7,  115,   32,    7,
             109, -112,   14,  118,   64,    7,  122,   96,    7,  116,  -48,    6,  -10,   16,    7,  114,
            -128,    7,  122,   96,    7,  116,  -96,    7,  113,   32,    7,  120,  -48,    6,  -18,   48,
               7,  114,  -48,    6,  -77,   96,    7,  116,  -96,  -13,   64, -122,    4,   50,   66,   68,
               4,   96,   56,   56,  -61,  -63,   57,   19,   78, -109,  -16,   33, -118,    2,    0,   64,
               0,    0,    0,    0,   12,   81,   24,   32,    0,    4,    0,    0,    0,   96, -120,  -62,
               0,    1,   32,    0,    0,    0,    0,   67, -108,    7,    8,    0,    1,    0,    0,    0,
              24,  -94,   72,   64,    0,   12,    0,    0,    0,  -64,   16, -123,    2,    2,   64,    0,
               0,    0,    0, -122,   40,   22,   16,    0,    2,    0,    0,    0,   48,   68,  -55,    0,
               0,    8,    0,    0,    0, -128,   33,  -54,    6,    4,  -64,    0,    0,    0,    0,  100,
            -127,    0,    0,    0,    8,    0,    0,    0,   50,   30, -104,   20,   25,   17,   76, -112,
            -116,    9,   38,   71,  -58,    4,   67,    2,   70,    0,   74,  -96,   16,  -88,   27,    1,
             -96,   98,    4, -128, -124,   17,    0,    0,  121,   24,    0,    0, -100,    0,    0,    0,
              67,   12,  -64,  -31,    2,  -32,   89,  -96,  -36,  -61,   56,  -96,   67,   56,  -56,  -61,
              47,  -52,   67,   58,  -24,   67,   57,   12,   49,    0, -121,   27, -128,  103,   65,  -45,
              14,  -23,  -32,   14,  -65,   80,   14,  -18,   80,   15,  -19,  -16,   11,  -13, -112,   14,
              -6,   80,   14,   67,    4,  -82,   88,   32, -115,    3,   59, -124, -125,   59, -100,    3,
              24,  -40,   67,   57,  -56,  -61,   60,  -92,  -61,   59,  -72,    3,   24,  -52, -127,   27,
             -44,    1,   24,   12,   33,  -72, -125,   67,   22,   28,  -10,   80,   14,  -14,   48,   15,
             -23,  -16,   14,  -18,  -80,   32, -120, -125,   33,    4,  -89,  112,  -53, -126,   72,   29,
             -62,  -63,   30,  -62,  -31,   23,  -32,   33,   28,  -58,   97,   29,  -62,  -31,   28,  -54,
             -31,   23,  -36,   33,   28,  -38,  -95,   28,   22,   80,  -29,  -16,   14,  -19,  -32,    6,
             -31,  -32,   14,  -28,   32,   15,  -17, -112,   14,  -28,  -32,    6,  -14,   48,   15,  110,
            -112,   14,  -19,   16,   14,  -25,   80,   14,   67,    8,  -82,  -31, -100,    5, -115,   60,
             -52,  -61,   47, -104,    3,   60,   -4, -126,   60, -108,    3,   59, -124,    3,   62, -108,
               3,   57,   44,    0, -122,   16,   28,  -60,   69,   11, -116,  115,  -72, -123,  116,   32,
               7,  122,   64, -121,    5,   65,   29,   12,   33,  -72, -119, -117,   22,   28,  -25, -128,
              10,  -27, -112,   14,  -25, -128,   14,  -12,   48, -124,  -32,   42,  -50,   90,   48, -100,
              67,   42,  -72,  -61,    2,   65,   14,  -32,   96,    8,  -63,   97,   92,  -74,  -32,   56,
            -121,   81,  120, -121,  114,   48,    7,  115, -104, -121,    5,   15,   31, -116,  -62,   59,
             -72,  -61,   60,  -48,   67,   56,  -72,    3,   61, -124, -126,   60,  -56,   67,   56,  -28,
            -125,   31,   12,   17,  -72,  109,   65,   32,    7,   67,    4,  -82,   91,   64,  -56,  -61,
              59,  -68,    3,   61,   12,   17,  -72,  111, -127,   80,    7,  120,   48,  -60,  -32,  -62,
            -128,   11, -125,   14,   26,   98,  112,   98,  -64, -115,   65,    7,   45,   24,  -46,  -63,
              29,  -24,   97, -120,  -63, -111,    1,   87,    6,   29,  -76,  -32,  121, -121,  118,  112,
            -121,  116, -128, -121,  119,  -96, -121,  114,  112,    7,  122,    0, -125,  113,   64, -121,
             112, -112, -121,   33,    2,  103,    6,   11,  -94,   89,   72, -121,  118, -128,    7,  118,
              40,    7,   48,   24, -123,   55,   24, -123,   53,   88,    3,   48,  -96,    5,   81,    8,
            -123,   80,   24,   98,  112,  104,  -64,  -95,   65,    7,   13,   49,  -72,   52,  -32,  -58,
             -96, -125,   22,   20,  -26,  -64,   14,  -17,   16,   14,  -12,   48,   34,   98,    7,  118,
             -80, -121,  118,  112, -125,  118,  120,    7,  114,  -88,    7,  118,   40,    7,   55,   48,
               7,  118,    8, -121,  115, -104, -121,   41,    2,   32, -116,   80,  -40, -127,   29,  -20,
             -95,   29,  -36,   32,   29,  -56,  -95,   28,  -36, -127,   30,  -90,    4,  -60, -120,   99,
              12,  -32,   65,   30,  -62,  -31,   28,  -38,   33,   28,  -90,   12,   70,  -62, -116,  112,
             -58,   64,   30,  -26,  -31,   23,  -54,    1,   31,  -32,  -31,   29,  -28, -127,   30,  126,
             -63,   30,  -62,   65,   30,  -90,   16, -113,   68,   93,   35,  -96,   49, -112, -121,  121,
              -8, -123,  119,   16,    7,  117,   40, -121,  113,  -96, -121,   95, -104,    7,  118,  120,
               7,  122, -104, -121,   41, -127,   54,  -30,   26,    3,  121, -104, -121,   95,   40,    7,
             124, -128, -121,  119, -112,    7,  122,   -8,    5,  115,  120,    7,  121,   40, -121,  112,
              24,    7,  116,   -8,    5,  119,    8, -121,  118,   40, -121,   41,    1,   55,   66,   26,
               3,  121, -104, -121,   95,   40,    7,  124, -128, -121,  119, -112,    7,  122,   -8,    5,
             115,  120,    7,  121,   40, -121,  112,   24,    7,  116, -104,   18,  120,    0,    0,    0,
             121,   24,    0,    0,   23,    0,    0,    0,   51,    8, -128,   28,  -60,  -31,   28,  102,
              20,    1,   61, -120,   67,   56, -124,  -61, -116,   66, -128,    7,  121,  120,    7,  115,
            -104,  113,   12,  -26,    0,   15,  -19,   16,   14,  -12, -128,   14,   51,   12,   66,   30,
             -62,  -63,   29,  -50,  -95,   28,  102,   48,    5,   61, -120,   67,   56, -124, -125,   27,
             -52,    3,   61,  -56,   67,   61, -116,    3,   61,  -52,  120, -116,  116,  112,    7,  123,
               8,    7,  121,   72, -121,  112,  112,    7,  122,  112,    3,  118,  120, -121,  112,   32,
               7,    0,    0,    0,  113,   32,    0,    0,   43,    0,    0,    0,   22,  112,   24,   33,
            -127,   24,  -57,  100,   12,   97,  -16,  -49,  -11,   29,   73,  -36,   66,    0,   17,   26,
              36, -124,   48,  -91,  -11,   29,   73,   63,  -80,   44, -114,    0,   76, -120,  -45,   88,
               1,  -14,  -49,   55, -125,   52,    8,   98,    4,   68,  -28,   56, -109,   25,   32,   -1,
             124,   51,  -64, -123,   32,    6,   96,   24,   48,   50,   76, -121,   33,  -88,  -63,   63,
             -37,  117,   36, -127,  -60,  -28,   45,    4,   67,   52, -109,   54,   -3, -108,  112,    0,
              17,   94,  -33, -111,  -12,    3,  -53,  -30,    8,  -64, -124,   56,   77, -110, -104,  -62,
             -11,  -49,   53,   46,   56,   77,   69,   68,  -45,   79,    9,    7,   16,  -31,   93, -123,
              -1, -123,   37,   60,   -1, -100,   11,   11,  -64,   60,   93, -123,   -1,   69,   81,  -40,
               2,  -30,   71, -110,   63,   76,   78,  100,    3, -121,  -63,   57,   68,   81,   72,  118,
             112,   -3,  115, -115,   11,   78,   83,   17,  -47,  -12,   23, -117,    3,   76,  120,   87,
             -31,   -1,   97,    2, -125,   33,   54,    0,   97,   32,    0,    0, -104,    0,    0,    0,
              19,    4,   65,   44,   16,    0,    0,    0,   24,    0,    0,    0,    4,  -44,   64,   17,
            -108,   65,   41,   20,   67,   57,   20,    4, -127,   35,    0,   68, -116,   17, -128,   32,
             -24,  -33,   97,   64,  -51,   12,    0,  121,  -74, -125,    0,  125,   67,   25,  -58,    0,
              52,   64,   51, -108,   97,   12,   64,    3,   56,   67,   25,  -58,    0,   52, -128,   53,
            -108,   97,   12,   64,    3,   92,   67,   25,  -58,    0,   52,  -64,   51, -108,   97,   12,
              64,    3,   96,   67,   25,  -58,    0,   52,   64,   54, -108,   97,   12,   64,    3,  104,
              67,   25,  -58,    0,   52,  -64,   70,  -60,    8,    0,    0,    0,   54,   57,   32,   32,
              96,  -40,   26,   84,   32,   24,   49,   40, -120,  -96,   80,    3,   54,  -80,  -87,    2,
             -63, -120,   65,   65,    4, -122,   27,   52,   70,   57,   32,  -96,   96,   88,   28,   84,
              32,   24,   49,   40, -120,  -96, -128,    3,   57,   48,  -86,    2,  -63, -120,   65,   65,
               4,    6,   29,   52,  -12, -115,   17,    3,  -93,    8,   16,   59,  104, -125,   57,   24,
              49,   32, -120,  -32,  -72,    3,    2, -125,   49,  -57,  -32,  -27,   65,   51,  -56,  -96,
               7,   30,   87,  120,  -80,    7,   66,  -33,   24,   49,   48, -118,    0,  -23, -125,  105,
              14,   70,   12,    8,   34,   56,   -4, -128,  -62,   96,  -52,   49,  120,  -96,  -48,   12,
              50, -124, -126,  -57,  -43,   31, -120, -126,   20,   31, -116,    2,  -48,   55,   70,   12,
            -116,   34,   64,   74,  -31,   13,  -26,   96,  -60, -128,   32, -126,  -61,   20,   72,   12,
             -58,   28, -125, -121,   10,  -51,   32,   67,   42,  120,   92,  -99, -126,   42,   72, -111,
             -62,   42,    0,  125,   99,  -60,  -64,   40,    2,  -92,   21,  -38, -128,   26,   49,   32,
            -120,  -32,  112,    5,   26, -125,   49,  -57,  -32,  -63,   66,   51,  -56,   16,   11,   30,
              87,  -81,   32,   11,   82,  -84,   48,   11,   64,  -33,   24,   49,   48, -118,    0,  -87,
            -123, -119,   26,   49,   32, -120,  -32,  -80,    5,   34, -125,   49,  -57,  -32,  -31,   66,
              51,  -56, -112,   11,   30,   87,  -73,  -96,   11,   82,  -76,  -80,   11,   64,  -33,   24,
              49,   48, -118,    0,  -23, -123,   55,  -96,   70,   12,    8,   34,   56,  124, -127,  -54,
              96,  -52,   49,  120,  -32,  -48,   12,   50, -124, -125,  -57,  -43,   47, -120, -125,   20,
              47, -116,    3,  -48,   55,   70,   12, -116,   34,   64,  -54,  -95,   13,  -22,   96,  -60,
            -128,   32, -126,  -61,   28,  -56,   12,  -58,   28, -125, -121,   14,  -51,   32,   67,   58,
             120,   92,  -99, -125,   58,   72, -111,  -61,   58,    0,  125,   99,  -60,  -64,   40,    2,
             -92,   29,  -90,   58,   24,   49,   32, -120,  -32,  112,    7,   58, -125,   49,  -57,  -32,
             -63,   67,   51,  -56,   16,   15,   30,   87,  -17,   32,   15,   82,  -20,   48,   15,   64,
             -33,   24,   49,   48, -118,    0,  -87, -121,   55,  -88, -125,   17,    3, -126,    8,   14,
             123,   32,   52,   24,  115,   12,   30,   62,   52, -125,   12,   -7,  -32,  113,  117,   15,
              -6,   32,   69,   15,   -5,    0,   35,    6,    6,   17,   36,   -4, -112,    6,  -35, -120,
               1,   65,    4,   74,   63,  -92,   63, -124,    3,    1,    0,    0,    2,    0,    0,    0,
              54,   17,   92,   70,   17,   96,    0,    0,    1,   49,    0,    0,   15,    0,    0,    0,
              91, -122,   32,    0, -125,   45,  -61,   17, -128,  -63, -106,  -31,    9,  -50,   96,  -53,
              96,    5,  103,  -80,  101,  -16, -126,   51,  -40,   50, -104,   65,  112,    6,   91,    6,
              55,    8,  -50,   96,  -53,   96,    7,  -63,   25,  108,   25,   -4,   32,   56, -125,   45,
            -125,   41,    4,  103,  -80,  101,  112, -123,  -32,   12,    0,    0,    0,    0,    0,    0,
              97,   32,    0,    0,    3,    0,    0,    0,   19,    4,  -63, -120,    1,   81,    4, -116,
            -128,    0,    0,    0,    0,    0,    0,    0,
        };
        return data;
    }

    private static int bitCode32Length = 2120;

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
             -34,  -64,   23,   11,    0,    0,    0,    0,   44,    0,    0,    0,   96,    9,    0,    0,
               0,    0,    0,    0,   21,    0,    0,    0,    0,    0,    0,    0,    1,   64,    4,    0,
             109,    7,    0,    0,    2,   64,    4,    0,    3,    0,    0,    0,   66,   67,  -64,  -34,
              33,   12,    0,    0,   85,    2,    0,    0,    1,   16,    0,    0,   18,    0,    0,    0,
               7, -127,   35, -111,   65,  -56,    4,   73,    6,   16,   50,   57, -110,    1, -124,   12,
              37,    5,    8,   25,   30,    4, -117,   98, -128,   24,   69,    2,   66, -110,   11,   66,
             -60,   16,   50,   20,   56,    8,   24,   73,   10,   50,   68,   36,   72,   10, -112,   33,
              35,  -60,   82, -128,   12,   25,   33,  114,   36,    7,  -56, -120,   17,   98,  -88,  -96,
             -88,   64,  -58,  -16,    1,    0,    0,    0,   73,   24,    0,    0,   16,    0,    0,    0,
              11, -124,   -1,   -1,   -1,   -1,   31,  -64,   96, -127,  -16,   -1,   -1,   -1,   -1,    3,
              24,   45,   16,   -2,   -1,   -1,   -1,  127,    0,   22,   24,    1,    8, -126,   32,    8,
              18,    2,    8, -126,   32,    8,   18,   -1,   -1,   -1,   -1,   63, -128,  -63,    2,  -31,
              -1,   -1,   -1,   -1,    7,   48,   90,   32,   -4,   -1,   -1,   -1,   -1,    0,    6,    0,
            -119,   32,    0,    0,   35,    0,    0,    0,   50,   34, -120,    9,   32,  100, -123,    4,
              19,   35,  -92, -124,    4,   19,   35,  -29, -124,  -95, -112,   20,   18,   76, -116, -116,
              11, -124,  -60,   76,   16, -112,  -63,   28,    1,   24,   16,   48,   71,    0,   10,   36,
             -36,   37,   77,   17,   37,   76,  126,   36,   -3,  -64,  -78,   56,    2,   48,   33,   78,
             -29,  -37,   53,   34, -122,   97,   24, -120, -104,    1,  -56,    4, -125, -114,   57,    2,
             100,   24, -127,   72,  -54,  -96,    0,    0,   45,  101,    0,    0, -128, -102,   97,    4,
             -62,   40,  -62,    3,   16,   84,    8,  -91,    0,    0, -110,   70,    0,   40, -103,   35,
               8, -118,   65,   85, -107,    0,   88,  116,   21,  -30,  121,   12, -125,  -78,   34,   40,
              15,  109,   37,  -96,  -88,   43,    2,   85,  -48,   55,   16,   64,  -58,   48,    2,    1,
               0,    0,    0,    0,   19,  -76,  112,    8,    7,  121,   24,    7,  116,  -80,    3,   58,
             104,    3,  119,  120,    7,  119,   40, -121,   54,   96, -121,  116,  112, -121,  122,  -64,
            -121,   54,   56,    7,  119,  -88, -121,  114,    8,    7,  113,   72, -121,   13,   97,   80,
              14,  109,  -48,   14,  122,   80,   14,  109, -112,   14,  118,   64,    7,  122,   96,    7,
             116,  -48,    6,  -23,   16,    7,  114, -128,    7,  122,   16,    7,  114, -128,    7,  109,
             -32,   14,  115,   32,    7,  122,   96,    7,  116,  -48,    6,  -77,   16,    7,  114, -128,
               7,   58,   15, -124,   72,   32,   35,   68,   70,    0, -122,    7,  -57,  -16,  -32,   88,
              40,   36,   81, -123,   27,  -94,   48,    0,    0,    4,    0,    0,    0,  -64,   16,  -59,
               1,    2,   64,    0,    0,    0,    0, -122,   40,   14,   16,    0,    2,    0,    0,    0,
              48,   68, -119, -128,    0,   16,    0,    0,    0, -128,   33,  -54,    4,    4,  -64,    0,
               0,    0,    0,   12,   81,   48,   32,    0,    8,    0,    0,    0,   96, -120,  -94,    1,
               1,   32,    0,    0,    0,    0,   67,   20,   14,    8,    0,    1,    0,    0,    0,   24,
             -94,  120,    0,    0,    4,    0,    0,    0,  -64,   16,    5,   12, -128,    0,   24,    0,
               0,    0, -128,   44,   16,    0,    0,    0,    9,    0,    0,    0,   50,   30, -104,   20,
              25,   17,   76, -112, -116,    9,   38,   71,  -58,    4,   67,    2,   70,    0,   72,   24,
               1,   40, -120,    2,   41,   24,   34,   70,    0,  -24,   24,    1,    0,    0,    0,    0,
             121,   24,    0,    0, -101,    0,    0,    0,   67, -124,   48,    8,   22,   72,  -29,  -64,
              14,  -31,  -32,   14,  -25,    0,    6,  -10,   80,   14,  -14,   48,   15,  -23,  -16,   14,
             -18,    0,    6,  115,  -32,    6,  117,    0,    6,   67, -120,   48,   24,  -62, -128,   88,
             112,  -40,   67,   57,  -56,  -61,   60,  -92,  -61,   59,  -72,  -61, -126,   32,   14, -122,
              16,   97,   96, -124,  -63,  -79,   32,   82, -121,  112,  -80, -121,  112,   -8,    5,  120,
               8, -121,  113,   88, -121,  112,   56, -121,  114,   -8,    5,  119,    8, -121,  118,   40,
            -121,    5,  -44,   56,  -68,   67,   59,  -72,   65,   56,  -72,    3,   57,  -56,  -61,   59,
             -92,    3,   57,  -72, -127,   60,  -52, -125,   27,  -92,   67,   59, -124,  -61,   57, -108,
             -61,   16,   34,   12, -110,   48,   80,   22,   52,  -14,   48,   15,  -65,   96,   14,  -16,
             -16,   11,  -14,   80,   14,  -20,   16,   14,   -8,   80,   14,  -28,  -80,    0,   24,   66,
            -124,    1,   19,    6,  -51,    2,  -29,   28,  110,   33,   29,  -56, -127,   30,  -48,   97,
              65,   80,    7,   67, -120,   48,  120,  -62,  -96,   89,  112, -100,    3,   42, -108,   67,
              58, -100,    3,   58,  -48,  -61,   16,   34,   12,  -94,   48, -112,   22,   12,  -25, -112,
              10,  -18,  -80,   64, -112,    3,   56,   24,   66, -124,    1,   21,    6,  -43, -126,  -29,
              28,   70,  -31,   29,  -54,  -63,   28,  -52,   97,   30,   22,   60,  124,   48,   10,  -17,
             -32,   14,  -13,   64,   15,  -31,  -32,   14,  -12,   16,   10,  -14,   32,   15,  -31, -112,
              15,  126,   48,   68,    8, -125,  107,   65,   32,    7,   67, -124,   48,  -56,   22,   16,
             -14,  -16,   14,  -17,   64,   15,   67, -124,   48,  -40,   22,    8,  117, -128,    7,   67,
            -116,   48,  -24,  -62,  -96,   19,  -98,   33,   70,   24,  120,   97,  -16,    9,  -49, -126,
              33,   29,  -36, -127,   30, -122,   24,   97,    0,    6,   97,   16,    6,  -62,  -77,  -32,
             121, -121,  118,  112, -121,  116, -128, -121,  119,  -96, -121,  114,  112,    7,  122,    0,
            -125,  113,   64, -121,  112, -112, -121,   33,   66,   24, -120,  -63, -126,  104,   22,  -46,
             -95,   29,  -32, -127,   29,  -54,    1,   12,   70,  -31,   13,   70,   97,   13,  -42,    0,
              12,  104,   65,   20,   66,   33,   20, -122,   96,  -62,   35,   64,   97,   64,    6,    2,
              36,   64,   97,   64,    6,   66,   36,   64,   97,   64,    6, -126,   36,   64,   97,   64,
               6,   67, -116,   48,   40, -125,   48,   40,    3,  -31,   25,   98, -124, -127,   25, -124,
             -63,   39,   60,   11, -106,  112,  112, -121,  124,    0,    3,  120,  120, -121,  116,  112,
               7,  122,   40,    7,  121,   24,   98, -124,    1,   26, -124,    1,   26,    8,  -49,   16,
              35,   12,  -46,   32,   12,   62,  -31,   89,   80, -104,    3,   59,  -68,   67,   56,  -48,
             -61,    8, -123,   29,  -40,  -63,   30,  -38,  -63,   13,  -46, -127,   28,  -54,  -63,   29,
             -24,   97,   74,    0, -116,   56,  -58,    0,   30,  -28,   33,   28,  -50,  -95,   29,  -62,
              97,  -54,   32,   20,  -56,    8,  103,   12,  -28,   97,   30,  126,  -95,   28,  -16,    1,
              30,  -34,   65,   30,  -24,  -31,   23,  -20,   33,   28,  -28,   97,   10,  -79,   56,  -48,
              52,    2,   26,    3,  121, -104, -121,   95,  120,    7,  113,   80, -121,  114,   24,    7,
             122,   -8, -123,  121,   96, -121,  119,  -96, -121,  121, -104,   18,   88,   35,  -82,   49,
            -112, -121,  121,   -8, -123,  114,  -64,    7,  120,  120,    7,  121,  -96, -121,   95,   48,
            -121,  119, -112, -121,  114,    8, -121,  113,   64, -121,   95,  112, -121,  112,  104, -121,
             114, -104,   18,   96,   35,  -92,   49, -112, -121,  121,   -8, -123,  114,  -64,    7,  120,
             120,    7,  121,  -96, -121,   95,   48, -121,  119, -112, -121,  114,    8, -121,  113,   64,
            -121,   41, -127,    6,  121,   24,    0,    0,   23,    0,    0,    0,   51,    8, -128,   28,
             -60,  -31,   28,  102,   20,    1,   61, -120,   67,   56, -124,  -61, -116,   66, -128,    7,
             121,  120,    7,  115, -104,  113,   12,  -26,    0,   15,  -19,   16,   14,  -12, -128,   14,
              51,   12,   66,   30,  -62,  -63,   29,  -50,  -95,   28,  102,   48,    5,   61, -120,   67,
              56, -124, -125,   27,  -52,    3,   61,  -56,   67,   61, -116,    3,   61,  -52,  120, -116,
             116,  112,    7,  123,    8,    7,  121,   72, -121,  112,  112,    7,  122,  112,    3,  118,
             120, -121,  112,   32,    7,    0,    0,    0,  113,   32,    0,    0,   49,    0,    0,    0,
              22,  112,   24,   33, -127,   24,  -57,  100,   13,   97,  -16,  -49,  -11,   29,   73,  -36,
              66,    0,   17,   26,   36, -124,   48,  -91,  -11,   29,   73,   63,  -80,   44, -114,    0,
              76, -120,  -45,   88,    1,  -14,  -49,   55, -125,   52,    8,   98,    4,   68,  -28,   56,
            -109,   25,   32,   -1,  124,   51,  -64, -123,   32,    6,   96,   24,   48,   50,   76, -121,
              33,  -88,  -63,   63,  -37,  117,   36, -127,  -60,  -28,   45,    4,   67,   52, -109,   54,
              -3, -108,  112,    0,   17,   94,  -33, -111,  -12,    3,  -53,  -30,    8,  -64, -124,   56,
              77, -110,   88,   66,  -74,   44,   21,  -29,   51,    4,   35,   60, -104,   -1,  -48,    8,
             -17,   63,   52,  -62,   -5, -120, -114,  -37,  -62,  -11,  -49,   53,   46,   56,   77,   69,
              68,  -45,   79,    9,    7,   16,  -31,   93, -123,   -1, -123,   41,   60,   -1, -100,   11,
              11,  -64,   60,   93, -123,   -1,   69,   81,   24,    3,  -30,   71, -110,   63,   76,   78,
             100,    3, -121,  -63,   57,   68,   81,   72,  118,  112,   -3,  115, -115,   11,   78,   83,
              17,  -47,  -12,   23, -117,    3,   76,  120,   87,  -31,   -1,   97,    2, -125,   33,   54,
               0,    0,    0,    0,   97,   32,    0,    0,  -38,    0,    0,    0,   19,    4,   65,   44,
              16,    0,    0,    0,   27,    0,    0,    0,    4,   20,   68,   13, -108,    0,    9,   37,
              80,   64,   69,   80,    6, -123,   80,   10,  -59,   80,   14,   52, -114,    0, -112,   53,
               2,   64,  -49,   12,    0,   85,  -74, -123,    0,   25,   99,    4,   32,    8,   -6,  119,
              24, -112,   56, -108, -127,   12,  -62,   35,   60,   67,   25,  -56,   32,   60, -126,   54,
            -108, -127,   12,  -62,   35,  112,   67,   25,  -56,   32,   60,   66,   55, -108, -127,   12,
             -62,   35,  120,   67,   25,  -56,   32,   60,  -62,   55, -108, -127,   12,  -62,   35, -128,
             -63,   80,    6,   50,    8, -113,   16,    6,   67,   25,  -56,   32,   60,    2,   68,  -58,
               8,    0,    0,    0,   51,   17, -123,  -96,   17,   51,   17, -123,  -96,   17,   51,   17,
            -123,  -96,   17,   51,   17, -123,  -96,   17,   51,   17, -123,  -96,   17,   51,   17, -123,
             -96,   17,   51,   17, -123,  -96,   17,   51,   17, -123,  -96,   17,   51,   17, -123,  -96,
              17,   86,  101,   32,   32,   96,  -40,   30,   96,   32,   24,   49,   40, -118,  -96,  -48,
               3,   62,  -80,   10,    3,  -63, -120,   65,   81,    4, -122,   31,   56,  102,  101,   32,
             -96,   96,   88,   40,   96,   32,   24,   49,   40, -118,  -96,    0,    5,   81,   48,   11,
               3,  -63, -120,   65,   81,    4,    6,   41,   56,   23,    7,  -43, -114,   24,   32,    0,
            -112, -104,   66,   25,  108,  -41,   24, -116,   24,   24,    6, -128,  -60,   65,   31, -116,
             -62,  -99,    2,  -80,   35,    6,   68,    1,   28,  -88,   64,  103,   48,  -26,   24,  -56,
              64,   21, -100,   65, -122,   85,   32,    3,   49,  -88,   84,   96,    5,   57,   57,  -88,
             118,  -60,    0,    1, -128,  -60,   21,  -54,   96,  -69,  -58,   96,  -60,  -64,   48,    0,
              68,   14,  -86,   81,  -72,   87,    0,  118,  -60, -128,   40, -128,    3,   22,    8,   13,
             -58,   28,    3,   25,  -56, -126,   51,  -56,   48,   11,  100,   32,    6,   21,   11,  -76,
              32,  -43,   10,  -75,    0,   55,    7,  -43, -114,   24,   32,    0, -112,  -36,   66,   25,
             108,  -41,   24, -116,   24,   24,    6, -128,  -52,  -63,   31, -116,  -62,  -31,    2,  -80,
              35,    6,   68,    1,   28,  -71,   64,  105,   48,  -26,   24,  -56,   96,   23, -100,   65,
               6,   94,   32,    3,   49,   40,   93,  -24,    5,   41,   91,  -16,    5,   56,   58,  -88,
             118,  -60,    0,    1, -128,    4,   28,  -54,   96,  -69,  -58,   96,  -60,  -64,   48,    0,
            -124,   14,   -6,  -64,  -70,  112,    0,  118,  -60, -128,   40, -128,   67,   28,   72,   13,
             -58,   28,    3,   25, -112, -125,   51,  -56,   80,   14,  100,   32,    6,   53,   14,  -26,
              32,  -11,   11,  -25,    0,   87,    7,  -43, -114,   24,   32,    0, -112,  -92,   67,   25,
             108,  -41,   24, -116,   24,   24,    6, -128,  -44,   65,  101,  -99,   58,    0,   59,   98,
              64,   20,  -64,  -79,   14,  -76,    6,   99, -114, -127,   12,  -38,  -63,   25,  100,  112,
               7,   50,   16, -125,   98, -121,  119, -112,   66,    7,  120, -128,  -77, -125,  106,   71,
              12,   16,    0,   72,  -28,  -95,   12,  -74,  107,   12,   70,   12,   12,    3,   64,  -20,
             -32,   15,  -84, -101,    7,   96,   71,   12, -120,    2,   56,  -24, -127,  -40,   96,  -52,
              49, -112, -127,   61,   56, -125,   12,   -9,   64,    6,   98,   80,  -11, -128,   15,   82,
             -15, -112,   15,  112,  119,   80,  -19, -120,    1,    2,    0,  -55,   62, -108,  -63,  118,
            -115,  -63, -120, -127,   97,    0,  -56,   29,  -12,   65,   41,   28,   63,    0,   59,   98,
              64,   20,  -64,  -47,   15,  -44,    6,   99, -114, -127,   12,   -2,  -63,   25,  100,    0,
               9,   50,   16, -125,  -14, -121, -112, -112,  -46,    7, -111, -128,  -61, -125,  106,   71,
              12,   16,    0,   72,   72,  -94,   12,  -74,  107,   12,   70,   12,   12,    3,   64,  -16,
             -96,   42, -123,   43,    9,   96,   71,   12, -120,    2,   56,   76, -126,  -36,   96,  -52,
              49, -112,    1,   74,   56, -125,   12,   41,   65,    6,   98,   80,   39,  -95,   18,   82,
              35,  -79,   18,  112,  121,   80,  -19, -120,    1,    2,    0,   73,   75, -108,  -63,  118,
            -115,  -63, -120, -127,   97,    0,   72,   30,   -4,   65,   41, -100,   75,    0,   59,   98,
              64,   20,  -64,  -15,   18,  -12,    6,   99, -114, -127,   12,   98,  -62,   25,  100, -112,
               9,   50,   16, -125, -126, -119, -103, -112,   98,    9, -102, -128,   17,    3,  -93,    0,
            -108, -102, -128,    3,   51,   24,   49,   32,   10,   96,  -79, -119,  -68, -119,  112,   32,
               2,    0,    0,    0,   86,   17,   92,  102,   17,   96,    0,    0,    1,   49,    0,    0,
              27,    0,    0,    0,   91,    6,   37,  -32,  -74,   12,   80,  -64,  109,   25,  -84,   98,
              12,  -74,   12,   90,  112,    6,   91, -122,  -81,   24, -125,   45,  -61,   24,    4,  103,
             -80,  101,   72, -125,   98,   12,  -74,   12,  109,   16, -100,  -63, -106,   97,   14, -118,
              49,  -40,   50,  -36,   65,  112,    6,   91, -122,   62,   40,  -58,   96,  -53,   16,   10,
             -63,   25,  108,   25,   78,  -95,   24, -125,   45,  -61,   42,    4,  103,  -80,  101, -120,
            -123,   98,   12,  -74,   12,  -75,   16, -100,  -63, -106,   97,   23, -118,   49,  -40,   50,
              -4,   66,  112,    6,   91, -122,  114,   40,  -58,   96,  -53, -112,   14,  -63,   25,    0,
               0,    0,    0,    0,   97,   32,    0,    0,    3,    0,    0,    0,   19,    4,  -63, -120,
               1,   97,    4, -115, -128,    0,    0,    0,    0,    0,    0,    0,
        };
        return data;
    }

    private static int bitCode64Length = 2444;

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
