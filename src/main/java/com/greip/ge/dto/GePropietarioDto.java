package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_PROPIETARIO")
public class GePropietarioDto implements Serializable {

    @EmbeddedId
    protected GePropietarioDtoPK pk;

    public GePropietarioDto() {}

    public GePropietarioDtoPK getPk() {
        return pk;
    }

    public void setPk(GePropietarioDtoPK pk) {
        this.pk = pk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pk != null ? pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GePropietarioDto)) {
            return false;
        }
        GePropietarioDto other = (GePropietarioDto) object;
        if ((this.pk == null && other.pk != null) || (this.pk != null && !this.pk.equals(other.pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.greip.ge.dto.GePropietarioDto[ pk=" + pk + " ]";
    }
}