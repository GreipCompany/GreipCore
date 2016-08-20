package com.greip.se.dto;

import com.greip.ge.dto.GeCompaniaDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_LICENCIA_COMPANIA")
public class SeLicenciaCompaniaDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_LICENCIA_COMPANIA")
    @TableGenerator(name = "S_SE_LICENCIA_COMPANIA", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_LICENCIA_COMPANIA", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "LICENCIA", referencedColumnName = "ID")
    @ManyToOne
    private SeLicenciaDto licenciaDto;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;

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

    public GeCompaniaDto getCompaniaDto() {
        return companiaDto;
    }

    public void setCompaniaDto(GeCompaniaDto companiaDto) {
        this.companiaDto = companiaDto;
    }

    @Override
    public String toString() {
        return "package com.greip.se.dto.SeLicenciaCompaniaDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeLicenciaCompaniaDto)) {
            return false;
        }
        SeLicenciaCompaniaDto other = (SeLicenciaCompaniaDto) object;
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