package ast;

abstract public class ExprNode extends Node {
  public ExprNode() {
    super();
  }

  public boolean isConstant() { return false; }
  public boolean isParameter() { return false; }

  public boolean isLvalue() { return false; }
  public boolean isAssignable() { return false; }
  public boolean isLoadable() { return false; }
}
