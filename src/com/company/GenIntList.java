package com.company;

public interface GenIntList<E> {

    void add(E e);

    void add(int index, E e);

    void clear();

    boolean contains(E e);

    E get(int index);

    boolean isEmpty();

    boolean remove(int index);

    boolean removeElement(E e);

    void set(int index, E e);

    int size();

    void check(int index);
}