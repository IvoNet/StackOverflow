/*
 * Copyright 2018 Ivo Woltring <WebMaster@ivonet.nl>
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

/**
 * @author Ivo Woltring
 */
public class Q015 {
    static Baumhaus bauHaus(int hoehe, int breite) {
        Baumhaus b = new Baumhaus();
        b.hoehe = hoehe;
        b.breite = breite;
        return b;
    }

    static Baumhaus machBreiter(Baumhaus b) {
        Baumhaus bb = new Baumhaus();
        bb.hoehe = b.hoehe;
        bb.breite = b.breite + 1;
        return bb;
    }

    static Baumhaus machHoeher(Baumhaus b) {
        b.hoehe++;
        return b;
    }

    public static void main(String[] args) {
        Baumhaus b = bauHaus(2, 3);
        Baumhaus c = machBreiter(b);
        c.nachbar = b;
        Baumhaus d = machHoeher(b);
        d.nachbar = b;
        ++c.hoehe;
        Baumhaus e = machHoeher(b);
        e.nachbar = c;
        e.breite = b.breite - 1; // WHY DOES b.breite GETS DECREASED BY 1 ???
        c.hoehe++;
        c.breite -= 2;
        boolean bUndCBenachbart = (b.nachbar == c || c.nachbar == b);
    }
}

class Baumhaus {
    public int hoehe;
    public int breite;
    public Baumhaus nachbar;
    public int nummer = ++naechsteNummer;
    static int naechsteNummer = 0;
}
