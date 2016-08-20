package com.greip.se.dto;

import com.greip.ge.dto.GeCompaniaDto;
import com.greip.ge.dto.GeEmpresaDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_ROL")
public class SeRolDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_ROL")
    @TableGenerator(name = "S_SE_ROL", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_ROL", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "IND_ADMINISTRADOR")
    private Boolean indAdministrador;
    @Column(name = "IND_SYS")
    private Boolean indSys;
    @JoinColumn(name = "EMPRESA", referencedColumnName = "ID")
    @ManyToOne
    private GeEmpresaDto empresaDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GeCompaniaDto getCompaniaDto() {
        return companiaDto;
    }

    public void setCompaniaDto(GeCompaniaDto companiaDto) {
        this.companiaDto = companiaDto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getIndAdministrador() {
        return indAdministrador;
    }

    public void setIndAdministrador(Boolean indAdministrador) {
        this.indAdministrador = indAdministrador;
    }

    public Boolean getIndSys() {
        return indSys;
    }

    public void setIndSys(Boolean indSys) {
        this.indSys = indSys;
    }

    public GeEmpresaDto getEmpresaDto() {
        return empresaDto;
    }

    public void setEmpresaDto(GeEmpresaDto empresaDto) {
        this.empresaDto = empresaDto;
    }

    @Override
    public String toString() {
        return "package com.greip.se.dto.SeRolDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeRolDto)) {
            return false;
        }
        SeRolDto other = (SeRolDto) object;
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