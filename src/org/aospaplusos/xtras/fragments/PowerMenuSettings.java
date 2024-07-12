/*
 *Copyright (C) 2022 ReloadedOS
 *Copyright (C) 2024 AospaPlus
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

package com.android.settings.support;

import com.android.internal.logging.nano.MetricsProto;

import com.android.settings.R;
import com.android.settings.dashboard.DashboardFragment;
import com.android.settings.search.BaseSearchIndexProvider;
import com.android.settingslib.search.SearchIndexable;

@SearchIndexable(forTarget = SearchIndexable.ALL & ~SearchIndexable.ARC)
public class PowerMenuSettings extends DashboardFragment {

    @Override
    protected int getPreferenceScreenResId() {
        return R.xml.aospaplus_xtras_power;
    }

    @Override
    protected String getLogTag() {
        return "PowerMenuSettings";
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.AOSPAPLUS;
    }

    public static final BaseSearchIndexProvider SEARCH_INDEX_DATA_PROVIDER =
            new BaseSearchIndexProvider(R.xml.aospaplus_xtras_power);
}
