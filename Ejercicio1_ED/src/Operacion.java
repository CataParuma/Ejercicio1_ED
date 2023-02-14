import java.util.Scanner;

public class Operacion {

	Scanner sc = new Scanner(System.in);
	private Alumno[] alumno = new Alumno[6];

	public void crearAlumno() {

		// for (int i = 0; i < alumno.length; i++) {

		// System.out.println("Ingrese los datos del estudiante #"+(i+1));
		// System.out.println("Nombre:");
		// String nombre = sc.next();

		// System.out.println("Programa academico:");
		// String programaAcademico = sc.next();

		// System.out.println("Fecha de nacimiento:");
		// String fechaNacimiento = sc.next();

		// alumno[i] = new Alumno(nombre, programaAcademico, fechaNacimiento);
		// }

		alumno[0] = new Alumno("Alejandro", "Sistemas", "10/09/2000");
		alumno[1] = new Alumno("Samuel", "Biologia", "28/01/2000");
		alumno[2] = new Alumno("Catalina", "Sistemas", "11/07/2000");
		alumno[3] = new Alumno("Oscar", "Biologia", "10/09/2000");
		alumno[4] = new Alumno("Angela", "Biologia", "28/01/2000");
		alumno[5] = new Alumno("Sebastian", "Sistemas", "11/07/2000");

	}

	public void mostrarAlumno() {

		System.out.println("\n**Lista de alumnos ingresados**");

		for (int i = 0; i < alumno.length; i++) {

			System.out.println("Nombre: " + alumno[i].getNombre() + "\nPrograma academico: "
					+ alumno[i].getProgramaAcademico() + "\nFecha de Nacimiento: " + alumno[i].getFechaNacimiento());
		}
	}

	public void mostrarAlumnoIgualPrograma() {

		boolean[] marcador = new boolean[alumno.length];
		String programa; 
		int posicion; 

		System.out.println("\n**Alumnos con programas academicos iguales**\n");

		for (int i = 0; i < alumno.length; i++) { //Selecciona el primer alumno

			if (marcador[i] == false) { //Verifica que el alumno en esa posicion no ha sido comparado

				posicion = i;
				programa = alumno[i].getProgramaAcademico(); //Guarda el programa que se va a comparar
				marcador[i] = true; //Confirma que ese alumno ya fue comparado

				for (int j = i + 1; j < alumno.length; j++) { //Selecciona los demas alumnos para comparar

					if (programa.equalsIgnoreCase(alumno[j].getProgramaAcademico())) { //Compara el programa para buscar iguales

						if (posicion == i)
							System.out.println("**" + programa + "**\n"); //Escribe el nombre del programa comparado

						System.out.println(alumno[posicion].getNombre() + "\n"); //Escribe el nombre de los alumnos iguales
						marcador[j] = true; //Confirma que ese estudiante ya fue comparado con este programa

						posicion = j;
					}
				}
				
				//Este if permite solo imprimir los que tengan dos o mas repetidos
				if (posicion != i)
					System.out.println(alumno[posicion].getNombre() + "\n");
			}
		}
	}

	public void mostrarAlumnoIgualFecha() {

		boolean[] marcador = new boolean[alumno.length];
		String fecha;
		int posicion;

		System.out.println("\n**Alumnos con fechas de nacimiento iguales**\n");

		for (int i = 0; i < alumno.length; i++) {

			if (marcador[i] == false) {

				posicion = i;
				fecha = alumno[i].getFechaNacimiento();
				marcador[i] = true;

				for (int j = i + 1; j < alumno.length; j++) {

					if (fecha.equalsIgnoreCase(alumno[j].getFechaNacimiento())) {

						if (posicion == i)
							System.out.println("**" + fecha + "**\n");

						System.out.println(alumno[posicion].getNombre() + "\n");
						marcador[j] = true;
						posicion = j;
					}
				}

				if (posicion != i)
					System.out.println(alumno[posicion].getNombre() + "\n");
			}
		}
	}
}

