package ast;

import java.util.*;
import java.io.*;

public class Dumper {
    protected int nIndent;
    protected PrintStream stream;

    public Dumper(PrintStream s) {
        this.stream = s;
        this.nIndent = 0;
    }

    public void printClass(Object obj, Location loc) {
        printIndent();
        stream.println("<<" + obj.getClass().getSimpleName() + ">> (" + loc + ")");
    }

    public void printMember(String name, String str, boolean isResolved) {
        printPair(name, str);
    }

    public void printMember(String name, String str) {
        printMember(name, str, false);
    }

    public void printMember(String name, long n) {
        printPair(name, "" + n);
    }

    protected void printPair(String name, String value) {
        printIndent();
        stream.println(name + ": " + value);
    }

    public void printMember(String name, Dumpable n) {
        printIndent();
        if (n == null) {
            stream.println(name + ": null");
        }
        else {
            stream.println(name + ":");
            indent();
            n.dump(this);
            unindent();
        }
    }

    protected void indent() { nIndent++; }
    protected void unindent() { nIndent--; }

    static final protected String indentString = "    ";

    protected void printIndent() {
        int n = nIndent;
        while (n > 0) {
            stream.print(indentString);
            n--;
        }
    }
}
