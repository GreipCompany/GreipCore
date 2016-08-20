package com.greip.ge.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GE_EMPRESA")
public class GeEmpresaDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "S_GE_EMPRESA")
    @TableGenerator(name = "S_GE_EMPRESA", table = "GE_ENTIDAD", pkColumnName = "NOMBRE", valueColumnName = "CORRELATIVO", pkColumnValue = "GE_EMPRESA", allocationSize = 1)
    private Long id;
    @JoinColumn(name = "COMPANIA", referencedColumnName = "ID")
    @ManyToOne
    private GeCompaniaDto companiaDto;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NOMBRE_CORTO")
    private String nombreCorto;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "TIPO_DOCUMENTO")
    private Long tipoDocumento;
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @JoinColumn(name = "PAIS", referencedColumnName = "ID")
    @ManyToOne
    private GeUbigeoDto paisDto;
    @JoinColumn(name = "MONEDA", referencedColumnName = "ID")
    @ManyToOne
    private GeMonedaDto monedaDto;
    @Column(name = "ARCHIVO_LOGO")
    private Long archivoLogo;
    @Column(name = "ESTADO")
    private Boolean estado;
    @Column(name = "F_FECHA_HORA_MIN")
    private String fFechaHoraMin;
    @Column(name = "F_FECHA_HORA")
    private String fFechaHora;
    @Column(name = "F_FECHA_HORA_MIN_SEG")
    private String fFechaHoraMinSeg;
    @Column(name = "F_FECHA")
    private String fFecha;
    @Column(name = "F_HORA")
    private String fHora;
    @Column(name = "F_TIEMPO")
    private String fTiempo;
    @Column(name = "F_MONTO")
    private String fMonto;
    @Column(name = "F_MONTO_TC")
    private String fMontoTc;
    @Column(name = "F_PRECISION_MONTO")
    private Long fPrecisionMonto;
    @Column(name = "F_PRECISION_MONTO_TC")
    private Long fPrecisionMontoTc;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Long tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public GeUbigeoDto getPaisDto() {
        return paisDto;
    }

    public void setPaisDto(GeUbigeoDto paisDto) {
        this.paisDto = paisDto;
    }

    public GeMonedaDto getMonedaDto() {
        return monedaDto;
    }

    public void setMonedaDto(GeMonedaDto monedaDto) {
        this.monedaDto = monedaDto;
    }

    public Long getArchivoLogo() {
        return archivoLogo;
    }

    public void setArchivoLogo(Long archivoLogo) {
        this.archivoLogo = archivoLogo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getFFechaHoraMin() {
        return fFechaHoraMin;
    }

    public void setFFechaHoraMin(String fFechaHoraMin) {
        this.fFechaHoraMin = fFechaHoraMin;
    }

    public String getFFechaHora() {
        return fFechaHora;
    }

    public void setFFechaHora(String fFechaHora) {
        this.fFechaHora = fFechaHora;
    }

    public String getFFechaHoraMinSeg() {
        return fFechaHoraMinSeg;
    }

    public void setFFechaHoraMinSeg(String fFechaHoraMinSeg) {
        this.fFechaHoraMinSeg = fFechaHoraMinSeg;
    }

    public String getFFecha() {
        return fFecha;
    }

    public void setFFecha(String fFecha) {
        this.fFecha = fFecha;
    }

    public String getFHora() {
        return fHora;
    }

    public void setFHora(String fHora) {
        this.fHora = fHora;
    }

    public String getFTiempo() {
        return fTiempo;
    }

    public void setFTiempo(String fTiempo) {
        this.fTiempo = fTiempo;
    }

    public String getFMonto() {
        return fMonto;
    }

    public void setFMonto(String fMonto) {
        this.fMonto = fMonto;
    }

    public String getFMontoTc() {
        return fMontoTc;
    }

    public void setFMontoTc(String fMontoTc) {
        this.fMontoTc = fMontoTc;
    }

    public Long getFPrecisionMonto() {
        return fPrecisionMonto;
    }

    public void setFPrecisionMonto(Long fPrecisionMonto) {
        this.fPrecisionMonto = fPrecisionMonto;
    }

    public Long getFPrecisionMontoTc() {
        return fPrecisionMontoTc;
    }

    public void setFPrecisionMontoTc(Long fPrecisionMontoTc) {
        this.fPrecisionMontoTc = fPrecisionMontoTc;
    }

    @Override
    public String toString() {
        return "package com.greip.ge.dto.GeEmpresaDto[ id="+id+"]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GeEmpresaDto)) {
            return false;
        }
        GeEmpresaDto other = (GeEmpresaDto) object;
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