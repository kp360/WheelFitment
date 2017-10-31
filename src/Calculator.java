/**
 * Created by Kyle on 10/19/2017.
 */
public class Calculator {

    private double verticalFenderHeight; //Vertical measurement (Milimeters) from center of hub to lowest edge of fender
    private double hubInset; //Horizontal measurement from face of wheel mount surface to outer edge of fender

    private double oldTireWidth; //Measurement (Milimeters) of tire width
    private double oldTireHeight; //Measurement (Milimeters) of sidewall ratio
    private double oldWheelDiameter;
    private double oldWheelWidth;
    private double oldWheelOffset;

    private double newTireWidth; //Measurement (Milimeters) of tire width
    private double newTireHeight; //Measurement (Milimeters) of sidewall ratio
    private double newWheelDiameter;
    private double newWheelWidth;
    private double newWheelOffset;

    public Calculator() {
        verticalFenderHeight = 381;
        hubInset = 127;
        oldTireWidth = 225;
        oldTireHeight = 101.25;
        oldWheelDiameter = 431.8;
        oldWheelWidth = 177.8;
        oldWheelOffset = 30;
    }

    public double getVerticalFenderHeight() {
        return verticalFenderHeight;
    }

    public void setVerticalFenderHeight(double verticalFenderHeight) {
        this.verticalFenderHeight = verticalFenderHeight;
    }

    public double getHubInset() {
        return hubInset;
    }

    public void setHubInset(double hubInset) {
        this.hubInset = hubInset;
    }

    public double getOldTireWidth() {
        return oldTireWidth;
    }

    public void setOldTireWidth(double oldTireWidth) {
        this.oldTireWidth = oldTireWidth;
    }

    public double getOldTireHeight() {
        return oldTireHeight;
    }

    public void setOldTireHeight(double oldTireHeight) {
        this.oldTireHeight = oldTireHeight;
    }

    public double getOldWheelDiameter() {
        return oldWheelDiameter;
    }

    public void setOldWheelDiameter(double oldWheelDiameter) {
        this.oldWheelDiameter = oldWheelDiameter;
    }

    public double getOldWheelWidth() {
        return oldWheelWidth;
    }

    public void setOldWheelWidth(double oldWheelWidth) {
        this.oldWheelWidth = oldWheelWidth;
    }

    public double getOldWheelOffset() {
        return oldWheelOffset;
    }

    public void setOldWheelOffset(double oldWheelOffset) {
        this.oldWheelOffset = oldWheelOffset;
    }

    public double getNewTireWidth() {
        return newTireWidth;
    }

    public void setNewTireWidth(double newTireWidth) {
        this.newTireWidth = newTireWidth;
    }

    public double getNewTireHeight() {
        return newTireHeight;
    }

    public void setNewTireHeight(double newTireHeight) {
        this.newTireHeight = newTireHeight;
    }

    public double getNewWheelDiameter() {
        return newWheelDiameter;
    }

    public void setNewWheelDiameter(double newWheelDiameter) {
        this.newWheelDiameter = newWheelDiameter;
    }

    public double getNewWheelWidth() {
        return newWheelWidth;
    }

    public void setNewWheelWidth(double newWheelWidth) {
        this.newWheelWidth = newWheelWidth;
    }

    public double getNewWheelOffset() {
        return newWheelOffset;
    }

    public void setNewWheelOffset(double newWheelOffset) {
        this.newWheelOffset = newWheelOffset;
    }

}
