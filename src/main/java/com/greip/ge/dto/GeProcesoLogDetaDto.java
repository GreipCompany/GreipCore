package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_PROCESO_LOG_DETA")
public class GeProcesoLogDetaDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_PROCESO_LOG_DETA")
    @TableGenerator(name = "S_GE_PROCESO_LOG_DETA", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_PROCESO_LOG_DETA", allocationSize = 1)
    private Long id;
    @Column(name = "ID_LOG")
    private Long idLog;
    @Column(name = "CLA_REG")
    private String claReg;
    @Column(name = "CLA_REG_DES")
    private String claRegDes;
    @Column(name = "DES_ERR")
    private String desErr;

    public Long getIdLog() {
        return idLog;
    }

    public void setIdLog(Long idLog) {
        this.idLog = idLog;
    }

    public String getClaReg() {
        return claReg;
    }

    public void setClaReg(String claReg) {
        this.claReg = claReg;
    }

    public String getClaRegDes() {
        return claRegDes;
    }

    public void setClaRegDes(String claRegDes) {
        this.claRegDes = claRegDes;
    }

    public String getDesErr() {
        return desErr;
    }

    public void setDesErr(String desErr) {
        this.desErr = desErr;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeProcesoLogDetaDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeProcesoLogDetaDto)) {
            return false;
        }
        GeProcesoLogDetaDto other = (GeProcesoLogDetaDto) object;
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