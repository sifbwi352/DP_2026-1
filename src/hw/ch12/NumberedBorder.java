package hw.ch12;

public class NumberedBorder extends Border {
    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        // 행 번호 부분은 "%2d| " 형식이므로 총 4글자
        return 4 + display.getColumns();
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수와 같다 
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // row는 0부터 시작하므로 출력 번호는 row + 1
        return String.format("%2d| %s", row + 1, display.getRowText(row));
    }
    
}
