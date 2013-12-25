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

public class GoFieldDeclImpl extends GoCompositeElementImpl implements GoFieldDecl {

  public GoFieldDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) ((GoVisitor)visitor).visitFieldDecl(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GoAnonymousField getAnonymousField() {
    return findChildByClass(GoAnonymousField.class);
  }

  @Override
  @Nullable
  public GoGoType getGoType() {
    return findChildByClass(GoGoType.class);
  }

  @Override
  @Nullable
  public GoIdentifierList getIdentifierList() {
    return findChildByClass(GoIdentifierList.class);
  }

  @Override
  @Nullable
  public GoTag getTag() {
    return findChildByClass(GoTag.class);
  }

}
