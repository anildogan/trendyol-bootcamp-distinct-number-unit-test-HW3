package org.homework3.distinct_words;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctWordsTests {



    @Test
    public void it_should_return_zero_when_empty_string_given(){
        //Given
        DistinctWords distinctWords = new DistinctWords();

        //When
        String sentence = "";
        int distinctWordsCount = distinctWords.countDistinctWords(sentence);

        //Then
        assertEquals(distinctWordsCount , 0);
    }


    @Test
    public void it_should_return_sentence_without_punctuation(){
        //Given
        DistinctWords distinctWords = new DistinctWords();

        //When
        String sentence = "Hello, my name is Anil!...";
        String formattedString = distinctWords.removePunctuationOnSentence(sentence);

        //Then
        String expectedOutput = "Hello my name is Anil";
        assertEquals(formattedString , expectedOutput);
    }


    @Test
    public void it_should_return_distinct_list_of_words_when_sentence_given() {
        //Given
        DistinctWords distinctWords = new DistinctWords();

        //When
        String sentence = "hello, hello my my name is Anıl Anıl";
        ArrayList<String> wordsList = distinctWords.getDistinctWordsList(sentence);

        //Then

        String[] actualListArr = {"hello", "my" , "name", "is" , "Anıl"};
        ArrayList<String> actualList = new ArrayList<String>(Arrays.asList(actualListArr));

        assertEquals(wordsList , actualList);
    }

    @Test
    public void it_should_return_one_if_all_the_words_on_the_sentence_is_same(){
        //Given
        DistinctWords distinctWords = new DistinctWords();

        //When
        String sentence = "Anıl Anıl Anıl Anıl";
        int distinctWordsCount = distinctWords.countDistinctWords(sentence);

        //Then
        assertEquals(distinctWordsCount , 1);
    }

    @Test
    public void it_should_be_case_sensitive() {
        //Given
        DistinctWords distinctWords = new DistinctWords();

        //When
        String sentence = "Anıl, anıl doğan Doğan";
        int distinctWordsCount = distinctWords.countDistinctWords(sentence);

        //Then
        assertEquals(distinctWordsCount, 4);
    }
    @Test
    public void it_should_return_distinct_number_of_words_when_sentence_given(){
        //Given
        DistinctWords distinctWords = new DistinctWords();

        //When
        String sentence = "Hello, my name is Anıl I am Computer Engineer";
        int distinctWordsCount = distinctWords.countDistinctWords(sentence);

        //Then
        assertEquals(distinctWordsCount , 9);
    }

}
