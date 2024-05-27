import java.util.Arrays;
/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */

public class ArrayUtils
{
    
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null){
            throw new IllegalArgumentException("Arreglo nulo");
        }
        
        //TODO: Completar la implementación, reemplazando la línea siguiente
        for(int i = 0 ; i < arreglo.length; i++){
            if (elem == arreglo[i]){
                return true;
            }
        }   
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int sum = 0;
        for (int i = 0; i < arreglo.length; i++){
            sum = sum + arreglo[i];
        }
        return sum;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        assert(arreglo != null):"el arreglo esta vacio"; //precondición
        float min = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            if(min >= arreglo[i]){
                min = arreglo[i];
            }
        }
        return min;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        assert(arreglo != null):"el arreglo esta vacio"; //precondición
        float max = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            if(max <= arreglo[i]){
                max = arreglo[i];
            }
        }
        return max;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        assert(arreglo != null):"el arreglo se encuentra vacio"; // precondición
        float promedio = 0;
        for(int i = 0; i < arreglo.length; i++){
            promedio = arreglo[i] + promedio;
        }
        return promedio / arreglo.length;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        assert (n >= 0):"debe ser un numero positivo";
      
        if (n == 0){
            int[] ret = {0};
            return ret;
        }
        int[] arre = new int [n];
        arre[0] = 0;
        arre[1] = 1;
        for (int i = 2; i < arre.length; i++){
            arre[i] = arre[i-1] + arre[i-2];
        }
        return arre;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        Arrays.sort(arreglo);
        float mediana;
        int mitad = arreglo.length/2;
        
        if(arreglo.length % 2 == 0){
            mediana = (arreglo[mitad - 1] + arreglo[mitad])/2;
        }else{
            mediana = arreglo[mitad];
        }
        return mediana;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if(Arrays.equals(arr1, arr2)){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length; j++){
                if(i != j && (arreglo[i] == arreglo[j])){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length; j++){
                if((arreglo[i] + arreglo[j] == 0) && (arreglo[i] != arreglo[j])){
                    return true;
                }
            }
        }
        return false;
    }
    
}