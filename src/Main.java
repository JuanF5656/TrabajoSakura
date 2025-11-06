import GlowUp.Carrito;
import GlowUp.Categoria;
import GlowUp.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void mostrarMenu(){
        System.out.println("------Selecione una opción------");
        System.out.println("1. Operaciones Comerciales");
        System.out.println("2. Administración y control");
        System.out.println("3. Modulos Confidenciales");
        System.out.println("4. Historial");
        System.out.println("5. Salir");
    }
    static void OperacionesComerciales(){
        System.out.println("--Op. Comerciales--");
        System.out.println("1. Ver Productos");
        System.out.println("2. Buscar Productos");
        System.out.println("3. Agregar Producto al carrito");
        System.out.println("4. Ver carrito");
        System.out.println("5. Eliminar Producto del carrito");
        System.out.println("6. Finalizar compra");
        System.out.println("0. Volver");
    }
    static void AdministracionYControl(){
        System.out.println("--Admin. y Control--");
        System.out.println("1. Registrar producto");
        System.out.println("2. Modificar producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Ver productos");
        System.out.println("5. Registrar categoria");
        System.out.println("6. Ver categorias");
        System.out.println("7. Registrar usuario");
        System.out.println("8. Listar Usuarios por rol");
        System.out.println("9. Bloquear/Desbloquear ususario");
        System.out.println("0. Volver");
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Categoria> categorias = new ArrayList<>();
        Carrito carrito = new Carrito();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        while (!salir){
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());
            sc.nextLine();
            switch (opcion){
                case 1:
                    int op1 = 1;
                    while (op1 != 0){
                        OperacionesComerciales();
                        op1 = Integer.parseInt(sc.nextLine());
                        switch (op1){
                            case 1:
                                for (Producto p : productos) {
                                    System.out.println(p);
                                }
                            break;
                            case 2:
                                System.out.println("ingrese la categoria que quiere buscar: ");
                                String categoria = sc.nextLine();
                                System.out.println("resultados para "+categoria+":");
                                for (Producto p : productos) {
                                    if (p.getCategoria().equals(categoria)) {
                                        System.out.println(p);
                                    }
                                }
                            break;
                            case 3:
                                System.out.print("Ingrese el nombre del producto: ");
                                // agregar producto al carro
                            break;
                            case 4:
                                //mostrar productos del carro
                            break;
                            case 5:
                                //eliminar producto del carro
                            break;
                            case 6:
                                //cambiar estado de orden a pagada
                            break;
                            case 0:
                                System.out.println("volviendo al menu principal");
                            break;
                            default:
                                System.out.println("opcion invalida");
                            break;

                        }
                    }
                case 2 :
                    sc.nextLine();
                    int op2 = 1;

                    while (op2 != 0){
                        AdministracionYControl();
                        op2 = Integer.parseInt(sc.nextLine());
                        switch (op2){
                            case 1:
                                if (categorias.size() == 0) {
                                    System.out.println("deben existir categorias primero");
                                } else {
                                    System.out.println("ingrese el nombre del producto que va a registrar: ");
                                    String nombreProd = sc.nextLine();
                                    System.out.println("ingrese una descripcion para el producto: ");
                                    String descProd = sc.nextLine();
                                    System.out.println("ingrese una precio para el producto: ");
                                    double precioProd = Double.parseDouble(sc.nextLine());
                                    System.out.println("cuanto stock del producto hay?: ");
                                    int stockP = Integer.parseInt(sc.nextLine());
                                    System.out.println("ingrese la fecha de lanzamiento del producto: ");
                                    String fechaLanzamiento = sc.nextLine();
                                    System.out.println("ingrese el nombre de la categoria del producto: ");
                                    // completar
                                    Producto p = new Producto(nombreProd, descProd, precioProd, stockP, fechaLanzamiento);
                                    productos.add(p);
                                }
                            break;
                            case 2:
                                //modificar producto
                            break;
                            case 3:
                                //eliminar producto
                            break;
                            case 4:
                                for  (Producto p : productos) {
                                    System.out.println(p);
                                }
                            break;
                            case 5:
                                System.out.println("ingresar nombre de la categoria: ");
                                String nombreCategoria = sc.nextLine();
                                System.out.println("ingresar descripcion de la categoria: ");
                                String descripcionCategoria = sc.nextLine();
                                Categoria categoria = new Categoria(nombreCategoria, descripcionCategoria);
                                categorias.add(categoria);
                            break;
                            case 6:
                                for (Categoria c : categorias) {
                                    System.out.println(c);
                                }
                            break;
                            case 7:
                                System.out.println("ingresar nombre del usuario:");
                                String nombreUsuario = sc.nextLine();
                                //completar
                            break;
                            case 8:
                                //mostrar usuarios y su rol
                        }
                    }
            }
        }

    }
}