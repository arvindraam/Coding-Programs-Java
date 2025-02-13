package test_program;

// Level 3 Support
public class Level3Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, String severity) {
        if (severity.equalsIgnoreCase("High")) {
            System.out.println("Level 3 Support: Handling issue - " + issue);
        } else {
            System.out.println("Severity level not supported: " + severity);
        }
    }
}
