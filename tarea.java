import java.util.Scanner;

public class tarea {
  public static void main(String[] args) {
    int productos;
String productobuscado;
boolean encontrado = false;


System.out.println("ingrese la cantidad de producto");

Scanner entrada = new Scanner (System.in);

productos = entrada.nextInt(); 
entrada.nextLine();//limpiar el buffer

String [] inventario = new String[productos];

//llenar el inventario

for(int i=0; i<productos;i++){

System.out.println("ingrese el nombre del producto numero: "+(i+1)+":");
inventario[i]= entrada.nextLine();
}

System.out.println("ingrese el producto a buscar");
productobuscado= entrada.nextLine();

//busqueda lineal
for (String producto : inventario){
System.out.println("el producto esta disponible en el inventario");
encontrado = true;
break;


}



if (!encontrado) {
    System.out.println("el producto no esta disponible en el inventario");
}











  }
    
}