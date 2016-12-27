package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains an English translation and a Miwok translation for that word.
 */

public class Word
{
    // English translation of the word
    private String mEnglishTranslation;

    // Miwok translation of the word
    private String mMiwokTranslation;

    public Word(String englishTranslation, String miwokTranslation)
    {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the English translation of the word
     */
    public String getEnglishTranslation()
    {
        return mEnglishTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
}