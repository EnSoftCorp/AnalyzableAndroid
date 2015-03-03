/*
 * Copyright (C) 2014 The Android Open Source Project
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

package com.android.inputmethod.keyboard.layout.tests;

import android.test.suitebuilder.annotation.SmallTest;

import com.android.inputmethod.keyboard.layout.Dvorak;
import com.android.inputmethod.keyboard.layout.Dvorak.DvorakCustomizer;
import com.android.inputmethod.keyboard.layout.LayoutBase;
import com.android.inputmethod.keyboard.layout.expected.ExpectedKeyboardBuilder;

import java.util.Locale;

/**
 * en_US: English (United States)/dvorak
 */
@SmallTest
public class TestsEnglishDvorak extends LayoutTestsBase {
    private static final Locale LOCALE = new Locale("en", "US");
    private static final LayoutBase LAYOUT = new Dvorak(new EnglishDvorakCustomizer(LOCALE));

    @Override
    LayoutBase getLayout() { return LAYOUT; }

    public static class EnglishDvorakCustomizer extends DvorakCustomizer {
        private final EnglishCustomizer mEnglishCustomizer;

        EnglishDvorakCustomizer(final Locale locale) {
            super(locale);
            mEnglishCustomizer = new EnglishCustomizer(locale);
        }

        @Override
        public ExpectedKeyboardBuilder setAccentedLetters(final ExpectedKeyboardBuilder builder) {
            return mEnglishCustomizer.setAccentedLetters(builder);
        }
    }
}
