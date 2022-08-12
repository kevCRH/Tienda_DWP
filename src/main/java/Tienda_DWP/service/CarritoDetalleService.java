package Tienda_DWP.service;

import Tienda_DWP.domain.Articulo;
import Tienda_DWP.domain.CarritoDetalle;
import java.util.List;

public interface CarritoDetalleService {

    CarritoDetalle getCarritoDetalle(Long idCarrito, Articulo articulo);

    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);

    public void save(CarritoDetalle carritoDetalle);

    public void delete(CarritoDetalle carritoDetalle);

    public void deleteAll(Long idCarrito);
}
