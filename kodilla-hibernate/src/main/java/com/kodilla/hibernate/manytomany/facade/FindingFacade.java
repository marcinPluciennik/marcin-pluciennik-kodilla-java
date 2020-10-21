package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindingFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(FindingFacade.class);

    public List<Company> findCompany(String name) {
        LOGGER.info("Start to find companies");
        List<Company> companies = companyDao.retrieveCompanyByString(name);
        if (companies.size() > 0) {
            LOGGER.info("I found something");
        } else {
            LOGGER.error(FindingException.ERR_EMPTY_TABLE);
        }
        return companies;
    }

    public List<Employee> findEmployee(String lastname) {
        LOGGER.info("Start to find employees");
        List<Employee> employees = employeeDao.retrieveEmployeeByString(lastname);
        if (employees.size() > 0) {
            LOGGER.info("I found something");
        } else {
            LOGGER.error(FindingException.ERR_EMPTY_TABLE);
        }
        return employees;
    }
}
