package Tienda_DWP.service;

import Tienda_DWP.domain.Carrito;

public interface CarritoService {

    public Carrito getCarrito(Carrito carrito);

    public Carrito getCarritoCliente(long idCliente);
}
