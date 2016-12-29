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

    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Audio resource ID for the word
    private int mAudioResourceId;

    /**
     * Create a Word object
     *
     * @param englishTranslation is the word in English that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok translation
     * @param audioResourceId    is the resource ID for the audio file associated with this word
     */
    public Word(String englishTranslation, String miwokTranslation, int audioResourceId)
    {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a Word object with an image
     *
     * @param englishTranslation is the word in English that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok translation
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     * @param audioResourceId    is the resource ID for the audio file associated with this word
     */
    public Word(String englishTranslation, String miwokTranslation, int imageResourceId, int audioResourceId)
    {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    /**
     * Get the image
     */
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    /**
     * Get the audio resource ID of the word
     */
    public int getmAudioResourceId()
    {
        return mAudioResourceId;
    }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}