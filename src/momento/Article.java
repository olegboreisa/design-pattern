package momento;

//Originator
public class Article {

    private String content;

    public String getContent() {
        return content;
    }

    public void setArticle(String article) {
        this.content = article;
    }

    public ArticleState writeAnArticle() {
        return new ArticleState(content);
    }

    public void remove(ArticleState state) {
        content = state.getContent();
    }
}
