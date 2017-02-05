/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.adsalomo.dataaccesslayer.dao;

import co.com.adsalomo.dataaccesslayer.contracts.IPersonaDao;
import co.com.adsalomo.dataaccesslayer.helper.PersonaHelper;
import co.com.adsalomo.model.PersonaModel;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author aye
 */
public class PersonaDao implements IPersonaDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public boolean insertPersona(PersonaModel personaModel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePersona(PersonaModel personaModel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePersona(PersonaModel personaModel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonaModel> listPersona() throws SQLException {
        return jdbcTemplate.query("SELECT * FROM PERSONA", new PersonaHelper());
    }
    
}
