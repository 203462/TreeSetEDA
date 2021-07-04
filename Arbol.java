import java.util.*;

public class Arbol {
    static Scanner entrada = new Scanner(System.in);

    public void ingresar(TreeSet<Alumno> treeset) {
        int cant;
        int matricula;
        int calificacion;
        boolean validar = false;
        do {
            System.out.println("Cantidad de datos a ingresar");
            cant = entrada.nextInt();
            if (cant <= 0) {
                System.out.println("Ingrese una cantidad mayor o igual a 1");
            } else {
                for (int i = 0; i < cant; i++) {
                    do {
                        System.out.println("Ingrese la matricula: ");
                        matricula = entrada.nextInt();
                        validar = validarMatricula(matricula);
                        if (validar == true) {
                            System.out.println("Ingresa la calificacion: ");
                            calificacion = entrada.nextInt();
                            Alumno alumno = new Alumno(matricula, calificacion);
                            treeset.add(alumno);
                        }
                    } while (validar == false);
                }
            }
        } while (cant <= 0);
    }

    public boolean validarMatricula(int matricula) {
        boolean validar = true;
        if (matricula < 200000 || matricula > 300000) {
            System.out.println("Matricula no válida");
            validar = false;
        }
        return validar;
    }

    public boolean buscarAlumno(TreeSet<Alumno> treeset, Alumno alumnoBuscar) {
        boolean validador;
        validador = treeset.contains(alumnoBuscar);
        return validador;
    }

    public void visualizarAlumnos(TreeSet<Alumno> treeset) {
        System.out.println("Matricula | Calificacion");
        for (Iterator<Alumno> iterador = treeset.iterator(); iterador.hasNext();) {
            System.out.println(iterador.next());
        }
    }

    public void darDeBaja(TreeSet<Alumno> treeset, Alumno alumno) {
        treeset.remove(alumno);
    }

    public void verAlumnoCalificacion(TreeSet<Alumno> treeset, int calificacionBuscar) {
        System.out.println("Matricula | Calificacion");
        for (Iterator<Alumno> iterador = treeset.iterator(); iterador.hasNext();) {
            String datosAlumno[] = iterador.next().toString().split(" ");
            int calificacionAlumno = Integer.parseInt(datosAlumno[1]);
            if (calificacionAlumno <= calificacionBuscar) {
                System.out.println(datosAlumno[0] + "\t\t" + datosAlumno[1]);
            }
        }
        System.out.println();
    }

    public void verAlumnoMatricula(TreeSet<Alumno> treeset, int matricula) {
        System.out.println("Matricula | Calificacion");
        for (Iterator<Alumno> iterador = treeset.iterator(); iterador.hasNext();) {
            String datosAlumno[] = iterador.next().toString().split(" ");
            int matriculaAlumno = Integer.parseInt(datosAlumno[0]);
            if (matriculaAlumno >= matricula) {
                System.out.println(datosAlumno[0] + "\t\t" + datosAlumno[1]);
            }
        }
    }
}
