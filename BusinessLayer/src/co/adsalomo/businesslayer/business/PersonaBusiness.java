/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.adsalomo.businesslayer.business;

import co.com.adsalomo.dataaccesslayer.contracts.IPersonaDao;
import co.com.adsalomo.dataaccesslayer.dao.PersonaDao;
import co.com.adsalomo.model.PersonaModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aye
 */
public class PersonaBusiness {
    
    IPersonaDao iPersonaDao;
    
    /**
     * Obtiene el listado de personas
     * @return 
     */
    public List<PersonaModel> listPersona(){
        iPersonaDao = new PersonaDao();
        List<PersonaModel> list = null;
        try {
            list = iPersonaDao.listPersona();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex){
            Logger.getLogger(PersonaBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
