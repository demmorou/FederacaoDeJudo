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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

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
    , @NamedQuery(name = "Pessoa.findByGraduacaoAtual", query = "SELECT p FROM Pessoa p WHERE p.graduacaoAtual = :graduacaoAtual")
    , @NamedQuery(name = "Pessoa.findByCurriculun", query = "SELECT p FROM Pessoa p WHERE p.curriculun = :curriculun")
    , @NamedQuery(name = "Pessoa.findByFoto3x4", query = "SELECT p FROM Pessoa p WHERE p.foto3x4 = :foto3x4")
    , @NamedQuery(name = "Pessoa.findByCpf", query = "SELECT p FROM Pessoa p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "Pessoa.findByDataOutorga", query = "SELECT p FROM Pessoa p WHERE p.dataOutorga = :dataOutorga")
    , @NamedQuery(name = "Pessoa.findByTelefone", query = "SELECT p FROM Pessoa p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Pessoa.findByPeso", query = "SELECT p FROM Pessoa p WHERE p.peso = :peso")
    , @NamedQuery(name = "Pessoa.findBySexo", query = "SELECT p FROM Pessoa p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "Pessoa.findByIdade", query = "SELECT p FROM Pessoa p WHERE p.idade = :idade")
    , @NamedQuery(name = "Pessoa.findByStatusPag", query = "SELECT p FROM Pessoa p WHERE p.statusPag = :statusPag")})
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
    @Column(name = "graduacao_atual")
    private String graduacaoAtual;
    @Column(name = "curriculun")
    private String curriculun;
    @Basic(optional = false)
    @Column(name = "foto3x4")
    private String foto3x4;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "data_outorga")
    private String dataOutorga;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "peso")
    private float peso;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "idade")
    private int idade;
    @Basic(optional = false)
    @Column(name = "status_pag")
    private int statusPag;

    public Pessoa() {
    }

    public Pessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Pessoa(Integer idpessoa, String nomeCompleto, String nomeMae, String graduacaoAtual, String foto3x4, String cpf, String dataOutorga, String telefone, float peso, String sexo, int idade, int statusPag) {
        this.idpessoa = idpessoa;
        this.nomeCompleto = nomeCompleto;
        this.nomeMae = nomeMae;
        this.graduacaoAtual = graduacaoAtual;
        this.foto3x4 = foto3x4;
        this.cpf = cpf;
        this.dataOutorga = dataOutorga;
        this.telefone = telefone;
        this.peso = peso;
        this.sexo = sexo;
        this.idade = idade;
        this.statusPag = statusPag;
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

    public String getGraduacaoAtual() {
        return graduacaoAtual;
    }

    public void setGraduacaoAtual(String graduacaoAtual) {
        this.graduacaoAtual = graduacaoAtual;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataOutorga() {
        return dataOutorga;
    }

    public void setDataOutorga(String dataOutorga) {
        this.dataOutorga = dataOutorga;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getStatusPag() {
        return statusPag;
    }

    public void setStatusPag(int statusPag) {
        this.statusPag = statusPag;
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
