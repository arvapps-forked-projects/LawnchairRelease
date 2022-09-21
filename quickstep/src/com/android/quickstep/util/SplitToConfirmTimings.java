/*
 * Copyright (C) 2022 The Android Open Source Project
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

package com.android.quickstep.util;

import static com.android.launcher3.anim.Interpolators.LINEAR;

import android.view.animation.Interpolator;

/**
 * Timings for the OverviewSplitSelect > confirmed animation.
 */
public class SplitToConfirmTimings implements SplitAnimationTimings {
    public int getPlaceholderFadeInStart() { return 0; }
    public int getPlaceholderFadeInEnd() { return 133; }
    public int getPlaceholderIconFadeInStart() { return 167; }
    public int getPlaceholderIconFadeInEnd() { return 250; }
    public int getStagedRectSlideStart() { return 0; }
    public int getStagedRectSlideEnd() { return 383; }
    public int getInstructionsFadeStart() { return 0; }
    public int getInstructionsFadeEnd() { return 67; }

    public int getDuration() { return CONFIRM_DURATION; }
    public Interpolator getStagedRectXInterpolator() { return LINEAR; }
    public Interpolator getStagedRectYInterpolator() { return LINEAR; }
    public Interpolator getStagedRectScaleXInterpolator() { return LINEAR; }
    public Interpolator getStagedRectScaleYInterpolator() { return LINEAR; }

    public float getInstructionsFadeStartOffset() {
        return (float) getInstructionsFadeStart() / getDuration();
    }
    public float getInstructionsFadeEndOffset() {
        return (float) getInstructionsFadeEnd() / getDuration();
    }
}
