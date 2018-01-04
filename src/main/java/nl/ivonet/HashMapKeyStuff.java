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

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * @author Ivo Woltring
 */
public class HashMapKeyStuff {

    /**
     * The most simple cdi like method.
     *
     * @param injectable the object you want to inject something in
     * @param fieldname  the fieldname to inject to
     * @param value      the value to assign to the fieldname
     */
    public static void injectField(final Object injectable, final String fieldname, final Object value) {
        try {
            final Field field = injectable.getClass()
                    .getDeclaredField(fieldname);
            final boolean origionalValue = field.isAccessible();
            field.setAccessible(true);
            field.set(injectable, value);
            field.setAccessible(origionalValue);
        } catch (final NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private void doIt() {
        HashMap<String, String> foo = new HashMap<>();
        foo.put("fName", "world");
        foo.put("lName", "You are great");

        MyPOJO pojo = new MyPOJO();
        foo.keySet().forEach(key -> injectField(pojo, key, foo.get(key)));
        System.out.println(pojo);
    }

    public static void main(String[] args) {
        new HashMapKeyStuff().doIt();
    }

}

class MyPOJO {
    private String fName;
    private String lName;

    public String getfName() {
        return this.fName;
    }

    public void setfName(final String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return this.lName;
    }

    public void setlName(final String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return String.format("fName=\"%s\" |lName=\"%s\"", this.fName, this.lName);
    }
}