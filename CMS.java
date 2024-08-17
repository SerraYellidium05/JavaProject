import java.util.ArrayList;
import java.util.List;
public class CMS {
    private List<Content> contents;
}
    public CMS(){
        this.contents=new ArrayList<>();
    }

    public void createContent(User user,String title,String body){
        if(user.getRole()==Role.EDITOR || user.getRole()==Role.ADMIN){
            contents.add(new Content(title,body));
        }
        else{
            throw new RuntimeException("USer have no permission to create content");
        }
    }
    public void publishContent(User user, Content content) {
        if (user.getRole() == Role.ADMIN) {
            content.publish();
        } else {
            throw new RuntimeException("User have no permission to publish content.");
        }
    }

    public List<Content> getContents() {
        return contents;
    }



