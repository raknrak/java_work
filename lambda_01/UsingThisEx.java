package org.study.lam.exam05;

public class UsingThisEx {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();

        inner.method();
    }

}
