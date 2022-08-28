package newspaper;

import office.model.Director;

public interface Subject {

    void subscribe(Director director);

    void upload(String title);

    void inform();

}
