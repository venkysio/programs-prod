//Given a valid (IPv4) IP address, return a defanged version of that IP address.

// A defanged IP address replaces every period "." with "[.]".

// Example 1:

// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
// Example 2:

// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"

// Constraints:

// The given address is a valid IPv4 address.

class VSDDefangingAnIpAddress{

    static String defangIPaddr(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                answer += "[.]";
            } else {
                answer += s.charAt(i);
            }

        }
        return answer;
    }
    public static void main(String args[]){
        String address = "1.1.1.1";
        String s = defangIPaddr(address);
        System.out.println(s);
    }
}


