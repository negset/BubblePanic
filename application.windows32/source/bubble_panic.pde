void setup()
{
  size(800, 600);
  background(255);
}

float x = 400;
float y = 300;
float r = 50;

void draw()
{
  fill(255, 5);
  noStroke();
  rect(0, 0, 800, 600);
  fill(random(0, 255), random(0, 255), random(0, 255));
  ellipse(x, y, r, r);
  x = random(0, 800);
  y = random(0, 600);
  r = random(0, 100);
}