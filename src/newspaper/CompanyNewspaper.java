package newspaper;

import office.model.Director;

import java.util.ArrayList;
import java.util.List;

public class CompanyNewspaper implements Subject {

    private List<Director> followers = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Director director) {
        followers.add(director);
    }

    @Override
    public void upload(String title) {
        this.title = title;
        inform();
    }

    @Override
    public void inform() {
        for (Director sub : followers) {
            sub.update();
        }
    }

    public List<Director> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Director> followers) {
        this.followers = followers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
