package com.bookclub.service;

import java.util.List;

public interface GenericCrudDao<E, K> {
    public void add(E entity);

    public void update(E entity);

    public boolean remove(E entity);

    public List<E> list();

    public E find(K key);
    
}
