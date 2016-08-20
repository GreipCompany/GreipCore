package com.greip.se.dto;

import com.greip.ge.dto.GeCompaniaDto;
import com.greip.ge.dto.GeEmpresaDto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SE_USUARIO")
public class SeUsuarioDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_USUARIO")
    @TableGenerator(name = "S_SE_USUARIO", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_USUARIO", allocationSize = 1)
    private Long id;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Column(name = "FEC_VIGENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecVigencia;
    @Column(name = "IND_BLOQUEADO")
    private Boolean indBloqueado;
    @Column(name = "ESTADO")
    private Boolean estado;
    @JoinColumn(name = "EMPRESA", referencedColumnName = "ID")
    @ManyToOne
    private GeEmpresaDto empresaDto;
    @Column(name = "CONF_CANT_REG")
    private Long confCantReg;
    @Column(name = "CONF_IDIOMA")
    private String confIdioma;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GeCompaniaDto getCompaniaDto() {
        return companiaDto;
    }

    public void setCompaniaDto(GeCompaniaDto companiaDto) {
        this.companiaDto = companiaDto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecVigencia() {
        return fecVigencia;
    }

    public void setFecVigencia(Date fecVigencia) {
        this.fecVigencia = fecVigencia;
    }

    public Boolean getIndBloqueado() {
        return indBloqueado;
    }

    public void setIndBloqueado(Boolean indBloqueado) {
        this.indBloqueado = indBloqueado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public GeEmpresaDto getEmpresaDto() {
        return empresaDto;
    }

    public void setEmpresaDto(GeEmpresaDto empresaDto) {
        this.empresaDto = empresaDto;
    }

    public Long getConfCantReg() {
        return confCantReg;
    }

    public void setConfCantReg(Long confCantReg) {
        this.confCantReg = confCantReg;
    }

    public String getConfIdioma() {
        return confIdioma;
    }

    public void setConfIdioma(String confIdioma) {
        this.confIdioma = confIdioma;
    }

    @Override
    public String toString() {
        return "package com.greip.se.dto.SeUsuarioDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeUsuarioDto)) {
            return false;
        }
        SeUsuarioDto other = (SeUsuarioDto) object;
        if ((this.id == null & other.id != null) || (this.id != null & !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
}