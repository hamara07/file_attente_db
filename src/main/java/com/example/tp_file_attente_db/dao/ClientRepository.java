package com.example.tp_file_attente_db.dao;


import com.example.tp_file_attente_db.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Client>clientList(){
        String sql= "SELECT * FROM t_clients ";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Client(rs.getInt("id"), rs.getString("nom")));
    }

    public int create(Client client){
        String sql="insert into t_clients (nom) values (?)";
        System.out.println("Insertion de client: " + client.getNom());
        return jdbcTemplate.update(sql, client.getNom());
    }

//    public Client findById(int id) {
//        String sql = "SELECT * FROM clients WHERE id = ?";
//        return jdbcTemplate.queryForObject(sql,
//                new Object[]{id},
//                (rs, rowNum) -> new Client(rs.getInt("id"), rs.getString("nom")));
//    }
//
//    public int update(Client client) {
//        String sql = "UPDATE clients SET nom = ? WHERE id = ?";
//        return jdbcTemplate.update(sql, client.getNom(), client.getId());
//    }
//
//    public int deleteById(int id) {
//        String sql = "DELETE FROM clients WHERE id = ?";
//        return jdbcTemplate.update(sql, id);
//    }

}
