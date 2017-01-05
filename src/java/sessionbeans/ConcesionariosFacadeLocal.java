/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entitys.Concesionarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author USUARIO
 */
@Local
public interface ConcesionariosFacadeLocal {

    void create(Concesionarios concesionarios);

    void edit(Concesionarios concesionarios);

    void remove(Concesionarios concesionarios);

    Concesionarios find(Object id);

    List<Concesionarios> findAll();

    List<Concesionarios> findRange(int[] range);

    int count();
    
}
