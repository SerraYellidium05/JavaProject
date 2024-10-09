package cms.value;
import java.util.ArrayList;
import java.util.List;

import cms.Role;
import cms.Content.Content;

public class Value {
	private List<Content> contents;

public Value(){
	this.contents=new ArrayList<>();
}

public void createContent(User user,String title,String body){
    if(user.getRole1()==Role.EDITOR || user.getRole1()==Role.ADMIN){
        contents.add(new Content(title,body));
    }
    else{
        throw new RuntimeException("USer have no permission to create content");
    }
}
public void publishContent(User user, Content content) {
    if (user.getRole1() == Role.ADMIN) {
        content.publish();
    } else {
        throw new RuntimeException("User have no permission to publish content.");
    }
}

public List<Content> getContents() {
    return contents;
}
}

