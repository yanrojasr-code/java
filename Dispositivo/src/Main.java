public  class Main {
    public static  void  main(String[] args){

        Dispositivo dispositivo = new Dispositivo("computador", true);

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();

        Proyector proyector = new Proyector("Proyector sala 201", true);
        Computador computador = new Computador(" PC Laboratorio", true);
        Impresora impresora = new Impresora("impresora biblioteca", false);

        proyector.mostrarEstado();
        computador.mostrarEstado();
        impresora.mostrarEstado();

        proyector.ejecutarDiagnostico();
        computador.ejecutarDiagnostico();
        impresora.ejecutarDiagnostico();

        Dispositivo dispositivo1 = new Proyector("pryector sala 201", true);
        Dispositivo dispositivo2 = new Computador("PC Laboratorio", true);
        Dispositivo dispositivo3 = new Impresora("Impresora Biblioteca", true);

        dispositivo1.ejecutarDiagnostico();
        dispositivo2.ejecutarDiagnostico();
        dispositivo3.ejecutarDiagnostico();

        dispositivo1.mostrarEstado();
        dispositivo2.mostrarEstado();
        dispositivo3.mostrarEstado();
    }
}
