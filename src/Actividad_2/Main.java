package Actividad_2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);

String nom, ape, eda, hob, edi, sis;

System.out.println(" Ingrese su nombre: ");

nom = teclado.nextLine();

System.out.println("Ingrese su apellido: ");

ape = teclado.nextLine();

System.out.println("�Cu�ntos a�os tiene usted? ");

eda = teclado.nextLine();

System.out.println("�Tiene alg�n hobby, o hobbies? ingreselos aqu�: ");

hob = teclado.nextLine();

System.out.println("�Cual es su editor de c�digo favorito? ");

edi = teclado.nextLine();

System.out.println("Ingrese su sistema operativo: ");

sis = teclado.nextLine();

System.out.println("Nombre del usuario: " + " " + nom );

System.out.println("Apellido: " + " " + ape );

System.out.println("Edad: " + " " + eda );

System.out.println("Hobby, o hobbies del usuario: " + " " + hob );

System.out.println("Editor de c�digo favorito: " + " " + edi );

System.out.println("Sistema operativo: " + " " + sis );


	}

}
