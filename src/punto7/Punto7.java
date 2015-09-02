
package punto7;
import java.util.Scanner;
public class Punto7 {
    public static void main(String[] args) {
        Scanner entradaEs = new Scanner(System.in);
        int num, a, s, c;
        double cont1 =0, cont2 =0, cont3=0, p;
        System.out.println("Programa para hacer estadísticas de tránsito.");
        System.out.println("Por favor ingrese el número de personal a las que se les va a realizar el muestreo:");
        num = entradaEs.nextInt();
        for (int i=0 ; i<num; i++){
            System.out.println("Por favor ingrese el año de nacimiento:");
            a = entradaEs.nextInt();
            if (a <=1990 ) {
                cont1=cont1+1;
            }
            else{}
            System.out.println("Por favor ingrese el sexo 1.Mujer 2.Hombre:");
            s = entradaEs.nextInt(); 
            if (s==1){cont2=cont2+1;}
            else{}
            System.out.println("Por favor ingrese la ciudad, 1.Medellín 2.Otra Ciudad:");
            c = entradaEs.nextInt();
            if (c==2){cont3=cont3+1;}
            else{}               
        }
        p=(cont1/num)*100;
        System.out.println("El porcentaje de conductores menores de 25 años es:"+p+"%");
        p=(cont2/num)*100;
        System.out.println("El porcentaje de conductores mujeres es:"+p+"%");
        p=(cont3/num)*100;
        System.out.println("El porcentaje de conductores de otras ciudades es:"+p+"%");
    }   
}
