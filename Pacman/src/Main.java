import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        int rowCounts = 19;
        int colCounts = 20;
        int titleSize = 32;
        int boardWidth = colCounts * titleSize;
        int boardHeight = rowCounts * titleSize;
        JFrame frame = new JFrame("Pac Man(clone)");
        frame.setSize(boardWidth, boardHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}