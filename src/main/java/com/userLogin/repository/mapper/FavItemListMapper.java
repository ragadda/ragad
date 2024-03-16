package com.userLogin.repository.mapper;

import com.userLogin.model.FavItemsList;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FavItemListMapper implements RowMapper<FavItemsList> {
    @Override
    public FavItemsList mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new FavItemsList(
                rs.getInt("Favorite_list_id"),
                rs.getInt("item_id"),
                rs.getInt("user_id")
        );
    }
}
