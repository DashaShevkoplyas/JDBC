package interfaces;

import entities.Person;

public interface SqlQueries {
    String selectAll();

    String selectCondition();

    String insert(Person person);

    String update();

    String delete(int id);
}
