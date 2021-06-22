import java.io.File;
import java.util.Set;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class TFG_Maria_Validacion {

	static final OWLOntologyManager man = OWLManager.createOWLOntologyManager();    
	static final OWLDataFactory df = man.getOWLDataFactory();
	static OWLClass c;
	
	
	public static void main (String[] args) throws OWLOntologyCreationException {
		
		String ns = "<http://www.semanticweb.org/tfg/Ontologia_TFG_Ciber#";
		
		OWLOntology o =  man.loadOntologyFromOntologyDocument(new File("C:/Users/admin/Desktop/TFG/Ciber.owl"));
		
		System.out.println("CLASES");
		o.getClassesInSignature().forEach(i -> {
			System.out.println(i);});
		
		System.out.println("OP");
		System.out.println(o.getObjectPropertiesInSignature());

		Set<OWLClass> allC = o.getClassesInSignature();
		allC.forEach(i -> {
			if (i.toString().equals(ns + "Risk>")) c = i;		
		});
		System.out.println("AX");
		Set<OWLClassAxiom> allAx = o.getGeneralClassAxioms();
		allAx.forEach(i -> {
			//System.out.println(i);
			if (i.containsEntityInSignature(c)) 
				System.out.println(i);
	
		});
	}

}
