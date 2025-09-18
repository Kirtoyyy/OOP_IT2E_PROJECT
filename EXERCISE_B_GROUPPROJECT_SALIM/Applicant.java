public class Applicant extends User {
    private final String resume;
    private final String skills;

    public Applicant(int userId, String name, String email, String password, String resume, String skills) {
        super(userId, name, email, password, "Applicant");
        this.resume = resume;
        this.skills = skills;
    }

    public void register() {
        System.out.println(name + " registered as applicant.");
    }

    public void applyJob(Job job) {
        System.out.println(name + " applied for job: " + job.getTitle());
    }

    public void viewApplicationStatus(Application application) {
        System.out.println("Application status: " + application.getStatus());
    }
}
