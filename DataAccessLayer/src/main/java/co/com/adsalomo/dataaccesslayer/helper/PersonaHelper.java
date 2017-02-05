/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.adsalomo.dataaccesslayer.helper;

import co.com.adsalomo.model.PersonaModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author aye
 */
public class PersonaHelper implements RowMapper<PersonaModel>{

    @Override
    public PersonaModel mapRow(ResultSet rs, int i) throws SQLException {
        PersonaModel persona = new PersonaModel();
        persona.setId(rs.getInt("id"));
        persona.setNombre(rs.getString("nombre"));
        persona.setApellido(rs.getString("apellido"));
        return persona;
    }
    
}
