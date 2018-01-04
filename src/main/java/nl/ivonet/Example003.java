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

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ivo Woltring
 */
public class Example003 {


    public static void main(String[] args) {
            Map<String, Integer> wordcount = new HashMap<>();
            wordcount.put("two", 20);
            wordcount.put("five", 50);
            wordcount.put("three", 30);
            wordcount.put("four", 40);
            wordcount.put("one", 10);
            wordcount.put("six", 60);
            wordcount.put("eight", 80);
            wordcount.put("twelve", 1);
            wordcount.put("nine", 90);
            wordcount.put("ten", 100);
            wordcount.put("seven", 70);
            wordcount.put("eleven", 1);
            wordcount.put("15", 1);
            wordcount.put("13", 2);
            wordcount.put("16", 4);
            wordcount.put("14", 3);
            wordcount.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .limit(10)
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new
                    )).forEach((s, integer) -> System.out.println(String.format("%s : %s", s, integer)));

    }
}


