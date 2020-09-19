package org.homework3.distinct_words;

import java.util.ArrayList;

public class DistinctWords {
    public int countDistinctWords(String sentence) {

            if(sentence.equals("")) return 0;

            return getDistinctWordsList(sentence).size();
    }

    public String removePunctuationOnSentence(String sentence) {
        return sentence.replaceAll("\\p{Punct}", "");
    }

    public ArrayList<String> getDistinctWordsList(String sentence) {

        sentence = removePunctuationOnSentence(sentence);

        ArrayList<String> listOfWords = new ArrayList<String>();

        String[] wordsInSentence = sentence.split(" ");

        for (String word:wordsInSentence) {
            if(!listOfWords.contains(word)){ //add the word if it isn't added already
                listOfWords.add(word);
            }
        }

        return listOfWords; //return the list you made of distinct words
    }
}
