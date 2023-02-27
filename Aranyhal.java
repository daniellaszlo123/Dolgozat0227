
package modell;

import java.util.HashMap;
import java.util.Map;


public class Aranyhal {
    private static final int KIVANSAGOKSZAMA = 3;
    private int kor;
    private Map<String, Integer> kivansagok;
    private String kifogta;
    
    public Aranyhal(String kifogta){
        this(kifogta, 0);
        this.kivansagok=new HashMap<>();
    }
    
    public Aranyhal(String kifogta, int kor){
        this.kifogta=kifogta;
        this.kor=kor;
        this.kivansagok=new HashMap<>();
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivasagokSzama(String kifogta){
        return 0;
    }
    
    public String[] kikkelTalalkozott(){
        return new String[1];
    }
    
    public boolean kivansagotTeljesit(String kivansag){
        return false;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
    
    
}
