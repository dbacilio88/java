package com.bxcode.functional.functions.test;

import com.bxcode.functional.dto.Employee;
import com.bxcode.functional.dto.Product;
import com.bxcode.functional.functions.contracts.IDatabaseService;
import com.bxcode.functional.functions.contracts.IGenericDatabaseService;
import com.bxcode.functional.functions.implementations.EmployeeDatabaseService;
import com.bxcode.functional.functions.implementations.MongoDatabaseService;
import com.bxcode.functional.functions.implementations.PostgresDatabaseService;
import com.bxcode.functional.functions.implementations.ProductDatabaseService;
import lombok.extern.log4j.Log4j2;

import java.util.List;


/**
 * AppInterfaces
 * <p>
 * AppInterfaces class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 27/05/2024
 */
@Log4j2
public class AppInterfaces {


    public static void main(String[] args) {

        IDatabaseService postgres = new PostgresDatabaseService();
        IDatabaseService mongo = new MongoDatabaseService();
        EmployeeDatabaseService employee = new EmployeeDatabaseService();
        ProductDatabaseService product = new ProductDatabaseService();

        log.info("postgres {} ", postgres.getById(1L));
        log.info("mongo: {}", mongo.getAll());

        log.info("employee: {}", employee.getById(1L));
        log.info("product: {}", product.getById(1L));

        log.info(Product.class.getName());
        log.info(Employee.class.getName());


        IGenericDatabaseService<String> anonymousService = new IGenericDatabaseService<String>() {
            @Override
            public String getById(long id) {
                return "Id anonymousService";
            }

            @Override
            public List<String> getAll() {
                return List.of("anonymousService", "database service");
            }
        };
        log.info("anonymous: {}", anonymousService);

        IGenericDatabaseService<Employee> service = new EmployeeDatabaseService();

        log.info("service employee: {}", service.getAll());
    }
}


