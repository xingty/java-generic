package org.wiyi.generic;

import java.io.Serializable;

public interface CrudRepository<E extends Serializable> {
    E find();

    void add(E e);

    boolean contain(E e);
}
