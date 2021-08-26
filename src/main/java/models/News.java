package models;

public class News {
    private String heading;
    private String content;
    private String writtenBy;
    private String type;
    private int departmentId;

    private int id;


    public News(String heading, String content, String writtenBy, String type) {
        this.heading = heading;
        this.content = content;
        this.writtenBy = writtenBy;
        this.type = "Organisational news";
    }

    public News(String heading, String content, String writtenBy, String type, int departmentId) {
        this.heading = heading;
        this.content = content;
        this.writtenBy = writtenBy;
        this.type = "Departmental news";
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

    public String getWrittenBy() {
        return writtenBy;
    }

    public void setWittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }

    public String getType() {
        return  type;
    }

    public void setType(String Organisational_news) {
        this.type = Organisational_news;
    }

    public int getDepartmentId() {
        return departmentId;
    }
}
