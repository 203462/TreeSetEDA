import java.util.*;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        Arbol arbol = new Arbol();
        TreeSet<Alumno> treeset = new TreeSet<Alumno>();
        do{
            System.out.println("1. Agregar información de un alumnos\n2. Buscar a un alumno\n3. Visualizar lista de alumnos \4. Dar de baja a un alumno\5. Visualizar alumnos por calificacion\6.Visualizar alumnos por matricula\n7. Salir");
            opc= entrada.nextInt();
            switch(opc){
                case 1:
                arbol.ingresar(treeset);
                break;
                case 2:
                Alumno alumnoBuscar = datosDeAlumno();
                System.out.println("Alumno encontrado en el sistema: " +arbol.buscarAlumno(treeset, alumnoBuscar));
                break;
                case 3:
                arbol.visualizarAlumnos(treeset);
                break;

                case 4:

                break;

                case 5:
            }
        }

    }

    public static Alumno datosDeAlumno() {
        int matricula;
        System.out.println("Matricula: ");
        matricula = entrada.nextInt();
        Alumno alumno = new Alumno(matricula, 0);
        return alumno;
    }

}
