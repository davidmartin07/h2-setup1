package com.david.h2setup.dto;

import java.sql.Blob;



public class ProductoDto {
  
    private Long productoId;

   
    private String nombre;


    private String descripcion;

    
    private Float precio;

   
    private Long stock;

    private Blob foto;

    //Con esto se me ha creado en la tabla producto una columna con el id del vendedor asociado al producto
    
    private VendedorDto vendedor;

    public ProductoDto() {
    }

    public ProductoDto(String nombre, String descripcion, Float precio, Long stock, Blob foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.foto = foto;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public VendedorDto getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorDto vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Producto [productoId=" + productoId + ", nombre=" + nombre + ", descripcion=" + descripcion
                + ", precio=" + precio + ", stock=" + stock + ", foto=" + foto + ", vendedor=" + vendedor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productoId == null) ? 0 : productoId.hashCode());
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
        ProductoDto other = (ProductoDto) obj;
        if (productoId == null) {
            if (other.productoId != null)
                return false;
        } else if (!productoId.equals(other.productoId))
            return false;
        return true;
    }
}
