package test_program;

// Level 1 Support
public class Level1Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, String severity) {
        if (severity.equalsIgnoreCase("Low")) {
            System.out.println("Level 1 Support: Handling issue - " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, severity);
        }
    }
}

