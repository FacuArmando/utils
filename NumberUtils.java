
/**
 * Clase NumberUtils: contiene implementaciones de rutinas fundamentales
 * sobre números.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
import java.util.ArrayList;

public class NumberUtils
{
    
    /**
     * Comprueba si un número es primo.
     */
    public boolean esPrimo(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int contador = 0;
        for(int i = 1; i < n+1; i++){
            if(n % i == 0){
                contador++;
            }
        }
        
        if(contador == 2){
            return true;
        }
        return false;
    }
    
    /**
     * Comprueba si un número es compuesto.
     */
    public boolean esCompuesto(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        for(int contador = 2; contador < n; contador++){
            if(n % contador == 0){
                return true;
            }
        }
        return false;
    }

    /**
     * Calcula el máximo común divisor de dos números.
     */
    public int maximoComunDivisor(int n, int m) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int aux = 0;
        while(m != 0){
            aux = m;
            m = n % aux;
            n = aux;
        }
        return n;
    }

    /**
     * Calcula el mínimo común múltiplo de dos números.
     */
    public int minimoComunMultiplo(int n, int m) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return n*m/maximoComunDivisor(n, m);
    }
    
    /**
     * Calcula los divisores de un número positivo.
     */
    public ArrayList<Integer> divisores(int n) { 
        //TODO: Completar la implementación, reemplazando la línea siguiente    
       ArrayList numDiv = new ArrayList<Integer> ();
        
       int residuo = 0;
       int cont = 0;
        
        for(int i=1; i<=n; i++){
            residuo = n%i;
            if(residuo==0){
                residuo = residuo/i;
                numDiv.add(i);
            }else{
                cont++;
            }
        }
       return numDiv;
    }
    
    /**
     * Calcula los primeros n números primos
     */
    public int[] primos(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int[] nroPrimo = new int [n];
        int pos = 0;
        int div;
        
        for(int i=0; pos < n; i++){
            div = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    div++;
                }
            }
            
            if(div==2){
                nroPrimo[pos]=i;
                pos++;
            }
        }
        
        for(int i = 0; i < nroPrimo.length; i++){
            System.out.println("" + nroPrimo[i]);
        }
        
        return nroPrimo;
    }
    
    /**
     * Calcula el n-ésimo número de Fibonacci
     */
    public int nthFib(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente 
        int res;
        if(n==0){
            res = 0;
        }else{
            if(n==1){
                res = 1;
            }else{
                res = nthFib(n-1) + nthFib(n-2);
            }
        }
        
        return res;
    }
    
    /**
     * Calcula los dígitos de un número entero positivo.
     */
    public ArrayList<Integer> digitos(int n) {
       //TODO: Completar la implementación, reemplazando la línea siguiente
       ArrayList digitos = new ArrayList<Integer> (); 
       int cont = 0;
      
       while(n>=1){
           cont++;
           n = n/10;
       }
       digitos.add(cont);
       
       return digitos;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
}
