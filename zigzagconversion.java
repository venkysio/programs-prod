/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for ZigZag Conversion*/
class ZigzagConversion {
    public static String convert(String s, int numRows) {
        // If numRows is equal to 1, the zigzag pattern is just the input string s
        if(numRows == 1) {
            return s;
        }

        // Create an array of StringBuilder objects to represent each row in the zigzag pattern
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        // Initialize variables for the current row index and direction of traversal
        int index = 0;
        int direction = 1;

        // Iterate over each character in the input string s
        for(int i = 0; i < s.length(); i++) {
            // Append the current character to the StringBuilder object at the current row index
            sb[index].append(s.charAt(i));

            // Update the direction of traversal based on the current row index
            if(index == 0) {
                direction = 1;
            }
            else if(index == numRows - 1) {
                direction = -1;
            }

            // Update the current row index based on direction of traversal
            index += direction;
        }

        // Concatenate all the StringBuilder objects in sb into a single StringBuilder object
        StringBuilder result = new StringBuilder();
        for(StringBuilder row: sb) {
            result.append(row);
        }

        // Return the final string by converting the StringBuilder object to a string
        return result.toString();
    }

    public static void main(String[] args) {
        // providing input string and numRows value
        String s = "Engineer";
        int numRows = 3;

        // Convert the input string to a zigzag pattern then print the result
        String result = convert(s, numRows);
        System.out.println(result);
        
        //Sample output
        // Ennierge
    }
}
