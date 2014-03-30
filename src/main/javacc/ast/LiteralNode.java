package ast;

abstract public class LiteralNode extends ExprNode {
    protected Location location;

    public LiteralNode(Location loc) {
        super();
        this.location = loc;
    }

    public Location location() {
        return location;
    }

    public boolean isConstant() {
        return true;
    }
}
