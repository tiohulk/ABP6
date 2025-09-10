package com.productos.mircroservicios_productos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @GetMapping("/saludo")
    public String saludar() {
        return "¡Hola desde el microservicio de productos!";
    }

    @GetMapping
    public List<Producto> obtenerTodos() {
        // En un microservicio real, aquí se llamaría a un servicio o repositorio
        // para obtener los datos de una base de datos.
        
        // Creamos una lista de productos de ejemplo
        Producto producto1 = new Producto(1L, "Laptop", "Laptop de alta gama", 1200.00);
        Producto producto2 = new Producto(2L, "Mouse Gamer", "Mouse ergonómico y rápido", 75.50);
        
        // Devolvemos la lista de productos
        return Arrays.asList(producto1, producto2);
    }
}