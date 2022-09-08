public class LightTest {

    public static void main(String[] args) {
    
    // New lights
    Light l1, l2;
    
    l1 = new Light();
    
    l2 = new Light();
    
    // Setup for light one to assignment requirments. 
    l1.setLight_brightness(3); // brightness 
    l1.setLight_color("orange"); // colour 
    l1.setLight_switch(true); // Light state (on/off)
    
    // setup for light twp to assignment requirments 
    l2.setLight_brightness(1); // brightness 
    l2.setLight_color("green"); // colour 
    l2.setLight_switch(false); // light state 
    
    System.out.println("Light one is: " + l1); // print info for light 1 
    System.out.println("Light two is: " + l2); // print info for light 2. 
    
    }
    
    }