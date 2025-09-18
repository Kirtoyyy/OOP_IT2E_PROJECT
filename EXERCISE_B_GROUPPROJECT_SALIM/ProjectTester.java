public class ProjectTester {
    public static void main(String[] args) {
        // Create Admin
        Admin admin = new Admin(1, "Jason", "jasonsalim2006@gmail.com", "mypassword");
        admin.login();

        // Create Job
        Job job1 = new Job(101, "Data Analyst", "Analyze datasets and generate business insights", "SQL, Python, Data Visualization");
        job1.postJob();

        // Create Applicant
        Applicant applicant = new Applicant(3, "Alice", "alice@example.com", "alicepass", "Alice_Resume.pdf", "Python, SQL, Excel");
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
