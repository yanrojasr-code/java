public class DronRescate extends  EquipoEmergencia{
    public DronRescate(String nombre, String nombre1) {
        super(nombre);
        this.nombre = nombre1;

    }

    @java.lang.Override
    public void atenderEmergencia() {
        System.out.println("Inspeccionando zona de emergencia...");


    }
}
