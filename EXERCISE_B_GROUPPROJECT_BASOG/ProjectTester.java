public class ProjectTester {
    public static void main(String[] args) {
        // Create Admin
        Admin admin = new Admin(1, "Kirt", "basog.122@gmail.com", "mypassword");
        admin.login();

        // Create Job
        Job job1 = new Job(101, "Software Developer", "Develop Java apps", "Java, OOP");
        job1.postJob();

        // Create Applicant
        Applicant applicant = new Applicant(2, "Bob", "bob@mail.com", "secret", "Resume.pdf", "Java, SQL");
        applicant.register();
        applicant.applyJob(job1);

        // Create Application
        Application app1 = new Application(1001);
        app1.submit();

        // Admin approves application
        admin.approveApplication(app1);

        // Applicant views application status
        applicant.viewApplicationStatus(app1);

        admin.logout();
    }
}
