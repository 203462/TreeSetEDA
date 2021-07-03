import java.util.*;

public class Arbol {
    static Scanner entrada = new Scanner(System.in);

    public void ingresar(TreeSet<Alumno> ts) {

    }

    public boolean buscarAlumno(TreeSet<Alumno> treeset, Alumno alumnoBuscar) {
        boolean validador;
        validador = treeset.contains(alumnoBuscar);
        return validador;
    }

    public void visualizarAlumnos(TreeSet<Alumno> treeset) {
        System.out.println("Matricula - Calificacion");
        for (Iterator<Alumno> iterador = treeset.iterator(); iterador.hasNext();) {
            System.out.println(iterador.next());
        }
    }
}
