/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_DWP.service;

import Tienda_DWP.domain.Categoria;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface CategoriaService {

    public List<Categoria> getCategorias(boolean activos);

    public void save(Categoria cliente);

    public void delete(Categoria cliente);

    public Categoria getCategoria(Categoria cliente);
}
