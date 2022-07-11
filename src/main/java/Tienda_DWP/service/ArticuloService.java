/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_DWP.service;

import Tienda_DWP.domain.Articulo;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface ArticuloService {

    public List<Articulo> getArticulos(boolean activos);

    public void save(Articulo cliente);

    public void delete(Articulo cliente);

    public Articulo getArticulo(Articulo cliente);
}
