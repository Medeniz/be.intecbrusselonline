package auto2;

import java.awt.Color;
import java.util.Arrays;

public class Colour {
    private String colourName;
    private int[] rgb = new int[3];


    public int[] whichColour(String coloursName){


        Object[] allColours = {"Very light red", 255, 102, 102, "Light red", 255, 51, 51, "Red", 255, 0, 0, "Dark red", 204, 0, 0, "Very dark red", 153, 0, 0, "Very light blue", 51, 204, 255,

                "Light blue", 51, 153, 255, "Blue", 0, 0, 255, "Dark blue", 0, 0, 204, "Very dark blue", 0, 0, 153, "Very light green", 102, 255, 102,

                "Light green", 0, 255, 51, "Green", 0, 204, 0, "Dark green", 0, 153, 0, "Very dark green", 0, 102, 0, "Very light yellow", 255 - 255 - 204,

                "Light yellow", 255, 255, 153, "Yellow", 255, 255, 0, "Dark yellow", 255, 204, 0, "Light orange", 255, 153, 0, "Orange", 255, 102, 0, "Gold",

                255, 204, 51, "Light grey", 204, 204, 204, "Grey", 153, 153, 153, "Dark grey", 102, 102, 102, "Very dark grey", 51, 51, 51, "Light brown", 153, 102, 0,

                "Brown", 102, 51, 0, "Dark brown", 51, 0, 0, "Purple", 102, 0, 153,"Black", 0, 0, 0, "White", 255, 255, 255};

for(int i=0;i<allColours.length;i+=4){
    java.awt.Color color = new Color(1, 2, 3);
    if (coloursName.equals(allColours[i])){
        rgb[0]= (Integer) allColours[i+1];
        rgb[1]= (Integer) allColours[i+2];
        rgb[2]= (Integer) allColours[i+3];
    }
}return rgb;
    }
    public Colour(String colourName) {
        this.colourName = colourName;
        this.rgb = whichColour(colourName);
    }

    java.awt.Color color = new Color(1, 2, 3);

    public String getColourName() {
        return colourName;
    }

    public int[] getRgb() {
        return rgb;
    }

    public Color getColor() {
        return color;
    }

    public void setColourName(String colourName) {
        this.colourName = colourName;
    }

    public void setRgb(int[] rgb) {
        this.rgb = rgb;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "colourName='" + colourName + '\'' +
                ", rgb=" + Arrays.toString(rgb) +
                ", color=" + color +
                '}';
    }
}
