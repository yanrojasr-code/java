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

        dron.volar();
        tecnica1.reparar();
        dron.AtenderEmergencia();
        tecnica1.AtenderEmergencia();


           EquipoEmergencia equipo1 = new BrigadaMedica("Brigada Médica");
           EquipoEmergencia equipo2 = new BrigadaTecnica("Brigada Técnica");
           EquipoEmergencia equipo3 = new DronRescate("Dron de Rescate");

           equipo1.AtenderEmergencia();
           equipo2.AtenderEmergencia();
           equipo3.AtenderEmergencia();

           REPARADOR reparador = new BrigadaTecnica("Equipo Técnico");
           reparador.reparar();

           VOLADOR volador = new DronRescate("Dron aereo");
           volador.volar();
       }


       }
}
