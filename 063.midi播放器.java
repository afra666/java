/**name:class Music
 *input:
new Music().start("music\\popo.mid");
new Music().stop();
 *output:

 *end
 */
package p;

import java.io.File;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Music{
	Sequence seqFile;
	static Sequencer seqPlayer;//加static
	public void start(String fileWithPath) {
		
		try {
			seqFile=MidiSystem.getSequence(new File(fileWithPath));
			seqPlayer=MidiSystem.getSequencer();
			seqPlayer.open();
			seqPlayer.setSequence(seqFile);
			if (!seqPlayer.isRunning()) {
				seqPlayer.start();
			}
			seqPlayer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
		} catch (Exception e) {
			
		} 
	}
	public  static void stop(){  
        if(seqPlayer.isRunning()) {//这里要加static
        	seqPlayer.stop();  
        }
        if(seqPlayer.isOpen()) {
        	seqPlayer.close();  
        }
        	
    }  
	
}




//@@@@@@@@@@@@@@@@@@@@@@@第二个类
package p;

import java.util.Scanner;
import javax.swing.SwingUtilities;

/**effect:
 *input:

 *output:

 *start
 */
public class TestMain{
	public static void main(String []args){
		SwingUtilities.invokeLater(new Runnable() {
			public  void run() {
				
				new Music().start("music\\popo.mid");
				Scanner scn = new Scanner(System.in);
				int i=scn.nextInt();
				scn.close();
				if (i==0) {
					new Music();
					Music.stop();
				}
				
			}
		});
	}
}
/**effect:
 *input:

 *output:

 *end
 */
