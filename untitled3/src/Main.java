public class Main {
    public static void main(String[] args) {
             BrigadaMedica medico =    new BrigadaMedica("primer medico");
             BrigadaTecnica tecnica = new BrigadaTecnica("Tens");
             DronRescate    dron =     new DronRescate("drones");

         medico.mostrarNombre();
         medico.atenderEmergencia();

         tecnica.mostrarNombre();
         tecnica.atenderEmergencia();

         dron.mostrarNombre();
         dron.atenderEmergencia();
}
}
