package kg.iaau.edu.com.dao;

import kg.iaau.edu.com.model.Atasozleri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class AtasozleriDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AtasozleriDao(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Atasozleri> getATASOZLERI()
    {
        return jdbcTemplate.query("SELECT * FROM ATASOZLERI", new RowMapper<Atasozleri>() {
            public Atasozleri mapRow(ResultSet resultSet, int i) throws SQLException {
                Atasozleri ATASOZLER = new Atasozleri();
                ATASOZLER.setid(resultSet.getInt("id"));
                ATASOZLER.setKG(resultSet.getString("KG"));
                ATASOZLER.setTR(resultSet.getString("TR"));
                ATASOZLER.setmaining(resultSet.getString("maining"));
                return ATASOZLER;
            }
        });

    }

    public Atasozleri getATASOZLERI(int id)
    {
        String sql = "SELECT * FROM ATASOZLERI WHERE id = ?";
        RowMapper<Atasozleri> rowMapper = new BeanPropertyRowMapper<>(Atasozleri.class);
        Atasozleri ATASOZLER = jdbcTemplate.queryForObject(sql, rowMapper, id);

        return ATASOZLER;
    }





    public Atasozleri find(String name)
    {
        String sql = "SELECT * FROM ATASOZLERI WHERE KG like ?" ;
        RowMapper<Atasozleri> rowMapper = new BeanPropertyRowMapper<>(Atasozleri.class);
        Atasozleri ATASOZLER = jdbcTemplate.queryForObject(sql, rowMapper, name);

        return ATASOZLER;
    }





    public boolean delete(Atasozleri atasozleri)
    {
        return jdbcTemplate.update("delete from ATASOZLERI where id = ?", atasozleri.getid()) == 1;
    }






    public boolean create(Atasozleri atasozleri)
    {
        return jdbcTemplate.update("insert into ATASOZLERI (KG, TR, maining) values (?, ?, ?)", atasozleri.getKG(), atasozleri.getTR(),atasozleri.getmaining()) == 1;
    }




    public boolean update(Atasozleri atasozleri)
    {
        return jdbcTemplate.update("update ATASOZLERI set KG =?, TR=?, maining=? where id=?", atasozleri.getKG(), atasozleri.getTR(), atasozleri.getmaining(), atasozleri.getid()) == 1;
    }
}