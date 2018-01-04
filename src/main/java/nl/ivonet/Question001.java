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

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ivo Woltring
 */
public class Question001 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int memberChoice;
        boolean accountLoop = true;
        while (accountLoop) {
            try {
                System.out.println("Would you like to be a... \n1.Basic Member or \n2.Premium member\n: ");
                memberChoice = input.nextInt();
                if (memberChoice == 1 || memberChoice == 2) {
                    accountLoop = false;
                }
                if (memberChoice < 1 || memberChoice > 2) {
                    System.out.println("Please choose either 1 or 2");
                }
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                input = new Scanner(System.in);
            }
        }
    }
}
