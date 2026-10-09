class App{
    public static void main(String[] args) {
        /*Libro libro1 = new Libro();
        libro1.setTitulo("Cien años de soledad.");
        libro1.setAutor("Marquez");
        libro1.mostrarInfo();
        libro1.prestar();
        libro1.devolver();

        System.out.println("\n");
        Libro libro2 = new Libro();
        libro2.setAutor("Jader");
        libro2.setTitulo("La odisea");
        libro2.mostrarInfo();
        libro2.prestar();
        libro2.devolver();
*/

        System.out.println("-----------Constructores-----------");
        Libro libro1 = new Libro();
        System.out.println("--- Libro 1 ---");
        libro1.mostrarInfo();

        Libro libro2 = new Libro("El camino del agua", "Mateo");
        System.out.println("--- Libro 2 ---");
        libro2.mostrarInfo();

        Libro libro3 = new Libro("El camino del agua", "Mateo", false);
        System.out.println("--- Libro 3 ---");
        libro3.mostrarInfo();

    
       /*  System.out.println();
        Vuelo vuelo1 = new Vuelo();
        vuelo1.setNumero("AV9401");
        vuelo1.setOrigen("Bogota");
        vuelo1.setDestino("Cartagena");
        vuelo1.setCapacidadMaxima(200);
        vuelo1.setOcupacion(152);
        vuelo1.mostrarInfo();
        vuelo1.embarcar(57);
        vuelo1.desembarcar(152);

        System.out.println();
        Vuelo vuelo2 = new Vuelo();
        vuelo2.setNumero("AV9402");
        vuelo2.setOrigen("Bogota");
        vuelo2.setDestino("Medellin");
        vuelo2.setCapacidadMaxima(200);
        vuelo2.setOcupacion(152);
        vuelo2.mostrarInfo();
        vuelo2.embarcar(21);
        vuelo2.desembarcar(42);
        */
        Vuelo Vuelo1 = new Vuelo();
        System.out.println("--- Vuelo 1 ---");
        Vuelo1.mostrarInfo();

        Vuelo Vuelo2 = new Vuelo("A322", "Bogota", "Cartagena", 233);
        System.out.println("--- vuelo 2 ---");
        Vuelo2.mostrarInfo();

        Vuelo Vuelo3 = new Vuelo("A322", "Bogota", "Cartagena", 233, 500);
        System.out.println("--- vuelo 3 ---");
        Vuelo3.mostrarInfo();
        Vuelo3.embarcar(22);
        Vuelo3.desembarcar(53);

       /*  System.out.println("\nTanque principal: ");
        DepositoDeAgua tanquePrincipal = new DepositoDeAgua();
        DepositoDeAgua tanqueSecundario = new DepositoDeAgua();

        tanquePrincipal.setDepositoDesborde(tanqueSecundario);
        tanquePrincipal.setCapacidad(120.5);
        tanquePrincipal.setVolumenActual(56.21);
        tanquePrincipal.mostrarEstado();

        tanqueSecundario.setCapacidad(89.6);
        tanqueSecundario.setVolumenActual(2.1);

        System.out.println("\nTanque principal:");
        tanquePrincipal.agregarAgua(94.55);
        tanquePrincipal.mostrarEstado();

        System.out.println("\nTanque secundario:");
        
        tanqueSecundario.mostrarEstado();

        System.out.println("\nTanque Principal:");

        tanquePrincipal.quitarAgua(12.9);
        tanquePrincipal.mostrarEstado();
        */
    }
        
}
