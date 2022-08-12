package Tienda_DWP.dao;

import Tienda_DWP.domain.Carrito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface CarritoDao extends CrudRepository<Carrito, Long> {

    Optional<Carrito> findByIdCliente(Long idCliente);
}
