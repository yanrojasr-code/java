public  class Main {
    public static  void  main(String[] args){

        Dispositivo dispositivo = new Dispositivo("computador", true);

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();
    }
}
