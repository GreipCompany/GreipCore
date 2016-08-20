package com.greip.se.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_OPCION_LICENCIA")
public class SeOpcionLicenciaDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_OPCION_LICENCIA")
    @TableGenerator(name = "S_SE_OPCION_LICENCIA", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_OPCION_LICENCIA", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "LICENCIA", referencedColumnName = "ID")
    @ManyToOne
    private SeLicenciaDto licenciaDto;
    @JoinColumn(name = "OPCION", referencedColumnName = "ID")
    @ManyToOne
    private SeOpcionDto opcionDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SeLicenciaDto getLicenciaDto() {
        return licenciaDto;
    }

    public void setLicenciaDto(SeLicenciaDto licenciaDto) {
        this.licenciaDto = licenciaDto;
    }

    public SeOpcionDto getOpcionDto() {
        return opcionDto;
    }

    public void setOpcionDto(SeOpcionDto opcionDto) {
        this.opcionDto = opcionDto;
    }

    @Override
    public String toString() {
        return "package com.greip.se.dto.SeOpcionLicenciaDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeOpcionLicenciaDto)) {
            return false;
        }
        SeOpcionLicenciaDto other = (SeOpcionLicenciaDto) object;
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