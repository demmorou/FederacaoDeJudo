/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deusimar
 */
@Entity
@Table(name = "professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p")
    , @NamedQuery(name = "Professor.findByIdprofessor", query = "SELECT p FROM Professor p WHERE p.idprofessor = :idprofessor")
    , @NamedQuery(name = "Professor.findByLocaisDeTrabalho", query = "SELECT p FROM Professor p WHERE p.locaisDeTrabalho = :locaisDeTrabalho")
    , @NamedQuery(name = "Professor.findByVinculoComAcademia", query = "SELECT p FROM Professor p WHERE p.vinculoComAcademia = :vinculoComAcademia")
    , @NamedQuery(name = "Professor.findByCref", query = "SELECT p FROM Professor p WHERE p.cref = :cref")})
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_professor")
    private Integer idprofessor;
    @Basic(optional = false)
    @Column(name = "locais_de_trabalho")
    private String locaisDeTrabalho;
    @Basic(optional = false)
    @Column(name = "vinculo_com_academia")
    private String vinculoComAcademia;
    @Basic(optional = false)
    @Column(name = "CREF")
    private int cref;
    @JoinColumn(name = "Id_pessoaFK", referencedColumnName = "Id_pessoa")
    @ManyToOne(optional = false)
    private Pessoa idpessoaFK;
    @JoinColumn(name = "Id_academiaFK", referencedColumnName = "Id_academia")
    @ManyToOne(optional = false)
    private Academia idacademiaFK;

    public Professor() {
    }

    public Professor(Integer idprofessor) {
        this.idprofessor = idprofessor;
    }

    public Professor(Integer idprofessor, String locaisDeTrabalho, String vinculoComAcademia, int cref) {
        this.idprofessor = idprofessor;
        this.locaisDeTrabalho = locaisDeTrabalho;
        this.vinculoComAcademia = vinculoComAcademia;
        this.cref = cref;
    }

    public Integer getIdprofessor() {
        return idprofessor;
    }

    public void setIdprofessor(Integer idprofessor) {
        this.idprofessor = idprofessor;
    }

    public String getLocaisDeTrabalho() {
        return locaisDeTrabalho;
    }

    public void setLocaisDeTrabalho(String locaisDeTrabalho) {
        this.locaisDeTrabalho = locaisDeTrabalho;
    }

    public String getVinculoComAcademia() {
        return vinculoComAcademia;
    }

    public void setVinculoComAcademia(String vinculoComAcademia) {
        this.vinculoComAcademia = vinculoComAcademia;
    }

    public int getCref() {
        return cref;
    }

    public void setCref(int cref) {
        this.cref = cref;
    }

    public Pessoa getIdpessoaFK() {
        return idpessoaFK;
    }

    public void setIdpessoaFK(Pessoa idpessoaFK) {
        this.idpessoaFK = idpessoaFK;
    }

    public Academia getIdacademiaFK() {
        return idacademiaFK;
    }

    public void setIdacademiaFK(Academia idacademiaFK) {
        this.idacademiaFK = idacademiaFK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprofessor != null ? idprofessor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.idprofessor == null && other.idprofessor != null) || (this.idprofessor != null && !this.idprofessor.equals(other.idprofessor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Professor[ idprofessor=" + idprofessor + " ]";
    }
    
}
