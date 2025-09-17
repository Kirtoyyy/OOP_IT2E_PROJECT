public class Job {
    private int jobId;
    private String title;
    private String description;
    private String requirements;
    private String status;

    public Job(int jobId, String title, String description, String requirements) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.requirements = requirements;
        this.status = "Open";
    }

    public void postJob() {
        System.out.println("Job posted: " + title);
    }

    public void updateJob(String newDescription) {
        this.description = newDescription;
        System.out.println("Job updated: " + description);
    }

    public void closeJob() {
        this.status = "Closed";
        System.out.println("Job closed: " + title);
    }

    public String getTitle() {
        return title;
    }
}
