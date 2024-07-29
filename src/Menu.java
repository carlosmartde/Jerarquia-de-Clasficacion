import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Laptop> laptops;
    private List<Desktop> desktops;
    private List<Smartphone>smartphones;
    private List<Tablet> tablets;
    private List<Refrigerador>refrigeradores;

    public Menu() {
        laptops=new ArrayList<>();
        desktops=new ArrayList<>();
        smartphones=new ArrayList<>();
        tablets=new ArrayList<>();
        refrigeradores=new ArrayList<>();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----- Menú Principal -----");
            System.out.print("SELECCIONE QUE TIPO DE DISPOSITIVO DESEA REGISTRAR\n");
            System.out.println("1. COMPUTADORA");
            System.out.println("2. DISPOSITIVO MOVIL");
            System.out.println("3. ELECTRODOMESTICO");
            System.out.println("4. VER LISTA DE ARTICULOS");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("1. LAPTOP");
                    System.out.println("2. DESKTOP");
                    System.out.println("3. REGRESAR AL MENU ANTERIOR");
                    int opcion1=scanner.nextInt();
                    switch (opcion1){
                        case 1:
                            registrarLaptop(scanner);
                            break;
                        case 2:
                            registrarDesktop(scanner);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. SMARTPHONE");
                    System.out.println("2. LAPTOP");
                    System.out.println("3. REGRESAR AL MENU ANTERIOR");
                    int opcion2=scanner.nextInt();
                    switch (opcion2){
                        case 1:
                            registrarSmartphone(scanner);
                            break;
                        case 2:
                            registrarTablet(scanner);
                            break;
                        case 3:
                            break;
                    }

                    break;
                case 3:
                    System.out.println("1. REFRIGERADORA");
                    System.out.println("2. REGRESAR AL MENU ANTERIOR");
                    int opcion3=scanner.nextInt();
                    switch (opcion3){
                        case 1:
                            registrarRefrigeradora(scanner);
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1. DISPOSITIVOS ELECTRONICOS");
                    System.out.println("2. DISPOSITIVOS MOVILES");
                    System.out.println("3. ELECTRODOMESTICOS");
                    System.out.print("4: REGRESAR AL MENU ANTERIOR");
                    int opcion4=scanner.nextInt();
                    switch (opcion4){
                        case 1:
                            mostrarLaptops();
                            mostrarDesktops();
                            break;
                        case 2:
                            mostrarSmartphones();
                            mostrarTablets();
                            break;
                        case 3:
                            mostrarRefrigeradores();
                            break;
                        case 4:
                            break;
                    }


                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
    private void registrarLaptop(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        System.out.print("INGRESE LA MARCA: ");
        String marca=scanner.nextLine();
        System.out.print("INGRESE EL MODELO: ");
        String modelo=scanner.nextLine();
        System.out.print("INGRESE EL COLOR: ");
        String color=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE RAM: ");
        String ram=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE ALMACENAMIENTO: ");
        String almacenamiento=scanner.nextLine();
        System.out.print("INGRESE EL PROCESADOR: ");
        String procesador=scanner.nextLine();
        System.out.print("INGRESE EL SISTEMA OPERATIVO: ");
        String sistemaOperativo=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE GRAFICA: ");
        String grafica=scanner.nextLine();


        Laptop laptop=new Laptop(marca, modelo,color,ram,almacenamiento,procesador,sistemaOperativo,grafica);
        laptops.add(laptop);
        System.out.println("Articulo registrado exitosamente.\n");
    }

    private void registrarDesktop(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        System.out.print("INGRESE LA MARCA: ");
        String marca=scanner.nextLine();
        System.out.print("INGRESE EL MODELO: ");
        String modelo=scanner.nextLine();
        System.out.print("INGRESE EL COLOR: ");
        String color=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE RAM: ");
        String ram=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE ALMACENAMIENTO: ");
        String almacenamiento=scanner.nextLine();
        System.out.print("INGRESE EL PROCESADOR: ");
        String procesador=scanner.nextLine();
        System.out.print("INGRESE EL TIPO DE TECLADO: ");
        String teclado=scanner.nextLine();
        System.out.print("INGRESE EL TIPO DE MOUSE: ");
        String mouse=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE GRAFICA: ");
        String grafica=scanner.nextLine();


        Desktop desktop=new Desktop(marca,modelo,color,ram,almacenamiento,procesador,teclado,mouse,grafica);
        desktops.add(desktop);
        System.out.println("Articulo registrado exitosamente.\n");
    }

    private void registrarSmartphone(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        System.out.print("INGRESE LA MARCA: ");
        String marca=scanner.nextLine();
        System.out.print("INGRESE EL MODELO: ");
        String modelo=scanner.nextLine();
        System.out.print("INGRESE EL COLOR: ");
        String color=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE RAM: ");
        String ram=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE ALMACENAMIENTO: ");
        String almacenamiento=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD EN MEGAPIXELES DE LA CAMARA: ");
        String camara=scanner.nextLine();
        System.out.print("INGRESE EL SISTEMA OPERATIVO: ");
        String sistemaOperativo=scanner.nextLine();

        Smartphone smartphone=new Smartphone(marca,modelo,color,ram,almacenamiento,camara,sistemaOperativo);
        smartphones.add(smartphone);
        System.out.println("Articulo registrado exitosamente.\n");
    }

    private void registrarTablet(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        System.out.print("INGRESE LA MARCA: ");
        String marca=scanner.nextLine();
        System.out.print("INGRESE EL MODELO: ");
        String modelo=scanner.nextLine();
        System.out.print("INGRESE EL COLOR: ");
        String color=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE RAM: ");
        String ram=scanner.nextLine();
        System.out.print("INGRESE LA CAPACIDAD DE ALMACENAMIENTO: ");
        String almacenamiento=scanner.nextLine();
        System.out.print("INGRESE EL TAMAÑO DE LA PANTALLA: ");
        String pantalla=scanner.nextLine();
        System.out.print("INGRESE EL SISTEMA OPERATIVO: ");
        String sistemaOperativo=scanner.nextLine();

        Tablet tablet= new Tablet(marca,modelo,color,ram,almacenamiento,pantalla,sistemaOperativo);
        tablets.add(tablet);
        System.out.println("Articulo registrado exitosamente.\n");
    }
    private void registrarRefrigeradora(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        System.out.print("INGRESE LA MARCA: ");
        String marca=scanner.nextLine();
        System.out.print("INGRESE EL MODELO: ");
        String modelo=scanner.nextLine();
        System.out.print("INGRESE EL COLOR: ");
        String color=scanner.nextLine();
        System.out.print("INGRESE EL PRECIO: ");
        String precio=scanner.nextLine();
        System.out.print("INGRESE EL PESO: ");
        String peso=scanner.nextLine();
        System.out.print("INGRESE EL CONSUMO: ");
        String consumo=scanner.nextLine();
        System.out.print("INGRESE EL TAMAÑO: ");
        String tamaño=scanner.nextLine();

        Refrigerador refrigerador=new Refrigerador(marca, modelo, color, precio, peso,consumo,tamaño);
        refrigeradores.add(refrigerador);
        System.out.println("Articulo registrado exitosamente.\n");
    }



    private void mostrarLaptops() {
        if (laptops.isEmpty()) {
            System.out.println("No hay articulos registrados.\n");
        } else {
            System.out.println("----- Lista de Laptos -----");
            for (Laptop laptop : laptops){
                laptop.mostrardetalles();
            }
            System.out.println();
        }
    }
    private void mostrarDesktops() {
        if (desktops.isEmpty()) {
            System.out.println("No hay articulos registrados.\n");
        } else {
            System.out.println("----- Lista de Computadoras de escritorio -----");
            for (Desktop desktop : desktops){
                desktop.mostrardetalles();
            }
            System.out.println();
        }
    }
    private void mostrarSmartphones() {
        if (smartphones.isEmpty()) {
            System.out.println("No hay articulos registrados.\n");
        } else {
            System.out.println("----- Lista de Smartphones -----");
            for (Smartphone smartphone : smartphones){
                smartphone.mostrardetalles();
            }
            System.out.println();
        }
    }
    private void mostrarTablets() {
        if (tablets.isEmpty()) {
            System.out.println("No hay articulos registrados.\n");
        } else {
            System.out.println("----- Lista de Tablets -----");
            for (Tablet tablet : tablets){
                tablet.mostrardetalles();
            }
            System.out.println();
        }
    }
    private void mostrarRefrigeradores() {
        if (refrigeradores.isEmpty()) {
            System.out.println("No hay articulos registrados.\n");
        } else {
            System.out.println("----- Lista de Refrigeradores -----");
            for (Refrigerador refrigerador : refrigeradores){
                refrigerador.mostrardetalles();
            }
            System.out.println();
        }
    }


}