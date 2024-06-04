package com.bxcode.test;

import lombok.extern.log4j.Log4j2;

import java.util.Stack;

/**
 * TestEncora
 * <p>
 * TestEncora class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 3/06/2024
 */

@Log4j2
public class TestEncora {

    public static void main(String[] args) {
        final String string = "[{}]";

        boolean a = isInvalid(string);
        log.info("result {}", a);

    }

    private static boolean isInvalid(String string) {

        Stack<Character> stack = new Stack<>();

        for (Character character : string.toCharArray()) {
            if (character == '[' || character == '{' || character == '(') {
                stack.push(character);
            } else if (character == ')' || character == '}' || character == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((character == ')' && top != '(') ||
                        (character == '}' && top != '{') ||
                        (character == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}