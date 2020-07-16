
package daniel.arregloestaticotarea1;

/**
 * @author ALMACHE DANIEL
 */
public class ArregloEstaticoTarea1 {

      public static void main(String[] args) {
          //declaro un array tipo String
       String[] arr;
       //inicializo  el pirmer elemento del array
        arr=new String[12];
       
       arr[0]="Enero";
       arr[1]="Febrero";
       arr[2]="Marzo";
       arr[3]="Abril";
       arr[4]="Mayo";
       arr[5]="Junio";
       arr[6]="Julio";
       arr[7]="Agosto";
       arr[8]="Septiembe";
       arr[9]="Octubre";
       arr[10]="Noviembre";
       arr[11]="Diciembre";
              for(int i=0; i< arr.length;i++)
              System.out.println("El mes"+i+": "+arr[i]);       
    }
 }
