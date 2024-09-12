package com.example.jogovelha;

import android.content.Context;
import android.media.MediaPlayer;

public class Som {
    private static MediaPlayer mediaPlayer;

    public static void executar(Context context, int musicId) {
        mediaPlayer = MediaPlayer.create(context, musicId);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    public static void parar() {
        mediaPlayer.stop();
    }
}
