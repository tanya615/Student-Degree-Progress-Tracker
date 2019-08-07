//package FinalProject;
public class Node 
	{

		int ID;
		String Course;
		String Name;
		String Description;
		int Units;
		String Prerequisites;
		boolean Mo;
		boolean Tu;
		boolean We;
		boolean Th;
		boolean Fr;
		int Start;
		int End ;

		Node leftChild;
		Node rightChild;

		Node(int ID, String Course,String Name, String Description, int Units, String Prerequisites, boolean Mo, boolean Tu, boolean We, boolean Th, boolean Fr, int Start, int End) 
			{

				 this.ID =ID;
				 this.Units = Units;
				 this.Name = Name; 
				 this.Course = Course; 
				 this.Description = Description; 
				 this.Prerequisites = Prerequisites;
				 this.Mo = Mo;
				 this.Tu = Tu;
				 this.We = We;
				 this.Th = Th;
				 this.Fr = Fr;
				 this.Start = Start;
				 this.End = End;

			}//END Node()

		public String toString() 
			{

				return ("\n\nID: \t" + ID + "\nCourse: \t"  + Course + "\nName: \t" + Name + "\nDescription: \t" + Description + "\nUnit Count: \t" + Units + "\nPrerequisites: \t" + Prerequisites);

				/*
				 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
				 * "\nRight Child: " + rightChild + "\n";
				 */

			}//END toString

	}//END Node