package ast;

abstract public class AbstractAssignNode extends ExprNode {
  ExprNode lhs;
  ExprNode rhs;

  public AbstractAssignNode(ExprNode lhs, ExprNode rhs) {
    super();
    this.lhs = lhs;
    this.rhs = rhs;
  }

  public ExprNode lhs() {
    return lhs;
  }

  public ExprNode rhs() {
    return rhs;
  }

  public void setRHS(ExprNode expr) {
    this.rhs = expr;
  }

  public Location location() {
    return lhs.location();
  }

  protected void _dump(Dumper d) {
    d.printMember("lhs", lhs);
    d.printMember("rhs", rhs);
  }
}
