package Algos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColdFusionTagChecker {

    // List of self-closing or non-closing tags
    private static final String[] SELF_CLOSING_TAGS = {
            "cfif", "cfset", "cfelse", "cfelseif", "br", "hr", "img", "input", "meta", "link"
    };

    // Method to check if a tag is self-closing
    private static boolean isSelfClosingTag(String tag) {
        for (String selfClosingTag : SELF_CLOSING_TAGS) {
            if (selfClosingTag.equalsIgnoreCase(tag)) {
                return true;
            }
        }
        return false;
    }

    // Method to check tag integrity
    public static boolean checkTagIntegrity(String code) {
        Stack<String> tagStack = new Stack<>();
        Pattern tagPattern = Pattern.compile("<(/?)([a-zA-Z]+)(.*?)>");
        Matcher matcher = tagPattern.matcher(code);

        while (matcher.find()) {
            String tag = matcher.group(2);
            boolean isClosingTag = matcher.group(1).equals("/");

            if (isSelfClosingTag(tag)) {
                continue; // Skip self-closing tags
            }

            if (isClosingTag) {
                if (tagStack.isEmpty() || !tagStack.pop().equalsIgnoreCase(tag)) {
                    return false; // Mismatched closing tag
                }
            } else {
                tagStack.push(tag);
            }
        }

        return tagStack.isEmpty(); // Return true if all tags are matched
    }

    // Method to read code from file
    public static String readCodeFromFile(String filePath) throws IOException {
        StringBuilder code = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                code.append(line).append("\n");
            }
        }
        return code.toString();
    }

    public static void main(String[] args) {
        String filePath = "C:\\CF\\mentor\\mentor\\src\\WEB-INF\\cfc\\committee\\newui\\ProtocolParService.cfc";
        try {
            String coldfusionCode = readCodeFromFile(filePath);
            boolean isValid = checkTagIntegrity(coldfusionCode);

            if (isValid) {
                System.out.println("The ColdFusion code has valid tag integrity.");
            } else {
                System.out.println("The ColdFusion code has invalid tag integrity.");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
