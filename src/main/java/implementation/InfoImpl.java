package implementation;

import entities.Person;
import interfaces.Information;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoImpl implements Information {
    @Override
    public ArrayList<Person> getAllPeople() {
        return null;
    }

    @Override
    public ArrayList<Person> getAllPeople(ResultSet resultSet) throws SQLException {
        ArrayList<Person> personArrayList = new ArrayList<>();
        while (resultSet.next()) {
            Person person = new Person(resultSet.getInt("id"), resultSet.getString("name"),
                    resultSet.getInt("age"));
            personArrayList.add(person);
        }
        return personArrayList;
    }
}
