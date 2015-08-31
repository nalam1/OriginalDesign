void setup()
{
size (800,800);
frameRate(600);

}
void draw()
{

noStroke();

	fill(random(0,0),random(0,100),random(0,100));
	ellipse(400-mouseX,mouseY,random(9,10),random(9,10));
	ellipse(400+mouseX,mouseY,random(9,10),random(9,10));
	
	stroke(255, 255, 255, 100);
	fill(153,76,0);
	ellipse(400,400,50,650);
	ellipse(400,420,50,650);
	ellipse(400,440,50,650);
	ellipse(400,460,50,650);

}
