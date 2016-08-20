package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_PROCESO")
public class GeProcesoDto implements Serializable {

    @Id
    private String id;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ORD_EJE_PRO")
    private Long ordEjePro;
    @Column(name = "DEPENDENCIA")
    private String dependencia;
    @Column(name = "IND_VIGENTE")
    private Boolean indVigente;
    @Column(name = "IND_BLOQUEANTE")
    private Boolean indBloqueante;
    @Column(name = "TIP_PRO")
    private String tipPro;
    @Column(name = "NOM_ARC")
    private String nomArc;
    @Column(name = "EJECUCION")
    private String ejecucion;
    @Column(name = "IND_VAL_DEP_DIA")
    private Boolean indValDepDia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getOrdEjePro() {
        return ordEjePro;
    }

    public void setOrdEjePro(Long ordEjePro) {
        this.ordEjePro = ordEjePro;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public Boolean getIndVigente() {
        return indVigente;
    }

    public void setIndVigente(Boolean indVigente) {
        this.indVigente = indVigente;
    }

    public Boolean getIndBloqueante() {
        return indBloqueante;
    }

    public void setIndBloqueante(Boolean indBloqueante) {
        this.indBloqueante = indBloqueante;
    }

    public String getTipPro() {
        return tipPro;
    }

    public void setTipPro(String tipPro) {
        this.tipPro = tipPro;
    }

    public String getNomArc() {
        return nomArc;
    }

    public void setNomArc(String nomArc) {
        this.nomArc = nomArc;
    }

    public String getEjecucion() {
        return ejecucion;
    }

    public void setEjecucion(String ejecucion) {
        this.ejecucion = ejecucion;
    }

    public Boolean getIndValDepDia() {
        return indValDepDia;
    }

    public void setIndValDepDia(Boolean indValDepDia) {
        this.indValDepDia = indValDepDia;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeProcesoDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeProcesoDto)) {
            return false;
        }
        GeProcesoDto other = (GeProcesoDto) object;
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