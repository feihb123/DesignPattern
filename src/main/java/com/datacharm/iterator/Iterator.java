package com.datacharm.iterator;

public interface Iterator<T> {
    T first();
    T next();
    boolean hasNext();
}
