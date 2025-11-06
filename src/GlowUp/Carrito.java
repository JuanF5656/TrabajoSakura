package GlowUp;

import java.util.ArrayList;
import java.util.UUID;

public class Carrito {
    private UUID id= UUID.randomUUID();
    private String fechaCreacion;
    private ArrayList<Producto> productos= new ArrayList<Producto>();

    public Carrito() {
    }

    public Carrito(String fechaCreacion,  ArrayList<Producto> productos) {
        this.fechaCreacion = fechaCreacion;
        this.productos = productos;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public UUID getId() {
        return id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
            System.out.println(producto.getNombre() + " se ha añadido al carrito.");
        } else {
            System.out.println("No se puede agregar un producto nulo.");
        }
    }
    public void eliminarProducto(Producto producto) {
        if (producto != null && productos.contains(producto)) {
            productos.remove(producto);
            System.out.println(producto.getNombre() + " se ha eliminado del carrito.");
        } else {
            System.out.println("El producto no se encuentra en el carrito.");
        }
    }

    public void modificarProducto(Producto productoModificado) {
        if (productoModificado == null) {
            System.out.println("No se puede modificar un producto nulo.");
            return;
        }
        for (int i = 0; i < productos.size(); i++) {
            Producto actual = productos.get(i);
            if (actual.getId().equals(productoModificado.getId())) {
                productos.set(i, productoModificado);
                System.out.println("El producto " + productoModificado.getNombre() + " ha sido modificado correctamente.");
                return;
            }
        }
        System.out.println("El producto con ID " + productoModificado.getId() + " no se encontró en el carrito.");
    }
}
