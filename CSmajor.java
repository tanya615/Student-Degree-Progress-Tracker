/*
This version searches via class name as a string vs int 

i.e. CS 401 and not 401


*/



import java.util.Scanner;
import java.lang.NullPointerException;

public class CSmajor 
	{

		Node root;
		Node ERROR = new Node(0,"NOT FOUND","NOT FOUND","NOT FOUND",0,"NOT FOUND",false,false,false,false,false,0,0);
		
		CSmajor()
			{			
				addNode(100,"CS 100","Programming for Everyone","An introduction to computer programming for non majors. Topics include interdisciplinary computing applicationscomputer systems algorithm design and programming language control structures.Programming projects in thePython programming language.",3,"NONE",true,false,true,false,false,800,915);
				addNode(101,"CS 101","Computer Science I","An introduction to computer programming for computer science majors. Topics include problem solving algorithms basic control structures and program design. Programming projects in Python or other high level programming language.Lecture Units: 3; Lab Units: 1",4,"Mathematics/QR Placement Category I or II or successful completion of GE area B4.",true,false,true,false,false,930,1045);
				addNode(180,"CS 180","Computers in Action","Introduction to computer applications and the role of computer technology in society.Introduction to word processing spreadsheet applications presentation software basic database management and website development.",3,"NONE",true,false,true,false,false,1830,1945);
				addNode(200,"CS 200","Advanced Programming for Everyone","Further development of programming and problem solving skills debugging techniques and testing. Topics include elementary data structures object oriented design and searching sorting and graph algorithms. Programming projects in the Python programming language.",3,"CS 100",false,true,false,true,false,1315,1430);
				addNode(201,"CS 201","Computer Science II","Further development of programming and problem solving skills in the C++ programming language. Topics include Abstract Data Types (ADTs) data structures (stacks queues trees) and object oriented design. Sorting and searching algorithms.Lecture Units: 3; Lab Units: 1",4,"CS 101 with grade C- or better",true,false,true,false,false,1100,1215);
				addNode(211,"CS 211","Discrete Structures","Propositional logic and predicate calculus set theory inference induction recursion divide-and-conquer enumeration graphs and topology trees binary trees and traversals Boolean algebra logic gates  asymptotic notation and algorithm analysis combinatorics cryptography discrete probability computational modeling.",3,"MATH 130 with grade C- or better.",true,false,true,false,false,1700,1815);
				addNode(221,"CS 221","Computer Organization and Assembly Language","A study of the functional organization of digital computers. Fundamental principles of control and datapath units program counter ALU multiplexers registers and memory. Digital logic gates and Boolean functions. Introduction to assemblers linkers and loaders. Programming with assembly language.",3,"CS 100 or CS 101 both with grade C- or better.",false,true,false,true,false,1445,1600);
				addNode(230,"CS 230","Computing and Social Responsibility","Social impact and ethical aspects of computing information privacy security social networking software piracy system reliability human-computer interaction net neutrality workforce displacement the Digital Divide societal dependence on computing the Internet as a democratic instrument of social change and cyberethics.",3,"NONE",true,false,false,false,false,930,1045);
				addNode(250,"CS 250","Introduction to Web Programming","Technology and design of web systems and services for non majors. Human factors issues computer-human interfaces design web system design development and testing.  Website development using multimedia graphics image and animation tools. Topics include e-commerce solutions and networking fundamentals.",3,"NONE",false,false,false,false,false,0,0);
				addNode(300,"CS 300","Discovering Computer Science","Introduction to computer science. Computational problem solving as a vehicle for scientific inquiry across disciplinary boundaries computer hardware and software fundamental principles in computer science including abstraction efficiency and algorithmic design programming in Closure Python or other high-level programming languages. ",3,"Completion of GE area B4.",false,false,false,false,false,0,0);
				addNode(301,"CS 301","Data Structures and Algorithms","Design and implementation of abstract data structures including stacks queues doubly-linked  and circularly-linked lists binary search trees heaps priority queues and graphs; algorithmic analysis and asymptotic notation; binary search heapsort merge sort quicksort and radix sort. Discussion Units: 3; Lab Units: 1",4,"CS 201 and CS 211. ",true,false,true,false,false,930,1045); 
				addNode(311,"CS 311","Programming Language Concepts","Survey and comparison of a variety of computer languages and their use in particular domains. Topics include formal descriptions of syntax and semantics control structures data representation design and implementation of imperative and functional languages.  Programming projects in several languages.",3,"CS 201 and CS 221.",true,false,true,false,false,1100,1215); 
				addNode(321,"CS 321","Computer Architecture","Logical design of digital computers. Boolean algebra combinational and sequential circuits computer arithmetic memories integrated circuits control processors input/output.",3,"CS 211 and CS 221 both with grade C- or better",false,true,false,true,false,1315,1430);
				addNode(350,"CS 350"," Databases for Social and Health Sciences","Relational and hierarchical data models database system architecture and approaches for managing large volumes of social and health sciences data. ",3," CS 200",false,false,false,false,false,0,0); 
				addNode(351,"CS 351","Website Development","Website development emphasizing presentation layer with client side and server side technologies. Topics covered include HTML CSS media JavaScript CGI server-side programming.",3,"CS 301",true,false,true,false,false,930,1045);
				addNode(400,"CS 400","Computer Programming for Science","An introduction to programming for science majors.  Emphasis on scientific applications and data manipulation using Python and associated scientific libraries.",3,"MATH 130",false,false,false,false,false,0,0);
				addNode(401,"CS 401","Software Engineering","Concepts and issues in the development of large software projects. Approaches to requirements analysis design implementation testing and maintenance of high-quality software. Systems for software design management documentation and testing such as UML GIT Javadoc and Junit. Programming in Java. Lecture Units: 3; Lab Units: 1",4,"CS 301 with grade C- or better.",true,false,true,false,false,800,915);
				addNode(411,"CS 411","Automata and Computation","Formal models of computation languages and computability deterministic and non-deterministic finite automata regular expressions pushdown automata context-free languages Pumping Lemmas Turing machines decidability reducibility and undecidable problems. ",3,"CS 211 and MATH 225 both with grade C- or better. ",true,false,true,false,false,1230,1345);
				addNode(413,"CS 413","Analysis of Algorithms","Asymptotic notation analysis framework and efficiency classes recurrence relations algorithmic design methodology searching and sorting algorithms string matching heaps and priority queues doubly-linked and circularly-linked lists; trees and balancing; graph algorithms including breath-first and depth-first search and hashing.",3,"CS/MATH 211 and CS 301",true,false,true,false,false,1100,1215);
				addNode(421,"CS 421","Operating Systems","Principles of operating system design and implementation. Concurrent processes interprocess communication job and process scheduling deadlock. Issues in memory management (virtual memory segmentation paging) and auxiliary storage management (file systems directory structuring protection mechanisms). Performance issues. Programming projects.",3,"CS 301 with grade C- or better.",true,false,true,false,false,800,915);
				addNode(431,"CS 431","Database Architecture","Data models data description and data manipulation languages. Schemas query processing database system architecture. Integrity concurrency and security techniques. Implementation of data models in a real database.",3,"CS 301 with grade C- or better",true,false,true,false,false,1100,1215);
				addNode(441,"CS 441","Computer Networks","Computer network analysis and design.  Fundamentals of data communications: media transmission encoding error detection and handling link control packet switching. Network architecture and topology. Network Transport and Application layer protocols services design issues and performance. Programming assignments using TCP/IP.",3,"CS 301 ",false,true,false,false,false,1100,1215);
				addNode(453,"CS 453","Mobile Programming","Current practices and trends in software design development and deployment of mobile applications and systems. Topics include modern mobile device application development and related sensor and system technologies. ",3,"CS 301 with grade C- or better",false,true,false,true,false,1445,1600);
				addNode(455,"CS 455","Computer Graphics","Survey of computer graphics hardware algorithms techniques and standards. Software development using current graphic frameworks.",3,"CS 301 with grade C- or better.",false,false,false,false,false,0,0);
				addNode(461,"CS 461","Artificial Intelligence","Intelligence as computation rational agent architecture state spaces breadth-first and depth-first search heuristic search A* algorithm game playing hill-climbing and optimization neural networks knowledge representation production systems machine learning techniques introduction to Lisp and Scheme. Programming projects.",3,"CS 301 with grade C- or better",false,true,false,true,false,1315,1430);
				addNode(471,"CS 471","Security and Information Assurance","Fundamentals of network and computer security.  Security services and mechanisms models cryptography network and wireless security digital forensics security threats and vulnerabilities risk analysis and management models security attacks and policies and legal and regulatory issues. Programming projects.",3,"CS 301 with grade C- or better",false,false,false,true,false,1445,1600); 
				addNode(490,"CS 490","Independent Study","Independent study in computer science under the supervision of a member of the department faculty",1,"Department consent and minimum 2.0 GPA",false,false,false,false,false,0,0);
				addNode(497,"CS 497","Topics in Computer Science","Selected relevant subjects in Computer Science technologies and applications",3,"CS 301 with grade C- or better",false,false,false,false,false,0,0);
				addNode(498,"CS 498","Internship","Supervised work experience in which student completes academic assignments integrated with off-campus paid or volunteer activities",1,"Department consent minimum 2.0 GPA. junior or senior standing and all of: CS 101 CS 201 CS 211 CS 221 CS 230 MATH 130 MATH 131 MATH 225 PHYS 135." ,false,false,false,false,true,1800,2000);
				addNode(130, "MATH 130", "Calculus I","Introduction to limits and limit techniques; derivatives; related rates; optimization and applications; antiderivatives, introduction to integration and the fundamental theorem of calculus.",4,"One from the following: Satisfactory score of 78 or higher on Mathematics Placement Exam, MATH 120 or MATH 125 (either course with grade C- or better)." ,true,false,true,false,false,1200,1345);
				addNode(131, "MATH 131", "Calculus II","Integration techniques and applications; sequences and series; introduction to differential equations.", 3, "MATH 130 with grade C- or better.",false,true,false,true,false,1445,1600);
				addNode(225, "MATH 225", "Numerical Algorithms and Linear Algebra for Computer Science", "Computer arithmetic. Introduction to linear algebra and solving systems of equations. Rootfinding, interpolation, eigenvalues/eigenvectors. Programming techniques.",3, "CS 101 and MATH 130.",false,true,false,true,false,1745,1900);
				addNode(135, "PHYS 135", "Physics for Scientists and Engineers I","A calculus-based introduction to Newtonian mechanics that emphasizes both conceptual understanding and the ability to solve quantitative problems. Topics of study include kinematics, Newton’s laws, conservation of momentum and energy, rotational motion, gravitation, oscillations, and fluids. Lecture Units: 3; Lab Units: 1",4, "MATH 130.",false,false,false,false,false,0,0);
				addNode(316, "STAT 316", "Statistics and Probability for Science and Engineering", "Basic probability rules (independence, Bayes’ Theorem), distributions (binomial, Poisson, normal, exponential), reliability. Descriptive, inferential statistics (control charts, estimation, hypothesis testing: one, two samples), correlation, regression. Emphasizes: computer analysis, simulation; science, engineering applications. ", 3,"MATH 131.",true,false,true,false,false,1530,1645);
				
				//theTree.addNode(,false,false,false,false,false,0,0);
			}//CSmajor()
			
		public void addNode(int ID, String Course,String Name, String Description, int Units, String Prerequisites, boolean Mo, boolean Tu, boolean We, boolean Th, boolean Fr, int Start, int End) 
			{

				// Create a new Node and initialize it

				Node newNode = new Node(ID, Course, Name, Description, Units, Prerequisites,Mo,Tu,We,Th,Fr,Start,End);

				// If there is no root this becomes root

				if (root == null) 
					{

						root = newNode;

					} 
				else 
					{

						// Set root as the Node we will start
						// with as we traverse the tree

						Node focusNode = root;

						// Future parent for our new Node

						Node parent;

						while (true) 
							{

								// root is the top parent so we start
								// there

								parent = focusNode;

								// Check if the new node should go on
								// the left side of the parent node

								if (0 > Course.compareTo(focusNode.Course)) 
									{

										// Switch focus to the left child

										focusNode = focusNode.leftChild;

										// If the left child has no children

										if (focusNode == null) 
											{

												// then place the new node on the left of it

												parent.leftChild = newNode;
												return; // All Done

											}

									} 
								else 
									{ // If we get here put the node on the right

										focusNode = focusNode.rightChild;

										// If the right child has no children

										if (focusNode == null) 
											{

												// then place the new node on the right of it

												parent.rightChild = newNode;
												return; // All Done

											}

									}

							}//END While
					}

			}//END addNode
			
		public void inOrderTraverseTree(Node focusNode) 
			{

				if (focusNode != null) {

					// Traverse the left node

					inOrderTraverseTree(focusNode.leftChild);

					// Visit the currently focused on node

					System.out.println(focusNode);

					// Traverse the right node

					inOrderTraverseTree(focusNode.rightChild);

				}

			}//END inOrderTraverseTree

		public void preorderTraverseTree(Node focusNode) 
			{

				if (focusNode != null) 
					{

						System.out.println(focusNode);

						preorderTraverseTree(focusNode.leftChild);
						preorderTraverseTree(focusNode.rightChild);

					}

			}//END preorderTraverseTree

		public void postOrderTraverseTree(Node focusNode) 
			{

				if (focusNode != null) 
					{

						postOrderTraverseTree(focusNode.leftChild);
						postOrderTraverseTree(focusNode.rightChild);

						System.out.println(focusNode);

					}

			}//END postOrderTraverseTree
		
		public Node findNode(String Course) 
			{
				
				try
					{
						// Start at the top of the tree

						Node focusNode = root;

						// While we haven't found the Node
						// keep looking

						while (0 != focusNode.Course.compareTo(Course)) 
							{

								// If we should search to the left

								if (0 > Course.compareTo(focusNode.Course)) 
									{

										// Shift the focus Node to the left child

										focusNode = focusNode.leftChild;

									} 
								else 
									{

										// Shift the focus Node to the right child

										focusNode = focusNode.rightChild;

									}

								// The node wasn't found

								if (focusNode == null)
									{
										return ERROR;
									}
							}

						return focusNode;
					}
				catch (NullPointerException e)
					{
						return null;
					}

			}//END findNode
		
		public boolean getMo( String Course)
			{
				Node Found = findNode(Course.toUpperCase());
				
				return Found.Mo;
			}//END getMo
			
		public boolean getTu( String Course)
			{
				Node Found = findNode(Course.toUpperCase());
				
				return Found.Tu;
			}//END getTu
				
		public boolean getWe( String Course)
			{
				Node Found = findNode(Course.toUpperCase());
				
				return Found.We;
			}//END getWe
			
		public boolean getTh( String Course)
			{
				Node Found = findNode(Course.toUpperCase());
				
				return Found.Th;
			}//END getTh
			
		public boolean getFr( String Course)
			{
				Node Found = findNode(Course.toUpperCase());
				
				return Found.Fr;
			}//END getFr
				
		public int getStart( String Course)
			{
				try 
					{
						Node Found = findNode(Course.toUpperCase());			
						return Found.Start;
					}
				catch(NullPointerException e)
					{
						return 0;
					}
			}//END getStart
			
		public int getEnd( String Course)
			{
				try 
					{
						Node Found = findNode(Course.toUpperCase());			
						return Found.End;
					}
				catch(NullPointerException e)
					{
						return 0;
					}
			}//END getEnd
				
		public String getDescription( String Course)
			{
				try
					{
						Node Found = findNode(Course.toUpperCase());
						return Found.Description;
					}
				catch(NullPointerException e)
					{
						return "USER ERROR - REPLACE USER";
					}			
			}//END getDescription
			
		public int getID( String Course)
			{
				try
					{
						Node Found = findNode(Course.toUpperCase());
					
						return Found.ID;
					}
				catch(NullPointerException e)
					{
						return 0;
					}
					
			}//END getID		
		
		public String getCourse( String Course)
			{
				try
					{ 
						Node Found = findNode(Course.toUpperCase());				
						return Found.Course;
					}
				catch(NullPointerException e)
					{
						return "USER ERROR - REPLACE USER";
					}
			}//END getCourse
		
		public String getName( String Course)
			{
				try
					{
						Node Found = findNode(Course.toUpperCase());
						return Found.Name;
					}
				catch(NullPointerException e)
					{
						return "USER ERROR - REPLACE USER";
					}
			}//END getName
		
		public int getUnits( String Course)
			{
				try 
					{	
						Node Found = findNode(Course.toUpperCase());
						return Found.Units;
					}
				catch(NullPointerException e)
					{
						return 0;
					}
			}//END getUnits
			
		public String getPrerequisites( String Course)
			{
				try 
					{
						Node Found = findNode(Course.toUpperCase());
						return Found.Prerequisites;
					}
				catch(NullPointerException e)
					{
						return "USER ERROR - REPLACE USER";
					}
			}//END getPrerequisites
		
		
	/*	

	public static void main(String[] args) 
		{
			
			
			CSmajor theTree = new CSmajor();
			Scanner sc = new Scanner(System.in);
			
			Node Target = theTree.findNode(sc.nextLine().toUpperCase());
							
			System.out.print("\nID: \t\t");
			System.out.println(Target.ID);
			System.out.print("\nCourse: \t");
			System.out.println(Target.Course);
			System.out.print("\nName: \t\t");
			System.out.println(Target.Name);
			System.out.print("\nDescription: \t");
			System.out.println(Target.Description);
			System.out.print("\nUnits: \t\t");
			System.out.println(Target.Units);
			System.out.print("\nPrerequisites: \t");
			System.out.println(Target.Prerequisites);
			System.out.print("\nMonday: \t");
			System.out.println(Target.Mo);
			System.out.print("\nTuesday: \t");
			System.out.println(Target.Tu);
			System.out.print("\nWednesday: \t");
			System.out.println(Target.We);
			System.out.print("\nThursday: \t");
			System.out.println(Target.Th);
			System.out.print("\nFriday: \t");
			System.out.println(Target.Fr);
			System.out.print("\nStart Time: \t");
			System.out.println(Target.Start);
			System.out.print("\nEnd Time: \t");
			System.out.println(Target.End);
			
			
		}//END Main
		
	*/
	}//END CSmajor