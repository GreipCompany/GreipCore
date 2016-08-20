package com.greip.se.dto;

import com.greip.ge.dto.GeCompaniaDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_OPCION_COMPANIA")
public class SeOpcionCompaniaDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_OPCION_COMPANIA")
    @TableGenerator(name = "S_SE_OPCION_COMPANIA", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_OPCION_COMPANIA", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;
    @JoinColumn(name = "OPCION", referencedColumnName = "ID")
    @ManyToOne
    private SeOpcionDto opcionDto;
    @Column(name = "ESTADO")
    private Boolean estado;

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

    @Override
    public String toString() {
        return "package com.greip.se.dto.SeOpcionCompaniaDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeOpcionCompaniaDto)) {
            return false;
        }
        SeOpcionCompaniaDto other = (SeOpcionCompaniaDto) object;
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