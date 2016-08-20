package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_UBIGEO")
public class GeUbigeoDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_UBIGEO")
    @TableGenerator(name = "S_GE_UBIGEO", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_UBIGEO", allocationSize = 1)
    private Long id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NOMBRE_CORTO")
    private String nombreCorto;
    @Column(name = "NOMBRE_COMPLETO")
    private String nombreCompleto;
    @Column(name = "TIPO")
    private String tipo;
    @JoinColumn(name = "PADRE", referencedColumnName = "ID")
    @ManyToOne
    private GeUbigeoDto padreDto;
    @Column(name = "COD_POSTAL")
    private String codPostal;
    @Column(name = "COD_INEI")
    private String codInei;
    @Column(name = "COD_SUNAT")
    private String codSunat;
    @Column(name = "ESTADO")
    private Boolean estado;

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

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public GeUbigeoDto getPadreDto() {
        return padreDto;
    }

    public void setPadreDto(GeUbigeoDto padreDto) {
        this.padreDto = padreDto;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCodInei() {
        return codInei;
    }

    public void setCodInei(String codInei) {
        this.codInei = codInei;
    }

    public String getCodSunat() {
        return codSunat;
    }

    public void setCodSunat(String codSunat) {
        this.codSunat = codSunat;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeUbigeoDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeUbigeoDto)) {
            return false;
        }
        GeUbigeoDto other = (GeUbigeoDto) object;
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