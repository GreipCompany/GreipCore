package com.greip.se.dto;

import com.greip.ge.dto.GeCompaniaDto;
import com.greip.ge.dto.GeEmpresaDto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SE_USUARIO_ROL")
public class SeUsuarioRolDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_USUARIO_ROL")
    @TableGenerator(name = "S_SE_USUARIO_ROL", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_USUARIO_ROL", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "ROL", referencedColumnName = "ID")
    @ManyToOne
    private SeRolDto rolDto;
    @JoinColumn(name = "USUARIO", referencedColumnName = "ID")
    @ManyToOne
    private SeUsuarioDto usuarioDto;
    @Column(name = "FEC_VIGENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecVigencia;
    @Column(name = "ESTADO")
    private Boolean estado;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;
    @JoinColumn(name = "EMPRESA", referencedColumnName = "ID")
    @ManyToOne
    private GeEmpresaDto empresaDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SeRolDto getRolDto() {
        return rolDto;
    }

    public void setRolDto(SeRolDto rolDto) {
        this.rolDto = rolDto;
    }

    public SeUsuarioDto getUsuarioDto() {
        return usuarioDto;
    }

    public void setUsuarioDto(SeUsuarioDto usuarioDto) {
        this.usuarioDto = usuarioDto;
    }

    public Date getFecVigencia() {
        return fecVigencia;
    }

    public void setFecVigencia(Date fecVigencia) {
        this.fecVigencia = fecVigencia;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public GeCompaniaDto getCompaniaDto() {
        return companiaDto;
    }

    public void setCompaniaDto(GeCompaniaDto companiaDto) {
        this.companiaDto = companiaDto;
    }

    public GeEmpresaDto getEmpresaDto() {
        return empresaDto;
    }

    public void setEmpresaDto(GeEmpresaDto empresaDto) {
        this.empresaDto = empresaDto;
    }

    @Override
    public String toString() {
        return "package com.greip.se.dto.SeUsuarioRolDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeUsuarioRolDto)) {
            return false;
        }
        SeUsuarioRolDto other = (SeUsuarioRolDto) object;
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