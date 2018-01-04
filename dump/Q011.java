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
import java.util.Map;

/**
 * @author Ivo Woltring
 */
public class Q011 {

    public class Student {

        private int id = 0;
        private String name;
        private String surname;
        private Map<Subject, List<Grade>> grades;
        private List<Absence> absences;

    }

    static class Subject {
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }
    }

    class Absence {

        private Q011.Term term;
        private String letter;

        public Q011.Term getTerm() {
            return this.term;
        }

        public void setTerm(final Q011.Term term) {
            this.term = term;
        }

        public String getLetter() {
            return this.letter;
        }

        public void setLetter(final String letter) {
            this.letter = letter;
        }
    }

    enum Term {
        FIRST_TERM,
        SECOND_TERM,
        THIRD_TERM
    }


    public static void main(String[] args) {
        Subject subject = new Subject("History");
        Map<Subject, List<Grade>> gradeMap = new HashMap<>();
                List <Grade> grades = new ArrayList<>();

        grades.add(new Grade(Term.FIRST_TERM, 'A'));
        grades.add(new Grade(Term.SECOND_TERM, 'F'));
        grades.add(new Grade(Term.THIRD_TERM, 'B'));
        gradeMap.put(subject, grades);

        student1.setGrades(gradeMap);
    }
}
