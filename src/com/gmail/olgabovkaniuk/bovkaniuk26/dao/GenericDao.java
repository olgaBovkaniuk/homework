package com.gmail.olgabovkaniuk.bovkaniuk26.dao;

import java.util.List;

public interface GenericDao<T> {
    void save(T entity);

    void saveAll(List<T> entities);

    T getById(Long id);
}
