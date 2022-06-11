package Tienda_DWP.dao;

import Tienda_DWP.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
