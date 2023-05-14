package com.bookclub.service;

import java.util.List;

public interface GenericCrudDao<E, K> {
    public void add(E entity);

    public void update(E entity);

    public boolean remove(K key);

    public List<E> list(K key);

    public E find(K key);
    
}
