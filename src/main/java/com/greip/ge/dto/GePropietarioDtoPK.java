package com.greip.ge.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class GePropietarioDtoPK implements Serializable {

    @Column(name = "ENTIDAD")
    private Long entidad;
    @Column(name = "REGISTRO")
    private Long registro;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;

    public GePropietarioDtoPK() {}

    public GePropietarioDtoPK(Long entidad, Long registro, GeCompaniaDto companiaDto) {
        this.entidad = entidad;
        this.registro = registro;
        this.companiaDto = companiaDto;
    }

    public Long getEntidad() {
        return entidad;
    }

    public void setEntidad(Long entidad) {
        this.entidad = entidad;
    }

    public Long getRegistro() {
        return registro;
    }

    public void setRegistro(Long registro) {
        this.registro = registro;
    }

    public GeCompaniaDto getCompaniaDto() {
        return companiaDto;
    }

    public void setCompaniaDto(GeCompaniaDto companiaDto) {
        this.companiaDto = companiaDto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entidad != null ? entidad.hashCode() : 0);
        hash += (registro != null ? registro.hashCode() : 0);
        hash += (companiaDto != null ? companiaDto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GePropietarioDtoPK)) {
            return false;
        }

        GePropietarioDtoPK other = (GePropietarioDtoPK) object;
        if ((this.entidad == null && other.entidad != null) || (this.entidad != null && !this.entidad.equals(other.entidad))) {
            return false;
        }
        if ((this.registro == null && other.registro != null) || (this.registro != null && !this.registro.equals(other.registro))) {
            return false;
        }
        if ((this.companiaDto == null && other.companiaDto != null) || (this.companiaDto != null && !this.companiaDto.equals(other.companiaDto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GePropietarioDtoPK[ entidad=" + entidad + ", registro=" + registro + ", organizacion=" + companiaDto + " ]";
    }
}
