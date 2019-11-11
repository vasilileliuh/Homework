package com.company;

import java.util.ArrayList;

public class ArrayUtils {

    static void addListArrayElement(String str, int index, ArrayList<String> nameOfTheArray) {
        nameOfTheArray.add(index, str);
    }

    static String retrieveListArrayElement(int index, ArrayList<String> nameOfTheArray) {
        return nameOfTheArray.get(index);
    }

    static void updateListArrayElement(String str, int index, ArrayList<String> nameOfTheArray) {
        nameOfTheArray.set(index, str);
    }

    static void removeThirdListArrayElement(ArrayList<String> nameOfTheArray) {
        nameOfTheArray.remove(2);
    }

    static void searchListArrayElement(String str, ArrayList<String> nameOfTheArray) {
        int position = nameOfTheArray.indexOf(str);
        if (position >= 0)
            System.out.println("Searched element \"" + str + "\" is found on " + (nameOfTheArray.indexOf(str) + 1) + " position.");
        else
            System.out.println("Searched element " + str + " is missing in the current array.");
    }

    static ArrayList<String> copyListArrayIntoAnotherListArray(ArrayList<String> firstNameOfTheArray, ArrayList<String> secondNameOfTheArray) {
        firstNameOfTheArray.addAll(secondNameOfTheArray);
        return firstNameOfTheArray;
    }

    static ArrayList<String> reverseListArray(ArrayList<String> nameOfTheArray) {
//            first variant:
//            ArrayList<String> reversedArray = new ArrayList<>(nameOfTheArray);
//                Collections.reverse(reversedArray);
//            return reversedArray;

//            second variant:
        final int size = nameOfTheArray.size();
        final int lastElement = size - 1;
        // create a new list, with exactly enough initial capacity to hold the (reversed) list
        final ArrayList<String> reversedArray = new ArrayList<>(size);
        // iterate through the list in reverse order and append to the reversed array
        for (int i = lastElement; i >= 0; --i) {
            final String element = nameOfTheArray.get(i);
            reversedArray.add(element);
        }
        return reversedArray;
    }

    static ArrayList<String> swapTwoElementsIntoListArray(int position1, int position2, ArrayList<String> nameOfTheArray) {
        final String firstElement = nameOfTheArray.get(position1);
        final String secondElement = nameOfTheArray.get(position2);
        nameOfTheArray.set(position2, firstElement);
        nameOfTheArray.set(position1, secondElement);
        return nameOfTheArray;
    }

    static ArrayList<String> extractAPortionOfAListArray(ArrayList<String> nameOfTheArray, int startPosition, int finishPosition) {
        if (startPosition >= 0 && startPosition <= finishPosition && finishPosition <= nameOfTheArray.size()) {
            final int size = finishPosition - startPosition;
            final ArrayList<String> portionArray = new ArrayList<>(size);
            for (int i = startPosition; i <= finishPosition; i++) {
                final String element = nameOfTheArray.get(i);
                portionArray.add(element);
            }
            return portionArray;
        } else
            System.out.println("Wrong positions asked. Returning original array.");
        return nameOfTheArray;
    }

    static ArrayList<String> joinTwoArrayLists(ArrayList<String> nameOfTheFirstArrayToJoin, ArrayList<String> nameOfTheSecondArrayToJoin) {
        ArrayList<String> joinedArrayList = nameOfTheFirstArrayToJoin;
        joinedArrayList.addAll(nameOfTheSecondArrayToJoin);
        return joinedArrayList;
    }

    static void clearArrayList(ArrayList<String> nameOfTheArray) {
        nameOfTheArray.clear();
    }

    static boolean isArrayEmpty(ArrayList<String> nameOfTheArray) {
        return nameOfTheArray.isEmpty();
    }
}

