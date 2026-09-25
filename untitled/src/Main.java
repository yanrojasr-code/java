public  class Main {
       public static  void main (String[] args){
        BrigadaMedica medica = new BrigadaMedica("brigrada medica");
        BrigadaTecnica tecnica = new BrigadaTecnica("Brigrada tecnica");
        DronRescate dronRescate = new DronRescate("Don de rescate");


        medica.mostrarNombre();
        medica.AtenderEmergencia();

        tecnica.mostrarNombre();
        tecnica.AtenderEmergencia();

        dronRescate.mostrarNombre();
        dronRescate.AtenderEmergencia();

        DronRescate dron = new DronRescate("dron rescatado");
        BrigadaTecnica tecnica1 = new BrigadaTecnica("brrigada tecnica");

        dron.AtenderEmergencia();
        tecnica1.AtenderEmergencia();
    }
}
