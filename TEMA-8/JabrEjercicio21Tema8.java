import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio21Tema8 {
    public static void main(String args []){
        System.out.print("Introduce el tamaño del array:  ");
        int tamaño = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce minimo valor en el array: ");
        int minimo  = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce maximo valor en el array: ");
        int maximo  = Integer.parseInt(System.console().readLine()) ;

        int []array = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);
        JabrFuncionesArrays.muestraArray(array);
        System.out.print("El valor minimo del array es: "+ JabrFuncionesArrays.minimoArrayInt(array));
    }
}
