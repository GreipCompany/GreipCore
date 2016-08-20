package com.greip.ge.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

//@Entity
//@Table(name = "GE_PROCESO_TRAZA")
public class GeProcesoTrazaDto implements Serializable {

    //@Column(name = "FECHA")
    private String fecha;
    //@Column(name = "PROCESO")
    private String proceso;
    //@Column(name = "ORDEN")
    private Long orden;
    //@Column(name = "DETALLE")
    private String detalle;
    //@Column(name = "ID_LOG_EJE")
    private Long idLogEje;
    //@Column(name = "ESTADO")
    private String estado;
    //@Column(name = "PAR_FEC_PRO")
    private String parFecPro;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public Long getOrden() {
        return orden;
    }

    public void setOrden(Long orden) {
        this.orden = orden;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Long getIdLogEje() {
        return idLogEje;
    }

    public void setIdLogEje(Long idLogEje) {
        this.idLogEje = idLogEje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getParFecPro() {
        return parFecPro;
    }

    public void setParFecPro(String parFecPro) {
        this.parFecPro = parFecPro;
    }
}