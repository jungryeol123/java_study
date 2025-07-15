package chapter10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		
		f.setLayout(new BorderLayout());
		
		Button btnClick1 = new Button("Button1");
		Button btnClick2 = new Button("Button2");
		Button btnClick3 = new Button("Button3");
		
		p1.add(btnClick1);
		p2.add(btnClick2);
		p3.add(btnClick3);
		
		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.CENTER);
		f.add(p3,BorderLayout.SOUTH);
		
		
		f.setTitle("파일 탐색기");
		f.setSize(600, 600);
		f.setVisible(true);
		
		//버튼의 이벤트 처리1 - 내부 클래스를 생성하여 액션 이벤트 처리
//		ButtonTest.ButtonActionListener action = new ButtonTest.ButtonActionListener();
		btnClick1.addActionListener(new ButtonTest.ButtonActionListener());

		//버튼의 이벤트 처리2 - Anonymous(익명) 클래스를 생성하여 액션 이벤트 처리
		//JVM이 Anonymous클래스를 스스로 만들어서 처리함.
		btnClick2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button2");
			}
		});

		//버튼의 이벤트 처리3 - 람다식(자바 버전 8이상부터) 처리방식을 이용한 이벤트 처리
		btnClick3.addActionListener((ActionEvent e) -> {
			System.out.println("Button3 꾸욱");
		});
		
		btnClick3.addActionListener(e -> {
			System.out.println("Button3 뿌욱");
		});
		
		btnClick3.addActionListener(e -> System.out.println("Button3 뽀욱"));
		
		//Frame의 종료 이벤트
		f.addWindowListener(new WindowListener() {
			public void windowActivated(WindowEvent e){}
			public void windowClosed(WindowEvent e){}
			public void windowClosing(WindowEvent e){
				System.out.println("-프로그램종료-");
				System.exit(0);
			}
			public void windowDeactivated(WindowEvent e){}
			public void windowDeiconified(WindowEvent e){}
			public void windowIconified(WindowEvent e){}
			public void windowOpened(WindowEvent e) {}
		});
		
		
	}//main
	
	/**
	 * 버튼의 이벤트 처리 클래스
	 */
	//Inner class
	public static class ButtonActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("이걸누르네 ㅋㅋ");
		}
	}
	
	
	
	
	
	

}//class
