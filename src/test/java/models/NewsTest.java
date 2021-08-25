package models;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsTest {
    News newsAlpha = new News("Finance","make payments");

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
}