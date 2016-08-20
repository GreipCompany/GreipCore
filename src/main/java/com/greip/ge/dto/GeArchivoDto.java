package com.greip.ge.dto;

import com.greip.core.dto.ComunDto;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "GE_ARCHIVO")
public class GeArchivoDto extends ComunDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_ARCHIVO")
    @TableGenerator(name = "S_GE_ARCHIVO", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_ARCHIVO", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;
    @Column(name = "ENTIDAD")
    private Long entidad;
    @Column(name = "REGISTRO")
    private Long registro;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "RUTA")
    private String ruta;
    @Column(name = "EXTENSION")
    private String extension;
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "ESTADO")
    private Boolean estado;
    @Column(name = "DETALLE")
    private String detalle;
    @Column(name = "IND_ES_ATRIBUTO")
    private Boolean indEsAtributo;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getIndEsAtributo() {
        return indEsAtributo;
    }

    public void setIndEsAtributo(Boolean indEsAtributo) {
        this.indEsAtributo = indEsAtributo;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeArchivoDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeArchivoDto)) {
            return false;
        }
        GeArchivoDto other = (GeArchivoDto) object;
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