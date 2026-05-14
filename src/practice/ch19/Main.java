package practice.ch19;

public class Main {
    public static void main(String[] args) {
        // GUI 프레임 생성
        SafeFrame frame = new SafeFrame("State Sample");
        
        // 시계 역할 구현
        // 1초마다 현재 시간을 얻어서 SafeFrame의 setClock 메서드에 전달
        // Thread.sleep(1000)을 사용하여 1초마다 반복
        while (true) {  // 무한 루프
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
