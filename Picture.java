/**
 * 
 * 
 *
 *
 * @author Colten R. Aguilar
 * @version 2026.09.20
 */
public class Picture
{
    private Square sky1;
    private Square sky2;
    private Square grass1;
    private Square grass2;
    private Square lake;
    private Triangle mountain1;
    private Triangle mountain2;
    private Triangle mountain3;
    private Circle sun;
    private Person person;
    private boolean drawn;

    
    public Picture()
    {
        sky1 = new Square();
        sky2 = new Square();
        grass1 = new Square();
        grass2 = new Square();
        lake = new Square();
        mountain1 = new Triangle();
        mountain2 = new Triangle();
        mountain3 = new Triangle();
        sun = new Circle();
        person = new Person();
        drawn = false;
    }

   
    public void draw()
    {
        if (!drawn) {

            // Blue sky background
            sky1.changeColor("blue");
            sky1.moveHorizontal(-330);
            sky1.moveVertical(-130);
            sky1.changeSize(300);
            sky1.makeVisible();

            sky2.changeColor("blue");
            sky2.moveHorizontal(-30);
            sky2.moveVertical(-130);
            sky2.changeSize(300);
            sky2.makeVisible();

            // Green ground
            grass1.changeColor("green");
            grass1.moveHorizontal(-330);
            grass1.moveVertical(100);
            grass1.changeSize(300);
            grass1.makeVisible();

            grass2.changeColor("green");
            grass2.moveHorizontal(-30);
            grass2.moveVertical(100);
            grass2.changeSize(300);
            grass2.makeVisible();

            // Lake
            lake.changeColor("blue");
            lake.moveHorizontal(-100);
            lake.moveVertical(210);
            lake.changeSize(200);
            lake.makeVisible();

            // Left mountain
            mountain1.changeColor("black");
            mountain1.changeSize(100, 150);
            mountain1.moveHorizontal(-100);
            mountain1.moveVertical(20);
            mountain1.makeVisible();

            // Middle mountain
            mountain2.changeColor("black");
            mountain2.changeSize(130, 180);
            mountain2.moveHorizontal(20);
            mountain2.moveVertical(0);
            mountain2.makeVisible();

            // Right mountain
            mountain3.changeColor("black");
            mountain3.changeSize(90, 140);
            mountain3.moveHorizontal(130);
            mountain3.moveVertical(30);
            mountain3.makeVisible();

            // Sun
            sun.changeColor("yellow");
            sun.moveHorizontal(120);
            sun.moveVertical(-50);
            sun.changeSize(60);
            sun.makeVisible();

            // Person
            person.changeColor("white");
            person.moveHorizontal(-100);
            person.moveVertical(50);
            person.changeSize(60, 30);
            person.makeVisible();

            drawn = true;
        }
    }

    
    public void setBlackAndWhite()
    {
        sky1.changeColor("white");
        sky2.changeColor("white");
        grass1.changeColor("black");
        grass2.changeColor("black");
        lake.changeColor("white");
        mountain1.changeColor("black");
        mountain2.changeColor("black");
        mountain3.changeColor("black");
        sun.changeColor("white");
        person.changeColor("white");
    }

    
    public void setColor()
    {
        sky1.changeColor("blue");
        sky2.changeColor("blue");
        grass1.changeColor("green");
        grass2.changeColor("green");
        lake.changeColor("blue");
        mountain1.changeColor("black");
        mountain2.changeColor("black");
        mountain3.changeColor("black");
        sun.changeColor("yellow");
        person.changeColor("white");
    }
}