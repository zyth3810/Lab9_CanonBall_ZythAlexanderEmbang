import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public MyWorld()
    {    
        super(768, 576, 1, false);

        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // seems to be the default
        prepare();
    }

    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cannon cannon = new Cannon();
        addObject(cannon,100,412);
        Target target = new Target();
        addObject(target,502,110);
        Target target2 = new Target();
        addObject(target2,539,238);
        Target target3 = new Target();
        addObject(target3,683,356);
        target.setLocation(417,95);
        target2.setLocation(532,118);
        target2.setLocation(574,120);
        Target target4 = new Target();
        addObject(target4,632,227);
        target3.setLocation(683,461);
        cannon.setLocation(76,382);
        target4.setLocation(648,313);
        target.setLocation(403,62);
    }
}
