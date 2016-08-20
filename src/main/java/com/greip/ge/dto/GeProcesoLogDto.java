package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "GE_PROCESO_LOG")
public class GeProcesoLogDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_PROCESO_LOG")
    @TableGenerator(name = "S_GE_PROCESO_LOG", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_PROCESO_LOG", allocationSize = 1)
    private Long id;
    @Column(name = "FEC_HOR_INI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecHorIni;
    @Column(name = "FEC_HOR_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecHorFin;
    @Column(name = "TIE_PRO")
    private BigDecimal tiePro;
    @Column(name = "PROCESO")
    private String proceso;
    @Column(name = "FEC_ACT")
    private String fecAct;
    @Column(name = "NUM_REG_PRO")
    private Long numRegPro;
    @Column(name = "NUM_REG_ERR")
    private Long numRegErr;
    @Column(name = "NUM_REG_CAR")
    private Long numRegCar;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ARCHIVO")
    private String archivo;
    @Column(name = "COMENTARIOS")
    private String comentarios;
    @Column(name = "AGENCIAS")
    private String agencias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecHorIni() {
        return fecHorIni;
    }

    public void setFecHorIni(Date fecHorIni) {
        this.fecHorIni = fecHorIni;
    }

    public Date getFecHorFin() {
        return fecHorFin;
    }

    public void setFecHorFin(Date fecHorFin) {
        this.fecHorFin = fecHorFin;
    }

    public BigDecimal getTiePro() {
        return tiePro;
    }

    public void setTiePro(BigDecimal tiePro) {
        this.tiePro = tiePro;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getFecAct() {
        return fecAct;
    }

    public void setFecAct(String fecAct) {
        this.fecAct = fecAct;
    }

    public Long getNumRegPro() {
        return numRegPro;
    }

    public void setNumRegPro(Long numRegPro) {
        this.numRegPro = numRegPro;
    }

    public Long getNumRegErr() {
        return numRegErr;
    }

    public void setNumRegErr(Long numRegErr) {
        this.numRegErr = numRegErr;
    }

    public Long getNumRegCar() {
        return numRegCar;
    }

    public void setNumRegCar(Long numRegCar) {
        this.numRegCar = numRegCar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getAgencias() {
        return agencias;
    }

    public void setAgencias(String agencias) {
        this.agencias = agencias;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeProcesoLogDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeProcesoLogDto)) {
            return false;
        }
        GeProcesoLogDto other = (GeProcesoLogDto) object;
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