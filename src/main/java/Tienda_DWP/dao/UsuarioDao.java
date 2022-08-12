package Tienda_DWP.dao;

import Tienda_DWP.domain.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);

    List<Usuario> findByIdRol(Long idRol);
}
