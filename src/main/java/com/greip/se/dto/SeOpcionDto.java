package com.greip.se.dto;

import com.greip.ge.dto.GeCompaniaDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_OPCION")
public class SeOpcionDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_SE_OPCION")
    @TableGenerator(name = "S_SE_OPCION", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "SE_OPCION", allocationSize = 1)
    private Long id;
    @Column(name = "MODULO")
    private Long modulo;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "PADRE", referencedColumnName = "ID")
    @ManyToOne
    private SeOpcionDto padreDto;
    @Column(name = "ETIQUETA")
    private String etiqueta;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "ACTION")
    private String action;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ORDEN")
    private Long orden;
    @Column(name = "ESTADO")
    private Boolean estado;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;
    @Column(name = "IND_ALL_CIAS")
    private Boolean indAllCias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModulo() {
        return modulo;
    }

    public void setModulo(Long modulo) {
        this.modulo = modulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SeOpcionDto getPadreDto() {
        return padreDto;
    }

    public void setPadreDto(SeOpcionDto padreDto) {
        this.padreDto = padreDto;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getOrden() {
        return orden;
    }

    public void setOrden(Long orden) {
        this.orden = orden;
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

    public Boolean getIndAllCias() {
        return indAllCias;
    }

    public void setIndAllCias(Boolean indAllCias) {
        this.indAllCias = indAllCias;
    }

    @Override
    public String toString() {
        return "package com.greip.se.dto.SeOpcionDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SeOpcionDto)) {
            return false;
        }
        SeOpcionDto other = (SeOpcionDto) object;
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