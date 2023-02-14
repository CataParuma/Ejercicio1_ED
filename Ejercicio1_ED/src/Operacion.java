import java.util.Scanner;

public class Operacion {

	Scanner sc = new Scanner(System.in);
	private Alumno[] alumno = new Alumno[10];

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

		alumno[0] = new Alumno("Cosi", "A", "09/07/2000");
		alumno[1] = new Alumno("Chema", "B", "07/11/1995");
		alumno[2] = new Alumno("Wen", "A", "09/07/2000");
		alumno[3] = new Alumno("Sammy", "B", "07/11/1995");
		alumno[4] = new Alumno("Ametos", "A", "09/07/2000");
		alumno[5] = new Alumno("Haru", "B", "07/11/1995");
		alumno[6] = new Alumno("Charlie", "C", "03/01/2008");
		alumno[7] = new Alumno("Jose", "C", "03/01/2008");
		alumno[8] = new Alumno("Caro", "c", "03/01/2008");
		alumno[9] = new Alumno("Coco", "D", "06/01/2008");
	}

	public void mostrarAlumno() {

		System.out.println("\n**Lista de alumnos ingresados**");

		for (int i = 0; i < alumno.length; i++) {

			System.out.println("Nombre: " + alumno[i].getNombre() + "\nPrograma academico: "
					+ alumno[i].getProgramaAcademico() + "\nFecha de Nacimiento: " + alumno[i].getFechaNacimiento());
		}
	}

	public void mostrarAlumnoIgualPrograma() {

		boolean[] marcador = new boolean[alumno.length]; //Marca los alumnos ya comparados
		String programa; //Guarda el programa a comparar
		int ultimo; //

		System.out.println("\n**Alumnos con programas academicos iguales**\n");

		for (int i = 0; i < alumno.length; i++) { //Selecciona el primer alumno

			if (marcador[i] == false) { //Verifica que el alumno en esa posicion no ha sido comparado

				ultimo = i;
				programa = alumno[i].getProgramaAcademico(); //Guarda el programa que se va a comparar
				marcador[i] = true; //Confirma que ese alumno ya fue comparado

				for (int j = i + 1; j < alumno.length; j++) { //Selecciona los demas alumnos para comparar

					if (programa.equalsIgnoreCase(alumno[j].getProgramaAcademico())) { //Compara el programa para buscar iguales

						if (ultimo == i)
							System.out.println("**" + programa + "**\n"); //Escribe el nombre del programa comparado

						System.out.println(alumno[ultimo].getNombre() + "\n"); //Escribe el nombre de los alumnos iguales
						marcador[j] = true; //Confirma que ese estudiante ya fue comparado con este programa

						ultimo = j;
					}
				}
				
				if (ultimo != i)
					System.out.println(alumno[ultimo].getNombre() + "\n");
			}
		}
	}

	public void mostrarAlumnoIgualFecha() {

		boolean[] marcador = new boolean[alumno.length];
		String fecha;
		int ultimo;

		System.out.println("\n**Alumnos con fechas de nacimiento iguales**\n");

		for (int i = 0; i < alumno.length; i++) {

			if (marcador[i] == false) {

				ultimo = i;
				fecha = alumno[i].getFechaNacimiento();
				marcador[i] = true;

				for (int j = i + 1; j < alumno.length; j++) {

					if (fecha.equalsIgnoreCase(alumno[j].getFechaNacimiento())) {

						if (ultimo == i)
							System.out.println("**" + fecha + "**\n");

						System.out.println(alumno[ultimo].getNombre() + "\n");
						marcador[j] = true;
						ultimo = j;
					}
				}

				if (ultimo != i)
					System.out.println(alumno[ultimo].getNombre() + "\n");
			}
		}
	}
}

