public class Applicant extends User {
    private String resume;
    private String skills;

    public Applicant(int userId, String name, String email, String password, String resume, String skills) {
        super(userId, name, email, password, "Applicant");
        this.resume = resume;
        this.skills = skills;
    }

    @Override
    public void login() { // runtime polymorphism
        System.out.println("Applicant " + name + " logged in with resume: " + resume);
    }

    public void register() {
        System.out.println(name + " registered as applicant.");
    }

    // Overloaded applyJob method
    public void applyJob(Job job) {
        System.out.println(name + " applied for job: " + job.getTitle());
    }

    public void applyJob(Job job, String coverLetter) {
        System.out.println(name + " applied for job: " + job.getTitle() + " with cover letter: " + coverLetter);
    }

    public void viewApplicationStatus(Application application) {
        System.out.println("Application status: " + application.getStatus());
    }
}
