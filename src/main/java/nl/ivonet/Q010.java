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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Ivo Woltring
 */
public class Q010 {
    public static void main(String[] args) {
        String baseString = "Bijgewerkt tot: 30 november 2017 15:39. Nieuwe bundel: 20 december 2017";
        String baseStringEdited = baseString
                .replaceAll(" januari ", " 01 ")
                .replaceAll(" februari ", " 02 ")
                .replaceAll(" maart ", " 03 ")
                .replaceAll(" april ", " 04 ")
                .replaceAll(" mei ", " 05 ")
                .replaceAll(" juni ", " 06 ")
                .replaceAll(" juli ", " 07 ")
                .replaceAll(" augustus ", " 08 ")
                .replaceAll(" september ", " 09 ")
                .replaceAll(" oktober ", " 10 ")
                .replaceAll(" november ", " 11 ")
                .replaceAll(" december ", " 12 ")
                .replaceAll(" 1 ", " 01 ")
                .replaceAll(" 2 ", " 02 ")
                .replaceAll(" 3 ", " 03 ")
                .replaceAll(" 4 ", " 04 ")
                .replaceAll(" 5 ", " 05 ")
                .replaceAll(" 6 ", " 06 ")
                .replaceAll(" 7 ", " 07 ")
                .replaceAll(" 8 ", " 08 ")
                .replaceAll(" 9 ", " 09 ");

        String dateOne = baseStringEdited.substring(16, 26);
        String dateTwo = baseStringEdited.substring(49);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd MM yyyy");
        String input = dateOne;
        String input2 = dateTwo;
        Long diff = null;

        try {
            Date dateOneFormatted = dateFormatter.parse(input);
            Date dateTwoFormatted = dateFormatter.parse(input2);
            diff = dateOneFormatted.getTime() - dateTwoFormatted.getTime();

        } catch (ParseException e) {
            System.out.println("Unparseable using " + dateFormatter);
        }

        System.out.println(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));


    }
}
