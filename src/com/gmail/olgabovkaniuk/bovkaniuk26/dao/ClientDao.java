package com.gmail.olgabovkaniuk.bovkaniuk26.dao;

import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Client;

public interface ClientDao extends GenericDao<Client> {
    void createClientTable();
}
