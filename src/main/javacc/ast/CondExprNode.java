package ast;

public class CondExprNode extends ExprNode {
  protected ExprNode cond;
  protected ExprNode thenExpr;
  protected ExprNode elseExpr;

  public CondExprNode(ExprNode cond, ExprNode t, ExprNode e) {
    super();
    this.cond = cond;
    this.thenExpr = t;
    this.elseExpr = e;
  }

  public ExprNode cond() {
    return cond;
  }

  public ExprNode thenExpr() {
    return thenExpr;
  }

  public void setThenExpr(ExprNode expr) {
    this.thenExpr = expr;
  }

  public ExprNode elseExpr() {
    return elseExpr;
  }

  public void setElseExpr(ExprNode expr) {
    this.elseExpr = expr;
  }

  public Location location() {
    return cond.location();
  }

  protected void _dump(Dumper d) {
    d.printMember("cond", cond);
    d.printMember("thenExpr", thenExpr);
    d.printMember("elseExpr", elseExpr);
  }

}
