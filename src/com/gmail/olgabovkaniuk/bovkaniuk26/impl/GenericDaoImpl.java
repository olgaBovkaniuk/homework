package com.gmail.olgabovkaniuk.bovkaniuk26.impl;

import com.gmail.olgabovkaniuk.bovkaniuk26.dao.GenericDao;
import com.gmail.olgabovkaniuk.bovkaniuk26.service.ConnectionService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    protected void execute(String sql) {
        Connection connection = ConnectionService.getInstance().getConnection();
        if (connection != null) {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

    protected List<T> selectAll(String sql) {
        List<T> entities = new ArrayList<>();
        Connection connection = ConnectionService.getInstance().getConnection();
        if (connection != null) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet rs = statement.executeQuery(sql)) {
                    while (rs.next()) {
                        entities.add(buildEntity(rs));
                    }
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
        return entities;
    }

    protected abstract T buildEntity(ResultSet rs) throws SQLException;
}
