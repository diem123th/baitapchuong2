public class MyPoint3 {
        private int x, y;
        public MyPoint3(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() { return x; }
        public int getY() { return y; }
        public void setX(int x) { this.x = x; }
        public void setY(int y) { this.y = y; }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

