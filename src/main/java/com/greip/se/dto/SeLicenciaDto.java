package com.greip.se.dto;

import com.greip.ge.dto.GeCompaniaDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_LICENCIA")
public class SeLicenciaDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_LICENCIA")
    @TableGenerator(name = "S_SE_LICENCIA", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_LICENCIA", allocationSize = 1)
    private Long id;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;
    @Column(name = "MODULO")
    private Long modulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getModulo() {
        return modulo;
    }

    public void setModulo(Long modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "package com.greip.se.dto.SeLicenciaDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeLicenciaDto)) {
            return false;
        }
        SeLicenciaDto other = (SeLicenciaDto) object;
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