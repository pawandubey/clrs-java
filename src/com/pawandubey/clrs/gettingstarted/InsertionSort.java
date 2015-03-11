/*
 * Copyright 2015 Pawan Dubey pawandubey@outlook.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pawandubey.clrs.gettingstarted;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
public class InsertionSort {

    /**
     *
     * @param list a list of integers
     * @return a list of sorted integers
     */
    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i;
            while (j > 0 && list[j - 1] > key) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = key;
        }
        return list;
    }

    public static <T extends Comparable<? super T>> void insertionSort(List<T> list) {
        //TODO
    }

    public static void main(String[] args) {
        int[] l = {5, 99, 1, 2, 0, 4, 8, -1};
        l = insertionSort(l);
        System.out.println(Arrays.toString(l));
    }
}
