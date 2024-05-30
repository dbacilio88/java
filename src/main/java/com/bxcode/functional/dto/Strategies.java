package com.bxcode.functional.dto;

import com.bxcode.functional.lambda.contracts.IApplyDiscount;
import lombok.experimental.UtilityClass;

/**
 * Strategies
 * <p>
 * Strategies class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 30/05/2024
 */

@UtilityClass
public class Strategies {

    public static final IApplyDiscount basicDiscount = price -> price * 0.02;
    public static final IApplyDiscount plusDiscount = price -> price * 0.05;
    public static final IApplyDiscount premiumDiscount = price -> price * 0.10;
}


