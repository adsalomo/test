/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.adsalomo.dataaccesslayer.contracts;

import co.com.adsalomo.model.PersonaModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author aye
 */
public interface IPersonaDao {
    
    /**
     * Definicion metodo registrar persona
     * @param personaModel
     * @return
     * @throws SQLException 
     */
    boolean insertPersona(PersonaModel personaModel) throws SQLException;
    
    /**
     * Definicion metodo actualizar Persona
     * @param personaModel
     * @return
     * @throws SQLException 
     */
    boolean updatePersona(PersonaModel personaModel) throws SQLException;
    
    /**
     * Definicion metodo eliminar persona
     * @param personaModel
     * @return
     * @throws SQLException 
     */
    boolean deletePersona(PersonaModel personaModel) throws SQLException;
    
    /**
     * Definicion metodo listar persona
     * @return
     * @throws SQLException 
     */
    List<PersonaModel> listPersona() throws SQLException;
}
