/*
 * Uriya Azani
 */
public class Main {
	
	public static void main(String[] args) throws IllegalArgumentException {
		
		Student[] studentsKeys = new Student[5];
		String[] phonesValues = new String[5];
		
		studentsKeys[0]= new Student("Uriya","Azani","000",1990);
		studentsKeys[1]= new Student("Shalom","Cohen","111",1991);
		studentsKeys[2]= new Student("Yael","Vered","222",1992);
		studentsKeys[3]= new Student("Tslil","Lahav","333",1993);
		studentsKeys[4]= new Student("Yotam","Milis","444",1994);
		
		phonesValues[0] = "0500000000";
		phonesValues[1] = "0511111111";
		phonesValues[2] = "0522222222";
		phonesValues[3] = "0533333333";
		phonesValues[4] = "0544444444";
		
		AssociationTable<Student, String> associationTable = new AssociationTable<Student, String>(studentsKeys,phonesValues);

		associationTable.remove(studentsKeys[2]);
		associationTable.add(new Student("Efrat","Dahan","555",1995), "0555555555");
		//Return null after remove
		System.out.println("studentsKeys[2] after remove is: " + associationTable.get(studentsKeys[2]) + "\n");
		//Change the phone number
		 associationTable.add(studentsKeys[0], "0505050505"); 
				
		
		for (Student student : associationTable.keyIterator()) {
		     System.out.println("Key: " + student.toString() + ". " +
		    		 			"\nValue: " + associationTable.get(student) + ".\n" );
		}
	}
}