package com.guoguo.structural.bridgepattern;

/**
 * 无关类1或者叫源类1
 * 目标：实现MediaPlayer和AdvancedMediaPlayer的关联
 */
public interface MediaPlayer {
    /**
     * 根据类型播放文件
     * @param audioType
     * @param fileName
     */
    public void play(String audioType,String fileName);
}
