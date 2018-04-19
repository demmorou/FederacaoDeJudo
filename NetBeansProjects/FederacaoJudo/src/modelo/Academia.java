/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author deusimar
 */
@Entity
@Table(name = "academia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Academia.findAll", query = "SELECT a FROM Academia a")
    , @NamedQuery(name = "Academia.findByIdacademia", query = "SELECT a FROM Academia a WHERE a.idacademia = :idacademia")
    , @NamedQuery(name = "Academia.findByProfessorResponsavel", query = "SELECT a FROM Academia a WHERE a.professorResponsavel = :professorResponsavel")
    , @NamedQuery(name = "Academia.findByEstado", query = "SELECT a FROM Academia a WHERE a.estado = :estado")
    , @NamedQuery(name = "Academia.findByCep", query = "SELECT a FROM Academia a WHERE a.cep = :cep")
    , @NamedQuery(name = "Academia.findByCidade", query = "SELECT a FROM Academia a WHERE a.cidade = :cidade")
    , @NamedQuery(name = "Academia.findByBairro", query = "SELECT a FROM Academia a WHERE a.bairro = :bairro")
    , @NamedQuery(name = "Academia.findByRua", query = "SELECT a FROM Academia a WHERE a.rua = :rua")
    , @NamedQuery(name = "Academia.findByNumero", query = "SELECT a FROM Academia a WHERE a.numero = :numero")})
public class Academia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_academia")
    private Integer idacademia;
    @Basic(optional = false)
    @Column(name = "professor_responsavel")
    private String professorResponsavel;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "cep")
    private int cep;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "rua")
    private String rua;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idacademiaFK")
    private Collection<Aluno> alunoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idacademiaFK")
    private Collection<Professor> professorCollection;

    public Academia() {
    }

    public Academia(Integer idacademia) {
        this.idacademia = idacademia;
    }

    public Academia(Integer idacademia, String professorResponsavel, String estado, int cep, String cidade, String bairro, String rua, int numero) {
        this.idacademia = idacademia;
        this.professorResponsavel = professorResponsavel;
        this.estado = estado;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Integer getIdacademia() {
        return idacademia;
    }

    public void setIdacademia(Integer idacademia) {
        this.idacademia = idacademia;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }

    @XmlTransient
    public Collection<Professor> getProfessorCollection() {
        return professorCollection;
    }

    public void setProfessorCollection(Collection<Professor> professorCollection) {
        this.professorCollection = professorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idacademia != null ? idacademia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Academia)) {
            return false;
        }
        Academia other = (Academia) object;
        if ((this.idacademia == null && other.idacademia != null) || (this.idacademia != null && !this.idacademia.equals(other.idacademia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Academia[ idacademia=" + idacademia + " ]";
    }
    
}
