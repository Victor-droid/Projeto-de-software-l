public class Maiordivisor {
	private double x;
	private double y;
	

	public double mdc(double x, double y) {
		if(x == y){
            return x;
        }
        else if( y > x ){
            return mdc( x, y-x );
        }
        else if( x > y ){
            return mdc( x - y, y );
        }
        return 0;
		}
		
		public double getX() {
		return x;
		}
		public void setX(double x) {
		this.x = x;
		}
		public double getY() {
		return y;
		}
		public void setY(double y) {
		this.y = y;
		}

		public double nextlnt() {
			
			return 0;
		}
	

}