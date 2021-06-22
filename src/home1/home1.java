package home1;
import java.util.*; 

public class home1 {

    public static void main (String[] args) {

        List<Integer> names = new ArrayList<Integer>();
    	Scanner myObj = new Scanner(System.in);  
    for(int i=0;i<2;i++){
    	System.out.println("Enter 1=Add , 2=report , 3=Edit , 4=remove");
        int tion = myObj.nextInt();         
    	    if(tion ==  1) {
    	    	System.out.println("Enter number");
    	    	names.add(myObj.nextInt());
    	    	}    
    	    if (tion == 2 ) {
    	    	System.out.println(names);
    	    	}
    	    if (tion == 3) {
    	    	System.out.println("Enter Editnumber");
    	    	var number = myObj.nextInt();  
    	    	int dannyIndex = names.indexOf(number);
    	    	System.out.println("Enter Newnumber");
    	    	int number1 = myObj.nextInt();  
    	    	names.set(dannyIndex,number1);
    	    	}
    	    if (tion==4) {
    	    	System.out.println("Enter removenumber");
    	    	int number1 = myObj.nextInt(); 
    	    	int dannyIndex = names.indexOf(number1);          
    	    	names.remove(dannyIndex);
    	    	}
    	    i--;
    	}
    }
}   

