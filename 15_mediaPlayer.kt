package com.example.clappapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPlay = findViewById<FloatingActionButton>(R.id.fabPlay)
        val buttonPause = findViewById<FloatingActionButton>(R.id.fabPause)
        val buttonStop = findViewById<FloatingActionButton>(R.id.fabStop)

        buttonPlay.setOnClickListener {
            if (mediaPlayer == null){
                mediaPlayer = MediaPlayer.create(this, R.raw.applauding)
            }
            mediaPlayer?.start()
        }

        buttonPause.setOnClickListener {
            mediaPlayer?.pause()
        }

        buttonStop.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.reset()
            mediaPlayer?.release()
            mediaPlayer = null
        }



    }
}
