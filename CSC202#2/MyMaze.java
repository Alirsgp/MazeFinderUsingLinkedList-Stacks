import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
//Use printwriter for our i/o.

public class MyMaze {
	
	private static int startingPointCounter = 0;
	private static int endingPointCounter = 0;
	private static Scanner scan = new Scanner(System.in);
	private static boolean ready = false;
	private static String firstRow, secondRow, thirdRow, fourthRow, fifthRow, sixthRow, seventhRow, eightRow, ninthRow, tenthRow, bigString;
	private static LLNode startingNode = new LLNode('0', 0, 0);
	private static File uploadedFile;
	private static int totalCounterPushed;
	private static String publishAnswer = "";

/**
 * Created by Ali Mohammadian - CSC 202 - Assignment #2
 */

    public static void main(String[] args){
    	//construct linked list from text file input
        try {
        	Scanner input = new Scanner(System.in);
            System.out.print("Enter the file name with extension : ");
       	
            File uploadedFile = new File(scan.nextLine());
      	 	
            Scanner fileInput = new Scanner(uploadedFile);

            firstRow = fileInput.nextLine();
         	   if(checkInput(firstRow)) {
        	    secondRow = fileInput.nextLine();
        	     if(checkInput(secondRow)) {
        	     	thirdRow = fileInput.nextLine();
        	     	if(checkInput(thirdRow)) {
        	     		fourthRow = fileInput.nextLine();
        	     		if(checkInput(fourthRow)) {
        	     			fifthRow = fileInput.nextLine();
        	     			if(checkInput(fifthRow)) {
        	     				sixthRow = fileInput.nextLine();
        	     				if(checkInput(sixthRow)) {
        	     					seventhRow = fileInput.nextLine();
        	     					if(checkInput(seventhRow)) {
        	     						eightRow = fileInput.nextLine();
        	     						if(checkInput(eightRow)) {
        	     							ninthRow = fileInput.nextLine();
        	     							if(checkInput(ninthRow)) {
        	     								tenthRow = fileInput.nextLine();
        	     								if(checkInput(tenthRow)) {
        	     									ready = true;
        	     								}
        	     							}
        	     						}
        	     					}
        	     				}
        	     			}
        	     		}
        	     	}
        	     }
      		 }

      		 if(ready != true) {
      		 	System.out.println("Your text file has to be 10x10, with only chars '1', '0', 'E', and '*'. No spaces. \nRe-Run the program with the proper file. Make sure you save your new file before re-running.");
      		 	System.exit(0);
      		 }
      	 
            bigString = "111111111111" + "1" + firstRow + "11" + secondRow + "11" + thirdRow + "11" + fourthRow + "11" + fifthRow + "11" + sixthRow + "11" + seventhRow + "11" + eightRow + "11" + ninthRow + "11" + tenthRow + "1" + "111111111111";
            input.close();
            //We add '1's to the side of our 10x10 maze, so that no NullPointerExceptions will be received when moving up/down.

        } catch (Exception ex) {
            System.out.println("File not found! Enter a valid file name and re-run the program.");
            System.exit(0);
        }
       
        //Below code creates and links all the nodes together
        LLNode myNode = new LLNode(bigString.charAt(0), 0, 0);
		LLNode t = myNode;

		 for(int i = 1; i < bigString.length(); i++) {
		 		if(myNode.getInfo().equals('*')) 
		 			{
		 				startingNode = myNode;
		 			}
		 		if(i < 12) { 
				LLNode myNodeTemp = new LLNode(bigString.charAt(i), i, 0);
				myNode.setLink(myNodeTemp);
				myNodeTemp.setPrevious(myNode);
				myNode = myNodeTemp;

				} else if(i >= 12 && i < 24) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 12, 1);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				} else if(i >= 24 && i < 36) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 24, 2);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}	else if(i >= 36 && i < 48) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 36, 3);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}	else if(i >= 48 && i < 60) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 48, 4);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}   else if(i >= 60 && i < 72) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 60, 5);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}	else if(i >= 72 && i < 84) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 72, 6);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}	else if(i >= 84 && i < 96) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 84, 7);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}   else if(i >= 96 && i < 108) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 96, 8);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}	else if(i >= 108 && i < 120) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 108, 9);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}   else if(i >= 120 && i < 132) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 120, 10);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}	else if(i >= 132 && i < 144) {
					LLNode myNodeTemp = new LLNode(bigString.charAt(i), i - 132, 11);
					myNode.setLink(myNodeTemp);
					myNodeTemp.setPrevious(myNode);
					myNode = myNodeTemp;
				}   

				if(myNode.getInfo().equals('*')) 
					{
		 				startingNode = myNode;
		 			}
		 	}
		myNode = t;
		//Above line links back together all the nodes, so no gaps.

		System.out.println("");
		
		System.out.println("(0, 0) will start from top left, incrementing from left to right for x-values and incrementing from top to bottom the y-values.");
		System.out.println("");
		System.out.print("Starting from coordinates " + "(" + (startingNode.x - 1)+ ", " + (startingNode.y -1)+ ")" + ", -> ");

		//We create a LinkedStack called solution, and push our coordinates that we can move to into the stack. 
		LinkedStack<LLNode> solution = new LinkedStack<LLNode>();
		
		while(!startingNode.getInfo().equals('E')) {
				if(((startingNode.getLink().getInfo().equals('0') 
					|| startingNode.getLink().getInfo().equals('E')) 
						&& (startingNode.y == startingNode.getLink().y)))
						{	
					startingNode.setInfo('1');
					startingNode = startingNode.getLink();
					//We push out solution to the the stack, then add it onto a custom string lastAns, via 
					//the toString method we created inside LinkedStack.
					solution.push(startingNode);
					totalCounterPushed++;
						}
						else if(((startingNode.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getInfo().equals('0')
						|| startingNode.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getInfo().equals('E'))))
						{
						startingNode.setInfo('1');
						startingNode = startingNode.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink();
						solution.push(startingNode);
						totalCounterPushed++;
						}
						else if((startingNode.getPrevious().getInfo().equals('0') 
						|| startingNode.getPrevious().getInfo().equals('E')) && (startingNode.y == startingNode.getPrevious().y)) 
						{
						startingNode.setInfo('1');
						startingNode = startingNode.getPrevious();
						solution.push(startingNode);
						totalCounterPushed++;
						} 
						else if((startingNode.getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getInfo().equals('0') 
						|| startingNode.getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getInfo().equals('E'))) 
						{
						startingNode.setInfo('1');
						startingNode = startingNode.getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious();
						solution.push(startingNode);
						totalCounterPushed++;
						}
						else if(startingNode.getLink().getInfo().equals('1') &&
						startingNode.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getInfo().equals('1') && 
						startingNode.getPrevious().getInfo().equals('1') &&
						startingNode.getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getInfo().equals('1')) {
						System.out.println("NO WAY TO GET TO EXIT");
						System.exit(0);
						//If no way out, print No way out, and exit.
			}
			
		}
		while(totalCounterPushed > 0) {
			publishAnswer = solution.top() + publishAnswer;
			solution.pop();
			totalCounterPushed--;
		}
		System.out.print(publishAnswer);
		//Print publishAnswer, which was obtained from our LinkedStack toString method.
		
		System.out.println("");
   }
   //Code below checks to make sure input is valid
	public static boolean checkInput(String str) {
		if(str.length() != 10) {
			System.out.println("Input length was not 10 places or invalid character entry");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			if(!str.substring(i, i + 1).equals("*") && !str.substring(i, i + 1).equals("1") && 
				!str.substring(i, i + 1).equals("0") && !str.substring(i, i + 1).equals("E")) {
				System.out.println("Text file invalid, only put in one '*', and '1', '0' or 'E'!");
				return false;
			}
			/*
			Code below ensures only one starting and ending point is entered into the program.
			*/
			 if(str.substring(i, i + 1).equals("*")) {
					if(startingPointCounter > 0) {
						System.out.println("More than one starting point entered.");
			 			return false;
					}
			 		startingPointCounter++;
				}
			 if(str.substring(i, i + 1).equals("E")) {
					if(endingPointCounter > 0) {
						System.out.println("More than one ending point entered");
			 			return false;
					}
			 		endingPointCounter++;
				}
		}
		return true;	
	}
}
