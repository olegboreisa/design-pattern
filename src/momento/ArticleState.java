package momento;

//Memento
public class ArticleState {

    private final String content;

    public ArticleState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
