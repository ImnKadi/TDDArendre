import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Dictionary {


    private String name;

     public Dictionary(String name) {  
         this.name = name;  
    }  

    public String getName() {  
         return  this.name = "Example";
    }  
      
     public  void setName(String name) {  
         this.setName = name;  
    }  


    public String getName(){
        return name;
    }


    public int IsEmpty(String name){
        return 0;
    }


    public String AddTranslation(String name){
        this.AddTranslation = name;
    }

    public String getTranslation(String name){
        this.getTranslation = name;
    }

}
