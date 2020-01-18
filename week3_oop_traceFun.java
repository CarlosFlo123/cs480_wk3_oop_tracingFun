    class Circle{
        private int radius;
        public Circle(int r){
            this.radius = r;
            trace("circle constructor");
        }
        private double pi(){
            return ((float)3.14156);
        }
        private void trace(String s){
            System.out.println("\n\n--------------------> " + s);
        }
        public boolean isLarge(){
            if (this.radius > 100){
                return true;
            }
            return false;
        }
        public float area(){
            return ((float)(pi() * Math.pow(this.radius, 2)));
        }
        public float circunference(){
            return ((float)(2 * pi() * this.radius));
        }
    }
    class Rectangle{
        private int height, width;
        public Rectangle(int h, int w){
            this.height = h;
            this.width = w;
            trace("square constructor");
        }
        private void trace(String s){
            System.out.println("\n\n--------------------> " + s);
        }
        //GET & SET 
        public int getHeight(){
            return this.height;
        }
        public void setHeight(int h){
            this.height = h;
        }
        public int getWidth(){
            return this.width;
        }
        public void setWidth(int w){
            this.width = w;
        }
        //////////////////////////////////////
        public boolean isSquare(){
            return this.height == this.width;
        }
        public float area(){
            return ((float)(getHeight() * getWidth()));
        }
        public float perimeter(){
            return ((float)((getHeight()*2) + (getWidth()*2)));
        }
    }
    class Time{
        private int hour, minute, second;
        public Time(int h, int m, int s){
            this.hour = h;
            this.minute = m;
            this.second = s;
            trace(this.hour);
        }
        private void trace(int h){
            System.out.println("\n");
            if (h < 12){
                System.out.println("Is morning time!");
            }
            else {
                if (h < 19){
                System.out.println("Is afternoon time!");
                }
                else{
                    System.out.println("Is evening time!");
                }
            }
        }
        public void resetClock(){
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        public String toString(){
            return ("Time is: " + this.hour + ":" + this.minute + ":" + this.second);
        }
        public boolean equals(Object obj){
            Time tmpTime;
            if (!(obj instanceof Time)) return false;
            tmpTime = (Time)obj;
            return (this.hour == tmpTime.hour && this.minute == tmpTime.minute && this.second == tmpTime.second);
        }
    }
    public class week3_oop_traceFun {
        public static void main(String args[]) {
            //Scanner stdin;
            //stdin = new Scanner(System.in);
            //char answer;
            /*Circle cake = new Circle(101);
            System.out.println("Is this cake large?: " + cake.isLarge());
            System.out.println("Cake area: " + cake.area());
            System.out.println("Cake circunference: " + cake.circunference());

            Rectangle whiteBoard = new Rectangle(30, 40);
            System.out.println("Is this rectangle a square?: " + whiteBoard.isSquare());
            System.out.println("Rectangle area: " + whiteBoard.area());
            System.out.println("Rectangle perimeter: " + whiteBoard.perimeter());
            */
            Time timer = new Time(22, 45, 49);
            System.out.println(timer.toString());
            Time timer1 = new Time(22, 45, 48);
            System.out.println(timer1.toString());
            System.out.println("\nAre my timers sync?: " + timer.equals(timer1));
        }
    }