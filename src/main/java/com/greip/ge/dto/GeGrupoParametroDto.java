package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_GRUPO_PARAMETRO")
public class GeGrupoParametroDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_GRUPO_PARAMETRO")
    @TableGenerator(name = "S_GE_GRUPO_PARAMETRO", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_GRUPO_PARAMETRO", allocationSize = 1)
    private Long id;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "MODULO")
    private Long modulo;
    @JoinColumn(name = "EMPRESA", referencedColumnName = "ID")
    @ManyToOne
    private GeEmpresaDto empresaDto;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getModulo() {
        return modulo;
    }

    public void setModulo(Long modulo) {
        this.modulo = modulo;
    }

    public GeEmpresaDto getEmpresaDto() {
        return empresaDto;
    }

    public void setEmpresaDto(GeEmpresaDto empresaDto) {
        this.empresaDto = empresaDto;
    }

    public GeCompaniaDto getCompaniaDto() {
        return companiaDto;
    }

    public void setCompaniaDto(GeCompaniaDto companiaDto) {
        this.companiaDto = companiaDto;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeGrupoParametroDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeGrupoParametroDto)) {
            return false;
        }
        GeGrupoParametroDto other = (GeGrupoParametroDto) object;
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