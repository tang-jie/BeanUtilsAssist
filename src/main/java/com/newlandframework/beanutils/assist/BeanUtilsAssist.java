/**
 * Copyright (C) 2017 Newland Group Holding Limited
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.newlandframework.beanutils.assist;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author tangjie<https://github.com/tang-jie>
 * @filename:BeanUtilsAssist.java
 * @description:BeanUtilsAssist功能模块
 * @blogs http://www.cnblogs.com/jietang/
 * @since 2017/6/14
 */
public class BeanUtilsAssist {
    public static final char C_STYLE_UNDERLINE = '_';

    public static String translate(String attr) {
        if (attr != null) {
            StringBuffer sb = new StringBuffer();
            boolean isTranslate = false;
            int length = attr.length();
            for (int i = 0; i < length; i++) {
                char c = attr.charAt(i);
                if (C_STYLE_UNDERLINE == c) {
                    isTranslate = sb.length() > 0;
                } else {
                    sb.append(isTranslate ? Character.toUpperCase(c) : Character.toLowerCase(c));
                    if (isTranslate) isTranslate = !isTranslate;
                }
            }
            return sb.toString();
        } else {
            return null;
        }
    }

    public static <V> Map<String, V> buildMap(Map<String, V> m) {
        Map<String, V> newMap = new HashMap<String, V>();
        Set s = (Set<String>) m.keySet();
        Iterator<String> it = s.iterator();
        String key = null;
        while (it.hasNext()) {
            key = it.next();
            Object newKey = translate(key);
            Object newValue = m.get(key);
            if (newValue == null) {
                newMap.put((String) newKey, (V) "");
            } else {
                newMap.put((String) newKey, (V) newValue);
            }
        }

        return newMap;
    }

    // FIXME: 2017/6/14 by tangjie
    // lowerCamelCase参数的设置引入,主要是为了兼容旧的JavaBean的情况，旧的情况送false!
    public static <T, V> T populate(T object, Map<String, V> map, boolean lowerCamelCase) {
        try {
            if (lowerCamelCase) {
                map = buildMap(map);
            }
            BeanUtils.populate(object, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return object;
    }
}

