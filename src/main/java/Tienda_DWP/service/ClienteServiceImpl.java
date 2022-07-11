package Tienda_DWP.service;

import Tienda_DWP.dao.ClienteDao;
import Tienda_DWP.dao.CreditoDao;
import Tienda_DWP.domain.Cliente;
import Tienda_DWP.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kevin
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteDao clienteDao;
    @Autowired
    private CreditoDao creditoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }
    
    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }
    
    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }
    
}
