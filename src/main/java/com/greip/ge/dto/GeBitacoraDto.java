package com.greip.ge.dto;

import com.greip.core.dto.ComunDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_BITACORA")
public class GeBitacoraDto extends ComunDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_BITACORA")
    @TableGenerator(name = "S_GE_BITACORA", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_BITACORA", allocationSize = 1)
    private Long id;
    @Column(name = "ENTIDAD")
    private Long entidad;
    @Column(name = "REGISTRO")
    private Long registro;
    @Column(name = "TIP_MOVIMIENTO")
    private String tipMovimiento;
    @Column(name = "ESTADO")
    private Long estado;
    @Column(name = "ACTIVO")
    private Boolean activo;
    @Column(name = "DETALLE")
    private String detalle;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTipMovimiento() {
        return tipMovimiento;
    }

    public void setTipMovimiento(String tipMovimiento) {
        this.tipMovimiento = tipMovimiento;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public GeCompaniaDto getCompaniaDto() {
        return companiaDto;
    }

    public void setCompaniaDto(GeCompaniaDto companiaDto) {
        this.companiaDto = companiaDto;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeBitacoraDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeBitacoraDto)) {
            return false;
        }
        GeBitacoraDto other = (GeBitacoraDto) object;
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