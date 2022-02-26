/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.JFrame;
/**
 *
 * @author gch05
 */
public class Start_Page {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogIn lg = new LogIn();
        lg.setVisible(true);//창을 화면에 나타내는 지 유무
        lg.pack();//윈도우의 사이즈를 맞추기
        lg.setLocationRelativeTo(null);//화면 정중앙에 프레임 위치 띄우기
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//메인 프레임을 닫을 때 프로그램도 닫는 것
    }
    
}
