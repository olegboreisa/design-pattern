package momento;

//Originator
public class ArticleState {

    private String content;

    public String getContent() {
        return content;
    }

    public void setArticle(String article) {
        this.content = article;
    }

    public ArticleMemento writeAnArticle() {
        return new ArticleMemento(content);
    }

    public void undo(ArticleMemento state) {
        content = state.getContent();
    }
}
