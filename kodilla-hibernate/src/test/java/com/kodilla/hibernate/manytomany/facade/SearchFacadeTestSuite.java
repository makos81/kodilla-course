package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    SearchFacade searchFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void shouldFindCompanyByLetters() throws CompanyNotFoundException{
        Company companyA = new Company("ABC");
        Company companyB = new Company("company delta");
        Company companyC = new Company("abccompany");

        companyDao.saveAll(List.of(companyA, companyB, companyC));

        List<Company> result = searchFacade.findCompany("ab");

        Assertions.assertEquals(2, result.size());

        companyDao.deleteAll(List.of(companyA, companyB, companyC));

    }

    @Test
    public void shouldFindEmployeeByLetters() throws EmployeeNotFoundException{
        Employee employee1 = new Employee("maciej", "raj");
        Employee employee2 = new Employee("taduesz", "kosciuszko");
        Employee employee3 = new Employee("adam", "wozny");
        Employee employee4 = new Employee("mateusz", "raj");

        employeeDao.saveAll(List.of(employee1, employee2, employee3, employee4));
        List<Employee> result = searchFacade.findEmployee("ra");

        Assertions.assertEquals(2, result.size());

        employeeDao.deleteAll(List.of(employee1, employee2, employee3, employee4));
    }

}
