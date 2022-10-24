import java.util.Scanner;
import java.util.Stack;

class MinS {

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;

    public MinS() {
        stack = new Stack<Integer>();
    }
    public void push(int val) {
        if(val <= min){
            stack.push(min);
            min=val;
        }
        stack.push(val);
    }

    public void pop() {
        if(stack.pop() == min)
            min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
public class MinStack
{


    public static void main(String[]args)
    {
        MinS stack =new MinS();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String operation=sc.nextLine();
            if(operation.equals("stop"))
            {
                break;
            }
            else if(operation.equals("push"))
            {
                stack.push(Integer.parseInt(sc.nextLine()));
                System.out.println("null");
            }
            else if (operation.equals("pop"))
            {
                stack.pop();
                System.out.println("null");
            }
            else if (operation.equals("top"))
            {
                int x=stack.top();
                System.out.println(x);
            }
            else if(operation.equals("min"))
            {
                int x=stack.getMin();
                System.out.println(x);
            }

        }
    }
}
