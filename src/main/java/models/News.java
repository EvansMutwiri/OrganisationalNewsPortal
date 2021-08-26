package models;

public class News {
    private String heading;
    private String content;
    private String writtenBy;
    private int departmentId;

    private int id;

    public News(String heading, String content, String writtenBy, int departmentId) {
        this.heading = heading;
        this.content = content;
        this.writtenBy = writtenBy;
        this.departmentId = departmentId;
    }

    public String getHeading() {
        return heading;
    }

    public String getContent() {
        return content;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }
}
