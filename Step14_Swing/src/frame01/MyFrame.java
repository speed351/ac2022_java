package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	//생성자
	public MyFrame(String title) {
		super(title);
		
		//프레임 초기 설정 작업하기
		this.setBounds(100,100,500,500);
		//프레임의 x버튼(close)을 눌렀을때 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저는 아직 사용하지 않음(모든 UI를 절대 좌표에 배치)
		this.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setLocation(10,10);
		btn1.setSize(100,30);
		this.add(btn1);
		
		//프레임을 화면상에 실제로 보이게 하기, false하면 안보임
		this.setVisible(true);
		
	}
	//run 했을 때 실행의 흐름이 시작되는 특별한 메소드 
	public static void main(String[] args) {
		//MyFrame 객체 생성
		
		MyFrame f1 = new MyFrame("프레임");
	}

}
