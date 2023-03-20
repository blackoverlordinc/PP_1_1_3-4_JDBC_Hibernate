package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Alexandr", "Bolotov", (byte) 30);
        userDao.saveUser("German", "Sevostianov", (byte) 30);
        userDao.saveUser("Java", "Mentor", (byte) 30);
        userDao.saveUser("Sergey", "Kadushkin", (byte) 24);

        userDao.removeUserById(3);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
    }

