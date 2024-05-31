package com.bxcode.functional.streams.test;

import com.bxcode.functional.dto.Post;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * AppStreams
 * <p>
 * AppStreams class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 30/05/2024
 */
@Log4j2
public class AppStreams {

    static Predicate<Post> predicate = post -> post.getUserId() == 10;
    static Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
    static Comparator<String> stringComparator = Comparator.naturalOrder();

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/data/data.json");
        ObjectMapper mapper = new ObjectMapper();
        try (Stream<String> lines = Files.lines(path)) {
            StringBuilder sb = new StringBuilder();
            lines.forEach(sb::append);
            String json = sb.toString();
            List<Post> post = mapper.readValue(json, new TypeReference<>() {
            });

            Stream<Post> stream = post.stream();

            List<String> list = stream
                    .filter(predicate)
                    .limit(5)
                    .map(Post::getTitle)
                    .sorted(stringComparator)
                    .collect(Collectors.toList());

            list.forEach(l -> log.info("list titles: {}", l));

        } catch (IOException e) {
            log.error("IOException {}", e.getMessage());
        }
    }
}