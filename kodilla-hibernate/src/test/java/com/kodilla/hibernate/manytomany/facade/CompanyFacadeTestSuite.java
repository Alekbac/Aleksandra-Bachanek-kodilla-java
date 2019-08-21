package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void companyTest(){
        //Given
        Company company1 = new Company("Microsoft");
        Company company2 = new Company("Ubisoft");
        Company company3 = new Company("Apple");

        //When
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        List<Company> result = companyFacade.searchName("oft");

        //Then
        Assert.assertEquals( 2, result.size() );

        //CleanUp
        try {
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void employeeTest(){
        //Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Ellen", "Kenny");
        Employee employee3 = new Employee("Bob", "Kith");

        //When
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        List<Employee> result =  companyFacade.searchEmployee("ith");

        //Then
        Assert.assertEquals( 2, result.size() );

        //CleanUp
        try {
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
            employeeDao.delete(employee3);
        } catch (Exception e) {
            //do nothing
        }
    }
}
