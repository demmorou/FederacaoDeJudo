/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author deusimar
 */
@Entity
@Table(name = "pessoa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")
    , @NamedQuery(name = "Pessoa.findByIdpessoa", query = "SELECT p FROM Pessoa p WHERE p.idpessoa = :idpessoa")
    , @NamedQuery(name = "Pessoa.findByNomeCompleto", query = "SELECT p FROM Pessoa p WHERE p.nomeCompleto = :nomeCompleto")
    , @NamedQuery(name = "Pessoa.findByNomeMae", query = "SELECT p FROM Pessoa p WHERE p.nomeMae = :nomeMae")
    , @NamedQuery(name = "Pessoa.findByNomePai", query = "SELECT p FROM Pessoa p WHERE p.nomePai = :nomePai")
    , @NamedQuery(name = "Pessoa.findByTelefone", query = "SELECT p FROM Pessoa p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Pessoa.findByGraduacaoAtual", query = "SELECT p FROM Pessoa p WHERE p.graduacaoAtual = :graduacaoAtual")
    , @NamedQuery(name = "Pessoa.findByDataOutorga", query = "SELECT p FROM Pessoa p WHERE p.dataOutorga = :dataOutorga")
    , @NamedQuery(name = "Pessoa.findByCurriculun", query = "SELECT p FROM Pessoa p WHERE p.curriculun = :curriculun")
    , @NamedQuery(name = "Pessoa.findByFoto3x4", query = "SELECT p FROM Pessoa p WHERE p.foto3x4 = :foto3x4")
    , @NamedQuery(name = "Pessoa.findByCpf", query = "SELECT p FROM Pessoa p WHERE p.cpf = :cpf")})
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_pessoa")
    private Integer idpessoa;
    @Basic(optional = false)
    @Column(name = "nome_completo")
    private String nomeCompleto;
    @Basic(optional = false)
    @Column(name = "nome_mae")
    private String nomeMae;
    @Column(name = "nome_pai")
    private String nomePai;
    @Basic(optional = false)
    @Column(name = "telefone")
    private int telefone;
    @Basic(optional = false)
    @Column(name = "graduacao_atual")
    private String graduacaoAtual;
    @Basic(optional = false)
    @Column(name = "data_outorga")
    @Temporal(TemporalType.DATE)
    private Date dataOutorga;
    @Column(name = "curriculun")
    private String curriculun;
    @Basic(optional = false)
    @Column(name = "foto3x4")
    private String foto3x4;
    @Basic(optional = false)
    @Column(name = "cpf")
    private int cpf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoaFK")
    private Collection<Aluno> alunoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoaFK")
    private Collection<Professor> professorCollection;

    public Pessoa() {
    }

    public Pessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Pessoa(Integer idpessoa, String nomeCompleto, String nomeMae, int telefone, String graduacaoAtual, Date dataOutorga, String foto3x4, int cpf) {
        this.idpessoa = idpessoa;
        this.nomeCompleto = nomeCompleto;
        this.nomeMae = nomeMae;
        this.telefone = telefone;
        this.graduacaoAtual = graduacaoAtual;
        this.dataOutorga = dataOutorga;
        this.foto3x4 = foto3x4;
        this.cpf = cpf;
    }

    public Integer getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getGraduacaoAtual() {
        return graduacaoAtual;
    }

    public void setGraduacaoAtual(String graduacaoAtual) {
        this.graduacaoAtual = graduacaoAtual;
    }

    public Date getDataOutorga() {
        return dataOutorga;
    }

    public void setDataOutorga(Date dataOutorga) {
        this.dataOutorga = dataOutorga;
    }

    public String getCurriculun() {
        return curriculun;
    }

    public void setCurriculun(String curriculun) {
        this.curriculun = curriculun;
    }

    public String getFoto3x4() {
        return foto3x4;
    }

    public void setFoto3x4(String foto3x4) {
        this.foto3x4 = foto3x4;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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
        hash += (idpessoa != null ? idpessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idpessoa == null && other.idpessoa != null) || (this.idpessoa != null && !this.idpessoa.equals(other.idpessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pessoa[ idpessoa=" + idpessoa + " ]";
    }
    
}
