package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_MONEDA")
public class GeMonedaDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_MONEDA")
    @TableGenerator(name = "S_GE_MONEDA", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_MONEDA", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "PAIS", referencedColumnName = "ID")
    @ManyToOne
    private GeUbigeoDto paisDto;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NOMBRE_CORTO")
    private String nombreCorto;
    @Column(name = "NOMBRE_TRX")
    private String nombreTrx;
    @Column(name = "SIMBOLO")
    private String simbolo;
    @Column(name = "ESTADO")
    private Boolean estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GeUbigeoDto getPaisDto() {
        return paisDto;
    }

    public void setPaisDto(GeUbigeoDto paisDto) {
        this.paisDto = paisDto;
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

    public String getNombreTrx() {
        return nombreTrx;
    }

    public void setNombreTrx(String nombreTrx) {
        this.nombreTrx = nombreTrx;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeMonedaDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeMonedaDto)) {
            return false;
        }
        GeMonedaDto other = (GeMonedaDto) object;
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