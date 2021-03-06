// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.plugins.groovy.lang.parser;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.groovy.lang.psi.impl.statements.blocks.GrBlockImpl;
import org.jetbrains.plugins.groovy.lang.psi.impl.GrLambdaBodyBlockImpl;

public class GrLambdaBlockFormBodyElementType extends GrCodeBlockElementType {

  public GrLambdaBlockFormBodyElementType(String debugName) {
    super(debugName);
  }

  @NotNull
  @Override
  public GrBlockImpl createNode(CharSequence text) {
    return new GrLambdaBodyBlockImpl(this, text);
  }
}
