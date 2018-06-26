package exemplo06;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Logan Michel
 */
public class ExemploJTable01 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private JScrollPane JScrollPane;

    public ExemploJTable01() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void instanciarComponentes() {
        jTable = new JTable();
        Object[] colunas = new Object[]{"Nome", "Idade", "Altura"};
        defaultTableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int coluna) {
                return false;
            }
        };
        JScrollPane = new JScrollPane(jTable);
        configurarTableModel();
    }

    private void configurarTableModel() {
        defaultTableModel.addRow(new Object[]{
            "Gustavo", 22, 1.68
        });
        defaultTableModel.addRow(new Object[]{
            "Leonardo", 21, 1.76
        });
        defaultTableModel.addRow(new Object[]{
            "Crispin", 20, 1.76
        });
        jTable.setModel(defaultTableModel);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(JScrollPane);
    }

    @Override
    public void gerarLocalizacoes() {
        JScrollPane.setLocation(10, 10);
    }

    @Override
    public void gerarDimensoes() {
        JScrollPane.setSize(400, 400);
    }

}
