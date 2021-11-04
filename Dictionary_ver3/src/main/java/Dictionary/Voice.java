package Dictionary;


import com.sun.speech.freetts.VoiceManager;

public class Voice {
	protected static void Read(String s) {
		System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        com.sun.speech.freetts.Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        com.sun.speech.freetts.Voice[] voices = VoiceManager.getInstance().getVoices();
        for(int i = 0 ; i < voices.length ; i++) {
            System.out.println("# Voice: " + voices[i].getName());
        }

        if(voices != null) {
            voice.allocate();
            System.out.println("Voice Rate: " + voice.getRate());
            System.out.println("Voice Pitch: " + voice.getPitch());
            System.out.println("Voice Volume: " + voice.getVolume());
            boolean status = voice.speak(s);
            System.out.println("Status: " + status);
            voice.deallocate();

        } else {
            System.out.println("Error");
        }
	}
    public static void main(String[] args) {
        Read("hello world");
    }
 }
