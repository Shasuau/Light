public class Light {

    // Light brightness states. 
    private final int LOW = 1;
    private final int MEDIUM = 2;
    private final int HIGH = 3;
    
    private int light_brightness; // creating the Brightness 
    private boolean light_switch; // creating the swtich boolean 
    private String light_color; // creating the Colour string. 
    
    public Light() { // creating the base value for all lights.
    this.light_brightness = LOW;
    this.light_switch = false; // light switch is off. 
    this.light_color = "red";
    }
    
    // return the current light brightness. 
    public int getLight_brightness() {
    return light_brightness;
    }
    
    // reutrn current state of switch. 
    public boolean isLight_switch() {
        return light_switch;
    }

    // Return the current light value. 
    public String getLight_color() {
        return light_color;
    }
    
    // set brightness level with setLight_brightness
    public void setLight_brightness(int light_brightness) {
    this.light_brightness = light_brightness;
    }
    
    // set switch value true/false (on/off)
    public void setLight_switch(boolean light_switch) {
    this.light_switch = light_switch;
    }
    
    // set the current light color.
    public void setLight_color(String light_color) {
    this.light_color = light_color;
    }
    
    // create the "toString()" to return the value of all light states. 

    public String toString() {
    String str = "";
    if (light_switch) {
    // Switch statment for to ouput diffrent info depending on brightness state. 
    switch (light_brightness) {
    case 1: {
    str += "Light Brightness : LOW";
    break;
    }
    case 2: {
    str += "Light Brightness : MEDIUM";
    break;
    }
    case 3: {
    str += "Light Brightness : HIGH";
    break;
    }
    
    }
    str += ", Color : " + light_color; // output the light color after returning the light brightness
    } else {
    str += "Light Color : " + light_color + ", light is off"; // if the light is off, send the current color and statment saying light is off. 
    }
    
    return str;
    }
    
    }