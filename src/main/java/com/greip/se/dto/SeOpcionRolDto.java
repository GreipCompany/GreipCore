package com.greip.se.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.greip.ge.dto.GeCompaniaDto;
import com.greip.ge.dto.GeEmpresaDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_OPCION_ROL")
public class SeOpcionRolDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_OPCION_ROL")
    @TableGenerator(name = "S_SE_OPCION_ROL", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_OPCION_ROL", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "ROL", referencedColumnName = "ID")
    @ManyToOne
    @JsonIgnore
    private SeRolDto rolDto;
    @JoinColumn(name = "OPCION", referencedColumnName = "ID")
    @ManyToOne
    private SeOpcionDto opcionDto;
    @Column(name = "ESTADO")
    private Boolean estado;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    @JsonIgnore
    private GeCompaniaDto companiaDto;
    @JoinColumn(name = "EMPRESA", referencedColumnName = "ID")
    @ManyToOne
    @JsonIgnore
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

    public SeOpcionDto getOpcionDto() {
        return opcionDto;
    }

    public void setOpcionDto(SeOpcionDto opcionDto) {
        this.opcionDto = opcionDto;
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
        return "package com.greip.se.dto.SeOpcionRolDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeOpcionRolDto)) {
            return false;
        }
        SeOpcionRolDto other = (SeOpcionRolDto) object;
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