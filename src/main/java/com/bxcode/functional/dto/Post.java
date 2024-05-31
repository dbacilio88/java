package com.bxcode.functional.dto;

import lombok.*;

import java.io.Serializable;

/**
 * Post
 * <p>
 * Post class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 30/05/2024
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post implements Serializable {
    private static final long serialVersionUID = -2879721492665462087L;

    private Long userId;
    private Integer id;
    private String title;
    private String completed;
}


