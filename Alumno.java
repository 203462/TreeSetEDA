public class Alumno implements Comparable<Alumno> {
    private int matricula;
    private int calificacion;

    public Alumno(int matricula, int calificacion) {
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {

        return matricula + " " + calificacion;
    }

    @Override
    public int compareTo(Alumno a) {
        if (this.matricula == a.matricula) {
            return 0;
        } else {
            if (this.matricula > a.matricula) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
