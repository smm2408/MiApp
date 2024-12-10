package es.iesellago.main;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import es.iesellago.model.Persona;

public class DB4O_Main {

	public static void main(String[] args) {
		//Conectamos a la BBDD
		ObjectContainer bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), 
				"personas.db4o");
		Persona p1 = new Persona("María", "Apellido", 30, 'M');
//		bd.store(p1);
//		System.out.println("Se ha insertado un registro");
		//Consultas QBE
		System.out.println("Listado hombres");
		Persona ejemplo = new Persona(null, null, 0, 'H');
		ObjectSet resultados = bd.queryByExample(ejemplo);
		while (resultados.hasNext()) {
			System.out.println(resultados.next());
		}
		System.err.println("Mujeres");
		//Nueva consulta
		Persona ejemplo2 = new Persona(null, null, 0, 'M');
		ObjectSet resultados2 = bd.queryByExample(ejemplo2);
		while (resultados2.hasNext()) {
			System.out.println(resultados2.next());
		}
		System.out.println("Coincidan con el nombre");
		//Nueva consulta que coincidan con nombre
		Persona ejemplo3 = new Persona("Ana");
		ObjectSet resultados3 = bd.queryByExample(ejemplo3);
		while (resultados3.hasNext()) {
			System.out.println(resultados3.next());
		}		
		//Desconectamos de la BBDD
		bd.close();
	}

}
