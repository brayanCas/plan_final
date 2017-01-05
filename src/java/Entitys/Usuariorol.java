/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "usuariorol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuariorol.findAll", query = "SELECT u FROM Usuariorol u"),
    @NamedQuery(name = "Usuariorol.findByIdUsuariorol", query = "SELECT u FROM Usuariorol u WHERE u.idUsuariorol = :idUsuariorol")})
public class Usuariorol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsuariorol")
    private Integer idUsuariorol;
    @JoinColumn(name = "idusario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuarios idusario;
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    @ManyToOne(optional = false)
    private Roles idrol;

    public Usuariorol() {
    }

    public Usuariorol(Integer idUsuariorol) {
        this.idUsuariorol = idUsuariorol;
    }

    public Integer getIdUsuariorol() {
        return idUsuariorol;
    }

    public void setIdUsuariorol(Integer idUsuariorol) {
        this.idUsuariorol = idUsuariorol;
    }

    public Usuarios getIdusario() {
        return idusario;
    }

    public void setIdusario(Usuarios idusario) {
        this.idusario = idusario;
    }

    public Roles getIdrol() {
        return idrol;
    }

    public void setIdrol(Roles idrol) {
        this.idrol = idrol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuariorol != null ? idUsuariorol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuariorol)) {
            return false;
        }
        Usuariorol other = (Usuariorol) object;
        if ((this.idUsuariorol == null && other.idUsuariorol != null) || (this.idUsuariorol != null && !this.idUsuariorol.equals(other.idUsuariorol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.Usuariorol[ idUsuariorol=" + idUsuariorol + " ]";
    }
    
}
