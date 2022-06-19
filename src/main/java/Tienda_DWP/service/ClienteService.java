/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_DWP.service;

import Tienda_DWP.domain.Cliente;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface ClienteService {

    public List<Cliente> getClientes();

    public void save(Cliente cliente);

    public void delete(Cliente cliente);

    public Cliente getCliente(Cliente cliente);
}
