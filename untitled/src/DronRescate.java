public class  DronRescate extends EquipoEmergencia {


    public DronRescate(String nombre ) {
        super(nombre);

    }

    @Override
    public void AtenderEmergencia() {
        System.out.println("inspenccionando zona de emergencia");
    }
}
