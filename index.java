int n = 500;
int x = 200;
int y = 200;
int steps = 0;


void setup() {
	size(500, 500);
  frameRate(10);
}

void draw() {
	//background(0);
	stroke(1);
	
  //starts random walking from 200,200
  
  fill(255, 255, 255);

  rect(x, y, 10, 10);
  

  if(steps < n){
    int r = (int)(Math.random() * 4);

    if(r == 0){
      x-=10;
    }else if(r == 1){
      x+=10;
    }else if(r == 2){
      y-=10;
    }else if(r == 3){
      y+=10;
    }

    steps++;
    fill(0,0,255);
    rect(x, y, 10, 10);
  }
  
    println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);
}

	



