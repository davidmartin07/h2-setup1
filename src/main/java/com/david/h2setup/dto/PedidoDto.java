package com.david.h2setup.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



public class PedidoDto {
   
    private Long pedidoId;

    private String descripcion;

    private LocalDate horaDeRecogida;

    @OneToMany
    private List<ProductoDto> productos;
    @ManyToOne
    private CompradorDto comprador;

    public PedidoDto() {
    }

    public PedidoDto(String descripcion, LocalDate horaDeRecogida, List<ProductoDto> productos, CompradorDto comprador) {
        this.descripcion = descripcion;
        this.horaDeRecogida = horaDeRecogida;
        this.productos = productos;
        this.comprador = comprador;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getHoraDeRecogida() {
        return horaDeRecogida;
    }

    public void setHoraDeRecogida(LocalDate horaDeRecogida) {
        this.horaDeRecogida = horaDeRecogida;
    }

    public List<ProductoDto> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoDto> productos) {
        this.productos = productos;
    }

    public CompradorDto getComprador() {
        return comprador;
    }

    public void setComprador(CompradorDto comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Pedido [pedidoId=" + pedidoId + ", descripcion=" + descripcion + ", horaDeRecogida=" + horaDeRecogida
                + ", productos=" + productos + ", comprador=" + comprador + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pedidoId == null) ? 0 : pedidoId.hashCode());
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
        PedidoDto other = (PedidoDto) obj;
        if (pedidoId == null) {
            if (other.pedidoId != null)
                return false;
        } else if (!pedidoId.equals(other.pedidoId))
            return false;
        return true;
    }
}
