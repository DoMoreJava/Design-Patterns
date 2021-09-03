package com.guoguo.structural.bridgepattern.adapter;

import com.guoguo.structural.bridgepattern.AdvancedMediaPlayer;
import com.guoguo.structural.bridgepattern.MediaPlayer;
import com.guoguo.structural.bridgepattern.advancedimpl.AviPlayer;
import com.guoguo.structural.bridgepattern.advancedimpl.Mp4Player;

/**
 * @ClassName MediaAdapter
 * @Description 适配器类
 * @Author MPED
 * @Date 2021/9/3 23:15
 * @Version 1.0
 **/
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }

        if (audioType.equalsIgnoreCase("avi")){
            advancedMediaPlayer = new AviPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }

        if (audioType.equalsIgnoreCase("avi")){
            advancedMediaPlayer.playAvi(fileName);
        }
    }
}
