import java.util.Date;

public class Application {
    private int applicationId;
    private String status;
    private Date dateApplied;

    public Application(int applicationId) {
        this.applicationId = applicationId;
        this.status = "Pending";
        this.dateApplied = new Date();
    }

    public void submit() {
        System.out.println("Application " + applicationId + " submitted on " + dateApplied);
    }

    // Overloaded submit method
    public void submit(String applicantName) {
        System.out.println("Application " + applicationId + " submitted by " + applicantName + " on " + dateApplied);
    }

    public void withdraw() {
        this.status = "Withdrawn";
        System.out.println("Application " + applicationId + " withdrawn.");
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Application " + applicationId + " status updated to " + newStatus);
    }

    public String getStatus() {
        return status;
    }

    public int getApplicationId() {
        return applicationId;
    }
}
