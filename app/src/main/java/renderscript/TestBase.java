/*
 * Copyright (C) 2012 The Android Open Source Project
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

package renderscript;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class TestBase {
    protected final String TAG = "Img";

    protected RenderScript mRS;
    protected Allocation mInPixelsAllocation;
    protected Allocation mOutPixelsAllocation;

    // Override to use UI elements
    public void onBar1Changed(int progress) {
    }
    public void onBar2Changed(int progress) {
    }
    public void onBar3Changed(int progress) {
    }
    public void onBar4Changed(int progress) {
    }
    public void onBar5Changed(int progress) {
    }

    // Override to use UI elements
    // Unused bars will be hidden.
    public boolean onBar1Setup(SeekBar b, TextView t) {
        b.setVisibility(View.INVISIBLE);
        t.setVisibility(View.INVISIBLE);
        return false;
    }
    public boolean onBar2Setup(SeekBar b, TextView t) {
        b.setVisibility(View.INVISIBLE);
        t.setVisibility(View.INVISIBLE);
        return false;
    }
    public boolean onBar3Setup(SeekBar b, TextView t) {
        b.setVisibility(View.INVISIBLE);
        t.setVisibility(View.INVISIBLE);
        return false;
    }
    public boolean onBar4Setup(SeekBar b, TextView t) {
        b.setVisibility(View.INVISIBLE);
        t.setVisibility(View.INVISIBLE);
        return false;
    }
    public boolean onBar5Setup(SeekBar b, TextView t) {
        b.setVisibility(View.INVISIBLE);
        t.setVisibility(View.INVISIBLE);
        return false;
    }


    // Must override
    public void createTest(android.content.res.Resources res) {
        Log.e("img", "implement createTest");
    }

    // Must override
    public void runTest() {
    }

    public void finish() {
        mRS.finish();
    }

    public void updateBitmap(Bitmap b) {
        mOutPixelsAllocation.copyTo(b);
    }

    // Override to configure specific benchmark config.
    public void setupBenchmark() {
    }

    // Override to reset after benchmark.
    public void exitBenchmark() {
    }
}
