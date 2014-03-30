package ast;

public class BinaryOpNode extends ExprNode {
  protected String op;
  protected ExprNode left;
  protected ExprNode right;

  public BinaryOpNode(ExprNode left, String op, ExprNode right) {
    super();
    this.op = op;
    this.left = left;
    this.right = right;
  }

  public String op() {
    return op;
  }

  public ExprNode left() {
    return left;
  }

  public ExprNode right() {
    return right;
  }

  public Location location() {
    return left.location();
  }

  public void _dump(Dumper d) {
    d.printMember("op", op);
    d.printMember("left", left);
    d.printMember("right", right);
  }
}
