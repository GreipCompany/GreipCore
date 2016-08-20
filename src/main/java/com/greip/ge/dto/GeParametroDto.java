package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_PARAMETRO")
public class GeParametroDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_PARAMETRO")
    @TableGenerator(name = "S_GE_PARAMETRO", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_PARAMETRO", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "GRUPO", referencedColumnName = "ID")
    @ManyToOne
    private GeGrupoParametroDto grupoDto;
    @Column(name = "CLAVE")
    private String clave;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "TIPO_DATO")
    private String tipoDato;
    @Column(name = "VALOR")
    private String valor;
    @Column(name = "IND_DEFECTO")
    private Boolean indDefecto;
    @Column(name = "EMPRESA")
    private Long empresa;
    @Column(name = "DESCRIPCION_CORTA")
    private String descripcionCorta;
    @Column(name = "COD_HOMOLOGACION")
    private String codHomologacion;
    @Column(name = "COD_ESTANDAR")
    private String codEstandar;
    @Column(name = "COMPANIA")
    private Long companiaDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GeGrupoParametroDto getGrupoDto() {
        return grupoDto;
    }

    public void setGrupoDto(GeGrupoParametroDto grupoDto) {
        this.grupoDto = grupoDto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Boolean getIndDefecto() {
        return indDefecto;
    }

    public void setIndDefecto(Boolean indDefecto) {
        this.indDefecto = indDefecto;
    }

    public Long getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Long empresa) {
        this.empresa = empresa;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getCodHomologacion() {
        return codHomologacion;
    }

    public void setCodHomologacion(String codHomologacion) {
        this.codHomologacion = codHomologacion;
    }

    public String getCodEstandar() {
        return codEstandar;
    }

    public void setCodEstandar(String codEstandar) {
        this.codEstandar = codEstandar;
    }

    public Long getCompaniaDto() {
        return companiaDto;
    }

    public void setCompaniaDto(Long companiaDto) {
        this.companiaDto = companiaDto;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeParametroDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeParametroDto)) {
            return false;
        }
        GeParametroDto other = (GeParametroDto) object;
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