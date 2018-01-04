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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Ivo Woltring
 */
public class Translate {

    private HashMap<String, String> dictionary = new HashMap();

        public boolean isInDictionary(String word) {
            return dictionary.containsKey(word);
        }

        public String translateSentence(String sentence) {
            StringBuilder result = new StringBuilder();
            String[] splittedStrings = sentence.trim().split(" ");

            List<String> list = new ArrayList<>();
            for (String s : splittedStrings) {
                result.append(s);
            }
            return result.toString();
        }

        public String getWord(String word) {
            return dictionary.get(word);
        }

    public static void main(String[] args) {
        System.out.println(new Translate().translateSentence("the centence"));
    }
}
