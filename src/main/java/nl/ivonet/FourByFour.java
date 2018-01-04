/*
 * Copyright 2016 Ivo Woltring <WebMaster@ivonet.nl>
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
import java.util.List;

/**
 * http://stackoverflow.com/questions/38000717/how-do-i-format-my-output-as-a-4-by-4-matrix
 * @author Ivo Woltring
 */
public class FourByFour {

    private List<String> hexlify(final String plaintext) {
        byte[] x = plaintext.getBytes();
        final ArrayList<String> list = new ArrayList<>();
        for (final byte aX : x) {
            int b = (int) aX;
            list.add(Integer.toHexString(b));
        }
        return list;
    }

    private void fourByFour(final List<String> hexString) {
        /*
            1st row is:: 48   6f   72   00
            2nd row is:: 65   20   6c   00
            3rd row is:: 6c   77   64   00
            4th row is:: 6c   6f   00   00
         */
        for (int x = 0; x < 4; x++) {
            for (int y = x; y < hexString.size(); y += 4) {
                System.out.print(hexString.get(y) + " ");
            }
            System.out.println("00");
        }
    }

    public static void main(String args[]) throws InterruptedException {
        final FourByFour fourByFour = new FourByFour();
        final List<String> hexString = fourByFour.hexlify("Hello World");
        fourByFour.fourByFour(hexString);
    }
}
