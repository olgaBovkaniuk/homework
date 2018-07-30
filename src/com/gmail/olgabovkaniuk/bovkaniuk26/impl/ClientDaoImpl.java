package com.gmail.olgabovkaniuk.bovkaniuk26.impl;

import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Client;
import com.gmail.olgabovkaniuk.bovkaniuk26.dao.ClientDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClientDaoImpl extends GenericDaoImpl<Client> implements ClientDao {

    @Override
    public void createClientTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS t_client("
                + "id INTEGER (11) AUTO_INCREMENT NOT NULL, "
                + "name VARCHAR(20) NOT NULL, "
                + "PRIMARY KEY (id)"
                + ")";
        execute(createTableSQL);
        System.out.println("Table 't_client' is created!");
    }

    @Override
    public void save(Client client) {
        String insertClientSQL = "INSERT INTO t_client (id, name) "
                + "VALUES ("
                + client.getId()
                + ", '"
                + client.getName()
                + "')";
        execute(insertClientSQL);
    }

    @Override
    public void saveAll(List<Client> clientList) {
        for (Client client : clientList) {
            save(client);
        }
    }

    @Override
    public Client getById(Long id) {
        String selectClientSQL = "SELECT id, name FROM t_client WHERE id = " + id;
        List<Client> clients = selectAll(selectClientSQL);
        return clients.isEmpty() ? null : selectAll(selectClientSQL).get(0);
    }

    @Override
    protected Client buildEntity(ResultSet rs) throws SQLException {
        return null;
    }
}
