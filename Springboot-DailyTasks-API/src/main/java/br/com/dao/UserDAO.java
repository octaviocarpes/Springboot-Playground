package br.com.dao;

import br.com.dao.mapper.UserRowMapper;
import br.com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    SimpleJdbcInsert jdbcInsert;

    private final String JDBC_CONNECTION = "jdbc:localhost:3306/dailytasks";
    private final String JDBC_USER = "root";
    private final String JDBC_PASSWORD = "senha";

    @Transactional(readOnly = true)
    public User getUser(String username, String password){

        PreparedStatement preparedStatement = null;
        String sql = "SELECT * FROM Users WHERE username = "+ username + " AND password = " + password + ";";

        try {
            Connection connection = DriverManager.getConnection(JDBC_CONNECTION,JDBC_USER,JDBC_PASSWORD);

            preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery(sql);

            if (resultSet.first()){
                String db_username = resultSet.getString("username");
                String db_password = resultSet.getString("password");
                String db_email = resultSet.getString("email");
                String db_id = resultSet.getString("userId");
                String db_firstName = resultSet.getString("firstName");
                String db_lastName = resultSet.getString("lastName");

                connection.close();
                return new User(db_firstName,db_lastName,db_username,db_password,db_email,Integer.parseInt(db_id));
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers(){
        return jdbcTemplate.query("SELECT * FROM Users",new UserRowMapper());
    }

    public void insertUser(User user){
        Map<String, Object> parameters = new HashMap<String,Object>();
        parameters.put("username",user.getUsername());
        parameters.put("password",user.getPassword());
        parameters.put("firstName",user.getFirstName());
        parameters.put("lastName",user.getLastName());
        parameters.put("email",user.getEmail());
        parameters.put("userId",user.getUserId());

        jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("Users");

        ArrayList<String> keys = new ArrayList<>(parameters.keySet());

        jdbcInsert.setColumnNames(keys);
        jdbcInsert.execute(parameters);

    }

}
