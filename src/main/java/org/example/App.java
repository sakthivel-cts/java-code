package org.example;

import org.example.anotherlogger.ExampleLogger;
import org.example.creationaldesignpatterns.*;
import org.example.logger.LoggerUtility;
import org.example.model.User;
import org.example.repository.DBConnection;
import org.example.repository.UserRepository;
import org.example.utility.DisplayMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
//        LoggerUtility loggerUtility = new LoggerUtility();
//        loggerUtility.logFunction();
//        ExampleLogger exampleLogger = new ExampleLogger();
//
//        loggerUtility.functionalityOfSlf4j();
//        exampleLogger.exampleLogger();


//        DBConnection dbConnection = new DBConnection();
//        DisplayMethods displayMethods = new DisplayMethods();
//
//        Connection conn = dbConnection.dbConnection(
//                "jdbc:mysql://localhost:3306/cognizant",
//                "root",
//                "root"
//        );
//
//        UserRepository userRepository = new UserRepository(conn);
//
//        ResultSet rs = userRepository.getAllUsers();
//
//        if(rs!=null) displayMethods.displayResultSet(rs);

//        SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getInstance();


//        System.out.println("Enter bank name :");
//        String str = sc.nextLine();
//        RBIBank bank = RBIFactory.getBank(str);
//
//        System.out.println(bank.balance());

//        User user = new UserBuilder()
//                .setName("Sakthivel")
//                .setAge(21)
//                .build();
    }
}
