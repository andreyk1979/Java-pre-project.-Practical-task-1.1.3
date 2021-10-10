package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();

//  Создание таблицы User(ов)
        userService.createUsersTable();

//  Добавление 4 User(ов) в таблицу с данными на свой выбор.После каждого добавления должен быть вывод в консоль ( User с именем – name добавлен в базу данных )
        userService.saveUser("Андрей1 ", " Куимов1 ", (byte) 41);
        userService.saveUser("Андрей2 ", " Куимов2 ", (byte) 42);
        userService.saveUser("Андрей3 ", " Куимов3 ", (byte) 43);
        userService.saveUser("Андрей4 ", " Куимов4 ", (byte) 44);
//  Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
        List<User> allUsers = userService.getAllUsers();
        for (User user : allUsers) {
            System.out.println(user);

        }
//  Очистка таблицы User(ов)
        userService.cleanUsersTable();
//  Удаление таблицы
        userService.dropUsersTable();
    }
}


