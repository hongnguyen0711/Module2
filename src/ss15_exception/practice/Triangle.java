package ss15_exception.practice;

public class Triangle {
    private int edge1;
    private int edge2;
    private int edge3;

    public Triangle() {
    }

    public Triangle(int edge1, int edge2, int edge3) throws IllegalTriangleException {
        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
            throw new IllegalTriangleException("Không hợp lệ!");
        } else if (edge1 + edge2 <= edge3 || edge1 + edge3 <= edge2 || edge3 + edge2 <= edge1) {
            throw new IllegalTriangleException("Không hợp lệ!");
        } else {
            this.edge1 = edge1;
            this.edge2 = edge2;
            this.edge3 = edge3;
        }

    }

    public int getEdge1() {
        return edge1;
    }

    public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    public void setEdge2(int edge2) {
        this.edge2 = edge2;
    }

    public int getEdge3() {
        return edge3;
    }

    public void setEdge3(int edge3) {
        this.edge3 = edge3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edge1=" + edge1 +
                ", edge2=" + edge2 +
                ", edge3=" + edge3 +
                '}';
    }
}
