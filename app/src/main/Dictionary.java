import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Dictionary {


    String Undictionnaire;

     public Dictionary(String Undictionnaire) {  
         this.Undictionnaire = Undictionnaire;  
    }  

    public String getUndictionnaire() {  
         return  this.Undictionnaire;  
    }  
      
     public  void setUndictionnaire(String Undictionnaire) {  
         this.Undictionnaire = Undictionnaire;  
    }  

}
