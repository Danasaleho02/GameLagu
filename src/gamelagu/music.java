/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelagu;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author windows
 */
public class music {
    AudioClip soundTrack;
    URL url = getClass().getResource("backsound.wav");
    music(boolean play)
    {
        soundTrack = Applet.newAudioClip(url);
        if(play){
            playSound();
        }
        else{
            stopSound();
        }
    }
    
    protected void playSound()
    {
        System.out.println(soundTrack);
        soundTrack.loop();
    }
    
    protected void stopSound()
    {
        System.out.println(soundTrack);
        soundTrack.stop();
    }
}
