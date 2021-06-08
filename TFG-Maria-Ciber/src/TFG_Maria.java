

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.topbraid.spin.util.JenaUtil;

public class TFG_Maria {

	public static JSONObject loadJSON(String path) throws IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		System.out.println("Loading ...\n");
		FileReader reader = new FileReader(path);
		Object obj = jsonParser.parse(reader);
		JSONObject dataList = (JSONObject) obj;
		reader.close();
		return dataList;
	}

	public static void save(OntModel ontModel) throws FileNotFoundException {
		try {
			// TODO - Ruta a fichero de ontologia
			FileOutputStream oFile = new FileOutputStream("C:/Users/admin/Desktop/TFG/Ciber.owl", false);
			ontModel.write(oFile);
		} catch (Error e) { System.out.println(e);}

	}

	public static void main(String[] args) throws IOException, ParseException {

		// Crear modelo vacio
		Model baseModel = ModelFactory.createDefaultModel();
		String base_uri = "http://www.semanticweb.org/tfg/Ontologia_TFG_Ciber#";
		OntModel ontModel = JenaUtil.createOntologyModel(OntModelSpec.OWL_MEM,baseModel);


		// Propiedad has para relacionar los "sujetos" y los complementos
		ObjectProperty has = ontModel.createObjectProperty(base_uri + "has");

		// TODO - Ruta a JSON
		JSONObject data = loadJSON("C:\\Users\\admin\\Desktop\\TFG\\data.json");
		System.out.println(data);
		Set<?> keys = data.keySet();
		System.out.println(keys);
		for(Object i: keys) {
			System.out.println(i);
			System.out.println(data.get(i));
			
			OntClass c = ontModel.createClass(base_uri + i);
			System.out.println(c);
			
			JSONArray dataArray = (JSONArray) data.get(i);
			System.out.println(dataArray);
			
			for (int i3 = 0; i3 < dataArray.size(); i3++) {
				System.out.println(dataArray.get(i3));
				JSONObject data2 = (JSONObject) dataArray.get(i3);
				System.out.println(data2);
			
				
				Set<?> keys2 = data2.keySet();
				for(Object i2: keys2) {
					System.out.println(i2);	
					// Clase para agrupar
					OntClass ing = 	ontModel.createClass(base_uri + i2);
					JSONArray clases = (JSONArray) data2.get(i2);
					System.out.println(clases);
		
					// Crea las keys del JSON como clases
					OntClass c2 = ontModel.createClass(base_uri + i2);
					System.out.println(c2);
					c.addSubClass(ontModel.createSomeValuesFromRestriction(null, has, c2 ));
					// Crea clase 
					for (Object a: clases) {
						
						// Incluye todos los elementos de los arrays 
						OntClass c_aux = ontModel.createClass(base_uri + a);
						ing.addSubClass(c_aux);
						System.out.println(c_aux);
						
						// Crea las relaciones como restricciones
						c.addSubClass(ontModel.createSomeValuesFromRestriction(null, has, c_aux ));
						
						
					}
					
			
				}
			}
		

		// Se guarda
		save(ontModel);
		System.out.println("ACABADO ...\n");


	}
}
}
