package com.guoguo.structural.bridgepattern;

/**
 * 无关联类2或者源类2
 * 目标：实现MediaPlayer和AdvancedMediaPlayer的关联
 */
public interface AdvancedMediaPlayer {

    /**
     *
     * @param fileName
     */
    public void playAvi(String fileName);

    /**
     *
     * @param fileName
     */
    public void playMp4(String fileName);
}
