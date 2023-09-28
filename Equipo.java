import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private static double sumaTiempos;
    private List<Ciclista> ciclistas;
    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        this.ciclistas = new ArrayList<>();
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getPaisEquipo() {
        return paisEquipo;
    }
    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }
    public static double getSumaTiempos() {
        return sumaTiempos;
    }
    public static void setSumaTiempos(double sumaTiempos) {
        Equipo.sumaTiempos = sumaTiempos;
    }
    protected void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista); // Add the provided cyclist to the list
    }
    protected void listarEquipo() {
        // Print team information
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País del equipo: " + paisEquipo);
        System.out.println("Integrantes del equipo:");

        // Print information about each cyclist in the team
        for (Ciclista ciclista : ciclistas) {
            System.out.println("Identificador: " + ciclista.getIdentificador());
            System.out.println("Nombre: " + ciclista.getNombre());
            System.out.println("Tipo: " + ciclista.imprimirTipo());
            System.out.println("Tiempo Acumulado: " + ciclista.getTiempoAcumulado());
            System.out.println();
        }
    }

    

    

}
