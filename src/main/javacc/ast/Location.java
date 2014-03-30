package ast;

import parser.Token;
import java.util.*;

public class Location {
    protected String sourceName;
    protected Token token;

    public Location(String sourceName, Token token) {
        this.sourceName = sourceName;
        this.token = token;
    }

    public String sourceName() {
        return sourceName;
    }

    public int lineno() {
        return token.beginLine;
    }

    public int column() {
        return token.beginColumn;
    }

    public String toString() {
        return sourceName + ":" + token.beginLine;
    }
}
