package strings;



public class Fre {
    public static void main(String[] args) {
        String str = "Siddhesh Pathare";    
        
        int freq[] = new int[str.length()];
        
        // Convert string into char array 
        char[] string = str.toCharArray();
        
        int i, j;
        for (i = 0; i < str.length(); i++) {
            // Initialize frequency of current character to 1
            freq[i] = 1;
            
            // Check for duplicates starting from the next character
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    // Increment frequency and mark the duplicate character as visited
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        
        // Display characters and their corresponding frequencies
        System.out.println("Characters and their corresponding frequencies");    
        for (i = 0; i < str.length(); i++) {
            // Print only if the character is not a space and has a non-zero frequency
            if (string[i] != ' ' && string[i] != '0') {
                System.out.println(string[i] + " - " + freq[i]);
            }
        }
    }
}
