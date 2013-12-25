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

public class GoUnaryExprImpl extends GoCompositeElementImpl implements GoUnaryExpr {

  public GoUnaryExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) ((GoVisitor)visitor).visitUnaryExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GoPrimaryExpr getPrimaryExpr() {
    return findChildByClass(GoPrimaryExpr.class);
  }

  @Override
  @Nullable
  public GoUnaryExpr getUnaryExpr() {
    return findChildByClass(GoUnaryExpr.class);
  }

  @Override
  @Nullable
  public GoUnaryOp getUnaryOp() {
    return findChildByClass(GoUnaryOp.class);
  }

}
