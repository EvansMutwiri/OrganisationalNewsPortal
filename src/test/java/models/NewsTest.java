package models;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsTest {
    News newsOrg =  new News("A G M", "will be virtual", "Evans", "Organisational news");
    News newsAlpha = new News("Finance","make payments", "", "Departmental news", 1);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getHeading_ReturnsCorrectHeading_heading() throws Exception {
        News news = newsAlpha;
        assertEquals("Finance", news.getHeading());
    }

    @Test
    public void getContentReturnsCorrectContent() throws Exception {
        News news = newsAlpha;
        assertEquals("make payments", newsAlpha.getContent());
    }

    @Test
    public void setHeading_setsHeadingCorrectly_Marketing() throws Exception {
        newsAlpha.setHeading("Marketing");
        assertNotEquals("Information tech", newsAlpha.getHeading());
    }

    @Test
    public void setContentCorrectly() throws Exception {
        newsAlpha.setContent("advertise");
        assertNotEquals("make payments", newsAlpha.getContent());
    }

    @Test
    public void getWrittenBy() {

        News newsOrg =  new News("A G M", "will be virtual", "Evans", "Organisational news");
        assertEquals("Evans", newsOrg.getWrittenBy());
    }

    @Test
    public void setWrittenBy() {
        newsOrg.setWittenBy("Smith");
        assertEquals("Smith", newsOrg.getWrittenBy());
    }

    @Test
    public void getType() {
//        News newsOrg =  new News("A G M", "will be virtual", "Evans", "Organisational news");
        assertEquals("Organisational news", newsOrg.getType());
        assertEquals("Departmental news", newsAlpha.getType());
    }

    @Test
    public void setType() {
        News newsOrg =  new News("A G M", "will be virtual", "Evans", "");
        newsOrg.setType("Organisational news");
        assertEquals("Organisational news", newsOrg.getType());

    }

    @Test
    public void getDepartmentId() {
        newsAlpha.getDepartmentId();
        assertEquals(1, newsAlpha.getDepartmentId());
    }

    @Test
    public void setDepartmentId() {
        News newsAlpha = new News("Finance","make payments", "", "Departmental news", 1);
        News newsTest = new News("Finance","make payments", "", "Departmental news", 2);
        assertEquals(2, newsTest.getDepartmentId());
    }
}