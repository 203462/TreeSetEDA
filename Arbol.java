import java.util.*;

public class Arbol {
    static Scanner entrada = new Scanner(System.in);

    public void ingresar(TreeSet<Alumno> treeset) {
        int cant;
        int matricula;
        int calificacion;
        System.out.println("Cantidad de datos a ingresar");
        cant = entrada.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la matricula: ");
            matricula = entrada.nextInt();
            System.out.println("Ingrese la calificacion: ");
            calificacion = entrada.nextInt();
            Alumno alumno = new Alumno(matricula, calificacion);
            treeset.add(alumno);
        }
    }

    public void

    boolean validar

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

    public void darDeBaja(TreeSet<Alumno> treeset, Alumno alumno) {
        treeset.remove(alumno);
    }

    public void verAlumnoCalificacion(TreeSet<Alumno> treeset, int matricula) {
        System.out.println("Matricula Calificacion");
        matricula = matricula * 1000;
        int matriculaLimite = matricula + 1000;
        for (Iterator<Alumno> iterador = treeset.iterator(); iterador.hasNext();) {
            String datos[] = iterador.next().toString().split(" ");
            int matriculaAlumno = Integer.parseInt(datos[0]);
            if (matriculaAlumno >= matricula && matriculaAlumno < matriculaLimite) {
                System.out.println(datos[0] + " " + datos[1]);
            }
        }
    }

    public void verAlumnoMatricula(TreeSet<Alumno> treeset, int calificacionBuscar) {
        System.out.println("Matricula Calificacion");
        for (Iterator<Alumno> iterador = treeset.iterator(); iterador.hasNext();) {
            String datos[] = iterador.next().toString().split(" ");
            int calificacionAlumno = Integer.parseInt(datos[1]);
            if (calificacionAlumno <= calificacionBuscar) {
                System.out.println(datos[0] + " " + datos[1]);
            }
        }
        System.out.println();
    }
}
