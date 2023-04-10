package com.david.h2setup.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CompradorDto {
    private Long compradoId;

    @NotBlank
    @Size(max = 25)
    private String nombre;

    private String email;

    private String password;

    private String direccion;

    private Long cp;

    public CompradorDto() {
    }

    public CompradorDto(Long compradoId, String nombre, String email, String password, String direccion, Long cp) {
        this.compradoId = compradoId;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.direccion = direccion;
        this.cp = cp;
    }


    
    public CompradorDto(String nombre) {
        this.nombre = nombre;
    }

    public Long getCompradoId() {
        return compradoId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDireccion() {
        return direccion;
    }

    public Long getCp() {
        return cp;
    }

    public void setCompradoId(Long compradoId) {
        this.compradoId = compradoId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCp(Long cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "CompradorDto [compradoId=" + compradoId + ", nombre=" + nombre + ", email=" + email + ", password="
                + password + ", direccion=" + direccion + ", cp=" + cp + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((compradoId == null) ? 0 : compradoId.hashCode());
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
        CompradorDto other = (CompradorDto) obj;
        if (compradoId == null) {
            if (other.compradoId != null)
                return false;
        } else if (!compradoId.equals(other.compradoId))
            return false;
        return true;
    }

    
}
