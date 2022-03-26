public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y){
        this.xSpeed = x;
        this.ySpeed = y;
    }

    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[1] = this.xSpeed;
        arr[2] = this.ySpeed;
        return arr;
    }

    public MovablePoint move(){
        this.setX(this.getX()+this.getXSpeed());
        this.setY(this.getY()+this.getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + super.toString()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3,5);
        movablePoint.setX(1);
        movablePoint.setY(2);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
