package com.digitalcastaway.datastructures;

public class Stack {
    CustomCollection collection = new CustomCollection();

    public void push(Integer value) {
        collection.insert(value, 0);
    }

    public Integer pop() {
        return collection.delete(0);
    }
}
