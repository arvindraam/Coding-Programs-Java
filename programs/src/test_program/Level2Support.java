package test_program;

// Level 2 Support
public class Level2Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, String severity) {
        if (severity.equalsIgnoreCase("Medium")) {
            System.out.println("Level 2 Support: Handling issue - " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, severity);
        }
    }
}
