import java.util.*;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        Arbol arbol = new Arbol();
        TreeSet<Alumno> treeset = new TreeSet<Alumno>();
        do {
            System.out.println(
                    "1. Agregar información de un alumnos\n2. Buscar a un alumno\n3. Visualizar lista de alumnos \n4. Dar de baja a un alumno\n5. Visualizar alumnos por calificacion\n6.Visualizar alumnos por matricula\n7. Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    arbol.ingresar(treeset);
                    break;
                case 2:
                    Alumno alumnoBuscar = datosDeAlumno();
                    System.out.println("Alumno encontrado en el sistema: " + arbol.buscarAlumno(treeset, alumnoBuscar));
                    break;
                case 3:
                    arbol.visualizarAlumnos(treeset);
                    break;
                case 4:
                    Alumno alumnoDarDeBaja = datosDeAlumno();
                    arbol.darDeBaja(treeset, alumnoDarDeBaja);
                    break;
                case 5:
                    System.out.println("Ingrese la calificacion: ");
                    int calificacion = entrada.nextInt();
                    arbol.verAlumnoCalificacion(treeset, calificacion);
                    break;
                case 6:
                    boolean validar = false;
                    int matricula;
                    do {
                        System.out.println("Ingrese los tres primeros digitos de la matricula: ");
                        matricula = entrada.nextInt();
                        validar = validar(matricula);
                    } while (validar != true);
                    matricula = matricula * 1000;
                    arbol.verAlumnoMatricula(treeset, matricula);
                    break;
            }
        } while (opc != 7);
    }

    public static Alumno datosDeAlumno() {
        int matricula;
        System.out.println("Matricula: ");
        matricula = entrada.nextInt();
        Alumno alumno = new Alumno(matricula, 0);
        return alumno;
    }

    public static boolean validar(int matricula) {
        boolean validar = true;
        if (matricula < 99 || matricula > 1000) {
            System.out.println("Ingrese los digitos que se solicitan");
            validar = false;
        }
        return validar;
    }
}

// 203462 - Bautista Ramírez Alfredo
// 203426 - Steven Padilla Gutierrez
