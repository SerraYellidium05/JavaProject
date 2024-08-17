package cms;

public class Content {
    private Stirng title;
    private String body;
    private boolean isPublished;

    public Content(String title,Stirng body){
        this.title=title;
        this.body=body;
        this.isPublished=fales;
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
