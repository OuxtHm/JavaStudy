

import javax.swing.*; //윈도우 경량 컴포넌트
import java.awt.*; //이미지 임포트

public class GameView extends JPanel{

   Image back, air;
   // 초기화
   
   int x = 150;
   int y = 100;
   public GameView() {
      //생성자 => 변수에 대한 초기화
      back = Toolkit.getDefaultToolkit().getImage("c:\\JavaDev\\back.jpg");
      
      air = Toolkit.getDefaultToolkit().getImage("c:\\JavaDev\\moveImg.jpg");
      
   }
   
   public void paint(Graphics g) {
      
      g.drawImage(back, 0, 0, getWidth(), getWidth(), this);
      g.drawImage(air, x, y, 100, 100, this);

   }

}