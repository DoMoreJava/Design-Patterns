package com.guoguo.structural.bridgepattern.advancedimpl;

import com.guoguo.structural.bridgepattern.AdvancedMediaPlayer;

/**
 * @ClassName AviPlayer
 * @Description
 * @author MPED
 * @Date 2021/9/3 23:09
 * @Version 1.0
 **/
public class AviPlayer implements AdvancedMediaPlayer {

    @Override
    public void playAvi(String fileName) {

        System.out.println("播放Avi："+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
