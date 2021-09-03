package com.guoguo.structural.bridgepattern.advancedimpl;

import com.guoguo.structural.bridgepattern.AdvancedMediaPlayer;

/**
 * @ClassName Mp4Player
 * @Description 实现类
 * @Author MPED
 * @Date 2021/9/3 23:11
 * @Version 1.0
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playAvi(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4：" + fileName);
    }
}
