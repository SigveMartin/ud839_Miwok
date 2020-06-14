package com.example.android.miwok;

/**
 * Displays text to the user.
 */
public class Word {

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    // String value miwok translation of word
    private String mMiwokTranslation;

    // String value default translation of word
    private String mDefaultTranslation;

    // int value for image id
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // int value for image id
    private int mAudioResourceId;

    /**
     * Constructs a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is familiar with
     *
     * @param miwokTranslation is the Miwok translation of the word
     *
     * @param imageResourceId  is the image resource id
     *
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    /**
     * Constructs a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is familiar with
     *
     * @param miwokTranslation is the Miwok translation of the word
     *
     * @param audioResourceId is the resource ID for the audio file associated with this word
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Gets the string value of default translation of the Word.
     *
     * @return default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Gets the string value of miwok translation of the Word.
     *
     * @return Miwok translation.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Gets the int value of image resource id of the Word.
     *
     * @return image resource id.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    /**
     * Gets the int value of audio resource id of the Word.
     *
     * @return audio resource id.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}