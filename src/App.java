class App{
    public static void main(String[] args) {
        Libro libro1 = new Libro();
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

        System.out.println();
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


    }
}
