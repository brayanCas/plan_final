/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entitys.Usuariorol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author USUARIO
 */
@Local
public interface UsuariorolFacadeLocal {

    void create(Usuariorol usuariorol);

    void edit(Usuariorol usuariorol);

    void remove(Usuariorol usuariorol);

    Usuariorol find(Object id);

    List<Usuariorol> findAll();

    List<Usuariorol> findRange(int[] range);

    int count();
    
}
