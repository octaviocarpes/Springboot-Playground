package br.com.dao.mapper;


import br.com.entity.User;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {

    @Override
    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        String db_username = resultSet.getString("username");
        String db_password = resultSet.getString("password");
        String db_email = resultSet.getString("email");
        String db_id = resultSet.getString("user_id");
        String db_firstName = resultSet.getString("firstName");
        String db_lastName = resultSet.getString("lastName");

        return new User(db_firstName,db_lastName,db_username,db_password,db_email,Integer.parseInt(db_id));
    }
}
