package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        DbManager dbManager = DbManager.getInstance();

        String sqlStatement = "select us.firstname, us.lastname from \n" +
                "issues iss\n" +
                "JOIN\n" +
                "users us\n" +
                "on iss.user_id_assignedto = us.ID\n" +
                "group by iss.user_id_assignedto\n" +
                "having count(*)>=2";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlStatement);

        int resultCounter = 0;
        while(resultSet.next()){
            System.out.println("Name: " + resultSet.getString("firstname") +
                    "lastname: " + resultSet.getString("lastname"));
            resultCounter++;
        }

        String sqlStatementCount = "select count(*) as count from\n" +
                "(select us.firstname, us.lastname from \n" +
                "issues iss\n" +
                "JOIN\n" +
                "users us\n" +
                "on iss.user_id_assignedto = us.ID\n" +
                "group by iss.user_id_assignedto\n" +
                "having count(*)>=2) t";

        ResultSet expectedResultSet = statement.executeQuery(sqlStatementCount);
        int expectedResult = 0;
        if(expectedResultSet.next()){
            expectedResult = expectedResultSet.getInt("count");
        }

        Assertions.assertEquals(expectedResult, resultCounter);

        statement.close();
        resultSet.close();
        expectedResultSet.close();
    }
}
