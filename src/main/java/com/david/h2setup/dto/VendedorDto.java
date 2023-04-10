package com.david.h2setup.dto;

public class VendedorDto {

    private Long vendedorId;

    private String nombreComercio;

    private String email;

    private String password;

    private String direccion;

    private Long cp;

    public VendedorDto() {
    }

    public VendedorDto(String nombreComercio, String email, String password, String direccion, Long cp) {
        this.nombreComercio = nombreComercio;
        this.email = email;
        this.password = password;
        this.direccion = direccion;
        this.cp = cp;
    }

    

    public VendedorDto(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    public Long getId() {
        return vendedorId;
    }

    public void setId(Long id) {
        this.vendedorId = id;
    }

    public String getNombreComercio() {
        return nombreComercio;
    }

    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getCp() {
        return cp;
    }

    public void setCp(Long cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Vendedor [id=" + vendedorId + ", nombreComercio=" + nombreComercio + ", email=" + email + ", password="
                + password + ", direccion=" + direccion + ", cp=" + cp + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((vendedorId == null) ? 0 : vendedorId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VendedorDto other = (VendedorDto) obj;
        if (vendedorId == null) {
            if (other.vendedorId != null)
                return false;
        } else if (!vendedorId.equals(other.vendedorId))
            return false;
        return true;
    }
}
