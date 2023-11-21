package rs.tts

import android.app.NativeActivity

class MainActivity : NativeActivity() {
    companion object {
        init {
            println("Loading library")
            System.loadLibrary("hello_world")
            println("Loading done!")
        }
    }
}