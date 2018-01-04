/*
 * Copyright 2017 Ivo Woltring <WebMaster@ivonet.nl>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.ivonet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ivo Woltring
 */
public class Q005 {


    public static void main(final String[] args) throws IOException {
        final String content = new String(Files.readAllBytes(Paths.get("/Users/ivonet/dev/StackOverflow/src/main/java/nl/ivonet/input.txt")));
        final List<String> words = Arrays.asList(content.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "").replace("\n", " ").split(" "));

        final Map<String, Integer> wordlist = new HashMap<>();
        words.stream()
                .map(String::toLowerCase)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .forEach(s -> {
                    wordlist.computeIfPresent(s, (s1, integer) -> ++integer);
                    wordlist.putIfAbsent(s, 1);
                });

        final StringBuilder sb = new StringBuilder();
        wordlist.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                )).forEach((s, integer) -> sb.append(s).append(" : ").append(integer).append("\n"));

        Files.write(Paths.get("/Users/ivonet/dev/StackOverflow/src/main/java/nl/ivonet/output.txt"), sb.toString().getBytes());

    }
}
