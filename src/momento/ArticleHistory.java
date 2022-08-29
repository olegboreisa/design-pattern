package momento;

import java.util.ArrayList;
import java.util.List;

//Caretaker
public class ArticleHistory {

    private List<ArticleMemento> articleStates = new ArrayList<>();

    public void push(ArticleMemento state) {
        articleStates.add(state);
    }

    public ArticleMemento pop() {
        int lastIndex = articleStates.size() - 2;
        ArticleMemento lastState = articleStates.get(lastIndex);
        articleStates.remove(lastState);
        return lastState;
    }
}
