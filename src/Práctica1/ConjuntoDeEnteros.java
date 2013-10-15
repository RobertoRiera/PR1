package Práctica1;

public class ConjuntoDeEnteros {

    private int[] vector;
    private int size;

    public ConjuntoDeEnteros() {
        vector = new int[10];
        size = 0;
    }

    public ConjuntoDeEnteros(int[] vector) {
        int[] vector1 = new int[10];
        size = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector1.length; j++) {
                if (vector[i])
                vector1[i]=;
            }
        }
    }

    public int cardinal() {
        return size;
    }

    public boolean estáVacío() {
        return size == 0;
    }

    public boolean pertenece(int valor) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public boolean añade(int valor) {
        if (pertenece(valor) || size == 10) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            vector[size + 1] = valor;
        }
        return true;
    }

    public ConjuntoDeEnteros unión(ConjuntoDeEnteros conjParam) {
        ConjuntoDeEnteros nuevoConj = new ConjuntoDeEnteros();
        for (int i = 0; i < vector.length; i++) {
            nuevoConj.añade(vector[i]);
            nuevoConj.añade(conjParam.vector[i]);
        }
        return nuevoConj;
    }

    public ConjuntoDeEnteros intersección(ConjuntoDeEnteros conjParam) {
        ConjuntoDeEnteros nuevoConj = new ConjuntoDeEnteros();
        for (int i = 0; i < conjParam.size; i++) {
            for (int j = 0; j < size; j++) {
                if (conjParam.vector[i] == vector[j]) {
                    nuevoConj.añade(vector[j]);
                }
            }
        }
        return nuevoConj;
    }
    public ConjuntoDeEnteros diferencia (ConjuntoDeEnteros conjParam){
        ConjuntoDeEnteros nuevoConj = new ConjuntoDeEnteros();
        for (int i = 0; i < size; i++) {
            if (pertenece(vector[i])==false) {
            nuevoConj.añade(vector[i]);
            }
        }
        return nuevoConj;
    }
    
    public boolean equals(ConjuntoDeEnteros conjParam){
        for (int i = 0; i < vector.length; i++) {
            if (pertenece(vector[i])==false){
                return false;
            }
        }
        return true;
    }
    public boolean contenido (ConjuntoDeEnteros conjParam){
        for (int i = 0; i < conjParam.vector.length; i++) {
            if (pertenece(conjParam.vector[i])== false){
                return false;
            }
        }
            return true;
    }
    public int[] elementos (){
        int[] nuevoConj = new int[size];
        for (int i = 0; i < size; i++) {
            nuevoConj[i]=vector[i];
        }
        return nuevoConj;
    }
}