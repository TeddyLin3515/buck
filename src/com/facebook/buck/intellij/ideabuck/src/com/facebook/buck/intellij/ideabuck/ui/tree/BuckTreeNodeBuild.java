/*
 * Copyright 2015-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.intellij.ideabuck.ui.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class BuckTreeNodeBuild implements TreeNode {

    private final String mTarget;
    private final List<TreeNode> mChilds;

    public BuckTreeNodeBuild(String target) {
        mTarget = target;
        mChilds = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode node) {
        mChilds.add(node);
    }

    public void removeChild(TreeNode node) {
        if (mChilds.contains(node)) {
            mChilds.remove(node);
        }
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        return mChilds.get(childIndex);
    }

    @Override
    public int getChildCount() {
        return mChilds.size();
    }

    @Override
    public TreeNode getParent() {
        return null;
    }

    @Override
    public int getIndex(TreeNode node) {
        return 0;
    }

    @Override
    public boolean getAllowsChildren() {
        return true;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Enumeration children() {
        return Collections.enumeration(mChilds);
    }

    public String getTarget() {
        return mTarget;
    }
}
