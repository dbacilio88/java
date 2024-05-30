package com.bxcode.functional.functions.implementations;

import com.bxcode.functional.functions.contracts.IDatabaseService;

import java.util.List;

/**
 * MongoDatabaseService
 * <p>
 * MongoDatabaseService class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 27/05/2024
 */
public class PostgresDatabaseService implements IDatabaseService {
    @Override
    public String getById(long id) {
        return "Getting data From Postgres Database";
    }

    @Override
    public List<String> getAll() {
        return List.of("Hello World", "Tomorrow", "Postgres DB");
    }
}


