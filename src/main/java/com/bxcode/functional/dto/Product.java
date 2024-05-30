package com.bxcode.functional.dto;

import com.bxcode.functional.lambda.contracts.IApplyDiscount;
import lombok.*;

import java.io.Serializable;

/**
 * Product
 * <p>
 * Product class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 27/05/2024
 */

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product implements Serializable {
    private static final long serialVersionUID = -862922632105912306L;

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String type;
    private IApplyDiscount applyDiscount;
}


