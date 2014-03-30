package ast;

public class OpAssignNode extends AbstractAssignNode {
    protected String op;

    public OpAssignNode(ExprNode lhs, String op, ExprNode rhs) {
        super(lhs, rhs);
        this.op = op;
    }

    public String op() {
        return op;
    }
}
