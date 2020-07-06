package interfaces;

import entities.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface Information {
    ArrayList<Person> getAllPeople();

    ArrayList<Person> getAllPeople(ResultSet resultSet) throws SQLException;
}
