/*
This version searches via class name as a string vs int 

i.e. CS 401 and not 401

When ussing a Scanner object like Scanner sc 

apply the .toUpperCase method to it for instance 



		CEmajor theTree = new CEmajor();
		
		Scanner sc = new Scanner(System.in);
		
		Node test = theTree.findNode(sc.nextLine().toUpperCase());
		
		System.out.println(test.Name);
		System.out.println(test.ID);

*/


import java.util.Scanner;

public class CEmajor 
	{
		Node root;
		Node ERROR = new Node(0,"NOT FOUND","NOT FOUND","NOT FOUND",0,"NOT FOUND",false,false,false,false,false,0,0);
		
		CEmajor()
			{			
				addNode(110 ,"CHEM 110","General Chemistry for Engineering","Elementary principles of chemistry including experimentation, laboratory skills, and science practices.  Focused on real-world applications, connections to engineering, and systems thinking, including: properties of matter, energy, phase changes, chemical reactions, atomic structure and theory, reaction rates, equilibria, and electrochemistry. Lecture Units: 2; Lab Units: 1",3,"MATH 120, MATH 125 or MATH 130.",true,false,false,false,true,1000,1100);
			
				addNode(101,"CS 101","Computer Science I","An introduction to computer programming for computer science majors.  Topics include problem solving, algorithms, basic control structures, and program design. Programming projects in Python or other high level programming language. Lecture Units: 3; Lab Units: 1",4,"Mathematics/QR Placement Category I or II, or successful completion of GE area B4.",true,false,true,false,false,930,1045);
				
				addNode(201,"CS 201"," Computer Science II","Further development of programming and problem solving skills in the C++ programming language. Topics include Abstract Data Types (ADTs), data structures (stacks, queues, trees), and object oriented design. Sorting and searching algorithms. Lecture Units: 3; Lab Units: 1",4," CS 101 with grade C- or better.",true,false,true,false,false,1100,1215);
				
				addNode(211 ,"CS 211","Discrete Structures","Propositional logic and predicate calculus, set theory, inference, induction, recursion, divide-and-conquer, enumeration, graphs and topology, trees, binary trees and traversals, Boolean algebra, logic gates,  asymptotic notation and algorithm analysis, combinatorics, cryptography, discrete probability, computational modeling.",3,"MATH 130 with grade C- or better.",false,false,false,false,true,1100,1330);
				
				addNode(221 ,"CS 221","Computer Organization and Assembly Language","A study of the functional organization of digital computers. Fundamental principles of control and datapath units, program counter, ALU, multiplexers, registers, and memory. Digital logic gates and Boolean functions. Introduction to assemblers, linkers, and loaders. Programming with assembly language.",3,"CS 100 or CS 101, both with grade C- or better.",false,true,false,true,false,1445,1600);
				
				addNode(200 ,"ENGR 200","Introduction to Engineering and Design","Engineering history, disciplines and professions, current global issues in engineering. Engineering design process, visualization, and graphics. Introduction to CAD, and computer tools such as spreadsheet, mathematics software, and presentation software. Teamwork skills, technical communication, engineering ethics, and critical thinking. Discussion Units: 2; Lab Units: 1",3,"NONE",false,true,false,false,false,1315,1455);
				
				addNode(220 ,"ENGR 220","Statics","An intermediate application of Newtonian mechanics to solve engineering problems. Fundamental concepts of mechanics, including resultants of force systems, free-body diagrams, equilibrium of rigid bodies, and analyses of structures.",3,"PHYS 135.",false,false,false,false,false,0,0);
				
				addNode(230 ,"ENGR 230","Electric Circuits I","A study of fundamental circuit laws and components, and techniques for analog circuit analysis. Voltage, current, power, Ohm’s Law, Kirchoff’s laws, node voltage and mesh current analysis, op-amps, capacitors, inductors, RC, RL, RLC circuits. Impedance, frequency response, and Bode. Lecture Units: 2; Lab Units: 1",3,"PHYS 136 and MATH 210. ",true,false,false,false,false,1600,1745);
				
				addNode(130 ,"MATH 130","Calculus I","Introduction to limits and limit techniques; derivatives; related rates; optimization and applications; antiderivatives, introduction to integration and the fundamental theorem of calculus.",4,"One from the following: Satisfactory score of 78 or higher on Mathematics Placement Exam, MATH 120 or MATH 125 (either course with grade C- or better).",true,false,true,false,false,1200,1345);
				
				addNode(131 ,"MATH 131","Calculus II","Integration techniques and applications; sequences and series; introduction to differential equations.",3,"MATH 130 with grade C- or better.",false,true,false,true,false,1445,1600);
				
				addNode(210 ,"MATH 210 ","Linear Algebra with Differential Equations","Solving linear systems and introduction to linear algebra. Eigenvalues and eigenvectors. Introduction to differential equations. Solving ordinary differential equations with constant coefficients. Homogeneous and nonhomogeneous equations. Introduction to vectors and functions of several variables.",3,"MATH 130",false,true,false,true,false,1315,1430);
				
				addNode(230 ,"MATH 230","Calculus III","Vectors, dot and cross products; equations of lines, planes and surfaces; partial derivatives, directional derivatives and gradient vector; optimization and Lagrange multipliers; multiple integrals; vector fields; Stoke’s theorems; applications.",3," MATH 131 with grade C- or better.",true,false,true,false,false,1700,1815);
				
				addNode(135 ,"PHYS 135","Physics for Scientists and Engineers I","A calculus-based introduction to Newtonian mechanics that emphasizes both conceptual understanding and the ability to solve quantitative problems. Topics of study include kinematics, Newton’s laws, conservation of momentum and energy, rotational motion, gravitation, oscillations, and fluids. Lecture Units: 3; Lab Units: 1",4,"MATH 130",false,false,false,false,false,0,0);
				
				addNode(136 ,"PHYS 136","Physics for Scientists and Engineers II","A calculus-based introduction to electricity and magnetism that emphasizes both conceptual understanding and the ability to solve quantitative problems. Topics of study include the electric force, field, and potential, electric circuits, magnetic force, magnetic field, electromagnetic induction, Maxwell’s equations, and electromagnetic waves. Lecture Units: 3; Lab Units: 1",4,"MATH 130 and PHYS 135. ",true,false,true,false,true,900,1000);
				
				addNode(322 ,"CMPE 322","Digital Design Laboratory","Design and implementation of combinational and sequential digital logic circuits. Digital Logic Gates, Boolean Algebra, K-maps, latches, flip-flops, registers, multiplexers, state machines. Hardware description language and FPGA programming, interface with digital hardware components.",1,"CS 321.",false,false,false,false,false,0,0);
				
				addNode(330 ,"CMPE 330","Electric Circuits II","A study of transistor-amplifier design, small- and large-signal models for diodes, BJTs, and MOSFETS, including operating points, biasing, and frequency responses. Active filters and amplifier topologies and design strategies. Introduction to design and operation of digital circuit components. Lecture Units: 2; Lab Units: 1",3,"ENGR 230",false,false,false,false,false,0,0);
				
				addNode(344 ,"CMPE 344","Microprocessor Laboratory","Microprocessor organization, operation, and programming. Hardware/software interaction, I/O port interfacing, interfacing with analog and digital electronic devices. Lecture Units: 2; Lab Units: 1",3,"CS 301",true,false,true,false,false,1100,1200);
				
				addNode(370 ,"CMPE 370","Digital Signal Processing I","Mathematical modeling of signals and systems. Continuous and discrete signals, with applications to audio, images, video, communications, and control. Frequency domain modeling and frequency response. Sampling of continuous-time signals. A simulation-based laboratory is part of the course. Lecture Units: 2; Lab Units: 1 ",3,"CMPE 330.",true,false,true,false,false,800,900);				
				
				addNode(421 ,"CMPE 421","Computer Architecture II","Advanced computer organization and design. Topics chosen from among RISC architectures, computer arithmetic, pipelining, cache memory and parallel processors.",3,"CS 321 and CMPE 322.",false,true,false,true,false,930,1045);
				
				addNode(480,"CMPE 480","VLSI Circuit Design/Layout","Fundamental design techniques for VLSI circuits. Properties of silicon, polysilicon, metal, n-type, and p-type materials. NMOS and PMOS transistor sizing and delay for logic functions. Implementation of complex integrated circuits on a microchip. Use of computer aided design tools.",3,"CHEM 110 and CS 321.",false,true,false,true,false,930,1045);
				
				addNode(492 ,"CMPE 492","Senior Design I","Generation of engineering career documents, such as resume cover letter, project proposal, Gantt chart, bill of materials, and patent application. Initial contact with client, and project planning. Introduction to Scrum project methodology. ",3,"All of: ENGR 310, CMPE 344, CMPE 370. ",false,false,false,false,false,0,0);
				
				addNode(493 ,"CMPE 493","NaSenior Capstone: Senior Design IIme","Technical development and completion of a capstone design project. Continuous feedback from project clients, teammates, and instructor. Introduction to Scrummethodology. Mock U.S. Patent application, and completion of a technical journal article. Satisfies the capstone requirement.",3," CMPE 492",false,false,false,false,true,1200,1430);
				
				addNode(301 ,"CS 301","Data Structures and Algorithms","Design and implementation of abstract data structures including stacks, queues, doubly-linked  and circularly-linked lists, binary search trees, heaps, priority queues and graphs; algorithmic analysis and asymptotic notation; binary search, heapsort, merge sort, quicksort, and radix sort. Discussion Units: 3; Lab Units: 1",4,"CS 201 and CS 211.",true,false,true,false,false,1100,1215);
				
				addNode(321 ,"CS 321","Computer Architecture","Logical design of digital computers. Boolean algebra, combinational and sequential circuits, computer arithmetic, memories, integrated circuits, control processors, input/output.",3,"CS 211 and CS 221, both with grade C- or better",false,true,false,true,false,1100,1215);
				
				addNode(330 ,"INDE 330","Engineering Statistics and Probability","Analyzing data to solve non-deterministic engineering problems including specialized engineering software applications. Topics include analysis of service and production systems including error and variability analysis and optimal sampling schemes for decision-making in logistics and manufacturing.",3,"MATH 130. ",false,false,false,false,false,0,0);
				
				addNode(375 ,"MATH 375","Differential Equations I","Solutions and applications of first order differential equations. Linear n-th order equations with emphasis on equations of 2nd order. Topics include power series solutions, Laplace transforms, and linear systems.",3,"MATH 131 and MATH 210, both with grade C- or better. ",false,false,false,false,false,0,0);
				
				addNode(430 ,"CMPE 430","Analog Design","Single stage and multistage transistor amplifier design. Biasing circuits, amplifier gain, and input/output impedance. Transient analysis and frequency analysis of active and passive networks. Bode plots and Nyquist stability. Lecture Units: 2; Lab Units: 1",3,"CMPE 330",false,false,false,false,false,0,0);
				
				addNode(470 ,"CMPE 470","Digital Signal Processing II","Implementation of signal processing systems in a floating-point DSP processor. DSP processor programming, memory management, interrupts, interfacing with registers, assembly language instructions, hardware datasheet interpretation. Real-time DSP applications involving filtering, and A/D and D/A conversion. Lecture Units: 3; Lab Units: 1",4," CMPE 370",false,false,false,false,false,0,0);
				
				addNode(401,"CS 401","Software Engineering","Concepts and issues in the development of large software projects. Approaches to requirements analysis design implementation testing and maintenance of high-quality software. Systems for software design management documentation and testing such as UML GIT Javadoc and Junit. Programming in Java. Lecture Units: 3; Lab Units: 1",4,"CS 301 with grade C- or better.",true,false,true,false,false,930,1045);
				
				addNode(421,"CS 421","Operating Systems","Principles of operating system design and implementation. Concurrent processes interprocess communication job and process scheduling deadlock. Issues in memory management (virtual memory segmentation paging) and auxiliary storage management (file systems directory structuring protection mechanisms). Performance issues. Programming projects.",3,"CS 301 with grade C- or better.",false,false,false,false,false,0,0);
				
				addNode(441,"CS 441","Computer Networks","Computer network analysis and design.  Fundamentals of data communications: media transmission encoding error detection and handling link control packet switching. Network architecture and topology. Network Transport and Application layer protocols services design issues and performance. Programming assignments using TCP/IP.",3,"CS 301 ",false,false,false,true,false,1100,1215);
				
				addNode(310 ,"ENGR 310","CAD/CAM Graphics","Use of Computer Aided Design software tools to correctly specify the designs of system components for manufacture using all major methods. A laboratory component will allow students to fabricate components they have designed.",3," ENGR 220",false,false,false,false,false,0,0);
				
				addNode(455,"CS 455","Computer Graphics","Survey of computer graphics hardware algorithms techniques and standards. Software development using current graphic frameworks.",3,"CS 301 with grade C- or better.",false,false,false,false,false,0,0);
				
			}//CEmajor()
			
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
		
		
		

	public static void main(String[] args) 
		{
			
			
			CEmajor theTree = new CEmajor();
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
	}//END CEmajor

class Node 
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