package GlowUp;

import java.util.Scanner;

public class ModuloConfidencial {
    private boolean accesoPermitido;
    private Scanner sc = new Scanner(System.in);

    public ModuloConfidencial(boolean accesoPermitido) {
        this.accesoPermitido = accesoPermitido;
    }

    public void menuConfidencial() {
        if (!accesoPermitido) {
            System.out.println(" Acceso denegado. Solo miembros del Consejo Sombrío o Sakura pueden entrar.");
            return;
        }

        int opcion;
        do {
            System.out.println("\n=== MÓDULOS CONFIDENCIALES ===");
            System.out.println("1. Ver logs confidenciales");
            System.out.println("2. Acceder a servidor privado");
            System.out.println("3. Modificar datos corporativos");
            System.out.println("4. Activar proyecto Elixir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> verLogsConfidenciales();
                case 2 -> accederServidorPrivado();
                case 3 -> modificarDatosCorporativos();
                case 4 -> activarProyectoElixir();
                case 0 -> System.out.println("Saliendo del módulo confidencial...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void verLogsConfidenciales() {
        System.out.println(" Logs secretos del Consejo Sombrío:");
        System.out.println("- Transacción oculta #A52 confirmada");
        System.out.println("- Contrato de fábrica brasileña firmado en zona restringida");
    }

    private void accederServidorPrivado() {
        System.out.println(" Accediendo a los servidores personales de Sakura...");
        System.out.println("Autenticando...");
        System.out.println("Acceso concedido. Directorio: /root/GlowUp/secret_data/");
    }

    private void modificarDatosCorporativos() {
        System.out.println(" Modo edición confidencial activado...");
        System.out.print("Ingrese la clave maestra: ");
        String clave = sc.nextLine();
        if (clave.equals("ELIXIR2025")) {
            System.out.println(" Clave aceptada. Datos corporativos modificados.");
        } else {
            System.out.println(" Clave incorrecta. Registro reportado.");
        }
    }

    private void activarProyectoElixir() {
        System.out.println(" Activando el Proyecto Elixir...");
        System.out.println("Fase 1: Análisis genético de la muestra Isis...");
        System.out.println("Fase 2: Extracción completada. Sakura obtiene el control total ");
    }
}
