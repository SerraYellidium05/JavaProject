package cms.Content;

public class Content {
	private String title;
    private String body;
    private boolean isPublished;

    public Content(String title,String body){
        this.title=title;
        this.body=body;
        this.isPublished=false;
    }
    public String getTitle(){
        return title;
    }

    public String getBody(){
        return body;
    }

    public boolean isPublished(){
        return isPublished;
    }

    public void publish(){
        this.isPublished=true;
    }
}
