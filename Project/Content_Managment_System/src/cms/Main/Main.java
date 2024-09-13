package cms.Main;
import cms.Content.Content;
import cms.value.User;
import cms.value.Value;
public class Main {
	private Value cms;
    private User admin;
    private User editor;
    private User viewer;

    void testCreateContentWithAdmin() throws Exception {
        cms.createContent(admin, "Title 1", "Body 1");
        int contentCount = cms.getContents().size();
        System.out.println("Expected content count: 1, Actual content count: " + contentCount);
    }

    void testCreateContentWithEditor() throws Exception {
        cms.createContent(editor, "Title 2", "Body 2");
        int contentCount = cms.getContents().size();
        System.out.println("Expected content count: 1, Actual content count: " + contentCount);
    }

    void testCreateContentWithViewer() throws Exception {
        try {
            cms.createContent(viewer, "Title 3", "Body 3");
        } catch (RuntimeException e) {
            System.out.println("Viewer prevented from creating content. Caught exception: " + e.getMessage());
        }
    }

  
    void testPublishContentWithAdmin() throws Exception {
        Content content = new Content("Title 4", "Body 4");
        cms.createContent(admin, content.getTitle(), content.getBody());
        cms.publishContent(admin, content);
        System.out.println("Admin published content. Content published: " + content.isPublished());
    }

    void testPublishContentWithEditor() throws Exception {
        Content content = new Content("Title 5", "Body 5");
        cms.createContent(editor, content.getTitle(), content.getBody());

        try {
            cms.publishContent(editor, content);
        } catch (RuntimeException e) {
            System.out.println("Editor prevented from publishing content. Caught exception: " + e.getMessage());
        }
    }
}