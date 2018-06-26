package exemplo06;

import exemplo10.ExemploHospitalJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Logan Michel
 */
public class ExemploTudo {

    private JFrame jFrame;
    private JButton jButton00;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;
    private JButton jButton10;
    private JButton jButtonOutros01;
    private JButton jButtonOutros02;

    public ExemploTudo() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButton00();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
        acaoJButton10();
        //acaoJButtonOutros01();
        //acaoJButtonOutros02();
        jFrame.setVisible(true);
    }

    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void adicionarComponentes() {

        jFrame.add(jButton00);
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
        jFrame.add(jButton10);
        jFrame.add(jButtonOutros01);
        jFrame.add(jButtonOutros02);
    }

    public void instanciarComponentes() {

        jButton00 = new JButton("Exemplo 00");
        jButton01 = new JButton("Exemplo 01");
        jButton02 = new JButton("Exemplo 02");
        jButton03 = new JButton("Exemplo 03");
        jButton04 = new JButton("Exemplo 04");
        jButton05 = new JButton("Exemplo 05");
        jButton06 = new JButton("Exemplo 06");
        jButton07 = new JButton("Exemplo 07");
        jButton08 = new JButton("Exemplo 08");
        jButton09 = new JButton("Exemplo 09");
        jButton10 = new JButton("Exemplo 10");
        jButtonOutros01 = new JButton("Outros 01");
        jButtonOutros02 = new JButton("Outros 02");
    }

    public void gerarLocalizacoes() {
        jButton00.setLocation(10, 10);
        jButton01.setLocation(120, 10);
        jButton02.setLocation(230, 10);
        jButton03.setLocation(340, 10);
        jButton04.setLocation(10, 120);
        jButton05.setLocation(120, 120);
        jButton06.setLocation(230, 120);
        jButton07.setLocation(340, 120);
        jButton08.setLocation(10, 230);
        jButton09.setLocation(120, 230);
        jButton10.setLocation(230, 230);
        jButtonOutros01.setLocation(10, 340);
        jButtonOutros02.setLocation(120, 340);
    }

    public void gerarDimensoes() {
        jButton00.setSize(100, 100);
        jButton01.setSize(100, 100);
        jButton02.setSize(100, 100);
        jButton03.setSize(100, 100);
        jButton04.setSize(100, 100);
        jButton05.setSize(100, 100);
        jButton06.setSize(100, 100);
        jButton07.setSize(100, 100);
        jButton08.setSize(100, 100);
        jButton09.setSize(100, 100);
        jButton10.setSize(100, 100);
        jButtonOutros01.setSize(100, 100);
        jButtonOutros02.setSize(100, 100);

    }

    /*public static void main(String[] args) {
     for (int i = 0; i < 10; i++) {
     System.out.println(
     "public void acaoJButton0" + i + "(){");
     System.out.println(
     "jButton0" + i
     + ".addActionListener(new ActionListener () {");
     System.out.println("@Override");
     System.out.println("public void actionPerformed(ActionListener e){");
     System.out.println(")");
     System.out.println("});");
     System.out.println("}");
     System.out.println(";");

     }*/
    public void acaoJButton00() {
        jButton00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new ExemploJRadioButton01();
            }
        });
    }

    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploJButton01();
            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploJLabel01();
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploJTextField01();
            }
        });
    }

    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploJButton02();
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploJComboBox01();
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploJTextArea01();
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new ExemploJRadioButton01();
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new ExemploJCheckBox01();
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploJTable01();
            }
        });
    }

    public void acaoJButton10() {
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploHospitalJFrame();
            }
        });
    }

    /*public void acaoJButtonOutros01() {
        jButtonOutros01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploOutros1();
            }
        });
    }
    public void acaoJButtonOutros02() {
        jButtonOutros02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploOutros2();
            }
        });
    }*/

    
}
