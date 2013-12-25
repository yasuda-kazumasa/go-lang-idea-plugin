// This is a generated file. Not intended for manual editing.
package com.goide.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.goide.GoTypes.*;
import com.goide.psi.*;

public class GoMapTypeImpl extends GoCompositeElementImpl implements GoMapType {

  public GoMapTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) ((GoVisitor)visitor).visitMapType(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GoElementType getElementType() {
    return findNotNullChildByClass(GoElementType.class);
  }

  @Override
  @NotNull
  public GoKeyType getKeyType() {
    return findNotNullChildByClass(GoKeyType.class);
  }

  @Override
  @NotNull
  public PsiElement getMap() {
    return findNotNullChildByType(GO_MAP);
  }

}
