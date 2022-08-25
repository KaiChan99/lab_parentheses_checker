import java.util.Stack;

public class ParenthesesChecker {

// Create a stack that holds the characters we want
// create a for loop that looks for the parentheses
// if the character meets our condition, put it in the stack
// compare the next character to see if it matches what we are looking for
//    if it does, pop it out of stack [essentially remove it from stack]
//    Need to figure out how to ignore alphabet characters
public boolean checkParentheses(String input) {

    input = input.replaceAll("[abcdefghijklmnopqrstuvwxyz]","");
    input = input.replaceAll("\\s+","");

    // Create a stack named container to hold characters we want
    Stack<Character> container = new Stack<Character>();

    char[] chars = input.toCharArray();



        for (char current : chars) {
            if (current == '(' || current == '{' || current == '[') {
                container.push(current);

            } else {
                if (container.isEmpty()) {
                    return false;
                } else if ((current == ')' && container.peek() != '('
                        || (current == '}' && container.peek() != '{')
                        || (current == ']' && container.peek() != '['))) {
                    return false;

                } else {
                    container.pop();

                }

            }

        }
        return container.isEmpty();

    }
}



