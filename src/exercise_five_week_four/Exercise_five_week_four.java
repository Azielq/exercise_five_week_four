package exercise_five_week_four;
import java.util.Scanner;
import java.util.Stack;

public class Exercise_five_week_four {

    Stack < String > stack_a = new Stack < String> ();
    Stack < String > stack_b = new Stack < String> ();
    public String element, new_element_one_stack_a, new_element_one_stack_b;
    public int count;
    /**
     * @param args the command line arguments
     */

    public void inserting_elements_in_stack_b(){
        Scanner read = new Scanner(System.in);
        System.out.println("What is the new element that you wanna insert?: ");
        String new_element = read.nextLine();
        stack_b.push(new_element);
        // count = 6;);
        // System.out.println("Do you wanna insert another element?[s/n]: ");
        int option;
        do{
            Scanner read_one = new Scanner(System.in);
            System.out.println("Do you wanna insert another element?[s(1)/n(0)]: ");
            option = read_one.nextInt();
            switch(option) {
                case 1: System.out.println("What is the new element that you wanna insert?: ");
                        new_element_one_stack_b = read.nextLine();
                        stack_b.push(new_element_one_stack_b);
                break;
                case 0:System.out.println("This is are the values for stack_b: " + stack_b);break;
            }
            System.out.println();
        } while(option != 0);
    }

    public void inserting_elements_stack_a(){
        Scanner read = new Scanner(System.in);
        System.out.println("Give a element for the stack_a: ");
        element = read.nextLine();
        stack_a.push(element);

        int option;
        do{
            Scanner read_one = new Scanner(System.in);
            System.out.println("Do you wanna insert another element?[s(1)/n(0)]: ");
            option = read_one.nextInt();
            switch(option) {
                case 1: System.out.println("What is the new element that you wanna insert?: ");
                        new_element_one_stack_a = read.nextLine();
                        stack_a.push(new_element_one_stack_a);
                break;
                case 0:System.out.println("This is are the values for stack_a: " + stack_a);break;
            }
            System.out.println();
        } while(option != 0);
    }

    public void transferring_data_to_stackA_to_stackB(){
        // stack_b.push(new_element_one_stack_a);
        for(String i: stack_a){
            stack_b.push(i);
        }
        if (stack_a.empty() != true){
            stack_a.clear();
        }
        System.out.println("Now this is the stack_b " + stack_b);
    }


    public void stack_view(){
        System.out.println("This the stack_a: " + stack_a);
        System.out.println("This is the stack_b: " + stack_b);
    }
    public static void main(String[] args){
        Exercise_five_week_four call = new Exercise_five_week_four();
        int position = 0;
        do{    
            System.out.println("*****************************************************");
            System.out.println("******    Stack Maintenance   ***********************");
            System.out.println("*****************************************************");
            System.out.println("* 1- Insert elements in stack a                      *");
            System.out.println("* 2- Transfer elements from one stack a to stack b   *");
            System.out.println("* 3- Inser elements in stack b                       *");
            System.out.println("* 4- View the state of the stack a & b               *");
            System.out.println("* 5- Get out                                         *");
            System.out.println("******************************************************");
            System.out.println("Give me the position that you wish: ");
            Scanner read = new Scanner(System.in);
            position = read.nextInt();
            switch(position){
                case 1: call.inserting_elements_stack_a(); break;
                case 2: call.transferring_data_to_stackA_to_stackB(); break;
                case 3: call.inserting_elements_in_stack_b(); break;
                case 4: call.stack_view(); break;
                case 5: break;
            }
        } while(position != 5);
        
    }
}    
