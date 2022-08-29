package momento;

import java.util.ArrayList;
import java.util.List;

//Caretaker
public class ArticleHistory {

    private List<ArticleState> allArticles = new ArrayList<>();

    public void push(ArticleState state) {
        allArticles.add(state);
    }

    public ArticleState pop() {
        int lastIndex = allArticles.size() - 2;
        ArticleState lastState = allArticles.get(lastIndex);
        allArticles.remove(lastState);
        return lastState;
    }
}
