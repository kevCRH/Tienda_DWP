package Tienda_DWP.service;

import Tienda_DWP.dao.ArticuloDao;
import Tienda_DWP.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kevin
 */
@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    private ArticuloDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Articulo> getArticulos(boolean activos) {
        var lista = (List<Articulo>) clienteDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional
    public void save(Articulo cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Articulo cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Articulo getArticulo(Articulo cliente) {
        return clienteDao.findById(cliente.getIdArticulo()).orElse(null);
    }

}
