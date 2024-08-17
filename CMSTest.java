package cms;
public class CMSTest {
    private CMS cms;
    private User admin;
    private User editor;
    private User viewer;

    @BeforeEach
    void setUp() {
        cms = new CMS();
        admin = new User("AdminUser", Role.ADMIN);
        editor = new User("EditorUser", Role.EDITOR);
        viewer = new User("ViewerUser", Role.VIEWER);
    }

    @Test
    void testCreateContentWithAdmin() {
        cms.createContent(admin, "Title 1", "Body 1");
        assertEquals(1, cms.getContents().size());
    }

    @Test
    void testCreateContentWithEditor() {
        cms.createContent(editor, "Title 2", "Body 2");
        assertEquals(1, cms.getContents().size());
    }

    @Test
    void testCreateContentWithViewer() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            cms.createContent(viewer, "Title 3", "Body 3");
        });
        assertEquals("User  have no permission to create content.", exception.getMessage());
    }

    @Test
    void testPublishContentWithAdmin() {
        Content content = new Content("Title 4", "Body 4");
        cms.createContent(admin, content.getTitle(), content.getBody());
        cms.publishContent(admin, content);
        assertTrue(content.isPublished());
    }

    @Test
    void testPublishContentWithEditor() {
        Content content = new Content("Title 5", "Body 5");
        cms.createContent(editor, content.getTitle(), content.getBody());

        Exception exception = assertThrows(RuntimeException.class, () -> {
            cms.publishContent(editor, content);
        });
        assertEquals("User have no permission to publish content.", exception.getMessage());
    }
}