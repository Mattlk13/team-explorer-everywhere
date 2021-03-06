// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.client.common.ui.teamexplorer.sections;

import java.util.EventListener;

public interface TeamExplorerSectionRegenerateListener extends EventListener {
    public void onSectionRegenerate(final String sectionID);
}
