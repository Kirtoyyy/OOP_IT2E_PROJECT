public class ProjectTester {
    public static void main(String[] args) {
        // Runtime polymorphism
        User user1 = new Applicant(2, "Kirt", "basog.122@mail.hatdog123", "secret", "Resume.pdf", "Script, SQL");
        User user2 = new Admin(1, "Alice", "alice@jobportal.com", "pass123");

        user1.login();  // calls Applicant login
        user2.login();  // calls Admin login

        // Compile-time polymorphism (method overloading)
        Applicant applicant = new Applicant(3, "Charlie", "charlie@mail.com", "pass321", "Resume.docx", "Python");
        Job job = new Job(101, "Software Developer", "Develop Java apps", "Java, OOP");

        applicant.applyJob(job); // normal apply
        applicant.applyJob(job, "Here is my cover letter."); // overloaded apply

        Application app1 = new Application(1001);
        app1.submit();
        app1.submit("Charlie"); // overloaded submit

        // Job update (overloaded)
        job.updateJob("Develop Java and Spring Boot apps");
        job.updateJob("Full-stack development", "Java, React");
    }
}
