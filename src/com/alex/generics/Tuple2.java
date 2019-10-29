package com.alex.generics;

public class Tuple2<T1, T2> {

    private final T1 left;
    private final T2 right;

    public Tuple2(final T1 left, final T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }

}
