package com.peisia.lamaderivation;
/**
 * Created by 호양이 on 2019-08-17.
 */
public class ItemWord {
    private long wordId;
    private String word;
    private String meaning;
    private String exampleWord;
    private String exampleWordMeaning;
    public ItemWord(String word, String meaning, String exampleWord, String exampleWordMeaning) {
        this.word = word;
        this.meaning = meaning;
        this.exampleWord = exampleWord;
        this.exampleWordMeaning = exampleWordMeaning;
    }
    public String getWord() {
        return word;
    }
    public String getMeaning() {
        return meaning;
    }
    public String getExampleWord() {
        return exampleWord;
    }
    public String getExampleWordMeaning() {
        return exampleWordMeaning;
    }
}
