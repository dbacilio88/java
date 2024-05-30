package com.bxcode.functional.functions.contracts;

import java.util.List;

/**
 * IDatabaseService
 * <p>
 * IDatabaseService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 27/05/2024
 */
public interface IDatabaseService {

    String getById(long id);

    List<String> getAll();
}
