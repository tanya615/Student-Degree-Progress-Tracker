
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConflicterCE
{
	//Hold values stored in AVL Tree
	int ID, Units,Startime, Endtime, id;
	String Name, Course, Description, Prerequisites;
	// Class objects
	Node tes;
	CEmajor b;
	
	//Booleans from AVL Tree
	
	boolean Mo;
	boolean Tu; 
	boolean We;
	boolean Th;
	boolean Fr;

    public boolean insertCorCE(CEmajor thetre, String Name) //throws IOException
    {
    	//when this method is called it should find the String name Ex. "CS 401" from AVL tree
    	//Then get all of the info within that node.
       	b = thetre;
    	tes = b.findNode(Name);
    	Endtime = tes.End;
    	Startime = tes.Start;
    	ID = tes.ID; 
    	Course = tes.Course;
    	Mo = tes.Mo;
    	Tu = tes.Tu;
    	We = tes.We;
    	Th = tes.Th;
    	Fr = tes.Fr;
    	Name = tes.Name;

        boolean success = true;
        
        if (Startime == 0)
        {
        	JOptionPane.showMessageDialog(null,Name + " Not available for Fall 2019 Semester");
        	success = false;
        	return false;
        }
       
        int row = 0;
        
        if (Mo)
        	{
        		row = 0; // reset row
        		while  (row < 60) // 60 is the total elements in array
        		{	// Iterate through
        			for (row = 0; row < 60; row++) 
        			{ // if Starting class time matches and the cooresponding column is zero
        				if  (Monday[row][0] == Startime && Monday[row][1] == 0)
        				{
        					// check to see if class time is available
        					if (Monday[row][0] != Endtime)
        					{	// move through times in the array
        						int k = row;
        						k++;
        						
        						// return false because of conflict since scheduled class times have a column of 1
        						if (Monday[k][1] == 1)
        						{
        							// let us know which class failed
        						   JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
        							success = false;
        							return success;
        						}
        					}
        					// add course ID to col starting at start time and ending at end time;
        					do{
        						// System.out.print("in monday do while"); This prints
        						Monday[row][1] = 1;
        						row++;
        						
        					}while (Monday[row][0] != Endtime); 
        				}
        				// if start time is already taken
        				if(Monday[row][0] == Startime && Monday[row][1] == 1)
        				{
        					JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
							return false; 
        				}

        			}
        		}
        		
        	}
        
        if (Tu)
    	{
        	row = 0;
    		while  (row < 60)
    		{
    			for (row = 0; row < 60; row++) 
    			{
    				if  (Tuesday[row][0] == Startime && Tuesday[row][1] == 0)
    				{
    					// check to see if class time is available
    					if (Tuesday[row][0] != Endtime)
    					{
    						int c = row;
    						c++;
    						if (Tuesday[c][1] != 0)
    						{
    							JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
    							success = false;
    							return false; 
    						}
    					}
    					// add course ID to col starting at start time and ending at end time;
    					do{
    						Tuesday[row][1] += 1;
    						row++;
    					}while (Tuesday[row][0] != Endtime); 
    					
    				}
    				if(Tuesday[row][0] == Startime && Tuesday[row][1] == 1)
    				{
    					JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
						return false; 
    				}
    			}
    		}
        
    	}
        if (We)
    	{
    		row = 0;
    		while  (row < 60)
    		{
    			for (row = 0; row < 60; row++) 
    			{
    				if  (Wednesday[row][0] == Startime && Wednesday[row][1] == 0)
    				{
    					// check to see if class time is available
    					if (Wednesday[row][0] != Endtime)
    					{
    						int c = row;
    						c++;
    						if (Wednesday[c][1] != 0)
    						{
    							JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
    						    success = false;
    							return false; 
    						}
    					}
    					// add course ID to col starting at start time and ending at end time;
    					do{
    						Wednesday[row][1] = 1;
    						row++;
    					}while (Wednesday[row][0] != Endtime); 
    					
    				}
    				if (Wednesday[row][0] == Startime && Wednesday[row][1] == 1)
    				{
    					JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
						return false; 
    				}
    			}
    		}
        
    	}
        if (Th)
    	{
        	row = 0;
    		while  (row < 60)
    		{
    			for (row = 0; row < 60; row++) 
    			{
    				if  (Thursday[row][0] == Startime && Thursday[row][1] == 0)
    				{
    					// check to see if class time is available
    					if (Thursday[row][0] != Endtime)
    					{
    						int c = row;
    						c++;
    						if (Thursday[c][1] != 0)
    						{
    							JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
    							return false; 
    						}
    					}
    					// add course ID to col starting at start time and ending at end time;
    					do{
    						Thursday[row][1] += 1;
    						row++;
    					}while (Thursday[row][0] != Endtime); 
    					
    				}
    				if (Thursday[row][0] == Startime && Thursday[row][1] == 1)
    				{
    					JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
						return false; 
    				}
    			}
    		}
        
    	}
        if (Fr)
    	{
        	row = 0;
    		while  (row < 60)
    		{
    			for (row = 0; row < 60; row++) 
    			{
    				if  (Friday[row][0] == Startime && Friday[row][1] == 0)
    				{
    					// check to see if class time is available
    					if (Friday[row][0] != Endtime)
    					{
    						int c = row;
    						c++;
    						if (Friday[c][1] != 0)
    						{
    							JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
    							return false; 
    						}
    					}
    					// add course ID to col starting at start time and ending at end time;
    					do{
    						Friday[row][1] += ID;
    						row++;
    					}while (Friday[row][0] != Endtime); 
    					
    				}
    				if (Friday[row][0] == Startime && Friday[row][1] == 1)
    				{
    					JOptionPane.showMessageDialog(null,"\nSchedule conflict " + Name + " Failed to add");
						return false; 
    				}
    			}
    		}
        
    	}
        
        // displayArr();
        JOptionPane.showMessageDialog(null,Name + " successfuly added to schedule");
        return success;
    
    }

    int [][] Monday = {{800, 0}, {815, 0}, {830,0}, {845, 0}, {900, 0}, {915, 0}, 
        {930,0}, {945, 0}, {1000,0}, {1015,0}, {1030,0}, {1045,0}, {1100, 0},{1115, 0},
        {1130,0}, {1145,0}, {1200,0}, {1215,0}, {1230,0}, {1245,0}, {1300,0}, {1315,0},
        {1330,0}, {1345,0}, {1400,0}, {1415,0}, {1430,0}, {1445,0}, {1500,0}, {1515, 0},
        {1530,0}, {1545,0}, {1600,0}, {1615,0}, {1630,0}, {1645,0}, {1700,0}, {1715,0},
        {1730,0}, {1745,0}, {1800,0}, {1815,0}, {1830,0}, {1845,0}, {1900,0},{1915,0},
        {1930,0}, {1945,0}, {2000,0}, {2015,0}, {2030,0}, {2045,0}, {2100,0}, {2115,0},
        {2130,0}, {2145,0}, {2200,0}, {2215,0}, {2230,0},{2245,0}};
   
    int [][] Tuesday = {{800, 0}, {815, 0}, {830,0}, {845, 0}, {900, 0}, {915, 0}, 
            {930,0}, {945, 0}, {1000,0}, {1015,0}, {1030,0}, {1045,0}, {1100, 0},{1115, 0},
            {1130,0}, {1145,0}, {1200,0}, {1215,0}, {1230,0}, {1245,0}, {1300,0}, {1315,0},
            {1330,0}, {1345,0}, {1400,0}, {1415,0}, {1430,0}, {1445,0}, {1500,0}, {1515, 0},
            {1530,0}, {1545,0}, {1600,0}, {1615,0}, {1630,0}, {1645,0}, {1700,0}, {1715,0},
            {1730,0}, {1745,0}, {1800,0}, {1815,0}, {1830,0}, {1845,0}, {1900,0},{1915,0},
            {1930,0}, {1945,0}, {2000,0}, {2015,0}, {2030,0}, {2045,0}, {2100,0}, {2115,0},
            {2130,0}, {2145,0}, {2200,0}, {2215,0}, {2230,0},{2245,0}};

    int [][] Wednesday = {{800, 0}, {815, 0}, {830,0}, {845, 0}, {900, 0}, {915, 0}, 
            {930,0}, {945, 0}, {1000,0}, {1015,0}, {1030,0}, {1045,0}, {1100, 0},{1115, 0},
            {1130,0}, {1145,0}, {1200,0}, {1215,0}, {1230,0}, {1245,0}, {1300,0}, {1315,0},
            {1330,0}, {1345,0}, {1400,0}, {1415,0}, {1430,0}, {1445,0}, {1500,0}, {1515, 0},
            {1530,0}, {1545,0}, {1600,0}, {1615,0}, {1630,0}, {1645,0}, {1700,0}, {1715,0},
            {1730,0}, {1745,0}, {1800,0}, {1815,0}, {1830,0}, {1845,0}, {1900,0},{1915,0},
            {1930,0}, {1945,0}, {2000,0}, {2015,0}, {2030,0}, {2045,0}, {2100,0}, {2115,0},
            {2130,0}, {2145,0}, {2200,0}, {2215,0}, {2230,0},{2245,0}};
    
    int [][] Thursday = {{800, 0}, {815, 0}, {830,0}, {845, 0}, {900, 0}, {915, 0}, 
            {930,0}, {945, 0}, {1000,0}, {1015,0}, {1030,0}, {1045,0}, {1100, 0},{1115, 0},
            {1130,0}, {1145,0}, {1200,0}, {1215,0}, {1230,0}, {1245,0}, {1300,0}, {1315,0},
            {1330,0}, {1345,0}, {1400,0}, {1415,0}, {1430,0}, {1445,0}, {1500,0}, {1515, 0},
            {1530,0}, {1545,0}, {1600,0}, {1615,0}, {1630,0}, {1645,0}, {1700,0}, {1715,0},
            {1730,0}, {1745,0}, {1800,0}, {1815,0}, {1830,0}, {1845,0}, {1900,0},{1915,0},
            {1930,0}, {1945,0}, {2000,0}, {2015,0}, {2030,0}, {2045,0}, {2100,0}, {2115,0},
            {2130,0}, {2145,0}, {2200,0}, {2215,0}, {2230,0},{2245,0}};
    
    int [][] Friday = {{800, 0}, {815, 0}, {830,0}, {845, 0}, {900, 0}, {915, 0}, 
            {930,0}, {945, 0}, {1000,0}, {1015,0}, {1030,0}, {1045,0}, {1100, 0},{1115, 0},
            {1130,0}, {1145,0}, {1200,0}, {1215,0}, {1230,0}, {1245,0}, {1300,0}, {1315,0},
            {1330,0}, {1345,0}, {1400,0}, {1415,0}, {1430,0}, {1445,0}, {1500,0}, {1515, 0},
            {1530,0}, {1545,0}, {1600,0}, {1615,0}, {1630,0}, {1645,0}, {1700,0}, {1715,0},
            {1730,0}, {1745,0}, {1800,0}, {1815,0}, {1830,0}, {1845,0}, {1900,0},{1915,0},
            {1930,0}, {1945,0}, {2000,0}, {2015,0}, {2030,0}, {2045,0}, {2100,0}, {2115,0},
            {2130,0}, {2145,0}, {2200,0}, {2215,0}, {2230,0},{2245,0}};
    
    
        // testing purposes, only prints arrays elements when they have classes added to them
        public void displayArr()
        {	
        
         	System.out.println("Monday Schedule");
            for (int row = 0; row < Monday.length; row++)
            {
            	int a = 1; 
            	int count = 0;
                for(int col = 0; col < Monday[row].length; col++)
                {
                	if (Monday[row][a] != 0)
                	{
                		
                		System.out.print("[ " + Monday[row][col] + " ]");
                		count++;
                		if (count ==  2)
                		{
                			System.out.println("");
                			count = 0;
                		}
                	}
                }
            }
                System.out.println("\n------------------------------");
                
                
            System.out.println("Tuesday Schedule");
            for (int row = 0; row < Tuesday.length; row++)
            	{
                	int a = 1; 
                	int count = 0;
                    for(int col = 0; col < Tuesday[row].length; col++)
                    {	
                    	if (Tuesday[row][a] != 0)
                    	{
                    		
                    		System.out.print("[ " + Tuesday[row][col] + " ]");
                    		count++;
                    		
                    		if (count ==  2)
                    		{
                    			System.out.println("");
                    			count = 0;
                    		}
                    		
                    	}
                    	
                    }
                }
            System.out.println("------------------------------");
            
            System.out.println("Wednesday Schedule");
            for (int row = 0; row < Wednesday.length; row++)
            {
            	int a = 1; 
            	int count = 0;
                for(int col = 0; col < Wednesday[row].length; col++)
                {
                	if (Wednesday[row][a] != 0)
                	{
                		
                		System.out.print("[ " + Wednesday[row][col] + " ]");
                		count++;
                		if (count ==  2)
                		{
                			System.out.println("");
                			count = 0;
                		}
                	}
                }
            }
            System.out.println("------------------------------");
                
            System.out.println("Thursday Schedule");
                for (int row = 0; row < Thursday.length; row++)
                {
                	int a = 1; 
                	int count = 0;
                    for(int col = 0; col < Thursday[row].length; col++)
                    {
                    	if (Thursday[row][a] != 0)
                    	{
                    		
                    		System.out.print("[ " + Thursday[row][col] + " ]");
                    		count++;
                    		if (count ==  2)
                    		{
                    			System.out.println("");
                    			count = 0;
                    		}
                    	}
                    }
                }
                System.out.println("------------------------------");
                System.out.println("Friday's schedule");
                for (int row = 0; row < Friday.length; row++)
                {
                	int a = 1; 
                	int count = 0;
                    for(int col = 0; col < Friday[row].length; col++)
                    {
                    	if (Friday[row][a] != 0)
                    	{
                    		
                    		System.out.print("[ " + Friday[row][col] + " ]");
                    		count++;
                    		if (count ==  2)
                    		{
                    			System.out.println("");
                    			count = 0;
                    		}
                    	}
                    }
                }
                    System.out.println("------------------------------");
            
        }
        //add class names to output file;
        public void scheduleOut(String z) throws IOException
        {
        	String cName = z;
        	
        	FileWriter outputFile = new FileWriter("2019 Fall Schedule.txt",true);
        	PrintWriter pw = new PrintWriter(outputFile);

        	pw.println("Course: " + cName);
        	pw.print("Class Days: ");
        	if (Mo)
        	{
        		pw.print("Mo");
        		
        	}
        	if (Tu)
        	{
        		pw.print("Tu");
        	}
        	if (We)
        	{
        		pw.print("We");
        	}
        	if (Th)
        	{
        		pw.print("Th");
        	}
        	if (Fr)
        	{
        		pw.print("Fr");
        	}
        	pw.println("");
        	pw.println("Times: " + Startime + " - " + Endtime);
        	pw.println("-----------------------");
        	
        	pw.close();
        	
        }




}