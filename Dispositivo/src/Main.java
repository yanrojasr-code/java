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
    }
}
