package music;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer{
	public void play() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		AudioInputStream audioStream = getMusicStream();
		AudioFormat audioFormat = audioStream.getFormat();
		Clip clip = AudioSystem.getClip(); 
        
        // open audioInputStream to the clip 
        clip.open(audioStream); 
          
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
	}
	
	private AudioInputStream getMusicStream() {
		InputStream inputStream;
		try {
			AudioInputStream audioInputStream =  
	                AudioSystem.getAudioInputStream(new File("H:\\SUD\\funky.wav").getAbsoluteFile()); 
			return audioInputStream;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
